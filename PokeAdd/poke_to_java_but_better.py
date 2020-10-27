import os


def construct(file, name):  # creates the base constructor class and writes the begining info and name
    n = open(file, "w+")  # Opens the new file
    n.write("public class " + name + " extends Pokemon{\n")  # Creates the public class with pokeomon name
    n.write("\t{\n")
    n.write("\t\t" + 'name = "' + name + '";\n')  # Provides the name var in the constructor


def check_if_int(checkVar):
    try:
        result = int(checkVar)
    except ValueError:
        return 0
    return result


name = ""
jFile = ""
java = "public class %s extends Pokemon {\n\t{\n"

for subdir, dirs, files in os.walk('./'):  # Checks for each file in a folder that this program is in
    for file in files:  # checks each file
        ext = file[-4:]  # checks for the .extension
        if ext == ".txt":  # only accepts .txt files
            print("Starting " + file)
            f = open(file, "r")  # allows python to read data in the file
            name = file[:-4]  # Pulls the Pokemon name
            file = name + ".java"
            j = open(file, "w")
            lines = f.readlines()
            for line in lines:
                
