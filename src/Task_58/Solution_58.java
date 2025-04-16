package Task_58;

class Solution_58 {
    public static int lengthOfLastWord(String s) {
        String[] array = s.split(" ");
        return (array[array.length - 1]).length();
    }
}

