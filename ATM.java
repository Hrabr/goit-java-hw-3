import java.util.Arrays;
class ATM{
    public int countBanknotes(int sum){
        int [] banknotes=new int[]{500, 200, 100, 50, 20, 10, 5, 2,1};
        int itemТumber=0;
        int count=0;
        while (banknotes[itemТumber]<=sum) {
            sum = sum - banknotes[itemТumber];
            count++;
            if(sum==0){
                break;
            }
            while (banknotes[itemТumber] >sum) {
                itemТumber++;
            }
        }
        return count;
    }
}
