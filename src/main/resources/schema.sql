CREATE TABLE IF NOT EXISTS circles(
    id INT(100) DEFAULT 0 NOT NULL AUTO_INCREMENT,
    clubName VARCHAR (50),
    description VARCHAR (50),
    PRIMARY KEY(id)
    );

CREATE TABLE IF NOT EXISTS articles(
--     FIXME:idのint(100)を可変に可能か調べる。
    id INT(100) DEFAULT 0 NOT NULL AUTO_INCREMENT,
    circle_id INT,
    title VARCHAR (100),
    body VARCHAR (1000),
    CONSTRAINT fk_circle_id FOREIGN KEY (circle_id) REFERENCES circles(id),
    PRIMARY KEY(id)
    );