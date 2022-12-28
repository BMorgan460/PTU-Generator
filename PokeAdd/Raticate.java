public class Raticate extends Pokemon{
	{
		name = "Raticate";
		bHP = 6;
		bAtk = 8;
		bDef = 6;
		bSpAtk = 5;
		bSpDef = 7;
		bSpd = 10;
		type1 = "Normal";
		type2 = "";
		abilities = new String[]{"Run Away", "Guts", "Hustle", "Pickup", "Nimble Strikes"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Rattata();
		prevReq = 20;
		height = "2\'/4\"";
		size = "Small";
		weight = 40.8;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Omnivore";
		habitats = new String[]{"Cave", "Forest", "Grassland"};
		overland = 7;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		natureWalk = new String[]{"Grassland", "Urban"};
		underdog = true;
		other = new String[]{"Stealth","Tracker"};
		athl = 3;
		acro = 3;
		combat = 3;
		stealth = 4;
		percep = 5;
		focus = 3;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{4, 7, 10, 13, 16, 19, 24, 29, 34, 39, 44};
		moves = new String[]{"Quick Attack", "Focus Energy", "Bite", "Pursuit", "Hyper Fang", "Assurance", "Crunch", "Sucker Punch", "Super Fang", "DoubleEdge", "Endeavor"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Return", "Shadow Ball", "Double Team", "Facade", "Rest", "Attract", "Thief", "Round", "Charge", "Charge Beam", "Giga Impact", "Thunder", "Thunder Wave", "Swords Dance", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Confide"};
		tutorMoves = new String[]{"Body Slam", "Slam", "Covet", "Defense Curl", "Endeavor", "Icy Wind", "Iron Tail", "Last Resort", "Pluck", "Shock Wave", "Snore", "Sucker Punch", "Super Fang", "Superpower", "Swift", "Swords Dance", "Throat Chop", "Uproar", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{"Swords Dance"};
	}
		Raticate(){

		super();
		}
}