package com.demo

import grails.plugin.geb.ContainerGebSpec
import grails.testing.mixin.integration.Integration

@Integration
class NotCachingControllerIntegrationSpec extends ContainerGebSpec {

    void 'test action controller with different parameters'() {
        when:
        go '/demo/show/1'

        then:
        $().text().contains 'Hello World!1'

        when:
        go '/demo/show/2'

        then:
        $().text().contains 'Hello World!2'
    }
}