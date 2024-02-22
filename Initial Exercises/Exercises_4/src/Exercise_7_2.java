public class Exercise_7_2 {

    public static void main(String[] args) {

        int howLong = 5;
        String text = "";

        int oneHowMany = howLong + 1;
        for(int i = 1; i <= oneHowMany + 2; i++){
            text += " ";
        }
        text += "*";
        for(int i = 1; i < oneHowMany; i++){
            text += " ";
        }
        System.out.println(text);

        for(int i = 1; i < howLong - 1; i++) {
            int count = 1;
            int spaces = i < howLong ? howLong - i : 1;
            int howMany = i + Math.round(i / 2) + Math.round(i / 2);
            text = "";

            if (i <= howMany && (i - howMany) % 2 == 0) howMany += 1;
            if(i == 1) howMany += 2;
            if(i > 1) howMany += 4 * i / 2;
            if(spaces > 2) spaces++;

            if(i < howLong){
                for(int j = 1; j <= spaces + 1; j++){
                    text += " ";
                }
                for(int j = 1; j <= howMany; j++){
                    if(count == 1){
                        text += "*";
                        count = 0;
                    } else{
                        text += " ";
                        count = 1;
                    }
                    if(j == howMany && i % 2 > 0){
                        text += "*";
                    }
                }
            }

            System.out.println(text);

        }

        for(int i = howLong; i >= 1 - 1; i--) {
            int count = 1;
            int spaces = i < howLong ? howLong - i : 1;
            int howMany = i + Math.round(i / 2) + Math.round(i / 2);
            text = "";

            if (i <= howMany && (i - howMany) % 2 == 0) howMany += 1;
            if(i == 1) howMany += 2;
            if(i > 1) howMany += 4 * i / 2;
            if(spaces > 2) spaces++;

            if(i < howLong){
                for(int j = 1; j <= spaces + 2; j++){
                    text += " ";
                }
                for(int j = 1; j <= howMany; j++){
                    if(count == 1){
                        text += "*";
                        count = 0;
                    } else{
                        text += " ";
                        count = 1;
                    }
                    if(j == howMany && i % 2 > 0){
                        text += "*";
                    }
                }
                if(i < 1) spaces++;
                for(int j = 1; j <= spaces; j++){
                    text += " ";
                }
            }

            System.out.println(text);

        }

    }

}
