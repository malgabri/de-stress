package org.ifcasl.destress

import grails.plugin.springsecurity.annotation.Secured


class AdminController {

	//@Secured(['ROLE_ADMIN'])
    def index() {
		//def modelList = ['Lesson', 'Exercise', 'Test', 'Word']
		def modelList = ['Exercise', 'DiagnosisMethod', 'FeedbackMethod']
		[modelList:modelList]
	}
}
