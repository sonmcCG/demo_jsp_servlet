import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        ArrayList<Customer> customers = getCustomers();
        request.setAttribute("customers", customers);
        String action = "";
        RequestDispatcher cuc = null;
        switch (action){
            case "login":
                cuc = request.getRequestDispatcher("list.jsp");
                break;
            case "Create":
                 cuc = request.getRequestDispatcher("list.jsp");
                break;
            case "UpDate":
                cuc = request.getRequestDispatcher("list.jsp");
                break;
            case "Delete":

                break;
        }
        cuc = request.getRequestDispatcher("list.jsp");
        cuc.forward(request, response);
    }

    public ArrayList<Customer> getCustomers() {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1, "sonmc", "Phú Thọ"));
        customers.add(new Customer(2, "Cúc", "việt Trì"));
        customers.add(new Customer(3, "Hải Mario", "Bắc cạn"));
        return customers;
    }
}
