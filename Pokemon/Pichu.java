public class Pichu extends Pokemon{
	{
		name = "Pichu";
		bHP = 2;
		bAtk = 4;
		bDef = 2;
		bSpAtk = 4;
		bSpDef = 4;
		bSpd = 6;
		type1 = "Electric";
		type2 = "";
		abilities = new String[]{"Static", "Cute Charm", "Lightning Rod", "Sprint", "Sequence"};
		abilityTypeCount = new int[] {2,2,1};
		next = new String[]{"Pikachu", "Raichu"};
		nextReq = new String[]{"Size"};
		height = "1\'/0\"";
		size = "Small";
		weight = 4.4;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Fairy";
		habitats = new String[]{"Forest", "Grassland", "Urban"};
		overland = 3;
		swim = 1;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 1;
		natureWalk = new String[]{"Forest", "Urban"};
		underdog = true;
		other = new String[]{"Zapper"};
		athl = 2;
		acro = 3;
		combat = 1;
		stealth = 3;
		percep = 2;
		focus = 2;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{1, 1, 5, 10, 13, 18};
		moves = new String[]{"Charm", "Thunder Shock", "Tail Whip", "Sweet Kiss", "Nasty Plot", "Thunder Wave"};
		TMs = new String[]{"Toxic", "Hidden Power", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Fling", "Charge", "Charge Beam", "Flash", "Volt Switch", "Thunder", "Thunder Wave", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Wild Charge"};
		eggMoves = new String[]{"Bestow", "Bide", "Charge", "Disarming Voice", "Double Slap", "Encore", "Endure", "Fake Out", "Flail", "Lucky Chant", "Present", "Reversal", "Thunder Punch", "Tickle", "Volt Tackle", "Tackle", "Wish"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Covet", "Defense Curl", "Helping Hand", "Hold Hands", "Iron Tail", "Magnet Rise", "Mega Kick", "Mega Punch", "Rollout", "Seismic Toss", "Shock Wave", "Signal Beam", "Sleep Talk", "Snore", "Swift", "Uproar"};
		naturalMoves = new String[]{};
	}
		Pichu(){

		super();
		}
}