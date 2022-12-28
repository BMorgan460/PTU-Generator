public class Armaldo extends Pokemon{
	{
		name = "Armaldo";
		bHP = 8;
		bAtk = 13;
		bDef = 10;
		bSpAtk = 7;
		bSpDef = 8;
		bSpd = 5;
		type1 = "Rock";
		type2 = "Bug";
		abilities = new String[]{"Battle Armor", "Sturdy", "Swift Swim", "Overcoat", "Rough Skin"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Anorith();
		prevReq = 40;
		height = "4\'/11\"";
		weight = 150.4;
		WC = 4;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Water";
		egg2 = "Diet";
		overland = 6;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 6;
		natureWalk = new String[]{"Cave", "Ocean"};
		underdog = false;
		other = new String[]{"Gilled"};
		athl = 3;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 2;
		focus = 4;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{4, 7, 10, 13, 17, 21, 25, 29, 34, 39, 46, 53, 61};
		moves = new String[]{"Mud Sport", "Water Gun", "Fury Cutter", "Smack Down", "Metal Claw", "Ancient Power", "Bug Bite", "Brine", "Slash", "Crush Claw", "XScissor", "Protect", "Rock Blast"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Frustration", "Smack Down", "Earthquake", "Return", "Brick Break", "Double Team", "Sandstorm", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "False Swipe", "Brutal Swing", "Giga Impact", "Rock Polish", "Stone Edge", "Swords Dance", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Aqua Tail", "Block", "Body Slam", "Slam", "Brine", "Bug Bite", "Bite", "Earth Power", "Fury Cutter", "Iron Defense", "Iron Tail", "Knock Off", "Liquidation", "Low Kick", "Seismic Toss", "Snore", "Stealth Rock", "Stomping Tantrum", "String Shot", "Superpower", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Armaldo(){

		super();
		}
}