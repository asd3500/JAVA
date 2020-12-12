use itclassdb_sql;

insert into product (maker, model, type)
values
('HP', '1220m', 'Printer'),
('HP', '1230m', 'Printer'),
('HP', '1240j', 'Printer'),
('HP', '1250j', 'Printer'),
('Canon', '133l', 'Printer'),
('Canon', '134l', 'Printer'),
('HP', 'w25', 'Laptop'),
('HP', 'w30', 'Laptop'),
('HP', 'w40', 'Laptop'),
('Samsung', 'x125', 'Laptop'),
('Samsung', 'x225', 'Laptop'),
('Samsung', 'x500', 'Laptop'),
('Samsung', 's800', 'PC'),
('Samsung', 's1200', 'PC'),
('Samsung', 'sx800', 'PC'),
('Asus', 'a100b', 'PC'),
('Asus', 'a200b', 'PC'),
('Asus', 'v105b', 'PC');


insert into printer (model, color, type, price)
values
('1220m', 'n', 'Matrix', 70),
('1230m', 'n', 'Matrix', 90),
('1240j', 'y', 'Jet', 350),
('1250j', 'y', 'Jet', 370),
('133l', 'n', 'Laser', 570),
('134l', 'n', 'Laser', 600);
	

insert into laptop (model, speed, ram, hd, price, screen)
values
('w25', 1200, 1024, 120, 400, 14),
('w30', 1300, 2048, 140, 470, 14),
('w40', 1500, 4196, 200, 670, 15),
('x125', 1400, 4196, 200, 870, 15),
('x225', 1600, 4196, 200, 1100, 15),
('x500', 1800, 4196, 300, 1750, 15);


insert into pc (model, speed, ram, hd, cd, price)
values
('s800', 700, 512, 9, '12x', 100),
('s1200', 2200, 2048, 300, '24x', 460),
('sx800', 2500, 4196, 300, '24x', 760),
('a100b', 2500, 4196, 300, '32x', 760),
('a200b', 2600, 4196, 300, '32x', 860),
('v105b', 2700, 8392, 300, '32x', 960);