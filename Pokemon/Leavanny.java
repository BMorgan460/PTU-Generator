public class Leavanny extends Pokemon{
	{
		name = "Leavanny";
		bHP = 8;
		bAtk = 10;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 8;
		bSpd = 9;
		type1 = "Bug";
		type2 = "Grass";
		abilities = new String[]{"Designer", "Full Guard", "Leafy Cloak", "Swarm", "Accelerate"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Swadloon();
		prevReq = 30;
		height = "3\'/11\"";
		weight = 45.2;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest"};
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = false;
		other = new String[]{"Threaded","Wallclimber"};
		athl = 3;
		acro = 4;
		combat = 2;
		stealth = 4;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{8, 15, 22, 29, 32, 36, 39, 43, 46, 50};
		moves = new String[]{"Bug Bite", "Razor Leaf", "Struggle Bug", "Fell Stinger", "Helping Hand", "Leaf Blade", "XScissor", "Entrainment", "Swords Dance", "Leaf Storm"};
		TMs = new String[]{"Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Reflect", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Steel Wing", "Energy Ball", "False Swipe", "Shadow Claw", "Payback", "Giga Impact", "Swords Dance", "Poison Jab", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Bug Bite", "Electroweb", "False Swipe", "Giga Drain", "Heal Bell", "Helping Hand", "Iron Defense", "Knock Off", "Laser Focus", "Magic Coat", "Seed Bomb", "Signal Beam", "Snore", "Synthesis", "Throat Chop", "Worry Seed"};
		naturalMoves = new String[]{"Bug Bite", "Bite", "False Swipe"};
	}
		Leavanny(){

		super();
		}
}