
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);
        
        paulsCard.eatHeartily();
        
        mattsCard.eatAffordably();
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.addMoney(20);
        
        mattsCard.eatHeartily();
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        
        mattsCard.addMoney(50);
        
        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
//        PaymentCard myCard = new PaymentCard(10);
//        System.out.println(myCard);
//        
//        myCard.addMoney(-15);
//        System.out.println(myCard);

//        myCard.eatAffordably();
//        myCard.eatHeartily();
//        myCard.addMoney(10);
//        System.out.println(myCard);
//
//        myCard.eatHeartily();
//        myCard.eatAffordably();
//        myCard.addMoney(200);
//        System.out.println(myCard);
    }
}
