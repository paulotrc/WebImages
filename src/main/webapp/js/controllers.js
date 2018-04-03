'use strict';

/* Controllers */


var app = angular.module('webimages.controllers', []);


// Clear browser cache (in development mode)
app.run(	function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});


app.controller('ProdutoListaCtrl',  listarProdutosFactory);

function listarProdutosFactory($scope, $http, $location){
	debugger
	$scope.filtro = '';
	$http({
        method : 'GET',
        url : '/webimages/rest/listarProdutos'
    }).then(function successCallback(response) {
        $scope.produtos = response.data;
    }, function errorCallback(response) {
        console.log(response.statusText);
    });
	
	$scope.createNewProduct = function () {
	  $location.path('/produtoCriar');
	};

}

app.controller('ProdutoCriarCtrl',  criarProdutosFactory);

function criarProdutosFactory($scope, $http, $location){
    $scope.produto = {name: null, description:null};
    
    $scope.salvar = function() {
    	console.log("testando...");
        console.log($scope.produto);
    };

}
