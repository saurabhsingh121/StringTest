package saurabh.second.hashcodeEqual;

public class StringHelper {
	private String inputString;
	
	public StringHelper(String string) {
		inputString = string;
	}
	/*@Override
	public int hashCode() {
	return inputString.length();
	}*/
	
	public static void main(String[] args) {
		StringHelper helperObj = new StringHelper("string");
		StringHelper helperObj2 = new StringHelper("string");
		if(helperObj.hashCode() == helperObj2.hashCode()) {
			System.out.println("Hashcodes are equal");
		}
		if(helperObj.equals(helperObj2)) {
			System.out.println("Obj are equal");
		}else {
			System.out.println("Obj are not equal");
		}
		if ("string".equals(helperObj)) {
			System.out.println("string literal is equal with first obj");
		}
		if ("string".equals(helperObj2)) {
			System.out.println("string literal is equal with first obj");
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((inputString == null) ? 0 : inputString.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringHelper other = (StringHelper) obj;
		if (inputString == null) {
			if (other.inputString != null)
				return false;
		} else if (!inputString.equals(other.inputString))
			return false;
		return true;
	}

	public String getInputString() {
		return inputString;
	}
}
