import  os

#\t is tab
#\n is new line

def construct(file, name):# creates the base constructor class and writes the begining info and name
	n = open(file, "w+") #Opens the new file
	n.write("public class " + name + " extends Pokemon{\n") #Creates the public class with pokeomon name
	n.write("\t" + name + "(){\n") #Begins the Constructor
	n.write( "\t\t" + 'name = "' + name + '";\n') #Provides the name var in the constructor



list = [] #Array used to store all the words in the file 
id = 0 #id for the array
num = 0 #Var used for ablities 
unwanted = [':', '/', '-', ',', '"', "'", '%'] #certain chars to remove to keep consitance
currentEVO = 'previous' #Sets all evolutions to previous till current evo is find
currentReq = 'prevReq'	#same as above except for level requirments

for subdir, dirs, files in os.walk('./'): #Checks for each file in a folder that this program is in
	for file in files: #checks each file
		ext =  file[-4:] #checks for the .exetension 
		if  ext == ".txt": # only accepts .txt files
			#print(file) #debug 
			print("Starting " + file)
			f = open(file, "r") #allows python to read data in the file
			name = file[:-4] #Pulls the Pokemon name
			file = name + ".java" # Creates a name for the new java file
			n = open(file, "a+") #Creates a java file for the Pokemon
			construct(file, name) #calls the function providing file name and pokemon name
			line = f.readline() #Reads each line in the file
			for line in f: #will go through each line in the text file
				for word in line.split(): #Will go through each file
					for u in unwanted: 
						word = word.replace(u, '')
					if word != '':
						list.append(word)#adds each word into the array
			while id < (len(list) - 1): #Goes through each word in the array
				#print(list)#Debug
				id = id + 1 # goes through each id on the array
				if list[id] == "Stats": #Checks for the base stat block
					Nid = id + 2 #sets the array to where the HP stat is 
					n.write( "\t\tbHP = " + str(list[Nid]) + ";\n") #sets up the bHP var
					Nid = Nid + 2 #goes to atk stat
					n.write( "\t\tbAtk = " + str(list[Nid]) + ";\n") #sets up the bAtk var
					Nid = Nid + 2 #goes to Def stat
					n.write( "\t\tbDef = " + str(list[Nid]) + ";\n") #sets up the bDef var
					Nid = Nid + 3 #goes to bSpAtk stat
					n.write( "\t\tbSpAtk = " + str(list[Nid]) + ";\n") #sets up the bSpAtk var
					Nid = Nid + 3 #goes to bSpDef stat
					n.write( "\t\tbSpDef = " + str(list[Nid]) + ";\n") #sets up the bSpDef var
					Nid = Nid + 2 #goes to bSpd stat
					n.write( "\t\tbbSpd = " + str(list[Nid]) + ";\n") #sets up the bSpd var
					id = Nid
				if list[id] == "Type":
					Nid = id + 2
					n.write( "\t\ttype1 = " + '"' + str(list[Nid]) + '";\n') #sets up the type1 var
					Nid = Nid + 1
					if list[Nid] == "/":
						Nid = Nid + 1
						n.write( "\t\ttype2 = " + '"' + str(list[Nid]) + '";\n') #sets up the type2 var
					else:
						Nid = Nid - 1
					id = Nid
				if list[id] == "Ability": #Checks 
					Nid = id + 2
					if list[Nid] == "Evolution":
						if list[Nid - 2] == "Ability":
							Nid = Nid - 1
						if list[Nid - 3] == "Ability":	
							Nid = Nid - 1
					nword = list[Nid]
					Nid = Nid + 1
					if list[Nid] == "Adv":
						Nid = Nid - 1
					if list[Nid] == "Basic":
						Nid = Nid - 1
					if list[Nid] == "High":
						Nid = Nid - 1
					if Nid != (id + 2):
						if list[Nid] != 'Evolution':
							nword = nword + " " + str(list[Nid])
					num += 1
					n.write( "\t\tabilities" + str(num) + " = " + '"' + nword + '";\n') #sets up the Ability artubite 
					id = Nid
				if list[id] == "Evolution":
					Nid = id + 1 #Moves to find if there are evolutions
					if list[Nid] == "1":
						Nid = Nid + 1
						if list[Nid] != name: #sees if this is the pokemon current evolution
							n.write( "\t\t" + currentEVO + " = " + '"' + str(list[Nid]) + '";\n') #sets up the previous Evolution
							n.write( "\t\t" + currentReq + " = " + '"' + '1' + '";\n') #sets up the previous Evolution level
						if list[Nid] == name:
							currentEVO = "next"
							currentReq = "nextReq"
					Nid = Nid + 1
					if list[Nid] == '2':
						Nid = Nid + 1
						if list[Nid] != name: #sees if this is the pokemon current evolution
							n.write( "\t\t" + currentEVO + " = " + '"' + str(list[Nid]) + '";\n') #sets up the previous Evolution
							Nid = Nid + 2
							n.write( "\t\t" + currentReq + " = " + '"' + str(list[Nid]) + '";\n') #sets up the previous Evolution level
						if list[Nid] == name:
							currentEVO = "next"
							currentReq = "nextReq"
							Nid = Nid + 2
					Nid = Nid + 1
					if list[Nid] == '3':
						Nid = Nid + 1
						if list[Nid] != name: #sees if this is the pokemon current evolution
							n.write( "\t\t" + currentEVO + " = " + '"' + str(list[Nid]) + '";\n') #sets up the previous Evolution
							Nid = Nid + 2
							n.write( "\t\t" + currentReq + " = " + '"' + str(list[Nid]) + '";\n') #sets up the previous Evolution level
				if list[id] == "Height":
					Nid = id + 1
					foot = list[Nid]
					foot = foot[:-1]
					Nid = Nid + 1
					inch = list[Nid]
					inch = inch[:-1]
					n.write( "\t\theight = " + '"' + str(foot) + "\\'" + "/" + str(inch) + '\\"' +'";\n')
				if list[id] == "(Small)":
					n.write( "\t\tsize = " + '"' + "Small" + '";\n')
				if list[id] == "(Meduim)":
					n.write( "\t\tsize = " + '"' + "Meduim" + '";\n')
				if list[id] == "(Large)":
					n.write( "\t\tsize = " + '"' + "Large" + '";\n')	
				if list[id] == "(Huge)":
					n.write( "\t\tsize = " + '"' + "Huge" + '";\n')	
				if list[id] == "Weight":
					Nid = id + 1
					n.write( "\t\tweight = " + '"' + str(list[Nid]) + '";\n')
					Nid = Nid + 3
					wc = list[Nid]
					wc = wc[:-1]
					wc = wc[-1:]
					n.write( "\t\tWC = " + '"' + wc + '";\n')
				if list[id] == 'Ratio':
					Nid = id + 1
					Male = list[Nid]
					Nid = Nid + 2
					Female = list[Nid]
					n.write( "\t\tmaleRatio = " + '"' + Male + '";\n')
					n.write( "\t\tfemaleRatio = " + '"' + Female + '";\n')
				if list[id] == 'Group':
					Nid = id + 1
					Egggroup = list[Nid]
					n.write( "\t\tegg1 = " + '"' + Egggroup + '";\n')
					Nid = Nid + 1
					Egggroup = list[Nid]
					n.write( "\t\tegg2 = " + '"' + Egggroup + '";\n')
				if list[id] == 'Habitat':
					Nid = id + 1 
					n.write( "\t\thabitat1 = " + '"' + list[Nid] + '";\n')
					Nid = Nid + 1 
					n.write( "\t\thabitat2 = " + '"' + list[Nid] + '";\n')
					Nid = Nid + 1 
					n.write( "\t\thabitat3 = " + '"' + list[Nid] + '";\n')
				if list[id] == 'Capability':	
					Nid = id + 2
					if list[Nid] == 'Overland':
						Nid = Nid + 1
						n.write( "\t\toverland = " + '"' + list[Nid] + '";\n')
						Nid = Nid - 1
					if list[Nid] != 'Overland':
						n.write( "\t\toverland = " + '"' + '0' + '";\n')
						Nid = Nid - 2
					Nid = Nid + 2
					if list[Nid] == 'Swim':
						Nid = Nid + 1
						n.write( "\t\tswim = " + '"' + list[Nid] + '";\n')
						Nid = Nid - 1
					if list[Nid] != 'Swim':
						n.write( "\t\tswim = " + '"' + '0' + '";\n')
						Nid = Nid - 2
					Nid = Nid + 2
					if list[Nid] == 'Levitate':
						Nid = Nid + 1
						n.write( "\t\tlevitate = " + '"' + list[Nid] + '";\n')
						Nid = Nid - 1
					if list[Nid] != 'Levitate':
						n.write( "\t\tlevitate = " + '"' + '0' + '";\n')
						Nid = Nid - 2
					Nid = Nid + 2
					if list[Nid] == 'Sky':
						Nid = Nid + 1
						n.write( "\t\tsky = " + '"' + list[Nid] + '";\n')
						Nid = Nid - 1
					if list[Nid] != 'Sky':
						n.write( "\t\tsky = " + '"' + '0' + '";\n')
						Nid = Nid - 2
					Nid = Nid + 2
					if list[Nid] == 'Burrow':
						Nid = Nid + 1
						n.write( "\t\tburrow = " + '"' + list[Nid] + '";\n')
						Nid = Nid - 1
					if list[Nid] != 'Burrow':
						n.write( "\t\tburrow = " + '"' + '0' + '";\n')
						Nid = Nid - 2
					Nid = Nid + 2
					print(list[Nid])
					if list[Nid] == 'Jump':
						Nid = Nid + 1
						Jump = list[Nid]
						n.write( "\t\tlJump = " + '"' + Jump[:-1] + '";\n')
						n.write( "\t\thJump = " + '"' + Jump[-1:] + '";\n')
						Nid = Nid - 1
					if list[Nid] != 'Jump':
						n.write( "\t\tlJump = " + '"' + '0' + '";\n')
						n.write( "\t\thJump = " + '"' + '0' + '";\n')
						Nid = Nid - 2
					Nid = Nid + 2
					if list[Nid] == 'Power':
						Nid = Nid + 1
						n.write( "\t\tpower = " + '"' + list[Nid] + '";\n')
						Nid = Nid - 1
					if list[Nid] != 'Power':
						n.write( "\t\tpower = " + '"' + '0' + '";\n')
						Nid = Nid - 2
			#print(list)
			f.close()
			n.write("}")
			n.close()
			num = 0
			print("Finished " + file)
	