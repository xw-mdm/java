package homework;

import java.util.*;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-18
 * Time: 12:17
 */
public class Test {
}

//819. 最常见的单词
class Solution {
    public  static String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String s=paragraph;
        if(banned!=null){
        for (int i = 0; i < banned.length; i++) {
            s=s.replace(banned[i],"");
        }
        }
        for (int i = 0; i <s.length() ; i++) {
            s=s.replace(","," ");
            s=s.replace("."," ");
        }
        HashMap<String, Integer> map = new HashMap<>();
        String[] str = s.split("\\s+" );

        for (int i = 0; i < str.length; i++) {
            if (map.get(str[i]) == null) {
                map.put(str[i], 1);
            } else {
                map.put(str[i], map.get(str[i]) + 1);
            }
        }
        int max = 0;
        String a = "";
        for (int i = 0; i < str.length; i++) {
            if (map.get(str[i]) == null) {
                continue;
            }
            if (max < map.get(str[i])) {
                max=map.get(str[i]);
                a = str[i];
            }

        }
        return a;
    }

    public static void main(String[] args) {
        String s="Bob hit a ball, the hit BALL flew far after it was hit.";
        String s1="a.";
        String [] a={"hit","ball"};
        System.out.println(mostCommonWord(s, a));
    }
}
class Solution2 {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> hashSet = new HashSet<>();
        HashMap<String,Integer> hashMap = new HashMap<>();

        for(int i = 0;i < banned.length;i++){
            hashSet.add(banned[i]);
        }

        String[] words = paragraph.split("[\\s|!|?|\\'|,|;|.]");
        String temp = "";
        for(int i = 0;i < words.length;i++){
            temp = words[i].toLowerCase();
            if(temp.length() != 0 && !hashSet.contains(temp)){
                hashMap.put(temp,hashMap.getOrDefault(temp,0)+1);
            }
        }

        String res = "";
        int res_sum = 0;
        for(String s:hashMap.keySet()){
            if(hashMap.get(s) >= res_sum){
                res = s;
                res_sum = hashMap.get(s);
            }
        }

        return res;
    }
}
//1170. 比较字符串最小字母出现频次
class Solution6{
    public static int[] numSmallerByFrequency(String[] queries, String[] words) {


        int []word=new int [words.length+1] ;
        for (int i = 0; i <words.length ; i++) {
            word[i+1]=f(words[i]);
        }
      Arrays.sort(word);

        int []querie=new int [queries.length];
        for (int i = 0; i <queries.length ; i++) {
            querie[i]=f(queries[i]);
        }
        int []ret=new int[querie.length];

        for (int i = 0; i <queries.length ; i++) {
            for (int j = 0; j <word.length ; j++) {
                if(querie[i]>=word[j]){
                    ret[i]=word.length-j-1;
                }
            }
        }

        return ret;

    }

    public static int f(String word){
        char[] ch= word.toCharArray();
        char ch1='z';
        int num=0;
        for (int i = 0; i <word.length() ; i++) {
           if(ch[i]<ch1){
               ch1=ch[i];
               num=0;
           }
           if(ch[i]==ch1){
               num++;
           }
        }
        return  num;
    }

    public static void main(String[] args) {
       /* String words[]={"a","aa","aaaa","aaa"};
        String queries[]={"bbb","cc"};*/
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 222);
        map.put(1, 333);
        System.out.println(map);

      /*  String queries []= {"cbd"};
        String words[] = {"zaaaz"};
        System.out.println(Arrays.toString(numSmallerByFrequency(queries, words)));
    }*/
    }
}
//检测数独
class Solution65 {

        public boolean isValidSudoku ( char[][] board){
            HashSet<Character> set1 = new HashSet<>();
            HashSet<Character> set2 = new HashSet<>();
            HashSet<Character> set3 = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') continue;
                    if (!set2.add(board[i][j])) {
                        return false;
                    }
                }
                set2.clear();
            }
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[j][i] == '.') continue;
                    if (!set1.add(board[j][i])) {
                        return false;
                    }
                }
                set1.clear();
            }
            for (int i = 0; i <= 6; i += 3) {
                for (int j = 0; j <= 6; j += 3) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (board[i + k][j + l] == '.') continue;
                            if (!set3.add(board[i + k][j + l])) {
                                return false;
                            }
                        }
                    }
                    set3.clear();
                }
            }
            return true;
        }

}
//寻找重复数组
class Solution666{
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i <nums.length ; i++) {
           if(! set1.add(nums[i])){
               return  true;
           }
        }
        return  false;
    }
}
//找不同  给定两个字符串 s 和 t，它们只包含小写字母。
//
//字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
//
//请找出在 t 中被添加的字母。
class Solution89 {
    public char findTheDifference(String s, String t) {

        HashSet<Character> set1 = new HashSet<>();
        for (int i = 0; i <s.length() ; i++) {
           if(! set1.add(s.charAt(i))){
               set1.remove(s.charAt(i));
           }else
               set1.add(t.charAt(i));
        }
        for (int i = 0; i <t.length() ; i++) {
            if(! set1.add(t.charAt(i))){
                set1.remove(t.charAt(i));
            }else
                set1.add(t.charAt(i));
        }
        Iterator<Character>iterator=set1.iterator();
        return iterator.next();

    }
}









