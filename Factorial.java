package academy.devonline.java.basic.section01_setup.section05_setup;

public class Factorial {
    public static void main(String[] args) {
       /* var value = 5;


        String FinalResult;
        if (value < 0){
            FinalResult = "Больше или равно >=0";

        }else {
            var resut = 1;
            for (var i = 1; i<=value;i++){
                var oldResult = resut;
                resut*=i;
                if (oldResult!=resut/i){
                    resut = 0;
                    break;
                }

            }
            FinalResult = resut == 0?"Int overflow":String.valueOf(resut);

        }

        System.out.println(FinalResult);
*/          var value = 5;

        String FinalResult;
        if (value < 0){
            FinalResult = "Больше или равно >=0";

        }else {
            var resut = 1;
            for (var i = 1;i<=value;i++){
                var oldResult= resut;
                resut*=i;
                if (oldResult!=resut/i){
                    resut = 0;
                    break;
                }
            }
            FinalResult = resut == 0?"Int overflow":String.valueOf(resut);
        }
        System.out.println(FinalResult);

    }}
