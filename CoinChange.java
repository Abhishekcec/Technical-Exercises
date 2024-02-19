public class CoinChange
{
	public static void main(String[] args) {
        System.out.println("suitable test cases:");
		System.out.println("1.Basic Test Case: amount = 39p");
		System.out.println("Minimum number of coins: "+ minCoins(39));
		System.out.println("2.Zero Change Test Case: amount = 0p");
		System.out.println("Minimum number of coins: "+ minCoins(0));
		System.out.println("3.Single Coin Test Case: amount = 5p");
		System.out.println("Minimum number of coins: "+ minCoins(5));
		System.out.println("4.Large Target Amount Test Case: amount = 2398p");
		System.out.println("Minimum number of coins: "+ minCoins(2398));
        System.out.println("5.All Coins Test Case:: amount = 188p");
		System.out.println("Minimum number of coins: "+ minCoins(188));
        System.out.println("6.Negative Input Test Case: amount = -10p");
		System.out.println("Minimum number of coins: "+ minCoins(-10));
	}
	public static int minCoins(int total) {

        if(total < 0){
            return 0;
        }
        int[] coins = { 100, 50, 20, 10, 5, 2, 1 };

        int totalCoins = 0;
        for(int i = 0; i<7; i++){
            int count = total / coins[i];
            totalCoins = totalCoins + count;
            total = total % coins[i];
        }

        return totalCoins;
    }
}
