import javax.interceptor.InvocationContext;

public class LogInterceptor {

	public Object intercept(InvocationContext context) throws Exception{
		/* consider refactoring this to be the official count method instead of the customer DAO */
		
		// Log to console for fun
		System.out.println("Scanning customer: " + context.getMethod().getName());
		
		// proceed
		Object result = context.proceed();
		
		// Log to console after execution
		System.out.println("Customer scanned: " + context.getMethod().getName());
		
		return result;
	}
}
