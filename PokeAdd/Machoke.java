public class Machoke extends Pokemon{
	{
		name = "Machoke";
		bHP = 8;
		bAtk = 10;
		bDef = 7;
		bSpAtk = 5;
		bSpDef = 6;
		bSpd = 5;
		type1 = "Fighting";
		type2 = "";
		abilities = new String[]{"Guts", "Steadfast", "Bodyguard", "Discipline", "No Guard"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Machop();
		prevReq = 20;
		next = new String[]{"Machamp"};
		nextReq = new String[]{"35"};
		height = "4\'/11\"";
		weight = 155.4;
		WC = 4;
		maleRatio = 75.0;
		femaleRatio = 25.0;
		egg1 = "Humanshape";
		egg2 = "Omnivore";
		overland = 6;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 8;
		natureWalk = new String[]{"Cave", "Mountain"};
		underdog = true;
		other = new String[]{};
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{3, 7, 9, 13, 15, 19, 21, 25, 27, 33, 37, 43, 47, 53, 57};
		moves = new String[]{"Focus Energy", "Karate Chop", "Foresight", "Low Sweep", "Seismic Toss", "Revenge", "Knock Off", "Vital Throw", "WakeUp", "Dual Chop", "Submission", "Bulk Up", "Cross Chop", "Scary Face", "Dynamic Punch"};
		TMs = new String[]{"Work Up", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Rain Dance", "Frustration", "Smack Down", "Earthquake", "Return", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Facade", "Rest", "Attract", "Thief", "Low Sweep", "Round", "Focus Blast", "Fling", "Payback", "Bulldoze", "Rock Slide", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Dual Chop", "Fire Punch", "Focus Punch", "Helping Hand", "Ice Punch", "Knock Off", "Low Kick", "Mega Kick", "Mega Punch", "Metronome", "Role Play", "Snore", "Stomping Tantrum", "Superpower", "Thunder Punch", "Vacuum Wave"};
		naturalMoves = new String[]{};
	}
		Machoke(){

		super();
		}
}