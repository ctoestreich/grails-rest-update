package org.grails

import grails.rest.*
import grails.converters.*
import grails.web.http.HttpHeaders

import static org.springframework.http.HttpStatus.OK

class PersonController extends RestfulController {
    PersonController(){
        super(Person)
    }
}
