package srl.neotech.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie_company")
public class MovieCompany {
    @EmbeddedId
    private MovieCompanyId id;

    @MapsId("movieId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;

    @MapsId("companyId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private ProductionCompany company;

    public MovieCompanyId getId() {
        return id;
    }

    public void setId(MovieCompanyId id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ProductionCompany getCompany() {
        return company;
    }

    public void setCompany(ProductionCompany company) {
        this.company = company;
    }

}