class Stats<T extends Number> {
    T[] nums;

    // Constructor
    Stats(T[] nums) {
        this.nums = nums;
    }

    // Calculate average
    double average() {
        double sum = 0;
        for (T num : nums) {
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
}

public class GenericExtend {
    public static void main(String[] args) {

        // Use with Integer
        Integer[] intNums = {10, 20, 30, 40};
        Stats<Integer> intStats = new Stats<>(intNums);
        System.out.println("Integer average: " + intStats.average());

        // Use with Double
        Double[] doubleNums = {1.5, 2.5, 3.5};
        Stats<Double> doubleStats = new Stats<>(doubleNums);
        System.out.println("Double average: " + doubleStats.average());
    }
}