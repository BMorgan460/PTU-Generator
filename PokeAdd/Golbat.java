public class Golbat extends Pokemon{
	{
		name = "Golbat";
		bHP = 8;
		bAtk = 8;
		bDef = 7;
		bSpAtk = 7;
		bSpDef = 8;
		bSpd = 9;
		type1 = "Poison";
		type2 = "Flying";
		abilities = new String[]{"Inner Focus", "Infiltrator", "Insomnia", "Vanguard", "Ambush"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Zubat();
		prevReq = 20;
		next = new String[]{"Crobat"};
		nextReq = new String[]{"30"};
		height = "5\'/3\"";
		weight = 121.3;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		habitats = new String[]{"Cave"};
		overland = 3;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 3;
		underdog = false;
		other = new String[]{"Darkvision","Tracker"};
		athl = 2;
		acro = 3;
		combat = 3;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 7, 11, 13, 17, 19, 24, 27, 32, 35, 40, 43, 48, 51};
		moves = new String[]{"Supersonic", "Astonish", "Bite", "Wing Attack", "Confuse Ray", "Air Cutter", "Swift", "Poison Fang", "Mean Look", "Leech Life", "Haze", "Venoshock", "Air Slash", "Quick Guard"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Leech Life", "Shadow Ball", "Double Team", "Sludge", "Sludge Bomb", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Steel Wing", "Acrobatics", "Payback", "Giga Impact", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Defog", "Giga Drain", "Heat Wave", "Ominous Wind", "Pluck", "Sky Attack", "Snatch", "Snore", "Super Fang", "Swift", "Tailwind", "Twister", "Uproar", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{"Pluck", "Screech"};
	}
		Golbat(){

		super();
		}
}