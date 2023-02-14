package srl.neotech.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "keyword")
public class Keyword {
    @Id
    @Column(name = "keyword_id", nullable = false)
    private Integer id;

    @Size(max = 100)
    @Column(name = "keyword_name", length = 100)
    private String keywordName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "movie_keywords",
            joinColumns = @JoinColumn(name = "keyword_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private Set<Movie> movies = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKeywordName() {
        return keywordName;
    }

    public void setKeywordName(String keywordName) {
        this.keywordName = keywordName;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }

}