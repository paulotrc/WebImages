'use strict';

/* Controllers */


var app = angular.module('ngdemo.controllers', []);


// Clear browser cache (in development mode)
//
// http://stackoverflow.com/questions/14718826/angularjs-disable-partial-caching-on-dev-machine
app.run(	function ($rootScope, $templateCache) {
    $rootScope.$on('$viewContentLoaded', function () {
        $templateCache.removeAll();
    });
});


app.controller('MyCtrl1', ['$scope', 'UserFactory', function ($scope, UserFactory) {
//    $scope.bla = 'bla from controller1';
    UserFactory.get({}, function (userFactory) {
        $scope.firstname = userFactory.firstName;
        $scope.lastname = userFactory.lastName;
    })
}]);

app.controller('ProductCtrl1', ['$scope', 'ProductFactory', function ($scope, ProductFactory) {
//    $scope.bla = 'bla from controller2';
    ProductFactory.get({}, function (productFactory) {
        $scope.name = productFactory.name;
        $scope.description = productFactory.description;
    })
}]);

app.controller('ListProductsCtrl1', ['$scope', 'ListProductsFactory', function ($scope, ListProductsFactory) {
//    $scope.bla = 'bla from controller3';
    ListProductFactory.get({}, function (listProductFactory) {
        $scope.name = productFactory.name;
        $scope.description = productFactory.description;
    })
}]);

app.controller('ProductListCtrl', ['$scope', 'ProductsFactory', 'ProductFactory', '$location',
    function ($scope, ProductsFactory, UserFactory, $location) {

        // callback for ng-click 'editProduct':
        $scope.editProduct = function (productId) {
            $location.path('/product-detail/' + productId);
        };

        // callback for ng-click 'deleteUser':
        $scope.deleteProduct = function (productId) {
        	ProductFactory.deletar({ id: productId });
            $scope.products = ProductsFactory.query();
        };

        // callback for ng-click 'createProduct':
        $scope.createNewProduct = function () {
            $location.path('/product-creation');
        };

        $scope.products = ProductsFactory.query();
    }]);
