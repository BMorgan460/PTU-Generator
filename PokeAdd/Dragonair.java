public class Dragonair extends Pokemon{
	{
		name = "Dragonair";
		bHP = 6;
		bAtk = 8;
		bDef = 7;
		bSpAtk = 7;
		bSpDef = 7;
		bSpd = 7;
		type1 = "Dragon";
		type2 = "";
		abilities = new String[]{"Shed Skin", "Marvel Scale", "Air Lock", "Gentle Vibe", "Confidence"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Dratini();
		prevReq = 30;
		next = new String[]{"Dragonite"};
		nextReq = new String[]{"50"};
		height = "13\'/1\"";
		weight = 36.4;
		WC = 2;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		overland = 5;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 3;
		underdog = true;
		other = new String[]{};
		athl = 4;
		acro = 3;
		combat = 3;
		stealth = 2;
		percep = 3;
		focus = 3;
		athlBonus = 2;
		acroBonus = 0;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 1;
		movesLevels = new int[]{5, 11, 15, 21, 25, 33, 39, 47, 53, 61, 67, 75};
		moves = new String[]{"Thunder Wave", "Twister", "Dragon Rage", "Slam", "Agility", "Dragon Tail", "Aqua Tail", "Dragon Rush", "Safeguard", "Dragon Dance", "Outrage", "Hyper Beam"};
		TMs = new String[]{"Toxic", "Hail", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Safeguard", "Frustration", "Thunderbolt", "Thunder", "Return", "Double Team", "Flamethrower", "Fire Blast", "Facade", "Rest", "Attract", "Round", "Brutal Swing", "Thunder", "Thunder Wave", "Dragon Tail", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Bind", "Body Slam", "Slam", "Draco Meteor", "Dragon Pulse", "Icy Wind", "Iron Tail", "Outrage", "Shock Wave", "Snore", "Swift", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{"Swift", "Twister"};
	}
		Dragonair(){

		super();
		}
}