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
		abilities = new String[]{"Cute Charm", "Lullaby", "Friend Guard", "Competitive", "Exploit"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Igglybuff();
		prevReq = 10;
		next = new String[]{"Wigglytuff"};
		nextReq = new String[]{"Stone"};
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
		movesLevels = new int[]{5, 9, 10, 13, 15, 18, 21, 24, 28, 32, 35, 37, 40, 44, 49};
		moves = new String[]{"Defense Curl", "Pound", "Play Nice", "Disarming Voice", "Disable", "Double Slap", "Rollout", "Round", "Wake Up Slap", "Rest", "Body Slam", "Mimic", "Gyro Ball", "Hyper Voice", "DoubleEdge"};
		TMs = new String[]{"Strength", "Toxic", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Solar Beam", "Thunderbolt", "Thunder", "Return", "Dig", "Psychic", "Shadow Ball", "Brick Break", "Double Team", "Reflect", "Flamethrower", "Fire Blast", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Fling", "Charge", "Charge Beam", "Incinerate", "Retaliate", "Flash", "Thunder", "Thunder Wave", "Gyro Ball", "Psych Up", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Bounce", "Counter", "Covet", "Drain Punch", "Dynamic Punch", "Endeavor", "Fire Punch", "Focus Punch", "Gravity", "Heal Bell", "Helping Hand", "Hyper Voice", "Ice Punch", "Icy Wind", "Knock Off", "Last Resort", "Magic Coat", "Mega Kick", "Mega Punch", "Mimic", "Pain Split", "Recycle", "Role Play", "Rollout", "Seismic Toss", "Shock Wave", "Sleep Talk", "Snatch", "Snore", "Stealth Rock", "Thunder Punch", "Uproar", "Water Pulse", "Work Up"};
		naturalMoves = new String[]{};
	}
		Jigglypuff(){

		super();
		}
}