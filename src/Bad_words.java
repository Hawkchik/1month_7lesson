public class Bad_words {
     String[] ploxo = {"Блядь", "fuck", "пиздец", "атата", " "};

    public boolean  check_bad_words(String c) {
        for (int i = 0; i < 5; i++) {

            if (ploxo[i].toUpperCase().equals(c.toUpperCase())) {

                return true;
            }

        }


     return false;
}


}
