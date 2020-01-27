public class Rhydon extends Pokemon{
{
		name = "Rhydon";
		bHP = 11;
		bAtk = 13;
		bDef = 12;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 4;
		type1 = "Ground";
		type2 = "";
		abilities = new String[]{"Lightning Rod", "Solid Rock", "Reckless", "Rock Head", "Up"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Rhyhorn();
		prevReq = 40;
		next = new String[]{"Rhyperior"};
		nextReq = new String[]{"Protector"};
		height = "6\'/3\"";
		weight = 264.6;
		WC = 5;
		maleRatio = 50;
		femaleRatio = 50;
		egg1 = "Monster";
		egg2 = "Field";
		habitats = new String[]{"Cave", "Grassland", "Mountain"};
		overland = 5;
		swim = 2;
		levitate = 0;
		sky = 0;
		burrow = 0;
		lJump = 1;
		hJump = 2;
		power = 8;
		natureWalk = new String[]{"Mountain"};
		underdog = false;
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 3;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 42, 48, 55, 62};
		moves = new String[]{"Fury Attack", "Scary Face", "Smack Down", "Stomp", "Bulldoze", "Chip Away", "Rock Blast", "Drill Run", "Take Down", "Stone Edge", "Hammer Arm", "Earthquake", "Megahorn", "Horn Drill"};
		TMs = new String[]{"Roar", "Toxic", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Thunderbolt", "Thunder", "Earthquake", "Return", "Dig", "Brick Break", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Facade", "Rest", "Attract", "Thief", "Round", "Focus Blast", "Fling", "Incinerate", "Shadow Claw", "Payback", "Giga Impact", "Rock Polish", "Stone Edge", "Swords Dance", "Bulldoze", "Rock Slide", "Dragon Tail", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "PowerUp", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Aqua Tail", "Avalanche", "Block", "Body Slam", "Slam", "Counter", "Dragon Pulse", "Drill Run", "Dynamic Punch", "Earth Power", "Endeavor", "Fire Punch", "Focus Punch", "Fury Cutter", "Horn Drill", "Ice Punch", "Icy Wind", "Iron Tail", "Mega Kick", "Mega Punch", "Outrage", "Rollout", "Shock Wave", "Seismic Toss", "Sleep Talk", "Snore", "Spite", "Stealth Rock", "Superpower", "Thunder Punch", "Uproar"};
		naturalMoves = new String[]{"Horn Drill", "Megahorn"};
}
		Rhydon(){

		super();
		}
}