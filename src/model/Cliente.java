
package model;

public class Cliente {

        public int id;
        public String nome, endereco;
        public Cidade cidade;


        public Cliente(){
            this.nome = "Sem nome";
            System.out.println("Nome do cliente: " + this.nome);
        }

        public Cliente(String nome){
            this.nome = "Sem nome";

        }
        
        public Cliente(int id, String nome,String end, Cidade cidade){
            this.id = id;
            this.nome = nome;
        }
}
