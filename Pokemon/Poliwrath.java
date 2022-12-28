public class Poliwrath extends Pokemon{
	{
		name = "Poliwrath";
		bHP = 9;
		bAtk = 10;
		bDef = 10;
		bSpAtk = 7;
		bSpDef = 9;
		bSpd = 7;
		type1 = "Water";
		type2 = "Fighting";
		abilities = new String[]{"Swift Swim", "Water Absorb", "Damp", "Hypnotic", "Guts"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Poliwhirl();
		prevReq = 30;
		height = "4\'/3\"";
		weight = 119;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		overland = 7;
		swim = 7;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 5;
		natureWalk = new String[]{"Wetlands"};
		underdog = false;
		other = new String[]{"Fountain","Gilled"};
		athl = 5;
		acro = 3;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 3;
		combatBonus = 1;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{5, 8, 11, 15, 18, 21, 27, 32, 37, 43, 48, 53};
		moves = new String[]{"Water Gun", "Hypnosis", "Bubble", "Double Slap", "Rain Dance", "Body Slam", "Bubble Beam", "Dynamic Punch", "Belly Drum", "Mind Reader", "Hydro Pump", "Circle Throw"};
		TMs = new String[]{"Work Up", "Toxic", "Hail", "Bulk Up", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Psychic", "Brick Break", "Double Team", "Rock Tomb", "Facade", "Rest", "Attract", "Thief", "Low Sweep", "Round", "Focus Blast", "Scald", "Fling", "Payback", "Giga Impact", "Bulldoze", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Circle Throw", "Counter", "Defense Curl", "Dive", "Dual Chop", "Dynamic Punch", "Endeavor", "Focus Punch", "Helping Hand", "Ice Punch", "Icy Wind", "Mega Kick", "Mega Punch", "Metronome", "Seismic Toss", "Snore", "Throat Chop", "Vacuum Wave", "Water Pulse"};
		naturalMoves = new String[]{"Circle Throw"};
	}
		Poliwrath(){

		super();
		}
}