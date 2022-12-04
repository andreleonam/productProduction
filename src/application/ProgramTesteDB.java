package application;

import db.DB;
import db.DbException;

import java.sql.Connection;

public class ProgramTesteDB {
    public static void main(String[] args) {
        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
