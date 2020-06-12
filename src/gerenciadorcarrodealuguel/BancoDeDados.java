package gerenciadorcarrodealuguel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class BancoDeDados {

    Set<Carro> carros = new HashSet<>();
    Map<String, Carro> carrosByPlaca = new HashMap<>();
    SortedMap<String, List<Carro>> carrosByNome = new TreeMap<>();

    public void addCarros(Carro c) {
        if (carros.add(c)) {
            carrosByPlaca.put(c.getPlaca(), c);
            List<Carro> listCarro = carrosByNome.get(c.getMarca().toLowerCase());
            if (listCarro == null) {
                listCarro = new ArrayList<>();
                carrosByNome.put(c.getMarca(), listCarro);
            }
            listCarro.add(c);
        }
    }

    Carro findByCarro(String placa) {
        return carrosByPlaca.get(placa);
    }

    Carro findByNome(String marca) {
        return (Carro) carrosByNome.get(marca);
    }

    public void removeCarro(Carro c) {
        carros.remove(c);
        carrosByPlaca.remove(c);
        List<Carro> lista = carrosByNome.get(c.getMarca());
        if (lista != null) {
            lista.remove(c);
        }
    }
    
  
}
