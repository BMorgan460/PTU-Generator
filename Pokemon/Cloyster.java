public class Cloyster extends Pokemon{
	{
		name = "Cloyster";
		bHP = 5;
		bAtk = 10;
		bDef = 18;
		bSpAtk = 9;
		bSpDef = 5;
		bSpd = 7;
		type1 = "Water";
		type2 = "Ice";
		abilities = new String[]{"Shell Armor", "Shell Shield", "Overcoat", "Wonder Skin", "Skill Link"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Shellder();
		prevReq = 50;
		height = "4\'/11\"";
		weight = 292.1;
		WC = 5;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		overland = 2;
		swim = 5;
		levitate = 0;
		burrow = 0;
		lJump = 0 ;
		hJump = 0;
		power = 4;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Fountain","Freezer","Gilled"};
		athl = 2;
		acro = 1;
		combat = 3;
		stealth = 1;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{13, 28, 52};
		moves = new String[]{"Spike Cannon", "Spikes", "Icicle Crash"};
		TMs = new String[]{"Surf", "Dive", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Torment", "Facade", "Rest", "Attract", "Round", "Explosion", "Payback", "Giga Impact", "Frost Breath", "Poison Jab", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Avalanche", "Brine", "Dive", "Hydro Pump", "Icy Wind", "Iron Defense", "Shell Smash", "Signal Beam", "Sleep Talk", "Snore", "Swift", "Toxic", "Water Pulse"};
		naturalMoves = new String[]{"Hydro Pump", "Shell Smash"};
	}
		Cloyster(){

		super();
		}
}