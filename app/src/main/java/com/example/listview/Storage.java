package com.example.listview;

public class Storage {

    public String[] engineering() {
        final String[] subject = {"Aeronautical Engineering", "Architect Engineer", "Automobile Engineering", "Civil Engineering", "Computer Engineering", "Electrical Engineering", "Electronics Engineering", "IT Engineering", "Mechanical Engineering"};
        return subject;
    }

    public String[] SubSubjects(int pos1){
        final String[][] subject = {{"Airlines"},{"NTC"},{"Airlines"},{"ADBL","NEA","NTC","PSC"},{"Airlines","NEA","NTC","NTV","PSC"},{"NEA","NTC","NTV","PSC"},{"Airlines","NTC","NTV","PSC"},{"ADBL","NBL","NRB","RBB"},{"Airlines","NEA","PSC"}};
        return subject[pos1];
    }

    public String[] DisplayThird(int pos1, int pos2){
        final String[][][] subject={{{"Operations Engineer","Senior Technical Officer"}},{{"Operations Engineer"}},{{"Senior Technical Officer","Senior Technician"}},{{"Civil Ovearseer"},{"Civil Level-4","Civil Level-5","Civil Level-7"},{"First Paper","Second Paper"},{"Building","General","Highway","Hydrology","Hydropower","Irrigation","Mining","Sanitary"}},{{"Computer Engineering Level 7"},{"Computer Engineering Level 7"},{"First Paper","Second Paper"},{"Assistant Computer Engineering Level-5","Computer Engineering Level-6"},{"First Paper","Second Paper"}},{{"Level 3","Level 4","Level 5","Level 7"},{"First Paper","Second Paper"},{"Assistant Technician","Electrical Engineering","Senior Assistant Technician"},{"First Paper","Second Paper"}},{{"Electical Enigneering"},{"First Paper","Second Paper"},{"Assistant Technical","Electronic Engineer","Senior Assistant Technician"},{"First Paper","Second Paper"}},{{"Senior IT Enigneer"},{"Assistant IT Engineer"},{"Senior IT Engineer-Level-5"},{"Senior IT Engineer-Level-5"}},{{"Senio Technical Officer","Senior Technical Officer-Automobile","Senior Technician-Automobile"},{"Mechnical-Level-3","Mechnical-Level-4","Mechnical-Level-5","Mechnical-Level-7"},{"Mechnical Engineer(First Paper)","Mechnical Engineer(Second Paper)"}}};
        return subject [pos1][pos2];
    }
    public String PdfFile(int pos1,int pos2,int pos3){
        final String[][][] subject={{{"Operations Engineer","Senior Technical Officer"}},{{"Operations Engineer"}},{{"Senior Technical Officer","Senior Technician"}},{{"Civil Ovearseer"},{"Civil Level-4","Civil Level-5","Civil Level-7"},{"First Paper","Second Paper"},{"Building","General","Highway","Hydrology","Hydropower","Irrigation","Mining","Sanitary"}},{{"Computer Engineering Level 7"},{"Computer Engineering Level 7"},{"First Paper","Second Paper"},{"Assistant Computer Engineering Level-5","Computer Engineering Level-6"},{"First Paper","Second Paper"}},{{"Level 3","Level 4","Level 5","Level 7"},{"First Paper","Second Paper"},{"Assistant Technician","Electrical Engineering","Senior Assistant Technician"},{"First Paper","Second Paper"}},{{"Electical Enigneering"},{"First Paper","Second Paper"},{"Assistant Technical","Electronic Engineer","Senior Assistant Technician"},{"First Paper","Second Paper"}},{{"Senior IT Enigneer"},{"Assistant IT Engineer"},{"Senior IT Engineer-Level-5"},{"Senior IT Engineer-Level-5"}},{{"Senio Technical Officer","Senior Technical Officer-Automobile","Senior Technician-Automobile"},{"Mechnical-Level-3","Mechnical-Level-4","Mechnical-Level-5","Mechnical-Level-7"},{"Mechnical Engineer(First Paper)","Mechnical Engineer(Second Paper)"}}};
        return subject[pos1][pos2][pos3];
    }
    public String[] Civil(int pos){
        String[][] subject={{"Building-First Paper","Building-First Paper"},{"General-First Paper","General-First Paper"},{"Highway-First Paper","Highway-First Paper"},{"Hydrology-First Paper","Hydrology-First Paper"},{"Hydropower-First Paper","Hydropower-First Paper"},{"Irrigation-First Paper","Irrigation-First Paper"},{"Mining-First Paper","Mining-First Paper"},{"Sanitary-First Paper","Sanitary-First Paper"}};
        return subject[pos];
    }
}

