public class Exeggutor extends Pokemon{
	{
		name = "Exeggutor";
		bHP = 10;
		bAtk = 10;
		bDef = 9;
		bSpAtk = 13;
		bSpDef = 8;
		bSpd = 6;
		type1 = "Grass";
		type2 = "Psychic";
		abilities = new String[]{"Filter", "Cluster Mind", "Chlorophyll", "Eggscellence", "Harvest"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Exeggcute();
		prevReq = 20;
		height = "6\'/7\"";
		weight = 264.6;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Plant";
		egg2 = "Phototroph";
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 6;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{};
		athl = 3;
		acro = 2;
		combat = 2;
		stealth = 4;
		percep = 4;
		focus = 5;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 3;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{7, 11, 17, 19, 21, 23, 27, 33, 37, 43, 47, 50};
		moves = new String[]{"Reflect", "Leech Seed", "Psyshock", "Stun Spore", "Poison Powder", "Sleep Powder", "Egg Bomb", "Worry Seed", "Wood Hammer", "Solar Beam", "Leaf Storm", "Bestow"};
		TMs = new String[]{"Psyshock", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Frustration", "Solar Beam", "Return", "Psychic", "Double Team", "Reflect", "Sludge", "Sludge Bomb", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Explosion", "Giga Impact", "Swords Dance", "Psych Up", "Infestation", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Nature Power", "Confide"};
		tutorMoves = new String[]{"Ancient Power", "Block", "Giga Drain", "Gravity", "Low Kick", "Rollout", "Seed Bomb", "Skill Swap", "Snore", "Stomping Tantrum", "Synthesis", "Telekinesis", "Uproar", "Worry Seed", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{"Block", "Confusion", "Seed Bomb"};
	}
		Exeggutor(){

		super();
		}
}