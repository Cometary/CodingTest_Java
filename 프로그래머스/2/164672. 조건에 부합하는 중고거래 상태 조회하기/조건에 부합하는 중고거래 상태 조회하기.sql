-- 코드를 입력하세요
SELECT BOARD_ID, WRITER_ID, TITLE, PRICE, REPLACE(REPLACE(REPLACE(STATUS, 'SALE', '판매중'), 'RESERVED', '예약중'), 'DONE', '거래완료') FROM USED_GOODS_BOARD WHERE CREATED_DATE='2022-10-05' ORDER BY 1 DESC;