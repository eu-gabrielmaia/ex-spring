package com.example.ExSpring.control;

import com.example.ExSpring.model.Livro;
import com.example.ExSpring.model.Medicamento;
import com.example.ExSpring.repository.LivroRepository;
import com.example.ExSpring.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("apiMedicamento")
public class MedicamentoControl {

    @Autowired
    MedicamentoRepository mRepository;

    @PostMapping("/inserir")
    public void inserir(@RequestBody Medicamento m){
        mRepository.save(m);
    }

    @DeleteMapping("/excluir")
    public void excluir(@RequestBody Medicamento m){
        mRepository.delete(m);
    }

    @DeleteMapping("/excluirPorId/{idMedicamento}")
    public void excluirPorId(@PathVariable(value = "idMedicamento") int idMedicamento){
        mRepository.deleteById(idMedicamento);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Medicamento m){
        mRepository.save(m);
    }

    @GetMapping("/todos")
    public List<Medicamento> buscarTodos(){
        return mRepository.findAll();
    }

    @GetMapping("/buscar/id/{idMedicamento}")
    public Optional<Medicamento> buscarPorId(@PathVariable(value = "idMedicamento") int idMedicamento){
        return mRepository.findById(idMedicamento);
    }

    @GetMapping("/buscar/nome/{nome}")
    public List<Medicamento> buscarPorNome(@PathVariable(value = "nome") String nome){
        return mRepository.findByNome(nome);
    }

    @GetMapping("/buscar/laboratorio/{laboratorio}")
    public List<Medicamento> buscarPorLaboratorio(@PathVariable(value = "laboratorio") String laboratorio){
        return mRepository.findByLaboratorio(laboratorio);
    }

    @GetMapping("/buscar/preco/{preco}")
    public List<Medicamento> buscarPorPreco(@PathVariable(value = "preco") double preco){
        return mRepository.findByPreco(preco);
    }

    @GetMapping("/buscar/parteNome/{parte}")
    public List<Medicamento> buscarPorParteNome(@PathVariable(value = "parte") String parte){
        return mRepository.findByParteNome(parte);
    }

    @GetMapping("/buscar/precoMaior/{parte}")
    public List<Medicamento> buscarPorPrecoMaior(@PathVariable double parte){
        return mRepository.findByPrecoMaior(parte);
    }

    @GetMapping("/buscar/parteNomePrecoMaior/{parte}/{preco}")
    public List<Medicamento> buscarPorParteNomePrecoMaior(@PathVariable String parte, @PathVariable double preco){
        return mRepository.findByParteNomePrecoMaior(parte, preco);
    }

}
