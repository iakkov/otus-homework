CREATE DATABASE test_db;

CREATE TABLE tests (
                       test_id SERIAL PRIMARY KEY,
                       test_name VARCHAR(255) NOT NULL
);

CREATE TABLE questions (
                           question_id SERIAL PRIMARY KEY,
                           test_id INT REFERENCES tests(test_id),
                           question_text TEXT NOT NULL
);

CREATE TABLE answers (
                         answer_id SERIAL PRIMARY KEY,
                         question_id INT REFERENCES questions(question_id),
                         answer_text TEXT NOT NULL,
                         is_correct BOOLEAN NOT NULL
);

INSERT INTO tests (test_name) VALUES ('Тест по программированию');

INSERT INTO questions (test_id, question_text) VALUES
                                                   (1, 'Какой язык программирования используется для разработки Android?'),
                                                   (1, 'Что такое ООП?');

INSERT INTO answers (question_id, answer_text, is_correct) VALUES
                                                               (1, 'Java', TRUE),
                                                               (1, 'Python', FALSE),
                                                               (1, 'C++', FALSE),
                                                               (1, 'JavaScript', FALSE),
                                                               (2, 'Объектно-ориентированное программирование', TRUE),
                                                               (2, 'Операционная система', FALSE),
                                                               (2, 'Объектно-оптимизированное программирование', FALSE);