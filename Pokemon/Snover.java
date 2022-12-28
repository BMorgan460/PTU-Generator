public class Snover extends Pokemon{
	{
		name = "Snover";
		bHP = 6;
		bAtk = 6;
		bDef = 5;
		bSpAtk = 6;
		bSpDef = 6;
		bSpd = 4;
		type1 = "Grass";
		type2 = "Ice";
		abilities = new String[]{"Soundproof", "Ice Body", "Full Guard", "Snow Warning", "Abominable"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Abomasnow"};
		nextReq = new String[]{"30"};
		height = "3\'/3\"";
		weight = 111.3;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "Plant";
		habitats = new String[]{"Taiga"};
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 2;
		natureWalk = new String[]{"Forest", "Grassland", "Tundra"};
		underdog = true;
		other = new String[]{"Chilled"};
		athl = 2;
		acro = 2;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 2;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{1, 1, 5, 9, 13, 17, 21, 26, 31, 36, 41, 46};
		moves = new String[]{"Leer", "Powder Snow", "Razor Leaf", "Icy Wind", "Grass", "Swagger", "Mist", "Ice Shard", "Ingrain", "Wood Hammer", "Blizzard", "Sheer Cold"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Solar Beam", "Return", "Shadow Ball", "Double Team", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Swords Dance", "Frost Breath", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		eggMoves = new String[]{"Avalanche", "Bullet Seed", "Growth", "Leech Seed", "Magical Leaf", "Natural Gift", "Seed Bomb", "Skull Bash", "Stomp"};
		tutorMoves = new String[]{"Bullet Seed", "Giga Drain", "Ice Punch", "Icy Wind", "Iron Tail", "Role Play", "Seed Bomb", "Snore", "Synthesis", "Water Pulse", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Snover(){

		super();
		}
}