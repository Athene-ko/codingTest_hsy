-- 197. Rising Temperature
select w1.id
from Weather w1
left join Weather w2
on w2.recordDate = dateadd(day, -1, w1.recordDate)
where w1.temperature > w2.temperature


-- 607. Sales Person(푸는 중)
select s.name from SalesPerson s
where s.sales_id not in (select o.sales_id from Company c
join Orders o
on c.com_id = o.com_id
where c.name = 'RED')
