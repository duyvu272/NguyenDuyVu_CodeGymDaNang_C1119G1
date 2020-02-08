package commons;

public class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }

    public static void checkName(String name) throws NameException{
        final String regex = "(^[A-z]{1}[a-z]*)( [A-Z]{1}[a-z]*)*$";
        if(!name.matches(regex)){
            throw new NameException(name + " invalid. The first character in word must be UpperCase");
        }else
            System.out.println("Success");
    }
}
