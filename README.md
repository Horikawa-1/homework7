GETメソッドは"Akane", "Nabiki", "Kasumi"と表示されるようになっています。![スクリーンショット (86)](https://user-images.githubusercontent.com/111167638/200169353-12beefcc-79f6-4171-94c0-faba2ce585d7.png)

POSTメソッドはクエリパラメータで文字列を入力して、空文字、null、20文字以上なら受け取らない仕様です。（以下文字数0,1,18,19,20文字の例）
![スクリーンショット (118)](https://user-images.githubusercontent.com/111167638/201894281-f5e297d7-bfd8-4e39-b060-503abc06bf2b.png)
![スクリーンショット (119)](https://user-images.githubusercontent.com/111167638/201894292-003f5261-478a-4a68-af25-23b727c70445.png)
![スクリーンショット (130)](https://user-images.githubusercontent.com/111167638/201895520-699c10bc-9dd3-4ab1-800d-dde7de6747e4.png)

![スクリーンショット (120)](https://user-images.githubusercontent.com/111167638/201894295-8c237580-3cf1-413c-9ca0-5d25cf419b91.png)
![スクリーンショット (121)](https://user-images.githubusercontent.com/111167638/201894297-27c8e632-245b-4718-b9a3-fea3f321ff78.png)
![スクリーンショット (122)](https://user-images.githubusercontent.com/111167638/201894300-599023c0-07e8-4234-b620-f1e547ba31df.png)


PATCHメソッドはPOSTと同じく入力した文字列が空文字、null、20文字以上なら受け取らないで、URLパラメータの「names/」の後に整数を入れる仕様です。（以下names/の後に整数を入れない場合と、入れて文字数0,1,18,19,20文字の場合の例）
![スクリーンショット (123)](https://user-images.githubusercontent.com/111167638/201895288-6198fad4-59d5-4a99-b444-c7406945802d.png)
![スクリーンショット (124)](https://user-images.githubusercontent.com/111167638/201895297-5f1f1714-ec45-437e-943a-77e7c977458b.png)
![スクリーンショット (125)](https://user-images.githubusercontent.com/111167638/201895300-09f2ffd2-d48d-4dda-bb2f-a1ec04d9b249.png)
![スクリーンショット (126)](https://user-images.githubusercontent.com/111167638/201895303-6b5a3008-c898-444b-aced-42f8944afce1.png)
![スクリーンショット (127)](https://user-images.githubusercontent.com/111167638/201895306-01120e44-1d79-4f22-a553-069ce05580ca.png)
![スクリーンショット (128)](https://user-images.githubusercontent.com/111167638/201895309-ed7ab341-4f19-402a-a87a-28837926c838.png)
![スクリーンショット (129)](https://user-images.githubusercontent.com/111167638/201895315-2a265f03-349a-498d-81e3-8c26eec359db.png)


DELETEメソッドはクエリパラメータを入力するとname successfully deletedと表示されるようになっています。![スクリーンショット (99)](https://user-images.githubusercontent.com/111167638/200169583-424ed335-7827-48b8-8deb-e2695445df0d.png)
