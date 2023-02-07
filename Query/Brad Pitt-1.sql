select movie.title, person_name
from person
JOIN movie_crew On movie_crew.person_id = person.person_id
join movie on movie.movie_id = movie_crew.movie_id
where person.person_name = "Brad Pitt";



