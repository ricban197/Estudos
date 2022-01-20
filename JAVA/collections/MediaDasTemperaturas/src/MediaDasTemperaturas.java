import java.util.ArrayList;
import java.util.List;

public class MediaDasTemperaturas {
    public static void main(String[] args) {
        List<String> meses =new ArrayList<>(){{
            add("Janeiro");
            add("Fevereiro");
            add("Março");
            add("Abriu");
            add("Maio");
            add("Junho");
        }};
        List<Double>temperaturas=new ArrayList<>(){{
            add(30.5);
            add(31d);
            add(30d);
            add(28d);
            add(26d);
            add(25d);
        }};
        Double media=0d;
        for(Double temp:temperaturas){
            media+=temp;
        }
        media=media/temperaturas.size();
        System.out.println("a media de temperatura do primeiro semestre é: " +media);
        System.out.println( "os meses que estavam acima desta media foram: ");
        int i=0;
        for(Double temp:temperaturas){
            if(temp>media){
                System.out.println(meses.get(i)+": "+temperaturas.get(i));
            }
            i++;
        }



    }
}


