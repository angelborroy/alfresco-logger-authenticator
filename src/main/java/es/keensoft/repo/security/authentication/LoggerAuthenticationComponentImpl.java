package es.keensoft.repo.security.authentication;

import org.alfresco.repo.security.authentication.AbstractAuthenticationComponent;
import org.alfresco.repo.security.authentication.AuthenticationException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggerAuthenticationComponentImpl extends AbstractAuthenticationComponent {
	
    private static Log logger = LogFactory.getLog(LoggerAuthenticationComponentImpl.class);

	@Override
	protected void authenticateImpl(String userName, char[] password) {
		
		// Include here your own logic ...
		logger.info("User " + userName + " about to login...");
		// ... to save a user login
		
		throw new AuthenticationException("Ignore and chain");
		
	}

	@Override
	protected boolean implementationAllowsGuestLogin() {
		return false;
	}

}
