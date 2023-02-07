SELECT movie.*
FROM movie
JOIN movie_cast ON movie.movie_id = movie_cast.movie_id
JOIN person ON person.person_id = movie_cast.person_id
JOIN movie_genres ON movie.movie_id = movie_genres.movie_id
JOIN genre ON genre.genre_id = movie_genres.genre_id
WHERE person.person_name = 'Brad Pitt' AND genre.genre_name = 'Action';