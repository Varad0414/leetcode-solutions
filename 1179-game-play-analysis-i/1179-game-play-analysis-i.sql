# Write your MySQL query statement below
Select a1.player_id, min(a1.event_date) as first_login 
from Activity a1
group by a1.player_id; 