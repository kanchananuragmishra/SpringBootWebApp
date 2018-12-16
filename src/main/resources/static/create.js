(function(){

var app = angular.module("user",[]);

app.controller("CreateController", ['$scope', '$http', function($scope,$http){


    $scope.create = function (user) {
                $http({
                        url: "http://localhost:8080/create",
                        method: "POST",
                        headers: {'Content-Type': 'application/json'},
                        data: user
                    }).success(function(data, status, headers, config) {
                        $scope.status = status;
                        $scope.user = {};
                        alert("Record saved");
                    }).error(function(data, status, headers, config) {
                        $scope.status = status;
                    });      }

}]);

})();

