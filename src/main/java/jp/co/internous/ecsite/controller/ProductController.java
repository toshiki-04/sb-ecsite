package jp.co.internous.ecsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
* 商品情報を制御するコントローラークラス
* 商品一覧画面、商品詳細画面の表示を行う
*/
@Controller
public class ProductController {

	// productDao という変数名で ProductDao インターフェースを利用するための宣言



	// 全商品情報を取得して商品一覧画面を表示する
    //【Ｑ１】URL「http://localhost:8080/ecsite/product」とひもづけする
	@GetMapping("Q1")
	public ModelAndView showProductList(ModelAndView mav) {
		// 商品テーブルから全ての商品情報を取得する

		// レスポンスに検索した全商品の情報を追加する

		// レスポンスとして次に表示させるHTMLファイル名を指定する
		
		return mav;
	}

	// １件の商品情報を取得して商品詳細画面を表示する
	//【Ｑ２】URL「http://localhost:8080/ecsite/detail」とひもづけする
	@GetMapping("Q2")
	//【Ｑ３】パラメータとして送られてきた値 productId を引数「int productId」に格納する
	public ModelAndView showDetail(@RequestParam("Q3")int productId, ModelAndView mav) {
		//【Ｑ４】受け取った商品IDをもとにデータベースから１件の商品情報を取得し、product という変数（新たに宣言）に格納する

		//【Ｑ５】レスポンスに検索結果の商品情報１件分を追加する

		//【Ｑ６】レスポンスとして次に表示させるHTMLファイル名を指定する

		return mav;
	}

}
