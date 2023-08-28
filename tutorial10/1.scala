 object  temp{
   def calculateAverage(temperatures: List[Double]): Double = {
     val fahrenheitTemperatures = temperatures.map(celsius => (celsius * 9 / 5) + 32)
     val totalFahrenheit = fahrenheitTemperatures.reduce((a, b) => a + b)
     totalFahrenheit / temperatures.length
   }

   def main(args: Array[String]): Unit = {
     val temperatures = List(0.0, 10.0, 20.0, 30.0)
     val averageFahrenheit = calculateAverage(temperatures)
     println(s"Average Fahrenheit temperature: $averageFahrenheit")
   }
 }