public class Trevenant extends Pokemon{
	{
		name = "Trevenant";
		bHP = 9;
		bAtk = 11;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 8;
		bSpd = 6;
		type1 = "Ghost";
		type2 = "Grass";
		abilities = new String[]{"Natural Cure", "Frisk", "Harvest", "Forest Lord", "Leaf Guard"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Phantump();
		prevReq = 25;
		height = "4\'/11\"";
		size = "Large";
		weight = 156.5;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Plant";
		egg2 = "Indeterminate";
		habitats = new String[]{"Forest"};
		overland = 6;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 6;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{"Darkvision","Inflatable","Phasing"};
		athl = 4;
		acro = 2;
		combat = 4;
		stealth = 4;
		percep = 3;
		focus = 4;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 3;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 8, 13, 19, 23, 28, 31, 35, 39, 45, 49, 54};
		moves = new String[]{"Astonish", "Growth", "Ingrain", "Feint Attack", "Leech Seed", "Curse", "WillOWisp", "Forest’s", "Destiny Bond", "Phantom Force", "Wood Hammer", "Horn Leech"};
		TMs = new String[]{"Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Safeguard", "Frustration", "Solar Beam", "Earthquake", "Return", "Psychic", "Shadow Ball", "Double Team", "Reflect", "Facade", "Rest", "Attract", "Thief", "Round", "Focus Blast", "Energy Ball", "Brutal Swing", "Shadow Claw", "Giga Impact", "Bulldoze", "Rock Slide", "Poison Jab", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Nature Power", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Block", "Drain Punch", "Foul Play", "Giga Drain", "Horn Leech", "Magic Coat", "Pain Split", "Role Play", "Seed Bomb", "Skill Swap", "Snore", "Spite", "Telekinesis", "Trick", "Worry Seed"};
		naturalMoves = new String[]{"Horn Leech"};
	}
		Trevenant(){

		super();
		}
}