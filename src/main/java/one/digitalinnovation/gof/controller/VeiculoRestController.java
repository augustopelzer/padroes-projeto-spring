package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Veiculo;
import one.digitalinnovation.gof.model.form.VeiculoForm;
import one.digitalinnovation.gof.model.form.VeiculoUpdateForm;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Esse {@link RestController} representa nossa <b>Facade</b>, pois abstrai toda
 * a complexidade de integrações (Banco de Dados H2) em uma
 * interface simples e coesa (API REST).
 * 
 * @author augustopelzer
 */
@RestController
@RequestMapping("veiculos")
public class VeiculoRestController {

	@Autowired
	private VeiculoService veiculoService;

	@GetMapping
	public ResponseEntity<Iterable<Veiculo>> getAll() {
		return ResponseEntity.ok(veiculoService.getAll());
	}

	@GetMapping("/{placa}")
	public ResponseEntity<Veiculo> getByPlaca(@PathVariable String placa) {
		Veiculo veiculo = veiculoService.getByPlaca(placa);
		return ResponseEntity.ok(veiculo);
	}

	@PostMapping
	public ResponseEntity<Veiculo> create(@RequestBody VeiculoForm veiculoForm) {
		Veiculo veiculo = veiculoService.create(veiculoForm);
		return ResponseEntity.ok(veiculo);
	}

	@PutMapping("/{placa}")
	public ResponseEntity<Veiculo> update(@PathVariable String placa, @RequestBody VeiculoUpdateForm veiculoUpdateForm) {
		Veiculo veiculo = veiculoService.update(placa, veiculoUpdateForm);
		return ResponseEntity.ok(veiculo);
	}

	@DeleteMapping("/{placa}")
	public ResponseEntity<Void> delete(@PathVariable String placa) {
		veiculoService.delete(placa);
		return ResponseEntity.ok().build();
	}
}
