INSERT INTO member (membername, memberbirthdate, memberaddress) VALUES ('Wawan Setiawan', '1990-01-10', 'Kompleks Asia Serasi No 100');
INSERT INTO member (membername, memberbirthdate, memberaddress) VALUES ('Teguh Sudibyantoro', '1991-02-10', 'Jalan Pemekaran No 99');
INSERT INTO member (membername, memberbirthdate, memberaddress) VALUES ('Joko Widodo', '1992-03-10', 'Dusun Pisang Rt 10 Rw 20');

INSERT INTO transactiontype (transactionname) VALUES ('Simpan');
INSERT INTO transactiontype (transactionname) VALUES ('Pinjam');

INSERT INTO mutation (date, transactiontypeid, memberid, nominal) VALUES ('2020-08-17', 1, 1, 1000000);
INSERT INTO mutation (date, transactiontypeid, memberid, nominal) VALUES ('2020-08-18', 1, 2, 5000000);
INSERT INTO mutation (date, transactiontypeid, memberid, nominal) VALUES ('2020-09-30', 2, 3, 2000000);
INSERT INTO mutation (date, transactiontypeid, memberid, nominal) VALUES ('2020-11-10', 1, 3, 1000000);
INSERT INTO mutation (date, transactiontypeid, memberid, nominal) VALUES ('2020-12-01', 1, 1, 5000000);
INSERT INTO mutation (date, transactiontypeid, memberid, nominal) VALUES ('2020-09-30', 2, 2, 2000000);