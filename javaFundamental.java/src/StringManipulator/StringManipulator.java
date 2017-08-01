package StringManipulator;

public class StringManipulator {
    public String trimAndConcat(String str1, String str2){
        return str1.trim() + str2.trim();
    }
    public Integer getIndexOrNull(String str, char letter){
        int index = str.indexOf(letter);
        return index == -1 ? null : index;
    }
    public Integer getIndexOrNull(String str1, String str2){
        int index = str1.indexOf(str2);
        return index == -1 ? null : index;
    }
    public String concatSubstring(String str1, int int1, int int2, String str2){
        return str1.substring(int1, int2) + str2;
    }
}
