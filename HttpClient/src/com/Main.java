package com;

import com.HttpClient;

public class Main {

	public static void main(String[] args) {
		String url = "http://www.iconfont.cn/search/index?searchType=icon&q=%E6%95%B0%E5%AD%97";
		HttpClient.setProps("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
		HttpClient.setProps("Cookie",
				"UM_distinctid=15ed324eaefba8-0a6be793638965-c303767-100200-15ed324eaf3106e; EGG_SESS=IbCKec5CCyDJnfA9VRO-pMxPXQVSI9Qu8zikmUDvOBqKN9ilgPQ_EvYT93aNxuFp9OCdp6ZMW-ej4b_hj-KuIDU3lRVUpNxclmpR881QfjGBB3KyiOT-DVh9PzOOxK5otiebvCiRC1gP6POrY_oJwghx82J4nwqaGClS9D-R8ll8SGhzdERq_kz7plUjKyhuN_xO84QjgbqGrG8gRC74OKvM_5FS6vC9nGnZA1z6DqbnQQM23AvySSjUt8ICdUkAstg4vUMGOfyLtnlNfAhQBHFKlCYwxV3RBgI8iP2S69oSFE-Cn9HuW8228SAkxDlwNRdl_kmE8k14h0oLndzDy5AqtJAvH4PrJ5umSnApbFOPrUv1AjgAd0xT59Sq_WxwmRaigH7bmCCDFZMw5rY91OS7gThnrrXIj8TmZvBjbhCpT8jd-uETFKDmK2YQ2OfbaTqO3du8QaLqX1cFsTFRGsi7wUrpGxsgN3Erilbhjbsn8ak7PxkPZ0pFV9PZBusUEGWbjQwbxpbeM-SlZeZ0aXBryGTQXsbggNYxMJF19m4P4VndZgTzgnJYvNH5HvSqgScbqw8gBOop0XfJUyy0bWzrtZEqr6tXTZi90fTTmmCBmGgUW0FA7x96Qqq6S6g3PsDGo0QYR7HKIyO23zLGsm05U5pw5TQxTBt7fU_QIgBJDoav7jpgcQl3FoZuvPICiayrl7ZYyDkgLYyWodEH27gaEGCKcGcG14URutQOBeM2xa2JEVoackSu9abW7HC7vdStQGhcuMUPZkp6BxkPSiYhBSIir3WJ5hZhy6827z4kKtlXXCe2I42pDrRG1vzX2dmIuDPsrFQDeTMmA5ER1A==; cna=AK7REAt04GYCAQ50JGNMVXyz; CNZZDATA1000158776=823502242-1516855318-http%253A%252F%252Fwww.iconfont.cn%252F%7C1516855318; trace=AQAAAEHcOle3HAsABjMGdPXwMi79pVl0; ctoken=y3cLHUSceDfVbxnhVq6Aicon-font; u=3966712; CNZZDATA1260547936=1073301018-1506776908-null%7C1518589986; isg=BMvLHICoFRGUx0qJit6oTaVtWm-_qbeZUq0-jD3Ip4phXOu-xTBvMmn-MlSy_Dfa");
		HttpClient.setProps("Host", "www.iconfont.cn");
		HttpClient.setProps("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.167 Safari/537.36");
		HttpClient.setProps("Upgrade-Insecure-Requests", "1");

		
		HttpClient.setParams("q", "Êý×Ö");
//		HttpClient.setParams("sortType", "updated_at");
//		HttpClient.setParams("page", "1");
//		HttpClient.setParams("pageSize", "54");
//		HttpClient.setParams("fromCollection", "1");
//		HttpClient.setParams("t", "1518590694738");
//		HttpClient.setParams("ctoken", "y3cLHUSceDfVbxnhVq6Aicon-font");
		HttpClient.pub(url, HttpClient.SUBMIT_METHOD_GET);
	}
}
