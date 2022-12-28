public class Sharpedo extends Pokemon{
	{
		name = "Sharpedo";
		bHP = 7;
		bAtk = 12;
		bDef = 4;
		bSpAtk = 10;
		bSpDef = 4;
		bSpd = 10;
		type1 = "Water";
		type2 = "Dark";
		abilities = new String[]{"Rough Skin", "Strong Jaw", "Aqua Bullet", "Bully", "Speed Boost"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Carvanha();
		prevReq = 30;
		height = "5\'/11\"";
		weight = 195.8;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		overland = 2;
		swim = 9;
		levitate = 0;
		burrow = 0;
		lJump = 4 ;
		hJump = 4;
		power = 5;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Darkvision","Fountain","Gilled"};
		athl = 4;
		acro = 3;
		combat = 4;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 8, 11, 15, 18, 22, 25, 29, 34, 40, 45, 51, 56, 62};
		moves = new String[]{"Rage", "Focus Energy", "Aqua Jet", "Assurance", "Screech", "Swagger", "Ice Fang", "Scary Face", "Poison Fang", "Crunch", "Agility", "Skull Bash", "Taunt", "Night Slash"};
		TMs = new String[]{"Roar", "Toxic", "Hail", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Earthquake", "Return", "Double Team", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Scald", "Payback", "Bulldoze", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Surf", "Snarl", "Dark Pulse", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Avalanche", "Bounce", "Brine", "Dive", "Fury Cutter", "Icy Wind", "Liquidation", "Night Slash", "Snore", "Spite", "Super Fang", "Swift", "Uproar", "Water Pulse", "Whirlpool", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{"Feint", "Night Slash", "Slash"};
	}
		Sharpedo(){

		super();
		}
}