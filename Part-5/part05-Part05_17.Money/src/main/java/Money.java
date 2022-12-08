
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        // create a new Money object that has the correct worth
        Money newMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));
        // return the new Money object
        return newMoney;
    }

    public boolean lessThan(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        }
        if (this.euros == compared.euros()) {
            if (this.cents < compared.cents()) {
                return true;
            }
        }
        return false;
    }

    public Money minus(Money decreaser) {
        
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
        if (newCents < 0) {
            newCents = 100 - Math.abs(newCents);
            newEuros--;
        }
        Money newMoney = null;
        if (newEuros < 0) {
            newMoney = new Money(0, 0);
            return newMoney;
        }
        newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
