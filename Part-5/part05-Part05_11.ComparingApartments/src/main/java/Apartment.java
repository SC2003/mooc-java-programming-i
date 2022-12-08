
public class Apartment {

    
    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        
        if (this.rooms > compared.rooms) {
            
            return true;
            
        }
        
        if (this.rooms < compared.rooms) {
            
            return false;
            
        }
        
        if (this.squares > compared.squares) {
            
            return true;
            
        }
        
        if (this.squares < compared.squares) {
            
            return false;
            
        }
        
        if (this.princePerSquare > compared.princePerSquare) {
            
            return true;
            
        }
        
        if (this.princePerSquare < compared.princePerSquare) {
            
            return false;
            
        }
        
        return false;
        
    }
    
    public int priceDifference(Apartment compared) {
        int itsPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        int maxPrice = Math.max(itsPrice, comparedPrice);
        int minPrice = Math.min(itsPrice, comparedPrice);
        return maxPrice - minPrice;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int itsPrice = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        if(itsPrice > comparedPrice) {
            return true;
        }
        return false;
    }
    
}
