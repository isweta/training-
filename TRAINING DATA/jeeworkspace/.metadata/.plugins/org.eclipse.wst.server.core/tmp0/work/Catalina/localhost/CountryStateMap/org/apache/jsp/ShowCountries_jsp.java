package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;

public final class ShowCountries_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\tfunction getStates(cname){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t/* alert(\"Fetching states\"); */\r\n");
      out.write("\t\t\tvar xmlHttp;\r\n");
      out.write("\t\t\tif(cname==\"\")\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"res\").innerHTML=\"\";\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tif(window.XMLHttpRequest){\r\n");
      out.write("\t\t\t\txmlHttp=new XMLHttpRequest();\r\n");
      out.write("\t\t\t/* \talert(\"Created RequestObject\"); */\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\txmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\txmlHttp.onreadystatechange=function(){\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(xmlHttp.readyState==4 && xmlHttp.status==200){\r\n");
      out.write("\t\t\t\t\t/* alert(\"Changing Response\"); */\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"res\").innerHTML=xmlHttp.responseText;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\txmlHttp.open(\"GET\", \"GetStatesServlet?cname=\"+cname, true);\r\n");
      out.write("\t\t\t/* alert(\"Opened RequestObject\"); */\r\n");
      out.write("\t\t\txmlHttp.send();\r\n");
      out.write("\t\t\t/* alert(\"Sent RequestObject\"); */\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<form action=\"\">\r\n");
      out.write("\t\t\t<select name=\"country\" onchange=\"getStates(this.value)\">\r\n");
      out.write("\t\t\t\t<option value=\"\">Choose Country</option>\r\n");
      out.write("\t\t\t\t<option value=\"India\">India</option>\r\n");
      out.write("\t\t\t\t<option value=\"England\">England</option>\r\n");
      out.write("\t\t\t\t<option value=\"USA\">USA</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t<div id=\"res\">\r\n");
      out.write("\t\t</div>\r\n");
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
