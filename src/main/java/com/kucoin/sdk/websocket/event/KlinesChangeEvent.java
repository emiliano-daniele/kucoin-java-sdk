package com.kucoin.sdk.websocket.event;

import com.kucoin.sdk.rest.response.KlinesResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * @author Emiliano G. Daniele
 *
 */
@Data
@EqualsAndHashCode(callSuper=false)
public class KlinesChangeEvent extends KlinesResponse {
}