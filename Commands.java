import java.util.concurrent.ThreadLocalRandom;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
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

if(randomNum == 1)
return("Heads");

else
return("Tails");
}



public static String meme() {

int min = 1;
int max = 60000;
int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

return("https://www.memecenter.com/fun/" + randomNum);

}



public static String help() {

String help = "Commands: \n\n```!coin```\n```!dice```\n```!meme```\n```!ge {item name}```";
return help;

}



public static String split(String data) {

String cancer = firstLetterCaps(data);
   try {
    RSExchange rsExchange = new RSExchange();
    Optional < ExchangeItem > exchangeItem = rsExchange.getExchangeItem(cancer);
    String itemm = exchangeItem.toString();

//edit strings for no item found
    String h = itemm.replace("Optional[", "");
    //h = itemm.replace("Optional.empty", "Item Not Found!");
    String v = h.replace("]", "");
    String z = v.replace(",", "");
return z;
   } catch (Exception a) {

   }
return null;
}



public static String price(String data) {

String cancer = firstLetterCaps(data);
   try {
    RSExchange rsExchange = new RSExchange();
    Optional < ExchangeItem > exchangeItem = rsExchange.getExchangeItem(cancer);
    String itemm = exchangeItem.toString();

//edit strings for no item found
    String h = itemm.replace("Optional[", "");
    //h = itemm.replace("Optional.empty", "Item Not Found!");
    String v = h.replace("]", "");
    String z = v.replace(",", "");
return z;
   } catch (Exception a) {

   }
return null;
}


 static public String firstLetterCaps(String data) {
  String firstLetter = data.substring(0, 1).toUpperCase();
  String restLetters = data.substring(1).toLowerCase();
  return firstLetter + restLetters;
 }



}