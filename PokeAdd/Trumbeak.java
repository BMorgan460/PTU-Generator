public class Trumbeak extends Pokemon{
	{
		name = "Trumbeak";
		bHP = 6;
		bAtk = 9;
		bDef = 5;
		bSpAtk = 4;
		bSpDef = 5;
		bSpd = 8;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Pickup", "Sheer Force", "Technician", "Skill Link"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Pikipek();
		prevReq = 15;
		next = new String[]{"Toucannon"};
		nextReq = new String[]{"30"};
		height = "2\'/0\"";
		size = "Small";
		weight = 32.6;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Herbivore";
		overland = 4;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 2;
		underdog = true;
		other = new String[]{"Guster"};
		athl = 3;
		acro = 4;
		combat = 3;
		stealth = 2;
		percep = 4;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{3, 7, 9, 13, 16, 21, 24, 29, 32, 37, 40, 45};
		moves = new String[]{"Growl", "Echoed Voice", "Rock Smash", "Supersonic", "Pluck", "Roost", "Fury Attack", "Screech", "Drill Peck", "Bullet Seed", "Feather Dance", "Hyper Voice"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Protect", "Roost", "Frustration", "Smack Down", "Return", "Brick Break", "Double Team", "Aerial Ace", "Flame Charge", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "Swords Dance", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Defog", "Gunk Shot", "Heat Wave", "Hyper Voice", "Knock Off", "Rock Blast", "Sky Attack", "Snore", "Tailwind", "Uproar"};
		naturalMoves = new String[]{"Rock Blast"};
	}
		Trumbeak(){

		super();
		}
}