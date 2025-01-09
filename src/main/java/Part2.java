import java.util.ArrayList;

public class Part2 {
    public static String findSimpleGene(String dna, String startCodon, String stopCodon){
        if (dna.matches(".*[a-z].*")){
            dna = dna.toLowerCase();
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        } else{
            dna = dna.toUpperCase();
        }
        int startCodonIndex = dna.indexOf(startCodon);
        if (startCodonIndex == -1){
            return "";
        }
        int stopCodonIndex = dna.indexOf(stopCodon,startCodonIndex + 3);
        if (stopCodonIndex == -1){
            return "";
        }
        String geneSubString = dna.substring(startCodonIndex, stopCodonIndex + 3);
        if (geneSubString.length() % 3 == 0){
            return geneSubString;
        } else {
            return "";
        }
    }

    public static void testfindSimpleGene(){
        String dna1 = "CTGACGGTCTAAAG";
        String dna2 = "ATGGCATGCGTCTG";
        String dna3 = "GCGTAGGCATGACG";
        String dna4 = "ATGGCTAAAGTAC";
        String dna5 = "gatgctataat";
        ArrayList<String> dnaList = new ArrayList<>();
        dnaList.add(dna1);
        dnaList.add(dna2);
        dnaList.add(dna3);
        dnaList.add(dna4);
        dnaList.add(dna5);

        for (String dna : dnaList){
            System.out.println(findSimpleGene(dna,"ATG","TAA"));
        }
    }

    public static void main(String[] args){
        testfindSimpleGene();
    }
}
