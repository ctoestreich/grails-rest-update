package org.grails

class Person {

    String name

    static constraints = {
        name blank: false, nullable: false
    }
}
