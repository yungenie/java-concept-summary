package streamexam;

import java.util.*;
import java.util.stream.Stream;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

/**
 * Stream - Collectors 그룹핑 및 통계 예제 (groupingBy)
 *
 * @since  1.8
 * @see Stream
 * @author Yunjin
 */
class Student2 {
    String name;
    String gender; // 성별
    int hak; // 학년
    int ban; // 반
    int score;

    Student2(String name, String gender, int hak, int ban, int score) {
        this.name	= name;
        this.gender	= gender;
        this.hak	= hak;
        this.ban	= ban;
        this.score  = score;
    }
    String getName() {
        return name;
    }
    String gender() {
        return gender;
    }
    int getHak() {
        return hak;
    }
    int getBan() {
        return ban;
    }
    int getScore() {
        return score;
    }

    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]", name, gender, hak, ban, score);
    }
    // groupingBy()에서 사용
    enum Level { HIGH, MID, LOW }  // 성적을 상, 중, 하 세 단계로 분류
}
public class CollectExam01 {
    public static void main(String[] args) {
        Student2[] stuArr = {
                new Student2("나자바", "M",  1, 1, 300),
                new Student2("김지미", "F", 1, 1, 250),
                new Student2("김자바", "M",  1, 1, 200),
                new Student2("이지미", "F", 1, 2, 150),
                new Student2("남자바", "M",  1, 2, 100),
                new Student2("안지미", "F", 1, 2,  50),
                new Student2("황지미", "F", 1, 3, 100),
                new Student2("강지미", "F", 1, 3, 150),
                new Student2("이자바", "M",  1, 3, 200),
                new Student2("나자바", "M",  2, 1, 300),
                new Student2("김지미", "F", 2, 1, 250),
                new Student2("김자바", "M",  2, 1, 200),
                new Student2("이지미", "F", 2, 2, 150),
                new Student2("남자바", "M",  2, 2, 100),
                new Student2("안지미", "F", 2, 2,  50),
                new Student2("황지미", "F", 2, 3, 100),
                new Student2("강지미", "F", 2, 3, 150),
                new Student2("이자바", "M",  2, 3, 200)
        };

        System.out.printf("1. 단순분할(성별로 분할)%n");
        Map<String, List<Student2>> stuByGender = Stream.of(stuArr).collect(groupingBy(Student2::gender));
        List<Student2> femaleStudent   = stuByGender.get("F");
        List<Student2> maleStudent = stuByGender.get("M");

        System.out.printf("여학생%n"); femaleStudent.stream().forEach(System.out::println);
        System.out.printf("남학생%n"); maleStudent.stream().forEach(System.out::println);

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수)%n");
        Map<String, Long> stuNumByGener = Stream.of(stuArr).collect(groupingBy(Student2::gender, counting()));

        System.out.println("여학생 수 : " + stuNumByGener.get("F"));
        System.out.println("남학생 수 : " + stuNumByGener.get("M"));


        System.out.printf("%n3. 단순분할 + 통계(성별 1등)%n");
        Map<String, Optional<Student2>> topScoreByGener = Stream.of(stuArr)
                .collect(groupingBy(Student2::gender, maxBy(comparingInt(Student2::getScore))
                ));

        System.out.println("여학생 1등 : " + topScoreByGener.get("F"));
        System.out.println("남학생 1등 : " + topScoreByGener.get("M"));

        Map<String, Student2> topScoreByGener2 = Stream.of(stuArr)
                .collect(groupingBy(Student2::gender,
                        collectingAndThen(
                                maxBy(comparingInt(Student2::getScore)), Optional::get
                        )
                ));
        System.out.println("여학생 1등 : " + topScoreByGener2.get("F"));
        System.out.println("남학생 1등 : " + topScoreByGener2.get("M"));


        System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");
        Map<String, Map<Boolean, List<Student2>>> failedStuByGener =
                Stream.of(stuArr).collect(groupingBy(Student2::gender,
                        groupingBy(s -> s.getScore() <= 100))
                );

        List<Student2> failedFemaleStu = failedStuByGener.get("F").get(true);
        List<Student2> failedMaleStu   = failedStuByGener.get("M").get(true);

        System.out.printf("여학생%n"); failedFemaleStu.stream().forEach(System.out::println);
        System.out.printf("남학생%n"); failedMaleStu.stream().forEach(System.out::println);


        System.out.printf("5. 단순그룹화(반별로 그룹화)%n");
        Map<Integer, List<Student2>> stuByBan = Stream.of(stuArr)
                .collect(groupingBy(Student2::getBan));

        for(List<Student2> ban : stuByBan.values()) {
            for(Student2 s : ban) {
                System.out.println(s);
            }
        }

        System.out.printf("%n6. 단순그룹화(성적별로 그룹화)%n");
        Map<Student2.Level, List<Student2>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s-> {
                    if(s.getScore() >= 200) return Student2.Level.HIGH;
                    else if(s.getScore() >= 100) return Student2.Level.MID;
                    else return Student2.Level.LOW;
                }));

        TreeSet<Student2.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for(Student2.Level key : keySet) {
            System.out.println("["+key+"]");
            for(Student2 s : stuByLevel.get(key))
                System.out.println(s);
        }

        System.out.printf("%n7. 단순그룹화 + 통계(성적별 학생수)%n");
        Map<Student2.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(s-> {
                    if(s.getScore() >= 200) return Student2.Level.HIGH;
                    else if(s.getScore() >= 100) return Student2.Level.MID;
                    else return Student2.Level.LOW;
                }, counting()));

        for(Student2.Level key : stuCntByLevel.keySet())
            System.out.printf("[%s] - %d명%n", key, stuCntByLevel.get(key));

        System.out.printf("%n8. 다중그룹화(학년별, 반별)");
        Map<Integer, Map<Integer, List<Student2>>> stuByHakAndBan =
                Stream.of(stuArr)
                        .collect(groupingBy(Student2::getHak,
                                groupingBy(Student2::getBan)
                        ));

        for(Map<Integer, List<Student2>> hak : stuByHakAndBan.values()) {
            for(List<Student2> ban : hak.values()) {
                System.out.println();
                for(Student2 s : ban)
                    System.out.println(s);
            }
        }

        System.out.printf("%n9. 다중그룹화 + 통계(학년별, 반별 1등)%n");
        Map<Integer, Map<Integer, Student2>> topStuByHakAndBan =
                Stream.of(stuArr)
                        .collect(groupingBy(Student2::getHak,
                                groupingBy(Student2::getBan,
                                        collectingAndThen(
                                                maxBy(comparingInt(Student2::getScore))
                                                , Optional::get
                                        )
                                )
                        ));

        for(Map<Integer, Student2> ban : topStuByHakAndBan.values())
            for(Student2 s : ban.values())
                System.out.println(s);

        System.out.printf("%n10. 다중그룹화 + 통계(학년별, 반별 성적그룹)%n");
        Map<String, Set<Student2.Level>> stuByScoreGroup = Stream.of(stuArr)
                .collect(groupingBy(s-> s.getHak() + "-" + s.getBan(),
                        mapping(s-> {
                            if(s.getScore() >= 200) return Student2.Level.HIGH;
                            else if(s.getScore() >= 100) return Student2.Level.MID;
                            else return Student2.Level.LOW;
                        } , toSet())
                ));

        Set<String> keySet2 = stuByScoreGroup.keySet();

        for(String key : keySet2) {
            System.out.println("["+key+"]" + stuByScoreGroup.get(key));
        }
    }
}
