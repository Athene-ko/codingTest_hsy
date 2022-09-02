-- 197. Rising Temperature
select w1.id
from Weather w1
left join Weather w2
on w2.recordDate = dateadd(day, -1, w1.recordDate)
where w1.temperature > w2.temperature


-- 607. Sales Person(푸는 중)
-- select o.sales_id
-- from Orders o
-- join company c
-- on o.com_id = c.com_id
-- where c.com_id != 1

-- select s.name
-- from SalesPerson s
-- where s.sales_id in (select o.sales_id
-- from Orders o
-- join company c
-- on o.com_id = c.com_id
-- where c.com_id != 1)
