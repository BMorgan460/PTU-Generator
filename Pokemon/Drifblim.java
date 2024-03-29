public class Drifblim extends Pokemon{
	{
		name = "Drifblim";
		bHP = 15;
		bAtk = 8;
		bDef = 4;
		bSpAtk = 9;
		bSpDef = 5;
		bSpd = 8;
		type1 = "Ghost";
		type2 = "Flying";
		abilities = new String[]{"Unburden", "Aftermath", "Absorb Force", "Flare Boost", "Decoy"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Drifloon();
		prevReq = 25;
		height = "3\'/11\"";
		weight = 33.1;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Nullivore";
		overland = 1;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 5;
		underdog = false;
		other = new String[]{"Darkvision","Dead Silent","Inflatable","Shrinkable"};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{4, 8, 13, 16, 20, 25, 27, 34, 34, 40, 46, 52, 60, 65};
		moves = new String[]{"Astonish", "Gust", "Focus Energy", "Payback", "Ominous Wind", "Stockpile", "Hex", "Spit Up", "Swallow", "Shadow Ball", "Amnesia", "Baton Pass", "Explosion", "Phantom Force"};
		TMs = new String[]{"Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Psychic", "Shadow Ball", "Double Team", "Facade", "Rest", "Attract", "Thief", "Round", "Charge", "Charge Beam", "Acrobatics", "Embargo", "Explosion", "Payback", "Giga Impact", "Thunder", "Thunder Wave", "Gyro Ball", "Fly", "Psych Up", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Ally Switch", "Bind", "Defog", "Icy Wind", "Knock Off", "Magic Coat", "Ominous Wind", "Pain Split", "Phantom Force", "Recycle", "Role Play", "Rollout", "Shock Wave", "Silver Wind", "Skill Swap", "Snore", "Spite", "Sucker Punch", "Swift", "Tailwind", "Telekinesis", "Trick"};
		naturalMoves = new String[]{"Phantom Force"};
	}
		Drifblim(){

		super();
		}
}