(function(){

var app = angular.module("user",[]);

app.controller("AppController", ['$http', function($http){

      var controller = this;
      controller.userDetails = [];

          $http.get("/userDetails").success(function (data) {
                    controller.userDetails = data;
                  }
             );

}]);

})();


