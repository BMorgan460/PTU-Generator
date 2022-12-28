public class Magnemite extends Pokemon{
	{
		name = "Magnemite";
		bHP = 3;
		bAtk = 4;
		bDef = 7;
		bSpAtk = 10;
		bSpDef = 6;
		bSpd = 5;
		type1 = "Electric";
		type2 = "Steel";
		abilities = new String[]{"Magnet Pull", "Sturdy", "Analytic", "Soundproof", "Targeting System"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Magneton", "Magnezone"};
		nextReq = new String[]{"40"};
		height = "1\'/0\"";
		size = "Small";
		weight = 13.2;
		WC = 1;
		maleRatio = -1;
		femaleRatio = -1;
		egg1 = "Mineral";
		egg2 = "";
		overland = 2;
		swim = 3;
		levitate = 4;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		underdog = true;
		other = new String[]{"Dead Silent","Magnetic","Zapper"};
		athl = 2;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 2;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 1;
		movesLevels = new int[]{1, 1, 5, 7, 11, 13, 17, 19, 23, 25, 29, 31, 35, 37, 41, 43, 47, 49};
		moves = new String[]{"Tackle", "Supersonic", "Thunder Shock", "Thunder Wave", "Magnet Bomb", "Light Screen", "Sonic Boom", "Spark", "Mirror Shot", "Metal Sound", "Electro Ball", "Flash Cannon", "Screech", "Discharge", "LockOn", "Magnet Rise", "Gyro Ball", "Zap Cannon"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Reflect", "Facade", "Rest", "Round", "Charge", "Charge Beam", "Explosion", "Volt Switch", "Thunder", "Thunder Wave", "Gyro Ball", "Psych Up", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Electroweb", "Gravity", "Iron Defense", "Magic Coat", "Magnet Rise", "Recycle", "Role Play", "Rollout", "Shock Wave", "Signal Beam", "Snore", "Swift"};
		naturalMoves = new String[]{};
	}
		Magnemite(){

		super();
		}
}