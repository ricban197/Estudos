import java.util.*;

public class EstudosMap {

    /*
    * modelo : gol - consumo: 14,4km/l
    * modelo : uno - consumo: 15,6km/l
    * modelo : mobi - consumo: 16,1km/l
    * modelo : hb20 - consumo: 14,5km/l
    * modelo : kwid - consumo: 15,6km/l*/
    public static void main(String[] args) {
     //funções basicas
       /*
        System.out.println("Crie um dicionario que relacionados os modelos e seus respectivos consumos");
        Map<String,Double> modelos = new HashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(modelos.toString());
        System.out.println("substitua o consumo do gol por 15,2Km/l");
        modelos.put("gol",15.2);
        System.out.println(modelos.toString());
        System.out.println("confira se o modelo tucson esta adicionado: "+ modelos.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: "+ modelos.get("uno"));
        System.out.println("Exiba os modelos: ");
        Set<String> modelo = modelos.keySet();
        System.out.println(modelo);

        System.out.println("Exiba os consumos: ");
        Collection<Double> values = modelos.values();
        System.out.println(values);

        System.out.println("Exiba o consumo mais Econômico em consumo");
        Double consumoEconomico = Collections.max(modelos.values());
        System.out.println(consumoEconomico);

        Set<Map.Entry<String, Double>> entries = modelos.entrySet();
        String modeloMaisEconomico="";
        for (  Map.Entry<String, Double>entry :entries){
            if(entry.getValue()==consumoEconomico){
                modeloMaisEconomico=entry.getKey();
            }
        }
        System.out.println(modeloMaisEconomico);
        System.out.println("Exiba o consumo menos Econômico: "+ Collections.min(modelos.values()));
        Double consumoMenosEficiente = Collections.min(modelos.values());
        String modeloMenosEconomico="";
        for (Map.Entry<String, Double>entry :modelos.entrySet()){
         if(entry.getValue()==consumoMenosEficiente)   {
             modeloMenosEconomico=entry.getKey();
             System.out.println("Modelo menos Eficiente: "+modeloMenosEconomico+" Consumo menos eficiente: " +consumoMenosEficiente);
         }
        }
        System.out.println("Exiba a soma dos consumos");
        Iterator<Double> iterator = modelos.values().iterator();
        Double soma=0d;
        while (iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println("A soma dos consumos: "+soma);
        System.out.println("A media dos consumos: " + (soma/modelo.size()));
        System.out.println("removendo modelo com consumo igual 15,6...");
        iterator = modelos.values().iterator();
        while (iterator.hasNext()){
            if(iterator.next()==15.6)iterator.remove();
        }
        System.out.println(modelos);
        Map<String,Double>modelos2 =new LinkedHashMap<>(){{
            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);
        }};
        System.out.println(modelos2);
        Map<String,Double>modelos3 = new TreeMap<>(modelos2);
        System.out.println(modelos3);
        //apagando dicionarios
        modelos.clear();
        modelos2.clear();
        modelos3.clear();
        */
    //Fim funções basicas
        //Ordenando Map
        /*
        *Autor = Hawking, Stephen - Livro = Uma breve historia do tempo - Paginas 256
        *Autor = Duhigg, Charles - livro = O Poder do Habito - Paginas 408
        *Autor = Harari, Yuval Nooh - livro = 21 lições para o seculo 21 - Paginas 432
        Exibindo (Nome autor, Nome Livro)
        * */
        System.out.println("ordem aleatoria");
        Map<String,Livro> livros =new HashMap<>(){
            {
                put("Harari, Yuval Nooh",(new Livro("21 lições para o seculo 21",432)));
                put("Hawking, Stephen",(new Livro("Uma breve historia do tempo",256)));
                put("Duhigg, Charles ",(new Livro("O Poder do Habito",408)));

            }
        };
        for(Map.Entry<String,Livro> livroEntrey: livros.entrySet()){
            System.out.println(livroEntrey.getKey()+"--"+livroEntrey.getValue().getNome());
        }

        System.out.println("ordem insercao");
        Map<String,Livro> livroslinked =new LinkedHashMap<>(){
            {
                put("Harari, Yuval Nooh",(new Livro("21 lições para o seculo 21",432)));
                put("Hawking, Stephen",(new Livro("Uma breve historia do tempo",256)));
                put("Duhigg, Charles ",(new Livro("O Poder do Habito",408)));

            }
        };
        for(Map.Entry<String,Livro> livroEntrey: livroslinked.entrySet()){
            System.out.println(livroEntrey.getKey()+"--"+livroEntrey.getValue().getNome());
        }

        System.out.println("ordem alfabetica");
        Map<String,Livro> livrostree =new TreeMap<>(){
            {
                put("Harari, Yuval Nooh",(new Livro("21 lições para o seculo 21",432)));
                put("Hawking, Stephen",(new Livro("Uma breve historia do tempo",256)));
                put("Duhigg, Charles ",(new Livro("O Poder do Habito",408)));

            }
        };
        for(Map.Entry<String,Livro> livroEntrey: livrostree.entrySet()){
            System.out.println(livroEntrey.getKey()+"--"+livroEntrey.getValue().getNome());
        }



    }
}
class Livro{
    private String nome;
    private Integer paginas;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
}
