CREATE SEQUENCE ID_SEQ;
CREATE TABLE IF NOT EXISTS campaigns (
  id bigint NOT NULL,
  status VARCHAR(255),
  name VARCHAR(255),
  CONDITION text,
  creation_date TIMESTAMP NOT NULL,
  modified_date TIMESTAMP NOT NULL,
  CONSTRAINT pk_campaigns PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS customers (
  id bigint NOT NULL,
  email VARCHAR(255),
  name VARCHAR(255),
  phone VARCHAR(255),
  place VARCHAR(255),
  profession VARCHAR(255),
  date_of_birth TIMESTAMP,
  creation_date TIMESTAMP NOT NULL,
  modified_date TIMESTAMP NOT NULL,
  CONSTRAINT pk_customers PRIMARY KEY (id)
);
