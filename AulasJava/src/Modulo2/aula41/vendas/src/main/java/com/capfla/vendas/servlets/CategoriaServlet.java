package aula41.vendas.src.java.com.capfla.vendas.servlets;

import com.capfla.vendas.models.Categoria;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/categoria")
public class CategoriaServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Categoria cat1 = new Categoria();

        cat1.setNome(req.getParameter("nome"));
        cat1.setDescricao(req.getParameter("descricao"));

        PrintWriter out = resp.getWriter();
        out.printf("Modulo Categoria -- CategoriaModel = %s - %s", cat1.getNome(), cat1.getDescricao());

    }
}
