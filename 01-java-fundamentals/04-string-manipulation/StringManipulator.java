public class StringManipulator{
    public String trimAndConcat(String string1, String string2){
        return string1.trim().concat(string2.trim());
    }

    public Integer getIndexOrNull(String input , char letter){
        if(input.indexOf(letter) == -1){ 
            return null;
        }
        return input.indexOf(letter);
    }
    public Integer getIndexOrNull(String string, String substring){
        if (string.indexOf(substring) == -1){
            return null;
        }
        return string.indexOf(substring);
    }

    public String concatSubstring(String string1, int startIndex , int endIndex, String string2){
        String substring = string1.substring(startIndex, endIndex);
        return substring.concat(substring);
    }
        



}