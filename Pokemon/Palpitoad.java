public class Palpitoad extends Pokemon{
{
		name = "Palpitoad";
		bHP = 8;
		bAtk = 7;
		bDef = 6;
		bSpAtk = 7;
		bSpDef = 6;
		bSpd = 7;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Water Absorb", "Mud Dweller", "Swift Swim", "Hydration", "Veil"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Tympole();
		prevReq = 20;
		next = new String[]{"Seismitoad"};
		nextReq = new String[]{"35"};
		height = "2\'/07\"";
		size = "Small";
		weight = 37.5;
		WC = 2;
		maleRatio = 50;
		femaleRatio = 50;
		egg1 = "Water";
		egg2 = "1";
		habitats = new String[]{"Freshwater", "Marsh", "Capability"};
		overland = 4;
		swim = 4;
		levitate = 0;
		sky = 0;
		burrow = 0;
		lJump = 2;
		hJump = 2;
		power = 3;
		underdog = false;
		athl = 3;
		acro = 4;
		combat = 2;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 12, 16, 20, 23, 28, 33, 37, 42, 47, 51};
		moves = new String[]{"Supersonic", "Round", "Bubble Beam", "Mud Shot", "Aqua Ring", "Uproar", "Muddy Water", "Rain Dance", "Flail", "Echoed Voice", "Hydro Pump", "Hyper Voice"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Sludge Wave", "Sludge Bomb", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Scald", "Bulldoze", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Rock Smash"};
		tutorMoves = new String[]{"Bounce", "Earth Power", "Endeavor", "Gastro Acid", "Acid", "Hyper Voice", "Icy Wind", "Sleep Talk", "Snore", "Stealth Rock", "Uproar"};
		naturalMoves = new String[]{};
}
		Palpitoad(){

		super();
		}
}