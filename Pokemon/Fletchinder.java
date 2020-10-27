public class Fletchinder extends Pokemon{
	{
		name = "Fletchinder";
		bHP = 6;
		bAtk = 7;
		bDef = 6;
		bSpAtk = 6;
		bSpDef = 5;
		bSpd = 8;
		type1 = "Fire";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Tangled Feet", "Big Pecks", "Gale Wings", "Rocket"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Fletchling();
		prevReq = 15;
		next = new String[]{"Talonflame"};
		nextReq = new String[]{"30"};
		height = "2\'/04\"";
		size = "Small";
		weight = 35.3;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		overland = 3;
		swim = 0;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 2;
		underdog = true;
		other = new String[]{"Firestarter","Guster"};
		athl = 3;
		acro = 4;
		combat = 3;
		stealth = 2;
		percep = 4;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 6, 10, 13, 16, 17, 25, 27, 31, 38, 42, 46, 51, 55};
		moves = new String[]{"Tackle", "Growl", "Quick Attack", "Peck", "Agility", "Flail", "Ember", "Roost", "Razor Wind", "Natural Gift", "Flame Charge", "Acrobatics", "Me First", "Tailwind", "Steel Wing"};
		TMs = new String[]{"Fly", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Roost", "Frustration", "Return", "Double Team", "Flamethrower", "Fire Blast", "Aerial Ace", "Facade", "Flame Charge", "Rest", "Attract", "Thief", "Round", "Overheat", "Steel Wing", "Incinerate", "Acrobatics", "Swords Dance", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Heat Wave", "Snatch", "Snore", "Tailwind"};
		naturalMoves = new String[]{};
	}
		Fletchinder(){

		super();
		}
}