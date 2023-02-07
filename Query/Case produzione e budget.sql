SELECT production_company.company_name, movie.title ,movie.budget
FROM production_company
JOIN movie_company ON production_company.company_id= movie_company.company_id
JOIN movie ON movie_company.movie_id = movie.movie_id
WHERE movie.budget > 300000

