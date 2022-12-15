
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count1 = new Counter();
        Counter count2 = new Counter(10);
        
        System.out.println("Start:");
        System.out.println("Counter 1: " + count1);
        System.out.println("Counter 2: " + count2);
        
        count1.increase();
        count2.increase();
        
        System.out.println("Step 1:");
        System.out.println("Counter 1: " + count1);
        System.out.println("Counter 2: " + count2);
        
        count1.increase(5);
        count2.increase(5);
        
        System.out.println("Step 2:");
        System.out.println("Counter 1: " + count1);
        System.out.println("Counter 2: " + count2);
        
        count1.decrease();
        count2.decrease();
        
        System.out.println("Step 3:");
        System.out.println("Counter 1: " + count1);
        System.out.println("Counter 2: " + count2);
        
        count1.decrease(2);
        count2.decrease(2);
        
        System.out.println("Step 4:");
        System.out.println("Counter 1: " + count1);
        System.out.println("Counter 2: " + count2);
        
        count1.decrease(-1);
        count2.decrease(-1);
        
        System.out.println("Step 5:");
        System.out.println("Counter 1: " + count1);
        System.out.println("Counter 2: " + count2);
        
        count1.increase(-9);
        count2.increase(-9);
        
        System.out.println("Step 6:");
        System.out.println("Counter 1: " + count1);
        System.out.println("Counter 2: " + count2);
    }
}