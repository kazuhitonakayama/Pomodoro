INSERT INTO circles(circleName,
                    description)
VALUES ('ゴルフ部', 'ゴルフ部です'),
       ('麻雀部', '麻雀部です'),
       ('釣り部', '釣り部です'),
       ('ダーツ部', 'ダーツ部です'),
       ('餃子部', '餃子部です');

INSERT INTO articles(circle_id,
                     title,
                     body)
VALUES (1, 'ゴルフコンペ開催', 'ゴルフコンペを開催しました！楽しかった。'),
       (2, '麻雀部新人歓迎会開催', '新しく入部した人がいるので、麻雀部で新人歓迎会を開催します！'),
       (3, '大物が釣れました', '釣りめっちゃたのしいいいい'),
       (4, 'Aフライトになりました', 'Aフラまでの道のをここに記す。'),
       (5, '餃子消費量について', '静岡県浜松市vs栃木県宇都宮市。どちらが餃子の街なのか調査しました。');

/* ユーザーマスタ */
INSERT INTO users ( userId
                   , password
                   , userName
                   , birthday
                   , age
                   , gender)
VALUES ('system@co.jp', 'password', 'システム管理者', '2000-01-01', 21, 1)
     , ('user@co.jp', 'password', 'ユーザー1', '2000-01-01', 21, 2)
;