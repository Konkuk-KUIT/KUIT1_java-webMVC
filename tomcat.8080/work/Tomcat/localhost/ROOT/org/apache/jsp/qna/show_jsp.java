/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.42
 * Generated at: 2023-05-03 08:59:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.qna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class show_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>KUIT</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"/css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-dark bg-dark\" aria-label=\"Fourth navbar example\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"/\"> KUIT </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarsExample04\" aria-controls=\"navbarsExample04\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("  \r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarsExample04\">\r\n");
      out.write("          <ul class=\"navbar-nav me-auto mb-2 mb-md-0\">\r\n");
      out.write("            <li class=\"nav-item dropdown\">\r\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"dropdown04\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Home</a>\r\n");
      out.write("              <ul class=\"dropdown-menu\" aria-labelledby=\"dropdown04\">\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\r\n");
      out.write("                <li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <form>\r\n");
      out.write("            <input class=\"form-control\" type=\"text\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"navbar-default\">\r\n");
      out.write("        <header class=\"d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom\">\r\n");
      out.write("            <a href=\"/\" class=\"d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none\">\r\n");
      out.write("                <svg class=\"bi me-2\" width=\"40\" height=\"32\" role=\"img\" aria-label=\"Bootstrap\"><use xlink:href=\"#bootstrap\"/></svg>\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"nav col-12 col-md-auto mb-2 justify-content-center mb-md-0\">\r\n");
      out.write("                <li><a href=\"/index.html\" class=\"nav-link px-2 link-secondary\">Q&A</a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"nav-link px-2 link-dark\">FAQs</a></li>\r\n");
      out.write("                <li><a href=\"/user/userList\" class=\"nav-link px-2 link-dark\">User List</a></li>\r\n");
      out.write("                <li><a href=\"#\" class=\"nav-link px-2 link-dark\">About</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-3 text-end\">\r\n");
      out.write("                <a href=\"/user/login.html\" type=\"button\" class=\"btn btn-outline-primary me-2\">Login</a>\r\n");
      out.write("                <a href=\"/user/form.html\" type=\"button\" class=\"btn btn-primary\">Sign-up</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\" id=\"main\">\r\n");
      out.write("            <header class=\"qna-header\">\r\n");
      out.write("                <h2 class=\"qna-title\">ê°ì²´ì§í¥ìì ê°ì¥ ì¤ìíë¤ê³  ìê°íë ê²ì´ ë¬´ìì¸ê°ì?</h2>\r\n");
      out.write("            </header>\r\n");
      out.write("            <div class=\"content-main\">\r\n");
      out.write("                <article class=\"article\">\r\n");
      out.write("                    <div class=\"article-header\">\r\n");
      out.write("                        <div class=\"article-header-thumb\">\r\n");
      out.write("                            <img src=\"../img/picture.jpeg\" class=\"article-author-thumb\" alt=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"article-header-text\">\r\n");
      out.write("                          <!-- ì¬ì©ì íë¡í ì¶ê° í ê±°ë©´ span -> a íê·¸ë¡ ë°ê¾¸ê³  API ì°ê²° -->\r\n");
      out.write("                            <span class=\"article-author-name\">ê¹ì ì°</span>\r\n");
      out.write("                            <span class=\"article-header-time\">\r\n");
      out.write("                              2023-03-09 23:11\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"article-doc\">\r\n");
      out.write("                        <p>ê°ì²´ì§í¥ì í¹ì§ 4ê°ì§</p>\r\n");
      out.write("                        <p>ì¶ìí</p>\r\n");
      out.write("                        <p>ìº¡ìí</p>\r\n");
      out.write("                        <p>ìì</p>\r\n");
      out.write("                        <p>ë¤íì±</p>\r\n");
      out.write("                        <p> ??? </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"article-util\">\r\n");
      out.write("                        <ul class=\"article-util-list\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                              <!-- ìì , ì­ì  API ì°ê²° íì -->\r\n");
      out.write("                                <a class=\"link-modify-article\" href=\"/questions/423/form\">ìì </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                              <!-- ìì , ì­ì  API ì°ê²° íì -->\r\n");
      out.write("                                <form class=\"form-delete\" action=\"/questions/423\" method=\"POST\">\r\n");
      out.write("                                    <input type=\"hidden\" name=\"_method\" value=\"DELETE\">\r\n");
      out.write("                                    <button class=\"link-delete-article\" type=\"submit\">ì­ì </button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a class=\"link-modify-article\" href=\"../index.html\">ëª©ë¡</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </article>\r\n");
      out.write("  \r\n");
      out.write("                <div class=\"qna-comment\">\r\n");
      out.write("                    <div class=\"qna-comment-kuit\">\r\n");
      out.write("                        <p class=\"qna-comment-count\"><strong>2</strong>ê°ì ìê²¬</p>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <article class=\"article\" id=\"answer-1405\">\r\n");
      out.write("                                <div class=\"article-header\">\r\n");
      out.write("                                    <div class=\"article-header-thumb\">\r\n");
      out.write("                                        <img src=\"../img/picture.jpeg\" class=\"article-author-thumb\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"article-header-text\">\r\n");
      out.write("                                        <span class=\"article-author-name\">ì ê²½ì</span>\r\n");
      out.write("                                        <span class=\"article-header-time\">\r\n");
      out.write("                                           2023-03-09 23:15\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"article-doc comment-doc\">\r\n");
      out.write("                                    <p>.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"article-util\">\r\n");
      out.write("                                    <ul class=\"article-util-list\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                          <!-- ìì , ì­ì  API ì°ê²° íì -->\r\n");
      out.write("                                            <a class=\"link-modify-article\" href=\"/questions/1/answers/1/form\">ìì </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                          <!-- ìì , ì­ì  API ì°ê²° íì -->\r\n");
      out.write("                                            <form class=\"delete-answer-form\" action=\"/questions/1/answers/1\" method=\"POST\">\r\n");
      out.write("                                                <input type=\"hidden\" name=\"_method\" value=\"DELETE\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"delete-answer-button\">ì­ì </button>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </article>\r\n");
      out.write("                            <article class=\"article\" id=\"answer-1406\">\r\n");
      out.write("                                <div class=\"article-header\">\r\n");
      out.write("                                    <div class=\"article-header-thumb\">\r\n");
      out.write("                                        <img src=\"../img/picture.jpeg\" class=\"article-author-thumb\" alt=\"\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"article-header-text\">\r\n");
      out.write("                                        <span class=\"article-author-name\">ì ìì</span>\r\n");
      out.write("                                        <span class=\"article-header-time\">\r\n");
      out.write("                                          2023-03-09 23:20\r\n");
      out.write("                                        </span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"article-doc comment-doc\">\r\n");
      out.write("                                    <p>nuclear busy girl</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"article-util\">\r\n");
      out.write("                                    <ul class=\"article-util-list\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                          <!-- ìì , ì­ì  API ì°ê²° íì -->\r\n");
      out.write("                                            <a class=\"link-modify-article\" href=\"/questions/1/answers/2/form\">ìì </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                          <!-- ìì , ì­ì  API ì°ê²° íì -->\r\n");
      out.write("                                            <form class=\"form-delete\" action=\"/questions/1/answers/2\" method=\"POST\">\r\n");
      out.write("                                                <input type=\"hidden\" name=\"_method\" value=\"DELETE\">\r\n");
      out.write("                                                <button type=\"submit\" class=\"delete-answer-button\">ì­ì </button>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </article>\r\n");
      out.write("                            <form class=\"submit-write\">\r\n");
      out.write("                                <div class=\"form-group\" style=\"padding:14px;\">\r\n");
      out.write("                                    <textarea class=\"form-control\" placeholder=\"Update your status\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <button class=\"btn btn-primary pull-right\" type=\"button\">ëµë³íê¸°</button>\r\n");
      out.write("                                <div class=\"clearfix\" />\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/scripts.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
