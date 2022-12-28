public class Dartrix extends Pokemon{
	{
		name = "Dartrix";
		bHP = 8;
		bAtk = 8;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 7;
		bSpd = 5;
		type1 = "Grass";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Overgrow", "Long Reach", "Perception", "Sniper"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Rowlet();
		prevReq = 15;
		next = new String[]{"Decidueye"};
		nextReq = new String[]{"30"};
		height = "2\'/4\"";
		size = "Small";
		weight = 35.3;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Flying";
		egg2 = "Carnivore";
		habitats = new String[]{"Forest"};
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 2;
		underdog = true;
		other = new String[]{"Darkvision","Stealth"};
		athl = 2;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 4;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{4, 8, 11, 14, 16, 19, 24, 28, 33, 37, 42, 46, 51, 55};
		moves = new String[]{"Growl", "Peck", "Astonish", "Razor Leaf", "Ominous Wind", "Foresight", "Pluck", "Synthesis", "Fury Attack", "Sucker Punch", "Leaf Blade", "Feather Dance", "Brave Bird", "Nasty Plot"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Roost", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Steel Wing", "Energy Ball", "False Swipe", "Shadow Claw", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Covet", "Defog", "Giga Drain", "Grass Pledge", "Seed Bomb", "Sky Attack", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Dartrix(){

		super();
		}
}