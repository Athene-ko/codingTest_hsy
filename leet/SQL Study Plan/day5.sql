-- 175. Combine Two Tables
select p.firstName, p.lastName, a.city, a.state
from Person p
left join Address a
on p.personId = a.personId


-- 1581.Customer Who visited but Did not make Any Transactions
select v.customer_id, count(v.customer_id) as count_no_trans
from visits v left join transactions t on v.visit_id = t.visit_id
where t.transaction_id is null
group by v.customer_id


-- 1148. Articel View I
select distinct v1.author_id id
from Views v1 left join Views v2 on v1.author_id = v2.author_id
where v1.author_id = v2.viewer_id
