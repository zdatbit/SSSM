/** 
 * @author  zhangdi 	
 * @date 创建时间：2017年12月20日 下午5:17:16  	
 */

package com.zdatbit.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Process {
	
	@RequestMapping("index")
	public void index(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.getWriter().write("hello world");
	}
}
