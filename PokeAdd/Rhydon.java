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
		type2 = "Rock";
		abilities = new String[]{"Rock Head", "Solid Rock", "Sturdy", "Reckless", "Lightning Rod"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Rhyhorn();
		prevReq = 25;
		next = new String[]{"Rhyperior"};
		nextReq = new String[]{"45"};
		height = "6\'/3\"";
		weight = 264.6;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "Field";
		habitats = new String[]{"Cave", "Grassland", "Mountain"};
		overland = 5;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 8;
		natureWalk = new String[]{"Mountain"};
		underdog = false;
		other = new String[]{"Mountable 1","Tracker"};
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
		movesLevels = new int[]{5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 48, 55, 62};
		moves = new String[]{"Fury Attack", "Scary Face", "Smack Down", "Stomp", "Bulldoze", "Chip Away", "Rock Blast", "Drill Run", "Take Down", "Stone Edge", "Earthquake", "Megahorn", "Horn Drill"};
		TMs = new String[]{"Roar", "Toxic", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Thunderbolt", "Thunder", "Earthquake", "Return", "Brick Break", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Facade", "Rest", "Attract", "Thief", "Round", "Focus Blast", "Fling", "Brutal Swing", "Shadow Claw", "Payback", "Smart Strike", "Giga Impact", "Rock Polish", "Stone Edge", "Swords Dance", "Bulldoze", "Rock Slide", "Dragon Tail", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Surf", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Aqua Tail", "Avalanche", "Block", "Body Slam", "Slam", "Counter", "Dragon Pulse", "Drill Run", "Dynamic Punch", "Earth Power", "Endeavor", "Fire Punch", "Focus Punch", "Fury Cutter", "Horn Drill", "Ice Punch", "Icy Wind", "Iron Tail", "Mega Kick", "Mega Punch", "Outrage", "Rollout", "Shock Wave", "Seismic Toss", "Snore", "Spite", "Stealth Rock", "Stomping Tantrum", "Superpower", "Thunder Punch", "Uproar"};
		naturalMoves = new String[]{"Horn Drill"};
	}
		Rhydon(){

		super();
		}
}