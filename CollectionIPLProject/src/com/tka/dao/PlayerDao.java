package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Player;

public class PlayerDao {

	public List<Player> getAllTeam() {

		//System.out.println("Dao class");
		List<Player> allTeam = new ArrayList<>();

		// Team Chennai Super Kings
		allTeam.add(new Player(1, "Shivam Dube", 500, 0, "csk"));
		allTeam.add(new Player(2, "MS Dhoni", 1400, 2, "csk"));
		allTeam.add(new Player(3, "Ravindra Jadeja", 500, 1, "csk"));
		allTeam.add(new Player(4, "Ayush Mhatre", 2500, 9, "csk"));
		allTeam.add(new Player(5, "Deepak Hooda", 800, 4, "csk"));
		allTeam.add(new Player(6, "Ruturaj Gaikwad", 500, 0, "csk"));
		allTeam.add(new Player(7, "Rachin Ravindra", 500, 4, "csk"));
		allTeam.add(new Player(8, "R Ashwin", 900, 6, "csk"));
		allTeam.add(new Player(9, "Sam Curran", 500, 7, "csk"));
		allTeam.add(new Player(10, "Noor Ahmad", 400, 10, "csk"));
		allTeam.add(new Player(11, "M Pathirana", 100, 12, "csk"));

		// Team Mumbai Indians
		allTeam.add(new Player(1, "Hardik Pandya", 1500, 5, "MI"));
		allTeam.add(new Player(2, "Suryakumar Yadav", 1400, 2, "MI"));
		allTeam.add(new Player(3, "Rohit Sharma", 500, 14, "MI"));
		allTeam.add(new Player(4, "Robin Minz", 2500, 9, "MI"));
		allTeam.add(new Player(5, "Jaspreet Bumrah", 800, 4, "MI"));
		allTeam.add(new Player(6, "Tilak Varma", 500, 0, "MI"));
		allTeam.add(new Player(7, "Trent Boult", 500, 4, "MI"));
		allTeam.add(new Player(8, "Karn Sharma", 1900, 6, "MI"));
		allTeam.add(new Player(9, "Naman Dhir", 1500, 7, "MI"));
		allTeam.add(new Player(10, "Ashwani Kumar", 1400, 10, "MI"));
		allTeam.add(new Player(11, "Deepak Chahar", 100, 12, "MI"));

		// Team Delhi Capitals
		allTeam.add(new Player(1, "KL Rahul", 500, 12, "DC"));
		allTeam.add(new Player(2, "Kuldeep Yadav", 137, 14, "DC"));
		allTeam.add(new Player(3, "Karun Nair ", 3284, 10, "DC"));
		allTeam.add(new Player(4, "Axar Patel", 1205, 9, "DC"));
		allTeam.add(new Player(5, "Tristan Stubbs", 800, 14, "DC"));
		allTeam.add(new Player(6, "T Natarajan", 210, 11, "DC"));
		allTeam.add(new Player(7, "Vipraj Nigam", 120, 24, "DC"));
		allTeam.add(new Player(8, "Abishek Poral", 900, 16, "DC"));
		allTeam.add(new Player(9, "Mitchell Starc", 895, 7, "DC"));
		allTeam.add(new Player(10, "Madhav Tiwari", 320, 10, "DC"));
		allTeam.add(new Player(11, "Mohit Sharma", 100, 12, "DC"));

		// Team Gujarat Titans
		allTeam.add(new Player(1, "Kumar Kushagra", 500, 11, "GT"));
		allTeam.add(new Player(2, "Sai Sudharshan", 1543, 2, "GT"));
		allTeam.add(new Player(3, "Prasidh Krishna", 500, 1, "GT"));
		allTeam.add(new Player(4, "Shubman Gill", 2500, 9, "GT"));
		allTeam.add(new Player(5, "Sai Kishor", 800, 4, "GT"));
		allTeam.add(new Player(6, "Washington Sundar", 500, 0, "GT"));
		allTeam.add(new Player(7, "Rashid Khan", 500, 4, "GT"));
		allTeam.add(new Player(8, "Ishant Sharma", 900, 6, "GT"));
		allTeam.add(new Player(9, "Rahul Tewatia", 500, 7, "GT"));
		allTeam.add(new Player(10, "Shahrukh Khan", 400, 10, "GT"));
		allTeam.add(new Player(11, "Jayant Yadav", 100, 12, "GT"));

		// Team Kolkata Knight Riders
		allTeam.add(new Player(1, "Ajinkya Rahane ", 500, 0, "KKR"));
		allTeam.add(new Player(2, "Quinton D Kock", 1400, 2, "KKR"));
		allTeam.add(new Player(3, "Venkatesh Iyer", 500, 1, "KKR"));
		allTeam.add(new Player(4, "Sunil Narine", 2500, 9, "KKR"));
		allTeam.add(new Player(5, "Andre Russell", 800, 4, "KKR"));
		allTeam.add(new Player(6, "Rinku Singh", 500, 0, "KKR"));
		allTeam.add(new Player(7, "Manish Pandey", 500, 4, "KKR"));
		allTeam.add(new Player(8, "Varun Chakravarthy", 900, 6, "KKR"));
		allTeam.add(new Player(9, "Rahmanullah Gurbaz", 500, 7, "KKR"));
		allTeam.add(new Player(10, "Moeen Ali", 400, 10, "KKR"));
		allTeam.add(new Player(11, "Harshit Raan", 100, 12, "KKR"));

		// Team Lucknow Super Giants
		allTeam.add(new Player(1, "Rishabh Pant", 500, 0, "LCG"));
		allTeam.add(new Player(2, "David Miller ", 1400, 2, "LCG"));
		allTeam.add(new Player(3, "Nicholas Pooran", 500, 1, "LCG"));
		allTeam.add(new Player(4, "Mitchell Marsh ", 2500, 9, "LCG"));
		allTeam.add(new Player(5, "Shardul Thakur", 800, 4, "LCG"));
		allTeam.add(new Player(6, "Ayush Badoni", 500, 0, "LCG"));
		allTeam.add(new Player(7, "Yuvraj Chaudhary", 500, 4, "LCG"));
		allTeam.add(new Player(8, "Aiden Markram", 900, 6, "LCG"));
		allTeam.add(new Player(9, "M Siddharth", 500, 7, "LCG"));
		allTeam.add(new Player(10, "Ravi Bishnoi", 400, 10, "LCG"));
		allTeam.add(new Player(11, "Avesh Khan ", 100, 12, "LCG"));

		// Team Punjab Kings
		allTeam.add(new Player(1, "Shreyas Iyer", 500, 0, "PK"));
		allTeam.add(new Player(2, "Nehal Wadhera", 1400, 2, "PK"));
		allTeam.add(new Player(3, "Harpreet Brar", 500, 1, "PK"));
		allTeam.add(new Player(4, "Marcus Stoinis", 2500, 9, "PK"));
		allTeam.add(new Player(5, "Priyansh Arya", 800, 4, "PK"));
		allTeam.add(new Player(6, "Shashank Singh", 500, 0, "PK"));
		allTeam.add(new Player(7, "Suryansh Shedge", 500, 4, "PK"));
		allTeam.add(new Player(8, "Marco Jansen", 900, 6, "PK"));
		allTeam.add(new Player(9, "Arshdeep Singh", 500, 7, "PK"));
		allTeam.add(new Player(10, "Yuzvendra Chahal", 400, 10, "PK"));
		allTeam.add(new Player(11, "Kuldeep Sen", 100, 12, "PK"));

		// Teams Rajasthan Royals
		allTeam.add(new Player(1, "Sanju Samson", 500, 0, "RR"));
		allTeam.add(new Player(2, "Riyan Parag", 1400, 2, "RR"));
		allTeam.add(new Player(3, "Dhruv Jurel", 500, 1, "RR"));
		allTeam.add(new Player(4, "Yashasvi Jaiswal", 2500, 9, "RR"));
		allTeam.add(new Player(5, "Shimron Hetmayer", 800, 4, "RR"));
		allTeam.add(new Player(6, "Shubham Dubey", 500, 0, "RR"));
		allTeam.add(new Player(7, "Yudhir Singh Charak", 500, 4, "RR"));
		allTeam.add(new Player(8, "Jofra Archer", 900, 6, "RR"));
		allTeam.add(new Player(9, "M Theekshana", 500, 7, "RR"));
		allTeam.add(new Player(10, "Tushar Deshpande", 400, 10, "RR"));
		allTeam.add(new Player(11, "W Hasaranga", 100, 12, "RR"));

		// Team Royal Challengers Bengaluru
		allTeam.add(new Player(1, "Rajat Patidar", 500, 0, "RCB"));
		allTeam.add(new Player(2, "Swapnil Singh", 1400, 2, "RCB"));
		allTeam.add(new Player(3, "Phil Salt", 500, 1, "RCB"));
		allTeam.add(new Player(4, "Virat Kohli", 2500, 9, "RCB"));
		allTeam.add(new Player(5, "Mayank Agarwal", 800, 4, "RCB"));
		allTeam.add(new Player(6, "Krunal Pandya", 500, 0, "RCB"));
		allTeam.add(new Player(7, "Tim David", 500, 4, "RCB"));
		allTeam.add(new Player(8, "Liam Livingstone", 900, 6, "RCB"));
		allTeam.add(new Player(9, "Josh Hazlewood", 500, 7, "RCB"));
		allTeam.add(new Player(10, "Bhuvneshwar Kumar", 400, 10, "RCB"));
		allTeam.add(new Player(11, "Yash Dayal", 100, 12, "RCB"));

		// Team Sunrisers Hyderabad
		allTeam.add(new Player(1, "Ishan Kishan", 500, 0, "SH"));
		allTeam.add(new Player(2, "Travis Head", 1400, 2, "SH"));
		allTeam.add(new Player(3, "Heinrich Klaasen", 500, 1, "SH"));
		allTeam.add(new Player(4, "Nitish Kumar Reddy", 2500, 9, "SH"));
		allTeam.add(new Player(5, "Abhishek Sharma", 800, 4, "SH"));
		allTeam.add(new Player(6, "Harshal Patel", 500, 0, "SH"));
		allTeam.add(new Player(7, "Pat Cumins", 500, 4, "SH"));
		allTeam.add(new Player(8, "Kamindu Mendis", 900, 6, "SH"));
		allTeam.add(new Player(9, "Mohammad Shami", 500, 7, "SH"));
		allTeam.add(new Player(10, "Jaydev Unadkat", 400, 10, "SH"));
		allTeam.add(new Player(11, "Ishan Malinga", 100, 12, "SH"));

		return allTeam;
	}
}
