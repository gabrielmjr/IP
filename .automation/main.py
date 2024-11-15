import json
import os
import re
import requests


automation_dir = os.path.split(os.path.abspath(__f
ile__))[0]


def open_links():
    with open(os.path.join(automation_dir, 'resources.json'), 'r') as opened_json_file:
        return json.load(opened_json_file)


def read_readme_file():
    with open(os.path.join(automation_dir, '../README.md'), 'r') as readme:
        return remove_indexes(readme.read())


def get_doc_name(drive_doc_link: str):
    response = requests.get(drive_doc_link)
    if response.status_code == 200:
        match = re.search(r'<meta property="og:title" content="(.*?)">', response.text)
        if match:
            return match.group(1).replace('.pdf', '')


def write_to_readme_file(content: str):
    with open(os.path.join(automation_dir, '../README.md'), 'w') as readme_file:
        readme_file.write(content)


def remove_indexes(readme: str):
    pattern_before = "## Indexes"
    pattern_after = "##"
    pattern_index_before = readme.find(pattern_before).__index__()
    pattern_index_after = readme.find(pattern_after, pattern_index_before + 2)
    index_before = readme[:pattern_index_before]
    index_after = readme[pattern_index_after:]
    return index_before + pattern_before + os.linesep, index_after


class Automation:
    lesson_numbers = []
    topics = []
    articles_link = []
    articles = []
    worksheet_link = []
    before_indexes = ""
    indexes = ""
    after_indexes = ""
    organized_readme_content = ""

    def __init__(self):
        lessons = open_links()['lessons']
        for lesson in lessons:
            self.lesson_numbers.append(lesson["lesson_number"])
            self.articles_link.append(lesson["lesson_article"])
            self.worksheet_link.append(lesson["worksheet"])
        readme = read_readme_file()
        self.before_indexes = readme[0]
        self.after_indexes = readme[1]
        self.solved_exercises_link_template = ('https://github.com/gabrielmjr/IP/tree/master/src/main/java/com/mjr'
                                               '/code/ip/lesson')
        self.create_indexes()
        self.organize_readme_content()
        write_to_readme_file(self.organized_readme_content)

    def create_indexes(self):
        for i in range(0, len(self.lesson_numbers)):
            self.indexes = self.indexes + f'- {get_doc_name(self.articles_link[i])}{os.linesep}'
            self.indexes = self.indexes + f'  - [Article]({self.articles_link[i]}){os.linesep}'
            self.indexes = self.indexes + f'  - [Worksheet]({self.worksheet_link[i]}){os.linesep}'
            self.indexes = self.indexes + f'  - [Solved exercises]({self.solved_exercises_link_template}{i + 1})'
            self.indexes = self.indexes + os.linesep + os.linesep

    def organize_readme_content(self):
        self.organized_readme_content = (self.before_indexes + self.indexes + self.after_indexes)


Automation()
