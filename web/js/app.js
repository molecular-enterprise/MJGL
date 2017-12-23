var MJGLApp = angular.module('MJGLApp', ['routeMJGL']);

var routeMJGL = angular.module('routeMJGL', ['ngRoute']);

routeMJGL.config(['$routeProvider', function($routeProvider){

	$routeProvider
	.when('/accueil', {
		templateUrl: 'templates/accueil.html',
		controller: 'ctrl-accueil'
	})
        
        .when('/liste', {
		templateUrl: 'templates/liste.html',
		controller: 'ctrl-liste'
	})

	.otherwise({
		redirectTo: '/accueil'
	});

}]);