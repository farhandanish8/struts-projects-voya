package com.example.action;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class GreetAction extends ActionSupport implements SessionAware{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Map<String, Object> userSession;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String execute() throws Exception{
		ValueStack stack = ActionContext.getContext().getValueStack();
		Map<String,Object>mapData = new HashMap<>();
		mapData.put("message","GreatDay");
		mapData.put("fruits",Arrays.asList("apple","orange"));
		stack.push(mapData);
		System.out.println(stack.size());
		userSession.put("message","greatday");
		userSession.put("courses",Arrays.asList("java","spring"));
		return SUCCESS;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		userSession = session;
	}
	
	
	

}
