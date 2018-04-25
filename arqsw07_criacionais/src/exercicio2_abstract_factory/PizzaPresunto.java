package exercicio2_abstract_factory;

public class PizzaPresunto implements Pizza{

	@Override
	public String fazer() {
		return "Pizza de Presunto (queijo, presunto e tomate)";
	}
}
