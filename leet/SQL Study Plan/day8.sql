-- Function!!

-- 586. Customer Placing the Largest
select top 1 customer_number
from Orders
group by customer_number
order by count(customer_number) desc;

-- 511. Game play analysis O
select player_id, min(event_date) as first_login
from Activity
group by player_id;

-- 1890. The Latest Login in 2020
select user_id, max(time_stamp) as last_stamp
from Logins
where time_stamp between '2020-01-01' and '2020-12-31 23:59:59.993'
group by user_id

-- 1741. Find Total Time Spent by Eac...
select event_day as day, emp_id, sum(out_time - in_time) as total_time
from Employees
group by event_day, emp_id;