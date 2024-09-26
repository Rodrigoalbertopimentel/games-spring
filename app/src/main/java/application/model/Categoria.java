package aplplication.model;

import java.lang.annotation.Inherited;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Categorias")
public class Categoria  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @column(unique =true, nullable = false)
    private String nome;

    @OneToMany(mappedby = ("categoria"))
    private Set<Jogo> jogos = new HashSet<>();

    public long getid() {
        return id;
    }    

    public void setid(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    
    public void setnome(String nome) {
        this.nome = nome;
    }

    public set<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(set<Jogo> jogos) {
        this.jogos = jogos;
    }
    }