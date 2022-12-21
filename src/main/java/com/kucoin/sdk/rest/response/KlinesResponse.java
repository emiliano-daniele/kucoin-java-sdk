package com.kucoin.sdk.rest.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
/**
 * 
 * @author Emiliano G. Daniele
 *
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class KlinesResponse {

	private String symbol;
	
	private List<String> candles;
	
	private long time;
		
}