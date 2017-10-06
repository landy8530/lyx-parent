-- 01 创建临时表空间
create temporary tablespace lyx_temp 
tempfile 'D:\oracle\oradata\orcl\lyx_temp.dbf' size 100m autoextend on next 50m maxsize 200m;
--drop  tablespace lyx_temp including contents and datafiles;

-- 02 创建表空间
create tablespace lyx
datafile 'D:\oracle\oradata\orcl\lyx.dbf' size 200m autoextend on next 100m maxsize 400m;
--drop  tablespace lyx including contents and datafiles;
--alter tablespace lyx add datafile 'D:\oracle\oradata\orcl\lyx.dbf' size 200m autoextend on;

-- 03 创建用户并制定表空间
create user lyx identified by lyx
default tablespace lyx
temporary tablespace lyx_temp;

-- 04 赋权
grant dba to lyx;


 
