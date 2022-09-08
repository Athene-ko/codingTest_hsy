-- Control of Flow

-- 1393.
select stock_name,
    sum(iif(operation='Buy', -price, price)) as capital_gain_loss
from Stocks
group by stock_name


-- 1407.Top Travellers
select u.name as 'name', isnull(sum(r.distance),0) as 'travelled_distance'
from Users u
left join Rides r
on u.id = r.user_id
group by u.id, u.name
order by travelled_distance desc, name asc

-- WITh cte AS (
-- SELECT user_id, SUM(distance) AS travelled_distance
-- FROM Rides
-- GROUP BY user_id
-- )

-- SELECT u.name, IFNULL(c.travelled_distance,0) AS travelled_distance
-- FROM Users AS u
-- LEFT JOIN cte AS c
-- ON u.id = c.user_id
-- ORDER BY travelled_distance DESC, name


-- 1158. Market Analysis I
select u.user_id as 'buyer_id', u.join_date as 'join_date', isnull(count(order_id),0) as 'orders_in_2019'
from Users u
left join Orders o
on u.user_id = o.buyer_id and year(order_date) = 2019
group by u.user_id, u.join_date