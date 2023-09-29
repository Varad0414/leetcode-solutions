select activity_date as day, count(distinct user_id) as active_users from Activity 
where datediff('2019-07-27', activity_date) < 30 and activity_date <= '2019-07-27'
group by 1;

# activity_type = 'scroll_down' or activity_type = 'send_message' and 