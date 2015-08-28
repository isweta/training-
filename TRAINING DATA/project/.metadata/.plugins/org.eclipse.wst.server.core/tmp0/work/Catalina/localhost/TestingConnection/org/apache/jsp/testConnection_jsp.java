package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class testConnection_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script>\r\n");
      out.write("function createLine()\r\n");
      out.write("{\r\n");
      out.write("\r\n");
      out.write("    geocoder = new google.maps.Geocoder();\r\n");
      out.write("    var latlng = new google.maps.LatLng(7.5653, 80.4303);\r\n");
      out.write("    var mapOptions = {\r\n");
      out.write("        zoom: 8,\r\n");
      out.write("        center: latlng,\r\n");
      out.write("        mapTypeId: google.maps.MapTypeId.ROADMAP\r\n");
      out.write("    }\r\n");
      out.write("    map = new google.maps.Map(document.getElementById(\"directionpanel\"), mapOptions);\r\n");
      out.write("\r\n");
      out.write("    var address = document.getElementById('startvalue').value;\r\n");
      out.write("    var address2 = document.getElementById('endvalue').value;\r\n");
      out.write("\r\n");
      out.write("    var temp, temp2;\r\n");
      out.write("\r\n");
      out.write("    geocoder.geocode({ 'address': address }, function (results, status) {\r\n");
      out.write("        temp = results[0].geometry.location;\r\n");
      out.write("        geocoder.geocode({ 'address': address2 }, function (results, status) {\r\n");
      out.write("            temp2 = results[0].geometry.location;\r\n");
      out.write("\r\n");
      out.write("        var route = [\r\n");
      out.write("          temp,\r\n");
      out.write("          temp2\r\n");
      out.write("        ];\r\n");
      out.write("\r\n");
      out.write("        var polyline = new google.maps.Polyline({\r\n");
      out.write("            path: route,\r\n");
      out.write("            strokeColor: \"#ff0000\",\r\n");
      out.write("            strokeOpacity: 0.6,\r\n");
      out.write("            strokeWeight: 5\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        polyline.setMap(map);\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<a href='javascript:createLine()'>try!</a>\r\n");
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
