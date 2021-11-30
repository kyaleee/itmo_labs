import yaml
import json


def conv():
    with open('source/timetable.json') as a:
        source = json.loads(a.read())

    source = yaml.dump(source)

    with open('source/timetable.yaml', 'w') as b:
        b.write(source)


conv()
