MJGLApp.controller('ctrl-accueil', ['$scope', '$http', '$timeout', 'fwTestService', function($scope, $http, $timeout){

    $http.get("http://localhost:8084/MJGL/index").success(function(result){

        if(!result.error){
            
            $scope.welcome = result.data;
            
        }

    });

}])

.controller('ctrl-liste', ['$scope', '$http', '$timeout', 'fwTestService', function($scope, $http, $timeout){

    $http.get("http://localhost:8084/MJGL/liste").success(function(result){

        if(!result.error){
            
            $scope.liste = result.data;
            
        }

    });

}]);