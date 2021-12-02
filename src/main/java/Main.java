import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Main extends TelegramLongPollingBot {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi api=new TelegramBotsApi();
        try {
            api.registerBot(new Main());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "Dream_Ticket_Bot";
    }

    @Override
    public String getBotToken() {
        return "5019889889:AAF7tMvsdZ_8p2gsAM4CqNQVFP5tdvS3t4s";
    }

    @Override
    public void onUpdateReceived(Update update) {

    }
}
