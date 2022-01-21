import java.util.*;

public class TreinandoSet {
/*
* estudos iniciai da interface set
*
*/
    public static void main(String[] args) {
        //conceitos básicos
/*
        System.out.println("Crie um conjunto e adicione as notas");
        Set<Double> notas = new HashSet<Double>(Arrays.<Double>asList(7d,8d,6d,7d,6d,4d,10d,8d));
        System.out.println(notas);
        System.out.println("Exiba a posição da nota 5");
        System.out.println("Set n trabalha com indice loga n é possivel");
        System.out.println("verifique se a uma nota igual a 10");
        System.out.println(notas.contains(10d));
        System.out.println("exiba a menor nota: "+ Collections.min(notas));
        System.out.println("exiba a maior nota: "+ Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma=0d;
        while (iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println("Exiba a soma das notas: "+soma);
        System.out.println("Exiba a media das notas: "+(soma/notas.size()));
        System.out.println("remova a menor nota");
        notas.remove(Collections.min(notas));
        System.out.println(notas);
        iterator = notas.iterator();
        soma=0d;
        while (iterator.hasNext()){
            if(iterator.next()<7){
                iterator.remove();
            }
        }
        System.out.println(notas);
        System.out.println("imprima na ordem que foi informada");
        //o metodo HashSet nao armazena a ordem
        Set<Double> notas2 = new LinkedHashSet<>();
        //o metodo LinkedHashSet ss
        notas2.add(7d);
        notas2.add(6d);
        notas2.add(5d);
        notas2.add(8d);
        notas2.add(9d);
        notas2.add(10d);
        System.out.println(notas2);
        System.out.println("Exiba na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        System.out.println("Apague o conjunto");
        notas.clear();
        notas2.clear();
        System.out.println("Notas: "+notas.isEmpty()+" Notas2: "+notas2.isEmpty()+" Notas3: "+notas3.isEmpty());
*/
        //fim conceitos básicos

        //Dado as seguintes informações sobre series as ordene por nome gênero tempo de ep
        /*
        * Serie 1: Nome got, Gênero Fantasia, tEp 60
        * Serie 2: Nome dark, Gênero Drama, tEp 60
        * Serie 3: Nome that '70s Show, Gênero Comédia, tEp 25 */ //tEp.: tempo de episódio
     //   System.out.println("ordem aleatoria");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got","Fantasia",60));
            add(new Serie("dark","Drama",60));
            add(new Serie("that '70s Show","Comédia",25));
        }};
        for(Serie serie:series) {
       //     System.out.println(serie.toString());
        }
        //System.out.println("ordem insercao");


        Set<Serie> series2  = new LinkedHashSet<>(){{
            add(new Serie("got","Fantasia",60));
            add(new Serie("dark","Drama",60));
            add(new Serie("that '70s Show","Comédia",25));
        }};
        for(Serie serie:series2) {
          //  System.out.println(serie.toString());
        }
        System.out.println("Ordem nome/genero/tempo de episodio");
        Set<Serie> series3= new TreeSet<>(series2);
        for(Serie serie:series3) {
             System.out.println(serie.toString());
        }
    }
}
class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tEp;
    Serie(String nome,String genero ,Integer tEp){
        this.genero =genero;
        this.nome =nome;
        this.tEp =tEp;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tEp=" + tEp ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie that = (Serie) o;
        return nome.equals(that.nome) && genero.equals(that.genero) && tEp.equals(that.tEp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tEp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer gettEp() {
        return tEp;
    }

    public void settEp(Integer tEp) {
        this.tEp = tEp;
    }

    @Override
    public int compareTo(Serie o) {
        int nome = this.getNome().compareToIgnoreCase(o.getNome());
        if(nome!=0)return nome;

        int genero = this.getGenero().compareToIgnoreCase(o.getGenero());
        if(genero!=0)return genero;
        else {
            int tempoEp =Integer.compare(this.gettEp(),o.gettEp());
            return tempoEp;

        }
    }
}