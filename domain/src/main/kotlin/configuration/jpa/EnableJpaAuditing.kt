package com.example.xquareinterviewassignment.configuration.jpa

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@EntityScan("user.entity", "feed.entity")
@Configuration
class EnableJpaAuditing
