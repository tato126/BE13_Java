package test.chapter12.human;

public class SchoolEx01 {
    public static void main(String[] args) {

        School<Human> humanSchool = new School<>();
        School<Childe> childeSchool = new School<>();
        School<Youth> youthSchool = new School<>();
        School<Oldman> oldmanSchool = new School<>();

        humanSchool.add(new Human());
        humanSchool.add(new Youth());
        humanSchool.add(new Oldman());

        childeSchool.add(new Childe());
//        childeSchool.add(new Oldman()); // 타입 불일치!
//        childeSchool.add(new Human()); // 보다 큰 개념인 조상은 담을 수 없는 것으로 보인다.

        youthSchool.add(new Youth());

        oldmanSchool.add(new Oldman());

        System.out.println(humanSchool.list);
        System.out.println(humanSchool);

        System.out.println(childeSchool);
        System.out.println(youthSchool);
        System.out.println(oldmanSchool);
    }
}
