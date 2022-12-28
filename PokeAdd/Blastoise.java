public class Blastoise extends Pokemon{
	{
		name = "Blastoise";
		bHP = 8;
		bAtk = 8;
		bDef = 10;
		bSpAtk = 9;
		bSpDef = 11;
		bSpd = 8;
		type1 = "Water";
		type2 = "";
		abilities = new String[]{"Rain Dish", "Torrent", "Shell Armor", "Shell Cannon", "Overcoat"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Wartortle();
		prevReq = 30;
		height = "5\'/3\"";
		weight = 188.5;
		WC = 4;
		maleRatio = 87.5;
		femaleRatio = 12.5;
		egg1 = "Monster";
		egg2 = "Water";
		habitats = new String[]{"Beach", "Freshwater", "Ocean"};
		overland = 6;
		swim = 9;
		levitate = 0;
		burrow = 0;
		lJump = 1 ;
		hJump = 1;
		power = 9;
		natureWalk = new String[]{"Wetlands"};
		underdog = false;
		other = new String[]{"Fountain","Mountable 1"};
		athl = 4;
		acro = 1;
		combat = 4;
		stealth = 1;
		percep = 3;
		focus = 4;
		athlBonus = 2;
		acroBonus = 2;
		combatBonus = 2;
		stealthBonus = 2;
		percepBonus = 3;
		focusBonus = 3;
		movesLevels = new int[]{4, 7, 10, 13, 17, 21, 25, 29, 33, 40, 47, 54, 60};
		moves = new String[]{"Tail Whip", "Water Gun", "Withdraw", "Bubble", "Bite", "Rapid Spin", "Protect", "Water Pulse", "Aqua Tail", "Skull Bash", "Iron Defense", "Rain Dance", "Hydro Pump"};
		TMs = new String[]{"Work Up", "Roar", "Toxic", "Hail", "Hidden Power", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Smack Down", "Earthquake", "Return", "Brick Break", "Double Team", "Rock Tomb", "Facade", "Rest", "Attract", "Round", "Focus Blast", "Scald", "Fling", "Giga Impact", "Gyro Ball", "Bulldoze", "Rock Slide", "Dragon Tail", "Swagger", "Sleep Talk", "Substitute", "Flash", "Flash Cannon", "Surf", "Dark Pulse", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Avalanche", "Body Slam", "Slam", "Brine", "Counter", "Defense Curl", "Dive", "Dragon Pulse", "Dynamic Punch", "Flash Cannon", "Focus Punch", "Hydro Cannon", "Ice Punch", "Icy Wind", "Iron Defense", "Iron Tail", "Liquidation", "Mega Kick", "Mega Punch", "Outrage", "Rollout", "Seismic Toss", "Signal Beam", "Snore", "Water Pledge", "Water Pulse", "Zen Headbutt", "Headbutt"};
		naturalMoves = new String[]{"Flash Cannon"};
	}
		Blastoise(){

		super();
		}
}