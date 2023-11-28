import os

file = os.path.join(os.getcwd(), "mass_abilities.txt")
f = open(file, "r")
out = ""
for line in f:
    out = out + line.strip() + " "
f.close()
f = open(file, "w")
f.write(out)
