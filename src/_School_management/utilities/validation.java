package _School_management.utilities;
import _School_management.utilities.constant.*;

public class validation {
    public static boolean isStudentID(String id){
        return id.matches(IDRegex.ID_student);
    }
    public static boolean isTeacherID(String id){
        return id.matches(IDRegex.ID_teacher);
    }
    public static boolean isBirthday(String birthday){
        return birthday.matches(BirthdayRegex.birthday_format);
    }

}
