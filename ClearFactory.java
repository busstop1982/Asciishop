import java.util.Scanner;

class ClearFactory implements Factory{
    
    public ClearFactory(){
        
    }
    
    public Operation create(Scanner scanner){
        return new ClearOperation();
    }
    
}
