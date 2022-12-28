public class Mantine extends Pokemon{
	{
		name = "Mantine";
		bHP = 9;
		bAtk = 4;
		bDef = 7;
		bSpAtk = 8;
		bSpDef = 14;
		bSpd = 7;
		type1 = "Water";
		type2 = "Flying";
		abilities = new String[]{"Water Absorb", "Wonder Skin", "Serene Grace", "Swift Swim", "Water Veil"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Mantyke();
		prevReq = 10;
		height = "6\'/11\"";
		size = "Large";
		weight = 485;
		WC = 6;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = "Diet";
		habitats = new String[]{"Ocean"};
		overland = 2;
		swim = 8;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 3;
		power = 5;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Fountain","Gilled","Mountable 1"};
		athl = 4;
		acro = 4;
		combat = 2;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 0;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 1;
		focusBonus = 0;
		movesLevels = new int[]{3, 7, 11, 14, 16, 19, 23, 27, 32, 36, 39, 46, 49};
		moves = new String[]{"Supersonic", "Bubble Beam", "Confuse Ray", "Wing Attack", "Headbutt", "Water Pulse", "Wide Guard", "Take Down", "Agility", "Air Slash", "Aqua Ring", "Bounce", "Hydro Pump"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Earthquake", "Return", "Double Team", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Scald", "Acrobatics", "Giga Impact", "Bulldoze", "Rock Slide", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Aqua Ring", "Aqua Tail", "Body Slam", "Slam", "Bounce", "Brine", "Bullet Seed", "Defog", "Dive", "Gunk Shot", "Helping Hand", "Icy Wind", "Iron Head", "Liquidation", "Seed Bomb", "Signal Beam", "Snore", "String Shot", "Swift", "Tailwind", "Twister", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{"Bullet Seed", "Psybeam", "Roost", "Signal Beam"};
	}
		Mantine(){

		super();
		}
}