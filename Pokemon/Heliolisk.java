public class Heliolisk extends Pokemon{
	{
		name = "Heliolisk";
		bHP = 6;
		bAtk = 6;
		bDef = 5;
		bSpAtk = 11;
		bSpDef = 9;
		bSpd = 11;
		type1 = "Electric";
		type2 = "Normal";
		abilities = new String[]{"Electrodash", "Desert Weather", "Solar Power", "Sun Blanket", "Heliovolt"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Helioptile();
		prevReq = 20;
		height = "3\'/3\"";
		weight = 46.3;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "Dragon";
		overland = 8;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Desert"};
		underdog = false;
		other = new String[]{"Zapper"};
		athl = 4;
		acro = 5;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{6, 11, 13, 17, 22, 25, 31, 35, 40, 45, 49};
		moves = new String[]{"Thunder Shock", "Charge", "MudSlap", "Quick Attack", "Razor Wind", "Parabolic Charge", "Thunder Wave", "Bulldoze", "Volt Switch", "Electrify", "Thunderbolt"};
		TMs = new String[]{"Toxic", "Hidden Power", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Low Sweep", "Round", "Focus Blast", "Charge", "Charge Beam", "Brutal Swing", "Giga Impact", "Volt Switch", "Thunder", "Thunder Wave", "Psych Up", "Bulldoze", "Rock Slide", "Dragon Tail", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Surf", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Dragon Pulse", "Eerie Impulse", "Electroweb", "Fire Punch", "Hyper Voice", "Iron Tail", "Low Kick", "Magnet Rise", "Parabolic Charge", "Razor Wind", "Shock Wave", "Signal Beam", "Snore", "Thunder Punch"};
		naturalMoves = new String[]{"Eerie Impulse", "Electrify", "Parabolic Charge", "Charge", "Razor Wind", "Snore", "Thunder"};
	}
		Heliolisk(){

		super();
		}
}