
public class PaidAdvisor extends Person {
	protected String Name;
	protected double regularPayRate;
	protected double specialPayRate;
	protected double overtimePayRate;
	protected double hoursWorked;
	protected double hoursSpecial;
	protected double takeHomePay;
	protected double baseHours;
	protected double overtime;

	public PaidAdvisor() {
		regularPayRate = 25;
		specialPayRate = 50;
		overtimePayRate = (1.5 * regularPayRate);
	} // default variables

	public double calculatePay() {
		baseHours = (hoursWorked - hoursSpecial);

		if (baseHours > 30) {
			overtime = (baseHours - 30);
		}
		takeHomePay = ((baseHours-overtime) * regularPayRate) + (hoursSpecial * specialPayRate) + (overtime * overtimePayRate);

		return takeHomePay;
	} //end method that calculates pay based on number of hours worked and kind of hours worked

	public double getPayRate() {

		if (baseHours > 30) {
			return overtimePayRate;
		} else {
			return regularPayRate;
		}
	} //returns payrate based on hours worked

	public double getHoursWorked() {
		return hoursWorked;
	} //returns hours worked

	public void setNameRateHours(String nameFirst, String nameLast, double rate, double baseHours, double overtime) {
		Person employee = new Person();
		employee.setName(nameFirst, nameLast);
		Name = employee.toString();
		hoursWorked = baseHours;
		hoursSpecial = overtime;
	} //method to "tie together" users name, rate, and hours

	@Override
	public String toString() {
		String result = "Consultant Name: " + Name + "\n";
		result += "Total Hours Worked: " + hoursWorked + "\n";
		result += "Special Hours Worked: " + hoursSpecial + "\n";
		result += "Overtime Hours Worked: " + overtime + "\n";
		result += "Regular Pay Rate: " + "$" + (regularPayRate * (baseHours - overtime)) + "\n";
		result += "Special Pay Rate: " + "$" + (specialPayRate * hoursSpecial) + "\n";
		result += "Overtime Pay Rate: " + "$" + (overtime * overtimePayRate) + "\n";

		return result;
	} //method to output user specific hours and wages
}
