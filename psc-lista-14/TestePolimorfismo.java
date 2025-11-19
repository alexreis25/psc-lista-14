public class TestePolimorfismo {
    public static void main(String[]args){
        MetodoPagamento pagamento1 = new CartaoCredito("1234-5678-9999-0000");
        MetodoPagamento pagamento2 = new Boleto("237901230123012301230123");
        MetodoPagamento pagamento3 = new Pix("email@gmail.com");

        ProcessadorPagamento.processar(pagamento1, 150.75);
        ProcessadorPagamento.processar(pagamento2, 499.00);
        ProcessadorPagamento.processar(pagamento3, 25.50);
    }
}
