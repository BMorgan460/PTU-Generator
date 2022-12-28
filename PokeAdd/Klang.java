public class Klang extends Pokemon{
	{
		name = "Klang";
		bHP = 6;
		bAtk = 8;
		bDef = 10;
		bSpAtk = 7;
		bSpDef = 9;
		bSpd = 5;
		type1 = "Steel";
		type2 = "";
		abilities = new String[]{"Levitate", "Clear Body", "Plus", "Weird Power", "Targeting System"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Klink();
		prevReq = 35;
		next = new String[]{"Klinklang"};
		nextReq = new String[]{"45"};
		height = "2\'/0\"";
		size = "Small";
		weight = 112.4;
		WC = 4;
		maleRatio = -1;
		femaleRatio = -1;
		egg1 = "Mineral";
		egg2 = "Terravore";
		overland = 1;
		swim = 3;
		levitate = 3;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 5;
		underdog = true;
		other = new String[]{"Zapper"};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 1;
		movesLevels = new int[]{6, 11, 16, 21, 26, 31, 36, 40, 44, 48, 52, 56, 60, 64};
		moves = new String[]{"Charge", "Thunder Shock", "Gear Grind", "Bind", "Charge Beam", "Autotomize", "Mirror Shot", "Screech", "Discharge", "Metal Sound", "Shift Gear", "LockOn", "Zap Cannon", "Hyper Beam"};
		TMs = new String[]{"Toxic", "Hidden Power", "Hyper Beam", "Protect", "Frustration", "Thunderbolt", "Return", "Double Team", "Sandstorm", "Facade", "Rest", "Round", "Charge", "Charge Beam", "Rock Polish", "Volt Switch", "Thunder", "Thunder Wave", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Bind", "Gravity", "Iron Defense", "Magic Coat", "Magnet Rise", "Recycle", "Shock Wave", "Signal Beam", "Snore", "Telekinesis", "Uproar"};
		naturalMoves = new String[]{};
	}
		Klang(){

		super();
		}
}