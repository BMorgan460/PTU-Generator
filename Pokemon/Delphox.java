public class Delphox extends Pokemon{
	{
		name = "Delphox";
		bHP = 8;
		bAtk = 7;
		bDef = 7;
		bSpAtk = 11;
		bSpDef = 10;
		bSpd = 10;
		type1 = "Fire";
		type2 = "Psychic";
		abilities = new String[]{"Blaze", "Forewarn", "Magician", "Sorcery", "Fox Fire"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Braixen();
		prevReq = 30;
		height = "4\'/11\"";
		weight = 86;
		WC = 3;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Field";
		egg2 = "Herbivore";
		habitats = new String[]{"Forest", "Grassland", "Urban"};
		overland = 7;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Forest", "Grassland"};
		underdog = false;
		other = new String[]{"Firestarter","Telepath","Tracker"};
		athl = 3;
		acro = 2;
		combat = 4;
		stealth = 3;
		percep = 4;
		focus = 5;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 1;
		movesLevels = new int[]{5, 11, 14, 18, 22, 28, 31, 38, 45, 51, 57, 62, 68, 74, 80};
		moves = new String[]{"Ember", "Howl", "Flame Charge", "Psybeam", "Fire Spin", "Lucky Chant", "Light Screen", "Psyshock", "Flamethrower", "WillOWisp", "Psychic", "Sunny Day", "Magic Room", "Fire Blast", "Future Sight"};
		TMs = new String[]{"Work Up", "Psyshock", "Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Solar Beam", "Return", "Psychic", "Shadow Ball", "Double Team", "Flamethrower", "Fire Blast", "Facade", "Flame Charge", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Overheat", "Embargo", "Giga Impact", "Psych Up", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Trick", "Trick Room", "Dazzling Gleam", "Confide"};
		tutorMoves = new String[]{"Ally Switch", "Blast Burn", "Covet", "Fire Pledge", "Fire Punch", "Foul Play", "Future Sight", "Heat Wave", "Iron Tail", "Laser Focus", "Low Kick", "Magic Coat", "Magic Room", "Recycle", "Role Play", "Shadow Ball", "Shock Wave", "Signal Beam", "Skill Swap", "Snatch", "Snore", "Telekinesis", "Thunder Punch", "Trick", "Wonder Room", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{"Future Sight", "Role Play", "Shadow Ball", "Snore", "Switcheroo"};
	}
		Delphox(){

		super();
		}
}