'use strict';

/* Services */

var services = angular.module('webimages.services', ['ngResource']);

services.factory('ListarProdutosFactory', function ($resource) {
	debugger
	return $resource('/webimages/rest/listarProdutos', {}, {
		query: {
			method: 'GET',
			params: {},
			isArray: true
		}
	})
});

//services.factory('UserFactory', function ($resource) {
//    return $resource('/rest/users', {}, {
//        query: {
//            method: 'GET',
//            params: {},
//            isArray: false
//        }
//    })
//});
//
//services.factory('ProductFactory', function ($resource) {
//	return $resource('/rest/product', {}, {
//		query: {
//			method: 'GET',
//			params: {},
//			isArray: false
//		}
//	})
//});

//services.factory('ProductsFactory', function ($resource) {
//    return $resource('/rest/products', {}, {
//        query: { method: 'GET', isArray: true },
//        create: { method: 'POST' }
//    })
//});
//
//services.factory('ProductFactory', function ($resource) {
//    return $resource('/rest/products/:id', {}, {
//        show: { method: 'GET' },
//        update: { method: 'PUT', params: {id: '@id'} },
//        deletar: { method: 'DELETE', params: {id: '@id'} }
//    })
//});
