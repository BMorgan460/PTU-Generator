public class Torracat extends Pokemon{
	{
		name = "Torracat";
		bHP = 7;
		bAtk = 9;
		bDef = 5;
		bSpAtk = 8;
		bSpDef = 5;
		bSpd = 9;
		type1 = "Fire";
		type2 = "";
		abilities = new String[]{"Intimidate", "Blaze", "Defiant", "Truant", "Bully"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Litten();
		prevReq = 15;
		next = new String[]{"Incineroar"};
		nextReq = new String[]{"30"};
		height = "2\'/4\"";
		size = "Small";
		weight = 55.1;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Carnivore";
		habitats = new String[]{"Forest", "Grassland", "Urban"};
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 6;
		underdog = true;
		other = new String[]{"Firestarter","Tracker"};
		athl = 3;
		acro = 4;
		combat = 4;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 1;
		stealthBonus = 1;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 8, 11, 14, 16, 19, 24, 28, 33, 37, 42, 46, 51, 55};
		moves = new String[]{"Growl", "Lick", "Leer", "Fire Fang", "Double Kick", "Roar", "Bite", "Swagger", "Fury Swipes", "Thrash", "Flamethrower", "Scary Face", "Flare Blitz", "Outrage"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Frustration", "Return", "Leech Life", "Double Team", "Flamethrower", "Fire Blast", "Torment", "Facade", "Flame Charge", "Rest", "Attract", "Round", "Overheat", "Acrobatics", "Shadow Claw", "Swords Dance", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Covet", "Dual Chop", "Endeavor", "Fire Pledge", "Heat Wave", "Outrage", "Snore"};
		naturalMoves = new String[]{};
	}
		Torracat(){

		super();
		}
}