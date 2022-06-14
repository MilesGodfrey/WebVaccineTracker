package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newPatient_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   <meta charset=\"utf-8\">\n");
      out.write("   <link rel=\"stylesheet\" href=\"styles.css\">\n");
      out.write("   <title>Missouri COVID-19 Vaccination Tracker</title> \n");
      out.write("</head>\n");
      out.write("<body>  \n");
      out.write("<div id=\"wrapper\">  \n");
      out.write("<header>  \n");
      out.write("\t<h1>Missouri COVID-19 Vaccination Tracker</h1>  \n");
      out.write("</header>\n");
      out.write("<main>\n");
      out.write("\t<h2>New Patient</h2>\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("<form action=\"newPatient\" method=\"post\"> \n");
      out.write("\t\n");
      out.write("<label for=\"patientID\">Patient ID #: </label>\n");
      out.write("<input type=\"text\" autocomplete=\"off\" name=\"patientID\" id=\"patientID\" required><br><br>\n");
      out.write("\n");
      out.write("<label for=\"firstName\">First Name: </label>\n");
      out.write("<input type=\"text\" autocomplete=\"off\" name=\"firstName\" id=\"firstName\" required><br><br>\n");
      out.write("\n");
      out.write("<label for=\"middleName\">Middle Name: </label>\n");
      out.write("<input type=\"text\" autocomplete=\"off\" name=\"middleName\" id=\"middleName\" required><br><br>\n");
      out.write("\n");
      out.write("<label for=\"lastName\">Last Name: </label>\n");
      out.write("<input type=\"text\" autocomplete=\"off\" name=\"lastName\" id=\"lastName\" required><br><br>\n");
      out.write("\n");
      out.write("<label for=\"DOB\">DOB: </label>                   \n");
      out.write("<input type=\"text\" placeholder=\"yyyy-mm-dd\" autocomplete=\"off\" name=\"DOB\" id=\"DOB\" required><br><br>\n");
      out.write("\n");
      out.write("<label for=\"sex\">Sex: </label>\n");
      out.write("<select name=\"sex\" id=\"sex\">\n");
      out.write("    <option value=\"\"></option>\n");
      out.write("    <option value=\"Male\">Male</option>\n");
      out.write("    <option value=\"Female\">Female</option>\n");
      out.write("    <option value=\"Other\">Other</option>\n");
      out.write("</select><br><br>\n");
      out.write("\n");
      out.write("<label for=\"race\">Race: </label>\n");
      out.write("<select name=\"race\" id=\"race\">\n");
      out.write("    <option value=\"\"></option>\n");
      out.write("    <option value=\"Asian\">Asian</option>\n");
      out.write("    <option value=\"Black\">Black</option>\n");
      out.write("    <option value=\"White\">White</option>\n");
      out.write("    <option value=\"Latino\">Latino</option>\n");
      out.write("    <option value=\"Native American\">Native American</option>\n");
      out.write("    <option value=\"Pacific Islander\">Pacific Islander</option>\n");
      out.write("</select>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<label for=\"facility\">Facility: </label>\n");
      out.write("<select name=\"facility\" id=\"facility\">\n");
      out.write("    <option value=\"\"></option>\n");
      out.write("    <option value=\"1\">1</option>\n");
      out.write("    <option value=\"2\">2</option>\n");
      out.write("    <option value=\"3\">3</option>\n");
      out.write("    <option value=\"4\">4</option>\n");
      out.write("</select>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<label for=\"city\">City: </label>                  \n");
      out.write("<input type=\"text\" autocomplete=\"off\" name=\"city\" id=\"city\" required><br><br>\n");
      out.write("\n");
      out.write("<label for=\"state\">State: </label>                  \n");
      out.write("<input type=\"text\" autocomplete=\"off\" name=\"state\" id=\"state\" value=\"MO\" size=\"10\"><br><br>\n");
      out.write("\n");
      out.write("<label for=\"email\">Email: </label>                   \n");
      out.write("<input type=\"text\" autocomplete=\"off\" name=\"email\" id=\"email\" size=\"30\" required><br><br>\n");
      out.write("\n");
      out.write("<label for=\"phone\">Phone #: </label>\n");
      out.write("<input placeholder=\"xxx-xxx-xxxx\" type=\"text\" autocomplete=\"off\" name=\"phone\" id=\"phone\" required><br><br>\n");
      out.write("\n");
      out.write("<label for=\"vaccine\">Vaccine: </label>\n");
      out.write("<select name=\"vaccine\" id=\"vaccine\">\n");
      out.write("    <option value=\"\"></option>\n");
      out.write("    <option value=\"Pfizer\">Pfizer</option>\n");
      out.write("    <option value=\"Moderna\">Moderna</option>\n");
      out.write("</select><br><br>\n");
      out.write("  \n");
      out.write("<label for=\"vaccineadminsite\">Vaccine Administration Site (on body):</label><br>\n");
      out.write("<select name=\"vaccineadminsite\" id=\"vaccineadminsite\">\n");
      out.write("    <option value=\"\"></option>\n");
      out.write("    <option value=\"Left Arm\">Left Arm</option>\n");
      out.write("    <option value=\"Right Arm\">Right Arm</option>\n");
      out.write("</select><br><br>\n");
      out.write("\n");
      out.write("<label for=\"dose\">Dose:</label>\n");
      out.write("<select name=\"dose\" id=\"dose\">\n");
      out.write("    <option value=\"\"></option>\n");
      out.write("    <option value=\"1\">Dose 1</option>\n");
      out.write("    <option value=\"2\">Dose 2</option>\n");
      out.write("</select><br><br>\n");
      out.write("\n");
      out.write("<label for=\"admindate\">Administration Date: </label>                  \n");
      out.write("<input placeholder=\"yyyy-mm-dd\" type=\"text\" autocomplete=\"off\" name=\"admindate\" \n");
      out.write("       id=\"admindate\" required><br><br>\n");
      out.write("\n");
      out.write("<label for=\"adversereact\">Adverse Reaction:</label>\n");
      out.write("<select name=\"adversereact\" id=\"adversereact\">\n");
      out.write("    <option value=\"\"></option>\n");
      out.write("    <option value=\"Yes\">Yes</option>\n");
      out.write("    <option value=\"No\">No</option>\n");
      out.write("</select><br><br>\n");
      out.write("<input class=\"button\" type=\"submit\" value=\"Submit\" id=\"submit\"><br><br>\n");
      out.write("</form>\n");
      out.write("<nav>\n");
      out.write("  <a href=\"next1.jsp\" class=\"button\">Back</a>\n");
      out.write("  <a href=\"index.jsp\" class=\"button\">Log Out</a>\n");
      out.write("  <a href=\"https://vaers.hhs.gov/reportevent.html\" target=\"blank\" class=\"button\">VAERS</a>\n");
      out.write("</nav><br>\n");
      out.write("</main>\n");
      out.write("<footer>\n");
      out.write("   <img style=\"text-align: center; max-width: 150px\" src=\"images/MO.gif\" alt=\"Missouri\">\n");
      out.write("   <p>&copy; 2021 The A-Team</p>\n");
      out.write("<br>  \n");
      out.write("</footer> \n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
