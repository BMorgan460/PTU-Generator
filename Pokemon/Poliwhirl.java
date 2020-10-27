public class Poliwhirl extends Pokemon{
	{
		name = "Poliwhirl";
		bHP = 7;
		bAtk = 7;
		bDef = 7;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 9;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Damp", "Water Absorb", "Swift Swim", "Run Away", "Hypnotic"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Poliwag();
		prevReq = 25;
		next = new String[]{"Poliwrath"};
		nextReq = new String[]{"Stone"};
		height = "3\'/3\"";
		weight = 44.1;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		overland = 4;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Wetlands"};
		underdog = true;
		other = new String[]{"Fountain","Gilled"};
		athl = 3;
		acro = 3;
		combat = 3;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{5, 8, 11, 15, 18, 21, 27, 32, 37, 43, 48, 53};
		moves = new String[]{"Bubble", "Hypnosis", "Water Gun", "Double Slap", "Rain Dance", "Body Slam", "Bubble Beam", "Mud Shot", "Belly Drum", "WakeUp", "Hydro Pump", "Mud Bomb"};
		TMs = new String[]{"Surf", "Strength", "Waterfall", "Dive", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Dig", "Psychic", "Brick Break", "Double Team", "Facade", "Rest", "Attract", "Thief", "Round", "Scald", "Fling", "Bulldoze", "Swagger", "Sleep Talk", "Substitute", "Rock Smash", "Confide"};
		tutorMoves = new String[]{"Counter", "Dive", "Defense Curl", "Endeavor", "Focus Punch", "Helping Hand", "Ice Punch", "Icy Wind", "Mega Kick", "Mega Punch", "Metronome", "Seismic Toss", "Sleep Talk", "Snore", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Poliwhirl(){

		super();
		}
}