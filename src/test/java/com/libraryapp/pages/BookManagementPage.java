package com.libraryapp.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookManagementPage extends Base{

    @FindBy(className = "btn btn-lg btn-outline btn-primary btn-sm add_book_btn")
    private WebElement addBookButton;

    @FindBy(id = "book_categories")
    private WebElement bookCategoriesDropDown;

    @FindBy(name = "tbl_books_length")
    private WebDriverManager showRecordsDropDown;

    @FindBy(className = "form-control input-sm input-small input-inline")
    private WebElement searchInput;

    @FindBy(xpath = "//tbody//td[5]")
    private WebElement bookCategoriesColumn;
}
