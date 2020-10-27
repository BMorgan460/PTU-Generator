public class Lumineon extends Pokemon{
	{
		name = "Lumineon";
		bHP = 7;
		bAtk = 7;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 9;
		bSpd = 9;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Swift Swim", "Storm Drain", "Gulp", "Illuminate", "Water Veil"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Finneon();
		prevReq = 30;
		height = "3\'/11\"";
		weight = 52.9;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		habitats = new String[]{"Ocean"};
		overland = 3;
		swim = 7;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 4;
		power = 2;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Gilled","Fountain"};
		athl = 2;
		acro = 4;
		combat = 2;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{6, 10, 13, 17, 22, 26, 29, 35, 42, 48, 53, 59, 66};
		moves = new String[]{"Water Gun", "Attract", "Rain Dance", "Gust", "Water Pulse", "Captivate", "Safeguard", "Aqua Ring", "Whirlpool", "UTurn", "Bounce", "Silver Wind", "Soak"};
		TMs = new String[]{"Surf", "Waterfall", "Dive", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Safeguard", "Frustration", "Return", "Double Team", "Facade", "Rest", "Attract", "Attract", "Round", "Scald", "Payback", "Giga Impact", "Flash", "Psych Up", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Air Cutter", "Aqua Tail", "Bounce", "Brine", "Defog", "Dive", "Icy Wind", "Ominous Wind", "Signal Beam", "Sleep Talk", "Snore", "Swift", "Tailwind", "Twister"};
		naturalMoves = new String[]{"Dive", "Gust", "Snore", "Soak"};
	}
		Lumineon(){

		super();
		}
}