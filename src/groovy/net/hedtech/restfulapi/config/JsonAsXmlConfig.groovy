/*****************************************************************************
Copyright 2013 Ellucian Company L.P. and its affiliates.
******************************************************************************/

package net.hedtech.restfulapi.config

import org.codehaus.groovy.grails.commons.GrailsApplication

class JsonAsXmlConfig {

    boolean enableDefault
    def marshallers = []
    def extractor


    JsonAsXmlConfig enableDefault(boolean b) {
        this.enableDefault = b
        return this
    }


    JsonAsXmlConfig representation(Closure c) {
        RepresentationConfig config = new RepresentationConfig()
        c.delegate = config
        c.resolveStrategy = Closure.DELEGATE_FIRST
        c.call()
        representations[config.mediaType] = config
        this
    }

    JsonAsXmlConfig addMarshaller(Closure c) {
        MarshallerConfig config = new MarshallerConfig()
        c.delegate = config
        c.resolveStrategy = Closure.DELEGATE_FIRST
        c.call()
        marshallers.add config
        this
    }

    JsonAsXmlConfig extractor(Object obj) {
        this.extractor = obj
        this
    }


}