public class Combusken extends Pokemon{
	{
		name = "Combusken";
		bHP = 6;
		bAtk = 9;
		bDef = 6;
		bSpAtk = 9;
		bSpDef = 6;
		bSpd = 6;
		type1 = "Fire";
		type2 = "Fighting";
		abilities = new String[]{"Blaze", "Klutz", "Speed Boost", "Tangled Feet", "Moxie"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Torchic();
		prevReq = 15;
		next = new String[]{"Blaziken"};
		nextReq = new String[]{"30"};
		height = "2\'/11\"";
		size = "Small";
		weight = 43;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Omnivore";
		habitats = new String[]{"Grassland"};
		overland = 8;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Grassland"};
		underdog = true;
		other = new String[]{"Firestarter","Heater"};
		athl = 3;
		acro = 4;
		combat = 3;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 3;
		acroBonus = 3;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 10, 14, 20, 25, 31, 36, 42, 47, 53, 58};
		moves = new String[]{"Ember", "Sand Attack", "Peck", "Flame Charge", "Quick Attack", "Bulk Up", "Focus Energy", "Slash", "Mirror Move", "Sky Uppercut", "Flare Blitz"};
		TMs = new String[]{"Work Up", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Protect", "Frustration", "Return", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Aerial Ace", "Facade", "Flame Charge", "Rest", "Attract", "Low Sweep", "Round", "Echoed Voice", "Overheat", "Focus Blast", "Fling", "Shadow Claw", "Swords Dance", "Rock Slide", "Poison Jab", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Bounce", "Counter", "Defog", "Dual Chop", "Dynamic Punch", "Fire Pledge", "Fire Punch", "Focus Punch", "Heat Wave", "Helping Hand", "Last Resort", "Low Kick", "Mega Kick", "Mega Punch", "Seismic Toss", "Snore", "Swift", "Thunder Punch", "Vacuum Wave"};
		naturalMoves = new String[]{};
	}
		Combusken(){

		super();
		}
}