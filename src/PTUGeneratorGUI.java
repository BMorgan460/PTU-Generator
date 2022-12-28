import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class PTUGeneratorGUI {

	private static String location;
	private final static String[] ARCTIC   = { "Spheal", "Sealeo", "Walrein", "Cloyster", "Seel", "Dewgong", "Lapras", "Bergmite", "Avalugg", "Popplio", "Brionne", "Primarina", "Alolan_sandshrew", "Alolan_sandslash", "Alolan_vulpix", "Alolan_ninetales"};
    private final static String[] BEACH    = { "Squirtle", "Wartortle", "Blastoise", "Totodile", "Croconaw", "Feraligatr", "Piplup", "Prinplup", "Empoleon", "Oshawott", "Dewott", "Samurott", "Sandile", "Krookodile", "Nosepass", "Slowpoke", "Slowbro", "Slowking", "Wingull", "Pelipper", "Krabby", "Kingler", "Crawdaunt", "Shellos", "Gastrodon", "Binacle", "Barbaracle", "Popplio", "Brionne", "Primarina", "Crabrawler", "Crabominable", "Comfey", "Sandygast", "Pallosand", "Pyukumuku", "Alolan_exeggutor" };
    private final static String[] CAVE     = { "Charmander", "Charmeleon", "Charizard", "Cyndaquil", "Quilava", "Typhlosion", "Chimchar", "Monferno", "Infernape", "Pignite", "Emboar", "Zubat", "Golbat", "Crobat", "Cleffa", "Clefairy", "Clefable", "Igglybuff", "Jigglypuff", "Wigglytuff", "Whismur", "Loudred", "Exploud", "Weepinbell", "Victreebel", "Shinx", "Luxio", "Luxray", "Tynamo", "Eelektrik", "Eelektross", "Magby", "Magmar", "Magmortar", "Vanillite", "Vanillish", "Vanilluxe", "Solosis", "Duosion", "Reuniclus", "Machop", "Geodude", "Graveler", "Golem", "Roggenrola", "Boldore", "Gigalith", "Rhyhorn", "Rhydon", "Swinub", "Piloswine", "Aron", "Lairon", "Aggron", "Klink", "Klang", "Klinklang", "Gastly", "Haunter", "Gengar", "Duskull", "Dusclops", "Dusknoir", "Litwick", "Lampent", "Chandelure", "Axew", "Fraxure", "Haxorus", "Rattata", "Raticate", "Teddiursa", "Ursaring", "Paras", "Parasect", "Ariados", "Dwebble", "Crustle", "Joltik", "Galvantula", "Larvesta", "Volcarona", "Rufflet", "Sandshrew", "Sandslash", "Diglett", "Dugtrio", "Cubone", "Marowak", "Gligar", "Gliscor", "Baltoy", "Claydol", "Hippopotas", "Hippowdon", "Drilbur", "Excadrill", "Nosepass", "Onix", "Steelix", "Bronzor", "Bronzong", "Foongus", "Amoonguss", "Ferroseed", "Ferrothorn", "Slugma", "Magcargo", "Darumaka", "Darmanitan", "Glalie", "Cubchoo", "Beartic", "Natu", "Xatu", "Woobat", "Swoobat", "Chingling", "Chimecho", "Wynaut", "Wobbuffet", "Mienfoo", "Mienshao", "Makuhita", "Hariyama", "Meditite", "Medicham", "Riolu", "Lucario", "Vullaby", "Houndour", "Houndoom", "Scrafty", "Sneasel", "Weavile", "Pawniard", "Bisharp", "Misdreavus", "Mismagius", "Shuppet", "Banette", "Dunsparce", "Smeargle", "Shuckle", "Durant", "Torkoal", "Heatmor", "Cryogonal", "Mawile", "Sableye", "Spiritomb", "Druddigon", "Solrock", "Lunatone", "Sawk", "Throh", "Unown", "Flareon", "Umbreon", "Omanyte", "Kabutops", "Lileep", "Cradily", "Anorith", "Armaldo", "Cranidos", "Rampardos", "Shieldon", "Bastiodon", "Aerodactyl", "Dratini", "Dragonair", "Dragonite", "Larvitar", "Pupitar", "Tyranitar", "Bagon", "Shelgon", "Salamence", "Beldum", "Metang", "Metagross", "Gible", "Gabite", "Garchomp", "Deino", "Zweilous", "Hydreigon", "Tyrunt", "Tyrantrum", "Amaura", "Aurorus", "Carbink", "Noibat", "Noivern", "Salandit", "Salazzle", "Turtonator", "Drampa", "Jangmo-o", "Hakamo-o", "Kommo-o", "Alolan_rattata", "Alolan_raticate", "Alolan_diglett", "Alolan_dugtrio", "Alolan_geodude", "Alolan_graveler", "Alolan_golem", "Alolan_marowak" };
    private final static String[] DESERT   = { "Sandile", "Krokorok", "Krookodile", "Trapinch", "Vibrava", "Flygon", "Burmy", "Wormadam", "Mothim", "Nincada", "Ninjask", "Shedinja", "Dwebble", "Crustle", "Doduo", "Dodrio", "Sandshrew", "Sandslash", "Gligar", "Donphan", "Hippopotas", "Hippowdon", "Golett", "Golurk", "Steelix", "Cacnea", "Cacturne", "Numel", "Camerupt", "Darumaka", "Darmanitan", "Xatu", "Vullaby", "Mandibuzz", "Scraggy", "Scrafty", "Yamask", "Cofagrigus", "Dunsparce", "Zangoose", "Seviper", "Durant", "Maractus", "Torkoal", "Heatmor", "Sigilyph", "Gible", "Gabite", "Garchomp", "Helioptile", "Heliolisk", "Sandygast", "Pallosand", "Jangmo-o", "Hakamo-o", "Kommo-o" };
    private final static String[] FOREST   = { "Bulbasaur", "Ivysaur", "Venusaur", "Chikorita", "Bayleef", "Meganium", "Turtwig", "Grotle", "Torterra", "Snivy", "Servine", "Serperior", "Tepig", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill", "Sewaddle", "Swadloon", "Leavanny", "Venipede", "Whirlipede", "Scolipede", "Wurmple", "Silcoon", "Beautifly", "Cascoon", "Dustox", "Pidgey", "Pidgeotto", "Pidgeot", "Togepi", "Togetic", "Togekiss", "Starly", "Staravia", "Staraptor", "Pidove", "Tranquill", "Unfezant", "Slakoth", "Vigoroth", "Slaking", "Oddish", "Gloom", "Vileplume", "Bellsprout", "Weepinbell", "Victreebel", "Hoppip", "Skiploom", "Jumpluff", "Ludicolo", "Seedot", "Nuzleaf", "Shiftry", "Budew", "Roselia", "Roserade", "Pichu", "Pikachu", "Raichu", "Elekid", "Electabuzz", "Electivire", "Ralts", "Kirlia", "Gardevoir", "Gallade", "Abra", "Kadabra", "Gothita", "Gothorita", "Solosis", "Duosion", "Reuniclus", "Duskull", "Dusclops", "Dusknoir", "Rattata", "Raticate", "Sentret", "Furret", "Zigzagoon", "Linoone", "Bidoof", "Bibarel", "Patrat", "Watchog", "Meowth", "Persian", "Skitty", "Delcatty", "Glameow", "Purugly", "Minccino", "Cinccino", "Buneary", "Lopunny", "Snubbull", "Granbull", "Aipom", "Ambipom", "Deerling", "Sawsbuck", "Lickitung", "Lickilicky", "Munchlax", "Snorlax", "Burmy", "Wormadam", "Mothim", "Nincada", "Ninjask", "Shedinja", "Venonat", "Venomoth", "Ledyba", "Ledian", "Spinarak", "Ariados", "Yanma", "Yanmega", "Pineco", "Forretress", "Kricketot", "Kricketune", "Combee", "Vespiquen", "Karrablast", "Escavalier", "Shelmet", "Accelgor", "Joltik", "Galvantula", "Scyther", "Hoothoot", "Noctowl", "Taillow", "Swellow", "Rufflet", "Braviary", "Swablu", "Altaria", "Stunky", "Skuntank", "Skorupi", "Drapion", "Dugtrio", "Gligar", "Phanpy", "Bonsly", "Sudowoodo", "Bronzor", "Sunkern", "Tangela", "Cherubi", "Cherrim", "Whimsicott", "Petilil", "Lilligant", "Foongus", "Amoonguss", "Shroomish", "Breloom", "Exeggcute", "Exeggutor", "Electrike", "Manectric", "Natu", "Xatu", "Spoink", "Grumpig", "Munna", "Musharna", "Mankey", "Primeape", "Lucario", "Murkrow", "Honchkrow", "Purrloin", "Liepard", "Poochyena", "Mightyena", "Zorua", "Zoroark", "Misdreavus", "Mismagius", "Drifloon", "Drifblim", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour", "Chatot", "Dunsparce", "Stantler", "Audino", "Spinda", "Kecleon", "Castform", "Smeargle", "Zangoose", "Seviper", "Shuckle", "Pinsir", "Heracross", "Tropius", "Pachirisu", "Emolga", "Mawile", "Absol", "Spiritomb", "Plusle", "Minun", "Volbeat", "Illumise", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Espeon", "Umbreon", "Leafeon", "Chespin", "Quilladin", "Chesnaught", "Fennekin", "Braixen", "Delphox", "Bunnelby", "Diggersby", "Fletchling", "Fletchinder", "Talonflame", "Scatterbug", "Spewpa", "Vivillon", "Flabébé", "Floette", "Florges", "Skiddo", "Gogoat", "Pancham", "Pangoro", "Spritzee", "Aromatisse", "Hawlucha", "Dedenne", "Phantump", "Trevenant", "Pumpkaboo", "Gourgeist", "Rowlet", "Dartrix", "Decidueye", "Litten", "Torracat", "Incineroar", "Pikipek", "Trumbeak", "Toucannon", "Grubbin", "Charjabug", "Vikavolt", "Oricorio", "Cutiefly", "Ribombee", "Fomantis", "Lurantis", "Morelull", "Shiinotic", "Stufful", "Bewear", "Bounsweet", "Steenee", "Tsareena", "Comfey", "Oranguru", "Passimian", "Komala", "Togedemaru", "Mimikyu", "Drampa", "Alolan_rattata", "Alolan_raticate", "Alolan_raichu", "Alolan_meowth", "Alolan_persian", "Alolan_Exeggutor" };
    private final static String[] FRESH    = { "Squirtle", "Wartortle", "Blastoise", "Totodile", "Croconaw", "Feraligatr", "Lotad", "Lombre", "Ludicolo", "Tynamo", "Eelektrik", "Eelektross", "Poliwag", "Poliwhirl", "Poliwrath", "Politoed", "Azurill", "Marill", "Azumarill", "Tympole", "Palpitoad", "Seismitoad", "Surskit", "Masquerain", "Croagunk", "Toxicroak", "Slowpoke", "Slowbro", "Slowking", "Goldeen", "Seaking", "Barboach", "Whiscash", "Carvanha", "Sharpedo", "Ducklett", "Swanna", "Psyduck", "Golduck", "Wooper", "Quagsire", "Buizel", "Floatzel", "Magikarp", "Gyarados", "Feebas", "Milotic", "Farfetch_d", "Stunfisk", "Vaporeon", "Dratini", "Dragonair", "Dragonite", "Froakie", "Frogadier", "Greninja", "Popplio", "Brionne", "Primarina", "Crabrawler", "Crabominable", "Wishiwashi", "Dewpider", "Araquanid", "Wimpod", "Golisopod" };
    private final static String[] GRASS    = { "Bulbasaur", "Ivysaur", "Venusaur", "Chikorita", "Bayleef", "Meganium", "Torchic", "Combusken", "Blaziken", "Tepig", "Pignite", "Emboar", "Starly", "Staravia", "Staraptor", "Pidove", "Tranquill", "Unfezant", "Nidoran", "F", "Nidorina", "Nidoqueen", "Nidoran", "M", "Nidorino", "Nidoking", "Igglybuff", "Jigglypuff", "Wigglytuff", "Happiny", "Chansey", "Blissey", "Lillipup", "Herdier", "Stoutland", "Oddish", "Gloom", "Vileplume", "Hoppip", "Skiploom", "Jumpluff", "Budew", "Roselia", "Roserade", "Pichu", "Pikachu", "Mareep", "Flaaffy", "Ampharos", "Shinx", "Luxio", "Luxray", "Elekid", "Electabuzz", "Electivire", "Rhyhorn", "Rhydon", "Rattata", "Raticate", "Sentret", "Furret", "Zigzagoon", "Linoone", "Bidoof", "Bibarel", "Patrat", "Watchog", "Skitty", "Delcatty", "Glameow", "Purugly", "Minccino", "Cinccino", "Buneary", "Lopunny", "Deerling", "Sawsbuck", "Lickitung", "Lickilicky", "Kricketot", "Kricketune", "Dwebble", "Crustle", "Karrablast", "Scyther", "Scizor", "Spearow", "Fearow", "Doduo", "Dodrio", "Taillow", "Swellow", "Ekans", "Arbok", "Stunky", "Skuntank", "Gulpin", "Swalot", "Trubbish", "Garbodor", "Sandshrew", "Sandslash", "Diglett", "Dugtrio", "Bonsly", "Sunkern", "Sunflora", "Tangela", "Cottonee", "Whimsicott", "Foongus", "Amoonguss", "Vulpix", "Ninetales", "Growlithe", "Arcanine", "Ponyta", "Rapidash", "Buizel", "Floatzel", "Electrike", "Manectric", "Blitzle", "Zebstrika", "Spoink", "Grumpig", "Musharna", "Drowzee", "Hypno", "Wynaut", "Wobbuffet", "Mankey", "Primeape", "Purrloin", "Liepard", "Poochyena", "Mightyena", "Zorua", "Farfetch’d", "Dunsparce", "Miltank", "Tauros", "Bouffalant", "Audino", "Spinda", "Kangaskhan", "Girafarig", "Absol", "Plusle", "Minun", "Volbeat", "Illumise", "Ditto", "Eevee", "Espeon", "Leafeon", "Chespin", "Quilladin", "Chesnaught", "Fennekin", "Braixen", "Delphox", "Bunnelby", "Diggersby", "Fletchling", "Fletchinder", "Talonflame", "Scatterbug", "Spewpa", "Vivillon", "Litleo", "Pyroar", "Flabébé", "Floette", "Florges", "Skiddo", "Gogoat", "Pancham", "Pangoro", "Furfrou", "Espurr", "Meowstic", "Honedge", "Doublade", "Aeigslash", "Spritzee", "Aromatisse", "Swirlix", "Slurpuff", "Sylveon", "Hawlucha", "Dedenne", "Klefki", "Pumpkaboo", "Gourgeist", "Litten", "Torracat", "Incineroar", "Pikipek", "Trombeak", "Toucannon", "Yungoos", "Gumshoos", "Grubbin", "Charjabug", "Vikavolt", "Oricorio", "Cutiefly", "Ribombee", "Rockruff", "Lycanroc_midday", "Lycanroc_midnight", "Lycanroc_dusk", "Mudbray", "Mudsdale", "Fomantis", "Lurantis", "Morelull", "Shiinotic", "Salandit", "Salazzle", "Stufful", "Bewear", "Comfey", "Komala", "Turtonator", "Togedemaru", "Mimikyu", "Alolan_rattata", "Alolan_raticate" };
    private final static String[] MARSH    = { "Turtwig", "Grotle", "Torterra", "Totodile", "Croconaw", "Feraligatr", "Mudkip", "Marshtomp", "Oddish", "Gloom", "Vileplume", "Bellossom", "Bellsprout", "Weepinbell", "Victreebel", "Poliwag", "Poliwhirl", "Poliwrath", "Politoed", "Tympole", "Palpitoad", "Seismitoad", "Bidoof", "Bibarel", "Yanma", "Yanmega", "Shelmet", "Ekans", "Koffing", "Weezing", "Gulpin", "Swalot", "Garbodor", "Skorupi", "Drapion", "Croagunk", "Toxicroak", "Tangrowth", "Shroomish", "Breloom", "Barboach", "Whiscash", "Ducklett", "Swanna", "Corphish", "Crawdaunt", "Wooper", "Quagsire", "Drowzee", "Hypno", "Murkrow", "Honchkrow", "Farfetch’d", "Carnivine", "Tropius", "Stunfisk", "Froakie", "Frogadier", "Greninja", "Goomy", "Sliggoo", "Goodra", "Dewpider", "Araquanid", "Wimpod", "Golisopod" };
    private final static String[] MOUNTAIN = { "Charmander", "Charmeleon", "Charizard", "Cyndaquil", "Quilava", "Typhlosion", "Chimchar", "Monferno", "Infernape", "Tepig", "Pignite", "Emboar", "Nidoqueen", "Nidoking", "Cleffa", "Clefairy", "Clefable", "Magnemite", "Magneton", "Magnezone", "Ampharos", "Luxray", "Magby", "Magmar", "Magmortar", "Machop", "Machoke", "Machamp", "Timburr", "Gurdurr", "Conkeldurr", "Geodude", "Graveler", "Golem", "Roggenrola", "Boldore", "Gigalith", "Rhyhorn", "Rhydon", "Rhyperior", "Aron", "Lairon", "Aggron", "Duskull", "Dusclops", "Flygon", "Axew", "Fraxure", "Haxorus", "Rattata", "Raticate", "Teddiursa", "Ursaring", "Munchlax", "Snorlax", "Wormadam", "Dwebble", "Crustle", "Scizor", "Larvesta", "Volcarona", "Spearow", "Fearow", "Rufflet", "Braviary", "Koffing", "Weezing", "Cubone", "Marowak", "Gligar", "Gliscor", "Phanpy", "Donphan", "Drilbur", "Excadrill", "Golett", "Golurk", "Nosepass", "Probopass", "Onix", "Steelix", "Bronzor", "Bronzong", "Vulpix", "Ninetales", "Growlithe", "Arcanine", "Slugma", "Magcargo", "Numel", "Camerupt", "Darumaka", "Darmanitan", "Swoobat", "Elgyem", "Beheeyem", "Wynaut", "Wobbuffet", "Tyrogue", "Hitmonlee", "Hitmonchan", "Hitmontop", "Mankey", "Primeape", "Mienfoo", "Mienshao", "Makuhita", "Hariyama", "Meditite", "Medicham", "Riolu", "Lucario", "Vullaby", "Mandibuzz", "Houndour", "Houndoom", "Scrafty", "Scraggy", "Pawniard", "Bisharp", "Smeargle", "Zangoose", "Seviper", "Shuckle", "Durant", "Maractus", "Torkoal", "Heatmor", "Delibird", "Girafarig", "Mawile", "Skarmory", "Absol", "Sableye", "Lunatone", "Solrock", "Sawk", "Throh", "Flareon", "Cranidos", "Rampardos", "Shieldon", "Bastiodon", "Archen", "Archeops", "Aerodactyl", "Dragonite", "Larvitar", "Pupitar", "Tyranitar",  "Bagon", "Shelgon", "Salamence", "Metagross", "Garchomp", "Deino", "Zweilous", "Hydreigon", "Bunnelby", "Diggersby", "Helioptile", "Heliolisk", "Tyrunt", "Tyrantrum", "Amaura", "Aurorus", "Bergmite", "Avalugg", "Grubbin", "Charjabug", "Vikavolt", "Rockruff", "Lycanroc_midday", "Lycanroc_midnight", "Lycanroc_dusk", "Salandit", "Salazzle", "Minior", "Turtonator", "Drampa", "Jangmo-o", "Hakamo-o", "Kommo-o", "Alolan_rattata", "Alolan_raticate", "", "Alolan_sandshrew", "Alolan_sandslash", "Alolan_diglett", "Alolan_dugtrio", "Alolan_geodude", "Alolan_graveler", "Alolan_golem", "Alolan_marowak" };
    private final static String[] OCEAN    = { "Squirtle", "Wartortle", "Blastoise", "Oshawott", "Dewott", "Samurott", "Horsea", "Seadra", "Kingdra", "Spheal", "Sealeo", "Walrein", "Clamperl", "Huntail", "Gorebyss", "Finneon", "Lumineon", "Chinchou", "Lanturn", "Carvanha", "Sharpedo", "Tentacool", "Tentacruel", "Frillish", "Jellicent", "Shellder", "Cloyster", "Corphish", "Crawdaunt", "Staryu", "Starmie", "Seel", "Dewgong", "Shellos", "Gastrodon", "Remoraid", "Octillery", "Mantyke", "Mantine", "Magikarp", "Gyarados", "Wailmer", "Wailord", "Qwilfish", "Basculin", "Relicanth", "Corsola", "Luvdisc", "Alomomola", "Lapras", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Lileep", "Cradily", "Anorith", "Tirtouga", "Carracosta", "Inkay", "Malamar", "Binacle", "Barbaracle", "Skrelp", "Dragalge", "Clauncher", "Clawitzer","Popplio", "Brionne", "Primarina", "Wishiwashi", "Mareanie", "Toxapex", "Wimpod", "Golisopod", "Pyukumuku", "Bruxish", "Dhelmise" };
    private final static String[] RAIN     = { "Bulbasaur", "Ivysaur", "Venusaur", "Treecko", "Grovyle", "Sceptile", "Turtwig", "Grotle", "Torterra", "Snivy", "Servine", "Serperior", "Wurmple", "Silcoon", "Beautifly", "Cascoon", "Dustox", "Togepi", "Togetic", "Togekiss", "Slakoth", "Vigoroth", "Slaking", "Oddish", "Gloom", "Vileplume", "Bellossom", "Bellsprout", "Weepinbell", "Victreebel", "Seedot", "Nuzleaf", "Shiftry", "Budew", "Roselia", "Roserade", "Aipom", "Ambipom", "Lickitung", "Lickilicky", "Burmy", "Wormadam", "Mothim", "Paras", "Parasect", "Venonat", "Venomoth", "Ledyba", "Ledian", "Spinarak", "Ariados", "Scyther", "Swablu", "Altaria", "Skorupi", "Drapion", "Tangela", "Tangrowth", "Cherubi", "Petilil", "Lilligant", "Shroomish", "Breloom", "Exeggcute", "Exeggutor", "Mankey", "Primeape", "Purrloin", "Liepard", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour", "Chatot", "Kangaskhan", "Shuckle", "Pinsir", "Heracross", "Carnivine", "Tropius", "Volbeat", "Illumise", "Leafeon", "Chespin", "Quilladin", "Chesnaught", "Goomy", "Sliggoo", "Goodra", "Rowlet", "Dartrix", "Decidueye", "Pikipek", "Trombeak", "Toucannon", "Oricorio", "Dewpider", "Araquanid", "Morelull", "Shiinotic", "Bounsweet", "Steenee", "Tsareena", "Comfey", "Oranguru", "Passimian", "Alolan_exeggutor" };
    private final static String[] TAIGA    = { "Piplup", "Prinplup", "Empoleon", "Slakoth", "Vigoroth", "Slaking", "Vanillite", "Vanillish", "Vanilluxe", "Swinub", "Piloswine", "Teddiursa", "Ursaring", "Munchlax", "Snorlax", "Bonsly", "Sudowoodo", "Snover", "Abomasnow", "Snorunt", "Glalie", "Froslass", "Cubchoo", "Beartic", "Spoink", "Grumpig", "Smoochum", "Jynx", "Sneasel", "Weavile", "Stantler", "Delibird", "Glaceon", "Rowlet", "Dartrix", "Decidueye", "Yungoos", "Gumshoos", "Alolan_sandshrew", "Alolan_sandslash", "Alolan_vulpix", "Alolan_ninetales" };
    private final static String[] TUNDRA  = { "Piplup", "Prinplup", "Empoleon", "Spheal", "Sealeo", "Walrein", "Vanillite", "Vanillish", "Vanilluxe", "Swinub", "Piloswine", "Mamoswine", "Snorunt", "Glalie", "Froslass", "Cubchoo", "Beartic", "Smoochum", "Jynx", "Sneasel", "Weavile", "Delibird", "Cryogonal", "Glaceon", "Bergmite", "Avalugg", "Crabrawler", "Crabominable", "Alolan_sandshrew", "Alolan_sandslash", "Alolan_vulpix", "Alolan_ninetales" };
    private final static String[] URBAN    = { "Pidgey", "Starly", "Staravia", "Pidove", "Tranquill", "Unfezant","Igglybuff", "Jigglypuff", "Happiny", "Chansey", "Blissey", "Lillipup", "Herdier", "Stoutland", "Porygon", "Porygon2", "Porygon_z", "Pichu", "Pikachu", "Magnemite", "Magneton", "Elekid", "Electabuzz", "Electivire", "Ralts", "Kirlia", "Gardevoir", "Gallade", "Abra", "Kadabra", "Alakazam", "Gothita", "Gothorita", "Gothitelle", "Machoke", "Timburr", "Gurdurr", "Klink", "Klang", "Gastly", "Haunter", "Gengar", "Litwick", "Lampent", "Chandelure", "Rattata", "Meowth", "Persian", "Glameow", "Purugly", "Minccino", "Buneary", "Snubbull", "Granbull", "Munchlax", "Snorlax", "Burmy", "Wormadam", "Mothim", "Spearow", "Grimer", "Muk", "Koffing", "Weezing", "Gulpin", "Swalot", "Trubbish", "Garbodor", "Cubone", "Marowak", "Vulpix", "Voltorb", "Electrode", "Electrike", "Elgyem", "Smoochum", "Jynx", "Mr_Mime", "Mime_Jr", "Chingling", "Chimecho", "Tyrogue", "Hitmonlee", "Hitmonchan", "Hitmontop", "Murkrow", "Purrloin", "Misdreavus", "Shuppet", "Banette", "Drifloon", "Drifblim", "Castform", "Smeargle", "Pachirisu", "Emolga", "Rotom", "Spiritomb", "Plusle", "Minun", "Sawk", "Throh", "Ditto", "Unown", "Eevee", "Jolteon", "Flareon", "Espeon", "Umbreon", "Fennekin", "Braixen", "Delphox", "Skiddo", "Gogoat", "Furfrou", "Espurr", "Meowstic", "Honedge", "Doublade", "Aegislash", "Sylveon", "Dedenne", "Klefki", "Litten", "Torracat", "Incineroar", "Pikipek", "Trombeak", "Toucannon", "Yungoos", "Gumshoos", "Grubbin", "Charjabug", "Vikavolt", "Rockruff", "Lycanroc_midday", "Lycanroc_midnight", "Lycanroc_dusk", "Stufful", "Bewear", "Togedemaru", "Mimikyu", "Alolan_rattata", "Alolan_raticate", "Alolan_raichu", "Alolan_vulpix", "Alolan_ninetales", "Alolan_meowth", "Alolan_persian", "Alolan_grimer", "Alolan_muk", "Alolan_marowak" };

    public static void main(String[] args) {
    	//Setting up the Frame
    	JFrame frame = new JFrame("PTU Random Pokemon Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        if(!getLocation()) {
        	JFileChooser chooser = new JFileChooser();
			chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int option = chooser.showSaveDialog(frame); 
			if (option == JFileChooser.APPROVE_OPTION) {
				File selectedFile = chooser.getSelectedFile();
				String path = selectedFile.getAbsolutePath();
				location = path;
				File file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "data" + System.getProperty("file.separator") + "data.txt");
				try {
					PrintWriter printer = new PrintWriter(file);
					printer.print(location);
					printer.close();
				}
		        catch (FileNotFoundException e) {
		        	System.out.println("couldn't create file");
		        }
			}
		}
        
        //Setting up menu
        JMenuBar mBar = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mHelp = new JMenu("Help");
        mBar.add(mFile);
        mBar.add(mHelp);
        JMenuItem mChangeFile = new JMenuItem("Change File Location");
        mChangeFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int option = chooser.showSaveDialog(frame); 
				if (option == JFileChooser.APPROVE_OPTION) {
					File selectedFile = chooser.getSelectedFile();
					String path = selectedFile.getAbsolutePath();
					location = path;
					File file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "data" + System.getProperty("file.separator") + "data.txt");
					try {
						PrintWriter printer = new PrintWriter(file);
						printer.print(location);
						printer.close();
					}
			        catch (FileNotFoundException ex) {
			        	System.out.println("couldn't create file");
			        }
				}
			}
        });
        JMenuItem mOpenFile = new JMenuItem("Open File Location");
        mOpenFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				File directory = new File(location);
				try {
					Desktop.getDesktop().open(directory);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
        });
        mFile.add(mChangeFile);
        mFile.add(mOpenFile);
        
        //Setting up the bottom panel
        JPanel botPanel = new JPanel(); 
        JButton button1 = new JButton("Generate Pokemon");
        String[] drivers = {"Single", "Multiple", "Environment", "Multi Environment"};
        JComboBox<String> driverList = new JComboBox<String>(drivers);
        SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, 10, 1);  
        JSpinner counter = new JSpinner(model1);
        counter.setVisible(false);
        
        botPanel.add(driverList);
        botPanel.add(counter);
        botPanel.add(button1);
        
        
        //Setting up the center panel
        JPanel centerPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel leftPanel= new JPanel();
        JPanel rightLabelPanel = new JPanel();
        JPanel rightTextFieldPanel = new JPanel();
        JTextField inputName = new JTextField();
        String[] enviro = {"Arctic", "Beach", "Cave", "Desert", "Forest", "Freshwater", "Grasslands", "Marsh", "Mountains", "Ocean", "Rainforest", "Taiga", "Tundra", "Urban"};
        JComboBox<String> enviroList = new JComboBox<String>(enviro);
        enviroList.setVisible(false);
        JTextField minLevelInput = new JTextField(3);
        minLevelInput.setText("1");
        minLevelInput.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (minLevelInput.getText().length() >= 3 )
                    e.consume(); 
            }  
        });
        JTextField maxLevelInput = new JTextField(3);
        maxLevelInput.setText("10");
        maxLevelInput.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) { 
                if (maxLevelInput.getText().length() >= 3 ) 
                    e.consume(); 
            }  
        });
        JLabel inputNameLabel = new JLabel("Enter a Pokemon Name");
        JLabel enviroLabel = new JLabel("Select an Environment");
        enviroLabel.setVisible(false);
        enviroLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        enviroList.setAlignmentX(Component.RIGHT_ALIGNMENT);
        inputNameLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        inputName.setAlignmentX(Component.LEFT_ALIGNMENT);
        JLabel inputMinLabel = new JLabel("Enter Minimum Level: ");
        JLabel inputMaxLabel = new JLabel("Enter Maximum Level: ");
        
        leftPanel.setLayout(new BoxLayout (leftPanel, BoxLayout.Y_AXIS));
        rightPanel.setLayout(new BoxLayout (rightPanel, BoxLayout.X_AXIS));
        rightLabelPanel.setLayout(new BoxLayout (rightLabelPanel, BoxLayout.Y_AXIS));
        rightTextFieldPanel.setLayout(new BoxLayout (rightTextFieldPanel, BoxLayout.Y_AXIS));
        
        leftPanel.add(inputNameLabel);
        leftPanel.add(enviroLabel);
        leftPanel.add(inputName);
        leftPanel.add(enviroList);
        
        
        rightLabelPanel.add(inputMinLabel);
        rightLabelPanel.add(inputMaxLabel);
        
        rightTextFieldPanel.add(minLevelInput);
        rightTextFieldPanel.add(maxLevelInput);
        
        rightPanel.add(rightLabelPanel);
        rightPanel.add(rightTextFieldPanel);
        
        centerPanel.add(BorderLayout.WEST, leftPanel);
        centerPanel.add(Box.createRigidArea(new Dimension(10,0)));
        centerPanel.add(BorderLayout.EAST, rightPanel);
        
        button1.addActionListener(new ActionListener() { 
        	public void actionPerformed(ActionEvent e) { 
        		boolean errorCatch = false;
        		int min = 0;
        		try {
        			min = Integer.parseInt(minLevelInput.getText());
        			if (min > 100 || min < 1) {
        				throw new Exception();
        			}
        		} catch(NumberFormatException ex) {
        			JOptionPane.showMessageDialog(null, "Input a whole number in the minimum number field.");
        			errorCatch = true;
        		} catch(Exception ex) {
        			JOptionPane.showMessageDialog(null, "Input a whole number in between 1 and 100 in the minimum number field.");
        			errorCatch = true;
        		}
        		int max = 0;
        		try {
        			max = Integer.parseInt(maxLevelInput.getText());
        			if (max > 100 || max < 1) {
        				throw new Exception();
        			}
        		} catch(NumberFormatException ex) {
        			JOptionPane.showMessageDialog(null, "Input a whole number in the maximum number field");
        			errorCatch = true;
        		} catch (Exception ex) {
        			JOptionPane.showMessageDialog(null, "Input a whole number in between 1 and 100 in the maximum number field.");
        			errorCatch = true;
        		}
        		if(!errorCatch) {
        			if(driverList.getSelectedItem().toString().equals("Single")||driverList.getSelectedItem().toString().equals("Multiple")) {
        				generate(driverList.getSelectedItem().toString(), inputName.getText(), min, max, (int) counter.getValue());
        			}else if(driverList.getSelectedItem().toString().equals("Environment")||driverList.getSelectedItem().toString().equals("Multi Environment")) {
        				generate(driverList.getSelectedItem().toString(), enviroList.getSelectedItem().toString(), min, max, (int) counter.getValue());
        			}
        		}
        	} 
      	});
        driverList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(driverList.getSelectedItem().equals("Environment")) {
					inputNameLabel.setVisible(false);
					enviroLabel.setVisible(true);
					enviroList.setVisible(true);
					inputName.setVisible(false);
					counter.setVisible(false);
					
					inputName.repaint();
					inputNameLabel.repaint();
					enviroList.repaint();
					enviroLabel.repaint();
					counter.repaint();
					
					inputName.revalidate();
					inputNameLabel.revalidate();
					enviroList.revalidate();
					enviroLabel.revalidate();
					counter.revalidate();
				}else if(driverList.getSelectedItem().equals("Single")) {
					inputNameLabel.setVisible(true);
					enviroLabel.setVisible(false);
					enviroList.setVisible(false);
					inputName.setVisible(true);
					counter.setVisible(false);
					
					inputName.repaint();
					inputNameLabel.repaint();
					enviroList.repaint();
					enviroLabel.repaint();
					counter.repaint();
					
					inputName.revalidate();
					inputNameLabel.revalidate();
					enviroList.revalidate();
					enviroLabel.revalidate();
					counter.revalidate();
				}else if(driverList.getSelectedItem().equals("Multiple")) {
					inputNameLabel.setVisible(true);
					enviroLabel.setVisible(false);
					enviroList.setVisible(false);
					inputName.setVisible(true);
					counter.setVisible(true);
					
					inputName.repaint();
					inputNameLabel.repaint();
					enviroList.repaint();
					enviroLabel.repaint();
					counter.repaint();
					
					inputName.revalidate();
					inputNameLabel.revalidate();
					enviroList.revalidate();
					enviroLabel.revalidate();
					counter.revalidate();
				}else if(driverList.getSelectedItem().equals("Multi Environment")) {
					inputNameLabel.setVisible(false);
					enviroLabel.setVisible(true);
					enviroList.setVisible(true);
					inputName.setVisible(false);
					counter.setVisible(true);
					
					inputName.repaint();
					inputNameLabel.repaint();
					enviroList.repaint();
					enviroLabel.repaint();
					counter.repaint();
					
					inputName.revalidate();
					inputNameLabel.revalidate();
					enviroList.revalidate();
					enviroLabel.revalidate();
					counter.revalidate();
				}
			}
        	
        });
        
        frame.getContentPane().add(BorderLayout.SOUTH, botPanel);
        frame.getContentPane().add(BorderLayout.NORTH, mBar);
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);
        frame.setVisible(true);
        
        JOptionPane.showMessageDialog(null, "Randomly Generated Pokemon are currently output to: \n" + location);
        test();
	}
	
	private static void generate(String driver, String input, int min, int max, int count) {
		if(location != null) {
			if(driver.equals("Single")) {
				singleDriver(input, min, max);
			}else if(driver.equals("Environment")){
				enviroDriver(input, min, max);
			}else if(driver.equals("Multiple")){
				for(int i = 0; i < count; i++) {
					singleDriver(input, min, max);
				}
			}else {
				for(int i = 0; i < count; i++) {
					enviroDriver(input, min, max);
				}
			}
		}
	}
	
	private static void enviroDriver(String input, int min, int max) {
		int minLevel = min;
        int maxLevel = max;
        String name = "";
        switch (input) {
            case "Arctic":
                name = ARCTIC[((int)(Math.random() * ARCTIC.length))];
                break;  
            case "Beach":
                name = BEACH[((int)(Math.random() * BEACH.length))];
                break;
            case "Cave":
                name = CAVE[((int)(Math.random() * CAVE.length))];
                break;
            case "Desert":
                name = DESERT[((int)(Math.random() * DESERT.length))];
                break;
            case "Forest":
                name = FOREST[((int)(Math.random() * FOREST.length))];
                break;
            case "Fresh":
                name = FRESH[((int)(Math.random() * FRESH.length))];
                break;
            case "Grasslands":
                name = GRASS[((int)(Math.random() * GRASS.length))];
                break;
            case "Marsh":
                name = MARSH[((int)(Math.random() * MARSH.length))];
                break;
            case "Mountain":
                name = MOUNTAIN[((int)(Math.random() * MOUNTAIN.length))];
                break;
            case "Rainforest":
                name = RAIN[((int)(Math.random() * RAIN.length))];
                break;
            case "Ocean":
                name = OCEAN[((int)(Math.random() * OCEAN.length))];
                break;
            case "Taiga":
                name = TAIGA[((int)(Math.random() * TAIGA.length))];
                break;
            case "Tundraa":
                name = TUNDRA[((int)(Math.random() * TUNDRA.length))];
                break;
            case "Urban":
                name = URBAN[((int)(Math.random() * URBAN.length))];
                break;
            default:
                JOptionPane.showMessageDialog(null, "Not an environment");
        }
        name = name.charAt(0) + name.substring(1, name.length()).toLowerCase().replace(" ", "_");
        Generator genned = new Generator(name, minLevel, maxLevel, true);
        String json = genned.toJSON();
        
        File folder = new File(location);
        File[] listOfFiles = folder.listFiles();
        String path = location + System.getProperty("file.separator") + name + " #" + listOfFiles.length + ".txt";
        File file = new File(path);
        try {
            PrintWriter printer = new PrintWriter(file);
            printer.print(json);
            printer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("couldn't create file");
        }
	}

	private static void singleDriver(String name, int min, int max) {
		if (min < 1) min = 1;
		if (max > 100) max = 100;
		System.out.println(name);
		Generator g = new Generator(name, min, max, false);
		String json = g.toJSON();
		File folder = new File(location);
		
		File[] listOfFiles = folder.listFiles();
		String path = location + System.getProperty("file.separator") + name + " #" + listOfFiles.length + ".txt";
		File file = new File(path);
		try {
            PrintWriter printer = new PrintWriter(file);
            printer.print(json);
            printer.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("couldn't create file");
        }
	}
	
	private static boolean getLocation() {
		try {
	      File file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + "data" + System.getProperty("file.separator") + "data.txt");
	      Scanner reader = new Scanner(file);
	      while (reader.hasNextLine()) {
	        String data = reader.nextLine();
	        if(!data.equals("null")) {
	        	location = data;
	        	reader.close();
	        	return true;
	        }
	      }
	      reader.close();
	      return false;
	    } catch (FileNotFoundException e) {
	      return false;
	    }
	}
	
	private static void test() {
		for(int i = 0; i < ARCTIC.length; i++) {
			singleDriver(ARCTIC[i], 1, 10);
		}
		for(int i = 0; i < CAVE.length; i++) {
			singleDriver(CAVE[i], 1, 10);
		}
		for(int i = 0; i < BEACH.length; i++) {
			singleDriver(BEACH[i], 1, 10);
		}
		for(int i = 0; i < DESERT.length; i++) {
			singleDriver(DESERT[i], 1, 10);
		}
		for(int i = 0; i < FOREST.length; i++) {
			singleDriver(FOREST[i], 1, 10);
		}
		for(int i = 0; i < FRESH.length; i++) {
			singleDriver(FRESH[i], 1, 10);
		}
		for(int i = 0; i < GRASS.length; i++) {
			singleDriver(GRASS[i], 1, 10);
		}
		for(int i = 0; i < MARSH.length; i++) {
			singleDriver(MARSH[i], 1, 10);
		}
		for(int i = 0; i < MOUNTAIN.length; i++) {
			singleDriver(MOUNTAIN[i], 1, 10);
		}
		for(int i = 0; i < OCEAN.length; i++) {
			singleDriver(OCEAN[i], 1, 10);
		}
		for(int i = 0; i < RAIN.length; i++) {
			singleDriver(RAIN[i], 1, 10);
		}
		for(int i = 0; i < TAIGA.length; i++) {
			singleDriver(TAIGA[i], 1, 10);
		}
		for(int i = 0; i < TUNDRA.length; i++) {
			singleDriver(TUNDRA[i], 1, 10);
		}
		for(int i = 0; i < URBAN.length; i++) {
			singleDriver(URBAN[i], 1, 10);
		}
	}

}