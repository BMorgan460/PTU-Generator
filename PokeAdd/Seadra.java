public class Seadra extends Pokemon{
	{
		name = "Seadra";
		bHP = 6;
		bAtk = 7;
		bDef = 10;
		bSpAtk = 10;
		bSpDef = 5;
		bSpd = 9;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Sniper", "Damp", "Poison Point", "Multiscale", "Spray Down"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Horsea();
		prevReq = 25;
		next = new String[]{"Kingdra"};
		nextReq = new String[]{"40"};
		height = "3\'/11\"";
		weight = 55.1;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		habitats = new String[]{"Ocean"};
		overland = 3;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Fountain","Gilled"};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 17, 21, 26, 31, 36, 45, 52, 60};
		moves = new String[]{"Smokescreen", "Leer", "Water Gun", "Twister", "Bubble Beam", "Focus Energy", "Brine", "Agility", "Dragon Pulse", "Dragon Dance", "Hydro Pump"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Scald", "Giga Impact", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Bounce", "Dive", "Dragon Pulse", "Hydro Pump", "Icy Wind", "Laser Focus", "Outrage", "Signal Beam", "Snore", "Swift", "Twister", "Water Pulse"};
		naturalMoves = new String[]{"Hydro Pump"};
	}
		Seadra(){

		super();
		}
}