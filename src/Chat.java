import java.util.Scanner;

public class Chat {
    public static void main(String[] args) {
        System.out.println("Привет, я чат бот, как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        System.out.println("Привет " + a + "!" + "Пройдем тест на знание киноиндустрии?");
        String b = scanner.nextLine();
        if (b.toUpperCase().equals("НЕТ")) {
            System.out.println("Пока!!!");
        }
        int romantic = 0;
        int scary = 0;
        int comedy = 0;
        int action = 0;
        int fantastic = 0;

        Questions questions = new Questions();
        Answers answers = new Answers();
        System.out.println(questions.romantic1); //1 вопрос
        String c = scanner.nextLine();
        Check_answers one = new Check_answers();
        romantic=one.Romantic1(c);



        System.out.println(questions.scary1); //2 вопрос
        String d = scanner.nextLine();
        if (d.toUpperCase().equals(answers.second.toUpperCase())) {
            scary++;
        }

        System.out.println(questions.comedy1);//3 вопрос
        String e = scanner.nextLine();
        if (e.toUpperCase().equals(answers.third.toUpperCase())) {
            comedy++;
        }

        System.out.println(questions.comedy2);//4 вопрос
        String f = scanner.nextLine();
        if (f.toUpperCase().equals(answers.four.toUpperCase())) {
            comedy = comedy + 2;
        }

        System.out.println(questions.romantic2);//5 вопрос
        String g = scanner.nextLine();
        if (g.toUpperCase().equals(answers.five.toUpperCase())) {
            romantic = romantic + 2;
        }

        System.out.println(questions.scary2);//6 вопрос
        String h = scanner.nextLine();
        if (h.toUpperCase().equals(answers.six.toUpperCase())) {
            scary = scary + 2;
        }

        System.out.println(questions.action1);//7 вопрос
        String i = scanner.nextLine();
        if (i.toUpperCase().equals(answers.seven.toUpperCase())) {
            action++;
        }

        System.out.println(questions.fantastic1);//8 вопрос
        String j = scanner.nextLine();
        if (j.toUpperCase().equals(answers.eight.toUpperCase())) {
            fantastic++;
        }

        System.out.println(questions.comedy3);//9 вопрос
        String k = scanner.nextLine();
        if (k.toUpperCase().equals(answers.nine.toUpperCase())) {
            comedy = comedy + 3;
        }

        System.out.println(questions.scary3);//10 вопрос
        String l = scanner.nextLine();
        if (l.toUpperCase().equals(answers.ten.toUpperCase())) {
            scary = scary + 3;
            System.out.println(questions.fantastic2);//11 вопрос
            String m = scanner.nextLine();
            if (m.toUpperCase().equals(answers.eleven.toUpperCase())) {
                fantastic = fantastic + 2;
            }
            System.out.println(questions.romantic3);//12 вопрос
            String n = scanner.nextLine();
            if (n.toUpperCase().equals(answers.twelve.toUpperCase())) {
                romantic = romantic + 3;
            }
            System.out.println(questions.action2);//13 вопрос
            String o = scanner.nextLine();
            if (o.toUpperCase().equals(answers.thirteen.toUpperCase())) {
                action = action + 2;
            }
            System.out.println(questions.fantastic3);//14 вопрос
            String p = scanner.nextLine();
            if (p.toUpperCase().equals(answers.fourteen.toUpperCase())) {
                fantastic = fantastic + 3;
            }
            System.out.println(questions.action3);//15 вопрос
            String q = scanner.nextLine();
            if (q.toUpperCase().equals(answers.fifteen.toUpperCase())) {
                action = action + 3;
            }

            int result = action + fantastic + romantic + scary + comedy;
            System.out.println(result);

            if (result <= 10) {

                System.out.println("Пора посмотреть все фильмы, плохо совсем плохо");
            } else if (result <= 28) {
                System.out.println("Ты киноман, но не слишком уверенный, пора спать. ))");
            } else if (result <= 30) {
                System.out.println("Ты мега гуру в кино будь счастлив!!! Пора заняться программированием");
            } else {
                System.out.println("Что то пошло не так при подсчёте программы");

            }
        }


    }
}
