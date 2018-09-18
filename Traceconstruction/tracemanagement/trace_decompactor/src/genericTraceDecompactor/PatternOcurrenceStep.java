package genericTraceDecompactor;

import java.util.ArrayList;

import java.util.List;


import trace.NormalStep;
import trace.PatternOcurrence;


public class PatternOcurrenceStep {

	List<NormalStep> steplist =new ArrayList<NormalStep>();
	PatternOcurrence patternocurrence;
	public PatternOcurrence getPatternocurrence() {
		return patternocurrence;
	}public void setStep(List<NormalStep> steplist) {
		this.steplist = steplist;
	}public void setPatternocurrence(PatternOcurrence patternocurrence) {
		this.patternocurrence = patternocurrence;
	}public List<NormalStep> getStep() {
		return steplist;
	}
	
}
