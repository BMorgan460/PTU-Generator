public class Toucannon extends Pokemon{
	{
		name = "Toucannon";
		bHP = 8;
		bAtk = 12;
		bDef = 8;
		bSpAtk = 8;
		bSpDef = 8;
		bSpd = 6;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Pickup", "Sheer Force", "Technician", "Skill Link"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Trumbeak();
		prevReq = 30;
		height = "3\'/7\"";
		weight = 57.3;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Herbivore";
		overland = 4;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 4;
		underdog = false;
		other = new String[]{"Guster"};
		athl = 3;
		acro = 5;
		combat = 4;
		stealth = 2;
		percep = 4;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{3, 7, 9, 13, 16, 21, 24, 30, 34, 40, 44, 50};
		moves = new String[]{"Growl", "Echoed Voice", "Rock Smash", "Supersonic", "Pluck", "Roost", "Fury Attack", "Screech", "Drill Peck", "Bullet Seed", "Feather Dance", "Hyper Voice"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Protect", "Roost", "Frustration", "Smack Down", "Return", "Brick Break", "Double Team", "Aerial Ace", "Flame Charge", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Overheat", "Steel Wing", "Swords Dance", "Fly", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Confide"};
		tutorMoves = new String[]{"Defog", "Gunk Shot", "Heat Wave", "Hyper Voice", "Knock Off", "Rock Blast", "Seed Bomb", "Sky Attack", "Snore", "Tailwind", "Uproar"};
		naturalMoves = new String[]{"Rock Blast"};
	}
		Toucannon(){

		super();
		}
}