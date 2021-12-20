package br.com.henriquelacerda.kafkaconsumer

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "custom-configs")
open class CustomConfigs {
    var autoStart: Boolean = true;
}