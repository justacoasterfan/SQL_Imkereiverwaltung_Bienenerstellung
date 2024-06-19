package com.justacoasterfan.sql_project;

import java.util.LinkedHashMap;

public class Main {

    final static int NUM_BEES = 2500000; // 2.5 Million Bees in final version

    public static void main(String[] args) {

        //Array of Random bee names
        String[] names = {"Buzz Buzz",
        "Honey Bun",
        "Buzzy McBee",
        "Queen Bee",
        "Beezilla",
        "Buzz Lightyear",
        "Beeyond",
        "Stinger",
        "Bumble",
        "Honeycomb",
        "Pollenator",
        "Bees Knees",
        "Buzzworthy",
        "Honeydew",
        "Beestro",
        "Drone",
        "Nectar",
        "Buzzito",
        "Busy Bee",
        "Buzz Aldrin",
        "Bee-liever",
        "Hive Jive",
        "Bee-casso",
        "Zombee",
        "Beeline",
        "Buzzbomb",
        "Bee Happy",
        "Beeswax",
        "Bee You",
        "Buzzberry",
        "Hive Five",
        "Pollinator",
        "Beemaster",
        "Buzz Off",
        "Honey Love",
        "Bee Positive",
        "Buzzin Around",
        "Bee Bold",
        "Bee Brilliant",
        "Honeybee",
        "Beegu",
        "Bee Agile",
        "Beemine",
        "Bee Queen",
        "Buzztastic",
        "Bee Sweet",
        "Buzzcut",
        "Bee Cool",
        "Honey Bunch",
        "Bee Happy",
        "Buzz King",
        "Bee Alive",
        "Bee Curious",
        "Buzz Buddies",
        "Honey Hooves",
        "Bee Charmer",
        "Buzz Builder",
        "Bee Dynamic",
        "Honeybeard",
        "Buzz Brigade",
        "Bee Unique",
        "Bee Zen",
        "Honey Hum",
        "Beezus",
        "Buzzinator",
        "Bee Good",
        "Honey Twist",
        "Bee Tequila",
        "Buzzchop",
        "Bee Cee",
        "Honey Maze",
        "Buzz Squad",
        "Bee Squared",
        "Beedazzle",
        "Buzz Thrill",
        "Honey Fiesta",
        "Bee Nuts",
        "Beejar",
        "Bee the Light",
        "Honey Ram",
        "Beeball",
        "Buzzapalooza",
        "Bee Bop",
        "Buzzorama",
        "Honey Crush",
        "Bee Adored",
        "Bee Jolly",
        "Buzz the Hive",
        "Honey Fix",
        "Bee Q",
        "Beester",
        "Bee Swift",
        "Buzz Bounce",
        "Honey Zing",
        "Bee Chi",
        "Bee Caring",
        "Buzz n Snack",
        "Honey Shake",
        "Bee Clever",
        "Bee Mystery",
        "Buzz Calm",
        "Honey Rush",
        "Bee Alert",
        "Bee Fit",
        "Buzz Yum",
        "Honey Drip",
        "Bee Driven",
        "Bee Quencher",
        "Buzzburst",
        "Honey Dew It",
        "Bee Drift",
        "Bee Grand",
        "Buzz Burst",
        "Bee Flair",
        "Honey Flip",
        "Bee Happy",
        "Buzz Shot",
        "Bee Fluffy",
        "Honey Hop",
        "Bee Alert",
        "Buzz Zip",
        "Bee Frenzy",
        "Honey Hop",
        "Bee Giggles",
        "Buzzed",
        "Bee Fun",
        "Bee Hug",
        "Honey Hot",
        "Bee Glee",
        "Buzzfire",
        "Bee Joyful",
        "Bee Jam",
        "Honey Hype",
        "Bee Glee",
        "Buzzshine",
        "Bee Kin",
        "Bee Kind",
        "Honey Haven",
        "Bee Glow",
        "Buzz Fun",
        "Bee Loom",
        "Bee Light",
        "Honey Chill",
        "Bee Great",
        "Buzz Jive",
        "Bee My Love",
        "Honey Magic",
        "Bee Laugh",
        "Buzzzzy",
        "Bee Mate",
        "Bee Nice",
        "Honey Mingle",
        "Bee Life",
        "Buzz Flame",
        "Bee New",
        "Bee Nectar",
        "Honey Pop",
        "Bee Lover",
        "Buzzbo",
        "Bee Peace",
        "Bee OClock",
        "Honey Pop",
        "Bee Love",
        "Buzzdance",
        "Bee Party",
        "Bee Mellow",
        "Honey Pulse",
        "Bee Lucky",
        "Buzzster",
        "Bee Quest",
        "Bee Queen",
        "Honey Puff",
        "Bee Lovely",
        "Buzzbop",
        "Bee Race",
        "Bee Rapid",
        "Honey Snap",
        "Bee Luscious",
        "Buzzzilla",
        "Bee Ray",
        "Bee Quick",
        "Honey Spark",
        "Bee Lush",
        "Buzz Byte",
        "Bee Rave",
        "Bee Rumble",
        "Honey Spark",
        "Bee Master",
        "Buzzfest",
        "Bee Song",
        "Bee Sizzle",
        "Honey Splash",
        "Bee Magic",
        "Buzzly",
        "Bee Spirit",
        "Bee Smooth",
        "Honey Spur",
        "Bee Lucky",
        "Buzzwave",
        "Bee Thrill",
        "Bee Star",
        "Honey Spring",
        "Bee Lovely",
        "Buzzbeat",
        "Bee Time",
        "Bee Swirl",
        "Honey Squeeze",
        "Bee Joy",
        "Buzzlife",
        "Bee Unique",
        "Bee Tasty",
        "Honey Sunshine",
        "Bee Jive",
        "Buzzshine",
        "Bee Tune",
        "Bee Tickle",
        "Honey Twirl",
        "Bee Jolly",
        "Buzz Sizzle",
        "Bee Vibe",
        "Bee Twist",
        "Honey Twist",
        "Bee Joyful",
        "Buzz Vibe",
        "Bee Zen",
        "Bee Zest",
        "Honey Wave"
    };
        
        // Create a new SQL_Requestor object
        SQL_Requestor requestor = new SQL_Requestor();
        int[] vids = new int[NUM_BEES];
        // Randomly generate 2.5 Million Bees
        for (int i = 0; i < NUM_BEES; i++) {
            vids[i] = (int)(Math.random() * 85 + 1);
            final int j = i;
            requestor.insert("biene", new LinkedHashMap<String, String>() {{
                put("VID", Integer.toString(vids[j]));
                put("Name", names[(int)(Math.random() * names.length)]);
                put("GebDatum", "" + (int)(Math.random() * 20 + 2000) + "-" + (int)(Math.random() * 12 + 1) + "-" + (int)(Math.random() * 28 + 1));
                put("Rasse", (Math.random() < 0.5) ? "Buckfast" : "Carnica");
            }});
        }

        // choose one singular bee per VID to be the queen
        int[] queenIndexes = new int[85];
        for (int i = 0; i < 85; i++) {
            for (int j = 0; j < NUM_BEES; j++) {
                if (vids[j] == i + 1) {
                    queenIndexes[i] = j;
                    break;
                }
            }
        }

        // BeeID is index of queenIndexes + 1
        for (int i = 0; i < 85; i++) {
            final int j = i;
            requestor.insert("koenigin", new LinkedHashMap<String, String>() {{
                put("BeeID", Integer.toString(queenIndexes[j] + 1));
                put("VID", Integer.toString(j + 1));
                put("istBegattet", (Math.random() < 0.5) ? "1" : "0");
            }});
            requestor.insert("zuechtet", new LinkedHashMap<String, String>() {{
                put("BeeID", Integer.toString(queenIndexes[j] + 1));
                put("VID", Integer.toString(j + 1));
                put("IID", Integer.toString((int)(Math.random() * 10 + 1)));
            }});
        }

        // set vid in array to -1 for all queens to filter them out for the next step
        for (int i = 0; i < 85; i++) {
            vids[queenIndexes[i]] = -1;
        }

        System.out.println("Queens inserted");

        // Set 90% of the remaining bees to be workers (Table arbeiterin) and 10% to be drones (Table drohn), set respective attributes of tables
        for (int i = 0; i < NUM_BEES; i++) {
            if (vids[i] != -1) {
                // decide if bee is drone or worker
                if (Math.random() < 0.1) {
                    final int j = i;
                    requestor.insert("drohn", new LinkedHashMap<String, String>() {{
                        put("BeeID", Integer.toString(j + 1));
                        put("VID", Integer.toString(vids[j]));
                        put("istGeschlechtsreif", (Math.random() < 0.5) ? "1" : "0");
                    }});
                } else {
                    final int j = i;
                    requestor.insert("arbeiterin", new LinkedHashMap<String, String>() {{
                        put("BeeID", Integer.toString(j + 1));
                        put("VID", Integer.toString(vids[j]));
                        
                        // Randomly set AID to be between 1 and 5
                        put("AID", Integer.toString((int)(Math.random() * 5 + 1)));
                    }});
                }
            }
        }
        

        
        // Close the connection
        requestor.close();
    }
}
