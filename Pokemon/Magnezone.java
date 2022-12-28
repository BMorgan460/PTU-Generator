public class Magnezone extends Pokemon{
	{
		name = "Magnezone";
		bHP = 7;
		bAtk = 7;
		bDef = 12;
		bSpAtk = 13;
		bSpDef = 9;
		bSpd = 6;
		type1 = "Electric";
		type2 = "Steel";
		abilities = new String[]{"Magnet Pull", "Sturdy", "Analytic", "Soundproof", "Targeting System"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Magneton();
		prevReq = 40;
		height = "3\'/11\"";
		weight = 396.8;
		WC = 5;
		maleRatio = -1;
		femaleRatio = -1;
		egg1 = "Mineral";
		egg2 = "Ergovore";
		habitats = new String[]{"Mountain"};
		overland = 3;
		swim = 5;
		levitate = 6;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 6;
		underdog = false;
		other = new String[]{"Dead Silent","Magnetic","Mountable 1","Zapper"};
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
		tutorMoves = new String[]{"Ally Switch", "Electric Terrain", "Electroweb", "Gravity", "Iron Defense", "Iron Head", "Magic Coat", "Magnet Rise", "Magnetic Flux", "Mirror Coat", "Recycle", "Role Play", "Rollout", "Shock Wave", "Signal Beam", "Snore", "Swift", "Zap Cannon"};
		naturalMoves = new String[]{"Barrier", "Electric Terrain", "Magnetic Flux", "Mirror Coat", "Zap Cannon"};
	}
		Magnezone(){

		super();
		}
}