public class Pikachu extends Pokemon{
	{
		name = "Pikachu";
		bHP = 4;
		bAtk = 6;
		bDef = 4;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 9;
		type1 = "Electric";
		type2 = "";
		abilities = new String[]{"Static", "Cute Charm", "Lightning Rod", "Sprint", "Sequence"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Pichu();
		prevReq = 10;
		next = new String[]{"Raichu"};
		nextReq = new String[]{"20"};
		height = "1\'/4\"";
		size = "Small";
		weight = 13.2;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Fairy";
		habitats = new String[]{"Forest", "Grassland", "Urban"};
		overland = 7;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 2;
		natureWalk = new String[]{"Forest", "Urban"};
		underdog = true;
		other = new String[]{"Zapper"};
		athl = 3;
		acro = 3;
		combat = 2;
		stealth = 3;
		percep = 2;
		focus = 3;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{5, 7, 10, 13, 18, 21, 23, 26, 29, 34, 37, 42, 45, 50, 53, 58};
		moves = new String[]{"Growl", "Play Nice", "Quick Attack", "Electro Ball", "Thunder Wave", "Feint", "Double Team", "Spark", "Nuzzle", "Discharge", "Slam", "Thunderbolt", "Agility", "Wild Charge", "Light Screen", "Thunder"};
		TMs = new String[]{"Toxic", "Hidden Power", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Brick Break", "Double Team", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Fling", "Charge", "Charge Beam", "Volt Switch", "Thunder", "Thunder Wave", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Covet", "Defense Curl", "Dynamic Punch", "Electroweb", "Focus Punch", "Helping Hand", "Hold Hands", "Iron Tail", "Knock Off", "Laser Focus", "Magnet Rise", "Mega Kick", "Mega Punch", "Rollout", "Seismic Toss", "Shock Wave", "Signal Beam", "Snore", "Swift", "Thunder Punch", "Uproar", "Volt Tackle", "Tackle"};
		naturalMoves = new String[]{};
	}
		Pikachu(){

		super();
		}
}