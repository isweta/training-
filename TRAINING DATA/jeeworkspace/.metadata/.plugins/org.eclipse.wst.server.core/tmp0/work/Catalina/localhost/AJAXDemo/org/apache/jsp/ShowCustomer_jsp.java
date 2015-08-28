package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ShowCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("function showCustomer(str)\r\n");
      out.write("{\r\n");
      out.write("var xmlhttp;    \r\n");
      out.write("if (str==\"\")\r\n");
      out.write("  {\r\n");
      out.write("  document.getElementById(\"txtHint\").innerHTML=\"\";\r\n");
      out.write("  return;\r\n");
      out.write("  }\r\n");
      out.write("if (window.XMLHttpRequest)\r\n");
      out.write("  {// code for IE7+, Firefox, Chrome, Opera, Safari\r\n");
      out.write("  xmlhttp=new XMLHttpRequest();\r\n");
      out.write("  }\r\n");
      out.write("else\r\n");
      out.write("  {// code for IE6, IE5\r\n");
      out.write("  xmlhttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("  }\r\n");
      out.write("xmlhttp.onreadystatechange=function()\r\n");
      out.write("  {\r\n");
      out.write("  if (xmlhttp.readyState==4 && xmlhttp.status==200)\r\n");
      out.write("    {\r\n");
      out.write("    document.getElementById(\"txtHint\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("xmlhttp.open(\"GET\",\"getcustomer.jsp?nm=\"+str,true);\r\n");
      out.write("xmlhttp.send();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- <form action=\"\"> \r\n");
      out.write("<select name=\"customers\" onchange=\"showCustomer(this.value)\">\r\n");
      out.write("<option value=\"\">Select a customer:</option>\r\n");
      out.write("<option value=\"Peter\">peter</option>\r\n");
      out.write("<option value=\"BLAKE\">BLAKE</option>\r\n");
      out.write("<option value=\"MILLER\">MILLER</option>\r\n");
      out.write("<option value=\"TURNER\">TURNER</option>\r\n");
      out.write("</select> \r\n");
      out.write("\r\n");
      out.write("<div id=\"txtHint\">Customer info will be listed here...</div>\r\n");
      out.write("</form>\r\n");
      out.write(" -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" First Name: <input type=\"text\" id=\"txt1\" name=\"customers\" onkeyup=\"showCustomer(this.value)\"> <br/><br/>\r\n");
      out.write(" <div id=\"txtHint\">Customer info will be listed here...</div>\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
