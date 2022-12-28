public class Jigglypuff extends Pokemon{
	{
		name = "Jigglypuff";
		bHP = 12;
		bAtk = 5;
		bDef = 2;
		bSpAtk = 5;
		bSpDef = 3;
		bSpd = 2;
		type1 = "Normal";
		type2 = "Fairy";
		abilities = new String[]{"Cute Charm", "Lullaby", "Huge Power", "Competitive", "Friend Guard"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Igglybuff();
		prevReq = 10;
		next = new String[]{"Wigglytuff"};
		nextReq = new String[]{"20"};
		height = "1\'/8\"";
		size = "Small";
		weight = 12.1;
		WC = 1;
		maleRatio = 25.0;
		femaleRatio = 75.0;
		egg1 = "Fairy";
		egg2 = "Herbivore";
		habitats = new String[]{"Cave", "Grassland", "Urban"};
		overland = 5;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 1;
		natureWalk = new String[]{"Grassland", "Urban"};
		underdog = true;
		other = new String[]{"Inflatable"};
		athl = 2;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 2;
		movesLevels = new int[]{3, 5, 9, 11, 14, 17, 20, 22, 25, 25, 25, 27, 30, 32, 35, 38, 41, 45};
		moves = new String[]{"Defense Curl", "Pound", "Play Nice", "Disarming Voice", "Disable", "Double Slap", "Rollout", "Round", "Stockpile", "Swallow", "Spit Up", "WakeUp", "Rest", "Body Slam", "Gyro Ball", "Mimic", "Hyper Voice", "DoubleEdge"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Solar Beam", "Thunderbolt", "Thunder", "Return", "Psychic", "Shadow Ball", "Brick Break", "Double Team", "Reflect", "Flamethrower", "Fire Blast", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Fling", "Charge", "Charge Beam", "Thunder", "Thunder Wave", "Gyro Ball", "Psych Up", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Body Slam", "Slam", "Bounce", "Counter", "Covet", "Drain Punch", "Endeavor", "Fire Punch", "Focus Punch", "Gravity", "Heal Bell", "Helping Hand", "Hyper Voice", "Ice Punch", "Icy Wind", "Knock Off", "Last Resort", "Magic Coat", "Mega Kick", "Mega Punch", "Mimic", "Pain Split", "Recycle", "Role Play", "Rollout", "Seismic Toss", "Shock Wave", "Snatch", "Snore", "Stealth Rock", "Telekinesis", "Thunder Punch", "Uproar", "Water Pulse"};
		naturalMoves = new String[]{};
	}
		Jigglypuff(){

		super();
		}
}