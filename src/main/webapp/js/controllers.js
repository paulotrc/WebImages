'use strict';

/* Controllers */


var app = angular.module('webimages.controllers', []);


// Clear browser cache (in development mode)
//
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(	function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});


app.controller('ProdutoListaCtrl',  listarProdutosFactory);

function listarProdutosFactory($scope, $http){
	debugger
//	var produtos = [];
//	produtos.push({nome:"Teste",descricao:"testeDescricao"});
//	produtos.push({nome:"Teste2",descricao:"testeDescricao2"});
//	$scope.produtos = produtos;
	
	
	$http({
        method : 'GET',
        url : '/webimages/rest/listarProdutos'
    }).then(function successCallback(response) {
        $scope.produtos = response.data;
    }, function errorCallback(response) {
        console.log(response.statusText);
    });
}
	
	
//	ListarProdutosFactory.get({}, function (listarProdutosFactory) {
//		console.log(listarProdutosFactory);
//        $scope.produtos = listarProdutosFactory.query();
//    })
//}




//app.controller('MyCtrl1', ['$scope', 'UserFactory', function ($scope, UserFactory) {
////    $scope.bla = 'bla from controller1';
//    UserFactory.get({}, function (userFactory) {
//        $scope.firstname = userFactory.firstName;
//        $scope.lastname = userFactory.lastName;
//    })
//}]);
//
//app.controller('ProductCtrl1', ['$scope', 'ProductFactory', function ($scope, ProductFactory) {
////    $scope.bla = 'bla from controller2';
//    ProductFactory.get({}, function (productFactory) {
//        $scope.name = productFactory.name;
//        $scope.description = productFactory.description;
//    })
//}]);

//app.controller('ProdutoListaCtrl',  listarProdutosFactory);
//
//	function listarProdutosFactory($scope, ListarProdutosFactory){
//		debugger
//		ListarProdutosFactory.get({}, function (produtos) {
//			console.log(produtos);
//	        $scope.produtos = produtos;
//	    })
//	}
//

//app.controller('ProdutoListaCtrl', ['$scope', 'ProdutosFactory', 'ProdutoFactory', '$location',
//    function ($scope, ProdutosFactory, UserFactory, $location) {
//
//        // callback for ng-click 'editProduct':
//        $scope.editProduct = function (productId) {
//            $location.path('/produto-detalhe/' + productId);
//        };
//
//        // callback for ng-click 'deleteUser':
//        $scope.deleteProduct = function (productId) {
//        	ProductFactory.deletar({ id: productId });
//            $scope.products = ProductsFactory.query();
//        };
//
//        // callback for ng-click 'createProduct':
//        $scope.createNewProduct = function () {
//            $location.path('/produto-criar');
//        };
//
//        $scope.products = ProductsFactory.query();
//    }]);
