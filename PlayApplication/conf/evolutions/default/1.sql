# Users schema
 
# --- !Ups
 
CREATE TABLE Person (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    buffer BLOB NOT NULL,
    PRIMARY KEY (id)
);
 
# --- !Downs
 
DROP TABLE Person;
