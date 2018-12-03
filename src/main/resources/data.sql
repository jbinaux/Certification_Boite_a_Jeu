Insert into user (admin, email, password, username)
values
(false, 'truc@gmail.com', '1234', 'truc'),
(false, 'machin@hotmail.fr', '5678', 'machin'),
(true, 'chouette@yahoo.fr', 'abcd', 'chouette');

Insert into boardgame (age, date_edition, name, nb_player, play_time, rating)
values
('24-99', '1994-05-16', "jonasz l\'ananas", '2-10', '2h', 0),
('10-80', '2010-01-01', 'splendor', '1', '1h', 0),
('8', '2011-01-01', '7 wonders', '4', '30mn', 0);

Insert into review (rating, text, title, boardgame_id, user_id)
values
(2,'lolilol','lolilol',1,1),
(3,'kjhej','uiqwuid',1,2),
(3,'kjhej','uiqwuid',1,3),
(3,'meilleur jeu du monde, et de loin !','enorme !',3,1),
(4,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua','chouette',3,2),
(5,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua','parfait',3,3),
(4,'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua','bloup',3,1);