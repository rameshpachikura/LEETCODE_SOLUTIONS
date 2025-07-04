SELECT v1.customer_id, COUNT(*) AS count_no_trans
FROM Visits v1
LEFT JOIN Transactions t1
  ON v1.visit_id = t1.visit_id
WHERE t1.transaction_id IS NULL
GROUP BY v1.customer_id;
