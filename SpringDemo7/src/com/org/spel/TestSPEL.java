package com.org.spel;

import java.beans.Expression;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSPEL {

	public static void main(String[] args) throws Exception {
	
		ExpressionParser parser = new SpelExpressionParser();  
		  
		Expression exp = (Expression) parser.parseExpression("'Hello SPEL'");  
		String message = (String) exp.getValue();  
		System.out.println(message);  
		//OR  
		//System.out.println(parser.parseExpression("'Hello SPEL'").getValue());  
		}  
		
	}


