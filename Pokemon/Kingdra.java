public class Kingdra extends Pokemon{
	{
		name = "Kingdra";
		bHP = 8;
		bAtk = 10;
		bDef = 10;
		bSpAtk = 10;
		bSpDef = 10;
		bSpd = 9;
		type1 = "Water";
		type2 = "Dragon";
		abilities = new String[]{"Sniper", "Damp", "Poison Point", "Multiscale", "Spray Down"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Seadra();
		prevReq = 40;
		height = "5\'/11\"";
		weight = 335.1;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		habitats = new String[]{"Ocean"};
		overland = 3;
		swim = 8;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 6;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Fountain","Gilled","Mountable 1"};
		athl = 5;
		acro = 3;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 17, 21, 26, 31, 38, 45, 52, 60};
		moves = new String[]{"Smokescreen", "Leer", "Water Gun", "Twister", "Bubble Beam", "Focus Energy", "Brine", "Agility", "Dragon Pulse", "Dragon Dance", "Hydro Pump"};
		TMs = new String[]{"Surf", "Waterfall", "Dive", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Scald", "Quash", "Giga Impact", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon"};
		tutorMoves = new String[]{"Bounce", "Dive", "Draco Meteor", "Dragon Pulse", "Icy Wind", "Outrage", "Signal Beam", "Sleep Talk", "Snore", "Swift", "Twister", "Water Pulse"};
		naturalMoves = new String[]{"Dragon Pulse"};
	}
		Kingdra(){

		super();
		}
}