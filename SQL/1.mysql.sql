-- SQL (구조화 질의 언어) DB에게 질의 한다
-- MySQL DBMS (RDBMS:관계형) ->테이타를 테이블 단위로 관리
create database bigdata;    -- bigdata 만들어 주라
create table student (      -- 테이블 구조 (스키마)
num int not null primary key auto_increment, -- 행이 증가하면 자동 증가하는 컬럼 절대 중복 안되고 빈 값 안된다
name varchar(50),  -- 가변형 문자열 50은 자릿수 3글자 들어가도 나머지 47은 자동 없어짐 var를 빼면 50이 고정됨
tel varchar(50), -- varchar는 50글자까지 크기를 지정할 수 있다. varchar는 자료형 ()는 크기 혹은 자릿수
age int,        -- age는 column이름 int는 자릿수가 필요없음
email varchar(50)
);
-- CRUD --
insert into student(name,tel,age,email)            -- student 값들을 저장하자 num저장 안함 자동 증가 되므로~
values ('홍길동','010-1111-1111',20,'aaa@aaa.com');  -- 자바는 문자열을 "" 디비는 ''안에 넣는다

insert into student(name,tel,age,email)             -- insert가 crud 중 c이다
values ('정대주','010-1111-2122',30,'aaa@aaa.com');    -- 여러개이므로 values
select * from student;  -- student테이블로 부터 모든것(*)을 선택한다=보여주라 
-- insert로 저장하고 select로 보는 것 --
-- num가 2인 학생의 나이를 99로 수정하자
update student set age=99 where num=2;         -- 조건 where 넘버가 2인 행만~  ,set은 바꾼다 

-- num가 2인 학생의 전번,이메일주소 변경
update student 
set tel = '010-1111-1004' , email='1004@dddd.com'  -- 두개 이상은 ,로 구분  컬럼이름 = 변경값기록
where num=2;                                       -- 2번이라는 레코드를 찾아서
-- 2번 삭제
delete from student
where num=2;
-- 테이블 삭제(drop)
drop table student;
