public class Krokorok extends Pokemon{
	{
		name = "Krokorok";
		bHP = 6;
		bAtk = 8;
		bDef = 5;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 7;
		type1 = "Ground";
		type2 = "Dark";
		abilities = new String[]{"Intimidate", "Moxie", "Anger Point", "Deep Sleep", "Strong Jaw"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Sandile();
		prevReq = 25;
		next = new String[]{"Krookodile"};
		nextReq = new String[]{"40"};
		height = "3\'/3\"";
		weight = 73.6;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Carnivore";
		overland = 5;
		swim = 4;
		levitate = 0;
		burrow = 2;
		lJump = 1 ;
		hJump = 1;
		power = 5;
		natureWalk = new String[]{"Desert"};
		underdog = true;
		other = new String[]{"Darkvision","Stealth"};
		athl = 4;
		acro = 2;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 1;
		focusBonus = 1;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 22, 25, 28, 32, 36, 40, 44, 48, 52};
		moves = new String[]{"Bite", "Sand Attack", "Torment", "Sand Tomb", "Assurance", "MudSlap", "Embargo", "Swagger", "Crunch", "Dig", "Scary Face", "Foul Play", "Sandstorm", "Earthquake", "Thrash"};
		TMs = new String[]{"Roar", "Toxic", "Hidden Power", "Taunt", "Protect", "Frustration", "Earthquake", "Return", "Brick Break", "Double Team", "Sludge", "Sludge Bomb", "Sandstorm", "Rock Tomb", "Torment", "Facade", "Rest", "Attract", "Thief", "Low Sweep", "Round", "Fling", "Brutal Swing", "Embargo", "Shadow Claw", "Payback", "Stone Edge", "Bulldoze", "Rock Slide", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Snarl", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Earth Power", "Focus Punch", "Foul Play", "Iron Tail", "Knock Off", "Low Kick", "Snatch", "Snore", "Spite", "Stealth Rock", "Uproar"};
		naturalMoves = new String[]{};
	}
		Krokorok(){

		super();
		}
}