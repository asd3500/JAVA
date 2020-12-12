use itclassdb_sql;

/*select maker, pr.model, price from printer as pr
join product as p on p.model=pr.model
where price=(select max(price) from printer as sub where p.maker=(select maker from product where model=sub.model));
*/

select product.maker, printer.model, MAX(printer.price) from printer
join product on product.model = printer.model
group by product.maker






