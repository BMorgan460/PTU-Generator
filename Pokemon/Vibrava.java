public class Vibrava extends Pokemon{
	{
		name = "Vibrava";
		bHP = 5;
		bAtk = 7;
		bDef = 5;
		bSpAtk = 5;
		bSpDef = 5;
		bSpd = 7;
		type1 = "Ground";
		type2 = "Dragon";
		abilities = new String[]{"Levitate", "Sand Veil", "Sand Rush", "Flutter", "Tinted Lens"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Trapinch();
		prevReq = 25;
		next = new String[]{"Flygon"};
		nextReq = new String[]{"45"};
		height = "3\'/7\"";
		weight = 33.7;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Bug";
		egg2 = "Carnivore";
		habitats = new String[]{"Desert"};
		overland = 5;
		swim = 3;
		levitate = 0;
		burrow = 2;
		lJump = 2 ;
		hJump = 2;
		power = 2;
		natureWalk = new String[]{"Desert"};
		underdog = true;
		other = new String[]{};
		athl = 2;
		acro = 2;
		combat = 3;
		stealth = 3;
		percep = 3;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 3;
		percepBonus = 1;
		focusBonus = 1;
		movesLevels = new int[]{5, 8, 12, 15, 19, 22, 26, 29, 33, 36, 40, 43, 47};
		moves = new String[]{"MudSlap", "Bulldoze", "Sand Tomb", "Rock Slide", "Supersonic", "Screech", "Earth Power", "Bug Buzz", "Earthquake", "Sandstorm", "Uproar", "Hyper Beam", "Boomburst"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Roost", "Frustration", "Solar Beam", "Earthquake", "Return", "Double Team", "Sandstorm", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Steel Wing", "Fly", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Body Slam", "Slam", "Bug Bite", "Bite", "Defog", "Draco Meteor", "Dragon Pulse", "Earth Power", "Fury Cutter", "Giga Drain", "Heat Wave", "Ominous Wind", "Outrage", "Signal Beam", "Silver Wind", "Snore", "Sonic Boom", "Superpower", "Swift", "Tailwind", "Throat Chop", "Twister"};
		naturalMoves = new String[]{"Sonic Boom"};
	}
		Vibrava(){

		super();
		}
}