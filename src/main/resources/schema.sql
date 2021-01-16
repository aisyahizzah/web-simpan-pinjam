CREATE TABLE member (
    id varchar(5),
    name varchar(20) NOT NULL,
    birthDate DATE NOT NULL,
    address varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE transactionType (
    id varchar(5),
    name varchar(20),
    PRIMARY KEY (id)
);

CREATE TABLE moneyMutation (
    date DATE,
    transactionTypeId varchar(5),
    memberId varchar(5),
    nominal varchar(20)
);