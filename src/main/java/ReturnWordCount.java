
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        
        // .split() returns an array of all words
        // .length is an array method that returns the number of elements present in the array
        // .trim() added in case of leading or trailing spaces that may result in more chars in split() array

        return in.trim().split(" ").length;
    }
}
