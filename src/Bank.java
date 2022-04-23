import java.util.ArrayList;
import java.util.List;

public class Bank {
    public static List<person> bankMembers = new ArrayList<>();
    public static void addToBankMembersList(person member){
        bankMembers.add(member);
    }
    public static boolean loginSucceeded(String username){
        for(int i =0; i < bankMembers.size(); i++){
            if(bankMembers.get(i).firstName.equals(username)){
                return true;
            }
        }
        return false;
    }
    public static person findUser(String username){
        for(int i =0; i < bankMembers.size(); i++){
            if(bankMembers.get(i).firstName.equals(username)){
                return bankMembers.get(i);
            }
        }
        return null;
    }
}
