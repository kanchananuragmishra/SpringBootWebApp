(function(){

var app = angular.module("user",[]);

app.controller("DeleteController", ['$scope', '$http', function($scope,$http){


    $scope.delete = function (id) {
                $http({
                        url: "http://localhost:8080/delete/"+id,
                        method: "GET",
                        headers: {'Content-Type': 'application/json'}
                    }).success(function(data, status, headers, config) {
                        $scope.status = status;
                        $scope.user = {};
                        alert("Record Deleted");
                    }).error(function(data, status, headers, config) {
                        $scope.status = status;
                        alert("Can not delete the user")
                    });      }

}]);

})();

