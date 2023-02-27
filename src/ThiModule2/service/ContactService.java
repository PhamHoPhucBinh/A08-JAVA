package ThiModule2.service;


import ThiModule2.exception.NotFoundPhoneNumber;
import ThiModule2.model.Contact;
import ThiModule2.utility.FileHelper;
import ThiModule2.utility.ConstantUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ContactService {
    private List<Contact> contacts;
    private FileHelper<Contact> fileContact = new FileHelper<>();
    public ContactService() {
        contacts = toContacts();
    }
    public List<Contact> getAllContact() {
        return contacts;
    }

    //CREATE

    public void create(Contact contact) {
        contacts.add(contact);
        fileContact.write(ConstantUtil.FilePath.Contact,contacts,false);
    }
    //FIND
    public boolean findByNumber(String phoneNumber) {
        return Stream.of(contacts).flatMap(Collection::stream).anyMatch(n -> n.getPhoneNumber().equals(phoneNumber));
    }
    public boolean findByName(String name){
        return Stream.of(contacts).flatMap(Collection::stream).anyMatch(e -> e.getName().equals(name));
    }
    //DELETE
    public boolean delete(String phoneNumber) throws NotFoundPhoneNumber {
        if (contacts.removeIf(e -> e.getPhoneNumber().equals(phoneNumber))) {
            fileContact.write(ConstantUtil.FilePath.Contact, contacts, false);
            return true;
        }


        throw new NotFoundPhoneNumber("this phone number is not existed");
    }
    //SEARCH
    public List<Contact> searchByPhoneNumber(String phoneNumber) {
        return Stream.of(contacts).flatMap(Collection::stream).filter(e -> e.getPhoneNumber().contains(phoneNumber)).toList();
    }
    public List<Contact> searchByName(String name){
        return Stream.of(contacts).flatMap(Collection::stream).filter(e -> e.getName().contains(name)).toList();
    }
    private List<Contact> toContacts() {
        List<Contact> res = new ArrayList<>();
        List<String> lines = fileContact.read(ConstantUtil.FilePath.Contact);

        for (String line : lines) {
            String[] tmp = line.split(",");
            String phoneNumber = tmp[0];
            String group = tmp[1];
            String name = tmp[2];
            String sexual = tmp[3];
            String adress = tmp[4];
            String birthday = tmp[5];
            String email = tmp[6];
            Contact contact = new Contact(phoneNumber,group,name,sexual,adress,birthday,email);
            res.add(contact);
        }
        return res;
    }

}
