package edu.onecommitman.framework.managers;

import edu.onecommitman.framework.pages.HomePage;
import io.qameta.allure.Step;

public class PageManager {

    /**
     * Менеджер страничек
     */
    private static PageManager pageManager;

    /**
     * Стартовая страничка
     */
    private HomePage homePage;

    //private SelectInsuranceServicePage selectInsuranceServicePage;

    /**
     * Страничка оформления полиса страхования
     */
    //private RegistrationFormPage registrationFormPage;

    /**
     * Конструктор специально был объявлен как private (singleton паттерн)
     *
     * @see PageManager#getPageManager()
     */
    private PageManager() {
    }

    /**
     * Ленивая инициализация PageManager
     *
     * @return PageManager
     */
    public static PageManager getPageManager() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
        return pageManager;
    }

    /**
     * Ленивая инициализация {@link HomePage}
     *
     * @return StartPage
     */
    @Step("Домашняя страница")
    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

/*    *//**
     * Ленивая инициализация {@link ru.appline.framework.pages.RegistrationFormPage}
     *
     * @return RegistrationFormPage
     *//*
    public RegistrationFormPage getRegistrationFormPage() {
        if (registrationFormPage == null) {
            registrationFormPage = new RegistrationFormPage();
        }
        return registrationFormPage;
    }*/
}