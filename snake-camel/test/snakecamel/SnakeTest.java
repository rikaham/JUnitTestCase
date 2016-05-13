package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeTest {

	@Test
	public void abc_def_ghiをスネークからキャメルへ() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = snake.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void AbcDefGhiをキャメルからスネークへ() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = snake.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void スネークに大文字が含まれている時() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "スネークケースには大文字は含まれてはいけません。";
		String actual = snake.snakeToCamelcase("Abc_def_ghi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void キャメルが全て小文字の時() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "キャメルケースに大文字を含めて下さい。";
		String actual = snake.camelToSnakecase("abcdefghi");
		assertThat(actual, is(expected));
	}
	

}
