package snakecamel;

public class Main {
	
	public static void main(String[] args) {
		
		SnakeCamelUtil snakecamel = new SnakeCamelUtil();
		
		System.out.println(snakecamel.capitalize(""));
		System.out.println(snakecamel.capitalize("a"));
		System.out.println(snakecamel.capitalize("xyz"));
		System.out.println(snakecamel.uncapitalize(""));
		System.out.println(snakecamel.uncapitalize("A"));
		System.out.println(snakecamel.uncapitalize("Xyz"));
		System.out.println(snakecamel.snakeToCamelcase("abc"));
		System.out.println(snakecamel.snakeToCamelcase("abc_def"));
		System.out.println(snakecamel.snakeToCamelcase("abc_def_gh"));
		System.out.println(snakecamel.snakeToCamelcase("abc__def___gh"));
		System.out.println(snakecamel.snakeToCamelcase("_abc_def_"));
		System.out.println(snakecamel.camelToSnakecase("Abc"));
		System.out.println(snakecamel.camelToSnakecase("AbcDef"));
		System.out.println(snakecamel.camelToSnakecase("AbcDefGh"));
		
	}

}
