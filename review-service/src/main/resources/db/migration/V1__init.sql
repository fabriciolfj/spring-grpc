create table review (
id          bigserial not null,
code        varchar(255) not null,
describe    varchar(255) not null,
rate        integer not null,
date_created timestamp not null,
constraint pk_review primary key (id)
)