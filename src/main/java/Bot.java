import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {



    //бот получает соощения выполн. ф-ия
    @Override
    public void onUpdateReceived(Update update) {
        update.getUpdateId();   //обновл. инф. о юзере

        SendMessage sendMessage = new SendMessage().setChatId(update.getMessage().getChatId());


        switch (update.getMessage().getText()){
            case "Питер" :
                sendMessage.setText("Посетите Петергоф");
                break;

            case "Москва" :
                sendMessage.setText("Не забудьте посетить Красную Площадь");
                break;

            case "Минск" :
                sendMessage.setText("Сгоняй в национальную библиотеку");
                break;


            default:
                sendMessage.setText("Некорректный ввод!");
                break;
        }




        try {
            execute(sendMessage);
        }catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    //получение имени бота
    @Override
    public String getBotUsername() {
        return "@BestTouristBot";
    }

    //получение токена бота
    @Override
    public String getBotToken() {
        return "1529852801:AAELj5FDxkz65oHZ4c8OcvY72G5COJ5uohc";
    }
}
