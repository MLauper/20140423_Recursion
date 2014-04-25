package palindrom;

import java.math.BigDecimal;

public class Sentence {

    private String text;
    private String reverse;

    /**
     * Constructs a sentence.
     *
     * @param aText a string containing all characters of the sentence
     */
    public Sentence(String aText) {
        text = aText;
    }

    /**
     * Tests whether this sentence is a palindrome.
     *
     * @return true if this sentence is a palindrome, false otherwise
     */
    public boolean isPalindrome() {
        int length = text.length();
        // Separate case for shortest strings.
        if (length <= 1)
            return true;
        // Get first and last characters, converted to lowercase.
        char first = Character.toLowerCase(text.charAt(0));
        char last = Character.toLowerCase(text.charAt(length - 1));
        if (Character.isLetter(first) && Character.isLetter(last)) {
            // Both are letters.
            if (first == last) {
                // Remove both first and last character.
                Sentence shorter = new Sentence(text.substring(1, length - 1));
                return shorter.isPalindrome();
            } else
                return false;
        } else if (!Character.isLetter(last)) {
            // Remove last character.
            Sentence shorter = new Sentence(text.substring(0, length - 1));
            return shorter.isPalindrome();
        } else {
            // Remove first character.
            Sentence shorter = new Sentence(text.substring(1));
            return shorter.isPalindrome();
        }
    }

    public static void main(String[] args) {
        Sentence s = new Sentence("Ein Neger mit Gazelle zagt im Regen nie");
        System.out.println(s.isPalindrome());
    }

    public void reverse() {

        reverse = "";
        reverse(text.length() - 1);
        //return new Sentence(reverse);
    }

    public void reverse2(){
        reverse2(text.length()-1);

    }

    public void reverse2(int indicator){
        text = text + text.charAt(indicator);
        System.out.println(text);
        if(indicator > 0){
            reverse2(--indicator);
        }
        text = text.substring(1);
        System.out.println(text);

    }

    private void reverse(int indictator) {
        //if (indictator == 1){ reverse = reverse + text.charAt(indictator); return; }
        if (indictator < 0) {
            return;
        }

        reverse = reverse + text.charAt(indictator);

        reverse(indictator - 1);
        return;
    }


    public String getText() {
        return text;
    }

    public String getReverse() {
        return reverse;
    }
}