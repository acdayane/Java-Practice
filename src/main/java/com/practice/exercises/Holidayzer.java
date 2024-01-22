package com.practice.exercises;

public class Holidayzer {
    
    private String[][] holidaysList = {
        {"01-01-2024", "Confraternização Mundial"},
        {"12-02-2024", "Carnaval"},
        {"29-03-2024", "Sexta-feira Santa"},
        {"21-04-2024", "Tiradentes"},
        {"01-05-2024", "Dia do Trabalho"},
        {"30-05-2024", "Corpus Christi"},
        {"07-09-2024", "Independência do Brasil"},
        {"12-10-2024", "Nossa Senhora Aparecida"},
        {"02-11-2024", "Finados"},
        {"15-11-2024", "Proclamação da República"},
        {"20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"},
        {"25-12-2024", "Natal"}
    };

    public String getHoliday(String date) {
        for (int i=0; i<holidaysList.length; i++) {
            if (holidaysList[i][0].equals(date)) {
                return date + " é feriado de " + holidaysList[i][1];
            }
        }
        return "Não é feriado!";
    }

    public String getAllHolidays() {
        for (String[] holiday : holidaysList) {  
            return holiday[0] + " é feriado de " + holidaysList[1];            
        }
        return null;
    }
    
}
