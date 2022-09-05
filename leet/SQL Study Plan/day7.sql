-- 1141. User Activity for the Past
select activity_date as day, count(distinct user_id) as active_users from Activity a
where a.activity_date between dateadd(day, -29, '2019-07-27') and '2019-07-27'
group by activity_date


-- 1693. Daily Leads adn Partners
select date_id, make_name, count(distinct lead_id) as unique_leads, count(distinct partner_id) as unique_partners
from dailysales
group by date_id, make_name


-- 1729. find Followers Count
select user_id, count(distinct follower_id) as followers_count
from Followers
group by user_id

