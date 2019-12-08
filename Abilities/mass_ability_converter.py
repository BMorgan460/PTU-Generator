import os

file = os.path.join(os.getcwd(), "mass_abilities.txt")
f = open(file, "r")
for line in f:
    line.replace("“", '"')
    abilities = line.split("Ability: ")
    print(abilities)
    for ability in abilities[1:]:
        name = []
        words = ability.split()
        for word in words:
            if word == "Static" or word == "At-Will" or word == "Scene" or word == "Daily" or word == "Special":
                break
            elif word == "Frequency:":
                break
            else:
                name.append(word)
        print(ability)
        print(name)
        output = open(os.path.join(os.getcwd(), "Unproccessed", " ".join(name) + ".txt"), "wt")
        output.write("Ability: " + ability)
        output.close()
f.close()
