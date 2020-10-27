public class Dustox extends Pokemon{
	{
		name = "Dustox";
		bHP = 6;
		bAtk = 5;
		bDef = 7;
		bSpAtk = 5;
		bSpDef = 9;
		bSpd = 7;
		type1 = "Bug";
		type2 = "Poison";
		abilities = new String[]{"Shield Dust", "Compound Eyes", "Dust Cloud", "Flutter", "Effect Spore"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Cascoon();
		prevReq = 10;
		height = "3\'/11\"";
		weight = 69.7;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		overland = 2;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 3;
		combat = 2;
		stealth = 2;
		percep = 6;
		focus = 5;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 3;
		focusBonus = 0;
		movesLevels = new int[]{10, 12, 15, 17, 20, 22, 25, 27, 30, 32, 35, 37, 40};
		moves = new String[]{"Gust", "Confusion", "Poison Powder", "Moonlight", "Venoshock", "Psybeam", "Silver Wind", "Light Screen", "Whirlwind", "Toxic", "Bug Buzz", "Protect", "Quiver Dance"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Roost", "Frustration", "Solar Beam", "Return", "Psychic", "Shadow Ball", "Double Team", "Sludge", "Sludge Bomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Acrobatics", "Giga Impact", "Flash", "Struggle Bug", "Infestation", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Air Cutter", "Bug Bite", "Bite", "Defog", "Electroweb", "Giga Drain", "Ominous Wind", "Roost", "Signal Beam", "Sleep Talk", "Snore", "String Shot", "Swift", "Tailwind", "Twister"};
		naturalMoves = new String[]{};
	}
		Dustox(){

		super();
		}
}