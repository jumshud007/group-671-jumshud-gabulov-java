package classwork_3;

public class Classwork3 {
public static void main(String[] args) {
//1. Попроси пользователя ввести возраст. Если возраст больше или равен 18, выведи "Вы взрослый", иначе "Вы ещё ребёнок".
byte age = 17;
if(age >= 18) {
	System.out.println("Вы взрослый");
}else {
	System.out.println("Вы ещё ребёнок");
}
//2. Введи число. Если оно положительное — выведи "Положительное", иначе "Отрицательное или ноль".
int number = -5;
if(number > 0) {
	System.out.println("Положительное");
} else {
	System.out.println("Отрицательное или ноль");
}
//3. Введи оценку (от 1 до 5). Если 5 — "Отлично", если 4 — "Хорошо", если 3 — "Удовлетворительно", иначе "Неудовлетворительно".
byte mark = 4;
if (mark == 5) {
	System.out.println("Отлично");
} else if (mark == 4) {
	System.out.println("Хорошо");
} else if (mark == 3) {
	System.out.println("Удовлетворительно");
} else if (mark == 2) {
	System.out.println("Неудовлетворительно");
} else {
	System.out.println("Некорректная оценка");
}
;
//4. Введи температуру на улице. Если больше 25 — "Жарко", если от 10 до 25 — "Тепло", иначе "Холодно".
byte temperature = 25;
if(temperature > 25) {System.out.println("Жарко");}
else if(temperature >= 10 && temperature <= 25) {System.out.println("Тепло");}
else {System.out.println("Холодно");}
//5. Введи число дня недели (1–7). Используя switch, выведи название дня (1 — Понедельник, ..., 7 — Воскресенье).
byte dayofweek = 2;
switch(dayofweek) {
case 1 -> System.out.println("Понедельник");
case 2 -> System.out.println("Вторник");
case 3 -> System.out.println("Среда");
case 4 -> System.out.println("Четверг");
case 5 -> System.out.println("Пятница");
case 6 -> System.out.println("Суббота");
case 7 -> System.out.println("Воскресенье");
};
//6. Попроси ввести букву оценки (A, B, C, D, F). По switch выведи: A — "Отлично", B — "Хорошо", C — "Средне", D — "Плохо", F — "Не сдал".
char letter = 'A';
switch(letter) {
case 'A' -> System.out.println("Отлично");
case 'B' -> System.out.println("Хорошо");
case 'C' -> System.out.println("Средне");
case 'D' -> System.out.println("Плохо");
case 'F' -> System.out.println("Не сдал");
}
//7. Введи два числа. Если первое больше второго — выведи "Первое больше", иначе "Второе не меньше".
int a = 4;
int b = 5;
if(a > b) {
	System.out.println("Первое больше");
} else {
	System.out.println("Второе не меньше");
}
//8. Введи время суток (0–23). Если 6–11 — "Утро", 12–17 — "День", 18–22 — "Вечер", иначе "Ночь".
byte time = 4;
if (time >= 6 && time <= 11) {
	System.out.println("Утро");
} else if (time >= 12 && time <= 17) {
	System.out.println("День");
} else if (time >= 18 && time <= 22) {
	System.out.println( "Вечер");
} else {
	System.out.println("Ночь");
}
;
//9. Введи номер месяца (1–12). По switch выведи время года: 12,1,2 — "Зима", 3–5 — "Весна", 6–8 — "Лето", 9–11 — "Осень".
byte month = 2;
switch(month) {
case 1 -> System.out.println("Зима");
case 2 -> System.out.println("Зима");
case 3 -> System.out.println("Весна");
case 4 -> System.out.println("Весна");
case 5 -> System.out.println("Весна");
case 6 -> System.out.println("Лето");
case 7 -> System.out.println("Лето");
case 8 -> System.out.println("Лето");
case 9 -> System.out.println("Осень");
case 10 -> System.out.println("Осень");
case 11 -> System.out.println("Осень");
case 12 -> System.out.println("Зима");
default -> System.out.println("Некорректный месяц");
};
//10. Введи число. Если оно чётное — "Чётное", иначе "Нечётное".
int num = 4;
if(num % 2 == 0) {
	System.out.println("Чётное");
} else {
	System.out.println("Нечётное");
}
//11. Попроси ввести пол ('М' или 'Ж'). Если 'М' — "Привет, парень!", если 'Ж' — "Привет, девочка!", иначе "Не понял пол".
char pol = 'М';
if(pol == 'М') {
	System.out.println("Привет, парень!");
} else if( pol == 'Ж') {
	System.out.println("Не понял пол");
} else {
	System.out.println("Не понял пол");
}
//12. Введи балл от 0 до 100. Если >=90 — "5", 75–89 — "4", 50–74 — "3", иначе "2".
byte score = 92;
if(score < 60){System.out.println(2);}
else if(score >= 60 && score < 75) {System.out.println(3);}
else if(score >= 75 && score < 90) {System.out.println(4);}
else if(score >= 90 && score < 101) {System.out.println(5);}
else{System.out.println("Ошибка");}
//13. Введи название цвета светофора ("красный", "жёлтый", "зелёный"). По switch скажи, можно ли переходить дорогу.
String colour = "красный";
switch(colour) {
case "красный" -> System.out.println("Stop");
case "жёлтый" -> System.out.println("Wait");
case "зелёный" -> System.out.println("Go");
}
//14. Введи возраст. Если меньше 7 — "Детский сад", 7–17 — "Школа", иначе "Взрослый".
byte age1 = 17;
if(age1 < 7) {
	System.out.println("Детский сад");
}else if(age1 >= 7 && age1 < 18){
	System.out.println("Школа");
} else {
	System.out.println("Взрослый");
}
//15. Введи число от 1 до 4. По switch выведи название четверти года.
byte cetvert = 2;
switch(cetvert) {
case 1 -> System.out.println("First cetvert");
case 2 -> System.out.println("Second cetvert");
case 3 -> System.out.println("Third cetvert");
case 4 -> System.out.println("Fourth cetvert");
};
//16. Введи свой рост в сантиметрах. Если меньше 150 — "Низкий", 150–180 — "Средний", больше 180 — "Высокий".
int rost = 150;
if(rost < 150) {
	System.out.println("Низкий");
}else if(rost >= 150 && rost <= 180){
	System.out.println("Средний");
} else {
	System.out.println("Высокий");
}
//17. Введи количество очков в игре. Если больше 100 — "Победитель!", иначе "Попробуй ещё".
 int ocki = 102;
 if(ocki > 100) {
 System.out.println("Победитель!");
 } else {
	 System.out.println("Попробуй ещё");
 }
 //18. Введи символ операции (+, -, *, /). По switch выведи название операции словами.
 String op = "*";
 switch(op) {
 case "+" -> System.out.println("Сложение");
 case "-" -> System.out.println("Вычитание");
 case "*" -> System.out.println("Умножение");
 case "/" -> System.out.println("Деление");
 }
//19. Введи день недели словом (понедельник и т.д.). По switch скажи, рабочий это день или выходной.
 byte dayofweek1 = 2;
 switch(dayofweek1) {
 case 1 -> System.out.println("рабочий");
 case 2 -> System.out.println("рабочий");
 case 3 -> System.out.println("рабочий");
 case 4 -> System.out.println("рабочий");
 case 5 -> System.out.println("рабочий");
 case 6 -> System.out.println("выходной");
 case 7 -> System.out.println("выходной");
 };
//20. Введи число от 1 до 10. Если оно равно твоему счастливому числу (заранее выбери), выведи "Угадал!", иначе "Не угадал".
byte mynum = 1;
byte notmynum = 2;
if(mynum == notmynum) {
	System.out.println("Угадал!");
} else {
	System.out.println("Не угадал");
}
//21. Введи два числа. Если они равны — "Равны", иначе "Разные".
byte mynum1 = 1;
byte notmynum1 = 2;
if(mynum1 == notmynum1) {
	System.out.println("Равны");
} else {
	System.out.println("Разные");
}
//22. Введи температуру воды. Если 0 или меньше — "Лёд", 1–99 — "Вода", 100 и больше — "Пар".
int water = 150;
if(water <= 0) {
	System.out.println("Лёд");
}else if(water >= 1 && water <= 99){
	System.out.println("Вода");
} else {
	System.out.println("Пар");
}
//23. Введи код ошибки (404, 500, 200). По switch выведи объяснение ошибки сайта.
int error = 404;
switch(error) {
case 404 -> System.out.println("Страница не найдена");
case 500 -> System.out.println("Ошибка сервера");
case 200 -> System.out.println("запрос пользователя выполнен успешно");
}
//24. Введи количество домашних животных. Если 0 — "Нет питомцев", 1 — "Нет питомцев", больше — "Много питомцев".
byte colvo = 0;
if(colvo == 0) {
	System.out.println("Нет питомцев");
}else if(colvo == 1 ){
	System.out.println("Нет питомцев");
} else {
	System.out.println("Много питомцев");
}
//25. Введи отметку по поведению (5,4,3,2). Если меньше 4 — "Поговорим с родителями", иначе "Молодец".
byte mark2 = 5;
if(mark < 4) {
	System.out.println("Поговорим с родителями");
} else {
	System.out.println("Молодец");
}
//26. Введи название планеты по номеру (1–8). По switch выведи её название.
byte planet = 2;
switch(planet) {
case 1 -> System.out.println("Mercury");
case 2 -> System.out.println("Venus");
case 3 -> System.out.println("Earth");
case 4 -> System.out.println("Mars");
case 5 -> System.out.println("Jupiter");
case 6 -> System.out.println("Saturn");
case 7 -> System.out.println("Uranus");
case 8 -> System.out.println("Neptune");
};
//27. Введи скорость ветра в км/ч. Если больше 50 — "Ураган", 30–50 — "Сильный ветер", иначе "Спокойно".
byte speed = 0;
if(speed > 50) {
	System.out.println("Ураган");
}else if(speed >= 30 && speed <= 50 ){
	System.out.println("Сильный ветер");
} else {
	System.out.println("Спокойно");
}
//28. Введи ответ на вопрос "2+2=". Если 4 — "Правильно!", иначе "Неправильно".
byte answer = 5;
if(answer == 4) {
	System.out.println("Правильно!");
} else {
	System.out.println("Неправильно");
}
//29. Введи размер обуви. Если меньше 35 — "Детский", 35–42 — "Женский", больше 42 — "Мужской".
byte size = 0;
if(size < 35) {
	System.out.println("Детский");
}else if(size >= 35 && size <= 42 ){
	System.out.println("Женский");
} else {
	System.out.println("Мужской");
}
//30. Введи код языка (en, ru, es, fr). По switch выведи "Hello", "Привет", "Hola" или "Bonjour".
String language = "en";
switch(language) {
case "en" -> System.out.println("Hello");
case "ru" -> System.out.println("Привет");
case "es" -> System.out.println("Hola");
case "fr" -> System.out.println("Bonjour");
}
//31. Введи количество игроков. Если 2 — "Дуэль", 3–4 — "Малая команда", больше 4 — "Большая команда".
byte collvo = 2;
if(collvo == 2) {
	System.out.println("Дуэль");
}else if(collvo >= 3 && collvo <= 4 ){
	System.out.println("Малая команда");
} else if(collvo > 4) {
	System.out.println("Большая команда");
}
//32. Введи уровень батареи телефона (0–100). Если меньше 20 — "Заряди телефон!", иначе "Всё ок".
byte percent = 40;
if(percent < 20) {
	System.out.println("Заряди телефон!");
}else{
	System.out.println("Всё ок");
}
//33. Введи номер этажа (1–20). Если больше 10 — "Высокий этаж", иначе "Низкий".
byte flat = 20;
if(flat > 10) {
	System.out.println("Высокий этаж");
} else {
	System.out.println("Низкий");
}
//34. Введи любимый школьный предмет (математика, русский, физкультура и т.д.). По switch выведи забавный комментарий.
String subject = "математика";
switch(subject) {
case "математика" -> System.out.println("Helll nahhhhhhh");
case "русский" -> System.out.println("Bruhhhhhhhhhh");
case "физкультура" -> System.out.println("Perfecttttttttttttt");
}
//35. Введи результат броска кубика (1–6). По switch скажи, какое действие в настольной игре выполнить.
byte kubik = 4;
switch(kubik) {
case 1 -> System.out.println("1 step");
case 2 -> System.out.println("2 step");
case 3 -> System.out.println("3 step");
case 4 -> System.out.println("4 step");
case 5 -> System.out.println("5 step");
case 6 -> System.out.println("6 step");
}
//36. Введи знак зодиака по номеру месяца и дня (упрощённо — только месяц). По switch выведи знак.
byte month1 = 2;
switch(month1) {
case 1 -> System.out.println("Water Bearer");
case 2 -> System.out.println("Fish");
case 3 -> System.out.println("Ram");
case 4 -> System.out.println("Bull");
case 5 -> System.out.println("Twins");
case 6 -> System.out.println("Crab");
case 7 -> System.out.println("Lion");
case 8 -> System.out.println("Virgin");
case 9 -> System.out.println("Balance)");
case 10 -> System.out.println("Scorpion");
case 11 -> System.out.println("Archer");
case 12 -> System.out.println("Goat");
};
//37. Введи количество конфет. Если больше 10 — "Слишком много сладкого!", иначе "Можно съесть".
byte konfet = 10;
if(konfet > 10) {
	System.out.println("Слишком много сладкого!");
} else {
	System.out.println("Можно съесть");
}
//38. Введи код страны (7 — Россия, 1 — США, 44 — Великобритания). По switch выведи столицу.
byte country = 7;
switch(country) {
case 7 -> System.out.println("Россия");
case 1 -> System.out.println("США");
case 44 -> System.out.println("Великобритания");
}
//39. Введи ответ "да" или "нет". Если "да" — "Согласен", если "нет" — "Не согласен", иначе "Не понял".
String otvet = "да";
if(otvet == "да") {
	System.out.println("Согласен");
} else if( otvet == "нет") {
	System.out.println("Не согласен");
} else {
	System.out.println("Не понял");
}

//40. Введи время в минутах до конца урока. Если меньше 5 — "Скоро звонок!", иначе "Ещё долго".
byte time1 = 5;
if(time1 < 5) {
   System.out.println("Скоро звонок!");
} else {
	System.out.println("Ещё долго");
}
//41. Введи тип транспорта (автобус, метро, велосипед). По switch выведи среднюю скорость.
String type = "автобус";
switch(type) {
case "автобус" -> System.out.println("45kmh");
case "метро" -> System.out.println("185kmh");
case "велосипед" -> System.out.println("15kmh");
}
//42. Введи настроение (1–5). По switch выведи подходящий смайлик в тексте.
byte nastro = 1;
switch(nastro) {
case 1 -> System.out.println("very sad");
case 2 -> System.out.println("sad");
case 3 -> System.out.println("normal");
case 4 -> System.out.println("happppppppppppppy");
case 5 -> System.out.println("veryyyyy happppppppppppppy");
}
//43. Введи количество ошибок в диктанте. Если 0 — "Отлично!", 1–3 — "Хорошо", больше — "Надо потренироваться".
byte mistakes = 0;
if(mistakes == 0) {
	System.out.println("Отлично!");
} else if( mistakes >= 1 && mistakes <= 3) {
	System.out.println("Хорошо");
} else {
	System.out.println("Надо потренироваться");
}
//44. Введи код животного (1-кот, 2-собака, 3-попугай). По switch выведи звук, который оно издаёт.
byte animal = 1;
switch(animal){
case 1 -> System.out.println("maauuu"); 
case 2 -> System.out.println("gavvv"); 
case 3 -> System.out.println("muuuu"); 
}

//45. Введи вес посылки в кг. Если меньше 1 — "Письмо", 1–10 — "Посылка", больше — "Груз".
byte kilo = 1;
if(kilo < 1) {
	System.out.println("Письмо");
} else if( kilo >= 1 && kilo <= 10) {
	System.out.println("Посылка");
} else {
	System.out.println("Груз");
}
//46. Введи номер пальца (1–5). По switch выведи его название (большой, указательный и т.д.).
byte finger = 1;
switch(finger){
case 1 -> System.out.println("большой"); 
case 2 -> System.out.println("указательный"); 
case 3 -> System.out.println("sredniy"); 
case 4 -> System.out.println("bezimanniy"); 
case 5 -> System.out.println("mizincik"); 
}
//47. Введи результат теста (A, B, C). Если A или B — "Прошёл", иначе "Не прошёл".
char test = 'A';
if(test == 'A' || test == 'B') {
	System.out.println("Прошёл");
} else {
	System.out.println("Не прошёл");
}
//48. Введи текущий уровень в игре (1–10). Если 10 — "Максимальный уровень!", иначе "Ещё качаться".
byte uroven = 1;
if(uroven == 10) {
	System.out.println("Максимальный уровень!");
} else {
System.out.println("Ещё качаться");
}
//49. Введи код погоды (1-солнечно, 2-дождь, 3-снег). По switch посоветуй, что надеть.
byte pogoda = 1;
switch(pogoda) {
case 1 -> System.out.println("nicheqo"); 
case 2 -> System.out.println("kurtku"); 
case 3 -> System.out.println("shubu"); 
}
//50. Введи свой любимый цвет на английском (red, green, blue). По switch выведи перевод на русский.
String colour1 ="red";
switch(colour1) {
case "red" -> System.out.println("красный");
case "green" -> System.out.println("зелёный");
case "blue" -> System.out.println("синий");
}
}
}