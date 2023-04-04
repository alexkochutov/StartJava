\echo 'Show all the records'
SELECT *
  FROM Jaegers;

\echo 'Show jaegers are not in Destroyed status'
SELECT *
  FROM Jaegers
 WHERE status <> 'Destroyed';

\echo 'Show all the jaegers of Mark-1 and Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo 'Show all the jaegers exclude Mark-1 and Mark-4'
SELECT *
  FROM Jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo 'Show all the jaegers in descending order of mark'
SELECT *
  FROM Jaegers
 ORDER BY mark DESC;

\echo 'Show the oldest jaeger'
SELECT *
  FROM Jaegers
 ORDER BY launch
 LIMIT 1;

\echo 'Show jaeger which killed most of all kaijus'
SELECT *
  FROM Jaegers
 WHERE kaijuKill =
       (SELECT MAX(kaijuKill) FROM Jaegers);

\echo 'Show average weight of jaegers'
SELECT AVG(weight)
  FROM Jaegers;

\echo 'Increase number of killed kaijus to every not destroyed jaegers'
UPDATE Jaegers
   SET kaijuKill = kaijuKill + 1
 WHERE status <> 'Destroyed';

SELECT *
  FROM Jaegers;

\echo 'Delete all the destroyed jaegers'
DELETE
  FROM Jaegers
 WHERE status = 'Destroyed';

SELECT *
  FROM Jaegers;