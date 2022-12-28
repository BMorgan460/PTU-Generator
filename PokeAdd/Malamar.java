public class Malamar extends Pokemon{
	{
		name = "Malamar";
		bHP = 9;
		bAtk = 9;
		bDef = 9;
		bSpAtk = 7;
		bSpDef = 8;
		bSpd = 7;
		type1 = "Dark";
		type2 = "Psychic";
		abilities = new String[]{"Infiltrator", "Suction Cups", "Hypnotic", "Memory Wipe", "Contrary"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Inkay();
		prevReq = 30;
		height = "4\'/11\"";
		weight = 103.6;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		habitats = new String[]{"Ocean"};
		overland = 1;
		swim = 5;
		levitate = 6;
		burrow = 0;
		lJump = 0 ;
		hJump = 1;
		power = 1;
		underdog = false;
		other = new String[]{"Gilled","Glow","Telekinetic","Telepath"};
		athl = 3;
		acro = 2;
		combat = 4;
		stealth = 3;
		percep = 4;
		focus = 6;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 1;
		percepBonus = 0;
		focusBonus = 2;
		movesLevels = new int[]{4, 8, 12, 13, 15, 18, 21, 23, 27, 31, 35, 39, 43, 46, 48};
		moves = new String[]{"Reflect", "Foul Play", "Swagger", "Psywave", "TopsyTurvy", "Hypnosis", "Psybeam", "Switcheroo", "Payback", "Light Screen", "Pluck", "Psycho Cut", "Slash", "Night Slash", "Superpower"};
		TMs = new String[]{"Psyshock", "Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Return", "Psychic", "Double Team", "Reflect", "Flamethrower", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Fling", "Brutal Swing", "Embargo", "Payback", "Giga Impact", "Psych Up", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Bind", "Block", "Foul Play", "Knock Off", "Role Play", "Signal Beam", "Snatch", "Snore", "Spite", "Superpower", "Telekinesis", "Throat Chop"};
		naturalMoves = new String[]{"Reversal"};
	}
		Malamar(){

		super();
		}
}