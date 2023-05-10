package leetcode4;

public class GeneticNotations {
    public static void main(String[] args) {
        GeneticNotations geneticNotations = new GeneticNotations();
        geneticNotations.programLogic();
    }
    private void programLogic() {
        String startGene = "AACCGGTT", endGene = "AAACGGTA", bank[] = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
        int i = 0, count = 0, left = 0, right = 0;
        for (i = 0; i < bank.length; i++) {
            if (startGene.equals(bank[i])) left = i;
            if (endGene.equals(bank[i])) right = i;
        }
        System.out.println(right - left);
    }
}
