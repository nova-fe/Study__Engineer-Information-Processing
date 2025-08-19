/**
 * [구조체 정의]
 * struct student {
 *  int id;
 *  char name[20];
 *  double score;
 * }
 * 
 * [구조체 사용]
 * struct student s1;
 * struct student s2;
 * 
 * [구조체 초기화]
 * struct student s1 = {111, "철수", 4.3};
 * struct student s2 = {222, "영희", 3.8};
 * 
 * [구조체 멤버 참조]
 * 구조체변수이름.멤버이름
 * s1.id // 111;
 * s1.name // "철수";
 * s1.score // 4.3;
 * 
 * 값 변경
 * s1.id = 333; // s1의 id를 333으로 변경
 * strcpy(s1.name, "민수"); // s1의 name을 "민수"로 변경 (그냥 s1.name = "민수";는 에러가 남)
 * 
 * [구조체 배열 선언]
 * struct student s[2]; // 2명의 학생 정보를 저장할 수 있는 구조체 배열 선언
 * 
 * [typedef을 이용한 구조체 정의]
 * (기존)
 * struct student {
 *  int id;
 *  char name[20];
 *  double score;
 * }
 * 
 * struct student s1;
 * 
 * (typedef 사용)
 * typedef struct {
 *  int id;
 *  char name[20];
 *  double score;
 * } Student;
 * 
 * Student s1; // typedef를 사용하면 struct 키워드를 생략할 수 있음
 */