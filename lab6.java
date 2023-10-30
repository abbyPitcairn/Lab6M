package Lab6;

/**test the Lab 6 Methods
 * @author abigail pitcairn
 * @version 30 october 2023
 */
public class lab6 {
    public static void main(String[] args) {

        // create a LyricsReader, TermFrequencyCalculator, InverseDocumentFrequencyCalculator
        LyricsReader reader = new LyricsReader(args[0]);
        TermFrequencyCalculator TFCalculator = new TermFrequencyCalculator();
        InverseDocumentFrequencyCalculator InverseTFC = new InverseDocumentFrequencyCalculator();
        SearchEngine searchEngine = new SearchEngine(reader,TFCalculator, InverseTFC);

        //Print results for given input
        System.out.println(searchEngine.search("All we hear is"));

    }
}
