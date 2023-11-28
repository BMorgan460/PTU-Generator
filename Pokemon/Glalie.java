public class Glalie extends Pokemon{
	{
		name = "Glalie";
		bHP = 8;
		bAtk = 8;
		bDef = 8;
		bSpAtk = 8;
		bSpDef = 8;
		bSpd = 8;
		type1 = "Ice";
		type2 = "";
		abilities = new String[]{"Inner Focus", "Ice Body", "Winters Kiss", "Moody", "Frostbite"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Snorunt();
		prevReq = 30;
		height = "4\'/11\"";
		weight = 565.5;
		WC = 6;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Fairy";
		egg2 = "Mineral";
		habitats = new String[]{"Cave", "Taiga", "Tundra"};
		overland = 5;
		swim = 2;
		levitate = 5;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 5;
		underdog = false;
		other = new String[]{"Chilled","Dead Silent","Freezer"};
		athl = 3;
		acro = 3;
		combat = 1;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{5, 10, 14, 19, 23, 28, 32, 37, 41, 48, 54, 61};
		moves = new String[]{"Double Team", "Ice Shard", "Icy Wind", "Bite", "Ice Fang", "Headbutt", "Protect", "Frost Breath", "Crunch", "Blizzard", "Hail", "Sheer Cold"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Earthquake", "Return", "Shadow Ball", "Double Team", "Torment", "Facade", "Rest", "Attract", "Round", "Explosion", "Payback", "Giga Impact", "Gyro Ball", "Bulldoze", "Frost Breath", "Swagger", "Sleep Talk", "Substitute", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Avalanche", "Block", "Body Slam", "Slam", "Icy Wind", "Iron Head", "Laser Focus", "Rollout", "Sheer Cold", "Signal Beam", "Snore", "Spite", "Super Fang", "Water Pulse"};
		naturalMoves = new String[]{"Sheer Cold"};
	}
		Glalie(){

		super();
		}
}