/**
 * Configuration File 
 * Edit this data according to your Requirement
 * 
 * @author DroidOXY
 */

package com.droidoxy.easymoneyrewards;

public class Config
{

	// your package name :: change it to yours
	static String package_name = "com.droidoxy.easymoneyrewards";

	// Adxmi AppId
	static String AppId ="1a3572449fabd457";

	// Adxmi AppSecret
	static String AppSecret ="ed05a09f01917266";

	// SuperSonic AppKey
	static String AppKey ="53f22b55";

	// Adscend Media keys
	// Get your pubId and adwallId here :: http://yashdev.in/add-adscend-media-to-pocket/
	static String pubId = "107661";
	static String adwallId = "7451";

	// Super Rewards AppHash
	// Get your appHash here :: http://yashdev.in/add-super-rewards-to-pocket/
	static String appHash = "slihtyrqpdi.423735976755";

	// your UserId - see documentataion - or mail us - droid@oxywebs.com
	// Get your user id - http://yash.oxywebs.in/getting-userid-to-integrate-supersonic-into-pocketandroid/
	static String UserId ="7f9a5ca3-d341-40ce-9e1f-f2808632f37a";

	// Server URL ie., Webpanel Hosted Url -
	// must be http://folder.example.com/
	// do-not use http://example.com/folder/
	public static String Base_Url = "http://pocket.droid.oxywebs.in/";
	// public static String Base_Url = "http://example.com/";
	// public static String Base_Url = "http://pocket.example.com/";
	
	// Daily Reward Points
	static int daily_reward = 25;

	// Images for MainActivity
   static int[] images={R.drawable.ic_checkin,
   						R.drawable.ic_instructions,
						R.drawable.ic_video,
						R.drawable.ic_super_sonic,
						R.drawable.ic_adscend,
						R.drawable.ic_sr,
						R.drawable.ic_adxmi,
						R.drawable.ic_redeem,
						R.drawable.ic_about};
						
    //Titles for MainActivity
	static String[] titles ={"Daily Check-In",
								"Instructions",
								"Watch Videos",
								"SuperSonic OfferWall",
								"Adscend OfferWall",
								"SuperRewards OfferWall",
								"Adxmi OfferWall",
								"Redeem",
								"About"};
								
	//Description for MainActuvity Titles
	static String[] description={"Open Daily and Earn 25 Points",
								"How to Earn Points",
								"Watch Videos to Earn Points",
								"Install Apps and Earn Points",
								"Install Apps and Earn Points",
								"Install Apps and Earn Points",
								"Install Apps and Earn Points",
								"Turn your Points into Cash",
								"Advertise with Us"};

	//---------------------------------------------------
	//Images for Redeem Activity

	static int[] payout_images={
		R.drawable.ic_paypal_logo,
		R.drawable.ic_paypal_logo,
		R.drawable.ic_paytm,
		R.drawable.ic_paytm,
		R.drawable.ic_amazon_icon,
		R.drawable.ic_googleplay_icon};

    //Titles for Redeem Activity
	static String[] payout_titles ={
		"Paypal",
		"Paypal",
		"Paytm",
		"Paytm",
		"Amazon",
		"Google Play"};

	//Description for Redeem Activity Titles
	static String[] payout_description={
		"1000 Points = $1 USD",
		"5000 Points = $5 USD",
		"1000 Points = 100 INR",
		"5000 Points = 500 INR",
		"3000 Points = $2.5 USD",
		"9000 Points = $10 USD"};


    // Google Analytics OPTIONAL
	static String analytics_property_id = "UA-76982496-1";

	// Share text and link for Share Button
	static String share_text = "Hello, look what a beautiful app that I found here:";
	static String  share_link = "https://play.google.com/store/apps/details?id=com.oxywebs.yashdev.pocket";

	// APP RATING
	static String rate_later = "Perhaps Later";
    static String rate_never = "No Thanks";
    static String rate_yes="Rate Now";
    static String rate_message = "We hope you enjoy using %1$s. Would you like to help us by rating us in the Store?";
	static String rate_title = "Enjoying our app?";

}