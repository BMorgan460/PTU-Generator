public class Servine extends Pokemon{
	{
		name = "Servine";
		bHP = 6;
		bAtk = 6;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 8;
		bSpd = 8;
		type1 = "Grass";
		type2 = "";
		abilities = new String[]{"Sol Veil", "Overgrow", "Contrary", "Leaf Rush", "Sway"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Snivy();
		prevReq = 15;
		next = new String[]{"Serperior"};
		nextReq = new String[]{"30"};
		height = "2\'/07\"";
		size = "Small";
		weight = 35.3;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Plant";
		overland = 6;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Grassland", "Forest"};
		underdog = true;
		other = new String[]{"Stealth"};
		athl = 3;
		acro = 4;
		combat = 3;
		stealth = 4;
		percep = 4;
		focus = 4;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 3;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{4, 7, 10, 13, 16, 20, 24, 28, 32, 36, 40, 44, 48, 52};
		moves = new String[]{"Leer", "Vine Whip", "Wrap", "Growth", "Leaf Tornado", "Leech Seed", "Mega Drain", "Slam", "Leaf Blade", "Coil", "Giga Drain", "Wring Out", "Gastro Acid", "Leaf Storm"};
		TMs = new String[]{"Cut", "Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Light Screen", "Protect", "Safeguard", "Frustration", "Solar Beam", "Return", "Double Team", "Reflect", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Round", "Energy Ball", "Flash", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Nature Power"};
		tutorMoves = new String[]{"Aqua Tail", "Bind", "Gastro Acid", "Acid", "Giga Drain", "Grass Pledge", "Iron Tail", "Knock Off", "Seed Bomb", "Sleep Talk", "Snatch", "Snore", "Synthesis", "Worry Seed"};
		naturalMoves = new String[]{};
	}
		Servine(){

		super();
		}
}