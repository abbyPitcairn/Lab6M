package Lab6;

import java.util.TreeMap;

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
            //WRITE HERE
            //////////////////////////
        }
        
        return result;
    }

}
