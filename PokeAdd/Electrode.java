public class Electrode extends Pokemon{
	{
		name = "Electrode";
		bHP = 6;
		bAtk = 5;
		bDef = 7;
		bSpAtk = 8;
		bSpDef = 8;
		bSpd = 15;
		type1 = "Electric";
		type2 = "";
		abilities = new String[]{"Static", "Soundproof", "Speed Boost", "Plus", "Aftermath"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Voltorb();
		prevReq = 30;
		height = "3\'/11\"";
		weight = 146.8;
		WC = 6;
		maleRatio = -1;
		femaleRatio = -1;
		egg1 = "Mineral";
		egg2 = "Ergovore";
		habitats = new String[]{"Urban"};
		overland = 8;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		underdog = false;
		other = new String[]{"Shrinkable","Volatile Bomb","Zapper"};
		athl = 4;
		acro = 3;
		combat = 1;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{4, 6, 9, 11, 13, 16, 20, 22, 26, 29, 36, 41, 47, 54, 58};
		moves = new String[]{"Sonic Boom", "Eerie Impulse", "Spark", "Rollout", "Screech", "Charge Beam", "Swift", "Electro Ball", "SelfDestruct", "Light Screen", "Magnet Rise", "Discharge", "Explosion", "Gyro Ball", "Mirror Coat"};
		TMs = new String[]{"Toxic", "Hidden Power", "Taunt", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Torment", "Facade", "Rest", "Thief", "Round", "Charge", "Charge Beam", "Explosion", "Giga Impact", "Volt Switch", "Thunder", "Thunder Wave", "Gyro Ball", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Foul Play", "Magic Coat", "Magnet Rise", "Magnetic Flux", "Role Play", "Rollout", "Shock Wave", "Signal Beam", "Snore", "Sucker Punch", "Swift", "Telekinesis"};
		naturalMoves = new String[]{"Magnetic Flux"};
	}
		Electrode(){

		super();
		}
}