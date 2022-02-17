
begin transaction;

--exemplo de select
select count(id) from pessoa;

--exemplo de if
if quantidade > 4 then
rollback to inserindo_jojo;

end if;

commit;
end;