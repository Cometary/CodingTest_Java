-- 코드를 입력하세요
SELECT DATE_FORMAT(DATETIME, '%H') AS HOUR, COUNT(ANIMAL_ID) AS COUNT FROM ANIMAL_OUTS GROUP BY DATE_FORMAT(DATETIME, '%H') HAVING HOUR BETWEEN 9 AND 19 ORDER BY 1;