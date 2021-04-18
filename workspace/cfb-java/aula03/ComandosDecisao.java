public class ComandosDecisao {

     public static void main(String[] args) {

        // == > < >= <= != ! - true / false
        int nota = 80;
        int media = 60;
        int maxFaltas = 5;
        int faltas = 10;

        if(nota >= media && (faltas <= maxFaltas)){

            System.out.printf("\n Aprovado %d \n", nota);

        }else if( nota >= 40){

            System.out.printf("\n Recuperação %d \n", nota);

        }else{

            System.out.printf("\n Reprovado %d \n", nota);

        }
        System.out.printf("\n ###### Fim do programa ####### \n");
        
    }
    
}
