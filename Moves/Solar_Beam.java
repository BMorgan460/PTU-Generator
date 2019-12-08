public class Solar_Beam extends Move{
		{
		name = "Solar Beam";
		type = "Grass";
		frequency = "Scene";
		AC = 2;
		damageBase = 12;
		mDamageBase = 12;
		category = "Special";
		range = "Line 6, 1 Target, Set-Up Set-Up";
		effects = "If the weather is not Sunny, the user’s turn ends If the weather is Sunny, immediately proceed to the Resolution Effect instead and this Move loses the Set-Up keyword Resolution Effect The user attacks with Solar Beam If the weather is Rainy, Sandstorming, or Hailing, Solar Beam’s Damage Base is lowered to 6 (2d6+8 15)";
		}
}