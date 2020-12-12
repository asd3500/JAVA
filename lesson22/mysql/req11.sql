use itclassdb_sql;

select maker from product as p
where type='PC' and not exists (select * from product where maker = p.maker and type='Laptop')
group by maker;
