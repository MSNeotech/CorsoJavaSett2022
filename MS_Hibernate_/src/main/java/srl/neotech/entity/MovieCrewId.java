package srl.neotech.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieCrewId implements Serializable {
    private static final long serialVersionUID = 521107700977574230L;
    @NotNull
    @Column(name = "person_id", nullable = false)
    private Integer personId;

    @NotNull
    @Column(name = "movie_id", nullable = false)
    private Integer movieId;

    @NotNull
    @Column(name = "department_id", nullable = false)
    private Integer departmentId;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MovieCrewId entity = (MovieCrewId) o;
        return Objects.equals(this.departmentId, entity.departmentId) &&
                Objects.equals(this.personId, entity.personId) &&
                Objects.equals(this.movieId, entity.movieId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentId, personId, movieId);
    }

}