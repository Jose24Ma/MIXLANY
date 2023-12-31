package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Empleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"css/alertify.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/default.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Empleado</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <div class=\"d-flex\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <form name=\"frmEmpleado\" action=\"ControladorEmpleado?menu=Empleado\" method=\"POST\" onsubmit=\"return validar()\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Cedula</label>\n");
      out.write("                                <input type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getDni()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtDni\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Nombres</label>\n");
      out.write("                                <input type=\"text\" pattern=\"[a-z]{1,15}\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getNom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtNombres\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Telefono</label>\n");
      out.write("                                <input type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getTel()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtTel\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Estado</label>\n");
      out.write("                                <select value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtEstado\" class=\"form-control\">\n");
      out.write("                                    <option value=\"1\">Activo</option>\n");
      out.write("                                    <option value=\"0\">Inactivo</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>Usuario</label>\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtUser\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label>E-mail</label>\n");
      out.write("                                <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleado.getMail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txtMail\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <input type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"btn btn-primary\">\n");
      out.write("                                <input type=\"submit\" name=\"accion\" value=\"Actualizar\" class=\"btn btn-success\">\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>                         \n");
      out.write("                </div>\n");
      out.write("            </div>                     \n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <table class=\"table table-hover\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>ID</th>\n");
      out.write("                                    <th>DNI</th>\n");
      out.write("                                    <th>NOMBRES</th>\n");
      out.write("                                    <th>TELEFONO</th>\n");
      out.write("                                    <th>ESTADO</th>\n");
      out.write("                                    <th>USER</th>\n");
      out.write("                                    <th>E-MAIL</th>\n");
      out.write("                                    <th>ACCIONES</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody> \n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>      \n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"css/alertify.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function validar() {\n");
      out.write("                dni = document.frmEmpleado.txtDni.value;\n");
      out.write("                nom = document.frmEmpleado.txtNombres.value;\n");
      out.write("                dir = document.frmEmpleado.txtTel.value;\n");
      out.write("                user = document.frmEmpleado.txtUser.value;\n");
      out.write("                mail = document.frmEmpleado.txtMail.value;\n");
      out.write("\n");
      out.write("                if (dni.length == 0) {\n");
      out.write("                    alertify.alert(\"Aviso\", \"Ingrese la cedula\").set('label', 'Ok');\n");
      out.write("                    return false;\n");
      out.write("                } else if (nom.length == 0) {\n");
      out.write("                    alertify.alert(\"Aviso\", \"Ingrese el nombre\").set('label', 'Ok');\n");
      out.write("                    return false;\n");
      out.write("                } else if (dir.length == 0) {\n");
      out.write("                    alertify.alert(\"Aviso\", \"Ingrese una telefono\").set('label', 'Ok');\n");
      out.write("                    return false;\n");
      out.write("                }else if (user.length == 0) {\n");
      out.write("                    alertify.alert(\"Aviso\", \"Ingrese un usuario\").set('label', 'Ok');\n");
      out.write("                    return false;\n");
      out.write("                }else if (mail.length == 0) {\n");
      out.write("                    alertify.alert(\"Aviso\", \"Ingrese un correo\").set('label', 'Ok');\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("em");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empleados}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getDni()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getNom()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getTel()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getUser()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getMail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <a class=\"btn btn-warning\" href=\"ControladorEmpleado?menu=Empleado&accion=Editar&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Editar</a>\n");
          out.write("                                            <a class=\"btn btn-danger\" href=\"ControladorEmpleado?menu=Empleado&accion=Delete&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${em.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Eliminar</a>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
