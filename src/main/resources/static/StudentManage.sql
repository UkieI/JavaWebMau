CREATE DATABASE JAVAWEB1;
GO;

USE JAVAWEB1;
GO;

CREATE TABLE truong (
    matruong VARCHAR(12) PRIMARY KEY ,
    tentruong VARCHAR(150),
    diachi VARCHAR(150),
    sdt VARCHAR(10)
);

CREATE TABLE sinhvien (
    socmnd VARCHAR(12) primary key ,
    hoten varchar(150),
    email varchar(100),
    sdt varchar(10),
    diachi varchar(150)
);

CREATE TABLE nganh (
    manganh varchar(12) primary key ,
    tennganh varchar(150),
    loainganh varchar(150)
);

CREATE TABLE congviec (
    socmnd varchar(12),
    ngayvaocongty date,
    manganh varchar(12),
    tencongviec varchar(150),
    tencongty varchar(150),
    diachicongty varchar(150),
    thoigianlamviec date,
    foreign key(socmnd) references sinhvien(socmnd),
    foreign key(manganh) references nganh(manganh)
);

CREATE TABLE totnghiep (
    socmnd varchar(12),
    matruong varchar(12),
    manganh varchar(12),
    hetn varchar(20),
    ngaytn date,
    loaitn varchar(1),
    foreign key(socmnd) references sinhvien(socmnd),
    foreign key(matruong) references truong(matruong),
    foreign key(manganh) references nganh(manganh)
);

insert into sinhvien
(socmnd, hoten, email, sdt, diachi)
values
('000000000001', 'Do Thanh Dat', 'abc@gmail.com', '0123456789', '21 abc street'),
('000000000002', 'Hoang Huu Manh', 'abc@gmail.com', '0123456789', '12 sac street' ),
('000000000003', 'Phung Quang Dang', 'abc@gmail.com', '0123456789' , '234 sac street');

insert into truong
(matruong, tentruong, diachi, sdt)
values
('A01','VKU' , 'k123 - 32 ksa street', '0123456789'),
('A02','JSK' , 'k231 - 12 aaa street', '0123456789');

insert into nganh
(manganh, tennganh, loainganh)
values
('B01', 'IT', 'a'),
('B02', 'Marketing' , 'a'),
('B03', 'IOT' , 'b');

insert into totnghiep
(socmnd, matruong, manganh, hetn, ngaytn, loaitn)
values
('000000000001', 'A01', 'B01', 'Hang tot', '18/09/2023', 'A'),
('000000000002', 'A02', 'B02', 'Hang kha', '30/01/2023', 'B'),
('000000000003', 'A01', 'B03', 'Hang kha', '02/02/2023', 'A');

insert into congviec
(socmnd, ngayvaocongty, manganh, tencongviec, tencongty, diachicongty, thoigianlamviec)
values
('000000000001', '12/11/2023', 'B01', 'lap trinh vien', 'Hoang tinh phat', '12 oas street', null),
('000000000002', '20/07/2023', 'B02', 'media', 'Canh can van', '221 das street', null),
('000000000003', '09/10/2023', 'B03', 'Ky su hoang ha', 'Hoang ha ', '345 oks street', null);
