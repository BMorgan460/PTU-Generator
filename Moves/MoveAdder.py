import  os

#\t is tab
#\n is new line

def construct(file, name):# creates the base constructor class and writes the begining info and name
	n = open(file, "w+") #Opens the new file

def check_if_int(checkVar):
	try:
		result = int(checkVar)
	except ValueError:
		return 0
	return 1
moveList = ["Absorb","Accelrock","Acid","Acid Armor","Acid Spray","Acrobatics","Acupressure","Aerial Ace","Aeroblast","After You","Agility","Air Cutter","Air Slash","Ally Switch","Amnesia","Anchor Shot","Ancient Power","Aqua Jet","Aqua Ring","Aqua Tail","Arm Thrust","Aromatherapy","Aromatic Mist","Assist","Assurance","Astonish","Attack Order","Attract","Aura Sphere","Aurora Beam","Autotomize","Avalanche","Baby-Doll Eyes","Baneful Bunker","Barrage","Barrier","Baton Pass","Beak Blast","Beat Up","Belch","Belly Drum","Bestow","Bide","Bind","Bite","Blast Burn","Blaze Kick","Blizzard","Block","Blue Flare","Body Slam","Bolt Strike","Bone Club","Bone Rush","Bonemerang","Boomburst","Bounce","Brave Bird","Brick Break","Brine","Brutal Swing","Bubble","Bubble Beam","Bug Bite","Bug Buzz","Bulk Up","Bulldoze","Bullet Punch","Bullet Seed","Burn Up","Calm Mind","Camouflage","Captivate","Charge","Charge Beam","Charm","Chatter","Chip Away","Circle Throw","Clamp","Clanging Scales","Clear Smog","Close Combat","Coil","Comet Punch","Confide","Confuse Ray","Confusion","Constrict","Conversion","Conversion2","Copycat","Core Enforcer","Cosmic Power","Cotton Guard","Cotton Spore","Counter","Covet","Crabhammer","Crafty Shield","Cross Chop","Cross Poison","Crunch","Crush Claw","Crush Grip","Curse","Cut","Dark Pulse","Dark Void","Darkest Lariat","Dazzling Gleam","Defend Order","Defense Curl","Defog","Destiny Bond","Detect","Diamond Storm","Dig","Disable","Disarming Voice","Discharge","Dive","Dizzy Punch","Doom Desire","Double Hit","Double Kick","Double Slap","Double Team","Double-Edge","Draco Meteor","Dragon Ascent","Dragon Breath","Dragon Claw","Dragon Dance","Dragon Hammer","Dragon Pulse","Dragon Rage","Dragon Rush","Dragon Tail","Drain Punch","Draining Kiss","Dream Eater","Drill Peck","Drill Run","Dual Chop","Dynamic Punch","Earth Power","Earthquake","Echoed Voice","Eerie Impulse","Egg Bomb","Electric Terrain","Electrify","Electro Ball","Electroweb","Embargo","Ember","Encore","Endeavor","Endure","Energy Ball","Entrainment","Eruption","Explosion","Extrasensory","Extreme Speed","Facade","Fairy Lock","Fairy Wind","Fake Out","Fake Tears","False Swipe","Façade","Feather Dance","Feint","Feint Attack","Fell Stinger","Fiery Dance","Final Gambit","Fire Blast","Fire Fang","Fire Lash","Fire Pledge","Fire Punch","Fire Spin","First Impression","Fissure","Flail","Flame Burst","Flame Charge","Flame Wheel","Flamethrower","Flare Blitz","Flash","Flash Cannon","Flatter","Fleur Cannon","Fling","Floral Healing","Flower Shield","Fly","Flying Press","Focus Blast","Focus Energy","Focus Punch","Follow Me","Force Palm","Foresight","Forest's Curse","Foul Play","Freeze Shock","Freeze-Dry","Frenzy Plant","Frost Breath","Frustration","Fury Attack","Fury Cutter","Fury Swipes","Fusion Bolt","Fusion Flare","Future Sight","Gastro Acid","Gear Grind","Gear Up","Geomancy","Giga Drain","Giga Impact","Glaciate","Glare","Grass Knot","Grass Pledge","Grasswhistle","Grassy Terrain","Gravity","Growl","Growth","Grudge","Guard Split","Guard Swap","Guillotine","Gunk Shot","Gust","Gyro Ball","Hail","Hammer Arm","Harden","Haze","Head Charge","Head Smash","Headbutt","Heal Bell","Heal Block","Heal Order","Heal Pulse","Healing Wish","Heart Stamp","Heart Swap","Heat Crash","Heat Wave","Heavy Slam","Helping Hand","Hex","Hidden Power","High Horsepower","High Jump Kick","Hold Hands","Hone Claws","Horn Attack","Horn Drill","Horn Leech","Howl","Hurricane","Hydro Cannon","Hydro Pump","Hyper Beam","Hyper Fang","Hyper Voice","Hyperspace Fury","Hypnosis","Ice Ball","Ice Beam","Ice Burn","Ice Fang","Ice Hammer","Ice Punch","Ice Shard","Icicle Crash","Icicle Spear","Icy Wind","Imprison","Incinerate","Inferno","Infestation","Ingrain","Instruct","Ion Deluge","Iron Defense","Iron Head","Iron Tail","Judgement","Jump Kick","Karate Chop","Kinesis","King's Shield","Knock Off","Land's Wrath","Laser Focus","Last Resort","Lava Plume","Leaf Blade","Leaf Storm","Leaf Tornado","Leafage","Leech Life","Leech Seed","Leer","Lick","Light of Ruin","Light Screen","Liquidation","Lock-On","Lovely Kiss","Low Kick","Low Sweep","Lucky Chant","Lunar Dance","Lunge","Luster Purge","Mach Punch","Magic Coat","Magic Room","Magical Leaf","Magma Storm","Magnet Bomb","Magnet Rise","Magnetic Flux","Magnitude","Mat Block","Me First","Mean Look","Meditate","Mega Drain","Mega Kick","Mega Punch","Megahorn","Memento","Metal Burst","Metal Claw","Metal Sound","Meteor Mash","Metronome","Milk Drink","Mimic","Mind Blown","Mind Reader","Minimize","Miracle Eye","Mirror Coat","Mirror Move","Mirror Shot","Mist","Mist Ball","Misty Terrain","Moonblast","Moongeist Beam","Moonlight","Morning Sun","Mud Bomb","Mud Shot","Mud Sport","Mud-Slap","Muddy Water","Multi-Attack","Mystical Fire","Nasty Plot","Natural Gift","Nature Power","Nature's Madness","Needle Arm","Night Daze","Night Shade","Night Slash","Nightmare","Noble Roar","Nuzzle","Oblivion Wing","Octazooka","Odor Sleuth","Ominous Wind","Origin Pulse","Outrage","Overheat","Pain Split","Parabolic Charge","Parting Shot","Pay Day","Payback","Peck","Perish Song","Petal Blizzard","Petal Dance","Phantom Force","Photon Geyser","Pin Missile","Plasma Fists","Play Nice","Play Rough","Pluck","Poison Fang","Poison Gas","Poison Jab","Poison Powder","Poison Sting","Poison Tail","Pollen Puff","Pound","Powder","Powder Snow","Power Gem","Power Split","Power Swap","Power Trick","Power Trip","Power Whip","Power-Up Punch","Preicpice Blades","Present","Prismatic Laser","Protect","Psybeam","Psych Up","Psychic","Psychic Fangs","Psychic Terrain","Psycho Boost","Psycho Cut","Psycho Shift","Psyshock","Psystrike","Psywave","Punishment","Purify","Pursuit","Quash","Quick Attack","Quick Guard","Quiver Dance","Rage","Rage Powder","Rain Dance","Rapid Spin","Razor Leaf","Razor Shell","Razor Wind","Recover","Recycle","Reflect","Reflect Type","Refresh","Relic Song","Rest","Retaliate","Return","Revelation Dancer","Revenge","Reversal","Roar","Roar of Time","Rock Blast","Rock Climb","Rock Polish","Rock Slide","Rock Smash","Rock Throw","Rock Tomb","Rock Wrecker","Role Play","Rolling Kick","Rollout","Roost","Rototiller","Round","Sacred Fire","Sacred Sword","Safeguard","Sand Attack","Sand Tomb","Sandstorm","Scald","Scary Face","Scratch","Screech","Searing Shot","Secret Power","Secret Sword","Seed Bomb","Seed Flare","Seismic Toss","Self-Destruct","Shadow Ball","Shadow Bone","Shadow Claw","Shadow Force","Shadow Punch","Shadow Sneak","Sharpen","Sheer Cold","Shell Smash","Shell Trap","Shift Gear","Shock Wave","Shore Up","Signal Beam","Silver Wind","Simple Beam","Sing","Sketch","Skill Swap","Skull Bash","Sky Attack","Sky Drop","Sky Uppercut","Slack Off","Slam","Slash","Sleep Powder","Sleep Talk","Sludge","Sludge Bomb","Sludge Wave","Smack Down","Smart Strike","Smelling Salts","Smog","Smokescreen","Snarl","Snatch","Snore","Soak","Soft-Boiled","Solar Beam","Solar Blade","Sonic Boom","Spacial Rend","Spark","Sparkling Aria","Spectral Thief","Speed Swap","Spider Web","Spike Cannon","Spikes","Spiky Shield","Spirit Shackle","Spit Up","Spite","Splash","Spore","Spotlight","Stealth Rock","Steamroller","Steel Wing","Sticky Web","Stockpile","Stomp","Stomping Tantrum","Stone Edge","Stored Power","Storm Throw","Strength","Strength Sap","String Shot","Struggle Bug","Stun Spore","Submission","Substitute","Sucker Punch","Sunny Day","Sunsteel Strike","Super Fang","Superpower","Supersonic","Surf","Swagger","Swallow","Sweet Kiss","Sweet Scent","Swift","Switcheroo","Swords Dance","Synchronoise","Synthesis","Tackle","Tail Glow","Tail Slap","Tail Whip","Tailwind","Take Down","Taunt","Tearful Look","Techno Blast","Teeter Dance","Telekinesis","Teleport","Thief","Thousand Arrows","Thousand Waves","Thrash","Throat Chop","Thunder","Thunder Fang","Thunder Punch","Thunder Shock","Thunder Wave","Thunderbolt","Tickle","Topsy-Turvy","Torment","Toxic","Toxic Spikes","Toxic Thread","Transform","Tri Attack","Trick","Trick Room","Trick-or-Treat","Triple Kick","Trop Kick","Trump Card","Twineedle","Twister","U-Turn","Uproar","V-Create","Vacuum Wave","Venom Drench","Venoshock","Vicegrip","Vine Whip","Vital Throw","Volt Switch","Volt Tackle","Wake-Up Slap","Water Gun","Water Pledge","Water Pulse","Water Shuriken","Water Sport","Water Spout","Waterfall","Weather Ball","Whirlpool","Whirlwind","Wide Guard","Wild Charge","Will-O-Wisp","Wing Attack","Wish","Withdraw","Wonder Room","Wood Hammer","Work Up","Worry Seed","Wrap","Wring Out","X-Scissor","Yawn","Zap Cannon","Zen Headbutt","Zing Za"]
abilityList = ["Abominable","Absorb Force","Adaptability","Aerilate","Aftermath","Air Lock","Ambush","Analytic","Anger Point","Anticipation","Aqua Boost","Aqua Bullet","Arena Trap","Aroma Veil","Aura Break","Aura Storm","Bad Dreams","Battery","Battle Armor","Beam Cannon","Beast Boost","Beautiful","Berry Storage","Berserk","Big Pecks","Big Swallow","Blaze","Blessed Touch","Blow Away","Blur","Bodyguard","Bone Lord","Bone Wielder","Brimstone","Bulletproof","Bully","Cave Crasher","Celebrate","Cherry Power","Chlorophyll","Clay Cannons","Clear Body","Cloud Nine","Cluster Mind","Color Change","Color Theory","Comatose","Combo Striker","Competitive","Compound Eyes","Confidence","Conflagrate","Conqueror","Contrary","Copy Master","Corrosion","Corrosive Toxins","Courage","Covert","Cruelty","Crush Trap","Cursed Body","Cute Charm","Cute Tears","Damp","Dancer","Danger Syrup","Dark Art","Dark Aura","Daze","Dazzling","Deadly Poison","Decoy","Deep Sleep","Defeatist","Defiant","Defy Death","Delayed Reaction","Delivery Bird","Desert Weather","Designer","Diamond Defense","Dig Away","Dire Spore","Discipline","Disguise","Dodge","Download","Dream Smoke","Dreamspinner","Drizzle","Drought","Drown Out","Dry Skin","Dust Cloud","Early Bird","Effect Spore","Eggscellence","Electric Surge","Electrodash","Emergency Exit","Empower","Enduring Rage","Enfeebling Lips","Exploit","Fabulous Trim","Fade Away","Fairy Aura","Fairy Orbs","Fashion Designer","Fiery Crash","Filter","Flame Body","Flame Tongue","Flare Boost","Flash Fire","Flower Gift","Flower Power","Flower Veil","Fluffy","Fluffy Charge","Flutter","Flying Fly Trap","Focus","Forecast","Forest Lord","Forewarn","Fox Fire","Freezing Point","Friend Guard","Frighten","Frisk","Frostbite","Full Guard","Full Metal Body","Fur Coat","Gale Wings","Galvanize","Gardener","Gentle Vibe","Giver","Gluttony","Gooey","Gore","Grass Pelt","Grassy Surge","Gulp","Guts","Harvest","Haunt","Hay Fever","Healer","Heat Mirage","Heatproof","Heavy Metal","Heliovolt","Helper","Honey Paws","Honey Thief","Huge Power","Huge Power" , "Pure Power","Hustle","Hydration","Hyper Cutter","Hypnotic","Ice Body","Ice Shield","Ignition Boost","Illuminate","Illusion","Immunity","Imposter","Impostor","Infiltrator","Innards Out","Inner Focus","Insomnia","Instinct","Interference","Intimidate","Iron Barbs","Iron Fist","Juicy Energy","Justified","Kampfgeist","Keen Eye","Klutz","Lancer","Landslide","Last Chance","Leaf Gift","Leaf Guard","Leaf Rush","Leafy Cloak","Leek Mastery","Levitate","Life Force","Light Metal","Lightning Kicks","Lightning Rod","Limber","Line Charge","Liquid Ooze","Liquid Voice","Long Reach","Lullaby","Lunchbox","Mach Speed","Maestrom Pulse","Magic Bounce","Magic Guard","Magician","Magma Armor","Magnet Pull","Marvel Scale","Mega Launcher","Memory Wipe","Merciless","Migraine","Mimitree","Mind Mold","Mini-Noses","Minus","Miracle Mile","Misty Surge","Mojo","Mold Breaker","Moody","Motor Drive","Mountain Peak","Moxie","Mud Dweller","Multiscale","Multitype","Mummy","Natural Cure","Needles","Neuroforce","Nimble Strikes","No Guard","Normalize","Oblivious","Odious Spray","Omen","Overcharge","Overcoat","Overgrow","Own Tempo","Pack Hunt","Parental Bond","Parry","Perception","Permafrost","Photosynthesis","Pickpocket","Pickup","Pixilate","Plus","Poison Heal","Poison Point","Poison Touch","Poltergeist","Polycephaly","Power Construct","Power of Alchemy","Prankster","Pressure","Pride","Prime Fury","Prism Armor","Probability Control","Protean","Psychic Surge","Pumpkingrab","Pure Blooded","Pure Power","Queenly Majesty","Quick Cloak","Quick Curl","Quick Feet","Ragelope","Rain Dish","Rally","Rattled","Razor Edge","Receiver","Reckless","Refreshing Veil","Refridgerate","Regal Challenge","Regenerator","Rivalry","RKS System","Rock Head","Rocket","Root Down","Rough Skin","Run Away","Run Up","Sacred Bell","Sand Force","Sand Rush","Sand Stream","Sand Veil","Sap Sipper","Schooling","Scrappy","Seasonal","Sequence","Serene Grace","Serpent's Mark","Shackle","Shadow Tag","Shed Skin","Sheer Force","Shell Armor","Shell Cannon","Shell Shield","Shield Dust","Shields Down","Silk Threads","Simple","Skill Link","Slow Start","Slush Rush","Sniper","Snow Cloak","Snow Warning","Snuggle","Sol Veil","Solar Power","Solid Rock","Sonic Courtship","Soothing Tone","Sorcery","Soul Heart","Soulstealer","Sound Lance","Soundproof","Speed Boost","Spike Shot","Spinning Dance","Spiteful Intervention","Spray Down","Sprint","Stakeout","Stall","Stance Change","Starlight","Starswirl","Static","Steadfast","Steam Cloud","Steel Cannons","Steelworker","Stench","Sticky Hold","Sticky Smoke","Storm Drain","Strange Tempo","Strong Jaw","Sturdy","Suction Cups","Sumo Stance","Sun Blanket","Sunglow","Super Luck","Surge Surfer","Swarm","Sway","Sweet Veil","Swift Swim","Symbiosis","Synchronize","Tangled Feet","Tangling Hair","Targeting System","Teamwork","Technician","Telepathy","Teravolt","Thermosensitive","Thick Fat","Thrust","Thunder Boost","Tingle","Tingly Tongue","Tinted Lens","Tochukaso","Tolerance","Tonguelash","Torrent","Tough Claws","Toxic Boost","Toxic Relationship","Trace","Transporter","Triage","Trinity","Truant","Turboblaze","Turboblaze","Twisted Power","Type Aura","Type Strategist","Ugly","Unaware","Unbreakable","Unburden","Unnerve","Vanguard","Venom","Vicious","Victory Star","Vigor","Vital Spirit","Volt Absorb","Voodoo Doll","Wallmaster","Wash Away","Water Absorb","Water Bubble","Water Compaction","Water Veil","Wave Rider","Weak Armor","Weaponize","Weeble","Weird Power","Whirlwind Kicks","White Flame","White Smoke","Wimp Out","Windveiled","Winter's Kiss","Wishmaster","Wistful Melody","Wobble","Wonder Guard","Wonder Skin","Zen Mod"]
list = [] #Array used to store all the words in the file 
id = -1 #id for the array
num = 0 #Var used for ablities 
unwanted = [':', '/', '"', "'", '%', ".", "!"] #certain chars to remove to keep consitance
currentEVO = 'previous' #Sets all evolutions to previous till current evo is find
currentReq = 'prevReq'	#same as above except for level requirments
moves = []
ablitiesList = []
basic = -1
adv = 0
high = 0
base = False
eff = False

for subdir, dirs, files in os.walk('./'): #Checks for each file in a folder that this program is in
	for file in files:  # checks each file
		ext =  file[-4:]  # checks for the .exetension
		if  ext == ".txt": # only accepts .txt files
			# print(file) #debug
			print("Starting " + file)
			f = open(file, "r") #allows python to read data in the file
			name = file[:-4] #Pulls the Pokemon name
			name = name.replace(" ", '_')
			file = name + ".java" # Creates a name for the new java file
			n = open(file, "a+") #Creates a java file for the Pokemon
			construct(file, name) #calls the function providing file name and pokemon name
			line = f.readline() #Reads each line in the file
			for word in line.split(): #Will go through each file
				for u in unwanted:
					word = word.replace(u, '')
				if word == "Contest":
					break
				if word != '':
					list.append(word)#adds each word into the array
<<<<<<< HEAD
			list.append("the program has ended")		
=======
			list.append("end")
>>>>>>> 291be190963868b6eac60f2c90ae742bfcd694b6
			n.write('public class ' + name  +" extends Move{\n")
			n.write("\t\t{\n")
			while id < (len(list) - 1): #Goes through each word in the array
				# print(list)#Debug
				#print(list)#Debug
				id = id + 1 # goes through each id on the array
<<<<<<< HEAD
				if list[id] == "Move": 
					if name == "trick"
						name = "trick_"
=======
				if list[id] == "Move":
>>>>>>> 291be190963868b6eac60f2c90ae742bfcd694b6
					n.write('\t\tname = "' + name.replace("_", ' ') + '";\n')
				if list[id] == "Type":
					n.write('\t\ttype = "' + list[id +1] + '";\n')
				if list[id] == "Frequency":
					n.write('\t\tfrequency = "' + list[id +1] + '";\n')
				if list[id] == "AC":
					ac = list[id + 1]
					if ac == "None":
						ac = 0
					n.write('\t\tAC = ' + str(ac) + ';\n')
				if list[id] == "Class":
					n.write('\t\tcategory = "' + list[id +1] + '";\n')
				if list[id] == "Range":
					range = []
					id += 1
					while list[id] != "Effect" and list[id] != "the program has ended":
						#print(list[id])
						range.append(list[id])
						id += 1
					n.write('\t\trange = "')
					setnum = 0
					while setnum < len(range) - 1:
						n.write(range[setnum] + ' ')
						setnum += 1
					n.write(range[setnum] + '";\n')
					range = []
				if list[id] == "Effect":
					eff = True
					effects = []
					id += 1
					while list[id] != "the program has ended":
						effects.append(list[id])
						id += 1
					n.write('\t\teffects = "')
					setnum = 0
					while setnum < len(effects) - 1:
						n.write(effects[setnum] + ' ')
						setnum += 1
					n.write(effects[setnum] + '";\n')
					effects = []
				if list[id] == "Base":
					n.write('\t\tdamageBase = ' + list[id +1] + ';\n')
					n.write('\t\tmDamageBase = ' + list[id +1] + ';\n')
					base = True
			if eff == False:
				n.write('\t\teffects = "";')
			if base == False:
				n.write('\t\tdamageBase = 0; \n')
				n.write('\t\tmDamageBase = 0;\n')
			n.write("\t\t}\n")
			n.write("}")
			base = False
			eff = False
			f.close()
			n.close()
			print("Finished " + file)
