const int TouchPin2=2;
const int TouchPin3=3;
const int TouchPin4=4;
const int TouchPin5=5;
const int TouchPin6=6;
const int TouchPin7=7;


void setup() {
  pinMode(TouchPin2, INPUT);
  pinMode(TouchPin3, INPUT);
  pinMode(TouchPin4, INPUT);
  pinMode(TouchPin5, INPUT);
  pinMode(TouchPin6, INPUT);
  pinMode(TouchPin7, INPUT);
  Serial.begin(9600);

  int sensorValue2 = digitalRead(TouchPin2);
  int sensorValue3 = digitalRead(TouchPin3);
  int sensorValue4 = digitalRead(TouchPin4);
  int sensorValue5 = digitalRead(TouchPin5);
  int sensorValue6 = digitalRead(TouchPin6);
  int sensorValue7 = digitalRead(TouchPin7);
}

void loop() {
  
  int sensorValue2 = digitalRead(TouchPin2);
  int sensorValue3 = digitalRead(TouchPin3);
  int sensorValue4 = digitalRead(TouchPin4);
  int sensorValue5 = digitalRead(TouchPin5);
  int sensorValue6 = digitalRead(TouchPin6);
  int sensorValue7 = digitalRead(TouchPin7);

    if (sensorValue2 == 1){
    Serial.write("Doctor 201\n");
    delay(500);
  }

  if (sensorValue3 == 1){
    Serial.write("Nurse 101\n");
    delay(500);
  }

  if (sensorValue4 == 1){
    Serial.write("IV Pump 01\n");
    delay(500);
  }

  if (sensorValue5 == 1){
    Serial.write("IV Pump 02\n");
    delay(500);
  }

  if (sensorValue6 == 1){
    Serial.write("Heart Monitor 01\n");
    delay(500);
  }

  if (sensorValue7 == 1){
    Serial.write("X-Ray 01\n");
    delay(500);
  }
}
