package Test;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

public class question5 {
    private List<User> userList = new ArrayList<>();

    public class User {
        int id;
        String name;


        public User addUser(User newUser) {
            try {
                if (newUser.getName() == "" || newUser.getName().isEmpty()) {
                    throw new Exception("blank");
                }
                newUser.setId(id++);
                userList.add(newUser);

            } catch (Exception e) {
                e.printStackTrace();

            }
            return newUser;
        }

        public String removeUser(int id) {
            try {
                for (User user : userList) {
                    if (user.getId() == id) {
                        userList.remove(user);
                        return "del done";
                    } else {
                        throw new Exception("not found");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            return "not found";
        }


        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
