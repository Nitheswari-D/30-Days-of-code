//Valid Palindrome
lass Solution {
    public boolean isPalindrome(String s) {
       s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       int len=s.length();
       if(len<2)
            return true;
        StringBuffer s1=new StringBuffer(s);
        String string=s1.reverse().toString();
        if(s.equals(string))
            return true;
        else
            return false;
    }
}
