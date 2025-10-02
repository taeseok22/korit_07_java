package ch20_collections.practice;

import java.util.*;

/*
    모임 참석자 명단 관리 프로그램 작성
    지시 사항
    1. Set을 사용해서 참석자 명단(String)을 저장 (중복 이름 안받음)
    2. 사용자로부터 참석자 이름을 계속해서 입력 받을 예정
    3. 입력 받은 이름을 Set에 추가
    4. 종료 라고 입력하면 더 이상 이름을 입력받지 않음.
    5. 최종 모임 참석자 명단을 콘솔에 출력
    실행 예
    --- 모임 참석자 명단 관리 ---
    [ 종료 ] 라고 입력하면 프로그램을 종료합니다.
    참석자 이름을 입력하세요: 김일
    참석자 이름을 입력하세요: 김이
    참석자 이름을 입력하세요: 김삼
    참석자 이름을 입력하세요: 종료
    프로그램이 종료되었습니다.

    --- 최종 참석자 명단 ---
    김일, 김이, 김삼
 */
public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> attendees = new HashSet<>();
        List<String> meetingList = new ArrayList<>();
//        boolean endOfname = false;
        boolean continuing = true;
        System.out.println(" --- 모임 참석자 명단 관리 --- ");
        System.out.println("[ 종료 ] 를 입력하면 프로그램을 종료합니다.");
        // 여기서부터 횟수가 정해지지 않은 반복문을 작성해야 한다.
//        while (!endOfname 이거랑 continuing 둘중 한개 들어가면된다) {
//            System.out.print("참석자 이름을 입력하세요: ");
//            String name = scanner.nextLine();
//            attendees.add(name);
//            if (name.equals("종료")) {
//                System.out.println("프로그램이 종료되었습니다.");
//                attendees.remove("종료");
//                break;
//            }
//        }
        while (true) {
            System.out.print("참석자 이름을 입력하세요: ");
            String name = scanner.nextLine();
            // name 변수의 데이터가 attendees에 추가 되어야함. -> .add();
            attendees.add(name);
            // 근데 name == "종료"라면 반복운을 종료시켜야함
            if (name.equals("종료")) {
                System.out.println("프로그램이 종료되었습니다.");
                attendees.remove("종료");
                break;
            }
            attendees.add(name);
        }
        meetingList.addAll(attendees);
        System.out.println("--- 최종 참석자 명단 ---");

        for (int i = 0 ; i < meetingList.size() ; i++) {
            if (i == meetingList.size() - 1) {  // meetingList.size() - 1 은 list의 마지막 index 넘버
                System.out.println(meetingList.get(i));
                break;
            }
            System.out.print(meetingList.get(i) + ", ");
        }
//        System.out.println(meetingList);
    }
}
