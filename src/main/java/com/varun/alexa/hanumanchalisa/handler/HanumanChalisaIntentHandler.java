package com.varun.alexa.hanumanchalisa.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class HanumanChalisaIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("hanuman_chalisa"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "Sri Hanuman Chalisa\n" + "\n" + "\n" + "Doha\n" + "\n" + "Shri Guru Charan Sarooja-raj " +
                "Nija manu Mukura Sudhaari\n" + "Baranau Rahubhara Bimala Yasha Jo Dayaka Phala Chari\n" + "Budhee-Heen " +
                "Thanu Jannikay Sumirow Pavana Kumara\n" + "Bala-Budhee Vidya Dehoo Mohee Harahu Kalesha Vikaara\n" +
                "\n" + "\n" + "Chopai\n" + "\n" + "Jai Hanuman gyan gun sagar\n" + "Jai Kapis tihun lok ujagar\n" +
                "\n" + "\n" + "Ram doot atulit bal dhama\n" + "Anjaani-putra Pavan sut nama\n" + "\n" + "\n" +
                "Mahabir Bikram Bajrangi\n" + "Kumati nivar sumati Ke sangi\n" + "\n" + "\n" + "Kanchan varan viraj subesa\n" +
                "Kanan Kundal Kunchit Kesha\n" + "\n" + "\n" + "Hath Vajra Aur Dhuvaje Viraje\n" + "Kaandhe moonj janehu" +
                " sajai\n" + "\n" + "\n" + "Sankar suvan kesri Nandan\n" + "Tej prataap maha jag vandan\n" + "\n" + "\n" +
                "Vidyavaan guni ati chatur\n" + "Ram kaj karibe ko aatur\n" + "\n" + "\n" + "Prabu charitra sunibe-ko rasiya\n" +
                "Ram Lakhan Sita man Basiya\n" + "\n" + "\n" + "Sukshma roop dhari Siyahi dikhava\n" + "Vikat roop dhari" +
                " lank jarava\n" + "\n" + "\n" + "Bhima roop dhari asur sanghare\n" + "Ramachandra ke kaj sanvare\n" +
                "\n" + "\n" + "Laye Sanjivan Lakhan Jiyaye\n" + "Shri Raghuvir Harashi ur laye\n" + "\n" + "\n" +
                "Raghupati Kinhi bahut badai\n" + "Tum mam priye Bharat-hi-sam bhai\n" + "\n" + "\n" + "Sahas badan " +
                "tumharo yash gaave\n" + "Asa-kahi Shripati kanth lagaave\n" + "\n" + "\n" + "Sankadhik Brahmaadi Muneesa\n" +
                "Narad-Sarad sahit Aheesa\n" + "\n" + "\n" + "Yam Kuber Digpaal Jahan te\n" + "Kavi kovid kahi sake kahan te\n" +
                "\n" + "\n" + "Tum upkar Sugreevahin keenha\n" + "Ram milaye rajpad deenha\n" + "\n" + "\n" +
                "Tumharo mantra Vibheeshan maana\n" + "Lankeshwar Bhaye Sub jag jana\n" + "\n" + "\n" +
                "Yug sahastra jojan par Bhanu\n" + "Leelyo tahi madhur phal janu\n" + "\n" + "\n" +
                "Prabhu mudrika meli mukh mahee\n" + "Jaladhi langhi gaye achraj nahee\n" + "\n" + "\n" +
                "Durgaam kaj jagath ke jete\n" + "Sugam anugraha tumhre tete\n" + "\n" + "\n" + "Ram dwaare tum rakhvare\n" +
                "Hoat na agya binu paisare\n" + "\n" + "\n" + "Sub sukh lahae tumhari sar na\n" + "Tum rakshak kahu ko dar naa\n" +
                "\n" + "\n" + "Aapan tej samharo aapai\n" + "Teenhon lok hank te kanpai\n" + "\n" + "\n" +
                "Bhoot pisaach Nikat nahin aavai\n" + "Mahavir jab naam sunavae\n" + "\n" + "\n" + "Nase rog harae sab peera\n" +
                "Japat nirantar Hanumant beera\n" + "\n" + "\n" + "Sankat se Hanuman chudavae\n" + "Man Karam Vachan dyan jo lavai\n" +
                "\n" + "\n" + "Sab par Ram tapasvee raja\n" + "Tin ke kaj sakal Tum saja\n" + "\n" + "\n" + "Aur manorath jo " +
                "koi lavai\n" + "Sohi amit jeevan phal pavai\n" + "\n" + "\n" + "Charon Yug partap tumhara\n" + "Hai " +
                "persidh jagat ujiyara\n" + "\n" + "\n" + "Sadhu Sant ke tum Rakhware\n" + "Asur nikandan Ram dulhare\n" +
                "\n" + "\n" + "Ashta-sidhi nav nidhi ke dhata\n" + "As-var deen Janki mata\n" + "\n" + "\n" + "Ram rasayan" +
                " tumhare pasa\n" + "Sada raho Raghupati ke dasa\n" + "\n" + "\n" + "Tumhare bhajan Ram ko pavai\n" +
                "Janam-janam ke dukh bisraavai\n" + "\n" + "\n" + "Anth-kaal Raghuvir pur jayee\n" + "Jahan janam " +
                "Hari-Bakht Kahayee\n" + "\n" + "\n" + "Aur Devta Chit na dharehi\n" + "Hanumanth se hi sarve sukh " +
                "karehi\n" + "\n" + "\n" + "Sankat kate-mite sab peera\n" + "Jo sumirai Hanumat Balbeera\n" + "\n" + "\n" +
                "Jai Jai Jai Hanuman Gosahin\n" + "Kripa Karahu Gurudev ki nyahin\n" + "\n" + "\n" + "Jo sat bar path kare kohi\n" +
                "Chutehi bandhi maha sukh hohi\n" + "\n" + "\n" + "Jo yah padhe Hanuman Chalisa\n" + "Hoye siddhi sakhi Gaureesa\n" +
                "\n" + "\n" + "Tulsidas sada hari chera\n" + "Keejai Nath Hridaye mein dera\n" + "\n" + "\n" + "Doha\n" + "\n" +
                "Pavan Tanay Sankat Harana \n" + "Mangala Murati Roop\n" + "Ram Lakhana Sita Sahita \n" + "Hriday Basahu Soor Bhoop\n";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Hanuman Chalisa", speechText)
                .build();
    }

}
