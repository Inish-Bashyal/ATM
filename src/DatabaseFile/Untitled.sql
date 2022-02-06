create database attendancemanagementsystem;
use attendancemanagementsystem;
show tables;

create table faculty(
loginId int primary key auto_increment,
facFname varchar(20),
facLname varchar(20),
gender varchar(10),
phoneNo varchar(10),
dateOfBirth varchar(15),
username varchar(20),
password varchar(20)
);

create table students(
StudentId varchar(30) primary key,
stdFname varchar(20),
stdLname varchar(20),
stdGender varchar(10),
stdPhoneno varchar(10),
stdPassword varchar(20),
stdCourse varchar(20),
stdSemester varchar(15),
stdPphoneno varchar(10),
stdPemail varchar(30)
);

CREATE TABLE `attendancemanagementsystem`.`course` (
  `idcourse` INT NOT NULL AUTO_INCREMENT,
  `coursename` VARCHAR(45) NOT NULL,
  `coursedesc` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`idcourse`));

  CREATE TABLE `attendancemanagementsystem`.`subject` (
  `subjectcode` VARCHAR(15),
  `subjectname` VARCHAR(45) NOT NULL,
  `coursename` VARCHAR(45) NOT NULL,
  `subjectdesc` VARCHAR(100) NOT NULL,
  `semester` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`subjectcode`));


select * from course;
select * from faculty;
select * from students;
select * from subject;
