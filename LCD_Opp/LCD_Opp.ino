 

rgb_lcd lcd(8);

const int colorR = 255;
const int colorG = 0;
const int colorB = 0;

void setup() {
  lcd.begin(16,2)

  lcd.serRGB(colorR, colorG, colorB);

  lcd.print("hello, world!");

  delay(1000);
}

void loop() {
  lcd.setCursor(0,1);
  lcd.print(millis()/1000);
  delay(100);
}
