package tracemetamodel.java;



	import trace.NormalStep;


	public class StepStatus {
				public StepStatus() {
					
					is_active=true;
				}

				public boolean is_active;
				public NormalStep step;
				public String signature;
				public int certificate=0;
			
				
				public NormalStep getStep() {
					return step;
				}
			    
				public boolean isIs_active() {
					return is_active;
				}
				
				public void setIs_active(boolean is_active) {
					this.is_active = is_active;
				}
					public void setStep(NormalStep step) {
						this.step = step;
					}			
				public void setSignature(String signature) {
					this.signature = signature;
				}public void setCertificate(int certificate) {
					this.certificate = certificate;
				}public String getSignature() {
					return signature;
				}public int getCertificate() {
					return certificate;
				}
	}

