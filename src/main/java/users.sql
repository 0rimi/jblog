--테이블 삭제
drop table users;

--시퀀스 삭제
drop sequence seq_users_no;

--테이블생성
CREATE TABLE users (
    userNo number,
    id varchar2(50) NOT NULL UNIQUE,
    userName varchar2(100) NOT NULL,
    password varchar2(50) NOT NULL,
    joinDate date NOT NULL,
    PRIMARY KEY(userNo)
    );
    
--시퀀스 생성
CREATE SEQUENCE seq_users_no
INCREMENT BY 1 
START WITH 1 ;

--insert
insert into users
values(seq_users_no.nextval, 'sb1205', '최수빈', '20001205', sysdate);
insert into users
values(seq_users_no.nextval, 'yj0913', '최연준', '19990913', sysdate);
insert into users
values(seq_users_no.nextval, 'bg0313', '최범규', '20010313', sysdate);
insert into users
values(seq_users_no.nextval, 'th0205', '강태현', '20020205', sysdate);
insert into users
values(seq_users_no.nextval, 'hk0814', '휴닝카이', '20020814', sysdate);

select  userNo,
        id,
        userName,
        password,
        to_char(joindate, 'yy-mm-dd hh:mi:ss')
from users;


commit;

--update문
update board 
set password = '020205',
where no = 4;


--delete문
delete from board
where no = 4;
