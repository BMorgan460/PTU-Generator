public class Eelektrik extends Pokemon{
	{
		name = "Eelektrik";
		bHP = 7;
		bAtk = 9;
		bDef = 7;
		bSpAtk = 8;
		bSpDef = 7;
		bSpd = 4;
		type1 = "Electric";
		type2 = "";
		abilities = new String[]{"Levitate", "Electrodash", "Sequence", "Storm Drain", "Lightning Rod"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Tynamo();
		prevReq = 15;
		next = new String[]{"Eelektross"};
		nextReq = new String[]{"40"};
		height = "3\'/11\"";
		weight = 48.5;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Ergovore";
		overland = 4;
		swim = 5;
		levitate = 4;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		underdog = true;
		other = new String[]{"Gilled","Glow","Zapper"};
		athl = 3;
		acro = 2;
		combat = 2;
		stealth = 4;
		percep = 3;
		focus = 2;
		athlBonus = 1;
		acroBonus = 2;
		combatBonus = 3;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{9, 19, 29, 44, 49, 54, 59, 64, 69, 74};
		moves = new String[]{"Bind", "Acid", "Discharge", "Thunderbolt", "Acid Spray", "Coil", "Wild Charge", "Gastro Acid", "Zap Cannon", "Thrash"};
		TMs = new String[]{"Toxic", "Hidden Power", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Charge", "Charge Beam", "Acrobatics", "Volt Switch", "Thunder", "Thunder Wave", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Bind", "Bounce", "Charge Beam", "Gastro Acid", "Acid", "Giga Drain", "Iron Tail", "Knock Off", "Magnet Rise", "Shock Wave", "Signal Beam", "Snore", "Super Fang", "Throat Chop", "Thunder Wave"};
		naturalMoves = new String[]{"Charge Beam", "Headbutt", "Snore", "Spark", "Thunder Wave"};
	}
		Eelektrik(){

		super();
		}
}