package CustomerInformation;

public class User {

	// Data field for User class
	private int user_id;
	private int user_role;
	private String user_first_name;
	private String user_last_name;
	private String user_address;
	private int user_zipcode;
	private String user_state;
	private String user_username;
	private String user_password;
	private String user_email;
	private int user_ssn;
	private String user_sec_question;
	private String user_sec_answer;
	
	User() {
	}
	
	public int getUserID() {
		return user_id;
	}
	public void setUserID(int user_id) {
		this.user_id = user_id;
	}
	public int getUserRole() {
		return user_role;
	}
	public void setUserRole(int user_role) {
		this.user_role = user_role;
	}
	public String getUserFirstName() {
		return user_first_name;
	}
	public void setUserFirstName(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUserLastName() {
		return user_last_name;
	}
	public void setUserLastName(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	public String getUserAddress() {
		return user_address;
	}
	public void setUserAddress(String user_address) {
		this.user_address = user_address;
	}
	public int getUserZipcode() {
		return user_zipcode;
	}
	public void setUserZipcode(int user_zipcode) {
		this.user_zipcode = user_zipcode;
	}
	public String getUserState() {
		return user_state;
	}
	public void setUserState(String user_state) {
		this.user_state = user_state;
	}
	public String getUserUsername() {
		return user_username;
	}
	public void setUserUsername(String user_username) {
		this.user_username = user_username;
	}
	public String getUserPassword() {
		return user_password;
	}
	public void setUserPassword(String user_password) {
		this.user_password = user_password;
	}
	public String getUserEmail() {
		return user_email;
	}
	public void setUserEmail(String user_email) {
		this.user_email = user_email;
	}
	public int getUserSSN() {
		return user_ssn;
	}
	public void setUserSSN(int user_ssn) {
		this.user_ssn = user_ssn;
	}
	public String getUserSecQuestion() {
		return user_sec_question;
	}
	public void setUserSecQuestion(String user_sec_question) {
		this.user_sec_question = user_sec_question;
	}
	public String getUserSecAnswer() {
		return user_sec_answer;
	}
	public void setUserSecAnswer(String user_sec_answer) {
		this.user_sec_answer = user_sec_answer;
	}
}
