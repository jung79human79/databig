create database shopping;

INSERT INTO customer (customer_id, password, customer_name, age, rating, occupation, reserves)
VALUES    -- 기본키인 customer_id가 자료형이 VARCHAR(50)이므로 AUTO_INCREMENT가 안되므로 VALUES값에 넣는다
('CUST001', 'CUST001', '홍길동', 30, 'Gold', '엔지니어', 100),
('CUST002', 'CUST002', '이영희', 25, 'Silver', '교사', 50),
('CUST003', 'CUST003', '김철수', 40, 'VIP', '의사', 75),
('CUST004', 'CUST004', '박영훈', 35, 'Silver', '변호사', 25),
('CUST005', 'CUST005', '최미영', 28, 'Gold', '예술가', 150);

INSERT INTO product (product_name, inventory, price, manufacturer)
VALUES   -- 기본키 product_number는 AUTO_INCREMENT이므로 VALUES값에 안넣는다
('제품 A', 50, 20000, 'ABC 주식회사'),
('제품 B', 30, 35000, 'XYZ 기업'),
('제품 C', 80, 15000, 'LMN 산업'),
('제품 D', 40, 25000, 'PQR 주식회사'),
('제품 E', 20, 30000, 'JKL 기업');

INSERT INTO customer_product (customer_id, product_number, quantity)
VALUES  -- order_date는 시스템 자동 now()이므로 VALUES값에 안넣는다 order_number는 기본키이고 AUTO_INCREMENT이므로 VALUES값에 안넣는다
('CUST001', 1, 2),
('CUST002', 3, 1),
('CUST003', 2, 3),
('CUST004', 4, 2),
('CUST005', 5, 1),
('CUST001', 2, 1),
('CUST002', 4, 2),
('CUST003', 1, 3),
('CUST004', 5, 1),
('CUST005', 3, 2);

select * from customer;
select * from product;
select * from customer_product;

-- 재고량을 항상 0개 이상 10,000개 이하를 유지하기 위한 제약조건은 모델링 후에 직접 SQL로 지정할것
ALTER TABLE product
ADD CONSTRAINT check_inventory CHECK (inventory> 0 AND inventory<= 10000);

update product 
set inventory=-1       -- 에러 inventory범위때문
where product_number=5;

-- 주문테이블에서 CUST005고객이 주문한 제품의 이름을 출력
select p.product_name
from customer_product cp
inner join product p
on cp.product_number=p.product_number
where cp.customer_id='CUST005'; 

-- 주문테이블에서 나이가 30세이상인 고객이 주문한 제품의 번호와 주문일자
-- (제품번호 주문일자)
select cp.product_number, cp.order_date
from customer c
inner join customer_product cp
on c.customer_id = cp.customer_id
where c.age>=30;

-- 고객테이블에서 적립금 평균이 80원 이상인 등급에 대해 
-- 등급별 고객수와 적립금 평균을 출력 
select rating, count(*) 고객수 , avg(reserves) 평균   -- AVG는 ()안에 반드시 컬럼을 삽입
from customer c
group by rating
having avg(reserves)>=80;                       -- having 평균>=80; 

-- 고객테이블에서 적립금이 가장 많은 고객의 고객이름과 적립금을 출력
-- 서브쿼리
select customer_name, reserves
from customer c
where reserves =(
 select max(reserves) from customer c
 );
 
 -- 주문테이블에서 CUST005고객이 주문한 제품의 이름과 제조업체를 출력
 select p.product_name,p.manufacturer
 from product p
 where p.product_number in(
   select cp.product_number
   from customer_product cp
   where cp.customer_id = 'CUST005'
 );
 
-- SQL명령문 : DDL(정의),DML,DCL
-- 1.DDL(정의) : create, alter(테이블 제약조건 같은 걸 추가=구조추가=데이터 수정이 아님) ,drop(테이블구조자체삭제) 
-- alter : FK설정, CHECK등등
-- 2.DML(조작) :  select , insert , update , delete( 테이블 컬럼의 레코드삭제) 
-- 3.DCL(제어) :  권한부여 = grant(승인) 예)이사람에게 delete권한을 안준다 ,revoke(권한취소)

-- 구매이력이 있는 customer_id를 출력하되 중복배제 
select distinct customer_id      -- distinct 별개로 (중복배제)
from customer_product;
-- customer_id의 갯수출력
select count(distinct customer_id)      
from customer_product;

-- 제조회사 길이
select manufacturer, length(manufacturer) 업체이름길이
from product;                                   -- 바이트 계산 8*2=16

select manufacturer, char_length(manufacturer) 업체이름길이
from product;

-- 길이가 8인 회사의 제품명,회사명
select product_name,manufacturer                             
from product
where char_length(manufacturer)=8;

-- NULL
select count(age)
from customer;                      -- 카운트는 널을 계산 안함

select count(customer_id)
from customer; 

-- 나이가 널인 고객이름 출력
select c.customer_name
from customer c
where c.age is null;                    -- 널체크

select c.customer_name
from customer c
where c.age is not null;               

-- 제품을 2개 이상 제조한 제조업체별로 제품의 갯수와 제품 중 가장 비싼 가격을 출력
select manufacturer , count(*) 개수 , max(price) 최고가  -- 4
from product                   -- 1
group by manufacturer         -- 2
having count(*)>=2;             -- 3 필터링

select manufacturer , count(*) 개수 , max(price) 최고가  -- 4
from product                    -- 1
group by manufacturer           -- 2 그룹화
having 개수 >=2;                  -- 3 필터링 

-- 제품 c를 생산한 제조업체가 만든 제품들의 제품명과 가격 출력
-- 부속질의 (서브쿼리)
select p.product_name , p.price
from product p
where p.manufacturer =(         -- 값이 1개이면=사용,여러개인 경우는 in, not in=()안에 없는 것 
  select p.manufacturer
  from product p
  where p.product_name = '제품 c'
);   

-- CUST005고객이 주문한 제품의 제품명과 제조업체를 출력
select p.product_name , p.manufacturer
from product p
where p.product_number in (
   select cp.product_number
   from customer_product cp
   where cp.customer_id = 'CUST005'
); 

-- CUST005고객이 주문 안한 제품의 제품명과 제조업체를 출력
select p.product_name , p.manufacturer
from product p
where p.product_number not in (
   select cp.product_number
   from customer_product cp
   where cp.customer_id = 'CUST005'
);                  

-- 제품의 가격을 모두 10% 인상해보자
update product                      -- 에러발생  -- 커맨드 창에서는 전부 적용 가능(업데이트이나 삭제등) 
set price= price*1.1                -- 전체 업데이트나 전체삭제는 시스템에서 막음(보안상) 방법은 where절을 주어 한레코드씩 삭제나 업데이트을 한다
where product_number = 6;           -- where절을 사용해 일일이 적용해야함

          







