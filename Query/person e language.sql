SELECT person.person_id, person.person_name,movie.title ,language.language_name
FROM person
join movie_crew on person.person_id = movie_crew.person_id
join movie on movie_crew.movie_id = movie.movie_id
join movie_languages on movie.movie_id = movie_languages.movie_id
join language on movie_languages.language_id = language.language_id
where language.language_name = "Italiano"
