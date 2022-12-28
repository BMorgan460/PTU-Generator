public class Magneton extends Pokemon{
	{
		name = "Magneton";
		bHP = 5;
		bAtk = 6;
		bDef = 10;
		bSpAtk = 12;
		bSpDef = 7;
		bSpd = 7;
		type1 = "Electric";
		type2 = "Steel";
		abilities = new String[]{"Magnet Pull", "Sturdy", "Analytic", "Soundproof", "Targeting System"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Magnemite();
		prevReq = 30;
		next = new String[]{"Magnezone"};
		nextReq = new String[]{"40"};
		height = "3\'/3\"";
		weight = 132.3;
		WC = 4;
		maleRatio = -1;
		femaleRatio = -1;
		egg1 = "Mineral";
		egg2 = "Ergovore";
		overland = 3;
		swim = 4;
		levitate = 5;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		underdog = false;
		other = new String[]{"Dead Silent","Magnetic","Zapper"};
		athl = 3;
		acro = 2;
		combat = 2;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 2;
		stealthBonus = 1;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 7, 11, 13, 17, 19, 23, 25, 29, 33, 39, 43, 49, 53, 59, 63};
		moves = new String[]{"Thunder Shock", "Thunder Wave", "Magnet Bomb", "Light Screen", "Sonic Boom", "Spark", "Mirror Shot", "Metal Sound", "Electro Ball", "Flash Cannon", "Screech", "Discharge", "LockOn", "Magnet Rise", "Gyro Ball", "Zap Cannon"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Reflect", "Facade", "Rest", "Round", "Charge", "Charge Beam", "Explosion", "Giga Impact", "Volt Switch", "Thunder", "Thunder Wave", "Gyro Ball", "Psych Up", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Electric Terrain", "Electroweb", "Gravity", "Iron Defense", "Magic Coat", "Magnet Rise", "Recycle", "Role Play", "Rollout", "Shock Wave", "Signal Beam", "Snore", "Swift", "Zap Cannon"};
		naturalMoves = new String[]{"Electric Terrain", "Zap Cannon"};
	}
		Magneton(){

		super();
		}
}