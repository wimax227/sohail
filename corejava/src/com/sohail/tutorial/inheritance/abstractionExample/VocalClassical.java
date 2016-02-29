package com.sohail.tutorial.inheritance.abstractionExample;

public class VocalClassical extends ClassicalMusic implements Swimming,Running{
	
		public VocalClassical(String type,String singer,String musicalInstrument){
			super(type,singer,musicalInstrument);
			
		}

		@Override
		public String singingspeed() {
			
			return "speed is medium good";
		}
		@Override
		public String classicalDuration() {
			
			return "duration is 20 mins";
		}
	
		public void swimmingskills() {
			System.out.println(getsinger()+" "+	"I am ok swimmer");
			
		}
	
		public void runningskills(){
			System.out.println(getsinger()+" "+"I am good runner");
		}

		
}
