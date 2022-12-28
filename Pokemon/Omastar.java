public class Omastar extends Pokemon{
	{
		name = "Omastar";
		bHP = 7;
		bAtk = 6;
		bDef = 13;
		bSpAtk = 12;
		bSpDef = 7;
		bSpd = 6;
		type1 = "Rock";
		type2 = "Water";
		abilities = new String[]{"Shell Armor", "Weak Armor", "Rough Skin", "Swift Swim", "Skill Link"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Omanyte();
		prevReq = 40;
		height = "3\'/3\"";
		weight = 77.2;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Water";
		egg2 = " ";
		overland = 4;
		swim = 7;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Gilled"};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{7, 10, 16, 19, 25, 28, 34, 37, 48, 56, 67, 75};
		moves = new String[]{"Bite", "Water Gun", "Rollout", "Leer", "Mud Shot", "Brine", "Protect", "Ancient Power", "Tickle", "Rock Blast", "Shell Smash", "Hydro Pump"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Return", "Double Team", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Thief", "Round", "Scald", "Giga Impact", "Rock Polish", "Stone Edge", "Gyro Ball", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Bind", "Body Slam", "Slam", "Brine", "Dive", "Earth Power", "Hydro Pump", "Icy Wind", "Iron Defense", "Knock Off", "Rollout", "Seismic Toss", "Snore", "Stealth Rock", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{"Hydro Pump"};
	}
		Omastar(){

		super();
		}
}