public class Shelgon extends Pokemon{
	{
		name = "Shelgon";
		bHP = 7;
		bAtk = 10;
		bDef = 10;
		bSpAtk = 6;
		bSpDef = 5;
		bSpd = 5;
		type1 = "Dragon";
		type2 = "";
		abilities = new String[]{"Overcoat", "Moxie", "Sheer Force", "Sturdy", "Rock Head"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Bagon();
		prevReq = 30;
		next = new String[]{"Salamence"};
		nextReq = new String[]{"50"};
		height = "3\'/7\"";
		weight = 243.6;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Dragon";
		egg2 = "Carnivore";
		overland = 3;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 6;
		underdog = true;
		other = new String[]{};
		athl = 2;
		acro = 1;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 3;
		movesLevels = new int[]{4, 7, 10, 13, 17, 21, 25, 29, 30, 35, 42, 49, 56};
		moves = new String[]{"Ember", "Leer", "Bite", "Dragon Breath", "Headbutt", "Focus Energy", "Crunch", "Dragon Claw", "Protect", "Zen Headbutt", "Scary Face", "Flamethrower", "DoubleEdge"};
		TMs = new String[]{"Cut", "Strength", "Hone Claws", "Dragon Claw", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Rain Dance", "Frustration", "Return", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Incinerate", "Shadow Claw", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Rock Smash"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Defense Curl", "Draco Meteor", "Dragon Pulse", "Fury Cutter", "Hyper Voice", "Iron Defense", "Outrage", "Rollout", "Sleep Talk", "Snore", "Twister", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Shelgon(){

		super();
		}
}