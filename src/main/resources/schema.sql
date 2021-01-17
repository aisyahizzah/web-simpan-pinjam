CREATE TABLE member (
    memberId SERIAL NOT NULL,
    memberName varchar(20) NOT NULL,
    memberBirthDate DATE NOT NULL,
    memberAddress varchar(100) DEFAULT NULL,
    PRIMARY KEY (memberId)
);

CREATE TABLE mutation (
    mutationId SERIAL NOT NULL,
    date DATE,
    transactionType varchar(10),
    memberName varchar(20),
    nominal INTEGER,
    PRIMARY KEY (mutationId)
);