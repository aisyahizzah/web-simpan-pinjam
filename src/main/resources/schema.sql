CREATE TABLE member (
    memberId SERIAL NOT NULL,
    memberName varchar(20) NOT NULL,
    memberBirthDate DATE NOT NULL,
    memberAddress varchar(100) DEFAULT NULL,
    PRIMARY KEY (memberId)
);

CREATE TABLE transactionType (
    transactionId SERIAL NOT NULL,
    transactionName varchar(20),
    PRIMARY KEY (transactionId)
);

CREATE TABLE moneyMutation (
    date DATE,
    transactionTypeId INTEGER,
    memberId INTEGER,
    nominal INTEGER
);