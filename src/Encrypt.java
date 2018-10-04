public class Encrypt {

   private String alphabet = "abcdefghijklmnopqrstuvwxyz";;
   private String plainText;
   private String key;

   int cipherAmount;

   StringBuilder cipherText;

   public Encrypt(String plainText, int cipherAmount){
       this.plainText = plainText.toLowerCase();
       this.key = "thequickbrownfoxjumpsoverthelazydog".toLowerCase();
       this.cipherAmount = cipherAmount;
       cipherText = new StringBuilder();
   }

   public String Caesar(){
       for(int i=0; i < plainText.length(); i++){
           int num = alphabet.indexOf(plainText.charAt(i));
           cipherText.append(alphabet.charAt((num + cipherAmount)%26));
       }
       return cipherText.toString();
   }

    public String oneTime(){
       for(int i=0; i< plainText.length(); i++){
           int first = alphabet.indexOf(plainText.charAt(i)) % 26;
           int second = alphabet.indexOf(key.charAt(i)) % 26;

           cipherText.append(alphabet.charAt((first + second)%26));
       }

           return cipherText.toString();
        }


}
