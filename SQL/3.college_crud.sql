-- 학과
-- Insert data into department table
INSERT INTO  department (department_name) VALUES
('컴퓨터공학과'),
('국어국문과'),
('정보통신과'),
('전자공학과');
select * from department;

-- 학생
-- Insert data into Student table
INSERT INTO student (student_name, student_height, department_code) VALUES
('가길동', 170.5, 1),
('나길동', 165.2, 1),
('다길동', 180.0, 2),
('라길동', 175.8, 3),
('마길동', 160.7, 4),
('바길동', 168.3, 1),
('사길동', 172.1, 2),
('아길동', 175.0, 1);
select * from student;
delete from student where student_id between 9 and 16;  -- 9번부터~16번까지 레코드 삭제 17번부터 레코드 기록됨.
delete from student where student_id=1 or student_id=8; -- 1번과 8번이 삭제
delete from student where student_id=2 and student_id=7; -- 교집합이므로 삭제없음
delete from student where student_id>=2 and student_id<=7;  -- 2번 부터 7번사이 레코드 삭제됨

DROP TABLE IF EXISTS Department;    -- 5 드랍순서 
DROP TABLE IF EXISTS student;         -- 2      
DROP TABLE IF EXISTS Professor;      -- 4
DROP TABLE IF EXISTS Course;           -- 3
DROP TABLE IF EXISTS Student_Course;    -- 1

--  학생의 학과 정보 출력 (학생이름 ,학과명)
select s.student_name,d.department_name
from student s
inner join department d
on s.department_code=d.department_code;

select  s.student_name,d.department_name                 -- 같은 표현
from student s, department d                             -- 연거푸 나오면 조인의 의미
where s.department_code=d.department_code;   

-- 학과별 학생수 (학과명 ,학생수)
select d.department_name, count(*) as cnt     -- 반드시 그룹바이 컬럼을 적어여 함  *은 특정 컬럼
from department d
inner join student s
on s.department_code=d.department_code
group by d.department_name;

-- 학생수가 2명인 이상인 학과를 출력 (-- group by having절)
select d.department_name, count(*) as cnt     -- 반드시 그룹바이 컬럼을 적어여 함  *은 특정 컬럼
from department d
inner join student s
on s.department_code=d.department_code
group by d.department_name
having cnt>=2;               -- having =group by한 최종 결과값에서 필터링하는 쿼리문(갯수가 2이상을 필터링)

-- 국어 국문과에 다니는 학생을 출력하세요(학과명 학생이름).
select d.department_name,s.student_name             -- 반드시 where절에 컬럼을 적는다.
from department d
inner join student s
on s.department_code = d.department_code
where d.department_name='국어국문과'; 

-- 학생 이름이 바로 시작하는 학생이름만 출력
select * from student
where student_name like '바%' ;              -- 바로 시작하고 뒤에는 머든 상관 없다

select * from student
where student_name like '%길동' ;             -- 

select * from student
where student_name like '%길%' ;             -- like 는 검색   

-- 학생의 키가 170이상 180이하인 학생만~(논리연산자)               -- 170이상만 이면 관계연산자
  select * from student
  where student_height>=170 and student_height<=180;    
  
  select * from student
  where student_height between 170 and 180;         -- 위와 같은 표현
  
  -- 키가 가장 큰 사람이름 출력
  select student_name from student
  order by student_height desc
 limit 1;                                   -- 페이징 처리 점프 옵셋
                                          -- 웹으로 넘어갈 때 페이징 처리 쿼리어 ,점프 ,시작점 옵셋
                                          
INSERT INTO Professor (professor_name, department_code) VALUES
('가 교수', 1),
('나 교수', 1),
('다 교수', 2),
('빌 게이츠', 3),
('스티브 잡스', 4);
select * from Professor;

-- q. 컴퓨터공학과에 소속된 이름을 출력 (학과명 ,교수이름)
select d.department_name ,p.professor_name
from department d
inner join Professor p
on d.department_code= p.department_code
where d.department_name = '컴퓨터공학과' ;

-- q. 학과별 교수의 수를 출력   -- 학과별이므로 department_name
select department_name ,count(professor_name) as cnt
from department d
inner join Professor p
on d.department_code= p.department_code
group by  d.department_name ;

-- q 교수의 수가 2명 이상인 학과를 출력 
select department_name ,count(professor_name) as cnt
from department d
inner join Professor p
on d.department_code= p.department_code
group by  d.department_name 
having cnt>=2;                        -- 맨 마지막에 실행됨.

-- q. 가장 많은 학생이 있는 학과명과 학생수를 출력
select department_name ,count(*) as cnt
from student s
inner join  department d
on d.department_code= s.department_code
group by  d.department_name 
order by  cnt desc
limit 1;   

-- 학생 테이블 중 학과코드컬럼 중 가장 큰수
select max(department_code) 
from student ;

-- 가장많은 학생 수
select department_code, count(department_code) cnt 
from student
group by  department_code
having cnt>=4;

select department_code
from student
group by  department_code
having count(department_code)=4;

-- 가장많은 학생 수를 가진 학과명 
-- 서브쿼리 이용하기
select department_name
from department
where department_code = (
      select department_code from student
      group by  department_code 
      having count(department_code) = (
          select count(department_code) cnt from student group by  department_code
          order by  cnt desc limit 1
          )
		);



-- 학생 중 성씨가 아인 학생이 속한 학과명과 학생명을 출력하세요
select department_name,student_name
from student s
inner join department d
on d.department_code= s.department_code
where student_name like '아%';

-- 학생중 키가 175~185 사이의 속하는 학생수를 출력
select count(student_id) as cnt
from student
where student_height between 175 and 185;

-- 다길동 학생과 같은 학과에 속한 학생의 이름을 출력
-- 서브쿼리 이용
-- 먼저 다길동이의 department_code를 구하고     -- 작은 select부터 만든다
-- 구한 department_code를 다시 학생테이블에서 같은 department_code의 학생들만 출력

select st.student_name
from student st
where st.department_code =
    (select s.department_code
	 from student s
     where  s. student_name = '다길동'
     );
     
-- 학과이름 별 키의 최고값과 평균값을 출력
select d.department_name, max(s.student_height) max, avg(s.student_height) avg
from department d
inner join student s
on d.department_code= s.department_code
group by d.department_name;            -- 학과이름으로 그룹화

-- 개설과목
INSERT INTO Course (course_name, professor_code, start_date, 
end_date) VALUES
('교양 영어', 1, '2023-07-01', '2023-08-15'),
('데이터베이스 입문', 2, '2023-07-01', '2023-08-31'),
('회로이론', 3, '2023-07-15', '2023-09-15'),
('공학수학', 4, '2023-07-15', '2023-09-30'),
('객체지향 프로그래밍', 5, '2023-07-01', '2023-08-31');
select * from Course;

-- 빌게이츠가 가리키는 과목이름과 교수이름
select c.course_name,p.professor_name
from Course c
inner join Professor p
on c.professor_code = p.professor_code
where p.professor_name ='빌 게이츠';

select ifnull(max(id),0)+1 from Student_Course;     -- 초기값 널값 만약5라면 5번까지 입력된것임 
-- 수식 넣기전 널체크 필수임 = 맥스를 구하는데 만약 널이면 0으로 치환 후 +1
-- 수강신청하면 1번부터 번호 생성

-- 수강
INSERT INTO Student_Course (id, student_id, course_code) VALUES
(1, 1, 1),             -- 대체키,자동증가 아님=max로 인위적으로 자동 증가, 널아님, pk아님, 유니크임
(2, 2, 1),
(3, 3, 2),
(4, 4, 3),
(5, 5, 4),
(6, 6, 5),
(7, 7, 5);
select * from Student_Course;

-- 과목별 수강자 수 (과목이름 수강자수)
-- 과목이름 오름차순 정렬+수강자수가2이상인 과목이름 출력
-- group by,order by에 넣은 컬럼을 select에 동일한 컬럼을 넣자
select c.course_name, count(sc.student_id) 수강자수   -- group by를 기준으로 숫자셈  -- 컬럼한글이름 따옴표 안넣어도 가능
from Student_Course sc
right join Course c                      -- 과목은 있는데 수강자가 없는경우도 나오려면 여기서는 right join함=여기서 왼쪽은 Student_Course테이블임
on sc.course_code= c.course_code
group by c.course_name                    
having 수강자수 >=2                            -- having절은 group by 뒤에 와서 필터링  -- 컬럼한글이름 따옴표 절대 안넣음
order by c.course_name asc;                  -- 최종적으로 정렬하므로 맨 마지막

-- 빌게이츠 교수의 과목을 수강한 학생이름을 출력 + 학생수
-- 서브쿼리 이용 
-- 문제 내용대로 교수,과목,수강(학생id),학생 순으로 서브쿼리 사용

-- 1번 select = 교수코드
select  p.Professor_code
from Professor p
where p.Professor_name = '빌 게이츠';
    
-- 2번 select = 과목코드 -- 과목테이블에서 과목코드를 빼내기 위해 부모코드인 교수코드(1번 select)가 필요
select c.course_code
from course c
where c.Professor_code = (
    select  p.Professor_code
    from Professor p
    where p.Professor_name = '빌 게이츠'
    );
    
-- 3번 select =학생id -- 수강테이블에서 학생id를 빼내기 위해 과목코드가 필요
-- 수강테이블에서 학생id를 뽑은 이유는 학생테이블에서 학생이름컬럼을 뽑아야 하므로
select sc.student_id
from Student_Course sc
where sc.course_code = (
  select c.course_code
  from course c
  where c.Professor_code = (
      select  p.Professor_code
      from Professor p
      where p.Professor_name = '빌 게이츠'
    )
);

-- 최종 select=학생이름과 학과코드  -- 학생테이블에서 학생이름를 빼내기 위해 학생id가 필요함
select s.Student_name, s.department_code
from Student s
where s.Student_id in (                  -- in(5,3,1,9)은 id가 5,3,1,9인 값만 출력 -- in 대신 = 해도됨(한개의 레코드만 나오므로 =이 가능) 만일 2개이상의 레코드라면 in을 사용
     select sc.student_id                 -- 여기서 in은 5번
     from Student_Course sc              -- from에 적힌 테이블을 where절과 select절에서 컬럼을 뽑아 사용 
     where sc.course_code = (
           select c.course_code
           from course c
           where c.Professor_code = (
                    select  p.Professor_code
                     from Professor p
                      where p.Professor_name = '빌 게이츠'
                   )
             )
);    

-- 스티브 잡스 교수의 과목을 수강한 학생이름을 출력 (동일질문)
-- 1번 select =교수코드  2번 select=과목코드  
 -- 3번 select= 학생id  4번 select= 학생이름,학과코드
 -- 학과이름,학생이름
select d.department_name , Student_name    -- s.Student_name은 안됨 (미정의됨)
from department d
inner join 
(select s.Student_name, s.department_code
from Student s
where s.Student_id in (                  -- 학생id= 6,7 안에서(in) = in(6,7);  학생id중 6,7번만 이름과 학과코드를 출력 
  select sc.student_id
  from Student_Course sc
  where sc.course_code = (
     select c.course_code
     from course c
     where c.Professor_code = (
         select  p.Professor_code
         from Professor p
         where p.Professor_name = '스티브 잡스'
	 )
	)
  )
) as A
 ON A.department_code = d.department_code;   -- department테이블의 기본키department_code가 공통요소
 
 -- 사길동 학생(7)과 같은 과목을 수강신청한 학생이름 출력
 -- 서브쿼리
 -- 학생테이블->수강테이블->수강테이블->학생테이블
 select s.Student_name        -- 학생이름 =바길동,사길동
 from Student s
 where s.Student_id in (
   select sc.Student_id           -- 학생id 6번,7번
   from Student_Course sc
   where sc.course_code=(
     select sc.course_code             -- 과목코드 5번
     from Student_Course sc
     where sc.Student_id =(
       select s.Student_id              -- 학생 7번
       from Student s
       where s.Student_name = '사길동'     
      )
    )
 );
 
 
 
        
    
    

                                       