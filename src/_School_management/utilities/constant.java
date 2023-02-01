package _School_management.utilities;

public interface constant {
    interface FilePath{
        String Student = "D:\\CodegymA06\\JAVA\\A08-JAVA\\src\\_School_management\\data\\Student.csv";
        String Teacher = "D:\\CodegymA06\\JAVA\\A08-JAVA\\src\\_School_management\\data\\Teacher.csv";
    }
    interface IDRegex {
        String ID_student = "^[S]\\d+$";
        String ID_teacher = "[T]\\d+$";
    }
    interface BirthdayRegex {
        String birthday_format = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$";
    }
    interface NameRegex{
        String name_format = "^(([A-Z]{1}[a-z]+)( )?){1,}$";
    }
    interface CertificationRegex{
        String certification_format = "University|Master|College";
    }
}
