public class Check_answers {
    Answers answers = new Answers();
    int romantic;
    int scary = 0;
    int comedy = 0;
    int action = 0;
    int fantastic = 0;

    public int Romantic1(String c) {
        if (c.toUpperCase().equals(answers.first.toUpperCase())){
           romantic++;
        }
        return romantic;

    }

    public int Romantic2(String c) {
        if (c.toUpperCase().equals(answers.five.toUpperCase())){
            romantic+=2;
        }
        return romantic;

    }



    public int romantic3(String c) {
        if (c.toUpperCase().equals(answers.twelve.toUpperCase())){
            romantic++;
        }
        return romantic;

    }



    public int Scary1(String c) {
        if (c.toUpperCase().equals(answers.second.toUpperCase())){
            scary++;
        }
        return scary;

    }


    public int Scary2(String c) {
        if (c.toUpperCase().equals(answers.six.toUpperCase())){
            scary+=2;
        }
        return scary;

    }

    public int Scary3(String c) {
        if (c.toUpperCase().equals(answers.ten.toUpperCase())){
            scary+=3;
        }
        return scary;

    }



    public int Comedy1(String c) {
        if (c.toUpperCase().equals(answers.third.toUpperCase())){
            comedy++;
        }
        return comedy;

    }

    public int Comedy2(String c) {
        if (c.toUpperCase().equals(answers.four.toUpperCase())){
            comedy+=2;
        }
        return comedy;

    }

    public int Comedy3(String c) {
        if (c.toUpperCase().equals(answers.nine.toUpperCase())){
            comedy+=3;
        }
        return comedy;

    }

    public int Fantastic1(String c) {
        if (c.toUpperCase().equals(answers.eight.toUpperCase())){
            fantastic++;
        }
        return fantastic;

    }

    public int fantastic2(String c) {
        if (c.toUpperCase().equals(answers.eleven.toUpperCase())){
            fantastic+=2;
        }
        return fantastic;

    }

    public int Fanstastic3(String c) {
        if (c.toUpperCase().equals(answers.fourteen.toUpperCase())){
            fantastic+=3;
        }
        return fantastic;

    }

    public int Action1(String c) {
        if (c.toUpperCase().equals(answers.seven.toUpperCase())){
            action++;
        }
        return action;

    }

    public int Action2(String c) {
        if (c.toUpperCase().equals(answers.thirteen.toUpperCase())){
            action+=2;
        }
        return action;

    }

    public int Action3(String c) {
        if (c.toUpperCase().equals(answers.fifteen.toUpperCase())){
            action+=3;
        }
        return action;

    }
}
