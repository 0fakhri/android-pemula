package com.kulitekno.submit;
import java.util.ArrayList;

public class data {
    private static String[] jetNames = {
            "Dassault Rafale",
            "Eurofighter Typhoon",
            "F-16 Fighting Falcon",
            "F-22 Raptor",
            "F-35 Lightning II",
            "Sukhoi Su-27",
            "Sukhoi Su-33",
            "Sukhoi Su-35",
            "Sukhoi Su-57",
            "T-50 Golden Eagle"
    };

    private static String[] jetDetails = {
            "Dassault Rafale (dijuluki sebagai Squall dalam Bahasa Inggris) adalah pesawat tempur serbaguna generasi ke-4.5, bermesin dua, dan bersayap delta asal Prancis yang dibuat oleh Dassault Aviation. Rafale dirancang sebagai pesawat berpangkalan di daratan maupun di kapal induk. Program pesawat Rafale terdiri dari tiga versi pesawat tempur mesin-kembar multi-peran, versi satu-tempat duduk Rafale C, versi dua-tempat duduk Rafale B dan versi AL (kapal induk) adalah Rafale M. Tiga versi pesawat tempur ini dilengkapi dengan mesin, sistem tempur dan navigasi, sistem managemen pesawat dan sistem kontrol penerbangan yang sama. Mereka semua dapat melakukan semua tipe misi dari penyerangan daratan sampai superioritas udara. ",
            "Eurofighter Typhoon adalah pesawat tempur multirole generasi keempat dengan desain sayap Delta dan Canard buatan konsorsium bersama negara-negara Eropa dalam Eurofighter GmbH, Holding Company Eurofighter GmbH terdiri atas tiga perusahaan aeronautical ternama seperti Alenia Aeronautica (Itali), BAE System (United Kingdom), EADS ( Prancis, Jerman dan Spanyol) yang dibentuk mulai tahun 1986. Proyek tersebut dikelola oleh NATO Eurofighter and Tornado Management Agency. Sampai saat ini Typoon sudah dipakai di British Royal Air Force, German Luftwaffe, Italian Air Force, Spanish Air Force dan Austrian Air Force serta Saudi Arabia telah meneken kontrak pembelian senilai U.S$ 9.5 billion untuk 72 unit pesawat berbeda dengan Dassault Rafale yang belum menghasilkan kontrak di satu negarapun meskipun pengembangannya dilakukan bersama-sama pada awalnya. ",
            "F-16 sendiri dikenal memiliki kemampuan tempur di udara yang sangat baik, dengan inovasi seperti tutup kokpit tanpa bingkai yang memperjelas penglihatan, gagang pengendali samping untuk memudahkan kontrol pada kecepatan tinggi, dan kursi kokpit yang dirancang untuk mengurangi efek g-force pada pilot. Pesawat ini juga merupakan pesawat tempur pertama yang dibuat untuk menahan daya belokan pada percepatan 9g. F-16 mempunyai senapan M61 Vulcan pada bagian dalam badan pesawat serta 11 lokasi pylon untuk mnggotong senjata dan peralatan misi lainya. Nama resmi dari F-16 sendiri ialah\"Fighting Falcon\", tetapi \"Viper\" lebih umum digunakan oleh kru darat dan pilot-pilot pesawat tersebut, karena kemiripan bentuknya dengan ular Viperidae dan Starfighter Colonial Viper dari acara TV Battlestar Galactica.",
            "F-22 Raptor adalah pesawat tempur siluman buatan Amerika Serikat. Pesawat ini awalnya direncanakan untuk dijadikan pesawat tempur superioritas udara untuk digunakan menghadapi pesawat tempur Uni Soviet, tetapi pesawat ini juga dilengkapi peralatan untuk serangan darat, peperangan elektronik, dan sinyal intelijen. Pesawat ini melalui masa pengembangan yang panjang, versi prototipnya diberi nama YF-22, tiga tahun sebelum secara resmi dipakai diberi nama F/A-22, dan akhirnya diberi nama F-22A ketika resmi mulai dipakai pada Desember 2005. Lockheed Martin Aeronautics adalah kontraktor utama yang bertanggungjawab memproduksi sebagian besar badan pesawat, persenjataan, dan perakitan F-22. Kemudian mitranya, Boeing Integrated Defense Systems memproduksi sayap, peralatan avionik, dan pelatihan pilot dan perawatan. ",
            "F-35 Lightning II adalah hasil pengembangan dari pesawat X-35 dalam program Joint Strike Fighter. Pesawat ini adalah pesawat tempur supersonik berkursi tunggal, bermesin tunggal, yang dapat melakukan banyak fungsi, antara lain pertempuran udara-ke-udara, dukungan udara jarak dekat, dan pengeboman taktis. Pengembangan pesawat ini dibiayai oleh Amerika Serikat, Britania Raya dan beberapa negara lainnya. Pesawat ini dikembangkan dan diproduksi oleh industri kedirgantaraan yang dipimpin oleh Lockheed Martin serta dua rekan utamanya, BAE Systems dan Northrop Grumman. Pesawat demonstrasi pertama kali terbang pada tahun 2000, dan pesawat versi produksi pertama kali terbang pada 15 Desember 2006. ",
            "Sukhoi SU-27 adalah pesawat tempur yang awalnya diproduksi oleh Uni Soviet, dan dirancang oleh Biro Desain Sukhoi. Pesawat ini direncanakan untuk menjadi saingan utama generasi baru pesawat tempur Amerika Serikat (yaitu F-14 Tomcat, F-15 Eagle, F-16 Fighting Falcon, dan F/A-18 Hornet). SU-27 memiliki jarak jangkau yang jauh, persenjataan yang berat, dan kelincahan yang tinggi. Pesawat ini sering disebut sebagai hasil persaingan antara Sukhoi dengan Mikoyan-Gurevich, karena Su-27 dan MiG-29 berbentuk mirip. Ini adalah keliru, karena SU-27 dirancang sebagai pesawat interseptor dan pesawat tempur superioritas udara jarak jauh, sedangkan MiG-29 dirancang untuk mengisi peran pesawat tempur pendukung jarak dekat. ",
            "Sukhoi Su-33 adalah pesawat tempur angkatan laut yang dikembangkan oleh Sukhoi pada tahun 1982 untuk dipakai di atas kapal induk. Pesawat ini merupakan pengembangan dari Su-27, dan sebelumnya diberi nama Su-27K. Perbedaan Su-27 dengan Su-33 adalah Su-33 dilengkapi peralatan untuk diluncurkan dan mendarat di kapal induk (seperti cantolan belakang dan sayap lipat), dapat dipasang canard, dan dapat mengisi bahan bakar di udara. Sesuai dengan misinya, pesawat ini bisa dianggap sebanding dengan F-14 Tomcat Amerika Serikat, sedangkan MiG-29K 'Fulcrum-D' sebanding dengan F/A-18 Hornet. ",
            "Sukhoi Su-35 (kode NATO: Flanker-E) adalah pesawat tempur multiperan, kelas berat, berjelajah panjang, dan bertempat duduk tunggal asal Rusia. Pesawat ini dikembangkan dari Su-27, dan awalnya diberi nama Su-27M. Pesawat ini dikembangkan untuk menandingi F-15 Eagle dan F-16 Fighting Falcon. Karena kesamaan fitur dan komponen yang dikandungnya, Su-35 dianggap sebagai sepupu dekat Sukhoi Su-30MKI, sebuah varian Su-30 yang diproduksi untuk India. Pesawat ini sendiri merupakan seri flanker terakhir dan merupakan pengisi kekosongan generasi antara generasi 4 dan generasi 5, bisa dimasukkan dalam generasi 4++.",
            "Sukhoi Su-57 adalah pesawat tempur siluman, kursi tunggal, mesin ganda multiperan generasi kelima yang dikembangkan sejak 2002 untuk superioritas udara dan operasi serangan. Pesawat ini adalah produk dari PAK FA , program pesawat tempur generasi kelima dari Angkatan Udara Rusia . Nama internal Sukhoi untuk pesawat tersebut adalah T-50 . Su-57 direncanakan menjadi pesawat pertama dalam dinas militer Rusia yang menggunakan teknologi siluman . Penerbangan perdananya berlangsung pada 29 Januari 2010 dan pesawat produksi pertama direncanakan akan dikirimkan pada tahun 2020. Pesawat tempur ini dirancang untuk memiliki supercruise , kemampuan supermanuver , siluman , dan avionik canggih untuk mengatasi pesawat tempur generasi sebelumnya serta pertahanan darat dan laut. Su-57 dimaksudkan untuk menggantikan MiG-29 dan Su-27 di Angkatan Udara Rusia.",
            "T-50 Golden Eagle adalah pesawat latih (trainer) supersonik buatan Amerika Serikat-Korea Selatan. Dikembangkan oleh Korean Aerospace Industries dengan bantuan Lockheed Martin. Program ini juga melahirkan A-50, atau T-50 LIFT, sebagai varian serang ringan. Walaupun militer Amerika Serikat tidak ada rencana untuk membeli pesawat ini, tetapi penamaan militer amerika secara resmi diminta untuk pesawat ini guna menghindari konflik penamaan dikemudian hari. Program T/A-50 dimaksudkan sebagai pengganti dari berbagai pesawat latih dan serang ringan. Ini termasuk T-38 dan F-5B untuk pelatihan dan Cessna A-37BClose Air Support; yang dioperasikan AU Republik Korea. Program ini pada awalnya dimaksudkan untuk mengembangkan pesawat latih (trainer) secara mandiri yang mampu mencapai kecepatan supersonik untuk melatih dan mempersiapkan pilot bagi pesawat KF-16 (F-16 versi Korea).",
    };

    private static int[] jetImages = {
            R.drawable.rafale,
            R.drawable.typhoon,
            R.drawable.f16,
            R.drawable.f22,
            R.drawable.f35,
            R.drawable.su27,
            R.drawable.su30,
            R.drawable.su35,
            R.drawable.su57,
            R.drawable.t50,
    };

    private static String[] panjang = {
            "15,27 m",
            "15,96 m",
            "15 m",
            "18,8 m",
            "15,6",
            "21,9 m",
            "21,93 m",
            "21,9 m",
            "22 m",
            "13,14 m",
    };

    private static String[] tinggi = {
            "5,34 m",
            "5,28 m",
            "4,8 m",
            "5,1 m",
            "4,3 m",
            "5,93 m",
            "6,36 m",
            "5,90 m",
            "6,05 m",
            "4,94 m",
    };

    private static String[] sayap = {
            "10,80 m",
            "10,95 m",
            "9,9 m",
            "13,4 m",
            "10,6 m",
            "14,7 m",
            "14,7 m",
            "15,3 m",
            "14,2 m",
            "9,45 m",
    };

    private static String[] mesin ={
            "2 × Snecma M88-2 turbofan",
            "2 x Eurojet EJ200",
            "1 × F110-GE-100 afterburning turbofan",
            "2 × Pratt & Whitney F119-PW-100 Turbofan",
            "1 × Pratt & Whitney F135 afterburning turbofan",
            "2 × Lyulka AL-31F turbofan",
            "2 × AL-31FL low-bypass turbofan",
            "2 × Saturn 117S turbofan TVC",
            "2 × Saturn-Lyulka AL-41F turbofan",
            "1 x General Electric F404-GE-102 ",
    };

    private static String[] speedMax = {
            "Mach 2",
            "Mach 2",
            "Mach 2",
            "Mach 2,42",
            "Mach 1,67",
            "Mach 2,35",
            "Mach 2",
            "Mach 2,25",
            "Mach 2",
            "Mach 1,5",
    };

    static ArrayList<jet> getListData() {
        ArrayList<jet> list = new ArrayList<>();
        for (int position = 0; position < jetNames.length; position++) {
            jet Jet = new jet();
            Jet.setName(jetNames[position]);
            Jet.setDetail(jetDetails[position]);
            Jet.setPhoto(jetImages[position]);
            Jet.setLenght(panjang[position]);
            Jet.setHeight(tinggi[position]);
            Jet.setWidht(sayap[position]);
            Jet.setMachine(mesin[position]);
            Jet.setSpeed(speedMax[position]);
            list.add(Jet);
        }
        return list;
    }
}
