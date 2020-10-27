public class Butterfree extends Pokemon{
	{
		name = "Butterfree";
		bHP = 6;
		bAtk = 5;
		bDef = 5;
		bSpAtk = 9;
		bSpDef = 8;
		bSpd = 7;
		type1 = "Bug";
		type2 = "Flying";
		abilities = new String[]{"Compound Eyes", "Tinted Lens", "Keen Eye", "Flutter", "Blow Away"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Metapod();
		prevReq = 10;
		height = "3\'/7\"";
		weight = 70.5;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest"};
		overland = 3;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Wallclimber","Threaded"};
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
		movesLevels = new int[]{10, 12, 12, 12, 16, 18, 22, 24, 28, 30, 34, 36, 40, 42, 46};
		moves = new String[]{"Confusion", "Poison Powder", "Sleep Powder", "Stun Spore", "Gust", "Supersonic", "Whirlwind", "Psybeam", "Silver Wind", "Tailwind", "Rage Powder", "Safeguard", "Captivate", "Bug Buzz", "Quiver Dance"};
		TMs = new String[]{"Toxic", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Safeguard", "Frustration", "Solar Beam", "Return", "Psychic", "Shadow Ball", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Acrobatics", "Giga Impact", "Flash", "Struggle Bug", "Psych Up", "Infestation", "Dream Eater", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Air Cutter", "Bug Bite", "Bite", "Electroweb", "Giga Drain", "Ominous Wind", "Roost", "Signal Beam", "Skill Swap", "Sleep Talk", "Snore", "String Shot", "Swift", "Tailwind", "Twister"};
		naturalMoves = new String[]{};
	}
		Butterfree(){

		super();
		}
}