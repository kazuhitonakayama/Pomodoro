## ルーティング周り
### 編集しなければいけないファイル群
- `**Controller` →**はなんでもいい
- `templates`フォルダ

### 仕組み
- まずHTML側で指定したURLに遷移しようとする
- spring側でURLを受け取り、任意のHTMLページをブラウザに返す
    - @Getmappingの引数にURLを指定し、return文で返すHTMLのファイル名を記述する
    - ※拡張子はなし。templates配下から見に行く
        - 例えば`templates/circles/new.html`を見に行きたいときは`return "/circles/new"`


### 解説
- `controller`のファイルに記述する`@Controller`とは
    - HTTPリクエストを受け付ける宣言になる
    - これがあって初めてコントローラーとしての責務を果たすことになる。
- `@RequestMapping`
    - 接頭辞(プリフィックス)を定義できる
    - 例えば、`CirclesController`にてCRUD処理を実装している状況において`@GetMapping("/circles/new")`や`@GetMapping("/circles/edit")`、`@GetMapping("/circles/delete")`を書いていては冗長である。"circles"という部分は各URLにおいて共通しているので、`@RequestMapping("/circles")`とすることで`@GetMapping("/new")`、`@GetMapping("/delete")`とでき、冗長部分を排除できる。
- `@GetMapping`
    - 任意のURLを引数にもつことで当該URLアクセス時に行う処理を定義する
- `@PostMapping`
    - 引数に指定したURLのHTTPリクエストを受け取り、リクエストに応じた処理を定義できるようになる。例えば`新規投稿`や`編集機能`などで使用する。
    - 例えば、`@PostMapping(value = "/edit" , params = "update")`
    - `params = "~~"`にかいた~~が、HTMLのsubmitボタンの`name属性`と紐づけられる
- `@DeleteMapping`
    - 上に同様
- `@PutMapping`
    - 上に同様
- `@RequestParam`
    - `@PostMapping`を定義した処理の中で使用する。フォームのパラメーターを受け取る。

## 依存性の注入(Dependency Injection)

生成(new)したインスタンスを、各変数に入れることを注入という。
HelloAppにてMessageBeanのインスタンスを生成してsayHelloメソッドを呼び出す。
MessageBeanというクラスがないとできないことだから、HelloAppクラスはMessageBeanクラスに依存しているという。

## @AutoWiredとは

```java:ArticleController.java
@Autowired
private ArticleService articleservice;
```

articleserviceというインスタンスには、@Component（Controller, Service, Repository）が付いているクラスの中からArticleServiceクラスを探し出し、newしてインスタンスを突っ込んでくれます。

### メリット
- インスタンス化を1回で済ませられる（Singleton）
- 実装部分(注入元)と注入先とを疎結合にできる。
    - 「ClassA の中で ClassB を普通に new すればいいじゃないか」という NEW おじさんの声が聞こえてきた。確かに小さいプログラムであれば Spring など使用しないで new したほうが早い。ある程度のアプリケーションになると、以下のような状況が考えられる。ClassB がまだできていないので ClassA のテストができない。ClassB が DB アクセスを行うので、ClassA を単体テストしたいだけなのに DB 構築が必要。ClassB を改良した NewClassB が発明された。ClassA を修正することなく NewClassB を使用したい。このような場合、設定ファイルをいじるだけで、自動的にプロパティ classB には Mock が設定されるなどプログラムの修正を行わずに、依存するクラスを変更できる。
- newを消せる