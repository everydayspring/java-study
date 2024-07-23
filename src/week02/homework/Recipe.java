package week02.homework;

/*
map
백종원 돼지고기 김치찌개 만들기
돼지고기는 핏물을 빼주세요.
잘익은 김치 한포기를 꺼내서 잘라주세요.
냄비에 들기름 적당히 두르고 김치를 넣고 볶아주세요.
다진마늘 한스푼, 설탕 한스푼 넣어주세요.
종이컵으로 물 8컵 부어서 센불에 끓여주세요.
핏물 뺀 돼지고기를 넣어주세요.
된장 반스푼, 양파 반개, 청양고추 한개를 썰어서 넣어주세요.
간장 두스푼반, 새우젓 두스푼, 고춧가루 두스푼반 넣어주세요.
중불로 줄여서 오래 끓여주세요~!!
마지막에 파 쏭쏭 썰어서 마무리하면 돼요^^
끝
 */

import java.util.*;

public class Recipe {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<String>();
        Map<Integer, String > map = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        String structure = sc.nextLine();
        String name = sc.nextLine();
        String explain = sc.nextLine();

        switch (structure.toLowerCase()) {
            case "list" :

                while (!explain.equals("끝")) {
                    list.add(explain);
                    explain = sc.nextLine();
                }

                System.out.println("[ " + structure + " 으로 저장된 " + name + " ]");
                for(int i = 0 ; i < list.size() ; i++) {
                    System.out.println((i+1) + ". " + list.get(i));
                }

                break;

            case "set" :

                while (!explain.equals("끝")) {
                    set.add(explain);
                    explain = sc.nextLine();
                }

                System.out.println("[ " + structure + " 으로 저장된 " + name + " ]");

                Iterator iter = set.iterator();
                for(int i = 0 ; i < set.size() ; i++) {
                    System.out.println((i+1) + ". " +iter.next());
                }

                break;

            case "map" :

                int num = 1;

                while (!explain.equals("끝")) {
                    map.put(num, explain);
                    num++;
                    explain = sc.nextLine();
                }

                System.out.println("[ " + structure + " 으로 저장된 " + name + " ]");
                for(int key : map.keySet()) {
                    System.out.println(key + ". " + map.get(key));
                }

                break;

            default:
                System.out.println("잘못된 입력입니다.");

        }
    }
}
