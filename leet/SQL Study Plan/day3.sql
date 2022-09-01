-- 1667. Fix Names in a Table
select user_id, upper(left(name,1)) + lower(substring(name, 2, len(name))) as name from Users
order by user_id;


--1484. Group sold products by the date
-- 1. Remove duplicates from the table using CTE
-- 2. Group by sell_date, count each sell date
-- 3. Use string_agg function and order within group by product.
with cteactivity AS 
    (SELECT DISTINCT *
    FROM activities)
SELECT sell_date,
		 count(product) AS num_sold,
		 string_agg(product, ',') within group (order by product) AS products
FROM cteactivity
GROUP BY  sell_date
ORDER BY  sell_date

-- 1527. Patients with a condition
select * from patients
where conditions like 'diab1%' or conditions like '% diab1%'