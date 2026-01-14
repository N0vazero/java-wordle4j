package ru.yandex.practicum;

import ru.yandex.practicum.exception.InGameRuntimeException;

import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        try {
            HashSet<String> dict = WordsPreparer.getDictionary();
            GameProcess gameProcess = new GameProcess(dict);
            gameProcess.game();
        } catch (RuntimeException e) {
            new InGameRuntimeException(e.getMessage());
        }
    }
}