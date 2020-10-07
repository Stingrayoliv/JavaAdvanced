package moduleSecond.lesson06102020.Anagram;

import java.util.*;

public class Anagram {
    public static List<String> VOC = Arrays.asList("anna", "ivan", "naan", "vani", "piotr", "navi", "annna");
    private Map<String, List<String>> map;
    public Anagram(List<String> voc){
        map = buildMap(voc);
    }

    //vocabulary={{“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}}
    //"anna" -> naan
    //"ivan" ->vani, navi
    //"anna
    public List<String> getAnagram(String word) { // не эфективный, сложность O(n). Чем больше словарь,
      String sortedWord = sortWord(word);
        return map.get(sortedWord);
    }

    //
    private Map<String, List<String>> buildMap(List<String> voc) {
        Map<String, List<String>> ret = new HashMap<>();
        for (String w : VOC) {
            String sortedWord = sortWord(w);
            List<String> list = ret.get(sortedWord);// проверяем пустой ли список
            if (list == null) {
                list = new ArrayList<>();
                list.add(w);
                ret.put(sortedWord, list);
            } else {
                list.add(w);// в Map второй раз записывать не надо, только меняем сам список, если добавилось значение
            }
        }
        return ret;
    }

    private static String sortWord(String word) { // сортироруем по алфавиту массив
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
