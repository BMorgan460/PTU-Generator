public class Braixen extends Pokemon{
	{
		name = "Braixen";
		bHP = 6;
		bAtk = 6;
		bDef = 6;
		bSpAtk = 9;
		bSpDef = 7;
		bSpd = 7;
		type1 = "Fire";
		type2 = "";
		abilities = new String[]{"Blaze", "Forewarn", "Magician", "Sorcery", "Fox Fire"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Fennekin();
		prevReq = 15;
		next = new String[]{"Delphox"};
		nextReq = new String[]{"30"};
		height = "3\'/3\"";
		weight = 32;
		WC = 2;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest", "Grassland", "Urban"};
		overland = 6;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = true;
		other = new String[]{"Firestarter","Tracker"};
		athl = 2;
		acro = 2;
		combat = 3;
		stealth = 3;
		percep = 4;
		focus = 4;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{5, 11, 14, 18, 22, 28, 31, 36, 41, 45, 49, 52, 56, 59};
		moves = new String[]{"Ember", "Howl", "Flame Charge", "Psybeam", "Fire Spin", "Lucky Chant", "Light Screen", "Psyshock", "Flamethrower", "WillOWisp", "Psychic", "Sunny Day", "Magic Room", "Fire Blast"};
		TMs = new String[]{"Work Up", "Psyshock", "Toxic", "Hidden Power", "Sunny Day", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Solar Beam", "Return", "Psychic", "Double Team", "Flamethrower", "Fire Blast", "Facade", "Flame Charge", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Overheat", "Embargo", "Psych Up", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Covet", "Fire Pledge", "Fire Punch", "Foul Play", "Heat Wave", "Iron Tail", "Laser Focus", "Low Kick", "Magic Coat", "Magic Room", "Recycle", "Shock Wave", "Skill Swap", "Snatch", "Snore", "Telekinesis", "Thunder Punch", "Trick", "Wonder Room", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Braixen(){

		super();
		}
}