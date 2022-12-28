public class Charmander extends Pokemon{
	{
		name = "Charmander";
		bHP = 4;
		bAtk = 5;
		bDef = 4;
		bSpAtk = 6;
		bSpDef = 5;
		bSpd = 7;
		type1 = "Fire";
		type2 = "";
		abilities = new String[]{"Blaze", "Rattled", "Solar Power", "Courage", "Dodge"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Charmeleon", "Charizard"};
		nextReq = new String[]{"30"};
		height = "2\'/0\"";
		size = "Small";
		weight = 18.7;
		WC = 1;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Dragon";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Mountain"};
		underdog = true;
		other = new String[]{"Firestarter","Glow"};
		athl = 2;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 2;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 3, 7, 10, 16, 19, 25, 28, 34, 37, 43, 46};
		moves = new String[]{"Scratch", "Growl", "Ember", "Smokescreen", "Dragon Rage", "Scary Face", "Fire Fang", "Flame Burst", "Slash", "Flamethrower", "Fire Spin", "Inferno"};
		TMs = new String[]{"Work Up", "Dragon Claw", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Return", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Aerial Ace", "Facade", "Flame Charge", "Rest", "Attract", "Round", "Echoed Voice", "Overheat", "Fling", "Shadow Claw", "Swords Dance", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		eggMoves = new String[]{"Air Cutter", "Ancient Power", "Beat Up", "Belly Drum", "Bite", "Counter", "Crunch", "Dragon Dance", "Dragon Pulse", "Dragon Rush", "Flare Blitz", "Focus Punch", "Metal Claw", "Outrage", "Rock Slide", "Swords Dance"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Defense Curl", "Dragon Pulse", "Dynamic Punch", "Fire Pledge", "Fire Punch", "Fury Cutter", "Heat Wave", "Iron Tail", "Mega Kick", "Mega Punch", "Outrage", "Rage", "Seismic Toss", "Snore", "Swift", "Thunder Punch"};
		naturalMoves = new String[]{};
	}
		Charmander(){

		super();
		}
}