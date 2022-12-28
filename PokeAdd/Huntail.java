public class Huntail extends Pokemon{
	{
		name = "Huntail";
		bHP = 6;
		bAtk = 10;
		bDef = 11;
		bSpAtk = 9;
		bSpDef = 8;
		bSpd = 5;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Sheer Force", "Intimidate", "Water Veil", "Swift Swim", "Strong Jaw"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Clamperl();
		prevReq = 20;
		height = "5\'/7\"";
		weight = 59.5;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		habitats = new String[]{"Ocean"};
		overland = 2;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Fountain","Gilled"};
		athl = 3;
		acro = 2;
		combat = 3;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 11, 14, 16, 19, 23, 26, 29, 34, 39, 45, 50};
		moves = new String[]{"Screech", "Scary Face", "Feint Attack", "Water Pulse", "Ice Fang", "Brine", "Sucker Punch", "Dive", "Baton Pass", "Crunch", "Aqua Tail", "Coil", "Hydro Pump"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Double Team", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Scald", "Giga Impact", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Ring", "Aqua Tail", "Bind", "Body Slam", "Slam", "Bounce", "Brine", "Dive", "Icy Wind", "Iron Defense", "Snatch", "Snore", "Sucker Punch", "Super Fang", "Swift", "Water Pulse"};
		naturalMoves = new String[]{"Bind", "Bite", "Whirlpool"};
	}
		Huntail(){

		super();
		}
}