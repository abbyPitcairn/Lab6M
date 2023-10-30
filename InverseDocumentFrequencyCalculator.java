package Lab6;

import java.util.TreeMap;
import java.Math;
public class InverseDocumentFrequencyCalculator implements IInverseFreq {

    @Override
    public TreeMap<String, Double> getInverseDocumentFrequency(TreeMap<String, String> songLyrics) {
        TreeMap<String, Double> result = new TreeMap<String, Double> ();
        
        for(String songTitle: songLyrics.keySet())
        {
            // current lyrics
            String lyric = songLyrics.get(songTitle);
            String[] words = lyric.split(" ");
            
            // Calculate the Inverse Document Frequency (IDF) Values here
            // You might need to introduce other methods and additional variables
            
            
            // IDF for term X is calculated as log of N/T where N is total number of songs
            // and T is the number of songs having term X
            
            ////////////////////////////
            //Iterate through each word inside the lyrics
            //I considered using TreeMap.size instead of a counter
            //but this way should be easier to add to result without having a finished size
           for(String word: words) {
               double counterIsIn = 0;
               double counterTotal = 0;
            //Checks if we have already done this word               
               if(!result.containsKey(word)) {
                   for(String songTitleInner: songLyrics.keySet()) {
                       String lyricInner = songLyrics.get(songTitleInner);
                       String[] wordsInner = lyricInner.split(" ");
                       for(String wordInner: wordsInner) {
                           // If word equals wordInner we increment the T value
                           if(word.equals(wordInner)) {
                               counterIsIn+=1; 
                               break;
                           }
                       }
                           // Increment total or N value
                               counterTotal +=1;  
                   }
                 //Use math library log to find log of N / T
                 double X =  Math.log(counterTotal / counterIsIn);
                 //Add word and its IDF value to result treeMap
                 result.put(word, X)
               }  
           }
        }
        
        return result;
    }

}
