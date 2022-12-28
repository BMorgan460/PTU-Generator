public class Fletchling extends Pokemon{
	{
		name = "Fletchling";
		bHP = 5;
		bAtk = 5;
		bDef = 4;
		bSpAtk = 4;
		bSpDef = 4;
		bSpd = 6;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Gale Wings", "Big Pecks", "Accelerate", "Rocket"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Fletchinder", "Talonflame"};
		nextReq = new String[]{"30"};
		height = "1\'/0\"";
		size = "Small";
		weight = 3.7;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "";
		overland = 3;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		underdog = true;
		other = new String[]{"Guster"};
		athl = 2;
		acro = 3;
		combat = 2;
		stealth = 2;
		percep = 3;
		focus = 2;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 6, 10, 13, 16, 21, 25, 29, 34, 39, 41, 45, 48};
		moves = new String[]{"Tackle", "Growl", "Quick Attack", "Peck", "Agility", "Flail", "Roost", "Razor Wind", "Natural Gift", "Flame Charge", "Acrobatics", "Me First", "Tailwind", "Steel Wing"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Flame Charge", "Rest", "Attract", "Thief", "Round", "Overheat", "Steel Wing", "Acrobatics", "Swords Dance", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		eggMoves = new String[]{"Quick Guard", "Snatch", "Tailwind"};
		tutorMoves = new String[]{"Defog", "Heat Wave", "Snatch", "Snore", "Tailwind"};
		naturalMoves = new String[]{};
	}
		Fletchling(){

		super();
		}
}