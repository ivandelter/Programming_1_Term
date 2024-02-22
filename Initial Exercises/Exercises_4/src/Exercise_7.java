public class Exercise_7 {

    public static void main(String[] args) {

        int howLong = 9;
        String text = "";

        int oneHowMany = howLong + 1;
        for(int i = 1; i < oneHowMany; i++){
            text += " ";
        }
        text += "*";
        for(int i = 1; i < oneHowMany; i++){
            text += " ";
        }
        System.out.println(text);

        for(int i = 1; i <= howLong - 1; i++) {
            int count = 1;
            int spaces = i < howLong ? howLong - i : 1;
            int howMany = i + Math.round(i / 2) + Math.round(i / 2);
            text = "";

            if (i <= howMany && (i - howMany) % 2 == 0) howMany += 1;

            if(i < howLong){
                for(int j = 1; j <= spaces; j++){
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
                for(int j = 1; j <= spaces; j++){
                    text += " ";
                }
            }else{
                for(int j = 1; j <= howLong * 2 + 2; j++){
                    if(count == 1){
                        text += "*";
                        count = 0;
                    }else{
                        text += " ";
                        count = 1;
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

            if(i < howLong){
                for(int j = 1; j <= spaces; j++){
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
                for(int j = 1; j <= spaces; j++){
                    text += " ";
                }
            }else{
                for(int j = 1; j <= howLong * 2 + 2; j++){
                    if(count == 1){
                        text += "*";
                        count = 0;
                    }else{
                        text += " ";
                        count = 1;
                    }
                }
            }

            System.out.println(text);

        }

    }

}
