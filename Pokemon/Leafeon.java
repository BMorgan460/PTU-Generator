public class Leafeon extends Pokemon{
	{
		name = "Leafeon";
		bHP = 7;
		bAtk = 11;
		bDef = 13;
		bSpAtk = 6;
		bSpDef = 7;
		bSpd = 10;
		type1 = "Grass";
		type2 = "";
		abilities = new String[]{"Leaf Guard", "Grass Pelt", "Type Aura", "Chlorophyll", "Life Force"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Eevee();
		prevReq = 20;
		height = "3\'/3\"";
		weight = 56.2;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest", "Grassland", "Rainforest"};
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{"Tracker"};
		athl = 4;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 4;
		focus = 3;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 17, 20, 25, 29, 33, 37, 41, 45};
		moves = new String[]{"Sand Attack", "BabyDoll", "Quick Attack", "Grass Whistle", "Magical Leaf", "Giga Drain", "Swords Dance", "Synthesis", "Sunny Day", "Last Resort", "Leaf Blade"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Solar Beam", "Return", "Shadow Ball", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Energy Ball", "Giga Impact", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Bullet Seed", "Covet", "Fury Cutter", "Giga Drain", "Heal Bell", "Helping Hand", "Hyper Voice", "Iron Tail", "Knock Off", "Laser Focus", "Last Resort", "Seed Bomb", "Snore", "Swift", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{"Helping Hand"};
	}
		Leafeon(){

		super();
		}
}