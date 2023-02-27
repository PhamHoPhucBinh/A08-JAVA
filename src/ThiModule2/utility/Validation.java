package ThiModule2.utility;

public class Validation {
    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(ConstantUtil.PhoneRegex.phone_number);
    }
    public static boolean isName(String name) {
        return name.matches(ConstantUtil.NameRegex.name_format);
    }
    public static boolean isSexual(String sexual) {
        return sexual.matches(ConstantUtil.SexualRegex.sexual_format);
    }
    public static boolean isBirthday(String birthday) {
        return birthday.matches(ConstantUtil.BirthdayRegex.birthday_format);
    }
    public static boolean isEmail(String email){
        return email.matches(ConstantUtil.EmailRegex.email_format);
    }

}
