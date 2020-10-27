public class Gabite extends Pokemon{
	{
		name = "Gabite";
		bHP = 7;
		bAtk = 9;
		bDef = 7;
		bSpAtk = 5;
		bSpDef = 6;
		bSpd = 8;
		type1 = "Dragon";
		type2 = "Ground";
		abilities = new String[]{"Sand Veil", "Frighten", "Rough Skin", "Vital Spirit", "Intimidate"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Gible();
		prevReq = 25;
		next = new String[]{"Garchomp"};
		nextReq = new String[]{"50"};
		height = "4\'/7\"";
		weight = 123.5;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "Dragon";
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 4;
		lJump = 2 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Desert"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 3;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{3, 7, 13, 15, 19, 24, 28, 33, 40, 49};
		moves = new String[]{"Sand Attack", "Dragon Rage", "Sandstorm", "Take Down", "Sand Tomb", "Dual Chop", "Slash", "Dragon Claw", "Dig", "Dragon Rush"};
		TMs = new String[]{"Cut", "Strength", "Hone Claws", "Dragon Claw", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Dig", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Incinerate", "Shadow Claw", "Stone Edge", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Rock Smash"};
		tutorMoves = new String[]{"Draco Meteor", "Dragon Pulse", "Dual Chop", "Earth Power", "Fury Cutter", "Iron Head", "Iron Tail", "Outrage", "Rock Climb", "Sleep Talk", "Snore", "Stealth Rock", "Swift", "Twister"};
		naturalMoves = new String[]{};
	}
		Gabite(){

		super();
		}
}