package com.egakat.wms.maestros.dto.ordenes;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrdShipmentLineLoteDto {

	@NotNull
	@Size(max = 10)
	private String ordlin;

	@NotNull
	@Size(max = 50)
	private String prtnum;

	@NotNull
	@Size(max = 25)
	private String lotnum;

	@NotNull
	@Size(max = 4)
	private String invsts;

	@NotNull
	@Size(max = 25)
	private String orgcod;

	private LocalDateTime expireDte;

	private int untqty;
}
