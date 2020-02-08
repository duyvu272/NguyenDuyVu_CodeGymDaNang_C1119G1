package commons;

public class GenderException extends Exception {
    public GenderException(String message) {
        super(message);
    }
    public static void checkGender(String gender) throws GenderException{
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")||gender.equalsIgnoreCase("unknow")){
            System.out.println("success");
        }else
            throw new GenderException(gender+ " is invalid. Gender must be Male or Female or Unknow");
    }
}
