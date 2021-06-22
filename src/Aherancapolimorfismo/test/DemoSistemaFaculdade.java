package Aherancapolimorfismo.test;

import Aherancapolimorfismo.classes.EmpregadoDaFaculdade;
import Aherancapolimorfismo.classes.GeradorDeRelatorio;
import Aherancapolimorfismo.classes.ProfessorDaFaculdade;

public class DemoSistemaFaculdade {
	public static void main(String[] args) {
		EmpregadoDaFaculdade empregadoDaFaculdade = new EmpregadoDaFaculdade();
		empregadoDaFaculdade.setNome("Yam Souto");
		empregadoDaFaculdade.setSalario(5000);
		
		ProfessorDaFaculdade professorDaFaculdade = new ProfessorDaFaculdade();
		professorDaFaculdade.setNome("Reudisman Rolim");
		professorDaFaculdade.setSalario(10000);
		professorDaFaculdade.setHorasDeAula(40);
		
		GeradorDeRelatorio geradorDeRelatorio = new GeradorDeRelatorio();
		geradorDeRelatorio.adiciona(empregadoDaFaculdade);
		geradorDeRelatorio.adiciona(professorDaFaculdade);
	}
}
