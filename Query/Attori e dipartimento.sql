select DISTINCT person.person_name, department.department_name
from movie
join movie_cast on movie.movie_id = movie_cast.movie_id
join person on movie_cast.person_id = person.person_id
join movie_crew on person.person_id = movie_crew.person_id
join department on movie_crew.department_id = department.department_id
WHERE (department.department_name = "Production") or (department.department_name="Directing");





