package exercicio2_abstract_factory;

/**
 * 
 * @author Leandro Holanda 816113762
 *
 */

public class PizzaPresunto implements Pizza{

	@Override
	public String fazer() {
		return "Pizza de Presunto (queijo, presunto e tomate)";
	}
}
