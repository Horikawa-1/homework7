Javaフルコースの第7回の課題(REST APIの実装)です。

---
---
GETメソッドは"Akane", "Nabiki", "Kasumi"と表示されるようになっています。![スクリーンショット (86)](https://user-images.githubusercontent.com/111167638/200169353-12beefcc-79f6-4171-94c0-faba2ce585d7.png)

---
---

POSTメソッドはクエリパラメータで文字列を入力して、空文字、null、20文字以上なら受け取らなく、それ以外は「name successfully created」と表示する仕様です。（以下NULL、空文字、文字数1,19,20文字の場合）
![スクリーンショット (144)](https://user-images.githubusercontent.com/111167638/208240312-4904ce6e-73a4-4c6a-bd36-016d98680908.png)
![スクリーンショット (145)](https://user-images.githubusercontent.com/111167638/208240314-0cf57e35-37c3-4a99-a7ed-079d9e25c3c1.png)
![スクリーンショット (146)](https://user-images.githubusercontent.com/111167638/208240316-7172c2eb-7f98-4d57-8bb3-db6ac611ebca.png)
![スクリーンショット (147)](https://user-images.githubusercontent.com/111167638/208240317-4f70b07c-2d5a-4bd9-848b-33d19cd9d80d.png)
![スクリーンショット (148)](https://user-images.githubusercontent.com/111167638/208240319-f9c809b1-364f-4cfb-88c9-29e78d52738f.png)

---
---

PATCHメソッドはPOSTと同じく入力した文字列が空文字、null、20文字以上なら受け取らなく、それ以外は「name successfully created」と表示して、URLパラメータの「names/」の後に整数を入れる仕様です。（以下NULL、空文字、文字数1,19,20文字の場合）
![スクリーンショット (155)](https://user-images.githubusercontent.com/111167638/208240702-148d88a4-39da-4258-abb5-c6674656b239.png)
![スクリーンショット (156)](https://user-images.githubusercontent.com/111167638/208240705-09a18b8f-13c5-4cab-acf7-f84eeaf48502.png)
![スクリーンショット (157)](https://user-images.githubusercontent.com/111167638/208240708-5605a5af-529d-4fbc-8066-644ab7238c23.png)
![スクリーンショット (158)](https://user-images.githubusercontent.com/111167638/208240710-3dec349e-568a-4ea0-918b-781737f30a3d.png)
![スクリーンショット (154)](https://user-images.githubusercontent.com/111167638/208240712-bf9edbf8-f0cc-4430-a449-05407f6ae460.png)

---
---

DELETEメソッドはクエリパラメータを入力すると「name successfully deleted」と表示されるようになっています。
![スクリーンショット (159)](https://user-images.githubusercontent.com/111167638/208240733-0e68647d-8816-4c87-b230-14c5a38862a8.png)
