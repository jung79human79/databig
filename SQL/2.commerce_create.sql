create database commerce;
-- Drop the tables if they exist          -- 기존에 아래와 같은 테이블 있다면 지우고 시작한다 일종의 디폴트
DROP TABLE IF EXISTS t_sales;            -- 드랍도 자식부터 지운다
DROP TABLE IF EXISTS t_customer;
DROP TABLE IF EXISTS t_product;
DROP TABLE IF EXISTS t_region;

-- Create the t_region table
CREATE TABLE t_region (                       -- 지역부터 만든다.
region_code varchar(3) not null,              -- 필수입력 =not null PK이지만 지역코드이므로 자동증가 안준다
region_name varchar(10) not null,
primary key(region_code)                      -- ()안에 ,를 넣어 두개 사용가능
);

-- Create the t_customer table
CREATE TABLE t_customer (
id int not null auto_increment,                -- 고객코드            
customer_name varchar(10) not null,         -- SQL쿼리문 순서 = 컬럼이름->자료형->다른요소(속성)
phone varchar(20) not null unique,            -- unique=중복안됨 유일한 값 ,PK후보
email varchar(50) not null unique,             -- unique=중복안됨 유일한 값 ,PK후보
address varchar(100) not null,
regist_date datetime default now(),            -- datetime 날짜변수  default=기본값으로   now()함수=날짜자동 컬럼은 있으나 밸류는 주지 않는다 값을 안주어도 시스템에서 자동날짜 입력됨
region_code varchar(3) not null,                -- FK
primary key(id)
);

-- Create the t_product table
CREATE TABLE t_product(
id int not null auto_increment,                   -- 상품번호
product_code varchar(12) not null unique,     -- unique=중복안됨 유일한 값 ,PK가 아니지만 FK가 참조할 수 있음(반드시 unique줘야함)
product_name varchar(50) not null,
price int,
primary key(id)
);

-- Create the t_sales table
CREATE TABLE t_sales (
id int not null auto_increment,                  -- 독립형 PK , 구매번호
customer_id int not null,                          -- FK  auto_increment,빠짐
product_code varchar(12) not null,              -- FK  unique, 빠짐
qty int not null,
sales_date datetime default now(),          -- 컬럼은 있으나 밸류는 주지 않는다
primary key(id)
);

ALTER TABLE t_customer                                                                                                   -- ALTER=t_customer라는 테이블을 변경한다
ADD CONSTRAINT fk_region_code FOREIGN KEY (region_code) REFERENCES t_region(region_code);       -- 속박을 추가한다 
-- 속박(계약)이름 지정(임의변경가능) FK키를 t_customer테이블에서 region_code에게 주겠다 참조는 t_region라는 테이블의 region_code컬럼을 참조하겠다.

ALTER TABLE t_sales
ADD CONSTRAINT fk_customer_id FOREIGN KEY (customer_id) REFERENCES t_customer (id),
ADD CONSTRAINT fk_product_code FOREIGN KEY (product_code) REFERENCES t_product (product_code);

select * from information_schema.table_constraints;         -- 테이블간의 제약조건 확인하기


