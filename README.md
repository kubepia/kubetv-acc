# sam-blueberry-acc

create database
CREATE DATABASE skb DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;


create table
``` sql
create table if not exists skb.user_info (
user_name  varchar(30) not null,
user_email varchar(15) not NULL primary key,    
user_tel varchar(15) not null,    
user_pw  varchar(30) not null , 
user_nickname varchar(15) not null , 
membership boolean not null
)DEFAULT CHARSET=utf8;
```
innsert data
```sql
insert into skb.user_info(user_name, user_email, user_tel, user_pw, user_nickname, membership ) VALUES('김다름','a@g','010-1234-5678','passw0rd','다름보이', true);
insert into skb.user_info(user_name, user_email, user_tel, user_pw, user_nickname, membership ) VALUES('김수미','b@g','010-9876-5432','passw0rd','k8s', true);
insert into skb.user_info(user_name, user_email, user_tel, user_pw, user_nickname, membership ) VALUES('홍길동','c@i','010-2345-6789','passw0rd','ibm', false);

```
