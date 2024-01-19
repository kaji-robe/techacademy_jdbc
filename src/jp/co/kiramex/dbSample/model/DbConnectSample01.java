package jp.co.kiramex.dbSample.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectSample01 {

    public static void main(String[] args) {
        // 3. データベース接続と結果取得のための変数宣言

        try {
            // 1. ドライバのクラスをJava上で読み込む
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. DBと接続する
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost/world?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "password（7851zaqW）");

            // 4. DBとやりとりする窓口（Statementオブジェクト）の作成

            // 5, 6. Select文の実行と結果を格納／代入

            // 7. 結果を表示する

        } catch (ClassNotFoundException e) {
            System.err.println("JDBCドライバのロードに失敗しました。");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("データベースに異常が発生しました");
            e.printStackTrace();
        }

        // 8. 接続を閉じる

    }

}
