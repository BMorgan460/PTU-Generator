public class Glaceon extends Pokemon{
	{
		name = "Glaceon";
		bHP = 7;
		bAtk = 6;
		bDef = 11;
		bSpAtk = 13;
		bSpDef = 10;
		bSpd = 7;
		type1 = "Ice";
		type2 = "";
		abilities = new String[]{"Snow Cloak", "Winter's Kiss", "Type Aura", "Ice Body", "Frostbite"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Eevee();
		prevReq = 20;
		height = "2\'/7\"";
		weight = 57.1;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Omnivore";
		overland = 6;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		underdog = false;
		other = new String[]{"Freezer","Tracker"};
		athl = 5;
		acro = 3;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{5, 9, 13, 17, 20, 25, 29, 33, 37, 41, 45};
		moves = new String[]{"Sand Attack", "BabyDoll", "Quick Attack", "Bite", "Ice Fang", "Ice Shard", "Barrier", "Mirror Coat", "Hail", "Last Resort", "Blizzard"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hail", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Shadow Ball", "Double Team", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Giga Impact", "Frost Breath", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Avalanche", "Covet", "Heal Bell", "Helping Hand", "Hyper Voice", "Icy Wind", "Iron Tail", "Laser Focus", "Last Resort", "Signal Beam", "Snore", "Swift", "Water Pulse"};
		naturalMoves = new String[]{"Helping Hand"};
	}
		Glaceon(){

		super();
		}
}