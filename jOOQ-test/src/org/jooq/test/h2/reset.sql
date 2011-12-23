DELETE FROM t_658_ref/
DELETE FROM t_658_11/
DELETE FROM t_658_21/
DELETE FROM t_658_31/
DELETE FROM t_658_12/
DELETE FROM t_658_22/
DELETE FROM t_658_32/
DELETE FROM t_arrays/
DELETE FROM t_book_to_book_store/
DELETE FROM t_book_store/
DELETE FROM t_book/
DELETE FROM t_author/
DELETE FROM t_language/
DELETE FROM t_booleans/
DELETE FROM t_identity/
DELETE FROM t_identity_pk/

DROP SEQUENCE IF EXISTS s_author_id;/
CREATE SEQUENCE s_author_id START WITH 1;/

INSERT INTO t_language (id, cd, description, description_english) VALUES (1, 'en', 'English', 'English')/
INSERT INTO t_language (id, cd, description, description_english) VALUES (2, 'de', 'Deutsch', 'German')/
INSERT INTO t_language (id, cd, description, description_english) VALUES (3, 'fr', 'Français', 'French')/
INSERT INTO t_language (id, cd, description, description_english) VALUES (4, 'pt', null, null)/
/

INSERT INTO t_658_11 VALUES ('A'), ('B'), ('C')/
INSERT INTO t_658_21 VALUES (1), (2), (3)/
INSERT INTO t_658_31 VALUES (1), (2), (3)/
INSERT INTO t_658_12 VALUES ('A', 'A'), ('B', 'B'), ('C', 'C')/
INSERT INTO t_658_22 VALUES (1, 1), (2, 2), (3, 3)/
INSERT INTO t_658_32 VALUES (1, 1), (2, 2), (3, 3)/
INSERT INTO t_658_ref VALUES ('A', 1, 1, 'B', 2, 2)/

INSERT INTO t_author VALUES (next value for s_author_id, 'George', 'Orwell', '1903-06-25', 1903, null);
/
INSERT INTO t_author VALUES (next value for s_author_id, 'Paulo', 'Coelho', '1947-08-24', 1947, null);
/

INSERT INTO t_book VALUES (1, 1, null, null, '1984', 1948, 1, 'To know and not to know, to be conscious of complete truthfulness while telling carefully constructed lies, to hold simultaneously two opinions which cancelled out, knowing them to be contradictory and believing in both of them, to use logic against logic, to repudiate morality while laying claim to it, to believe that democracy was impossible and that the Party was the guardian of democracy, to forget, whatever it was necessary to forget, then to draw it back into memory again at the moment when it was needed, and then promptly to forget it again, and above all, to apply the same process to the process itself -- that was the ultimate subtlety; consciously to induce unconsciousness, and then, once again, to become unconscious of the act of hypnosis you had just performed. Even to understand the word ''doublethink'' involved the use of doublethink..', null);
/
INSERT INTO t_book VALUES (2, 1, null, null, 'Animal Farm', 1945, 1, null, null);
/
INSERT INTO t_book VALUES (3, 2, null, null, 'O Alquimista', 1988, 4, null, null);
/
INSERT INTO t_book VALUES (4, 2, null, null, 'Brida', 1990, 2, null, null);
/

INSERT INTO t_book_store (name) VALUES 
	('Orell Füssli'),
	('Ex Libris'),
	('Buchhandlung im Volkshaus')
/

INSERT INTO t_book_to_book_store VALUES 
	('Orell Füssli', 1, 10),
	('Orell Füssli', 2, 10),
	('Orell Füssli', 3, 10),
	('Ex Libris', 1, 1),
	('Ex Libris', 3, 2),
	('Buchhandlung im Volkshaus', 3, 1)
/

INSERT INTO t_arrays VALUES (1, null, null, null)
/
INSERT INTO t_arrays VALUES (2, (), (), ())
/
INSERT INTO t_arrays VALUES (3, ('a'), (1), ('1981-07-10'))
/
INSERT INTO t_arrays VALUES (4, ('a', 'b'), (1, 2), ('1981-07-10', '2000-01-01'))
/