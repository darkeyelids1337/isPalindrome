class Solution {
    public boolean isPalindrome(int x) {
        int first = x;
        int number = 0;
        number = x % 10;
        x /= 10;
        while(x > 0)
        {
            number = number * 10 + (x % 10);
            x /= 10;
        }
        if(number == first && number > -1)
        {
            return true;
        }
        else return false;
    }
}
