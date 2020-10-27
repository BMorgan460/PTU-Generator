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
		abilities = new String[]{"Frisk", "Infiltrator", "Telepathy", "Instinct", "Sound Lance"};
		abilityTypeCount = new int[] {2,2,1};
		previous = new Noibat();
		prevReq = 35;
		height = "4\'/11\"";
		size = "Large";
		weight = 187.4;
		WC = 8;
		maleRatio = 50.0;
		femaleRatio = 50.0;
		egg1 = "Flying";
		egg2 = "";
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
		movesLevels = new int[]{1, 1, 1, 5, 11, 13, 16, 18, 23, 27, 31, 35, 40, 43, 53, 62, 70, 75};
		moves = new String[]{"Scratch", "Supersonic", "Tackle", "Leech Life", "Gust", "Bite", "Wing Attack", "Agility", "Air Cutter", "Roost", "Razor Wind", "Tailwind", "Whirlwind", "Super Fang", "Air Slash", "Hurricane", "Dragon Pulse", "Boomburst"};
		TMs = new String[]{"Cut", "Fly", "Hone Claws", "Dragon Claw", "Toxic", "Hidden Power", "Sunny Day", "Taunt", "Hyper Beam", "Protect", "Roost", "Frustration", "Solar Beam", "Return", "Psychic", "Shadow Ball", "Brick Break", "Double Team", "Flamethrower", "Aerial Ace", "Torment", "Facade", "Rest", "Attract", "Thief", "Round", "Echoed Voice", "Steel Wing", "Focus Blast", "Acrobatics", "Shadow Claw", "Dream Eater", "Swagger", "Sleep Talk", "Substitute", "Wild Charge", "Dark Pulse", "Confide"};
		tutorMoves = new String[]{"Draco Meteor", "Dragon Pulse", "Heat Wave", "Hyper Voice", "Iron Tail", "Outrage", "Sky Attack", "Snatch", "Snore", "Super Fang", "Tailwind", "Uproar", "Water Pulse"};
		naturalMoves = new String[]{"Boomburst", "Dragon Pulse", "Hurricane", "Moonlight"};
	}
		Noivern(){

		super();
		}
}