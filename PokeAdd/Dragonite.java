public class Dragonite extends Pokemon{
	{
		name = "Dragonite";
		bHP = 9;
		bAtk = 13;
		bDef = 10;
		bSpAtk = 10;
		bSpDef = 10;
		bSpd = 8;
		type1 = "Dragon";
		type2 = "Flying";
		abilities = new String[]{"Inner Focus", "Multiscale", "Courage", "Rocket", "Confidence"};
		abilityTypeCount = new int[] {1,3,1};
		previous = new Dragonair();
		prevReq = 50;
		height = "7\'/3\"";
		size = "Large";
		weight = 463;
		WC = 6;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Water";
		egg2 = " ";
		habitats = new String[]{"Cave", "Freshwater", "Mountain"};
		overland = 6;
		swim = 6;
		levitate = 0;
		burrow = 0;
		lJump = 3 ;
		hJump = 4;
		power = 8;
		underdog = false;
		other = new String[]{"Aura Reader","Mountable 1"};
		athl = 5;
		acro = 4;
		combat = 4;
		stealth = 1;
		percep = 4;
		focus = 4;
		athlBonus = 3;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 0;
		percepBonus = 2;
		focusBonus = 3;
		movesLevels = new int[]{5, 11, 15, 21, 25, 33, 39, 47, 53, 61, 67, 75, 81};
		moves = new String[]{"Thunder Wave", "Twister", "Dragon Rage", "Slam", "Agility", "Dragon Tail", "Aqua Tail", "Dragon Rush", "Safeguard", "Dragon Dance", "Outrage", "Hyper Beam", "Hurricane"};
		TMs = new String[]{"Dragon Claw", "Roar", "Toxic", "Hail", "Hidden Power", "Sunny Day", "Ice Beam", "Blizzard", "Hyper Beam", "Light Screen", "Protect", "Rain Dance", "Roost", "Safeguard", "Frustration", "Thunderbolt", "Thunder", "Earthquake", "Return", "Brick Break", "Double Team", "Flamethrower", "Sandstorm", "Fire Blast", "Rock Tomb", "Aerial Ace", "Facade", "Rest", "Attract", "Round", "Steel Wing", "Focus Blast", "Fling", "Sky Drop", "Brutal Swing", "Giga Impact", "Stone Edge", "Thunder", "Thunder Wave", "Fly", "Bulldoze", "Dragon Tail", "Swagger", "Sleep Talk", "Substitute", "Surf", "Waterfall", "Confide"};
		tutorMoves = new String[]{"Air Cutter", "Aqua Tail", "Bind", "Body Slam", "Slam", "Defog", "Dive", "Draco Meteor", "Dragon Pulse", "Dynamic Punch", "Fire Punch", "Focus Punch", "Fury Cutter", "Heat Wave", "Ice Punch", "Icy Wind", "Iron Tail", "Ominous Wind", "Outrage", "Shock Wave", "Snore", "Superpower", "Swift", "Tailwind", "Thunder Punch", "Water Pulse", "Whirlpool"};
		naturalMoves = new String[]{"Fire Punch", "Hurricane", "Outrage", "Roost", "Thunder Punch", "Twister"};
	}
		Dragonite(){

		super();
		}
}