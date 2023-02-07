select  person.person_id, person.person_name, count(movie_cast.movie_id) as numero_film
FROM person
JOIN movie_cast ON person.person_id = movie_cast.person_id
GROUP BY person.person_id, person.person_name;