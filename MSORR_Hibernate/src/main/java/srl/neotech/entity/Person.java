package srl.neotech.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "person_id", nullable = false)
    private Integer id;

    @Size(max = 500)
    @Column(name = "person_name", length = 500)
    private String personName;

    @OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
    private Set<MovieCrew> movieCrews = new LinkedHashSet<>();

    @OneToMany(mappedBy = "person",fetch = FetchType.LAZY)
    private Set<MovieCast> movieCasts = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Set<MovieCrew> getMovieCrews() {
        return movieCrews;
    }

    public void setMovieCrews(Set<MovieCrew> movieCrews) {
        this.movieCrews = movieCrews;
    }

    public Set<MovieCast> getMovieCasts() {
        return movieCasts;
    }

    public void setMovieCasts(Set<MovieCast> movieCasts) {
        this.movieCasts = movieCasts;
    }
    
    

}