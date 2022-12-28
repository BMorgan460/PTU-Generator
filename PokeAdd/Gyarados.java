public class Gyarados extends Pokemon{
	{
		name = "Gyarados";
		bHP = 10;
		bAtk = 13;
		bDef = 8;
		bSpAtk = 6;
		bSpDef = 10;
		bSpd = 8;
		type1 = "Water";
		type2 = "Flying";
		abilities = new String[]{"Intimidate", "Frighten", "Steadfast", "Swift Swim", "Moxie"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Magikarp();
		prevReq = 20;
		height = "21\'/4\"";
		size = "Huge";
		weight = 518.1;
		WC = 6;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		overland = 5;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 4 ;
		hJump = 4;
		power = 13;
		natureWalk = new String[]{"Ocean"};
		underdog = false;
		other = new String[]{"Fountain","Gilled","Mountable 4","Reach"};
		athl = 6;
		acro = 3;
		combat = 4;
		stealth = 2;
		percep = 3;
		focus = 4;
		athlBonus = 1;
		acroBonus = 0;
		combatBonus = 2;
		stealthBonus = 0;
		percepBonus = 0;
		focusBonus = 0;
		movesLevels = new int[]{21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54};
		moves = new String[]{"Leer", "Twister", "Ice Fang", "Aqua Tail", "Scary Face", "Dragon Rage", "Crunch", "Hydro Pump", "Dragon Dance", "Hurricane", "Rain Dance", "Hyper Beam"};
		TMs = new String[]{"Roar", "Toxic", "Hail", "Hidden Power", "Taunt", "Ice Beam", "Blizzard", "Hyper Beam", "Protect", "Rain Dance", "Frustration", "Thunderbolt", "Thunder", "Earthquake", "Return", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Torment", "Facade", "Rest", "Attract", "Round", "Scald", "Brutal Swing", "Payback", "Giga Impact", "Stone Edge", "Thunder", "Thunder Wave", "Bulldoze", "Dragon Tail", "Swagger", "Sleep Talk", "Substitute", "Surf", "Dark Pulse", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Aqua Tail", "Avalanche", "Body Slam", "Slam", "Bounce", "Brine", "Dive", "Dragon Pulse", "Icy Wind", "Iron Head", "Iron Tail", "Outrage", "Snore", "Spite", "Twister", "Uproar", "Water Pulse"};
		naturalMoves = new String[]{"Spite", "Thrash"};
	}
		Gyarados(){

		super();
		}
}