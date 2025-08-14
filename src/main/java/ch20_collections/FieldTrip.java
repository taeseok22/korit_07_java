package ch20_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fieldTrips = new ArrayList<>();
        Set<String> fieldTripSet = new HashSet<>();
        List<String> finalFieldTrips = new ArrayList<>();

        int student = 0;
        System.out.println("몇 명의 학생의 수학 여행지를 입력하시겠습니까? : ");
        student = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0 ; i < student ; i++) {
            System.out.print((i+1) + "번 학생의 수학 여행지를 입력하세요 : ");
            String fieldTrip = scanner.nextLine();
            fieldTrips.add(fieldTrip);
        }
        System.out.println();
        for (int i = 0 ; i < student ; i++) {
            System.out.println((i+1) + " 번 학생의 후보지: " + fieldTrips.get(i));
        }
        fieldTrips.addAll(fieldTripSet);
        System.out.println();
        // ste 에서 list로 옮긴다 -> 중복 제거된 element 들을 추후 추출하기 위해
        finalFieldTrips.addAll(fieldTripSet);
        System.out.println("수학 여행 후보지는: ");
        for (String trip : fieldTrips) {
            System.out.println(trip);
        }
        System.out.println("입니다.");
        /*
            1. 학생의 수롤 입력 받아 해당 횟수만큼 반복문을 돌릴 것
            2. 1번 ~ 5번 학생의 응답을 fieldTrips List에 저장할 것
            3. 중복을 제거하기 위해 fieldTripSet에 이상의 List의 element 들을 옮겨 담을 것
            4. 맨 마지막 출력문은 Set -> List로 재이동하여 finalFieldTrips List 에서 element 들을 추출해서 작성할 것
            실행 예
            몇 명의 학생이 수학 여행지를 입력하시겠습니까? : 5명
            1번 학생의 수학 여행지를 입력하세요 : 제주
            2번 학생의 수학 여행지를 입력하세요 : 제주
            3번 학생의 수학 여행지를 입력하세요 : 민속촌
            4번 학생의 수학 여행지를 입력하세요 : 민속촌
            5번 학생의 수학 여행지를 입력하세요 : 제주

            1번 학생의 후보지 : 제주
            2번 학생의 후보지 : 제주
            3번 학생의 후보지 : 민속촌
            4번 학생의 후보지 : 민속촌
            5번 학생의 후보지 : 제주

            수학 여행 후보지는
            제주
            민속촌
            입니다.
         */
    }
}
