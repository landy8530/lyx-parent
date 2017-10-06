package lyx.sys.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lyx.sys.entity.SysUser;
import lyx.sys.facade.SysUserFacade;
/**
 * <B>系统名称：</B><BR>
 * <B>模块名称：</B><BR>
 * <B>中文类名：</B><BR>
 * <B>概要说明：</B><BR>
 * @author bhz（Alienware）
 * @since 2016年2月29日
 */
@Controller
public class SysIndexController {
	
	@Resource
	private SysUserFacade sysUserFacade;

	/**
     * <B>方法名称：</B>系统首页<BR>
     * <B>概要说明：</B><BR>
     * 
     * @param request 页面请求
     * @param response 页面响应
     * @param dataYear 年份
     * @return ModelAndView 模型视图
     */
    @RequestMapping("/sysindex.html")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response,ModelMap modelMap) {
        ModelAndView ret = new ModelAndView();
        
        SysUser user = this.sysUserFacade.getUser();
        System.out.println("userName:" + user.getName());
        
        modelMap.put("user", user);
        
        return ret;
    }
    

    
    

}
