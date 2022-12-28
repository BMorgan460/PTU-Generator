public class Liepard extends Pokemon{
	{
		name = "Liepard";
		bHP = 6;
		bAtk = 9;
		bDef = 5;
		bSpAtk = 9;
		bSpDef = 5;
		bSpd = 11;
		type1 = "Dark";
		type2 = "";
		abilities = new String[]{"Limber", "Unburden", "Cruelty", "Prankster", "Vicious"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Purrloin();
		prevReq = 20;
		height = "3\'/7\"";
		weight = 82.7;
		WC = 3;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Field";
		egg2 = "Carnivore";
		habitats = new String[]{"Forest", "Grassland", "Rainforest"};
		overland = 8;
		swim = 4;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 4;
		natureWalk = new String[]{"Grassland", "Urban"};
		underdog = true;
		other = new String[]{"Darkvision","Stealth"};
		athl = 3;
		acro = 4;
		combat = 3;
		stealth = 4;
		percep = 2;
		focus = 3;
		athlBonus = 1;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{3, 6, 10, 12, 15, 19, 22, 26, 31, 34, 38, 43, 47, 50, 55, 58};
		moves = new String[]{"Growl", "Assist", "Sand Attack", "Fury Swipes", "Pursuit", "Torment", "Fake Out", "Hone Claws", "Assurance", "Slash", "Taunt", "Night Slash", "Snatch", "Nasty Plot", "Sucker Punch", "Play Rough"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Return", "Shadow Ball", "Double Team", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Embargo", "Shadow Claw", "Payback", "Giga Impact", "Thunder", "Thunder Wave", "Psych Up", "Dream Eater", "Grass Knot", "Swagger", "Sleep Talk", "Substitute", "Snarl", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Covet", "Foul Play", "Gunk Shot", "Hyper Voice", "Iron Tail", "Knock Off", "Laser Focus", "Role Play", "Seed Bomb", "Snatch", "Snore", "Spite", "Throat Chop", "Trick"};
		naturalMoves = new String[]{};
	}
		Liepard(){

		super();
		}
}