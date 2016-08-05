package myapp;
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;
import javax.swing.JOptionPane;
import java.net.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
/**
 *
 * @author santhosh
 */
public class logview extends HttpServlet {
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    RequestDispatcher rd=null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }
/**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   // @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {
        PrintWriter out = response.getWriter();
        String g=null;
 try 
{
       HttpSession ses=null;
         String ALGO = "AES";
         // String keyValue="TheBestSecretKey";
       String keyValue=request.getParameter("key");
      if(keyValue.isEmpty()) 
{
      rd=request.getRequestDispatcher("failure.jsp");
        }
else
 {
            /*  File ff=new File("C:/temp/"+ia.getHostName()+".jar");
            FileReader fr=new FileReader(ff);
            BufferedReader br=new BufferedReader(fr);
               g=br.readLine();
            Key key1 = new SecretKeySpec(keyValue.getBytes(), ALGO);
            //Key key1 = generateKey();
         Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key1);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(g);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
            */
 InetAddress ia=InetAddress.getLocalHost();
      //  String keyValue=request.getParameter("key");
      // BufferedReader fr=new BufferedReader(new FileReader(new File("C:/temp/"+ia.getHostName()+".jar")));
        BufferedReader fr=new BufferedReader(new FileReader(new File("C:/1.txt")));
                String str=fr.readLine();
         //System.out.println(logview.decrypt(str));
          ses.setAttribute("file",logview.decrypt(str));
                rd=request.getRequestDispatcher("logview.jsp");
              }
	        rd.forward(request,response);
     }
        catch(Exception e2)
         {
            System.out.println("Exception : "+e2.toString());
        }
    }
  private static final String ALGO = "AES";
     // static final byte[] keyValue =      new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't','S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };
   //static String keyValue="TheBestSecretKey";
    public static String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }
     static  Key generateKey() throws Exception {
        HttpServletRequest request=null;
        String keyValue=request.getParameter("key").toString();
        Key key = new SecretKeySpec(keyValue.getBytes(), ALGO);
        return key;
} 
  //}
       // catch(Exception e)
   // {}
}