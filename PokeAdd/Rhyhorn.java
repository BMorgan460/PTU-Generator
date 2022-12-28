public class Rhyhorn extends Pokemon{
	{
		name = "Rhyhorn";
		bHP = 8;
		bAtk = 9;
		bDef = 10;
		bSpAtk = 3;
		bSpDef = 3;
		bSpd = 3;
		type1 = "Ground";
		type2 = "Rock";
		abilities = new String[]{"Rock Head", "Solid Rock", "Sturdy", "Reckless", "Lightning Rod"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Rhydon", "Rhyperior"};
		nextReq = new String[]{"45"};
		height = "3\'/3\"";
		weight = 253.5;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "Field";
		habitats = new String[]{"Cave", "Grassland", "Mountain"};
		overland = 6;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 6;
		natureWalk = new String[]{"Mountain"};
		underdog = true;
		other = new String[]{"Mountable 1","Tracker"};
		athl = 3;
		acro = 1;
		combat = 2;
		stealth = 2;
		percep = 2;
		focus = 1;
		athlBonus = 3;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 41, 45, 49, 53};
		moves = new String[]{"Horn Attack", "Tail Whip", "Fury Attack", "Scary Face", "Smack Down", "Stomp", "Bulldoze", "Chip Away", "Rock Blast", "Drill Run", "Take Down", "Stone Edge", "Earthquake", "Megahorn", "Horn Drill"};
		TMs = new String[]{"Roar", "Toxic", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Smack Down", "Thunderbolt", "Thunder", "Earthquake", "Return", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Facade", "Rest", "Attract", "Thief", "Round", "Payback", "Smart Strike", "Rock Polish", "Stone Edge", "Swords Dance", "Bulldoze", "Rock Slide", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		eggMoves = new String[]{"Counter", "Crunch", "Crush Claw", "Curse", "Dragon Rush", "Fire Fang", "Guard Split", "Ice Fang", "Iron Tail", "Magnitude", "Metal Burst", "Reversal", "Rock Climb", "Rototiller", "Skull Bash", "Thunder Fang"};
		tutorMoves = new String[]{"Ancient Power", "Aqua Tail", "Body Slam", "Slam", "Dragon Pulse", "Drill Run", "Earth Power", "Endeavor", "Icy Wind", "Iron Tail", "Rollout", "Shock Wave", "Snore", "Spite", "Stealth Rock", "Stomping Tantrum", "Superpower", "Uproar"};
		naturalMoves = new String[]{};
	}
		Rhyhorn(){

		super();
		}
}