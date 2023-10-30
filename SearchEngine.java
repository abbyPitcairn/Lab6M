
import java.util.Collection;
import java.util.TreeMap;

public class SearchEngine {
    // TreeMap of songs title and TreeMap of 
    TreeMap<String, TreeMap<String, Double>> TFValues;
    
    // TreeMap of words and their IDF values
    TreeMap<String, Double> IDFValues;
    
    // TreeMap of song titles and their lyrics
    TreeMap<String, String> songTitleLyrics;
    public SearchEngine(LyricsReader lyricsReader, ITermFrequency TF, IInverseFreq IDF)
    {
        songTitleLyrics = lyricsReader.songLyricsMap;
        TFValues = TF.getTermFrequency(songTitleLyrics);
        IDFValues = IDF.getInverseDocumentFrequency(songTitleLyrics);        
    }

    // Search for the name of the song with the highest TF-IDF value for the input query
    public String search(String query)
    {
        String [] queryWords = query.split(" ");
        
        String resultSong = "";
        double maxScore = -1;
      
        // Iterating on each song to calculate its TF-IDF value for the query
        for(String songTitle: songTitleLyrics.keySet())
        {
            // TF-IDF score for the current song
            double score = 0;
            
            // Iterating 
            for(String queryWord: queryWords)
            {
                // Here you should get the corresponding TF and IDF values of that query word
                // And then modify the code to calculate the TF-IDF value
                // Score for a song, is summation of TF*IDF values for each query word
                // Note that IDF are global and not related to a specific song
                // But TF values for a query word is different among different songs
            	
            	if(!(IDFValues.containsKey(queryWord))) {
            		continue;
            	}
            	else {
                //multiply the IDFValues and TFValues of each word to get the sum, and then add the sum to the score
            		double sum = IDFValues.get(queryWord) * TFValues.get(songTitle).get(queryWord);
	            	score += sum;
            	}
            }
            
            if (score>maxScore)
            {
                maxScore = score;
                resultSong = songTitle;
            }
        }
        
        // You should return the name of the song with the highest TF-IDF value
        return resultSong;
    }
}
