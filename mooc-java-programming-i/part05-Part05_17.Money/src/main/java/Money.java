
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        int e = this.euros + addition.euros;
        int f = this.cents + addition.cents;
        Money newMoney = new Money(e, f);
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        if (this.euros > compared.euros){
            return false;
        } else if (this.euros < compared.euros){
            return true;
        } else if (this.euros == compared.euros){
            if (this.cents > compared.cents){
                return false;
            } else return true;
        }
        
        return false;
    }
    
    public Money minus(Money decreaser){
        int e;
        int f;
        
        
        if (this.cents < decreaser.cents){
           e = this.euros() - 1 - decreaser.euros();
           f = 100 + this.cents() - decreaser.cents();           
        } else {
            e = this.euros() - decreaser.euros();
            f = this.cents() - decreaser.cents();
        }
        
        if (e < 0){
            e = 0;
            f = 0;
        }
        
        Money x = new Money(e, f);
        return x;
    }

}
