public class Abomasnow extends Pokemon{
	{
		name = "Abomasnow";
		bHP = 9;
		bAtk = 9;
		bDef = 8;
		bSpAtk = 9;
		bSpDef = 9;
		bSpd = 6;
		type1 = "Grass";
		type2 = "Ice";
		abilities = new String[]{"Soundproof", "Ice Body", "Full Guard", "Snow Warning", "Abominable"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Snover();
		prevReq = 30;
		height = "7\'/3\"";
		size = "Large";
		weight = 298.7;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "Plant";
		habitats = new String[]{"Taiga"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 6;
		natureWalk = new String[]{"Forest", "Grassland", "Tundra"};
		underdog = false;
		other = new String[]{"Chilled","Freezer"};
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 2;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 21, 26, 31, 36, 47, 58};
		moves = new String[]{"Razor Leaf", "Icy Wind", "Grass", "Swagger", "Mist", "Ice Shard", "Ingrain", "Wood Hammer", "Blizzard", "Sheer Cold"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Solar Beam", "Earthquake", "Return", "Shadow Ball", "Brick Break", "Double Team", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Focus Blast", "Energy Ball", "Fling", "Giga Impact", "Swords Dance", "Bulldoze", "Frost Breath", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Avalanche", "Block", "Bullet Seed", "Focus Punch", "Giga Drain", "Ice Punch", "Icy Wind", "Iron Tail", "Outrage", "Rock Climb", "Role Play", "Seed Bomb", "Snore", "Stomping Tantrum", "Synthesis", "Water Pulse", "Worry Seed"};
		naturalMoves = new String[]{"Ice Punch"};
	}
		Abomasnow(){

		super();
		}
}