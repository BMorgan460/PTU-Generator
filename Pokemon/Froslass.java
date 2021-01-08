public class Froslass extends Pokemon{
	{
		name = "Froslass";
		bHP = 7;
		bAtk = 8;
		bDef = 7;
		bSpAtk = 8;
		bSpDef = 7;
		bSpd = 11;
		type1 = "Ice";
		type2 = "Ghost";
		abilities = new String[]{"Magic Guard", "Snow Cloak", "Cursed Body", "Omen", "Frostbite"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Snorunt();
		prevReq = 40;
		height = "4\'/3\"";
		weight = 58.6;
		WC = 3;
		maleRatio = 0.0;
		femaleRatio = 100.0;
		egg1 = "Fairy";
		egg2 = "Mineral";
		overland = 4;
		swim = 3;
		levitate = 6;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 3;
		underdog = false;
		other = new String[]{"Chilled","Darkvision","Dead Silent","Freezer","Stealth"};
		athl = 2;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 3;
		focus = 3;
		athlBonus = 1;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 1;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{5, 10, 14, 19, 23, 28, 32, 37, 41, 42, 48, 54, 61};
		moves = new String[]{"Double Team", "Ice Shard", "Icy Wind", "Astonish", "Draining Kiss", "Ominous Wind", "Confuse Ray", "Wake Up Slap", "Captivate", "Shadow Ball", "Blizzard", "Hail", "Destiny Bond"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Thunderbolt", "Thunder", "Return", "Psychic", "Shadow Ball", "Double Team", "Double Team", "Torment", "Facade", "Rest", "Attract", "Round", "Fling", "Embargo", "Payback", "Giga Impact", "Flash", "Thunder", "Thunder Wave", "Psych Up", "Frost Breath", "Dream Eater", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Avalanche", "Block", "Destiny Bond", "Ice Punch", "Icy Wind", "Ominous Wind", "Pain Split", "Rollout", "Shock Wave", "Signal Beam", "Sleep Talk", "Snatch", "Snore", "Spite", "Sucker Punch", "Telekinesis", "Trick", "Water Pulse"};
		naturalMoves = new String[]{"Destiny Bond"};
	}
		Froslass(){

		super();
		}
}