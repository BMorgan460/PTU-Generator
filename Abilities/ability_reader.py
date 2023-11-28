import os

for subdir, dirs, files in os.walk("./"):  # Checks for each file in a folder that this program is in
    for dir in dirs:
        if dir == "Gen 7 Unproccessed":
            for subdir2, dirs2, files2 in os.walk(dir):
                for file in files2:  # checks each file
                    print(file)
                    ext = file[-4:]  # checks for the .exetension
                    if ext == ".txt":  # only accepts .txt files
                        name = []
                        freq = []
                        target = []
                        trigger = []
                        effect = []
                        curr_val = ""
                        print("Starting " + file)
                        f = open(os.path.join("Gen 7 Unproccessed", file), "r")
                        for line in f:
                            words = line.split()
                            for word in words:
                                if word == "Ability:":
                                    curr_val = "A"
                                elif word == "Static" or word == "At-Will" or word == "Scene" or word == "Daily" or word == "Special" and curr_val != "E":
                                    curr_val = "F"
                                    freq.append(word)
                                elif word == "Frequency:":
                                    curr_val = "F"
                                elif word == "Target:":
                                    curr_val = "Ta"
                                elif word == "Trigger:":
                                    curr_val = "Tr"
                                elif word == "Effect:":
                                    curr_val = "E"
                                elif curr_val == "A":
                                    name.append(word)
                                elif curr_val == "F":
                                    freq.append(word)
                                elif curr_val == "Ta":
                                    target.append(word)
                                elif curr_val == "Tr":
                                    trigger.append(word)
                                elif curr_val == "E":
                                    effect.append(word)

                        s_name = " ".join(name)
                        s_freq = " ".join(freq)
                        s_target = " ".join(target)
                        s_trigger = " ".join(trigger)
                        s_effect = s_target + s_trigger + " ".join(effect)
                        o_file_path = os.path.join(os.getcwd(), "Processed", s_name + ".txt")
                        o_file = open(o_file_path, "w")
                        o_file.write('"Name":"' + s_name + '","Freq":"' + s_freq + '","Info":"' + s_effect + '"')
                        o_file.close()
                        f.close()
