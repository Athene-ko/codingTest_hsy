-- problem 1387
select employee_id,
    case
    when (employee_id%2 = 1) and (name not like 'M%')
    then salary else 0
    end as bonus
from Employees
order by employee_id;

-- 627. Swap salaray
update Salary set sex = case
    when sex = 'm' then 'f' else 'm'
end;

-- 196. delete Duplicates Emails
delete p1 From Person p1, Person p2
where p1.email = p2.email and p1.id > p2.id;