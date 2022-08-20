package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Veiculo;
import one.digitalinnovation.gof.model.form.VeiculoForm;
import one.digitalinnovation.gof.model.form.VeiculoUpdateForm;

import java.util.List;
import java.util.Optional;

public interface VeiculoService {
    //CRUD Veículo
    Veiculo create(VeiculoForm form);

    Veiculo getByPlaca(String placa);

    Iterable<Veiculo> getAll();

    Veiculo update(String placa, VeiculoUpdateForm formUpdate);

    void delete(String placa);
}
