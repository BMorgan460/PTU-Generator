public class Dodrio extends Pokemon{
	{
		name = "Dodrio";
		bHP = 6;
		bAtk = 11;
		bDef = 7;
		bSpAtk = 6;
		bSpDef = 6;
		bSpd = 10;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Early Bird", "Run Away", "Tangled Feet", "Polycephaly", "Vanguard"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Doduo();
		prevReq = 25;
		height = "5\'/11\"";
		weight = 187.8;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Herbivore";
		overland = 9;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 5 ;
		hJump = 7;
		power = 6;
		underdog = false;
		other = new String[]{"Mountable 1"};
		athl = 4;
		acro = 4;
		combat = 3;
		stealth = 2;
		percep = 6;
		focus = 2;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 21, 25, 29, 35, 41, 47, 53, 59};
		moves = new String[]{"Quick Attack", "Rage", "Fury Attack", "Pursuit", "Pluck", "Tri Attack", "Acupressure", "Agility", "Drill Peck", "Uproar", "Endeavor", "Thrash"};
		TMs = new String[]{"Fly", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "Payback", "Giga Impact", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Air Cutter", "Body Slam", "Slam", "Endeavor", "Knock Off", "Roost", "Sky Attack", "Sleep Talk", "Snore", "Steel Wing", "Swift", "Uproar", "Tri Attack", "Work Up"};
		naturalMoves = new String[]{};
	}
		Dodrio(){

		super();
		}
}