package com.rsg.labs.jhipster.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Java React Pres.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
