public class Lampent extends Pokemon{
	{
		name = "Lampent";
		bHP = 6;
		bAtk = 4;
		bDef = 6;
		bSpAtk = 10;
		bSpDef = 6;
		bSpd = 6;
		type1 = "Ghost";
		type2 = "Fire";
		abilities = new String[]{"Flash Fire", "Flame Body", "Illuminate", "Soulstealer", "Infiltrator"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Litwick();
		prevReq = 20;
		next = new String[]{"Chandelure"};
		nextReq = new String[]{"35"};
		height = "2\'/0\"";
		size = "Small";
		weight = 28.7;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Indeterminate";
		egg2 = "Nullivore";
		overland = 1;
		swim = 3;
		levitate = 6;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		underdog = true;
		other = new String[]{"Darkvision","Dead Silent","Firestarter","Glow","Heater","Invisibility","Invisibility","Phasing","Shrinkable"};
		athl = 1;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{3, 5, 7, 10, 13, 16, 20, 24, 28, 33, 38, 45, 53, 61, 69};
		moves = new String[]{"Minimize", "Smog", "Fire Spin", "Confuse Ray", "Night Shade", "WillOWisp", "Flame Burst", "Imprison", "Hex", "Memento", "Inferno", "Curse", "Shadow Ball", "Pain Split", "Overheat"};
		TMs = new String[]{"Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Psychic", "Shadow Ball", "Double Team", "Flamethrower", "Fire Blast", "Facade", "Flame Charge", "Rest", "Attract", "Thief", "Round", "Overheat", "Energy Ball", "Embargo", "Payback", "Psych Up", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Heat Wave", "Pain Split", "Shock Wave", "Snore", "Spite", "Telekinesis", "Trick"};
		naturalMoves = new String[]{};
	}
		Lampent(){

		super();
		}
}