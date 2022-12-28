public class Tentacruel extends Pokemon{
	{
		name = "Tentacruel";
		bHP = 8;
		bAtk = 7;
		bDef = 7;
		bSpAtk = 8;
		bSpDef = 12;
		bSpd = 10;
		type1 = "Water";
		type2 = "Poison";
		abilities = new String[]{"Clear Body", "Rain Dish", "Liquid Ooze", "Poison Touch", "Illuminate"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Tentacool();
		prevReq = 25;
		height = "5\'/3\"";
		weight = 121.3;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		habitats = new String[]{"Ocean"};
		overland = 3;
		swim = 7;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 6;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Fountain","Gilled","Reach"};
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 22, 25, 28, 32, 36, 40, 44, 48, 52, 56};
		moves = new String[]{"Supersonic", "Constrict", "Acid", "Toxic Spikes", "Water Pulse", "Wrap", "Acid Spray", "Bubble Beam", "Barrier", "Poison Jab", "Brine", "Screech", "Hex", "Sludge Wave", "Hydro Pump", "Wring Out"};
		TMs = new String[]{"Toxic", "Hail", "Venoshock", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Safeguard", "Frustration", "Return", "Double Team", "Sludge", "Sludge Wave", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Thief", "Round", "Scald", "Payback", "Giga Impact", "Swords Dance", "Infestation", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Bind", "Brine", "Dive", "Giga Drain", "Icy Wind", "Knock Off", "Magic Coat", "Reflect Type", "Role Play", "Snore", "Water Pulse", "Wring Out"};
		naturalMoves = new String[]{"Reflect Type", "Wring Out"};
	}
		Tentacruel(){

		super();
		}
}