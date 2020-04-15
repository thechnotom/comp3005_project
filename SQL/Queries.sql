select book.name, book.price, author.name
from book, author, written_by
where book.name = '1984' and written_by.ISBN = book.ISBN and written_by.author_ID = author.author_ID