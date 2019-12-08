public class Psystrike extends Move{
		{
		name = "Psystrike";
		type = "Psychic";
		frequency = "EOT";
		AC = 2;
		damageBase = 10;
		mDamageBase = 10;
		category = "Special";
		range = "4, 1 Target";
		effects = "When calculating damage, the target subtracts their Defense from Psystrike’s damage instead of their Special Defense Psystrike is still otherwise Special (Special Evasion is used to avoid it, Mirror Coat can reflect it, etc)";
		}
}