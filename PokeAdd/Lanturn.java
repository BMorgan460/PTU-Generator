public class Lanturn extends Pokemon{
	{
		name = "Lanturn";
		bHP = 13;
		bAtk = 6;
		bDef = 6;
		bSpAtk = 8;
		bSpDef = 8;
		bSpd = 7;
		type1 = "Water";
		type2 = "Electric";
		abilities = new String[]{"Volt Absorb", "Illuminate", "Water Veil", "Water Absorb", "Big Swallow"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Chinchou();
		prevReq = 25;
		height = "3\'/11\"";
		weight = 49.6;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		habitats = new String[]{"Ocean"};
		overland = 2;
		swim = 7;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 2;
		power = 2;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Fountain","Gilled","Glow","Zapper"};
		athl = 3;
		acro = 2;
		combat = 2;
		stealth = 1;
		percep = 4;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{6, 9, 12, 17, 20, 23, 29, 33, 37, 43, 47, 51, 54, 58};
		moves = new String[]{"Thunder Wave", "Electro Ball", "Water Gun", "Confuse Ray", "Bubble Beam", "Spark", "Signal Beam", "Flail", "Discharge", "Take Down", "Aqua Ring", "Hydro Pump", "Ion Deluge", "Charge"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Scald", "Charge", "Charge Beam", "Giga Impact", "Volt Switch", "Thunder", "Thunder Wave", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Surf", "Waterfall", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Aqua Ring", "Aqua Tail", "Bounce", "Brine", "Dive", "Eerie Impulse", "Heal Bell", "Icy Wind", "Shock Wave", "Signal Beam", "Snore", "Sucker Punch", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{"Eerie Impulse", "Snore", "Spotlight"};
	}
		Lanturn(){

		super();
		}
}