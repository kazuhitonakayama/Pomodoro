CREATE TABLE IF NOT EXISTS article(
--     FIXME:idのint(100)を可変に可能か調べる。
    id INT(100) DEFAULT 0 NOT NULL AUTO_INCREMENT,
    clubName VARCHAR (50),
    title VARCHAR (100),
    body VARCHAR (1000)
    );