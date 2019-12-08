public class Weather_Ball extends Move{
		{
		name = "Weather Ball";
		type = "Normal";
		frequency = "EOT";
		AC = 2;
		damageBase = 5;
		mDamageBase = 5;
		category = "Special";
		range = "8, 1 Target";
		effects = "If it is Sunny, Weather Ball is Fire-Type If it is Rainy, Weather Ball is Water-Type If it is Hailing, Weather Ball is Ice-Type If it is Sandstorming, Weather Ball is Rock-Type When a weather effect is on the field, Weather Ball has a Damage Base of 10 (3d8+10 24) If there are multiple Weather Effects on the field, choose one type for Weather Ball to be that corresponds with an existing Weather Effect";
		}
}