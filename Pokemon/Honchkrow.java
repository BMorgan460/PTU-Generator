public class Honchkrow extends Pokemon{
	{
		name = "Honchkrow";
		bHP = 10;
		bAtk = 13;
		bDef = 5;
		bSpAtk = 11;
		bSpDef = 5;
		bSpd = 7;
		type1 = "Dark";
		type2 = "Flying";
		abilities = new String[]{"Insomnia", "Super Luck", "Confidence", "Rally", "Moxie"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Murkrow();
		prevReq = 20;
		height = "2\'/11\"";
		weight = 60.2;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Omnivore";
		habitats = new String[]{"Forest", "Marsh", "Urban"};
		overland = 4;
		swim = 2;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 4;
		underdog = false;
		other = new String[]{"Darkvision","Guster","Pack Mon"};
		athl = 3;
		acro = 3;
		combat = 4;
		stealth = 3;
		percep = 4;
		focus = 3;
		athlBonus = 2;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 2;
		movesLevels = new int[]{5, 11, 15, 21, 25, 31, 35, 41, 45, 50, 55, 61, 65, 75};
		moves = new String[]{"Pursuit", "Haze", "Wing Attack", "Night Shade", "Swagger", "Taunt", "Nasty Plot", "Mean Look", "Foul Play", "Tailwind", "Night Slash", "Torment", "Quash", "Dark Pulse"};
		TMs = new String[]{"Calm Mind", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Return", "Psychic", "Shadow Ball", "Double Team", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Steel Wing", "Quash", "Embargo", "Payback", "Giga Impact", "Thunder", "Thunder Wave", "Fly", "Psych Up", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Snarl", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Defog", "Foul Play", "Heat Wave", "Icy Wind", "Night Slash", "Ominous Wind", "Pluck", "Sky Attack", "Snatch", "Snore", "Spite", "Sucker Punch", "Superpower", "Swift", "Tailwind", "Telekinesis", "Twister", "Uproar"};
		naturalMoves = new String[]{"Night Slash", "Slash", "Sucker Punch"};
	}
		Honchkrow(){

		super();
		}
}