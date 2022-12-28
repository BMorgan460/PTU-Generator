public class Torterra extends Pokemon{
	{
		name = "Torterra";
		bHP = 10;
		bAtk = 11;
		bDef = 11;
		bSpAtk = 8;
		bSpDef = 9;
		bSpd = 4;
		type1 = "Grass";
		type2 = "Ground";
		abilities = new String[]{"Shell Armor", "Overgrow", "Grass Pelt", "Sturdy", "Natural Cure"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Grotle();
		prevReq = 30;
		height = "7\'/3\"";
		size = "Large";
		weight = 683.4;
		WC = 6;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Plant";
		habitats = new String[]{"Forest", "Marsh", "Rainforest"};
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 7;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = false;
		other = new String[]{"Groundshaper","Mountable 2","Planter"};
		athl = 4;
		acro = 1;
		combat = 4;
		stealth = 1;
		percep = 3;
		focus = 6;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 17, 22, 27, 33, 39, 45, 51, 57};
		moves = new String[]{"Withdraw", "Absorb", "Razor Leaf", "Curse", "Bite", "Mega Drain", "Leech Seed", "Synthesis", "Crunch", "Giga Drain", "Leaf Storm"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Earthquake", "Return", "Double Team", "Reflect", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Giga Impact", "Rock Polish", "Stone Edge", "Swords Dance", "Bulldoze", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Block", "Bullet Seed", "Earth Power", "Frenzy Plant", "Giga Drain", "Grass Pledge", "Iron Head", "Iron Tail", "Natural Gift", "Outrage", "Rock Climb", "Secret Power", "Seed Bomb", "Snore", "Stealth Rock", "Stomping Tantrum", "Superpower", "Synthesis", "Wood Hammer", "Worry Seed"};
		naturalMoves = new String[]{"Wood Hammer"};
	}
		Torterra(){

		super();
		}
}