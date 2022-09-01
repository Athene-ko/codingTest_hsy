-- 1965. Employees With Missing Information

-- 1965. Employees with missign information
select (case when e.employee_id is null then s.employee_id else e.employee_id end) as employee_id
from Employees e
FULL OUTER JOIN salaries s
on e.employee_id = s.employee_id
where e.name is null or s.salary is null
order by employee_id

-- 1795. Rearrange Products Table
select product_id, 'store1' as store , store1 as price from products where store1 is not null
union
select product_id, 'store2' as store , store2 as price from products where store2 is not null
union
select product_id, 'store3' as store , store3 as price from products where store3 is not null
order by product_id, store, price

-- 608. Tree Node 푸는 중

select t.id
  , case t.p_id
      when null then 'Root'
      when contains((select id from Tree), p_id) then 'Inner'
      -- else 'Leaf'
      end as type
  from Tree t;