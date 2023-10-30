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
           
            // For each word in the array of words
            for(String word : words)
        	{
            	// If there isn't already a key for a given word, create it
        		if(!tempMap.containsKey(word))
        		{
        			tempMap.put(word, 0.0);
        		}
        		
        		// If the word is found, add one to its frequency
        		tempMap.put(word, tempMap.get(word) + 1);
        	}
            
            // For each key in the tempMap,
            for(String word: tempMap.keySet())
            {
            	// Re-assign the value to be the result of #X/#words in Y
            	tempMap.put(word, tempMap.get(word)/words.length);
            }
            
            // After Calculaion
            result.put(songTitle, tempMap);
        }
        
        return result;
    }

}
