def find_new_line(result, depth, is_list=False):
    if not is_list:
        result += "\n" + "  " * depth
    else:
        result += "\n" + "  " * (depth - 1) + "- "
    return result


def convert():
    f = open("source/timetable.json")
    text = f.read()
    f.close()

    writing = False
    element = True
    in_list = False
    depth = -1

    result = ""

    for i in text:
        if writing:
            if i == '"':
                writing = not writing
                if not element:
                    result = find_new_line(result, depth)
                else:
                    result += ": "
                element = not element
                continue
            result += i
        else:
            if i == '"':
                writing = True
            elif i == "{":
                depth += 1
                element = True
                if in_list:
                    result = find_new_line(result, depth, True)
            elif i == "}":
                depth -= 1
            elif i == "[":
                in_list = True
            elif i == "]":
                in_list = False

    f = open("source/timetable.yml", mode="w")
    f.write(result)
    f.close()


convert()
