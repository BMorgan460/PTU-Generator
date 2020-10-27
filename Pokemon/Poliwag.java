public class Poliwag extends Pokemon{
	{
		name = "Poliwag";
		bHP = 4;
		bAtk = 5;
		bDef = 4;
		bSpAtk = 4;
		bSpDef = 4;
		bSpd = 9;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Damp", "Water Absorb", "Swift Swim", "Gulp", "Hypnotic"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Poliwhirl", "Poliwrath"};
		nextReq = new String[]{"Stone"};
		height = "2\'/0\"";
		size = "Small";
		weight = 27.3;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Average";
		overland = 3;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Wetlands"};
		underdog = true;
		other = new String[]{"Fountain","Gilled"};
		athl = 2;
		acro = 2;
		combat = 1;
		stealth = 2;
		percep = 2;
		focus = 2;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{1, 5, 8, 11, 15, 18, 21, 25, 28, 31, 35, 38, 41};
		moves = new String[]{"Water Sport", "Bubble", "Hypnosis", "Water Gun", "Double Slap", "Rain Dance", "Body Slam", "Bubble Beam", "Mud Shot", "Belly Drum", "WakeUp", "Hydro Pump", "Mud Bomb"};
		TMs = new String[]{"Surf", "Waterfall", "Dive", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Return", "Dig", "Psychic", "Double Team", "Facade", "Rest", "Attract", "Thief", "Round", "Scald", "Swagger", "Sleep Talk", "Substitute"};
		eggMoves = new String[]{"Bubble Beam", "Encore", "Endeavor", "Endure", "Haze", "Ice Ball", "Mind Reader", "Mist", "Mud Shot", "Refresh", "Splash", "Water Pulse", "Water Sport"};
		tutorMoves = new String[]{"Dive", "Defense Curl", "Endeavor", "Helping Hand", "Icy Wind", "Sleep Talk", "Snore", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Poliwag(){

		super();
		}
}