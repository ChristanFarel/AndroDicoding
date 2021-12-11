package com.example.dicodingproject

object DataBarang {
    private var namaBarang = arrayOf(
        "Handphone",
        "Jaket",
        "Kaos",
        "Karpet",
        "Keyboard",
        "Kursi",
        "Meja",
        "Mobil",
        "Mouse",
        "Televisi"
    )

    private  var fotoBarang = intArrayOf(
        R.drawable.handphone,
        R.drawable.jaket,
        R.drawable.kaos,
        R.drawable.karpet,
        R.drawable.keyboard,
        R.drawable.kursi_gaming,
        R.drawable.meja,
        R.drawable.mobil,
        R.drawable.mouse_gaming,
        R.drawable.tv
    )

    private  var Deskripsi = arrayOf(
        "Vivo Y12 merupakan handphone HP dengan kapasitas 5000mAh dan layar 6.3\" yang dilengkapi dengan kamera belakang 13 + 8 + 2MP dengan tingkat densitas piksel sebesar 268ppi dan tampilan resolusi sebesar 720 x 1544pixels. Dengan berat sebesar 190.5g, handphone HP ini memiliki prosesor Octa Core",
        "Bahan Baby Kanvas\n" +
                "Size M/L dan XL\n" +
                "Size M/L = LD112cm x P68cm\n" +
                "Size XL = LD116cm x P72cm\n" +
                "Jahitan Rapi\n" +
                "REAL PICTURE\n" +
                "Cocok untuk segala Aktifitas\n" +
                "Adem di Pakai\n" +
                "Menyerap keringat\n" +
                "Nyaman di pakai sehari-hari\n" +
                "Warna sesuai GAMBAR\n" +
                "Tahan Lama (AWET)\n" +
                "Harga sangat terjangkau\n" +
                "Ukuran LOKAL (mengikuti Size Indo)\n" +
                "Pelayanan/Pengiriman Fast Respon",
        "Code: WG24\n" +
                "Bahan: 100% Full Cotton\n" +
                "Fit: Slim Fit\n" +
                "Available Size: S-XL\n" +
                "Status: Ready Stock\n" +
                "\n" +
                "Detail Ukuran :\n" +
                "S : Lebar Dada :48 cm - Panjang Baju: 68 cm\n" +
                "M : Lebar Dada :50 cm - Panjang Baju: 70 cm\n" +
                "L : Lebar Dada :52 cm - Panjang Baju: 72 cm\n" +
                "XL : Lebar Dada :54 cm - Panjang Baju: 74 cm\n" +
                "XXL : Lebar Dada :56 cm - Panjang Baju: 76 cm\n" +
                "Toleransi Ukuran 1-2 cm untuk lebar dada, panjang baju dan panjang lengan.",
        "karpet busa bulu rasfur\n" +
                "- random=dikirim acak/tidak bisa pilih motif\n" +
                "- bahan bulu lembut, nyaman\n" +
                "- tersedia 3 ukuran (90x150, 120x180, 180x200)\n" +
                "- ketebalan busa 1.8 cm, tinggi bulu saja 1 cm\n" +
                "- tebal keseluruhan 2.8 cm\n" +
                "- backing anti slip/ tidak licin\n" +
                "- karpet rasfur modern yang dilaminating dengan latex secara mesin, beda dengan rasfur yang ada saat ini di pasaran yang hanya dilaminating secara manual dengan tangan",
        "Keyboard Gaming NYK TKL K01\n" +
                "keyboard ini sangat direkomendasikan untuk anda pecinta gaming,\n" +
                "NYK NK 01 ini memiliki kualitas keyboard yang sangat dapat anda andalakan,\n" +
                "Fitur Backligh 3 Variasi, TKL, Serta matrial yang mempuni dan harga yang bersaing sangat pas untuk gamer seperti anda. Kelebihan Keyboard ini Adalah\n" +
                "\n" +
                "TKL Backlight\n" +
                "Material Kokoh dan berat pas\n" +
                "Tombol empuk dan responsive\n" +
                "Lampu 3 Warna 3 Variasi (pencet tombol SL untuk merubah)\n" +
                "Kabel model tali tebal\n" +
                "Plug n Play\n" +
                "Support Mac, Win 7 Hingga Win 8 dan 10",
        "\uD83D\uDC49Tinggi total 125-133CM\uD83D\uDC48\n" +
                "\uD83D\uDC49Tinggi belakang: 80 CM\uD83D\uDC48\n" +
                "\uD83D\uDC49Lebar tempat duduk: 38CM\uD83D\uDC48\n" +
                "\uD83D\uDC49Kedalaman duduk: 48cm\uD83D\uDC48\n" +
                "\uD83D\uDC49Tinggi tempat duduk: 36-46 CM\uD83D\uDC48\n" +
                "\uD83D\uDC49Kaki baja kursi\uD83D\uDC48\n" +
                "\uD83D\uDC49Garis halus\uD83D\uDC48\n" +
                "\n" +
                "⚡Dukungan ilmiah\n" +
                "Desain ergonomis membantu Anda menstabilkan hasil. Bantalan diisi dengan busa elastis tinggi, yang lembut dan elastis, dan sandaran lengan yang dapat disesuaikan membuat pengoperasian lebih fleksibel.",
        "Meja makan lesehan minimalis produk putraeskaha furniture\n" +
                "Diproduksi dari bahan blockboard 18 mm dilapisi HPL berbagai varian warna glossy atau serat kayu.\n" +
                "Model kaki kaki lipat dari aluminium 7/8 yang berkwalitas hasil rekayasa sederhana, satu satunya di pasaran online.\n" +
                "Luas alas 60X100 cm tebal 18 mm\n" +
                "Tinggi 2 pilihan 26 ( standard anak anak) dan 30 ( dewasa )\n" +
                "Berat bersih 7 kg setelah packing.",
        "OA-OLXAutosPejaten-20211118-00001\n" +
                "Toyota Rush 1.5 TRD Sportivo Bensin A/T 2018 Hitam\n" +
                "TDP Rp45,000,000,-\n" +
                "Ang Rp5,475,000 x 47bln\n" +
                "Ang Rp4,670,000 x 59bln\n" +
                "Harga Cash : Rp220,000,000,-\n" +
                "Harga Credit : Rp215,000,000,-",
        "SPESIFIKASI TEKNIS\n" +
                "Sensor hybrid Fusion Engine\n" +
                "8 tombol yang dapat diprogram\n" +
                "Penggantian DPI dengan Seketika\n" +
                "Prosesor ARM 32-bit\n" +
                "Laporan 1 milidetik\n" +
                "Mengklik berkecepatan tinggi\n" +
                "USB kecepatan penuh",
        "Detail produk dari COOCAA LED TV 43 INCH - ANDROID 11.0 - Digital TV - 2.4G/5G WIFI (Coocaa 43S7G)\n" +
                "\n" +
                "✓ Certified Android 11.0\n" +
                "✓ Support Google Assistant\n" +
                "✓ Clear and Bright 43 inch LED screen with FHD (1920*1080)\n" +
                "✓ Graphic Processing Unit Mali G31MP2\n" +
                "✓ Support Bluetooth 5.0\n" +
                "✓ Support Chrome cast\n" +
                "✓ Frameless Design\n" +
                "✓ Certified Netflix\n" +
                "✓ Certified Youtube\n" +
                "✓ Analog & Digital TV DVB T/T2 , DVB-C\n" +
                "✓ USB 2 Port (V2.0), HDMI 2 Port (V2.0b), LAN 1 Port\n" +
                "✓ Power Consumption 74W\n" +
                "✓ Packing size（Width*thickness*hight）/mm : 731.7*83.2*439.2\n" +
                "✓ Support Video format : MPG/MPEG1/MPEG2/MPEG4/H.263/H.264/MP4/MKV/AVI/ASF/FLV\n" +
                "✓ Support Image format : BMP、JPEG、PNG\n" +
                "✓ Support Audio format : MP3/AAC/HEAAC/LPCM/IMA-ADPCM/MS-ADPCM\n" +
                "✓ 3 Years Panel Warranty + 1 Year Spare Part"
    )

    private  var harga = arrayOf(
        "Rp. 2.500.000",
        "Rp. 150.000",
        "Rp. 75.000",
        "Rp. 210.000",
        "Rp. 309.000",
        "Rp. 1.001.000",
        "Rp. 1.300.000",
        "Rp. 200.000.000",
        "Rp. 267.000",
        "Rp. 3.400.000"
    )

    val data: ArrayList<Barang>
        get() {
            val list = arrayListOf<Barang>()
            for (position in namaBarang.indices) {
                val barang = Barang()
                barang.NamaBarang = namaBarang[position]
                barang.Deskripsi = Deskripsi[position]
                barang.harga = harga[position]
                barang.Foto = fotoBarang[position]
                list.add(barang)
            }
            return list
        }

}