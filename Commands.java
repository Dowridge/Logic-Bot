import java.util.concurrent.ThreadLocalRandom;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.TimeZone;
import java.util.Optional;

public class Commands {

 public static int dice() {

  int min = 1;
  int max = 6;
  int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
  return randomNum;
 }

 public static String coin() {

  int min = 1;
  int max = 2;
  int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
  String return_value = (randomNum == 1) ? ("Heads") : ("Tails");
  return return_value;
 }



 public static String meme() {

  int min = 1;
  int max = 60000;
  int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
  return ("https://www.memecenter.com/fun/" + randomNum);
 }



 public static String help() {
  String pre = "Commands: ";
  String a = "\n```!coin```";
  String b = "\n```!dice```";
  String c = "\n```!meme```";
  String d = "\n```!ge {item name}```";
  String e = "\n```!time```";
  String help = pre + a + b + c + d + e;
  return help;
 }

 public static String price(String data) {
  String item = firstLetterCaps(data);
  try {
   RSExchange rsExchange = new RSExchange();
   Optional < ExchangeItem > exchangeItem = rsExchange.getExchangeItem(item);
   String itemm = exchangeItem.toString();

   //edit strings for no item found
   String h = itemm.replace("Optional[", "");
   //h = itemm.replace("Optional.empty", "Item Not Found!");
   String v = h.replace("]", "");
   String z = v.replace(",", "");
   return z;
  }
  catch (Exception a) {
      System.out.println("Error: " + a); //https://github.com/Chudleyj/
  }
  return null;
 }

 static public String firstLetterCaps(String data) {
  String firstLetter = data.substring(0, 1).toUpperCase();
  String restLetters = data.substring(1).toLowerCase();
  return firstLetter + restLetters;
 }

}
