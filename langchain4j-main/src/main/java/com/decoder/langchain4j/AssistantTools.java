package com.decoder.langchain4j;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
public class AssistantTools {

    // PREÇOS (Memória)
    private static final Map<String, Double> DAILY_BASE_PRICE = Map.of(
            "economico", 150.0,
            "suv",       280.0,
            "premium",   420.0
    );

    // SEGURO (Memória)
    private static final Map<String, Double> INSURANCE_RATE = Map.of(
            "economico", 0.05,
            "suv",       0.08,
            "premium",   0.12
    );

    /**
     * Ferramenta 1: CÁLCULO
     */
    @Tool("Calcula o valor total do aluguel corporativo com base na categoria e dias.")
    public String calculateQuotation(String category, int days) {
        Double base = DAILY_BASE_PRICE.get(category.toLowerCase());
        if (base == null) return "Categoria inválida. Temos: economico, suv, premium.";

        Double rate = INSURANCE_RATE.get(category.toLowerCase());
        double total = (base * days) * (1 + rate);

        return String.format(
                "Cotação: %s por %d dias -> R$ %.2f (inclui seguro %.0f%%)",
                category, days, total, rate * 100
        );
    }

    /**
     * Ferramenta 2: DISPONIBILIDADE

     */
    @Tool("Verifica se há disponibilidade de veículos para uma categoria em uma data específica.")
    public boolean checkAvailability(String category, String date) {
        System.out.println("🤖 IA perguntou disponibilidade para: " + category + " no dia " + date);

        // Lógica Fake para teste:
        if (category.equalsIgnoreCase("suv")) {
            return false; // SUV nunca tem (para testar a negativa)
        }

        return true; // O resto sempre tem
    }
}