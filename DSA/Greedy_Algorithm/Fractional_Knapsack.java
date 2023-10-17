import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;
 
// Greedy approach
public class Fractional_Knapsack {
    // Function to get maximum value
    private static double getMaxValue(ItemValue[] arr, int capacity){
        // Sorting items by profit/weight ratio;
        // we are using comparator interface
        Arrays.sort(arr, new Comparator<ItemValue>() {
            @Override    // since we are changing parameters of inbuilt methods
            // compare method is present in comparator interface
            public int compare(ItemValue item1, ItemValue item2){
                double cpr1 = Double.valueOf(item1.profit/item1.weight);
                double cpr2 = Double.valueOf(item2.profit/item2.weight);
     
                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });
 
        double totalValue = 0;
 
        for (ItemValue i : arr) {
 
            int curWt = (int)i.weight;
            int curProfit = (int)i.profit;
 
            if (capacity - curWt >= 0) {
 
                // This weight can be picked whole part
                capacity = capacity - curWt;
                totalValue += curProfit;
            }
            else {
 
                // Item can't be picked whole -- take fractional part
                double fraction = ((double)capacity / (double)curWt);
                totalValue += (curProfit * fraction);
                capacity = (int)(capacity - (curWt * fraction));
                break;
            }
        }
 
        return totalValue;
    }
 
    // defining Item value class 
    static class ItemValue {
 
        int profit, weight;
 
        // Item value function
        public ItemValue(int profit, int wt)
        {
            this.weight = wt;
            this.profit = profit;
        }
    }
 
    // Driver code -- giving data which will be used in the code
    public static void main(String[] args){
        // two values are present in single index
        ItemValue[] arr = { new ItemValue(25, 5),
                            new ItemValue(75, 10),
                            new ItemValue(100, 12),
                            new ItemValue(50, 4),
                            new ItemValue(45, 7),
                            new ItemValue(90, 9),
                            new ItemValue(30, 3)
                        };
 
        int capacity = 37;

        //function calling                
        double maxValue = getMaxValue(arr, capacity);
 
        // Function call
        System.out.println("Maximum Profit is: " +maxValue);
    }
}