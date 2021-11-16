package com.support.controller;

import com.support.model.Usuario;
import com.support.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UsuarioRepository usuarioRepository;

	/*
	 * @PostMapping("/2") public String logar2(@RequestBody Usuario usuario) {
	 * List<Usuario> usuarios = usuarioRepository.findAll();
	 * 
	 * for (Usuario u : usuarios) { if (u.getEmail().equals(usuario.getEmail()) &&
	 * u.getSenha().equals(usuario.getSenha())) { // removendo senha do usuario da
	 * response u.setSenha(null); return "Usuario logado com sucesso.\nEmail: " +
	 * u.getEmail() + "\nID: " + u.getId(); } }
	 * 
	 * return "Usuario e/ou senha invalido(s)"; }
	 */

    @PostMapping
    public LoginResponse logar(@RequestBody Usuario usuario) {
        // #1 Metodo de verificacao mais basico (poor performance na vida real)
        List<Usuario> usuarios = usuarioRepository.findAll();

        for (Usuario u : usuarios) {
            if (u.getEmail().equals(usuario.getEmail()) && u.getSenha().equals(usuario.getSenha())) {
                // removendo senha do usuario da response
                u.setSenha(null);
                return new LoginResponse("Usuario logado com sucesso", u);
            }
        }

        return new LoginResponse("Usuario e/ou senha invalido(s)");

        // #2 Metodo de verificacao mais avancado/sotifiscado (melhor performance na vida real)
//        List<Usuario> usuarios = usuarioRepository.findAll(Example.of(usuario));
//
//        if (!usuarios.isEmpty()) {
//            Usuario usuarioLogado = usuarios.get(0);
//            // removendo senha do usuario da response
//            usuarioLogado.setSenha(null);
//            return new LoginResponse("Usuario logado com sucesso", usuarioLogado);
//        }
//
//        return new LoginResponse("Usuario e/ou senha invalido(s)");
    }
	
	
}
