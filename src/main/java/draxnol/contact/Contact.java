package draxnol.contact;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class Contact {
	public enum ContactStatus {
		NEW,
		CREATED,
		UPDATED,
		OLD
	}
	
	public ContactStatus status;
	private int profileID;
	private SimpleIntegerProperty contactID;
	private SimpleIntegerProperty contactInvoiceCount;
	private SimpleStringProperty contactName;
	private SimpleStringProperty contactAlias;
	private SimpleStringProperty contactBillingAddress;
	private SimpleStringProperty contactPhoneNumber;
	private SimpleStringProperty contactBusinessNumber;
	private SimpleStringProperty contactEmailAddress;
	
	

	private void init() {
		contactID = new SimpleIntegerProperty();
		contactInvoiceCount = new SimpleIntegerProperty();
		contactAlias = new SimpleStringProperty();
		contactBillingAddress = new SimpleStringProperty();
		contactPhoneNumber = new SimpleStringProperty();
		contactBusinessNumber = new SimpleStringProperty();
		contactEmailAddress = new SimpleStringProperty();
	}
	
	public Contact() {
		contactName = new SimpleStringProperty();
		init();
	}
	
	public Contact(String name) {
		contactName = new SimpleStringProperty();
		contactName.set(name);
		init();
	}
	
	/*Profile ID*/
	public void setProfileID(int id){
		this.profileID = id;
	}
	
	public int getProfileID() {
		return profileID;
	}
	
	/* Invoice ID */
	public void setContactID(int value) {
		this.contactID.set(value);
	}

	public int getContactID() {
		return contactID.get();
	}

	public SimpleIntegerProperty contactIDProperty() {
		return contactID;
	}

	/* Invoice count */
	public void setContactInvoiceCount(int value) {
		if (value > 0) {
			this.contactInvoiceCount.set(value);
		} else {
			contactInvoiceCount.set(0);
		}
	}

	public int getContactInvoiceCount() {
		return contactInvoiceCount.get();
	}

	public SimpleIntegerProperty contactInvoiceCountProperty() {
		return contactInvoiceCount;
	}

	public void incrementInvoiceCount() {
		this.contactInvoiceCount.set(this.contactInvoiceCount.get() + 1);

	}

	public void decrementInvoiceCount() {
		if (this.contactInvoiceCount.get() > 0)
			this.contactInvoiceCount.set(this.contactInvoiceCount.get() - 1);

	}

	/* Contact Name */
	public void setContactName(String name) {
		this.contactName.set(name);
	}

	public String getContactName() {
		return contactName.get();
	}

	public SimpleStringProperty contactNameProperty() {
		return contactName;

	}

	/* Contact Alias */
	public void setContactAlias(String Alias) {
		this.contactAlias.set(Alias);
	}

	public String getContactAlias() {
		return contactAlias.get();
	}

	public SimpleStringProperty contactAliasProperty() {
		return contactAlias;

	}

	/* Contact Billing Address */
	public void setContactBillingAddress(String BillingAddress) {
		this.contactBillingAddress.set(BillingAddress);
	}

	public String getContactBillingAddress() {
		return contactBillingAddress.get();
	}

	public SimpleStringProperty contactBillingAddressProperty() {
		return contactBillingAddress;
	}

	/* Contact PhoneNumber */
	public void setContactPhoneNumber(String PhoneNumber) {
		this.contactPhoneNumber.set(PhoneNumber);
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber.get();
	}

	public SimpleStringProperty contactPhoneNumberProperty() {
		return contactPhoneNumber;
	}

	/* Contact BusinessNumber */
	public void setContactBusinessNumber(String BusinessNumber) {
		this.contactBusinessNumber.set(BusinessNumber);
	}

	public String getContactBusinessNumber() {
		return contactBusinessNumber.get();
	}

	public SimpleStringProperty contactBusinessNumberProperty() {
		return contactBusinessNumber;
	}
	/*Contact EmailAddress*/
	public void setContactEmailAddress(String EmailAddress) {
		this.contactEmailAddress.set(EmailAddress);
	}

	public String getContactEmailAddress() {
		return contactEmailAddress.get();
	}

	public SimpleStringProperty contactEmailAddress() {
		return contactEmailAddress;
	}

	public String getContactSummary() {
		String summaryString = "Contact name " + this.getContactName(); 
		return summaryString;
	}
	@Override
	public String toString() {
		String retString = "Contact ID" + contactID.get()
				+ "Contact name:" + contactName.get()
				+ "Contact business number:" + contactBusinessNumber.get()
				+ "Contact alias: " + contactAlias.get()
				+ "contact billing address:" + contactBillingAddress.get()
				+ "contact phone" + contactPhoneNumber.get()
				+ "contact email" + contactEmailAddress.get()
				+ "contact invoice count" + String.valueOf(contactInvoiceCount.get());
		return retString;
	}
}
