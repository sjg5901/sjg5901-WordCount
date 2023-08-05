
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        
        // .split() returns an array of all words
        // .length is an array method that returns the number of elements present in the array

        return in.split(" ").length;
    }
}
