package tracemetamodel.java;

public class pattern {
  String signature="";
  String repeatedpattern="";
  String certificate="";
  int startposinpattern=0;
  int rept=0;
	public String getRepeatedpattern() {
		return repeatedpattern;
	}public String getSignature() {
		return signature;
	}public void setRepeatedpattern(String repeatedpattern) {
		this.repeatedpattern = repeatedpattern;
	}public void setRept(int rept) {
		this.rept = rept;
	}public void setSignature(String signature) {
		this.signature = signature;
	}public int getRept() {
		return rept;
		
	}	  
	  public void setStartposinpattern(int startposinpattern) {
		this.startposinpattern = startposinpattern;
	}public void setCertificate(String certificate) {
		this.certificate = certificate;
	}public int getStartposinpattern() {
		return startposinpattern;
	}public String getCertificate() {
		return certificate;
}
}
