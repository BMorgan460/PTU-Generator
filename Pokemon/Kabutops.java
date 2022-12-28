public class Kabutops extends Pokemon{
	{
		name = "Kabutops";
		bHP = 6;
		bAtk = 12;
		bDef = 11;
		bSpAtk = 7;
		bSpDef = 7;
		bSpd = 8;
		type1 = "Rock";
		type2 = "Water";
		abilities = new String[]{"Battle Armor", "Sturdy", "Swift Swim", "Bully", "Weak Armor"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Kabuto();
		prevReq = 40;
		height = "4\'/3\"";
		weight = 89.3;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Water";
		egg2 = " ";
		overland = 6;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Cave", "Ocean"};
		underdog = false;
		other = new String[]{"Gilled"};
		athl = 3;
		acro = 3;
		combat = 4;
		stealth = 4;
		percep = 2;
		focus = 4;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{6, 11, 16, 21, 26, 31, 36, 45, 54, 63, 72};
		moves = new String[]{"Absorb", "Leer", "Mud Shot", "Sand Attack", "Endure", "Aqua Jet", "Mega Drain", "Metal Sound", "Ancient Power", "Wring Out", "Night Slash"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Return", "Brick Break", "Double Team", "Sandstorm", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Scald", "Giga Impact", "Rock Polish", "Stone Edge", "Swords Dance", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Surf", "Nature Power", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Aqua Tail", "Body Slam", "Slam", "Brine", "Dive", "Earth Power", "Fury Cutter", "Giga Drain", "Icy Wind", "Iron Defense", "Knock Off", "Liquidation", "Low Kick", "Mega Kick", "Night Slash", "Rollout", "Snore", "Stealth Rock", "Superpower", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{"Feint", "Night Slash", "Slash"};
	}
		Kabutops(){

		super();
		}
}