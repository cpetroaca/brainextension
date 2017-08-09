package com.brainext.core.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
class ConfigServiceImpl implements ConfigService {
	@Value("${nlp.server.url}")
	private String nlpServerUrl;
	
	/**
	 * Get the NLP Server URL
	 * @return
	 */
	@Override
	public String getNlpServerUrl() {
		return nlpServerUrl;
	}
}
