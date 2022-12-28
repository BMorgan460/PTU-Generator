public class Noivern extends Pokemon{
	{
		name = "Noivern";
		bHP = 9;
		bAtk = 7;
		bDef = 8;
		bSpAtk = 10;
		bSpDef = 8;
		bSpd = 12;
		type1 = "Flying";
		type2 = "Dragon";
		abilities = new String[]{"Frisk", "Infiltrator", "Perception", "Sound Lance", "Ambush"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Noibat();
		prevReq = 25;
		height = "4\'/11\"";
		size = "Large";
		weight = 187.4;
		WC = 4;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "Omnivore";
		habitats = new String[]{"Cave"};
		overland = 4;
		swim = 3;
		levitate = 0;
		burrow = 0;
		lJump = 2 ;
		hJump = 2;
		power = 6;
		underdog = false;
		other = new String[]{"Darkvision","Mountable 1"};
		athl = 4;
		acro = 6;
		combat = 4;
		stealth = 4;
		percep = 4;
		focus = 3;
		athlBonus = 0;
		acroBonus = 2;
		combatBonus = 0;
		stealthBonus = 2;
		percepBonus = 2;
		focusBonus = 0;
		movesLevels = new int[]{5, 11, 13, 16, 18, 23, 27, 31, 35, 40, 43, 53, 62, 70, 75};
		moves = new String[]{"Absorb", "Gust", "Bite", "Wing Attack", "Agility", "Air Cutter", "Roost", "Razor Wind", "Tailwind", "Whirlwind", "Super Fang", "Air Slash", "Hurricane", "Dragon Pulse", "Boomburst"};
		TMs = new String[]{"Dragon Claw", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Roost", "Frustration", "Solar Beam", "Return", "Leech Life", "Psychic", "Shadow Ball", "Brick Break", "Double Team", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "Focus Blast", "Acrobatics", "Shadow Claw", "Giga Impact", "Fly", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Defog", "Draco Meteor", "Dragon Pulse", "Heat Wave", "Hyper Voice", "Iron Tail", "Laser Focus", "Outrage", "Sky Attack", "Snatch", "Snore", "Super Fang", "Tailwind", "Uproar", "Water Pulse"};
		naturalMoves = new String[]{"Boomburst", "Dragon Pulse", "Hurricane", "Moonlight", "Outrage", "Screech"};
	}
		Noivern(){

		super();
		}
}