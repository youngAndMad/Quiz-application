INSERT INTO Quiz (level) VALUES ('EASY');
INSERT INTO Quiz (level) VALUES ('MEDIUM');
INSERT INTO Quiz (level) VALUES ('HARD');

INSERT INTO Question (question, quiz_id) VALUES ('What is the capital of France?', 1);
INSERT INTO Question (question, quiz_id) VALUES ('Who painted the Mona Lisa?', 1);
INSERT INTO Question (question, quiz_id) VALUES ('What is the square root of 25?', 1);
INSERT INTO Question (question, quiz_id) VALUES ('What is the largest planet in our solar system?', 1);
INSERT INTO Question (question, quiz_id) VALUES ('What is the chemical symbol for gold?', 1);
INSERT INTO Question (question, quiz_id) VALUES ('Who wrote the play "Romeo and Juliet"?', 1);
INSERT INTO Question (question, quiz_id) VALUES ('What is the national bird of the United States?', 1);
INSERT INTO Question (question, quiz_id) VALUES ('Which country is known as the "Land of the Rising Sun"?', 1);
INSERT INTO Question (question, quiz_id) VALUES ('What is the tallest mountain in the world?', 1);
INSERT INTO Question (question, quiz_id) VALUES ('What is the formula for calculating the area of a circle?', 1);

INSERT INTO Question (question, quiz_id) VALUES ('Who discovered the theory of relativity?', 2);
INSERT INTO Question (question, quiz_id) VALUES ('Which planet is known as the "Red Planet"?', 2);
INSERT INTO Question (question, quiz_id) VALUES ('What is the largest ocean on Earth?', 2);
INSERT INTO Question (question, quiz_id) VALUES ('Who is the author of the Harry Potter book series?', 2);
INSERT INTO Question (question, quiz_id) VALUES ('What is the primary language spoken in Brazil?', 2);
INSERT INTO Question (question, quiz_id) VALUES ('Who painted the ceiling of the Sistine Chapel?', 2);
INSERT INTO Question (question, quiz_id) VALUES ('What is the chemical formula for water?', 2);
INSERT INTO Question (question, quiz_id) VALUES ('Which instrument measures earthquakes?', 2);
INSERT INTO Question (question, quiz_id) VALUES ('Who wrote the novel "To Kill a Mockingbird"?', 2);
INSERT INTO Question (question, quiz_id) VALUES ('What is the largest desert in the world?', 2);

INSERT INTO Question (question, quiz_id) VALUES ('Who developed the theory of evolution?', 3);
INSERT INTO Question (question, quiz_id) VALUES ('What is the capital of Australia?', 3);
INSERT INTO Question (question, quiz_id) VALUES ('What is the chemical symbol for silver?', 3);
INSERT INTO Question (question, quiz_id) VALUES ('What is the largest continent by land area?', 3);
INSERT INTO Question (question, quiz_id) VALUES ('Who is the artist behind the painting "The Persistence of Memory"?', 3);
INSERT INTO Question (question, quiz_id) VALUES ('What is the main component of Earth''s atmosphere?', 3);
INSERT INTO Question (question, quiz_id) VALUES ('What is the highest-grossing film of all time?', 3);
INSERT INTO Question (question, quiz_id) VALUES ('What is the boiling point of water in degrees Celsius?', 3);
INSERT INTO Question (question, quiz_id) VALUES ('Who is the author of the novel "1984"?', 3);
INSERT INTO Question (question, quiz_id) VALUES ('What is the world''s largest coral reef system?', 3);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Paris', true, 1);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Rome', false, 1);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Madrid', false, 1);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Leonardo da Vinci', true, 2);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Pablo Picasso', false, 2);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Vincent van Gogh', false, 2);

INSERT INTO Answer (answer, correct, question_id) VALUES ('5', true, 3);
INSERT INTO Answer (answer, correct, question_id) VALUES ('6', false, 3);
INSERT INTO Answer (answer, correct, question_id) VALUES ('4', false, 3);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Jupiter', true, 4);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Mars', false, 4);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Saturn', false, 4);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Au', true, 5);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Ag', false, 5);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Cu', false, 5);

INSERT INTO Answer (answer, correct, question_id) VALUES ('William Shakespeare', true, 6);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Arthur Miller', false, 6);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Anton Chekhov', false, 6);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Bald Eagle', true, 7);
INSERT INTO Answer (answer, correct, question_id) VALUES ('American Sparrow', false, 7);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Red-tailed Hawk', false, 7);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Japan', true, 8);
INSERT INTO Answer (answer, correct, question_id) VALUES ('China', false, 8);
INSERT INTO Answer (answer, correct, question_id) VALUES ('India', false, 8);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Mount Everest', true, 9);
INSERT INTO Answer (answer, correct, question_id) VALUES ('K2', false, 9);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Makalu', false, 9);

INSERT INTO Answer (answer, correct, question_id) VALUES ('π * r^2', true, 10);
INSERT INTO Answer (answer, correct, question_id) VALUES ('2 * π * r', false, 10);
INSERT INTO Answer (answer, correct, question_id) VALUES ('4 * π * r^2', false, 10);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Albert Einstein', true, 11);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Isaac Newton', false, 11);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Galileo Galilei', false, 11);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Mars', true, 12);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Venus', false, 12);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Mercury', false, 12);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Pacific Ocean', true, 13);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Atlantic Ocean', false, 13);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Indian Ocean', false, 13);

INSERT INTO Answer (answer, correct, question_id) VALUES ('J.K. Rowling', true, 14);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Stephen King', false, 14);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Dan Brown', false, 14);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Portuguese', true, 15);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Spanish', false, 15);
INSERT INTO Answer (answer, correct, question_id) VALUES ('French', false, 15);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Michelangelo', true, 16);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Leonardo da Vinci', false, 16);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Raphael', false, 16);

INSERT INTO Answer (answer, correct, question_id) VALUES ('H2O', true, 17);
INSERT INTO Answer (answer, correct, question_id) VALUES ('CO2', false, 17);
INSERT INTO Answer (answer, correct, question_id) VALUES ('NaCl', false, 17);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Seismograph', true, 18);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Barometer', false, 18);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Thermometer', false, 18);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Harper Lee', true, 19);
INSERT INTO Answer (answer, correct, question_id) VALUES ('John Steinbeck', false, 19);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Mark Twain', false, 19);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Sahara Desert', true, 20);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Gobi Desert', false, 20);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Atacama Desert', false, 20);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Charles Darwin', true, 21);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Isaac Newton', false, 21);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Gregor Mendel', false, 21);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Canberra', true, 22);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Sydney', false, 22);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Melbourne', false, 22);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Ag', true, 23);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Au', false, 23);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Cu', false, 23);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Asia', true, 24);
INSERT INTO Answer (answer, correct, question_id) VALUES ('North America', false, 24);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Africa', false, 24);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Salvador Dali', true, 25);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Pablo Picasso', false, 25);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Vincent van Gogh', false, 25);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Nitrogen', true, 26);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Oxygen', false, 26);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Carbon dioxide', false, 26);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Avatar', true, 27);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Avengers: Endgame', false, 27);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Titanic', false, 27);

INSERT INTO Answer (answer, correct, question_id) VALUES ('100', true, 28);
INSERT INTO Answer (answer, correct, question_id) VALUES ('212', false, 28);
INSERT INTO Answer (answer, correct, question_id) VALUES ('32', false, 28);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Cristiano Ronaldo', true, 29);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Lionel Messi', false, 29);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Neymar', false, 29);

INSERT INTO Answer (answer, correct, question_id) VALUES ('Great Barrier Reef', true, 30);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Maldives', false, 30);
INSERT INTO Answer (answer, correct, question_id) VALUES ('Hawaiian Islands', false, 30);
