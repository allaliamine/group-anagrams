import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Anagram {


    public List< List<String> > Annagrammes(String[] str){

        if (str.length == 0)
            return new ArrayList<>();

        List <List<String>> groupOfAnnagramme = new ArrayList<>();

        for(String word: str){

            boolean isGroupFound = false;

            for( List<String> group: groupOfAnnagramme){

                if( isAnagramme(group.get(0), word)) {
                    group.add(word);
                    isGroupFound = true;
                }

            }

            if(!isGroupFound){
                List<String> NewGroup = new ArrayList<>();
                NewGroup.add(word);
                groupOfAnnagramme.add(NewGroup);
            }


        }

        return groupOfAnnagramme;
    }


    public boolean isAnagramme(String s1, String s2){
        if(s1.length() != s2.length())
            return false;

        char [] word1 = s1.toCharArray();
        char [] word2 = s2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);
    }


    public static void main(String[] args) {

        Anagram anagram = new Anagram();

        String[] test1 = {"act","pots","tops","cat","stop","hat"};
        String[] test2 = {"x"};

        System.out.println(anagram.Annagrammes(test1));

//        System.out.println( anagram.isAnagramme("amine", "enima"));

    }
}