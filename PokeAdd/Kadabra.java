public class Kadabra extends Pokemon{
	{
		name = "Kadabra";
		bHP = 4;
		bAtk = 4;
		bDef = 3;
		bSpAtk = 12;
		bSpDef = 7;
		bSpd = 11;
		type1 = "Psychic";
		type2 = "";
		abilities = new String[]{"Synchronize", "Inner Focus", "Transporter", "Magic Guard", "Life Force"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Abra();
		prevReq = 15;
		next = new String[]{"Alakazam"};
		nextReq = new String[]{"35"};
		height = "4\'/3\"";
		weight = 124.6;
		WC = 4;
		maleRatio = 75.0;
		femaleRatio = 25.0;
		egg1 = "Humanshape";
		egg2 = "Omnivore";
		overland = 5;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 1;
		power = 3;
		natureWalk = new String[]{"Forest", "Urban"};
		underdog = true;
		other = new String[]{"Telekinetic","Telepath"};
		athl = 2;
		acro = 2;
		combat = 2;
		stealth = 2;
		percep = 4;
		focus = 4;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 4;
		movesLevels = new int[]{16, 18, 21, 23, 26, 28, 31, 33, 36, 38, 41, 43, 46};
		moves = new String[]{"Confusion", "Disable", "Psybeam", "Miracle Eye", "Reflect", "Psycho Cut", "Recover", "Telekinesis", "Ally Switch", "Psychic", "Role Play", "Future Sight", "Trick"};
		TMs = new String[]{"Psyshock", "Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Return", "Psychic", "Shadow Ball", "Double Team", "Reflect", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Fling", "Charge", "Charge Beam", "Embargo", "Thunder", "Thunder Wave", "Psych Up", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Body Slam", "Slam", "Counter", "Drain Punch", "Dynamic Punch", "Fire Punch", "Focus Punch", "Foul Play", "Gravity", "Ice Punch", "Iron Tail", "Knock Off", "Magic Coat", "Magic Room", "Mega Kick", "Mega Punch", "Metronome", "Recycle", "Role Play", "Seismic Toss", "Shock Wave", "Signal Beam", "Skill Swap", "Snatch", "Snore", "Telekinesis", "Thunder Punch", "Trick", "Wonder Room", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Kadabra(){

		super();
		}
}