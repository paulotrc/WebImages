'use strict';

// Declare app level module which depends on filters, and services
angular.module('webimages', [
	'webimages.filters', 
	'webimages.services', 
	'webimages.directives', 
	'webimages.controllers'
	]).
    config(['$routeProvider', function ($routeProvider) {
        $routeProvider.when('/produtoCriar', {templateUrl: 'view/produto-criar.html', controller: 'ProdutoCriarCtrl'});
        $routeProvider.when('/produtoDetalhe', {templateUrl: 'view/produto-detalhe.html', controller: 'ProdutoDetalheCtrl'});
        $routeProvider.when('/produtoLista', {templateUrl: 'view/produto-listar.html', controller: 'ProdutoListaCtrl'});
        $routeProvider.otherwise({redirectTo: '/produtoLista'});
    }]);