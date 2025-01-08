import java.util.ArrayList;

public class Part1 {

    public static String findSimpleGene(String dna){
        int startCodon = dna.indexOf("ATG");
        if (startCodon == -1){
            return "";
        }
        int endCodon = dna.indexOf("TAA",startCodon + 3);
        if (endCodon == -1){
            return "";
        }
        String geneSubString = dna.substring(startCodon, endCodon + 3);
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
        String dna5 = "ATGGGGTAAAGT";
        ArrayList<String> dnaList = new ArrayList<>();
        dnaList.add(dna1);
        dnaList.add(dna2);
        dnaList.add(dna3);
        dnaList.add(dna4);
        dnaList.add(dna5);

        for (String dna : dnaList){
            System.out.println(findSimpleGene(dna));
        }
    }

    public static void main(String[] args){
        testfindSimpleGene();
    }

}
