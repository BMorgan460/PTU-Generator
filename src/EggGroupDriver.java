
public class EggGroupDriver {
	static String[] amorphous = {"muk","gengar","weezing","wobbuffet","magcargo","gardevoir","swalot","banette","chimecho","gastrodon","drifblim","mismagius","gallade","dusknoir","cofagrigus","reuniclus","jellicent","eelektross","chandelure","trevenant","gourgeist","palossand","polteageist","alcremie","dragapult"};
	static String[] bug = {"butterfree","beedrill","paras","parasect","venomoth","ledian","ariados","forretress","scizor","beautifly","dustox","masquerain","ninjask","flygon","kricketune","wormadam","vespiquen","drapion","yanmega","gliscor","leavanny","scolipede","crustle","escavalier","galvantula","accelgor","volcarona","vivillon","vikavolt","ribombee","araquanid","golisopod","orbeetle","centiskorch","frosmoth"};
	static String[] dragon = {"charizard","arbok","gyarados","dragonite","kingdra","sceptile","flygon","altaria","milotic","salamence","garchomp","scrafty","haxorus","hydreigon","dragalge","heliolisk","tyrantrum","goodra","noivern","salazzle","kommo-o","flapple","sandaconda","dragapult"};
	static String[] fairy = {"raichu","clefable","wigglytuff","azumarill","jumpluff","granbull","blissey","breloom","delcatty","glalie","roserade","cherrim","togekiss","manaphy","whimsicott","florges","aromatisse","slurpuff","ribombee","hatterene","grimmsnarl","alcremie"};
	static String[] field = {"raticate","arbok","raichu","sandslash","nidoking","ninetales","dugtrio","persian","golduck","primeape","arcanine","rapidash","dewgong","typhlosion","furret","ampharos","quagsire","granbull","ursaring","houndoom","donphan","blaziken","mightyena","shiftry","slaking","exploud","delcatty","manectric","wailord","camerupt","grumpig","walrein","infernape","empoleon","bibarel","luxray","floatzel","ambipom","lopunny","purugly","skuntank","lucario","hippowdon","weavile","rhyperior","glaceon","mamoswine","serperior","emboar","samurott","watchog","stoutland","liepard","simisage","simisear","simipour","musharna","zebstrika","woobat","swoobat","excadrill","krookodile","darmanitan","scrafty","zoroark","cinccino","sawsbuck","beartic","mienshao","chesnaught","delphox","diggersby","pyroar","gogoat","pangoro","meowstic","incineroar","primarina","gumshoos","lycanroc","mudsdale","bewear","rillaboom","cinderace","inteleon","greedent","thievul","dubwool","boltund","sandaconda","obstagoon","sirfetchd","copperajah"};
	static String[] flying = {"pidgeot","fearow","dodrio","noctowl","crobat","xatu","swellow","pelipper","altaria","staraptor","honchkrow","togekiss","unfezant","woobat","swoobat","archeops","swanna","braviary","mandibuzz","talonflame","noivern","decidueye","toucannon","corviknight","sirfetchd"};
	static String[] grass = {"venusaur","vileplume","paras","parasect","victreebel","exeggutor","meganium","bellossom","jumpluff","sunflora","ludicolo","shiftry","breloom","cacturne","torterra","roserade","cherrim","abomasnow","tangrowth","serperior","whimsicott","lilligant","amoonguss","ferrothorn","trevenant","lurantis","shiinotic","tsareena","rillaboom","eldegoss","flapple"};
	static String[] human = {"alakazam","machamp","hypno","hitmonchan","jynx","gardevoir","hariyama","medicham","cacturne","infernape","lopunny","lucario","toxicroak","electivire","magmortar","gallade","conkeldurr","gothitelle","beheeyem","mienshao","bisharp","pangoro","cinderace","toxtricity","grapploct","grimmsnarl","mr-rime"};
	static String[] mineral = {"golem","electrode","sudowoodo","steelix","claydol","glalie","metagross","bronzong","magnezone","porygon-z","probopass","gigalith","crustle","cofagrigus","garbodor","vanilluxe","ferrothorn","klinklang","golurk","aegislash","avalugg","coalossal","polteageist","copperajah"};
	static String[] monster = {"venusaur","charizard","blastoise","nidoking","slowbro","marowak","snorlax","meganium","feraligatr","ampharos","tyranitar","sceptile","swampert","exploud","aggron","torterra","rampardos","bastiodon","garchomp","abomasnow","lickilicky","rhyperior","haxorus","heliolisk","tyrantrum","aurorus","avalugg","salazzle","drednaw"};
	static String[] water1 = {"blastoise","golduck","poliwrath","slowbro","dewgong","omastar","kabuto","kabutops","dragonite","feraligatr","azumarill","politoed","quagsire","octillery","mantine","kingdra","swampert","ludicolo","pelipper","masquerain","crawdaunt","milotic","walrein","huntail","empoleon","bibarel","floatzel","gastrodon","manaphy","seismitoad","carracosta","swanna","greninja","malamar","dragalge","clawitzer","primarina","toxapex","araquanid","inteleon","drednaw","grapploct","cursola"};
	static String[] water2 = {"seaking","gyarados","lanturn","octillery","sharpedo","wailord","whiscash","lumineon","malamar","barraskewda"};
	static String[] water3 = {"tentacruel","cloyster","kingler","starmie","omastar","kabuto","kabutops","crawdaunt","cradily","armaldo","drapion","carracosta","archeops","barbaracle","clawitzer","crabominable","golisopod","cursola"};
		
	public static void main(String[] args) {
		String egg = args[0].toLowerCase();
		switch(egg) {
			case "amorphous":
				System.out.println(amorphous[(int)(Math.random()*(amorphous.length+1))]);
				break;
			case "bug":
				System.out.println(bug[(int)(Math.random()*(bug.length+1))]);
				break;
			case "dragon":
				System.out.println(dragon[(int)(Math.random()*(dragon.length+1))]);
				break;
			case "fairy":
				System.out.println(fairy[(int)(Math.random()*(fairy.length+1))]);
				break;
			case "field":
				System.out.println(field[(int)(Math.random()*(field.length+1))]);
				break;
			case "flying":
				System.out.println(flying[(int)(Math.random()*(flying.length+1))]);
				break;
			case "grass":
				System.out.println(grass[(int)(Math.random()*(grass.length+1))]);
				break;
			case "human":
				System.out.println(human[(int)(Math.random()*(human.length+1))]);
				break;
			case "mineral":
				System.out.println(mineral[(int)(Math.random()*(mineral.length+1))]);
				break;
			case "monster":
				System.out.println(monster[(int)(Math.random()*(monster.length+1))]);
				break;
			case "water1":
				System.out.println(water1[(int)(Math.random()*(water1.length+1))]);
				break;
			case "water2":
				System.out.println(water2[(int)(Math.random()*(water2.length+1))]);
				break;
			case "water3":
				System.out.println(water3[(int)(Math.random()*(water3.length+1))]);
				break;
						
		}
	}
	
}
