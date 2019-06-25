class Person{
    void wake() {
        System.out.println("7시기상");
    }
}

class Anonymous {
    Person field = new Person() {
        void work() {
            System.out.println("출근");

        }

        @Override
        void wake() {
            System.out.println("6시 기상");
            work();
        }
    };

    void method1() {
        Person localVar = new Person(){
            void walk() {
                System.out.println("산책합니다");
            }

            @Override
            void wake() {
                System.out.println("7시기상");
                walk();
            }
        };
        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}

public class AnonymousExample {
    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous();
        anonymous.field.wake();
        anonymous.method1();
        anonymous.method2(
                new Person(){
                    void study() {
                        System.out.println("공부합니다");
                    }

                    @Override
                    void wake() {
                        System.out.println("8시기상");
                        study();
                    }
                }


        );
    }


}
