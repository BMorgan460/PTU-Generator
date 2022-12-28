public class Pidgeot extends Pokemon{
	{
		name = "Pidgeot";
		bHP = 8;
		bAtk = 8;
		bDef = 8;
		bSpAtk = 7;
		bSpDef = 7;
		bSpd = 10;
		type1 = "Normal";
		type2 = "Flying";
		abilities = new String[]{"Keen Eye", "Tangled Feet", "Rocket", "Blow Away", "Competitive"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Pidgeotto();
		prevReq = 30;
		height = "4\'/11\"";
		size = "Large";
		weight = 87.1;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Carnivore";
		habitats = new String[]{"Forest"};
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
		combatBonus = 1;
		stealthBonus = 0;
		percepBonus = 3;
		focusBonus = 0;
		movesLevels = new int[]{5, 9, 13, 17, 22, 27, 32, 38, 44, 50, 56, 62, 68};
		moves = new String[]{"Sand Attack", "Gust", "Quick Attack", "Whirlwind", "Twister", "Feather Dance", "Agility", "Wing Attack", "Roost", "Tailwind", "Mirror Move", "Air Slash", "Hurricane"};
		TMs = new String[]{"Work Up", "Toxic", "Hidden Power", "Sunny Day", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Steel Wing", "Giga Impact", "Fly", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Defog", "Heat Wave", "Laser Focus", "Ominous Wind", "Pluck", "Sky Attack", "Snore", "Swift", "Tailwind", "Twister", "Uproar"};
		naturalMoves = new String[]{"Hurricane"};
	}
		Pidgeot(){

		super();
		}
}