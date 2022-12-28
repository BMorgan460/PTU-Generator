public class Palossand extends Pokemon{
	{
		name = "Palossand";
		bHP = 9;
		bAtk = 8;
		bDef = 11;
		bSpAtk = 10;
		bSpDef = 8;
		bSpd = 4;
		type1 = "Ghost";
		type2 = "Ground";
		abilities = new String[]{"Water Compaction", "Sand Veil", "Sand Stream", "Arena Trap", "Absorb Force"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Sandygast();
		prevReq = 30;
		height = "4\'/3\"";
		weight = 551.1;
		WC = 6;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Nullivore";
		habitats = new String[]{"Beach"};
		overland = 5;
		swim = 2;
		levitate = 0;
		burrow = 3;
		lJump = 0 ;
		hJump = 0;
		power = 4;
		natureWalk = new String[]{"Desert"};
		underdog = false;
		other = new String[]{"Amorphous","Amorphous","Darkvision","Dead Silent","Groundshaper"};
		athl = 4;
		acro = 1;
		combat = 4;
		stealth = 4;
		percep = 4;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 14, 18, 23, 27, 32, 36, 41, 47, 54, 60};
		moves = new String[]{"Astonish", "Sand Attack", "Sand Tomb", "Mega Drain", "Bulldoze", "Hypnosis", "Iron Defense", "Giga Drain", "Shadow Ball", "Earth Power", "Shore Up", "Sandstorm"};
		TMs = new String[]{"Toxic", "Hidden Power", "Protect", "Frustration", "Earthquake", "Return", "Psychic", "Shadow Ball", "Double Team", "Sludge", "Sludge Bomb", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Fling", "Quash", "Embargo", "Giga Impact", "Rock Polish", "Stone Edge", "Bulldoze", "Rock Slide", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"After You", "Block", "Earth Power", "Giga Drain", "Gravity", "Iron Defense", "Pain Split", "Recycle", "Role Play", "Skill Swap", "Snore", "Spite", "Stealth Rock", "Trick"};
		naturalMoves = new String[]{};
	}
		Palossand(){

		super();
		}
}