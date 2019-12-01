/**
 * Creates the actual Pokemon that is used
 * 
 * Author : MageMan460/GrandMage460
 * 
 */
public class Generator {
    //private String[] pokeList = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu", "Raichu", "Sandshrew", "Sandslash", "Nidoran♀", "Nidorina", "Nidoqueen", "Nidoran♂", "Nidorino", "Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat", "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian", "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag", "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel", "Tentacool", "Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke", "Slowbro", "Magnemite", "Magneton", "Farfetch’d", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder", "Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb", "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung", "Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar", "Pinsir", "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon", "Porygon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos", "Moltres", "Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew", "Chikorita", "Bayleef", "Meganium", "Cyndaquil", "Quilava", "Typhlosion", "Totodile", "Croconaw", "Feraligatr", "Sentret", "Furret", "Hoothoot", "Noctowl", "Ledyba", "Ledian", "Spinarak", "Ariados", "Crobat", "Chinchou", "Lanturn", "Pichu", "Cleffa", "Igglybuff", "Togepi", "Togetic", "Natu", "Xatu", "Mareep", "Flaaffy", "Ampharos", "Bellossom", "Marill", "Azumarill", "Sudowoodo", "Politoed", "Hoppip", "Skiploom", "Jumpluff", "Aipom", "Sunkern", "Sunflora", "Yanma", "Wooper", "Quagsire", "Espeon", "Umbreon", "Murkrow", "Slowking", "Misdreavus", "Unown", "Wobbuffet", "Girafarig", "Pineco", "Forretress", "Dunsparce", "Gligar", "Steelix", "Snubbull", "Granbull", "Qwilfish", "Scizor", "Shuckle", "Heracross", "Sneasel", "Teddiursa", "Ursaring", "Slugma", "Magcargo", "Swinub", "Piloswine", "Corsola", "Remoraid", "Octillery", "Delibird", "Mantine", "Skarmory", "Houndour", "Houndoom", "Kingdra", "Phanpy", "Donphan", "Porygon2", "Stantler", "Smeargle", "Tyrogue", "Hitmontop", "Smoochum", "Elekid", "Magby", "Miltank", "Blissey", "Raikou", "Entei", "Suicune", "Larvitar", "Pupitar", "Tyranitar", "Lugia", "Ho-Oh", "Celebi", "Treecko", "Grovyle", "Sceptile", "Torchic", "Combusken", "Blaziken", "Mudkip", "Marshtomp", "Swampert", "Poochyena", "Mightyena", "Zigzagoon", "Linoone", "Wurmple", "Silcoon", "Beautifly", "Cascoon", "Dustox", "Lotad", "Lombre", "Ludicolo", "Seedot", "Nuzleaf", "Shiftry", "Taillow", "Swellow", "Wingull", "Pelipper", "Ralts", "Kirlia", "Gardevoir", "Surskit", "Masquerain", "Shroomish", "Breloom", "Slakoth", "Vigoroth", "Slaking", "Nincada", "Ninjask", "Shedinja", "Whismur", "Loudred", "Exploud", "Makuhita", "Hariyama", "Azurill", "Nosepass", "Skitty", "Delcatty", "Sableye", "Mawile", "Aron", "Lairon", "Aggron", "Meditite", "Medicham", "Electrike", "Manectric", "Plusle", "Minun", "Volbeat", "Illumise", "Roselia", "Gulpin", "Swalot", "Carvanha", "Sharpedo", "Wailmer", "Wailord", "Numel", "Camerupt", "Torkoal", "Spoink", "Grumpig", "Spinda", "Trapinch", "Vibrava", "Flygon", "Cacnea", "Cacturne", "Swablu", "Altaria", "Zangoose", "Seviper", "Lunatone", "Solrock", "Barboach", "Whiscash", "Corphish", "Crawdaunt", "Baltoy", "Claydol", "Lileep", "Cradily", "Anorith", "Armaldo", "Feebas", "Milotic", "Castform", "Kecleon", "Shuppet", "Banette", "Duskull", "Dusclops", "Tropius", "Chimecho", "Absol", "Wynaut", "Snorunt", "Glalie", "Spheal", "Sealeo", "Walrein", "Clamperl", "Huntail", "Gorebyss", "Relicanth", "Luvdisc", "Bagon", "Shelgon", "Salamence", "Beldum", "Metang", "Metagross", "Regirock", "Regice", "Registeel", "Latias", "Latios", "Kyogre", "Groudon", "Rayquaza", "Jirachi", "Deoxys", "Turtwig", "Grotle", "Torterra", "Chimchar", "Monferno", "Infernape", "Piplup", "Prinplup", "Empoleon", "Starly", "Staravia", "Staraptor", "Bidoof", "Bibarel", "Kricketot", "Kricketune", "Shinx", "Luxio", "Luxray", "Budew", "Roserade", "Cranidos", "Rampardos", "Shieldon", "Bastiodon", "Burmy", "Wormadam", "Mothim", "Combee", "Vespiquen", "Pachirisu", "Buizel", "Floatzel", "Cherubi", "Cherrim", "Shellos", "Gastrodon", "Ambipom", "Drifloon", "Drifblim", "Buneary", "Lopunny", "Mismagius", "Honchkrow", "Glameow", "Purugly", "Chingling", "Stunky", "Skuntank", "Bronzor", "Bronzong", "Bonsly", "Mime Jr.", "Happiny", "Chatot", "Spiritomb", "Gible", "Gabite", "Garchomp", "Munchlax", "Riolu", "Lucario", "Hippopotas", "Hippowdon", "Skorupi", "Drapion", "Croagunk", "Toxicroak", "Carnivine", "Finneon", "Lumineon", "Mantyke", "Snover", "Abomasnow", "Weavile", "Magnezone", "Lickilicky", "Rhyperior", "Tangrowth", "Electivire", "Magmortar", "Togekiss", "Yanmega", "Leafeon", "Glaceon", "Gliscor", "Mamoswine", "Porygon-Z", "Gallade", "Probopass", "Dusknoir", "Froslass", "Rotom", "Uxie", "Mesprit", "Azelf", "Dialga", "Palkia", "Heatran", "Regigigas", "Giratina", "Cresselia", "Phione", "Manaphy", "Darkrai", "Shaymin", "Arceus", "Victini", "Snivy", "Servine", "Serperior", "Tepig", "Pignite", "Emboar", "Oshawott", "Dewott", "Samurott", "Patrat", "Watchog", "Lillipup", "Herdier", "Stoutland", "Purrloin", "Liepard", "Pansage", "Simisage", "Pansear", "Simisear", "Panpour", "Simipour", "Munna", "Musharna", "Pidove", "Tranquill", "Unfezant", "Blitzle", "Zebstrika", "Roggenrola", "Boldore", "Gigalith", "Woobat", "Swoobat", "Drilbur", "Excadrill", "Audino", "Timburr", "Gurdurr", "Conkeldurr", "Tympole", "Palpitoad", "Seismitoad", "Throh", "Sawk", "Sewaddle", "Swadloon", "Leavanny", "Venipede", "Whirlipede", "Scolipede", "Cottonee", "Whimsicott", "Petilil", "Lilligant", "Basculin", "Sandile", "Krokorok", "Krookodile", "Darumaka", "Darmanitan", "Maractus", "Dwebble", "Crustle", "Scraggy", "Scrafty", "Sigilyph", "Yamask", "Cofagrigus", "Tirtouga", "Carracosta", "Archen", "Archeops", "Trubbish", "Garbodor", "Zorua", "Zoroark", "Minccino", "Cinccino", "Gothita", "Gothorita", "Gothitelle", "Solosis", "Duosion", "Reuniclus", "Ducklett", "Swanna", "Vanillite", "Vanillish", "Vanilluxe", "Deerling", "Sawsbuck", "Emolga", "Karrablast", "Escavalier", "Foongus", "Amoonguss", "Frillish", "Jellicent", "Alomomola", "Joltik", "Galvantula", "Ferroseed", "Ferrothorn", "Klink", "Klang", "Klinklang", "Tynamo", "Eelektrik", "Eelektross", "Elgyem", "Beheeyem", "Litwick", "Lampent", "Chandelure", "Axew", "Fraxure", "Haxorus", "Cubchoo", "Beartic", "Cryogonal", "Shelmet", "Accelgor", "Stunfisk", "Mienfoo", "Mienshao", "Druddigon", "Golett", "Golurk", "Pawniard", "Bisharp", "Bouffalant", "Rufflet", "Braviary", "Vullaby", "Mandibuzz", "Heatmor", "Durant", "Deino", "Zweilous", "Hydreigon", "Larvesta", "Volcarona", "Cobalion", "Terrakion", "Virizion", "Tornadus", "Thundurus", "Reshiram", "Zekrom", "Landorus", "Kyurem", "Keldeo", "Meloetta", "Genesect", "Chespin", "Quilladin", "Chesnaught", "Fennekin", "Braixen", "Delphox", "Froakie", "Frogadier", "Greninja", "Bunnelby", "Diggersby", "Fletchling", "Fletchinder", "Talonflame", "Scatterbug", "Spewpa", "Vivillon", "Litleo", "Pyroar", "Flabébé", "Floette", "Florges", "Skiddo", "Gogoat", "Pancham", "Pangoro", "Furfrou", "Espurr", "Meowstic", "Honedge", "Doublade", "Aegislash", "Spritzee", "Aromatisse", "Swirlix", "Slurpuff", "Inkay", "Malamar", "Binacle", "Barbaracle", "Skrelp", "Dragalge", "Clauncher", "Clawitzer", "Helioptile", "Heliolisk", "Tyrunt", "Tyrantrum", "Amaura", "Aurorus", "Sylveon", "Hawlucha", "Dedenne", "Carbink", "Goomy", "Sliggoo", "Goodra", "Klefki", "Phantump", "Trevenant", "Pumpkaboo", "Gourgeist", "Bergmite", "Avalugg", "Noibat", "Noivern", "Xerneas", "Yveltal", "Zygarde", "Diancie", "Hoopa", "Volcanion", "Rowlet", "Dartrix", "Decidueye", "Litten", "Torracat", "Incineroar", "Popplio", "Brionne", "Primarina", "Pikipek", "Trumbeak", "Toucannon", "Yungoos", "Gumshoos", "Grubbin", "Charjabug", "Vikavolt", "Crabrawler", "Crabominable", "Oricorio", "Cutiefly", "Ribombee", "Rockruff", "Lycanroc", "Wishiwashi", "Mareanie", "Toxapex", "Mudbray", "Mudsdale", "Dewpider", "Araquanid", "Fomantis", "Lurantis", "Morelull", "Shiinotic", "Salandit", "Salazzle", "Stufful", "Bewear", "Bounsweet", "Steenee", "Tsareena", "Comfey", "Oranguru", "Passimian", "Wimpod", "Golisopod", "Sandygast", "Palossand", "Pyukumuku", "Type: Null", "Silvally", "Minior", "Komala", "Turtonator", "Togedemaru", "Mimikyu", "Bruxish", "Drampa", "Dhelmise", "Jangmo-o", "Hakamo-o", "Kommo-o", "Tapu Koko", "Tapu Lele", "Tapu Bulu", "Tapu Fini", "Cosmog", "Cosmoem", "Solgaleo", "Lunala", "Nihilego", "Buzzwole", "Pheromosa", "Xurkitree", "Celesteela", "Kartana", "Guzzlord", "Necrozma", "Magearna", "Marshadow", "Poipole", "Naganadel", "Stakataka", "Blacephalon", "Zeraora", "Meltan", "Melmetal"};
    @SuppressWarnings("unused")
    private String[] moves;
    @SuppressWarnings("unused")
    private String[] abilities;
    private Pokemon genned;
    
    public Generator(String name, int minLevel, int maxLevel) {
        
        genned = new Pikachu();
        /*
        switch(name) {
            case "Abomasnow":
                genned = new Abomasnow();break;
            case "Abra":
                genned = new Abra();break;
            case "Absol":
                genned = new Absol();break;
            case "Accelgor":
                genned = new Accelgor();break;
            case "Aegislash":
                genned = new Aegislash();break;
            case "Aerodactyl":
                genned = new Aerodactyl();break;
            case "Aggron":
                genned = new Aggron();break;
            case "Aipom":
                genned = new Aipom();break;
            case "Alakazam":
                genned = new Alakazam();break;
            case "Alomomola":
                genned = new Alomomola();break;
            case "Altaria":
                genned = new Altaria();break;
            case "Amaura":
                genned = new Amaura();break;
            case "Ambipom":
                genned = new Ambipom();break;
            case "Amoonguss":
                genned = new Amoonguss();break;
            case "Ampharos":
                genned = new Ampharos();break;
            case "Anorith":
                genned = new Anorith();break;
            case "Arbok":
                genned = new Arbok();break;
            case "Arcanine":
                genned = new Arcanine();break;
            case "Arceus":
                genned = new Arceus();break;
            case "Archen":
                genned = new Archen();break;
            case "Archeops":
                genned = new Archeops();break;
            case "Ariados":
                genned = new Ariados();break;
            case "Armaldo":
                genned = new Armaldo();break;
            case "Aromatisse":
                genned = new Aromatisse();break;
            case "Aron":
                genned = new Aron();break;
            case "Articuno":
                genned = new Articuno();break;
            case "Audino":
                genned = new Audino();break;
            case "Aurorus":
                genned = new Aurorus();break;
            case "Avalugg":
                genned = new Avalugg();break;
            case "Axew":
                genned = new Axew();break;
            case "Azelf":
                genned = new Azelf();break;
            case "Azumarill":
                genned = new Azumarill();break;
            case "Azurill":
                genned = new Azurill();break;
            case "Bagon":
                genned = new Bagon();break;
            case "Baltoy":
                genned = new Baltoy();break;
            case "Banette":
                genned = new Banette();break;
            case "Barbaracle":
                genned = new Barbaracle();break;
            case "Barboach":
                genned = new Barboach();break;
            case "Basculin":
                genned = new Basculin();break;
            case "Bastiodon":
                genned = new Bastiodon();break;
            case "Bayleef":
                genned = new Bayleef();break;
            case "Beartic":
                genned = new Beartic();break;
            case "Beautifly":
                genned = new Beautifly();break;
            case "Beedrill":
                genned = new Beedrill();break;
            case "Beheeyem":
                genned = new Beheeyem();break;
            case "Beldum":
                genned = new Beldum();break;
            case "Bellossom":
                genned = new Bellossom();break;
            case "Bellsprout":
                genned = new Bellsprout();break;
            case "Bergmite":
                genned = new Bergmite();break;
            case "Bibarel":
                genned = new Bibarel();break;
            case "Bidoof":
                genned = new Bidoof();break;
            case "Binacle":
                genned = new Binacle();break;
            case "Bisharp":
                genned = new Bisharp();break;
            case "Blastoise":
                genned = new Blastoise();break;
            case "Blaziken":
                genned = new Blaziken();break;
            case "Blissey":
                genned = new Blissey();break;
            case "Blitzle":
                genned = new Blitzle();break;
            case "Boldore":
                genned = new Boldore();break;
            case "Bonsly":
                genned = new Bonsly();break;
            case "Bouffalant":
                genned = new Bouffalant();break;
            case "Braixen":
                genned = new Braixen();break;
            case "Braviary":
                genned = new Braviary();break;
            case "Breloom":
                genned = new Breloom();break;
            case "Bronzong":
                genned = new Bronzong();break;
            case "Bronzor":
                genned = new Bronzor();break;
            case "Budew":
                genned = new Budew();break;
            case "Buizel":
                genned = new Buizel();break;
            case "Bulbasaur":
                genned = new Bulbasaur();break;
            case "Buneary":
                genned = new Buneary();break;
            case "Bunnelby":
                genned = new Bunnelby();break;
            case "Burmy":
                genned = new Burmy();break;
            case "Butterfree":
                genned = new Butterfree();break;
            case "Cacnea":
                genned = new Cacnea();break;
            case "Cacturne":
                genned = new Cacturne();break;
            case "Camerupt":
                genned = new Camerupt();break;
            case "Carbink":
                genned = new Carbink();break;
            case "Carnivine":
                genned = new Carnivine();break;
            case "Carracosta":
                genned = new Carracosta();break;
            case "Carvanha":
                genned = new Carvanha();break;
            case "Cascoon":
                genned = new Cascoon();break;
            case "Castform":
                genned = new Castform();break;
            case "Caterpie":
                genned = new Caterpie();break;
            case "Celebi":
                genned = new Celebi();break;
            case "Chandelure":
                genned = new Chandelure();break;
            case "Chansey":
                genned = new Chansey();break;
            case "Charizard":
                genned = new Charizard();break;
            case "Charmander":
                genned = new Charmander();break;
            case "Charmeleon":
                genned = new Charmeleon();break;
            case "Chatot":
                genned = new Chatot();break;
            case "Cherrim":
                genned = new Cherrim();break;
            case "Cherubi":
                genned = new Cherubi();break;
            case "Chesnaught":
                genned = new Chesnaught();break;
            case "Chespin":
                genned = new Chespin();break;
            case "Chikorita":
                genned = new Chikorita();break;
            case "Chimchar":
                genned = new Chimchar();break;
            case "Chimecho":
                genned = new Chimecho();break;
            case "Chinchou":
                genned = new Chinchou();break;
            case "Chingling":
                genned = new Chingling();break;
            case "Cinccino":
                genned = new Cinccino();break;
            case "Clamperl":
                genned = new Clamperl();break;
            case "Clauncher":
                genned = new Clauncher();break;
            case "Clawitzer":
                genned = new Clawitzer();break;
            case "Claydol":
                genned = new Claydol();break;
            case "Clefable":
                genned = new Clefable();break;
            case "Clefairy":
                genned = new Clefairy();break;
            case "Cleffa":
                genned = new Cleffa();break;
            case "Cloyster":
                genned = new Cloyster();break;
            case "Cobalion":
                genned = new Cobalion();break;
            case "Cofagrigus":
                genned = new Cofagrigus();break;
            case "Combee":
                genned = new Combee();break;
            case "Combusken":
                genned = new Combusken();break;
            case "Conkeldurr":
                genned = new Conkeldurr();break;
            case "Corphish":
                genned = new Corphish();break;
            case "Corsola":
                genned = new Corsola();break;
            case "Cottonee":
                genned = new Cottonee();break;
            case "Cradily":
                genned = new Cradily();break;
            case "Cranidos":
                genned = new Cranidos();break;
            case "Crawdaunt":
                genned = new Crawdaunt();break;
            case "Cresselia":
                genned = new Cresselia();break;
            case "Croagunk":
                genned = new Croagunk();break;
            case "Crobat":
                genned = new Crobat();break;
            case "Croconaw":
                genned = new Croconaw();break;
            case "Crustle":
                genned = new Crustle();break;
            case "Cryogonal":
                genned = new Cryogonal();break;
            case "Cubchoo":
                genned = new Cubchoo();break;
            case "Cubone":
                genned = new Cubone();break;
            case "Cyndaquil":
                genned = new Cyndaquil();break;
            case "Darkrai":
                genned = new Darkrai();break;
            case "Darmanitan-Standard":
                genned = new Darmanitan-Standard();break;
            case "Darmanitan-Zen":
                genned = new Darmanitan-Zen();break;
            case "Darumaka":
                genned = new Darumaka();break;
            case "Dedenne":
                genned = new Dedenne();break;
            case "Deerling":
                genned = new Deerling();break;
            case "Deino":
                genned = new Deino();break;
            case "Delcatty":
                genned = new Delcatty();break;
            case "Delibird":
                genned = new Delibird();break;
            case "Delphox":
                genned = new Delphox();break;
            case "Deoxys-Normal":
                genned = new Deoxys-Normal();break;
            case "Deoxys-Attack":
                genned = new Deoxys-Attack();break;
            case "Deoxys-Defense":
                genned = new Deoxys-Defense();break;
            case "Deoxys-Speed":
                genned = new Deoxys-Speed();break;
            case "Dewgong":
                genned = new Dewgong();break;
            case "Dewott":
                genned = new Dewott();break;
            case "Dialga":
                genned = new Dialga();break;
            case "Diancie":
                genned = new Diancie();break;
            case "Diggersby":
                genned = new Diggersby();break;
            case "Diglett":
                genned = new Diglett();break;
            case "Ditto":
                genned = new Ditto();break;
            case "Dodrio":
                genned = new Dodrio();break;
            case "Doduo":
                genned = new Doduo();break;
            case "Donphan":
                genned = new Donphan();break;
            case "Doublade":
                genned = new Doublade();break;
            case "Dragalge":
                genned = new Dragalge();break;
            case "Dragonair":
                genned = new Dragonair();break;
            case "Dragonite":
                genned = new Dragonite();break;
            case "Drapion":
                genned = new Drapion();break;
            case "Dratini":
                genned = new Dratini();break;
            case "Drifblim":
                genned = new Drifblim();break;
            case "Drifloon":
                genned = new Drifloon();break;
            case "Drilbur":
                genned = new Drilbur();break;
            case "Drowzee":
                genned = new Drowzee();break;
            case "Druddigon":
                genned = new Druddigon();break;
            case "Ducklett":
                genned = new Ducklett();break;
            case "Dugtrio":
                genned = new Dugtrio();break;
            case "Dunsparce":
                genned = new Dunsparce();break;
            case "Duosion":
                genned = new Duosion();break;
            case "Durant":
                genned = new Durant();break;
            case "Dusclops":
                genned = new Dusclops();break;
            case "Dusknoir":
                genned = new Dusknoir();break;
            case "Duskull":
                genned = new Duskull();break;
            case "Dustox":
                genned = new Dustox();break;
            case "Dwebble":
                genned = new Dwebble();break;
            case "Eelektrik":
                genned = new Eelektrik();break;
            case "Eelektross":
                genned = new Eelektross();break;
            case "Eevee":
                genned = new Eevee();break;
            case "Ekans":
                genned = new Ekans();break;
            case "Electabuzz":
                genned = new Electabuzz();break;
            case "Electivire":
                genned = new Electivire();break;
            case "Electrike":
                genned = new Electrike();break;
            case "Electrode":
                genned = new Electrode();break;
            case "Elekid":
                genned = new Elekid();break;
            case "Elgyem":
                genned = new Elgyem();break;
            case "Emboar":
                genned = new Emboar();break;
            case "Emolga":
                genned = new Emolga();break;
            case "Empoleon":
                genned = new Empoleon();break;
            case "Entei":
                genned = new Entei();break;
            case "Escavalier":
                genned = new Escavalier();break;
            case "Espeon":
                genned = new Espeon();break;
            case "Espurr":
                genned = new Espurr();break;
            case "Excadrill":
                genned = new Excadrill();break;
            case "Exeggcute":
                genned = new Exeggcute();break;
            case "Exeggutor":
                genned = new Exeggutor();break;
            case "Exploud":
                genned = new Exploud();break;
            case "Farfetch'd":
                genned = new Farfetch'd();break;
            case "Fearow":
                genned = new Fearow();break;
            case "Feebas":
                genned = new Feebas();break;
            case "Fennekin":
                genned = new Fennekin();break;
            case "Feraligatr":
                genned = new Feraligatr();break;
            case "Ferroseed":
                genned = new Ferroseed();break;
            case "Ferrothorn":
                genned = new Ferrothorn();break;
            case "Finneon":
                genned = new Finneon();break;
            case "Flaaffy":
                genned = new Flaaffy();break;
            case "Flabebe":
                genned = new Flabebe();break;
            case "Flabébé ":
                genned = new Flabébé ();break;
            case "Flareon":
                genned = new Flareon();break;
            case "Fletchinder":
                genned = new Fletchinder();break;
            case "Fletchling":
                genned = new Fletchling();break;
            case "Floatzel":
                genned = new Floatzel();break;
            case "Floette":
                genned = new Floette();break;
            case "Florges":
                genned = new Florges();break;
            case "Flygon":
                genned = new Flygon();break;
            case "Foongus":
                genned = new Foongus();break;
            case "Forretress":
                genned = new Forretress();break;
            case "Fraxure":
                genned = new Fraxure();break;
            case "Frillish":
                genned = new Frillish();break;
            case "Froakie":
                genned = new Froakie();break;
            case "Frogadier":
                genned = new Frogadier();break;
            case "Froslass":
                genned = new Froslass();break;
            case "Furfrou":
                genned = new Furfrou();break;
            case "Furret":
                genned = new Furret();break;
            case "Gabite":
                genned = new Gabite();break;
            case "Gallade":
                genned = new Gallade();break;
            case "Galvantula":
                genned = new Galvantula();break;
            case "Garbodor":
                genned = new Garbodor();break;
            case "Garchomp":
                genned = new Garchomp();break;
            case "Gardevoir":
                genned = new Gardevoir();break;
            case "Gastly":
                genned = new Gastly();break;
            case "Gastrodon":
                genned = new Gastrodon();break;
            case "Genesect":
                genned = new Genesect();break;
            case "Gengar":
                genned = new Gengar();break;
            case "Geodude":
                genned = new Geodude();break;
            case "Gible":
                genned = new Gible();break;
            case "Gigalith":
                genned = new Gigalith();break;
            case "Girafarig":
                genned = new Girafarig();break;
            case "Giratina-Altered":
                genned = new Giratina-Altered();break;
            case "Giratina-Origin":
                genned = new Giratina-Origin();break;
            case "Glaceon":
                genned = new Glaceon();break;
            case "Glalie":
                genned = new Glalie();break;
            case "Glameow":
                genned = new Glameow();break;
            case "Gligar":
                genned = new Gligar();break;
            case "Gliscor":
                genned = new Gliscor();break;
            case "Gloom":
                genned = new Gloom();break;
            case "Gogoat":
                genned = new Gogoat();break;
            case "Golbat":
                genned = new Golbat();break;
            case "Goldeen":
                genned = new Goldeen();break;
            case "Golduck":
                genned = new Golduck();break;
            case "Golem":
                genned = new Golem();break;
            case "Golett":
                genned = new Golett();break;
            case "Golurk":
                genned = new Golurk();break;
            case "Goodra":
                genned = new Goodra();break;
            case "Goomy":
                genned = new Goomy();break;
            case "Gorebyss":
                genned = new Gorebyss();break;
            case "Gothita":
                genned = new Gothita();break;
            case "Gothitelle":
                genned = new Gothitelle();break;
            case "Gothorita":
                genned = new Gothorita();break;
            case "Gourgeist-Average":
                genned = new Gourgeist-Average();break;
            case "Gourgeist-Large":
                genned = new Gourgeist-Large();break;
            case "Gourgeist-Small":
                genned = new Gourgeist-Small();break;
            case "Gourgeist-Super":
                genned = new Gourgeist-Super();break;
            case "Granbull":
                genned = new Granbull();break;
            case "Graveler":
                genned = new Graveler();break;
            case "Greninja":
                genned = new Greninja();break;
            case "Grimer":
                genned = new Grimer();break;
            case "Grotle":
                genned = new Grotle();break;
            case "Groudon":
                genned = new Groudon();break;
            case "Grovyle":
                genned = new Grovyle();break;
            case "Growlithe":
                genned = new Growlithe();break;
            case "Grumpig":
                genned = new Grumpig();break;
            case "Gulpin":
                genned = new Gulpin();break;
            case "Gurdurr":
                genned = new Gurdurr();break;
            case "Gyarados":
                genned = new Gyarados();break;
            case "Happiny":
                genned = new Happiny();break;
            case "Hariyama":
                genned = new Hariyama();break;
            case "Haunter":
                genned = new Haunter();break;
            case "Hawlucha":
                genned = new Hawlucha();break;
            case "Haxorus":
                genned = new Haxorus();break;
            case "Heatmor":
                genned = new Heatmor();break;
            case "Heatran":
                genned = new Heatran();break;
            case "Heliolisk":
                genned = new Heliolisk();break;
            case "Helioptile":
                genned = new Helioptile();break;
            case "Heracross":
                genned = new Heracross();break;
            case "Herdier":
                genned = new Herdier();break;
            case "Hippopotas":
                genned = new Hippopotas();break;
            case "Hippowdon":
                genned = new Hippowdon();break;
            case "Hitmonchan":
                genned = new Hitmonchan();break;
            case "Hitmonlee":
                genned = new Hitmonlee();break;
            case "Hitmontop":
                genned = new Hitmontop();break;
            case "Ho-Oh":
                genned = new Ho-Oh();break;
            case "Honchkrow":
                genned = new Honchkrow();break;
            case "Honedge":
                genned = new Honedge();break;
            case "Hoopa-Confined":
                genned = new Hoopa-Confined();break;
            case "Hoopa-Unbound":
                genned = new Hoopa-Unbound();break;
            case "Hoothoot":
                genned = new Hoothoot();break;
            case "Hoppip":
                genned = new Hoppip();break;
            case "Horsea":
                genned = new Horsea();break;
            case "Houndoom":
                genned = new Houndoom();break;
            case "Houndour":
                genned = new Houndour();break;
            case "Huntail":
                genned = new Huntail();break;
            case "Hydreigon":
                genned = new Hydreigon();break;
            case "Hypno":
                genned = new Hypno();break;
            case "Igglybuff":
                genned = new Igglybuff();break;
            case "Illumise":
                genned = new Illumise();break;
            case "Infernape":
                genned = new Infernape();break;
            case "Inkay":
                genned = new Inkay();break;
            case "Ivysaur":
                genned = new Ivysaur();break;
            case "Jellicent":
                genned = new Jellicent();break;
            case "Jigglypuff":
                genned = new Jigglypuff();break;
            case "Jirachi":
                genned = new Jirachi();break;
            case "Jolteon":
                genned = new Jolteon();break;
            case "Joltik":
                genned = new Joltik();break;
            case "Jumpluff":
                genned = new Jumpluff();break;
            case "Jynx":
                genned = new Jynx();break;
            case "Kabuto":
                genned = new Kabuto();break;
            case "Kabutops":
                genned = new Kabutops();break;
            case "Kadabra":
                genned = new Kadabra();break;
            case "Kakuna":
                genned = new Kakuna();break;
            case "Kangaskhan":
                genned = new Kangaskhan();break;
            case "Karrablast":
                genned = new Karrablast();break;
            case "Kecleon":
                genned = new Kecleon();break;
            case "Keldeo":
                genned = new Keldeo();break;
            case "Kingdra":
                genned = new Kingdra();break;
            case "Kingler":
                genned = new Kingler();break;
            case "Kirlia":
                genned = new Kirlia();break;
            case "Klang":
                genned = new Klang();break;
            case "Klefki":
                genned = new Klefki();break;
            case "Klink":
                genned = new Klink();break;
            case "Klinklang":
                genned = new Klinklang();break;
            case "Koffing":
                genned = new Koffing();break;
            case "Krabby":
                genned = new Krabby();break;
            case "Kricketot":
                genned = new Kricketot();break;
            case "Kricketune":
                genned = new Kricketune();break;
            case "Krokorok":
                genned = new Krokorok();break;
            case "Krookodile":
                genned = new Krookodile();break;
            case "Kyogre":
                genned = new Kyogre();break;
            case "Kyurem":
                genned = new Kyurem();break;
            case "Kyurem-White":
                genned = new Kyurem-White();break;
            case "Kyurem-Black":
                genned = new Kyurem-Black();break;
            case "Lairon":
                genned = new Lairon();break;
            case "Lampent":
                genned = new Lampent();break;
            case "Landorus-Incarnate":
                genned = new Landorus-Incarnate();break;
            case "Landorus-Therian":
                genned = new Landorus-Therian();break;
            case "Lanturn":
                genned = new Lanturn();break;
            case "Lapras":
                genned = new Lapras();break;
            case "Larvesta":
                genned = new Larvesta();break;
            case "Larvitar":
                genned = new Larvitar();break;
            case "Latias":
                genned = new Latias();break;
            case "Latios":
                genned = new Latios();break;
            case "Leafeon":
                genned = new Leafeon();break;
            case "Leavanny":
                genned = new Leavanny();break;
            case "Ledian":
                genned = new Ledian();break;
            case "Ledyba":
                genned = new Ledyba();break;
            case "Lickilicky":
                genned = new Lickilicky();break;
            case "Lickitung":
                genned = new Lickitung();break;
            case "Liepard":
                genned = new Liepard();break;
            case "Lileep":
                genned = new Lileep();break;
            case "Lilligant":
                genned = new Lilligant();break;
            case "Lillipup":
                genned = new Lillipup();break;
            case "Linoone":
                genned = new Linoone();break;
            case "Litleo":
                genned = new Litleo();break;
            case "Litwick":
                genned = new Litwick();break;
            case "Lombre":
                genned = new Lombre();break;
            case "Lopunny":
                genned = new Lopunny();break;
            case "Lotad":
                genned = new Lotad();break;
            case "Loudred":
                genned = new Loudred();break;
            case "Lucario":
                genned = new Lucario();break;
            case "Ludicolo":
                genned = new Ludicolo();break;
            case "Lugia":
                genned = new Lugia();break;
            case "Lumineon":
                genned = new Lumineon();break;
            case "Lunatone":
                genned = new Lunatone();break;
            case "Luvdisc":
                genned = new Luvdisc();break;
            case "Luxio":
                genned = new Luxio();break;
            case "Luxray":
                genned = new Luxray();break;
            case "Machamp":
                genned = new Machamp();break;
            case "Machoke":
                genned = new Machoke();break;
            case "Machop":
                genned = new Machop();break;
            case "Magby":
                genned = new Magby();break;
            case "Magcargo":
                genned = new Magcargo();break;
            case "Magikarp":
                genned = new Magikarp();break;
            case "Magmar":
                genned = new Magmar();break;
            case "Magmortar":
                genned = new Magmortar();break;
            case "Magnemite":
                genned = new Magnemite();break;
            case "Magneton":
                genned = new Magneton();break;
            case "Magnezone":
                genned = new Magnezone();break;
            case "Makuhita":
                genned = new Makuhita();break;
            case "Malamar":
                genned = new Malamar();break;
            case "Mamoswine":
                genned = new Mamoswine();break;
            case "Manaphy":
                genned = new Manaphy();break;
            case "Mandibuzz":
                genned = new Mandibuzz();break;
            case "Manectric":
                genned = new Manectric();break;
            case "Mankey":
                genned = new Mankey();break;
            case "Mantine":
                genned = new Mantine();break;
            case "Mantyke":
                genned = new Mantyke();break;
            case "Maractus":
                genned = new Maractus();break;
            case "Mareep":
                genned = new Mareep();break;
            case "Marill":
                genned = new Marill();break;
            case "Marowak":
                genned = new Marowak();break;
            case "Marshtomp":
                genned = new Marshtomp();break;
            case "Masquerain":
                genned = new Masquerain();break;
            case "Mawile":
                genned = new Mawile();break;
            case "Medicham":
                genned = new Medicham();break;
            case "Meditite":
                genned = new Meditite();break;
            case "Meganium":
                genned = new Meganium();break;
            case "Meloetta-Aria":
                genned = new Meloetta-Aria();break;
            case "Meloetta-Pirouette":
                genned = new Meloetta-Pirouette();break;
            case "Meowstic":
                genned = new Meowstic();break;
            case "Meowth":
                genned = new Meowth();break;
            case "Mesprit":
                genned = new Mesprit();break;
            case "Metagross":
                genned = new Metagross();break;
            case "Metang":
                genned = new Metang();break;
            case "Metapod":
                genned = new Metapod();break;
            case "Mew":
                genned = new Mew();break;
            case "Mewtwo":
                genned = new Mewtwo();break;
            case "Mienfoo":
                genned = new Mienfoo();break;
            case "Mienshao":
                genned = new Mienshao();break;
            case "Mightyena":
                genned = new Mightyena();break;
            case "Milotic":
                genned = new Milotic();break;
            case "Miltank":
                genned = new Miltank();break;
            case "Mime-Jr":
                genned = new Mime-Jr();break;
            case "Minccino":
                genned = new Minccino();break;
            case "Minun":
                genned = new Minun();break;
            case "Misdreavus":
                genned = new Misdreavus();break;
            case "Mismagius":
                genned = new Mismagius();break;
            case "Moltres":
                genned = new Moltres();break;
            case "Monferno":
                genned = new Monferno();break;
            case "Mothim":
                genned = new Mothim();break;
            case "Mr-Mime":
                genned = new Mr-Mime();break;
            case "Mudkip":
                genned = new Mudkip();break;
            case "Muk":
                genned = new Muk();break;
            case "Munchlax":
                genned = new Munchlax();break;
            case "Munna":
                genned = new Munna();break;
            case "Murkrow":
                genned = new Murkrow();break;
            case "Musharna":
                genned = new Musharna();break;
            case "Natu":
                genned = new Natu();break;
            case "Nidoking":
                genned = new Nidoking();break;
            case "Nidoqueen":
                genned = new Nidoqueen();break;
            case "Nidoran-F":
                genned = new Nidoran-F();break;
            case "Nidoran-M":
                genned = new Nidoran-M();break;
            case "Nidorina":
                genned = new Nidorina();break;
            case "Nidorino":
                genned = new Nidorino();break;
            case "Nincada":
                genned = new Nincada();break;
            case "Ninetales":
                genned = new Ninetales();break;
            case "Ninjask":
                genned = new Ninjask();break;
            case "Noctowl":
                genned = new Noctowl();break;
            case "Noibat":
                genned = new Noibat();break;
            case "Noivern":
                genned = new Noivern();break;
            case "Nosepass":
                genned = new Nosepass();break;
            case "Numel":
                genned = new Numel();break;
            case "Nuzleaf":
                genned = new Nuzleaf();break;
            case "Octillery":
                genned = new Octillery();break;
            case "Oddish":
                genned = new Oddish();break;
            case "Omanyte":
                genned = new Omanyte();break;
            case "Omastar":
                genned = new Omastar();break;
            case "Onix":
                genned = new Onix();break;
            case "Oshawott":
                genned = new Oshawott();break;
            case "Pachirisu":
                genned = new Pachirisu();break;
            case "Palkia":
                genned = new Palkia();break;
            case "Palpitoad":
                genned = new Palpitoad();break;
            case "Pancham":
                genned = new Pancham();break;
            case "Pangoro":
                genned = new Pangoro();break;
            case "Panpour":
                genned = new Panpour();break;
            case "Pansage":
                genned = new Pansage();break;
            case "Pansear":
                genned = new Pansear();break;
            case "Paras":
                genned = new Paras();break;
            case "Parasect":
                genned = new Parasect();break;
            case "Patrat":
                genned = new Patrat();break;
            case "Pawniard":
                genned = new Pawniard();break;
            case "Pelipper":
                genned = new Pelipper();break;
            case "Persian":
                genned = new Persian();break;
            case "Petilil":
                genned = new Petilil();break;
            case "Phanpy":
                genned = new Phanpy();break;
            case "Phantump":
                genned = new Phantump();break;
            case "Phione":
                genned = new Phione();break;
            case "Pichu":
                genned = new Pichu();break;
            case "Pidgeot":
                genned = new Pidgeot();break;
            case "Pidgeotto":
                genned = new Pidgeotto();break;
            case "Pidgey":
                genned = new Pidgey();break;
            case "Pidove":
                genned = new Pidove();break;
            case "Pignite":
                genned = new Pignite();break;
            case "Pikachu":
                genned = new Pikachu();break;
            case "Piloswine":
                genned = new Piloswine();break;
            case "Pineco":
                genned = new Pineco();break;
            case "Pinsir":
                genned = new Pinsir();break;
            case "Piplup":
                genned = new Piplup();break;
            case "Plusle":
                genned = new Plusle();break;
            case "Politoed":
                genned = new Politoed();break;
            case "Poliwag":
                genned = new Poliwag();break;
            case "Poliwhirl":
                genned = new Poliwhirl();break;
            case "Poliwrath":
                genned = new Poliwrath();break;
            case "Ponyta":
                genned = new Ponyta();break;
            case "Poochyena":
                genned = new Poochyena();break;
            case "Porygon":
                genned = new Porygon();break;
            case "Porygon-Z":
                genned = new Porygon-Z();break;
            case "Porygon2":
                genned = new Porygon2();break;
            case "Primeape":
                genned = new Primeape();break;
            case "Prinplup":
                genned = new Prinplup();break;
            case "Probopass":
                genned = new Probopass();break;
            case "Psyduck":
                genned = new Psyduck();break;
            case "Pumpkaboo-Average":
                genned = new Pumpkaboo-Average();break;
            case "Pumpkaboo-Large":
                genned = new Pumpkaboo-Large();break;
            case "Pumpkaboo-Small":
                genned = new Pumpkaboo-Small();break;
            case "Pumpkaboo-Super":
                genned = new Pumpkaboo-Super();break;
            case "Pupitar":
                genned = new Pupitar();break;
            case "Purrloin":
                genned = new Purrloin();break;
            case "Purugly":
                genned = new Purugly();break;
            case "Pyroar":
                genned = new Pyroar();break;
            case "Quagsire":
                genned = new Quagsire();break;
            case "Quilava":
                genned = new Quilava();break;
            case "Quilladin":
                genned = new Quilladin();break;
            case "Qwilfish":
                genned = new Qwilfish();break;
            case "Raichu":
                genned = new Raichu();break;
            case "Raikou":
                genned = new Raikou();break;
            case "Ralts":
                genned = new Ralts();break;
            case "Rampardos":
                genned = new Rampardos();break;
            case "Rapidash":
                genned = new Rapidash();break;
            case "Raticate":
                genned = new Raticate();break;
            case "Rattata":
                genned = new Rattata();break;
            case "Rayquaza":
                genned = new Rayquaza();break;
            case "Regice":
                genned = new Regice();break;
            case "Regigigas":
                genned = new Regigigas();break;
            case "Regirock":
                genned = new Regirock();break;
            case "Registeel":
                genned = new Registeel();break;
            case "Relicanth":
                genned = new Relicanth();break;
            case "Remoraid":
                genned = new Remoraid();break;
            case "Reshiram":
                genned = new Reshiram();break;
            case "Reuniclus":
                genned = new Reuniclus();break;
            case "Rhydon":
                genned = new Rhydon();break;
            case "Rhyhorn":
                genned = new Rhyhorn();break;
            case "Rhyperior":
                genned = new Rhyperior();break;
            case "Riolu":
                genned = new Riolu();break;
            case "Roggenrola":
                genned = new Roggenrola();break;
            case "Roselia":
                genned = new Roselia();break;
            case "Roserade":
                genned = new Roserade();break;
            case "Rotom-Normal":
                genned = new Rotom-Normal();break;
            case "Rotom-Fan":
                genned = new Rotom-Fan();break;
            case "Rotom-Frost":
                genned = new Rotom-Frost();break;
            case "Rotom-Heat":
                genned = new Rotom-Heat();break;
            case "Rotom-Mow":
                genned = new Rotom-Mow();break;
            case "Rotom-Wash":
                genned = new Rotom-Wash();break;
            case "Rufflet":
                genned = new Rufflet();break;
            case "Sableye":
                genned = new Sableye();break;
            case "Salamence":
                genned = new Salamence();break;
            case "Samurott":
                genned = new Samurott();break;
            case "Sandile":
                genned = new Sandile();break;
            case "Sandshrew":
                genned = new Sandshrew();break;
            case "Sandslash":
                genned = new Sandslash();break;
            case "Sawk":
                genned = new Sawk();break;
            case "Sawsbuck":
                genned = new Sawsbuck();break;
            case "Scatterbug":
                genned = new Scatterbug();break;
            case "Sceptile":
                genned = new Sceptile();break;
            case "Scizor":
                genned = new Scizor();break;
            case "Scolipede":
                genned = new Scolipede();break;
            case "Scrafty":
                genned = new Scrafty();break;
            case "Scraggy":
                genned = new Scraggy();break;
            case "Scyther":
                genned = new Scyther();break;
            case "Seadra":
                genned = new Seadra();break;
            case "Seaking":
                genned = new Seaking();break;
            case "Sealeo":
                genned = new Sealeo();break;
            case "Seedot":
                genned = new Seedot();break;
            case "Seel":
                genned = new Seel();break;
            case "Seismitoad":
                genned = new Seismitoad();break;
            case "Sentret":
                genned = new Sentret();break;
            case "Serperior":
                genned = new Serperior();break;
            case "Servine":
                genned = new Servine();break;
            case "Seviper":
                genned = new Seviper();break;
            case "Sewaddle":
                genned = new Sewaddle();break;
            case "Sharpedo":
                genned = new Sharpedo();break;
            case "Shaymin-Land":
                genned = new Shaymin-Land();break;
            case "Shaymin-Sky":
                genned = new Shaymin-Sky();break;
            case "Shedinja":
                genned = new Shedinja();break;
            case "Shelgon":
                genned = new Shelgon();break;
            case "Shellder":
                genned = new Shellder();break;
            case "Shellos":
                genned = new Shellos();break;
            case "Shelmet":
                genned = new Shelmet();break;
            case "Shieldon":
                genned = new Shieldon();break;
            case "Shiftry":
                genned = new Shiftry();break;
            case "Shinx":
                genned = new Shinx();break;
            case "Shroomish":
                genned = new Shroomish();break;
            case "Shuckle":
                genned = new Shuckle();break;
            case "Shuppet":
                genned = new Shuppet();break;
            case "Sigilyph":
                genned = new Sigilyph();break;
            case "Silcoon":
                genned = new Silcoon();break;
            case "Simipour":
                genned = new Simipour();break;
            case "Simisage":
                genned = new Simisage();break;
            case "Simisear":
                genned = new Simisear();break;
            case "Skarmory":
                genned = new Skarmory();break;
            case "Skiddo":
                genned = new Skiddo();break;
            case "Skiploom":
                genned = new Skiploom();break;
            case "Skitty":
                genned = new Skitty();break;
            case "Skorupi":
                genned = new Skorupi();break;
            case "Skrelp":
                genned = new Skrelp();break;
            case "Skuntank":
                genned = new Skuntank();break;
            case "Slaking":
                genned = new Slaking();break;
            case "Slakoth":
                genned = new Slakoth();break;
            case "Sliggoo":
                genned = new Sliggoo();break;
            case "Slowbro":
                genned = new Slowbro();break;
            case "Slowking":
                genned = new Slowking();break;
            case "Slowpoke":
                genned = new Slowpoke();break;
            case "Slugma":
                genned = new Slugma();break;
            case "Slurpuff":
                genned = new Slurpuff();break;
            case "Smeargle":
                genned = new Smeargle();break;
            case "Smoochum":
                genned = new Smoochum();break;
            case "Sneasel":
                genned = new Sneasel();break;
            case "Snivy":
                genned = new Snivy();break;
            case "Snorlax":
                genned = new Snorlax();break;
            case "Snorunt":
                genned = new Snorunt();break;
            case "Snover":
                genned = new Snover();break;
            case "Snubbull":
                genned = new Snubbull();break;
            case "Solosis":
                genned = new Solosis();break;
            case "Solrock":
                genned = new Solrock();break;
            case "Spearow":
                genned = new Spearow();break;
            case "Spewpa":
                genned = new Spewpa();break;
            case "Spheal":
                genned = new Spheal();break;
            case "Spinarak":
                genned = new Spinarak();break;
            case "Spinda":
                genned = new Spinda();break;
            case "Spiritomb":
                genned = new Spiritomb();break;
            case "Spoink":
                genned = new Spoink();break;
            case "Spritzee":
                genned = new Spritzee();break;
            case "Squirtle":
                genned = new Squirtle();break;
            case "Stantler":
                genned = new Stantler();break;
            case "Staraptor":
                genned = new Staraptor();break;
            case "Staravia":
                genned = new Staravia();break;
            case "Starly":
                genned = new Starly();break;
            case "Starmie":
                genned = new Starmie();break;
            case "Staryu":
                genned = new Staryu();break;
            case "Steelix":
                genned = new Steelix();break;
            case "Stoutland":
                genned = new Stoutland();break;
            case "Stunfisk":
                genned = new Stunfisk();break;
            case "Stunky":
                genned = new Stunky();break;
            case "Sudowoodo":
                genned = new Sudowoodo();break;
            case "Suicune":
                genned = new Suicune();break;
            case "Sunflora":
                genned = new Sunflora();break;
            case "Sunkern":
                genned = new Sunkern();break;
            case "Surskit":
                genned = new Surskit();break;
            case "Swablu":
                genned = new Swablu();break;
            case "Swadloon":
                genned = new Swadloon();break;
            case "Swalot":
                genned = new Swalot();break;
            case "Swampert":
                genned = new Swampert();break;
            case "Swanna":
                genned = new Swanna();break;
            case "Swellow":
                genned = new Swellow();break;
            case "Swinub":
                genned = new Swinub();break;
            case "Swirlix":
                genned = new Swirlix();break;
            case "Swoobat":
                genned = new Swoobat();break;
            case "Sylveon":
                genned = new Sylveon();break;
            case "Taillow":
                genned = new Taillow();break;
            case "Talonflame":
                genned = new Talonflame();break;
            case "Tangela":
                genned = new Tangela();break;
            case "Tangrowth":
                genned = new Tangrowth();break;
            case "Tauros":
                genned = new Tauros();break;
            case "Teddiursa":
                genned = new Teddiursa();break;
            case "Tentacool":
                genned = new Tentacool();break;
            case "Tentacruel":
                genned = new Tentacruel();break;
            case "Tepig":
                genned = new Tepig();break;
            case "Terrakion":
                genned = new Terrakion();break;
            case "Throh":
                genned = new Throh();break;
            case "Thundurus-Incarnate":
                genned = new Thundurus-Incarnate();break;
            case "Thundurus-Therian":
                genned = new Thundurus-Therian();break;
            case "Timburr":
                genned = new Timburr();break;
            case "Tirtouga":
                genned = new Tirtouga();break;
            case "Togekiss":
                genned = new Togekiss();break;
            case "Togepi":
                genned = new Togepi();break;
            case "Togetic":
                genned = new Togetic();break;
            case "Torchic":
                genned = new Torchic();break;
            case "Torkoal":
                genned = new Torkoal();break;
            case "Tornadus-Incarnate":
                genned = new Tornadus-Incarnate();break;
            case "Tornadus-Therian":
                genned = new Tornadus-Therian();break;
            case "Torterra":
                genned = new Torterra();break;
            case "Totodile":
                genned = new Totodile();break;
            case "Toxicroak":
                genned = new Toxicroak();break;
            case "Tranquill":
                genned = new Tranquill();break;
            case "Trapinch":
                genned = new Trapinch();break;
            case "Treecko":
                genned = new Treecko();break;
            case "Trevenant":
                genned = new Trevenant();break;
            case "Tropius":
                genned = new Tropius();break;
            case "Trubbish":
                genned = new Trubbish();break;
            case "Turtwig":
                genned = new Turtwig();break;
            case "Tympole":
                genned = new Tympole();break;
            case "Tynamo":
                genned = new Tynamo();break;
            case "Typhlosion":
                genned = new Typhlosion();break;
            case "Tyranitar":
                genned = new Tyranitar();break;
            case "Tyrantrum":
                genned = new Tyrantrum();break;
            case "Tyrogue":
                genned = new Tyrogue();break;
            case "Tyrunt":
                genned = new Tyrunt();break;
            case "Umbreon":
                genned = new Umbreon();break;
            case "Unfezant":
                genned = new Unfezant();break;
            case "Unown":
                genned = new Unown();break;
            case "Ursaring":
                genned = new Ursaring();break;
            case "Uxie":
                genned = new Uxie();break;
            case "Vanillish":
                genned = new Vanillish();break;
            case "Vanillite":
                genned = new Vanillite();break;
            case "Vanilluxe":
                genned = new Vanilluxe();break;
            case "Vaporeon":
                genned = new Vaporeon();break;
            case "Venipede":
                genned = new Venipede();break;
            case "Venomoth":
                genned = new Venomoth();break;
            case "Venonat":
                genned = new Venonat();break;
            case "Venusaur":
                genned = new Venusaur();break;
            case "Vespiquen":
                genned = new Vespiquen();break;
            case "Vibrava":
                genned = new Vibrava();break;
            case "Victini":
                genned = new Victini();break;
            case "Victreebel":
                genned = new Victreebel();break;
            case "Vigoroth":
                genned = new Vigoroth();break;
            case "Vileplume":
                genned = new Vileplume();break;
            case "Virizion":
                genned = new Virizion();break;
            case "Vivillon":
                genned = new Vivillon();break;
            case "Volbeat":
                genned = new Volbeat();break;
            case "Volcarona":
                genned = new Volcarona();break;
            case "Voltorb":
                genned = new Voltorb();break;
            case "Vullaby":
                genned = new Vullaby();break;
            case "Vulpix":
                genned = new Vulpix();break;
            case "Wailmer":
                genned = new Wailmer();break;
            case "Wailord":
                genned = new Wailord();break;
            case "Walrein":
                genned = new Walrein();break;
            case "Wartortle":
                genned = new Wartortle();break;
            case "Watchog":
                genned = new Watchog();break;
            case "Weavile":
                genned = new Weavile();break;
            case "Weedle":
                genned = new Weedle();break;
            case "Weepinbell":
                genned = new Weepinbell();break;
            case "Weezing":
                genned = new Weezing();break;
            case "Whimsicott":
                genned = new Whimsicott();break;
            case "Whirlipede":
                genned = new Whirlipede();break;
            case "Whiscash":
                genned = new Whiscash();break;
            case "Whismur":
                genned = new Whismur();break;
            case "Wigglytuff":
                genned = new Wigglytuff();break;
            case "Wingull":
                genned = new Wingull();break;
            case "Wobbuffet":
                genned = new Wobbuffet();break;
            case "Woobat":
                genned = new Woobat();break;
            case "Wooper":
                genned = new Wooper();break;
            case "Wormadam-Plant":
                genned = new Wormadam-Plant();break;
            case "Wormadam-Sand":
                genned = new Wormadam-Sand();break;
            case "Wormadam-Trash":
                genned = new Wormadam-Trash();break;
            case "Wurmple":
                genned = new Wurmple();break;
            case "Wynaut":
                genned = new Wynaut();break;
            case "Xatu":
                genned = new Xatu();break;
            case "Xerneas":
                genned = new Xerneas();break;
            case "Yamask":
                genned = new Yamask();break;
            case "Yanma":
                genned = new Yanma();break;
            case "Yanmega":
                genned = new Yanmega();break;
            case "Yveltal":
                genned = new Yveltal();break;
            case "Zangoose":
                genned = new Zangoose();break;
            case "Zapdos":
                genned = new Zapdos();break;
            case "Zebstrika":
                genned = new Zebstrika();break;
            case "Zekrom":
                genned = new Zekrom();break;
            case "Zigzagoon":
                genned = new Zigzagoon();break;
            case "Zoroark":
                genned = new Zoroark();break;
            case "Zorua":
                genned = new Zorua();break;
            case "Zubat":
                genned = new Zubat();break;
            case "Zweilous":
                genned = new Zweilous();break;
            case "Zygarde-10":
                genned = new Zygarde-10();break;
            case "Zygarde-50":
                genned = new Zygarde-50();break;
            case "Zygarde-Complete":
                genned = new Zygarde-Complete();break;
            case "Volcanion":
                genned = new Volcanion();break;
            case "Rowlet":
                genned = new Rowlet();break;
            case "Dartrix":
                genned = new Dartrix();break;
            case "Decidueye":
                genned = new Decidueye();break;
            case "Litten":
                genned = new Litten();break;
            case "Torracat":
                genned = new Torracat();break;
            case "Incineroar":
                genned = new Incineroar();break;
            case "Popplio":
                genned = new Popplio();break;
            case "Brionne":
                genned = new Brionne();break;
            case "Primarina":
                genned = new Primarina();break;
            case "Pikipek":
                genned = new Pikipek();break;
            case "Trombeak":
                genned = new Trombeak();break;
            case "Toucannon":
                genned = new Toucannon();break;
            case "Yungoos":
                genned = new Yungoos();break;
            case "Gumshoos":
                genned = new Gumshoos();break;
            case "Grubbin":
                genned = new Grubbin();break;
            case "Charjabug":
                genned = new Charjabug();break;
            case "Vikavolt":
                genned = new Vikavolt();break;
            case "Crabrawler":
                genned = new Crabrawler();break;
            case "Crabominable":
                genned = new Crabominable();break;
            case "Oricorio-Baile":
                genned = new Oricorio-Baile();break;
            case "Oricorio-Pom-Pom":
                genned = new Oricorio-Pom-Pom();break;
            case "Oricorio-Pau":
                genned = new Oricorio-Pau();break;
            case "Oricorio-Sensu":
                genned = new Oricorio-Sensu();break;
            case "Cutiefly":
                genned = new Cutiefly();break;
            case "Ribombee":
                genned = new Ribombee();break;
            case "Rockruff":
                genned = new Rockruff();break;
            case "Lycanroc-Midday":
                genned = new Lycanroc-Midday();break;
            case "Lycanroc-Midnight":
                genned = new Lycanroc-Midnight();break;
            case "Lycanroc-Dusk":
                genned = new Lycanroc-Dusk();break;
            case "Wishiwashi":
                genned = new Wishiwashi();break;
            case "Wishiwashi-School":
                genned = new Wishiwashi-School();break;
            case "Mareanie":
                genned = new Mareanie();break;
            case "Toxapex":
                genned = new Toxapex();break;
            case "Mudbray":
                genned = new Mudbray();break;
            case "Mudsdale":
                genned = new Mudsdale();break;
            case "Dewpider":
                genned = new Dewpider();break;
            case "Araquanid":
                genned = new Araquanid();break;
            case "Fomantis":
                genned = new Fomantis();break;
            case "Lurantis":
                genned = new Lurantis();break;
            case "Morelull":
                genned = new Morelull();break;
            case "Shiinotic":
                genned = new Shiinotic();break;
            case "Salandit":
                genned = new Salandit();break;
            case "Salazzle":
                genned = new Salazzle();break;
            case "Stufful":
                genned = new Stufful();break;
            case "Bewear":
                genned = new Bewear();break;
            case "Bounsweet":
                genned = new Bounsweet();break;
            case "Steenee":
                genned = new Steenee();break;
            case "Tsareena":
                genned = new Tsareena();break;
            case "Comfey":
                genned = new Comfey();break;
            case "Oranguru":
                genned = new Oranguru();break;
            case "Passimian":
                genned = new Passimian();break;
            case "Wimpod":
                genned = new Wimpod();break;
            case "Golisopod":
                genned = new Golisopod();break;
            case "Sandygast":
                genned = new Sandygast();break;
            case "Pallosand":
                genned = new Pallosand();break;
            case "Pyukumuku":
                genned = new Pyukumuku();break;
            case "Type-Null":
                genned = new Type-Null();break;
            case "Silvally":
                genned = new Silvally();break;
            case "Minior-Meteor":
                genned = new Minior-Meteor();break;
            case "Minior-Core":
                genned = new Minior-Core();break;
            case "Komala":
                genned = new Komala();break;
            case "Turtonator":
                genned = new Turtonator();break;
            case "Togedemaru":
                genned = new Togedemaru();break;
            case "Mimikyu":
                genned = new Mimikyu();break;
            case "Bruxish":
                genned = new Bruxish();break;
            case "Drampa":
                genned = new Drampa();break;
            case "Dhelmise":
                genned = new Dhelmise();break;
            case "Jangmo-o":
                genned = new Jangmo-o();break;
            case "Hakamo-o":
                genned = new Hakamo-o();break;
            case "Kommo-o":
                genned = new Kommo-o();break;
            case "Tapu-Koko":
                genned = new Tapu-Koko();break;
            case "Tapu-Lele":
                genned = new Tapu-Lele();break;
            case "Tapu-Bulu":
                genned = new Tapu-Bulu();break;
            case "Tapu-Fini":
                genned = new Tapu-Fini();break;
            case "Cosmog":
                genned = new Cosmog();break;
            case "Cosmoem":
                genned = new Cosmoem();break;
            case "Solgaleo":
                genned = new Solgaleo();break;
            case "Lunala":
                genned = new Lunala();break;
            case "Nihilego":
                genned = new Nihilego();break;
            case "Buzzwole":
                genned = new Buzzwole();break;
            case "Pheromosa":
                genned = new Pheromosa();break;
            case "Xurkitree":
                genned = new Xurkitree();break;
            case "Celesteela":
                genned = new Celesteela();break;
            case "Kartana":
                genned = new Kartana();break;
            case "Guzzlord":
                genned = new Guzzlord();break;
            case "Poipole":
                genned = new Poipole();break;
            case "Naganadel":
                genned = new Naganadel();break;
            case "Stakataka":
                genned = new Stakataka();break;
            case "Blacephalon":
                genned = new Blacephalon();break;
            case "Necrozma":
                genned = new Necrozma();break;
            case "Necrozma-Dusk-Mane":
                genned = new Necrozma-Dusk-Mane();break;
            case "Necrozma-Dawn-Wings":
                genned = new Necrozma-Dawn-Wings();break;
            case "Necrozma-Ultra":
                genned = new Necrozma-Ultra();break;
            case "Magearna":
                genned = new Magearna();break;
            case "Marshadow":
                genned = new Marshadow();break;
            case "Zeraora":
                genned = new Zeraora();break;
            case "Rattata-Alolan":
                genned = new Rattata-Alolan();break;
            case "Raticate-Alolan":
                genned = new Raticate-Alolan();break;
            case "Raichu-Alolan":
                genned = new Raichu-Alolan();break;
            case "Sandshrew-Alolan":
                genned = new Sandshrew-Alolan();break;
            case "Sandslash-Alolan":
                genned = new Sandslash-Alolan();break;
            case "Vulpix-Alolan":
                genned = new Vulpix-Alolan();break;
            case "Ninetales-Alolan":
                genned = new Ninetales-Alolan();break;
            case "Diglett-Alolan":
                genned = new Diglett-Alolan();break;
            case "Dugtrio-Alolan":
                genned = new Dugtrio-Alolan();break;
            case "Meowth-Alolan":
                genned = new Meowth-Alolan();break;
            case "Persian-Alolan":
                genned = new Persian-Alolan();break;
            case "Geodude-Alolan":
                genned = new Geodude-Alolan();break;
            case "Graveler-Alolan":
                genned = new Graveler-Alolan();break;
            case "Golem-Alolan":
                genned = new Golem-Alolan();break;
            case "Grimer-Alolan":
                genned = new Grimer-Alolan();break;
            case "Muk-Alolan":
                genned = new Muk-Alolan();break;
            case "Exeggutor-Alolan":
                genned = new Exeggutor-Alola();break;
            case "Marowak-Alolan":
                genned = new Marowak-Alolan();break;

        }*/
        
        genned.setNature();
        int levels = (int)(Math.random() * minLevel + maxLevel + 1) + minLevel;
        genned.levelUp(levels);
        this.moves = genned.generateMoveList();
        this.abilities = genned.generateAbilities();
    }
    
    public String toJSON() {
        String result = genned.toJSON();
        result += "}";
        return result;
    }
    
	public static void main(String[] args) {
	    Pokemon t = new Pikachu();
	    t.setNature();
	    t.normalize();
	    t.levelUp(20);
	    String[] moves = t.generateMoveList();
	    String[] abilities = t.generateAbilities();
	    System.out.print(t);
	    for(int i = 0; i <moves.length; i++) {
	        System.out.println(moves[i]);
	    }
	    for(int i = 0; i < abilities.length; i++) {
            System.out.println(abilities[i]);
        }
	    System.out.println(t.toJSON());
	}
}
