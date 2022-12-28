public class Kirlia extends Pokemon{
	{
		name = "Kirlia";
		bHP = 4;
		bAtk = 4;
		bDef = 4;
		bSpAtk = 7;
		bSpDef = 6;
		bSpd = 5;
		type1 = "Psychic";
		type2 = "Fairy";
		abilities = new String[]{"Synchronize", "Steadfast", "Telepathy", "Forewarn", "Trace"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Ralts();
		prevReq = 20;
		next = new String[]{"Gardevoir"};
		nextReq = new String[]{"30"};
		height = "2\'/7\"";
		size = "Small";
		weight = 44.5;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Omnivore";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Forest", "Urban"};
		underdog = true;
		other = new String[]{"Telekinetic","Telepath"};
		athl = 2;
		acro = 2;
		combat = 2;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 6, 9, 11, 14, 17, 19, 23, 26, 30, 33, 37, 40, 44, 47, 51};
		moves = new String[]{"Confusion", "Double Team", "Teleport", "Disarming Voice", "Lucky Chant", "Magical Leaf", "Heal Pulse", "Draining Kiss", "Calm Mind", "Psychic", "Imprison", "Future Sight", "Charm", "Hypnosis", "Dream Eater", "Stored Power"};
		TMs = new String[]{"Psyshock", "Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Thunderbolt", "Return", "Psychic", "Shadow Ball", "Double Team", "Reflect", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Fling", "Charge", "Charge Beam", "Thunder", "Thunder Wave", "Psych Up", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Body Slam", "Slam", "Defense Curl", "Fire Punch", "Helping Hand", "Hyper Voice", "Ice Punch", "Icy Wind", "Magic Coat", "Magic Room", "Pain Split", "Recycle", "Role Play", "Shock Wave", "Signal Beam", "Skill Swap", "Snatch", "Snore", "Swift", "Telekinesis", "Thunder Punch", "Trick", "Wonder Room", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Kirlia(){

		super();
		}
}