package edu.onecommitman.framework.steps;

import edu.onecommitman.framework.managers.PageManager;
import io.cucumber.java.ru.И;

public class HomePageStep {

    PageManager pageManager = PageManager.getPageManager();

    @И("Закрытия сообщения cookies")
    public void закрытия_сообщения_cookies() {

    }
    @И("Выбираем {string} в главном меню")
    public void выбираем_в_главном_меню(String string) {

    }
    @И("Выбираем {string} в подменю главного меню")
    public void выбираем_в_подменю_главного_меню(String string) {

    }
    @И("Проверяем что открылась страница {string}")
    public void проверяем_что_открылась_страница(String string) {

    }
    @И("Прокрутить страницу до заголовка {string}")
    public void прокрутить_страницу_до_заголовка(String string) {

    }
    @И("Заполняем поля формы:")
    public void заполняем_поля_формы(io.cucumber.datatable.DataTable dataTable) {

    }
    @И("Убрать галочку {string}")
    public void убрать_галочку(String string) {

    }
    @И("Поставить галочку {string}")
    public void поставить_галочку(String string) {

    }
    @И("Проверить значения полей:")
    public void проверить_значения_полей(io.cucumber.datatable.DataTable dataTable) {

    }
    @И("Сделать скриншот ошибки")
    public void сделать_скриншот_ошибки() {

    }
    
}
