public class Staraptor extends Pokemon{
	{
		name = "Staraptor";
		bHP = 9;
		bAtk = 12;
		bDef = 7;
		bSpAtk = 5;
		bSpDef = 6;
		bSpd = 10;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Intimidate", "Big Pecks", "Cruelty", "Reckless"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Staravia();
		prevReq = 30;
		height = "3\'/11\"";
		weight = 54.9;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		overland = 4;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 5;
		underdog = false;
		other = new String[]{"Guster","Mountable 1"};
		athl = 4;
		acro = 4;
		combat = 4;
		stealth = 2;
		percep = 4;
		focus = 4;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 18, 23, 28, 33, 34, 41, 49, 57};
		moves = new String[]{"Quick Attack", "Wing Attack", "Double Team", "Endeavor", "Whirlwind", "Aerial Ace", "Take Down", "Close Combat", "Agility", "Brave Bird", "Final Gambit"};
		TMs = new String[]{"Fly", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "Retaliate", "Giga Impact", "Swagger", "Sleep Talk", "Substitute"};
		tutorMoves = new String[]{"Air Cutter", "Defog", "Endeavor", "Heat Wave", "Ominous Wind", "Pluck", "Roost", "Sky Attack", "Sleep Talk", "Snore", "Steel Wing", "Swift", "Tailwind", "Twister", "Work Up"};
		naturalMoves = new String[]{};
	}
		Staraptor(){

		super();
		}
}