/*****************************************************************************
Copyright 2013 Ellucian Company L.P. and its affiliates.
******************************************************************************/

package net.hedtech.restfulapi.config

import org.codehaus.groovy.grails.commons.GrailsApplication

class RepresentationConfig {

    String mediaType
    boolean jsonAsXml = false
    def marshallers = []
    def extractor


}