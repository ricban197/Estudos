import java.util.*;

public class ListsTreino {
    public static void main(String[] args) {
        /*
        System.out.println("Criando list");
        List<Double> notas = new ArrayList<>();//Criando Lista
        System.out.println(notas);//printando estagio inicial
        notas.add(5.0);
        notas.add(7.0);
        notas.add(6.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(4.5);
        notas.add(8.5);
        notas.add(5.0);//caso use o index na função add ela ira "empurrar" os demais elementos para a posição seguinte
        System.out.println("notas do aluno X: "+notas);//printando estagio inicial
        System.out.println("notas igual a 5 na posição: "+notas.indexOf(5d));
        //Caso haja mais de um do elemento pesquisado a função ira retorna aquela com o menor index
        System.out.println("substitua a primeira nota 5 por 1.6");
        notas.set(notas.indexOf(5d),1.6);
        System.out.println("notas igual a 5 na posição: "+notas.indexOf(5d));
        System.out.println("notas do aluno X: "+notas);//printando estagio final
        System.out.println("informe a 4 nota informada: "+notas.get(4).toString());
        System.out.println("informe a menor nota: "+ Collections.min(notas));
        System.out.println("informe a maior nota: "+ Collections.max(notas));
        System.out.println("informe a soma dos valores: ");
        Iterator<Double> it  =notas.iterator();
        Double soma=0d;
        while(it.hasNext()){
            Double next =it.next();
            soma +=next;
        }
        System.out.println("a soma: "+soma);
        System.out.println("a media é igual:"+(soma/notas.size()));
        System.out.println("remova a menor nota:");
        soma = Collections.min(notas);
        notas.remove(notas.indexOf(soma));
        System.out.println("removendo: "+soma);
        it = notas.iterator();
        System.out.println("remova todas as notas menores que 7");
        System.out.println(notas);
        while (it.hasNext()){
            soma = it.next();
            if(soma<7){
                it.remove();
            }
        }
        System.out.println("!!após remoção!!");
        System.out.println(notas);
        */
        //Organizando listas
        /*
        * Dado os seguintes dados organize as informações sobre os gatos, crie uma lista
        *e ordene exibindo
        * (nome - idade - cor)
        * Gato 1:   nome : jom      idade: 18       cor: preto
        * Gato 2:   nome : simba    idade:  6       cor: tigrado
        * Gato 3:   nome : jon      idade: 12       cor: amarelo
        * */
        List<Gato> gatos=new ArrayList<>(){{
            add(new Gato("jon",18,"preto"));
            add(new Gato("jon",18,"Azul"));
            add(new Gato("simba",6,"tigrado"));
            add(new Gato("simba",6,"tigrado"));
            add(new Gato("simba",7,"tigrado"));
            add(new Gato("simba",6,"pigrado"));
            add(new Gato("jon",12,"amarelo"));
        }};
        System.out.println("ordem de entrada");
        System.out.println(gatos);//ordem de inserção
        System.out.println("ordem aleatoria");
        Collections.shuffle(gatos);//ordem aleatoria
        System.out.println(gatos);
        Collections.sort(gatos);//essa função exige a função compareTo()
        System.out.println("ordem afabetica");
        System.out.println(gatos);//ordem de nome
        Collections.sort(gatos,new ComparaGatoIdade());
        System.out.println("ordem de idade");
        System.out.println(gatos);
        System.out.println("ordem de cor");
        gatos.sort(new ComparaGatoCor());
        System.out.println(gatos);
        System.out.println("comparando por nome cor e idade");
        gatos.sort(new ComparaGatoNomeCorIdade());
        System.out.println(gatos);

    }
}
class ComparaGatoNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome!=0)return nome;
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor!=0){return cor;}else{return Integer.compare(g1.getIdade(), g2.getIdade());}
    }
}
class ComparaGatoCor implements  Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
class ComparaGatoIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(),g2.getIdade());
        //
    }
}
class Gato implements  Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    @Override
    public String toString() {
        return "Gato: " +
                nome + " "+
                 idade +" "+
                cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public int compareTo(Gato o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
        //comparando string, return 0 == nomes iguais/ 1 o nome comparado vem depois(alfabetica)/-1 o nome comparado vem antes
        //Verificar depois++
    }
}
