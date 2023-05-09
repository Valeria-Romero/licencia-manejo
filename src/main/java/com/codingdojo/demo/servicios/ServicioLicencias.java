package com.codingdojo.demo.servicios;

import org.springframework.stereotype.Service;

import com.codingdojo.demo.repositorios.RepoLicencia;
import com.codingdojo.demo.repositorios.RepoPersona;

@Service
public class ServicioLicencias {
	private final RepoPersona repoPersona;
	private final RepoLicencia repoLicencia;
	public ServicioLicencias(RepoPersona rPersona, RepoLicencia rLicencia) {
		this.repoPersona = rPersona;
		this.repoLicencia = rLicencia;
	}
}
