package SOLID_Calculator.Step05_Final;

public interface Calculable {
    Integer rechne (Formel ergebnisformel);
    String getOperator();
    String getParseOperator();
}
