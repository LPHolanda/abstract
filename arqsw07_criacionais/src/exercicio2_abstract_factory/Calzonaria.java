package exercicio2_abstract_factory;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class Calzonaria implements AbstractPizzaria{
	
	@Override
	public Pizza getFactory(DiaSemana dia) {
		switch(dia) {
		case SEGUNDA: case QUARTA: case SEXTA: return new CalzoneCalabresa();
		case TERCA: case QUINTA: case SABADO: return new CalzonePresunto();
		default:
			System.out.println("Pizzaria Fechada");
			return null;
		}
	}
}
