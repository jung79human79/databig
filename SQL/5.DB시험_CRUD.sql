INSERT INTO t_cus (customer_num,customer_name,address)
VALUES    
(001, '가길동', '수원시'),
(002, '나길동', '안산시'),
(003, '조길동', '서울시'),
(004, '홍길동', '안양시');
select * from t_cus;

INSERT INTO  t_order (order_num,product_name,quantity,price,customer_num)
VALUES    
(001, '사과', 2, 300, 001),
(002, '우유', 3, 200, 001),
(003, '시금치', 4, 100, 002),
(004, '콜라', 7, 200, 002),
(005, '두부', 5, 300, 003),
(006, '햄버거', 2, 200, 003),
(007, '빵', 3, 100, 003),
(008, '감자', 1, 200, 003),
(009, '오이', 5, 100, 004);
select * from t_order;


-- 고객번호 003번이 주문한 주문 내용을 아래 처럼 출력하는 SQL문장을 기술하시요.(join쿼리)
SELECT tc.customer_name,tc.address,tr.product_name, tr.quantity, tr.price
FROM t_cus tc
INNER JOIN t_order tr
ON tc.customer_num = tr.customer_num
where tc.customer_num=003;

-- 고객 번호 002번이 주문한 주문의 총 금액은 얼마인가?
SELECT sum(price) TOTAL
FROM t_cus  tc
INNER JOIN t_order tr
ON  tc.customer_num = tr.customer_num
WHERE tc.customer_num = 002;
-- 간단방법
SELECT sum(price) TOTAL
from t_order tr
WHERE tr.customer_num = 002;


update t_order set price=200 where order_num=9;

-- 주문테이블을 보고 고객번호별 주문 금액의 총합을 구하여 출력하시요.(group by절 사용)
SELECT tc.customer_num, sum(tr.price) 금액
FROM t_cus  tc
INNER JOIN t_order  tr
ON tc.customer_num = tr.customer_num
GROUP BY tc.customer_num; 
-- 간단방법
SELECT tr.customer_num, sum(tr.price) 금액 
FROM t_order tr
GROUP BY tr.customer_num;

-- 고객테이블에서 이름을 기준으로 고객을 내림차순으로 정렬하여 출력하시요.
SELECT tc.customer_num,tc.customer_name,tc.address
FROM t_cus tc
order by tc.customer_name desc;

-- 004번 고객의 이름을 홍길순으로 주소를 인천시로 수정하는 SQL문장을 작성하시요.
update t_cus 
set customer_name ='홍길순', address= '인천시' 
where customer_num=4;

-- order 테이블에서 품명이 3글자 이상인 품명을 출력하시요.
select tr.order_num ,tr.product_name
from t_order tr
where char_length(tr.product_name)=3;
