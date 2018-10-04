package org.pillworks.pills;

import android.media.Image;

import java.sql.Time;

public class Rx {
    private Image pill_image;
    public static String rx_name;
    private short pill_dosage;
    private String dosage_instructions;
    private Time next_pill;

    Rx(Image image, String name, String instructions, short dosage){
        this.pill_image = image;
        this.rx_name = name;
        this.dosage_instructions = instructions;
        this.pill_dosage = dosage;
    }

    Image getPill_image() { return this.pill_image; }
    String getRx_name() { return this.rx_name; }
    short getPill_dosage() { return this.pill_dosage; }
    String getDosage_instructions() {return this.dosage_instructions; }
    Time getNext_pill() { return this.next_pill; }

    void setPill_image(Image image) { this.pill_image = image; }
    void setRx_name(String name) { this.rx_name = name; }
    void setPill_dosage(short dosage) { this.pill_dosage = dosage; }
    void setDosage_instructions(String instructions) { this.dosage_instructions = instructions; }
    void setNext_pill(Time next) { this.next_pill = next; }
}
