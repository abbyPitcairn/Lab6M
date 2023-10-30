package Lab6;

import java.util.TreeMap;

public class TermFrequencyCalculator implements ITermFrequency {

    @Override
    public TreeMap<String, TreeMap<String, Double>> getTermFrequency(TreeMap<String, String> songLyrics) {
        TreeMap<String, TreeMap<String, Double>> result = new TreeMap<String, TreeMap<String, Double>> ();
        
        for(String songTitle: songLyrics.keySet())
        {
            // For each song you have to create TF values
            TreeMap<String, Double> tempMap = new TreeMap<String, Double>();

            // current lyrics
            String lyric = songLyrics.get(songTitle);
            String[] words = lyric.split(" ");
            
            // Calculate the Term Frequency (TF) Values here and save them in tempMap
            
            // You might need to introduce other methods and additional variables
            
            // TF for Term (word) X in Song S is calculated as frequency of that X divided 
            // by total number of words in the lyric
            
            ////////////////////////////
            //WRITE HERE
            //////////////////////////
            
            
            // After Calculaion
            result.put(songTitle, tempMap);
        }
        
        return result;
    }

}
