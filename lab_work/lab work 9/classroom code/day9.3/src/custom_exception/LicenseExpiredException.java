package custom_exception;

public class LicenseExpiredException extends Exception {
	public LicenseExpiredException(String mesg) {
		super(mesg);
	}
}
