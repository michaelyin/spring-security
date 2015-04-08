/**
 * 
 */
package org.springframework.security.web.authentication;

import java.util.List;
import java.util.Map;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * @author Xuecheng
 *
 */
public class HttpAuthenticationToken extends UsernamePasswordAuthenticationToken {
    /**
	 * 
	 */
	private static final long serialVersionUID = -6609512318036835085L;
	private String phone;
    private String phone_pass;
    
    private Map<String, String> reqParmsMap;

    public Map<String, String> getReqParmsMap() {
		return reqParmsMap;
	}


	public void setReqParmsMap(Map<String, String> reqParmsMap) {
		this.reqParmsMap = reqParmsMap;
	}


	/**
     * 
     * @param principal -- mac
     * @param credentials -- mac-key
     * @param phone
     * @param pass
     */
	public HttpAuthenticationToken(Object principal, Object credentials, Map<String, String> parms) {
        super(principal, credentials);
        this.reqParmsMap = parms;
    }


    @Override
    public String toString() {
        return "HttpAuthenticationToken";
    }
}