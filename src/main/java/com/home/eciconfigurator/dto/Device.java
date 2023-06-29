package com.home.eciconfigurator.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class Device implements Serializable {
    private String type = "set";
    private String deviceType;
    private String id;
    private String name;
    private String firmwareVer;
    private String mbAddress;
    private String mbSpeed;
    private String wifiLogin;
    private String wifiPassword;            //8

    //======================= options ============================
    @JsonProperty("1")
    private String mb_1;
    @JsonProperty("2")
    private String mb_2;
    @JsonProperty("3")
    private String mb_3;
    @JsonProperty("4")
    private String mb_4;
    @JsonProperty("5")
    private String mb_5;
    @JsonProperty("6")
    private String mb_6;
    @JsonProperty("7")
    private String mb_7;
    @JsonProperty("8")
    private String mb_8;
    @JsonProperty("9")
    private String mb_9;
    @JsonProperty("10")
    private String mb_10;
    @JsonProperty("11")
    private String mb_11;
    @JsonProperty("12")
    private String mb_12;
    @JsonProperty("13")
    private String mb_13;
    @JsonProperty("14")
    private String mb_14;
    @JsonProperty("15")
    private String mb_15;
    @JsonProperty("16")
    private String mb_16;
    @JsonProperty("17")
    private String mb_17;
    @JsonProperty("18")
    private String mb_18;
    @JsonProperty("50")
    private String mb_50;
    @JsonProperty("51")
    private String mb_51;                  //20

    //======================= text ============================
    @JsonProperty("100")
    private String mb_100;

    @JsonProperty("101")
    private String mb_101;
    @JsonProperty("102")
    private String mb_102;
    @JsonProperty("103")
    private String mb_103;
    @JsonProperty("104")
    private String mb_104;
    @JsonProperty("105")
    private String mb_105;
    @JsonProperty("106")
    private String mb_106;
    @JsonProperty("107")
    private String mb_107;
    @JsonProperty("108")
    private String mb_108;
    @JsonProperty("109")
    private String mb_109;
    @JsonProperty("110")
    private String mb_110;

    @JsonProperty("111")
    private String mb_111;
    @JsonProperty("112")
    private String mb_112;
    @JsonProperty("113")
    private String mb_113;
    @JsonProperty("114")
    private String mb_114;
    @JsonProperty("115")
    private String mb_115;
    @JsonProperty("116")
    private String mb_116;
    @JsonProperty("117")
    private String mb_117;
    @JsonProperty("118")
    private String mb_118;
    @JsonProperty("119")
    private String mb_119;
    @JsonProperty("120")
    private String mb_120;                 //21

    @JsonProperty("121")
    private String mb_121;
    @JsonProperty("122")
    private String mb_122;
    @JsonProperty("123")
    private String mb_123;
    @JsonProperty("124")
    private String mb_124;
    @JsonProperty("125")
    private String mb_125;
    @JsonProperty("126")
    private String mb_126;
    @JsonProperty("127")
    private String mb_127;
    @JsonProperty("128")
    private String mb_128;
    @JsonProperty("129")
    private String mb_129;
    @JsonProperty("130")
    private String mb_130;

    @JsonProperty("131")
    private String mb_131;
    @JsonProperty("132")
    private String mb_132;
    @JsonProperty("133")
    private String mb_133;
    @JsonProperty("134")
    private String mb_134;
    @JsonProperty("135")
    private String mb_135;
    @JsonProperty("136")
    private String mb_136;
    @JsonProperty("137")
    private String mb_137;
    @JsonProperty("138")
    private String mb_138;
    @JsonProperty("139")
    private String mb_139;
    @JsonProperty("140")
    private String mb_140;                 //20

    //======================= qr-code ============================

    @JsonProperty("202")
    private String mb_202;
    @JsonProperty("203")
    private String mb_203;
    @JsonProperty("204")
    private String mb_204;
    @JsonProperty("205")
    private String mb_205;
    @JsonProperty("206")
    private String mb_206;
    @JsonProperty("207")
    private String mb_207;
    @JsonProperty("208")
    private String mb_208;
    @JsonProperty("209")
    private String mb_209;
    @JsonProperty("210")
    private String mb_210;
    @JsonProperty("211")
    private String mb_211;
    @JsonProperty("212")
    private String mb_212;
    @JsonProperty("213")
    private String mb_213;
    @JsonProperty("214")
    private String mb_214;
    @JsonProperty("215")
    private String mb_215;
    @JsonProperty("216")
    private String mb_216;
    @JsonProperty("217")
    private String mb_217;                 //16
}
