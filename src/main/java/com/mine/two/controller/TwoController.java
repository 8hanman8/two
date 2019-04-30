/**
 * 
 */
package com.mine.two.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author J.Hanmandlu
 *
 */

@RestController
@RequestMapping("/")
public class TwoController {
	private static InetAddress inetAddress;
	static {
		try {
			inetAddress = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	@GetMapping
	public ResponseEntity<Object> defualt() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("message", "I am from two:TwoController");
		System.out.println("IP Address:- " + inetAddress.getHostAddress());
		System.out.println("Host Name:- " + inetAddress.getHostName());
		result.put("ipAddress", inetAddress.getHostAddress());
		result.put("hostName", inetAddress.getHostName());
		return new ResponseEntity<Object>(result, HttpStatus.OK);
	}
}
