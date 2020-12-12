use itclassdb_sql;

select code, price from printer
	where model in (select model from product where maker='HP')
union all select code, price from pc
	where model in (select model from product where maker='HP')
union all select code, price from laptop
	where model in (select model from product where maker='HP')



