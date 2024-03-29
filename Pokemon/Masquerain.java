public class Masquerain extends Pokemon{
	{
		name = "Masquerain";
		bHP = 7;
		bAtk = 6;
		bDef = 6;
		bSpAtk = 10;
		bSpDef = 8;
		bSpd = 8;
		type1 = "Bug";
		type2 = "Flying";
		abilities = new String[]{"Intimidate", "Spinning Dance", "Unnerve", "Water Absorb", "Dodge"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Surskit();
		prevReq = 20;
		height = "2\'/7\"";
		weight = 7.9;
		WC = 1;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		habitats = new String[]{"Freshwater"};
		overland = 2;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 1;
		underdog = true;
		other = new String[]{};
		athl = 2;
		acro = 4;
		combat = 1;
		stealth = 4;
		percep = 4;
		focus = 2;
		athlBonus = 0;
		acroBonus = 1;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{6, 9, 14, 17, 22, 22, 26, 32, 38, 42, 48, 52};
		moves = new String[]{"Quick Attack", "Sweet Scent", "Water Sport", "Gust", "Scary Face", "Air Cutter", "Stun Spore", "Silver Wind", "Air Slash", "Bug Buzz", "Whirlwind", "Quiver Dance"};
		TMs = new String[]{"Toxic", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Roost", "Frustration", "Solar Beam", "Return", "Shadow Ball", "Double Team", "Aerial Ace", "Facade", "Rest", "Attract", "Thief", "Round", "Energy Ball", "Scald", "Giga Impact", "Psych Up", "Infestation", "Swagger", "Sleep Talk", "Substitute", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Bug Bite", "Bite", "Bug Buzz", "Defog", "Giga Drain", "Icy Wind", "Liquidation", "Ominous Wind", "Quiver Dance", "Signal Beam", "Snore", "String Shot", "Swift", "Tailwind", "Twister", "Water Pulse"};
		naturalMoves = new String[]{"Bug Buzz", "Ominous Wind", "Quiver Dance", "Whirlwind"};
	}
		Masquerain(){

		super();
		}
}