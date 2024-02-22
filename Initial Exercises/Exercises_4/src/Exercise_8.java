public class Exercise_8 {

    public static void main(String[] args) {

        int howLong = 6;
        String text = "";

        int oneHowMany = howLong + 1;
        for(int i = 1; i < oneHowMany; i++){
            text += " ";
        }
        text += "1";
        for(int i = 1; i < oneHowMany; i++){
            text += " ";
        }
        System.out.println(text);

        for(int i = 1; i <= howLong - 1; i++) {
            int count = 1;
            int spaces = i < howLong ? howLong - i : 1;
            int howMany = i + Math.round(i / 2) + Math.round(i / 2);
            text = "";
            //------------------------------
            int linePos = 1;

            if (i <= howMany && (i - howMany) % 2 == 0) howMany += 1;

            if(i < howLong){
                for(int j = 1; j <= spaces; j++){
                    text += " ";
                }
                for(int j = 1; j <= howMany; j++){
                    // Initial
                    // ...
                    // New
                    if(count == 1){
                        if(j == 1 || j == howMany){
                            text += 1;
                            linePos++;
                        }else{
                            // int half = Math.round((howLong - i) / 2) +  i / 2 + 1;
                            // int half = (int) (Math.floor((howLong - i) / 2) + Math.round(i / 2) + 1);
                            int half = (int) Math.round((howMany / 2) / 2 + 1); // Parece que este es el correcto a partir de la linea 3, la linea 3 está mal
                            System.out.println(half);
                            if(linePos <= half){
                                // first
                                /*int summing = i * (Math.round(linePos / 2)); // Le falta agregar una suma pero sólo si... ¿algo? ¿El qué? ni idea
                                text += summing;
                                linePos++;
                                text += summing;*/

                                // new
                                int summing = i * (Math.round(linePos / 2));
                                if(linePos > 2){
                                    //summing += i * (Math.round(linePos / 2)) + linePos + (linePos / 2);
                                    summing += i * (Math.round(linePos / 2)) + linePos + 1;
                                }
                                linePos++;
                                text += summing;
                            }else{
                                text += 1;
                            }
                        }
                        count = 0;
                    } else{
                        text += " ";
                        count = 1;
                    }
                    if(j == howMany && i % 2 > 0){
                        text += 1;
                    }
                }
                for(int j = 1; j <= spaces; j++){
                    text += " ";
                }
            }

            System.out.println(text);

        }

    }

}
