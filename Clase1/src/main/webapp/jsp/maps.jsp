<!DOCTYPE html>
<html>
  <head>
    <style type="text/css">
      html, body { height: 100%; margin: 0; padding: 0; }
      #map { height: 100%; }
    </style>
  </head>
  <body>
    <div id="map"></div>
    <script type="text/javascript">
function initMap() {
  var myLatLng = {lat: 35.141432, lng: -90.052629};

  var map = new google.maps.Map(document.getElementById('map'), {
    zoom: 21,
    center: myLatLng
  });
  
  var contentString = 'come down and play';
    
  var infowindow = new google.maps.InfoWindow({
    content: contentString
  });

  var marker = new google.maps.Marker({
    position: myLatLng,
    map: map,
    title: 'Hi! I´m a marker'
  });
  marker.addListener('click', function() {
    infowindow.open(map, marker);
  });
}
    </script>
    <script async defer
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDNV3Zx5WBmB9r90ztzp17rLdZSro0v9oI&callback=initMap">
    </script>
  </body>
</html>
