use itclassdb_sql;

select maker, speed from product as p 
join pc on pc.model = p.model and pc.hd >= 10;
