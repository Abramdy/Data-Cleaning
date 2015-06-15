set names utf8mb4;

create table washed_record(
  id int(10) UNSIGNED not null AUTO_INCREMENT,
  origin_data_id int(10) UNSIGNED not null COMMENT 'origin data id',
  washed_data_id int(10) UNSIGNED not null COMMENT 'washed data id',
  data_type_id TINYINT(4) not null COMMENT 'data type id',
  handle_result_type_id TINYINT(4) not null comment 'handle result type id',
  strategy_key_type_id TINYINT(4) not null comment 'strategy key type id',
  PRIMARY KEY (id),
  key idx_washedDataId(washed_data_id)
)engine=innodb default charset=utf8mb4 comment 'wash record table';

create table data_type_dict(
  id int(10) UNSIGNED not null AUTO_INCREMENT,
  code varchar(32) not null comment 'type code',
  description varchar(100) not null comment 'type description',
  PRIMARY KEY (id)
)ENGINE =innodb DEFAULT charset=utf8mb4 comment 'data type dict';

create table handle_result_type_dict(
  id int(10) UNSIGNED not null AUTO_INCREMENT,
  code varchar(32) not null comment 'type code',
  description varchar(100) not null comment 'type description',
  PRIMARY KEY (id)
)ENGINE =innodb DEFAULT charset=utf8mb4 comment 'handle result type dict';

create table strategy_key_type_dict(
  id int(10) UNSIGNED not null AUTO_INCREMENT,
  code varchar(32) not null comment 'type code',
  description varchar(100) not null comment 'type description',
  PRIMARY KEY (id)
)ENGINE =innodb DEFAULT charset=utf8mb4 comment 'strategy key type dict';