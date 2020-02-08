package commons;

public class IdCardException extends Exception {
    public IdCardException(String message) {
        super(message);
    }
    public static void checkIdCard(String id) throws IdCardException{
        String regex = "^[A-Za-z0-9]{9}$";
        if(id.matches(regex)){
            System.out.println("success");
        }else
            throw new IdCardException(id + " id must be nine character XXXXXXXXX");
    }
}
