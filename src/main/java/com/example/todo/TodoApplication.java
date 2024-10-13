package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //　springの設定、自動設定、コンポーネントの登録　をしてくれる
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
		// runの引数を起点に起動している　argsをアプリケーションに渡している
	}

}
