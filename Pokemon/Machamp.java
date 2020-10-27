public class Machamp extends Pokemon{
	{
		name = "Machamp";
		bHP = 9;
		bAtk = 13;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 9;
		bSpd = 6;
		type1 = "Fighting";
		type2 = "";
		abilities = new String[]{"Guts", "Steadfast", "Bodyguard", "Discipline", "No Guard"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Machoke();
		prevReq = 40;
		height = "5\'/3\"";
		weight = 286.6;
		WC = 5;
		maleRatio = 75.0;
		femaleRatio = 25.0;
		egg1 = "Humanshape";
		egg2 = "Omnivore";
		habitats = new String[]{"Mountain"};
		overland = 8;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 2;
		power = 10;
		natureWalk = new String[]{"Cave", "Mountain"};
		underdog = false;
		other = new String[]{};
		athl = 6;
		acro = 2;
		combat = 6;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 7, 9, 13, 15, 19, 21, 25, 27, 33, 37, 43, 47, 53, 57};
		moves = new String[]{"Focus Energy", "Karate Chop", "Foresight", "Low Sweep", "Seismic Toss", "Revenge", "Knock Off", "Vital Throw", "WakeUp", "Dual Chop", "Submission", "Bulk Up", "Cross Chop", "Scary Face", "Dynamic Punch"};
		TMs = new String[]{"Strength", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Smack Down", "Earthquake", "Return", "Dig", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Facade", "Rest", "Attract", "Thief", "Low Sweep", "Round", "Focus Blast", "Fling", "Incinerate", "Payback", "Retaliate", "Giga Impact", "Stone Edge", "Bulldoze", "Rock Slide", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Dual Chop", "Fire Punch", "Focus Punch", "Helping Hand", "Ice Punch", "Knock Off", "Magic Coat", "Mega Kick", "Mega Punch", "Metronome", "Role Play", "Sleep Talk", "Snore", "Superpower", "Thunder Punch", "Vacuum Wave", "Work Up"};
		naturalMoves = new String[]{};
	}
		Machamp(){

		super();
		}
}