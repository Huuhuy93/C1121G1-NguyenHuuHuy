use quan_ly_sinh_vien;

select address, count(student_id) as 'Số lượng học viên'
from student group by address;

-- Hiển thị danh sách điểm trung bình của các học viên
select s.student_id, s.student_name, avg(mark) from student s
join mark m on s.student_id = m.student_id
group by student_id, student_name;

-- Sử dụng having để xét điều kiện điểm trung bình các môn học phải lớn hơn 9
select s.student_id, s.student_name, avg(mark) from student s
join mark m on s.student_id = m.student_id
group by student_id, student_name
having avg(mark) > 9;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select s.student_id, s.student_name, avg(mark) from student s
join mark m on s.student_id = m.student_id
group by student_id, student_name
having avg(mark) >= all (select avg(mark) from mark group by mark.student_id);

select class.*, count(student.student_id) as so_luong from student
right join class on student.class_id = class.class_id
group by class.class_id having so_luong = 0;



