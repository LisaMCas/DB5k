package pkg5krun;

import java.sql.*;

    public class FivekRun {
        public static void main(String[] args){
            final String QUERY = "select runID, lastName, firstName, age, sex, city, state, " + "time from runner";
            
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/5kRun", "lisa", "Marie09Cas!");
                    PreparedStatement stmt = con.prepareStatement(QUERY)) {
                
                System.out.println(stmt.toString());
                
                ResultSet rs =stmt.executeQuery(QUERY);
                
                while (rs.next()) {
                    System.out.println(rs.getInt("runId") + "," + rs.getString("lastName") + ", "  + rs.getString("firstName") + ", " + rs.getDouble("age") + ", " + rs.getString("city") + ", " + rs.getString("state") + ", " + rs.getDouble("time") + ", ");
                }
            } catch (SQLException ex) {
                System.out.println("retrieve SQLException: " + ex.getMessage());
            }
        }
    }