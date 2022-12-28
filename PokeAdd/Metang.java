public class Metang extends Pokemon{
	{
		name = "Metang";
		bHP = 6;
		bAtk = 8;
		bDef = 10;
		bSpAtk = 6;
		bSpDef = 8;
		bSpd = 5;
		type1 = "Steel";
		type2 = "Psychic";
		abilities = new String[]{"Clear Body", "Light Metal", "Keen Eye", "Perception", "Cluster Mind"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Beldum();
		prevReq = 20;
		next = new String[]{"Metagross"};
		nextReq = new String[]{"45"};
		height = "3\'/11\"";
		weight = 446.4;
		WC = 6;
		maleRatio = -1;
		femaleRatio = -1;
		egg1 = "Mineral";
		egg2 = "Omnivore";
		habitats = new String[]{"Cave"};
		overland = 4;
		swim = 2;
		levitate = 5;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 9;
		underdog = true;
		other = new String[]{"Magnetic","Mountable 1"};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 4;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 3;
		movesLevels = new int[]{23, 26, 29, 32, 35, 38, 41, 44, 47, 50};
		moves = new String[]{"Pursuit", "Bullet Punch", "Miracle Eye", "Zen Headbutt", "Scary Face", "Psychic", "Agility", "Meteor Mash", "Iron Defense", "Hyper Beam"};
		TMs = new String[]{"Psyshock", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Psychic", "Shadow Ball", "Brick Break", "Double Team", "Reflect", "Sludge", "Sludge Bomb", "Sandstorm", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Round", "Explosion", "Rock Polish", "Gyro Ball", "Psych Up", "Bulldoze", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Body Slam", "Slam", "Defense Curl", "Dynamic Punch", "Fury Cutter", "Gravity", "Ice Punch", "Icy Wind", "Iron Defense", "Iron Head", "Magnet Rise", "Rollout", "Signal Beam", "Snore", "Stealth Rock", "Swift", "Telekinesis", "Thunder Punch", "Trick", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{"Magnet Rise"};
	}
		Metang(){

		super();
		}
}