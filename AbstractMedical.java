package OOPS;

public class AbstractMedical {

}


abstract class Instrumentt {
	abstract void utilize();
}

abstract class MedicalInstrument extends Instrument {
	abstract void utility();
}
abstract class SurgicalInstrument extends MedicalInstrument {

	
	abstract void sterilization() ;
}

class Needle extends SurgicalInstrument{

	@Override
	void utility() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sterilization() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}
	
	void sewingStiches() {
		
	}
	
}

class Cutter extends SurgicalInstrument{

	@Override
	void sterilization() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utility() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}
	
	void Incision() {
		
		
	}
	
	
}

abstract class PahtologicalInstrument extends MedicalInstrument {

	
	abstract void examine() ;

	
	
}

class MRI extends PahtologicalInstrument{

	@Override
	void examine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utility() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}
	
	void MRITEST() {
		
	}
	
}

class CTScan extends PahtologicalInstrument{

	@Override
	void examine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utility() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void utilize() {
		// TODO Auto-generated method stub
		
	}
	
	void ctScan () {
		
	}
	
}