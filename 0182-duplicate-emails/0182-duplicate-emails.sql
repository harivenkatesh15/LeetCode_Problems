with cte as(
    select email , ROW_NUMBER() OVER(PARTITION BY email order by id) as rn from Person 
)
select email from cte where rn = 2