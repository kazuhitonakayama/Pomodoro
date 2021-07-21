CREATE TABLE IF NOT EXISTS circles(
    id INT(100) DEFAULT 0 NOT NULL AUTO_INCREMENT,
    circleName VARCHAR (50),
    description VARCHAR (1000),
    isActive BIT DEFAULT 1,
    PRIMARY KEY(id)
    );

CREATE TABLE IF NOT EXISTS articles(
    --     FIXME:circle_idなのか、circleIdなのか（表記の揺れ）
    id INT(100) DEFAULT 0 NOT NULL AUTO_INCREMENT,
    circle_id INT,
    title VARCHAR (100),
    body VARCHAR (1000),
    CONSTRAINT fk_circle_id FOREIGN KEY (circle_id) REFERENCES circles(id),
    PRIMARY KEY(id)
    );

/* ユーザーマスタ */
CREATE TABLE IF NOT EXISTS users (
    id  INT(100) DEFAULT 0 NOT NULL AUTO_INCREMENT,
    userId VARCHAR(50) PRIMARY KEY,
    password VARCHAR(100),
    userName VARCHAR(50),
    birthday DATE,
    age INT,
    gender INT,
    role VARCHAR(50)
    );