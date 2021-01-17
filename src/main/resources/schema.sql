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
    transactionTypeId varchar(5),
    memberId varchar(5),
    nominal varchar(20)
);