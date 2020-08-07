DROP TABLE IF EXISTS  book;
CREATE TABLE book (
    book_id   INTEGER      NOT NULL AUTO_INCREMENT,
    title VARCHAR(128) NOT NULL,
    publisher_id INTEGER,
    author_id INTEGER,
    PRIMARY KEY (book_id)
);

DROP TABLE IF EXISTS  publisher;
CREATE TABLE publisher (
    publisher_id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT  NULL,
    PRIMARY KEY (publisher_id)
);

DROP TABLE IF EXISTS  author;
CREATE TABLE author (
    author_id INTEGER NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT  NULL,
    PRIMARY KEY (author_id)
);