package controllers;

public class EmailException extends Exception {
    public EmailException(String message) {
        super(message);
    }
    public static void checkMail(String email) throws EmailException {
        final String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        if (!email.matches(regex)) {
            throw new EmailException(email + " invalid,the format abc@abc.abc");
        } else
            System.out.println("Susscess");
    }

}
