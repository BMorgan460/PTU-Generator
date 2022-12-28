public class Talonflame extends Pokemon{
	{
		name = "Talonflame";
		bHP = 8;
		bAtk = 8;
		bDef = 7;
		bSpAtk = 7;
		bSpDef = 7;
		bSpd = 13;
		type1 = "Fire";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Gale Wings", "Flame Body", "Accelerate", "Rocket"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Fletchinder();
		prevReq = 30;
		height = "3\'/11\"";
		weight = 54;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 4;
		underdog = false;
		other = new String[]{"Firestarter","Guster","Mountable 1"};
		athl = 4;
		acro = 5;
		combat = 4;
		stealth = 2;
		percep = 4;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{6, 10, 13, 16, 25, 27, 31, 39, 44, 49, 55, 60, 64};
		moves = new String[]{"Quick Attack", "Peck", "Agility", "Flail", "Roost", "Razor Wind", "Natural Gift", "Flame Charge", "Acrobatics", "Me First", "Tailwind", "Steel Wing", "Brave Bird"};
		TMs = new String[]{"Work Up", "Toxic", "Bulk Up", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Roost", "Frustration", "Solar Beam", "Return", "Double Team", "Flamethrower", "Fire Blast", "Aerial Ace", "Facade", "Flame Charge", "Rest", "Attract", "Thief", "Round", "Overheat", "Steel Wing", "Acrobatics", "Giga Impact", "Swords Dance", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Brave Bird", "Defog", "Flare Blitz", "Heat Wave", "Snatch", "Snore", "Tailwind"};
		naturalMoves = new String[]{"Brave Bird", "Defog", "Ember", "Flare Blitz"};
	}
		Talonflame(){

		super();
		}
}