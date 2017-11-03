'use strict';

// Declare app level module which depends on filters, and services
angular.module('ngdemo', ['ngdemo.filters', 'ngdemo.services', 'ngdemo.directives', 'ngdemo.controllers']).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/view1', {templateUrl: 'partials/partial1.html', controller: 'MyCtrl1'});
        $routeProvider.when('/product', {templateUrl: 'partials/partial2.html', controller: 'ProductCtrl1'});
        $routeProvider.when('/productsCreation', {templateUrl: 'partials/product-creation.html', controller: 'ProductCreationCtrl'});
        $routeProvider.when('/productsDetail', {templateUrl: 'partials/product-detail.html', controller: 'ProductDetailCtrl'});
        $routeProvider.when('/productsList', {templateUrl: 'partials/product-list.html', controller: 'ProductListCtrl'});
        $routeProvider.otherwise({redirectTo: '/view1'});
    }]);