CREATE DATABASE Event_Management_system;
USE Event_Management_system;
CREATE TABLE reg(
 Name char(100),
 Branch Char(100),
 Contact_number char(100),
 Division Char(100),
 Year Char(100),
 Address Char(100),
 PRN_no char(100),
 ENo char(100),
 EName Char(100)
);
SHOW TABLES;
SELECT * FROM reg;

CREATE TABLE Suggest_upcoming(
 select_event char(100),
 des char(200)

);
SELECT * FROM suggest_upcoming;

CREATE TABLE Suggest_ongoing(
 select_event char(100),
 des char(200)
);
SELECT * FROM Suggest_ongoing;

CREATE TABLE Performer(
Name char(30),
PRN_no char(20),
Contact_no char(12),
About_talent char(100),
Division char(10),
Year char(10),
Branch char(20),
Address char(100),
video char(100)
);
SELECT * FROM Performer;

CREATE TABLE Already_performer(
Name char(30),
PRN_no char(20),
Contact_no char(12),
Division char(10),
Branch char(20),
Year char(10),
video char(100),
About_talent char(100)

);
SELECT * FROM Already_performer;

CREATE TABLE Contact(
Name char(30),
Email_id char(50),
Phone_no char(20),
Message char(100)
);
SELECT * FROM Contact;

CREATE TABLE Event_ongoing(
No char(10),
Name char(100), 
Date char(12),
Venue char(100),
Time char(100),
Description char(100)
);
SELECT * FROM Event_ongoing;
INSERT INTO Event_ongoing VALUES("1","Vishwakarandak","14-11-2022","Sharad Arena","10.00 am","College Festival");
INSERT INTO Event_ongoing VALUES("2","Vishwautsav","14-12-2022","Lawn","9.00 am","College Festival");
INSERT INTO Event_ongoing VALUES("3","Melange","01-01-2023","Sharad Arena","8.00 am","College Festival");

CREATE TABLE signup(
 Name char(100),
 email_id Char(100),
 Contact_number char(100),
 prn_no Char(100),
 password Char(100),
 confirmed_password char(100)
);
SELECT * FROM signup;

