package com.softdesign.devintensive.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.softdesign.devintensive.R;
import com.softdesign.devintensive.utils.ConstantManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Константа общепринятая подписываем где находимся для логирования
    private static final String TAG = ConstantManager.TAG_PREFIX + "MainActivity";
//    protected EditText mEditText;
//    protected Button mRedButton, mGreenButton;
//    protected int mColorMode;

    /**
     * Метод вызываеться при создании активити (после изменения конфигурации возврата к текущей)
     * активности после его уничтожения
     * в данном методе инициализация производиться
     * UI пользовательский интерфейс
     * инициализация статических данных активности
     * связь данных со списками(инициализация адаптеров)
     *
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "OnCreate");
//        mRedButton = (Button) findViewById(R.id.red_btn);
//        mGreenButton = (Button) findViewById(R.id.green_btn);
//        mEditText = (EditText) findViewById(R.id.textview);
//        mGreenButton.setOnClickListener(this);
//        mRedButton.setOnClickListener(this);
        if (savedInstanceState == null) {
            //активити запускаеться впервые
        } else {
            //активити уже создалась

        }
    }

        /**
         * метод вызываеться при старте активити перед моментом того как ui станет доступен пользователю
         * как правило в данном методе происходит регистрация подписки и события остановка которых была
         * произведена в onStop
         */

        @Override
        protected void onStart () {
            super.onStart();
            Log.d(TAG, "onStart");
        }

        /**
         * Метод запускаеться когда активити становиться доступна пользователю для взаимодействия
         * в данном методе как правило происходит запуск анимации/видео/запуск Broadcast
         * необходимых для реализации UI логики запуска выполнения потоков
         * метод должен быть максимально легковестным для максимальной отзывчивости UI
         */
        @Override
        protected void onResume () {
            super.onResume();
            Log.d(TAG, "onResume");
        }

        /**
         * Метод вызываеться когда текущая активность теряет фокус но остаеться видимой
         * (всплытие диалогового окна/частичное перекрытие другой активити)
         * В данном методе реализуют сохранение легковесных UI данных/анимации/аудио/видио итд.
         */
        @Override
        protected void onPause () {
            super.onPause();
            Log.d(TAG, "onPause");
        }

        /**
         * Метод вызываеться когда активити становиться невидимой для пользователя
         * В данном методе происходит отписка от событий остановка сложных анимаций ,
         * сложных операций по сохранению данных/прерываний запусков потоков итд.
         */

        @Override
        protected void onStop () {
            super.onStop();
            Log.d(TAG, "onStop");
        }

        /**
         * Метод вызываеться при окончании работы активити(когда это происходит системно или после
         * вызова метода finish())
         */

        @Override
        protected void onDestroy () {
            super.onDestroy();
            Log.d(TAG, "onDestroy");
        }

        /**
         * Метод вызываеться при рестарте активити возобновляет работу после вызова метода onStop
         * в данном методе реализуються специфическая бизнес логика которая должна быть реализована
         * именно при рестарие активити(например запрос к серверу который необходимо вызвать при возвращении из другой
         * активности(обновление данных подписки на определенное событие проинициализация на  другом экране, специфическая бизнес логика при перезапуске))
         */
        @Override
        protected void onRestart () {
            super.onRestart();
            Log.d(TAG, "onRestart");
        }

        @Override
        public void onClick (View v){
            switch (v.getId()) {

            }
        }

        @Override
        protected void onSaveInstanceState (Bundle outState){
            super.onSaveInstanceState(outState);

        }
    }


