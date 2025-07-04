# Write your MySQL query statement below
Select v.customer_id, COUNT(v.visit_id) as count_no_trans
from Visits v
Where v.visit_id not in (
    Select t.visit_id from transactions t
)
group by customer_id