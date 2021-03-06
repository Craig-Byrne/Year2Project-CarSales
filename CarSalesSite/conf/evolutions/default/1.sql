# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table car_on_sale (
  id                            bigint auto_increment not null,
  make                          varchar(255),
  model                         varchar(255),
  year                          integer not null,
  fuel_type                     varchar(255),
  price                         integer not null,
  colour                        varchar(255),
  constraint pk_car_on_sale primary key (id)
);

create table inquiries (
  id                            bigint auto_increment not null,
  full_name                     varchar(255),
  email                         varchar(255),
  phone_number                  varchar(255),
  inquiry                       varchar(255),
  constraint pk_inquiries primary key (id)
);

create table item_on_sale (
  id                            bigint auto_increment not null,
  make                          varchar(255),
  model                         varchar(255),
  year                          integer not null,
  fuel_type                     varchar(255),
  price                         integer not null,
  colour                        varchar(255),
  constraint pk_item_on_sale primary key (id)
);

create table product (
  id                            bigint auto_increment not null,
  make                          varchar(255),
  model                         varchar(255),
  year                          integer not null,
  fuel_type                     varchar(255),
  price                         integer not null,
  colour                        varchar(255),
  constraint pk_product primary key (id)
);

create table reviews (
  id                            bigint auto_increment not null,
  full_name                     varchar(255),
  rating                        integer not null,
  comment                       varchar(255),
  constraint pk_reviews primary key (id)
);

create table user (
  id                            bigint auto_increment not null,
  email                         varchar(255),
  role                          varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (id)
);


# --- !Downs

drop table if exists car_on_sale;

drop table if exists inquiries;

drop table if exists item_on_sale;

drop table if exists product;

drop table if exists reviews;

drop table if exists user;

