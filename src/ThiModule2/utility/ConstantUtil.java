package ThiModule2.utility;

public interface ConstantUtil {
    interface FilePath{
        String Contact = "D:\\CodegymA06\\JAVA\\A08-JAVA\\src\\ThiModule2\\data\\Contact.csv";
    }
    interface BirthdayRegex {
        String birthday_format = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$";
    }
    interface NameRegex{
        String name_format = "^(([A-Z]{1}[a-z]+)( )?){1,}$";
    }
    interface PhoneRegex{
        String phone_number = "(84|0[3|5|7|8|9])+([0-9]{8})\\b";
    }
    interface SexualRegex{
        String sexual_format = "male|female";
    }
    interface EmailRegex{
        String email_format = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    }

}
