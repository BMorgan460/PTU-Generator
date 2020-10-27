public class Croconaw extends Pokemon{
	{
		name = "Croconaw";
		bHP = 7;
		bAtk = 8;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 6;
		bSpd = 6;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Hyper Cutter", "Torrent", "Frisk", "Sheer Force", "Strong Jaw"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Totodile();
		prevReq = 15;
		next = new String[]{"Feraligatr"};
		nextReq = new String[]{"30"};
		height = "3\'/7\"";
		weight = 55.1;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Water";
		habitats = new String[]{"Beach", "Freshwater", "Marsh"};
		overland = 7;
		swim = 7;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 5;
		natureWalk = new String[]{"Wetlands"};
		underdog = true;
		other = new String[]{"Fountain"};
		athl = 3;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{6, 8, 13, 15, 21, 24, 30, 33, 39, 42, 48, 51, 57, 60};
		moves = new String[]{"Water Gun", "Rage", "Bite", "Scary Face", "Ice Fang", "Flail", "Crunch", "Chip Away", "Slash", "Screech", "Thrash", "Aqua Tail", "Superpower", "Hydro Pump"};
		TMs = new String[]{"Cut", "Surf", "Strength", "Waterfall", "Dive", "Hone Claws", "Dragon Claw", "Roar", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Return", "Dig", "Brick Break", "Double Team", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Scald", "Fling", "Shadow Claw", "Swords Dance", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Aqua Tail", "Block", "Body Slam", "Slam", "Counter", "Dive", "Dynamic Punch", "Focus Punch", "Fury Cutter", "Ice Punch", "Icy Wind", "Iron Tail", "Low Kick", "Mega Kick", "Mega Punch", "Seismic Toss", "Sleep Talk", "Snore", "Spite", "Superpower", "Uproar", "Water Pledge", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Croconaw(){

		super();
		}
}