import os

file = os.path.join(os.getcwd(), "mass_moves.txt")
f = open(file, "r")
for line in f:
    print(line)
    moves = line.split("Move: ")
    for move in moves[1:]:
        name = []
        words = move.split()
        for word in words:
            if word == "Type:":
                break
            elif word == "Frequency:":
                break
            else:
                name.append(word)
        print(move)
        print(name)
        output = open(os.path.join(os.getcwd(), " ".join(name) + ".txt"), "wt")
        output.write("Move: " + move)
        output.close()
f.close()
