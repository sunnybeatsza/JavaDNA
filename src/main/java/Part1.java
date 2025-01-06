public class Part1 {
    public String findSimpleGene(String dna){
        int startCodonIndex = dna.indexOf("ATG");
        int endCodonIndex = dna.indexOf("TAA", startCodonIndex + 3);
        if (startCodonIndex == -1 || endCodonIndex == -1) {
            return "";
        }
        String gene = dna.substring(startCodonIndex,endCodonIndex + 3);
        if (gene.length() % 3 == 0){
            return gene;
        } else{
            return "Invalid gene";
        }
    }
}
