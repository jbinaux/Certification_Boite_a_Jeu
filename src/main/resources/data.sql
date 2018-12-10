Insert into user (admin, username)
values
(false, 'truc'),
(false, 'machin'),
(true, 'chouette');

Insert into login (email, password, user_id)
values
('truc@gmail.com', '1234', 1),
('machin@hotmail.fr', '5678', 2),
('chouette@yahoo.fr', 'abcd', 3);

Insert into boardgame (age, author, date_edition, editor, name, nb_player, play_time, rating)
values
('24-99', 'Catherine', '1994-05-16', 'Machin', "jonasz l\'ananas", '2-10', '2h', 0),
('10-80', 'Machin', '2010-01-01', 'Bidule', 'splendor', '1', '1h', 0),
('8', 'Chouette', '2011-01-01', 'Chose', '7 wonders', '4', '30mn', 0),
('10-80', 'Machin', '2010-01-01', 'Bidule', 'splendor', '1', '1h', 0);

Insert into review (rating, text, title, boardgame_id, user_id)
values
(2,'lolilol','lolilol',1,1),
(3,'kjhej','uiqwuid',1,2),
(3,'kjhej','uiqwuid',1,3),
(3,'meilleur jeu du monde, et de loin !','enorme !',3,1),
(4,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua','chouette',3,2),
(5,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua','parfait',3,3),
(4,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua','bloup',3,1);