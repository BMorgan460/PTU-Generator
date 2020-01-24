import os

file = os.path.join(os.getcwd(), "mass_pokemon.txt")
f = open(file, "r", encoding="utf8")
count = 0
page = 1
name = ""
text = ""
for line in f:
    if count == 0:
        name = line[0] + line[1:].lower()
        print(name)
        count += 1
        text = name
    elif line.strip() == str(page):
        output = open(os.path.join(os.getcwd(), name.strip() + ".txt"), "wt")
        output.write(text)
        output.close()
        count = 0
        page += 1
    else:
        text += line


f.close()
