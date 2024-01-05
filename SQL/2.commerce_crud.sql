INSERT INTO t_region (region_code, region_name)        -- 삽입
VALUES
('02', '서울특별시'),    
('031', '경기도'),
('032', '인천광역시'),
('033', '강원특별자치도'),
('041', '충청남도'),
('042', '대전광역시'),
('043', '충청북도'),
('044', '세종특별자치시'),
('051', '부산광역시'),
('052', '울산광역시'),
('053', '대구광역시'),
('054', '경상북도'),
('055', '경상남도'),
('061', '전라남도'),
('062', '광주광역시'),
('063', '전라북도'),
('064', '제주특별자치도');
select *from t_region;                                         

-- t_customer 테이블에 데이터 추가                                                             
INSERT INTO t_customer (customer_name, phone, email, address, region_code)       -- id와regist_date컬럼에는 값X(id는 자동증가,regist_date는 시스템자동입력)
VALUES
('홍길동', '010-1234-5678', 'hong@example.com', '서울시 강남구', '02'),
('김철수', '010-9876-5432', 'kim@example.com', '경기도 수원시', '031'),
('이영희', '010-1111-2222', 'lee@example.com', '인천시 남구', '032'),
('박민지', '010-5555-7777', 'park@example.com', '강원도 춘천시', '033'),
('정기호', '010-9999-8888', 'jung@example.com', '대전시 중구', '042');
select *from t_customer;

insert into t_customer(customer_name, phone, email, address, region_code)
values('손흥민','010-1234-7894','son@gmail.com','서울특별시 강남구 삼성동','02');
insert into t_customer(customer_name, phone, email, address, region_code)
values('박태환','010-1234-5555','park@gmail.com','제주특별자치도 제주시 일도','064');

select customer_name,phone from t_customer;

-- t_product 테이블에 데이터 추가       
INSERT INTO t_product (product_code, product_name, price)                     -- id컬럼에는 값X (id는 자동증가)
VALUES
('P001', '노트북', 1500000),
('P002', '스마트폰', 1000000),
('P003', '키보드', 50000),
('P004', '마우스', 30000),
('P005', '이어폰', 70000);
select *from t_product;

-- t_sales 테이블에 데이터 추가                          
INSERT INTO t_sales
(customer_id, product_code, qty)                                        -- 날짜컬럼는 자동이므로 안넣는다 기본인 디폴트이므로~
VALUES                                                                       -- id컬럼에는 값X (id는 자동증가)
(1, 'P001', 2),
(2, 'P002', 1),
(3, 'P003', 5),
(4, 'P004', 3),
(5, 'P005', 2),
(1, 'P002', 3),
(3, 'P001', 1),
(2, 'P004', 2),
(4, 'P003', 4),
(5, 'P005', 1);
select *from t_sales;
delete from t_sales where id=11;

update t_customer set address='서울특별시 강남구 일동' where id=7;
select *from t_customer;
update t_customer set address='제주특별자치도 제주시 일도' where id=7;

select * from t_customer where region_code='02'; 
select  region_code='02' from t_customer;          -- ??
select  region_code from t_customer;
select customer_name,phone from t_customer;

delete from t_customer where id=7;
insert into t_customer(customer_name, phone, email, address, region_code)
values('박태환','010-1234-5555','park@gmail.com','제주특별자치도 제주시 일도','064');

insert into t_sales(customer_id, product_code, qty) values(8,'P003',2);
select * from t_product;

SELECT customer_name, phone                              --  read = SELECT
FROM t_customer
WHERE region_code = '02';

select *                                                  -- 두테이블 전체표현
FROM t_customer tc                                  -- 테리블명 약어 tc, ;안넣음, t_customer as tc에서 as는 별명으로 하겠다는 뜻 ,생략가능
inner join t_region tr
on tc.region_code = tr.region_code;  

select tc.id, tc.customer_name, tr.region_name       -- tc. tr. 을 적음(테이블소속) 컬럼이 중복될수도 있으므로 region_code만 적으면 안됨 tr.region_code를 적는다.
FROM t_customer tc                                      
inner join t_region tr                                      -- inner join은 교집합, 지역코드를 기준으로 교집합
on tc.region_code=tr.region_code;  

select tc.id, tc.customer_name, tr.region_name       -- tc. tr. 을 적음(테이블소속) 컬럼이 중복될수도 있으므로 region_code만 적으면 안됨 tr.region_code를 적는다.
FROM t_customer tc                                      
left join t_region tr                                      -- inner join은 교집합, 지역코드를 기준으로 교집합
on tc.region_code=tr.region_code; 

select tc.id, tc.customer_name, tr.region_name       -- tc. tr. 을 적음(테이블소속) 컬럼이 중복될수도 있으므로 region_code만 적으면 안됨 tr.region_code를 적는다.
FROM t_customer tc                                      
right join t_region tr                                      -- inner join은 교집합, 지역코드를 기준으로 교집합
on tc.region_code=tr.region_code; 

SELECT * FROM t_sales;
SELECT  * FROM t_product;

SELECT product_name, SUM(qty) AS total_quantity, SUM(qty * price) AS total_price
FROM t_sales
JOIN t_product 
ON t_sales.product_code = t_product.product_code
GROUP BY product_name;

SELECT tp.product_code, tp.product_name, sum(ts.qty) as total , sum(ts.qty*tp.price) as total_price
FROM t_sales ts                                    -- avg(),SUM() 함수(매서드) :평균,집계   as는 별칭 생략가능
inner join t_product tp                             -- 조인은 공동키로 한다
on ts.product_code = tp.product_code          -- 조건절
GROUP BY product_code;           

