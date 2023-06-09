package Lab7;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sentence {
    String str = new String();

    Sentence() {
    }

    Sentence(String str) {
        this.str = str;
    }
    public List<Sentence> findQue(List<Sentence> arraySentenceQue,String[] array){
        for (int i = 0; i < array.length; i++) {
            arraySentenceQue.add(new Sentence(array[i].split("[\\!\\.]")[array[i].split("[\\!\\.]").length-1]));
        }
        return arraySentenceQue;
    }
    public Set<String> findUniqueWord(List<Sentence> arraySentenceQue,int countCharInWord){
        Set<String> correctWord = new TreeSet<>();
        for (Sentence sentenceQue : arraySentenceQue) {
            String[] word = sentenceQue.str.split(" ");
            for (int i = 0; i < word.length; i++) {
                if (word[i].length() == countCharInWord) {
                    correctWord.add(word[i]);
                }
            }
        }
        return correctWord;
    }
}
