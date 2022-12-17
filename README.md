Javaフルコースの第7回の課題(REST APIの実装)です。
GETメソッドは"Akane", "Nabiki", "Kasumi"と表示されるようになっています。![スクリーンショット (86)](https://user-images.githubusercontent.com/111167638/200169353-12beefcc-79f6-4171-94c0-faba2ce585d7.png)

POSTメソッドはクエリパラメータで文字列を入力して、空文字、null、20文字以上なら受け取らない仕様です。（以下NULL、空文字、文字数1,19,20文字の場合）
![スクリーンショット (144)](https://user-images.githubusercontent.com/111167638/208240312-4904ce6e-73a4-4c6a-bd36-016d98680908.png)
![スクリーンショット (145)](https://user-images.githubusercontent.com/111167638/208240314-0cf57e35-37c3-4a99-a7ed-079d9e25c3c1.png)
![スクリーンショット (146)](https://user-images.githubusercontent.com/111167638/208240316-7172c2eb-7f98-4d57-8bb3-db6ac611ebca.png)
![スクリーンショット (147)](https://user-images.githubusercontent.com/111167638/208240317-4f70b07c-2d5a-4bd9-848b-33d19cd9d80d.png)
![スクリーンショット (148)](https://user-images.githubusercontent.com/111167638/208240319-f9c809b1-364f-4cfb-88c9-29e78d52738f.png)



PATCHメソッドはPOSTと同じく入力した文字列が空文字、null、20文字以上なら受け取らないで、URLパラメータの「names/」の後に整数を入れる仕様です。（以下NULL、空文字、文字数1,19,20文字の場合）
![スクリーンショット (123)](https://user-images.githubusercontent.com/111167638/201895288-6198fad4-59d5-4a99-b444-c7406945802d.png)
![スクリーンショット (124)](https://user-images.githubusercontent.com/111167638/201895297-5f1f1714-ec45-437e-943a-77e7c977458b.png)
![スクリーンショット (125)](https://user-images.githubusercontent.com/111167638/201895300-09f2ffd2-d48d-4dda-bb2f-a1ec04d9b249.png)
![スクリーンショット (126)](https://user-images.githubusercontent.com/111167638/201895303-6b5a3008-c898-444b-aced-42f8944afce1.png)
![スクリーンショット (127)](https://user-images.githubusercontent.com/111167638/201895306-01120e44-1d79-4f22-a553-069ce05580ca.png)
![スクリーンショット (128)](https://user-images.githubusercontent.com/111167638/201895309-ed7ab341-4f19-402a-a87a-28837926c838.png)
![スクリーンショット (129)](https://user-images.githubusercontent.com/111167638/201895315-2a265f03-349a-498d-81e3-8c26eec359db.png)


DELETEメソッドはクエリパラメータを入力するとname successfully deletedと表示されるようになっています。![スクリーンショット (99)](https://user-images.githubusercontent.com/111167638/200169583-424ed335-7827-48b8-8deb-e2695445df0d.png)
