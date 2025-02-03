package Section9

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Location with Kotlin</title>

<!-- Import Kotlin JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/kotlin/1.8.0/kotlin.js"></script>

<script type="text/javascript">
function getUserLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(
            function(position) {
                var latitude = position.coords.latitude;
                var longitude = position.coords.longitude;
                document.getElementById("result").innerHTML = "Latitude: " + latitude + ", Longitude: " + longitude;
            },
            function(error) {
                document.getElementById("result").innerHTML = "Error: " + error.message;
            }
        );
    } else {
        document.getElementById("result").innerHTML = "Geolocation is not supported by this browser.";
    }
}
</script>
</head>
<body>
<h1>Get Your Location</h1>
<button id="locationButton" onclick="getUserLocation()">Get Location</button>
<div id="result"></div>
</body>
</html>
