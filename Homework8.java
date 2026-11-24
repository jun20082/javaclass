import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        HashMap<String, String> accounts = new HashMap<>();
        accounts.put("myId", "myPass");
        accounts.put("myId2", "myPass2");
        accounts.put("myId3", "myPass3");

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("id와 password를 입력해주세요.");
                System.out.print("id : ");
                if (!scanner.hasNextLine()) {
                    break;
                }
                String id = scanner.nextLine().trim();

                if (!accounts.containsKey(id)) {
                    System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                    System.out.println();
                    continue;
                }

                System.out.print("password : ");
                if (!scanner.hasNextLine()) {
                    break;
                }
                String password = scanner.nextLine().trim();

                if (accounts.get(id).equals(password)) {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }

                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
    }
}
