pache aplplication.model;

import java.lang.annotation.Inherited;
import java.util.Hashset 
import java.util.set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "Categorias")
public class categoria  {
    @Id
    @GeneratedValue(strategy = GenerationType.Identity)
    private long id;
    @column(unique -true, nullable = false)
    private string nome;

    @OneToMany(mappedby = "categoria")
    private set<jogo> jogos = new Hashset<>();

    public long getid() {
        return id;
    }    

    public void setid(long id) {
        this.id = id;
    }

    public string getNome() {
        return nome;
    }
    
    public void setnome(string nome) {
        this.nomr = nome;
    }

    public set<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(set<Jogo> jogos) {
        this.jogos = jogos;
    }
    }