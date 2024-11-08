public class SubstringSearch {
    public static int findSubstringIndex(String stri, String str2) {
        // Using the indexOf() method to find the first occurrence of str2 in stri
        return stri.indexOf(str2);
    }

    public static void main(String[] args) {
        String stri = "hello,world";
        String str2 = "world";
        
        int result = findSubstringIndex(stri, str2);
        
        System.out.println("The index of the first occurrence of str2 is: " + result);
    }
}
