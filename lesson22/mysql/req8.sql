use itclassdb_sql;

select code, speed, hd from pc where cd in('12x', '24x') and price < 600;