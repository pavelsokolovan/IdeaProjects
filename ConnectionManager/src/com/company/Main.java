package com.company;

import connection.*;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            Connection connection = ConnectionManager.getConnection();
            if (connection == null) {
                System.out.println("No more connection. Please close unnecessary one.");
            }
            else {
                connection.open();
            }
        }
    }
}
