public class Breloom extends Pokemon{
	{
		name = "Breloom";
		bHP = 6;
		bAtk = 13;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 6;
		bSpd = 7;
		type1 = "Grass";
		type2 = "Fighting";
		abilities = new String[]{"Effect Spore", "Quick Feet", "Technician", "Natural Cure", "Poison Heal"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Shroomish();
		prevReq = 20;
		height = "3\'/11\"";
		weight = 86.4;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Fairy";
		egg2 = "Plant";
		habitats = new String[]{"Forest", "Marsh", "Rainforest"};
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 6;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{"Mushroom Harvest"};
		athl = 4;
		acro = 3;
		combat = 4;
		stealth = 4;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 8, 12, 15, 19, 22, 28, 33, 39, 44, 50};
		moves = new String[]{"Stun Spore", "Leech Seed", "Mega Drain", "Headbutt", "Feint", "Counter", "Force Palm", "Mind Reader", "Sky Uppercut", "Seed Bomb", "Dynamic Punch"};
		TMs = new String[]{"Work Up", "Toxic", "Bulk Up", "Venoshock", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Brick Break", "Double Team", "Sludge", "Sludge Bomb", "Rock Tomb", "Facade", "Rest", "Attract", "Low Sweep", "Round", "Focus Blast", "Energy Ball", "False Swipe", "Fling", "Giga Impact", "Stone Edge", "Swords Dance", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Bullet Seed", "Drain Punch", "Dynamic Punch", "Focus Punch", "Giga Drain", "Helping Hand", "Iron Tail", "Laser Focus", "Seed Bomb", "Snatch", "Snore", "Superpower", "Synthesis", "Thunder Punch", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Breloom(){

		super();
		}
}