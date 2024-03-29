public class Loudred extends Pokemon{
	{
		name = "Loudred";
		bHP = 8;
		bAtk = 7;
		bDef = 4;
		bSpAtk = 7;
		bSpDef = 4;
		bSpd = 5;
		type1 = "Normal";
		type2 = "";
		abilities = new String[]{"Soundproof", "Scrappy", "Drown Out", "Intimidate", "Vital Spirit"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Whismur();
		prevReq = 20;
		next = new String[]{"Exploud"};
		nextReq = new String[]{"40"};
		height = "3\'/3\"";
		weight = 89.3;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Monster";
		egg2 = "Field";
		habitats = new String[]{"Cave"};
		overland = 5;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 2;
		power = 4;
		natureWalk = new String[]{"Cave"};
		underdog = true;
		other = new String[]{};
		athl = 3;
		acro = 2;
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
		movesLevels = new int[]{4, 9, 11, 15, 18, 23, 27, 32, 36, 41, 45, 50};
		moves = new String[]{"Echoed Voice", "Astonish", "Howl", "Screech", "Supersonic", "Stomp", "Uproar", "Roar", "Rest", "Sleep Talk", "Hyper Voice", "Synchronoise"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Ice Beam", "Blizzard", "Protect", "Rain Dance", "Frustration", "Solar Beam", "Smack Down", "Earthquake", "Return", "Shadow Ball", "Brick Break", "Double Team", "Flamethrower", "Fire Blast", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Round", "Echoed Voice", "Overheat", "Fling", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Counter", "Defense Curl", "Dynamic Punch", "Endeavor", "Fire Punch", "Hyper Voice", "Ice Punch", "Icy Wind", "Low Kick", "Mega Kick", "Mega Punch", "Seismic Toss", "Shock Wave", "Snore", "Stomping Tantrum", "Thunder Punch", "Uproar", "Water Pulse", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{};
	}
		Loudred(){

		super();
		}
}