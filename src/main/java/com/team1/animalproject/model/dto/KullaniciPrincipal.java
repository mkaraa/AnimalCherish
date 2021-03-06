package com.team1.animalproject.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@EqualsAndHashCode (of = "id")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude (content = Include.NON_NULL)
public class KullaniciPrincipal implements Serializable {

	private static final long serialVersionUID = 1810854384164649482L;

	private String id;

	private List<String> yetkiler;

	private String smth;

	private String aramaKelimesi;

}
 