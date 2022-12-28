public class Venomoth extends Pokemon{
	{
		name = "Venomoth";
		bHP = 7;
		bAtk = 7;
		bDef = 6;
		bSpAtk = 9;
		bSpDef = 8;
		bSpd = 9;
		type1 = "Bug";
		type2 = "Poison";
		abilities = new String[]{"Compound Eyes", "Tinted Lens", "Wonder Skin", "Shield Dust", "Dust Cloud"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Venonat();
		prevReq = 30;
		height = "4\'/11\"";
		weight = 27.6;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		overland = 2;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 2;
		underdog = false;
		other = new String[]{};
		athl = 2;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 4;
		focus = 4;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{5, 11, 13, 17, 23, 25, 29, 37, 41, 47, 55, 59, 63};
		moves = new String[]{"Supersonic", "Confusion", "Poison Powder", "Psybeam", "Stun Spore", "Signal Beam", "Sleep Powder", "Leech Life", "Zen Headbutt", "Poison Fang", "Psychic", "Bug Buzz", "Quiver Dance"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Roost", "Frustration", "Solar Beam", "Return", "Leech Life", "Psychic", "Double Team", "Sludge", "Sludge Bomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Acrobatics", "Giga Impact", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Bug Bite", "Bite", "Bug Buzz", "Defog", "Giga Drain", "Ominous Wind", "Quiver Dance", "Signal Beam", "Silver Wind", "Skill Swap", "Snore", "String Shot", "Swift", "Tailwind", "Twister", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{"Bug Buzz", "Defog", "Disable", "Quiver Dance", "Silver Wind"};
	}
		Venomoth(){

		super();
		}
}