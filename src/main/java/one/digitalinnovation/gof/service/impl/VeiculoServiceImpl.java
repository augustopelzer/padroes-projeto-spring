package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.Veiculo;
import one.digitalinnovation.gof.model.VeiculoRepository;
import one.digitalinnovation.gof.model.form.VeiculoForm;
import one.digitalinnovation.gof.model.form.VeiculoUpdateForm;
import one.digitalinnovation.gof.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoServiceImpl implements VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Veiculo create(VeiculoForm form) {
        Veiculo veiculo = new Veiculo();
        Optional<Cliente> cliente = clienteRepository.findById(form.getClienteId());

        veiculo.setCliente(cliente.get());
        veiculo.setPlaca(form.getPlaca());
        veiculo.setCor(form.getCor());
        veiculo.setTipo(form.getTipo());
        veiculo.setModelo(form.getModelo());
        veiculo.setMarca(form.getMarca());
        return veiculoRepository.save(veiculo);
    }

    @Override
    public Veiculo getByPlaca(String placa) {
        return veiculoRepository.findById(placa).get();
    }

    @Override
    public Iterable<Veiculo> getAll() {
        return veiculoRepository.findAll();
    }

    @Override
    public Veiculo update(String placa, VeiculoUpdateForm formUpdate) {
        Veiculo veiculo = veiculoRepository.findById(placa).get();
        veiculo.setCor(formUpdate.getCor());
        veiculo.setTipo(formUpdate.getTipo());
        veiculo.setModelo(formUpdate.getModelo());
        veiculo.setMarca(formUpdate.getMarca());
        return veiculoRepository.save(veiculo);
    }

    @Override
    public void delete(String placa) {
        veiculoRepository.deleteById(placa);
    }
}
