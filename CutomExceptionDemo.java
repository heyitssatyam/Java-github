class CustomExceptionDemo{

    static double divide(int num, int denom) throws DivisionByZeroException{
        if(denom==0){
            throw new DivisionByZeroException("Cannot divide by Zero");
        }
        return (double)num/denom;
    }
    public static void main(String[] args){
        int num =10;
        int denom =0;
        try{
            double result = divide(num , denom);
            System.out.println("Result of division: "+ result);
        }catch(DivisionByZeroException e)
        {
            System.out.println("Exception caught: "+ e.getMessage());
        }
        finally{
            System.out.println("Finally block Executed");
        }
    }
}


class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message){
        super(message);
    }
}