use quan_ly_sinh_vien;

select student_name from student where student_name like 'h%';

select * from class where month(start_day) = 12;

select * from subject where credit between 3 and 5;

SET SQL_SAFE_UPDATES = 0;
update student set class_id = 2 where student_name = 'Hung';

insert into student(student_name, address, phone, status, class_id)
values('Ngoc', 'Ha Noi', '0912113113', 1, 3);

insert into `subject` values(5, 'RDBMS', 12, 1);

insert into mark(sub_id, student_id, mark, exam_time) values(2, 3, 8, 1);

select s.student_name, sub.sub_name, m.mark
from student s join mark m on s.student_id = m.student_id
join subject sub on m.sub_id = sub.sub_id order by mark desc, student_name asc ;
