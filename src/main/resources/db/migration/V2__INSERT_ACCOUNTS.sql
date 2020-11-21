insert into accounts (username, encoded_password) values
('Doctor1','$2a$10$BRMZmPOOaLp5ksyMZMY8rOCphXq8xZtgcsi8svVIeSQnEVMp4LY0a'),
('Patient1', '$2a$10$BRMZmPOOaLp5ksyMZMY8rOCphXq8xZtgcsi8svVIeSQnEVMp4LY0a'),
('Doctor2','$2a$10$BRMZmPOOaLp5ksyMZMY8rOCphXq8xZtgcsi8svVIeSQnEVMp4LY0a');

insert into authorities (permission) values
('appointment:read'),
('appointment:write'),
('ROLE_DOCTOR'),
('ROLE_PATIENT');

insert into accounts_authorities(account_id, authority_id)
select accounts.account_id, authorities.authority_id from accounts, authorities
where accounts.username='Doctor1' and authorities.permission='ROLE_Doctor';

insert into accounts_authorities(account_id, authority_id)
select accounts.account_id, authorities.authority_id from accounts, authorities
where accounts.username='Patient1' and authorities.permission='ROLE_PATIENT';

insert into accounts_authorities(account_id, authority_id)
select accounts.account_id, authorities.authority_id from accounts, authorities
where accounts.username='Doctor2' and authorities.permission='appointment:read';

insert into accounts_authorities(account_id, authority_id)
select accounts.account_id, authorities.authority_id from accounts, authorities
where accounts.username='Doctor2' and authorities.permission='appointment:write';

insert into accounts_authorities(account_id, authority_id)
select accounts.account_id, authorities.authority_id from accounts, authorities
where accounts.username='Doctor2' and authorities.permission='ROLE_DOCTOR';

insert into accounts_authorities(account_id, authority_id)
select accounts.account_id, authorities.authority_id from accounts, authorities
where accounts.username='Patient1' and authorities.permission='appointment:read';