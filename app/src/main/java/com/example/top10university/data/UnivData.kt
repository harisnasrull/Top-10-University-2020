package com.example.top10university.data

import com.example.top10university.R
import com.example.top10university.model.Univ

object UnivData {
    private val univNames = arrayOf(
        "Massachusetts Institute of Technology (MIT)",
        "Stanford University",
        "Harvard University",
        "University of Oxford",
        "California Institute of Technology (Caltech)",
        "ETH Zurich - Swiss Federal Institute of Technology",
        "University of Cambridge",
        "University College London",
        "Imperial College London",
        "University of Chicago"
    )

    private val univDescription = arrayOf(
        """
            Institut Teknologi Massachusetts (Massachusetts Institute of Technology atau MIT), adalah institusi riset swasta dan universitas yang terletak di kota Cambridge, Massachusetts tepat di seberang Sungai Charles dari distrik Back Bay di Boston, Amerika Serikat. MIT memiliki 5 sekolah dan satu kolese, mencakup 32 departemen yang mengkhususkan diri pada sains dan penelitian teknologi.

            Didirikan tahun 1861 sebagai respon atas kemajuan teknologi dan industri di Amerika pada saat itu, universitas ini mengadopsi universitas riset ala Eropa. MIT sekarang berdiri di atas tanah seluas 168 are yang dibuka 1916. Dalam kurun waktu 60 tahun belakangan ini, MIT telah mengembangkan cabang lain seperti manajemen, ekonomi, ilmu politik, dan biologi.

            Departemen dan sekolah yang paling terkenal adalah Lincoln Laboratory, Computer Science and Artificial Intelligence Laboratory, Media Lab, Whitehead Institute dan Sloan School of Management. 59 dari anggota dari komunitas MIT telah memenangkan Penghargaan Nobel.
        """.trimIndent(),
        """
            Universitas Stanford adalah sebuah universitas swasta yang terletak kira-kira 60 kilometer di tenggara San Francisco dan kira-kira 30 km di timur laut San Jose di wilayah Kabupaten Santa Clara yang belum diresmikan sebagai kota. Stanford terletak dekat kota Palo Alto, California, Amerika Serikat tepat di jantung Lembah Silikon baik secara geografis maupun historis.

            Universitas Stanford terletak di kampus universitas kedua terbesar di dunia, dan terdiri atas Sekolah Teknik, Hukum, Kedokteran, Pendidikan, Bisnis, Ilmu bumi, dan Humaniora serta Sains. Universitas ini mempunyai sejumlah program dan sebuah rumah sakit pendidikan selain berbagai kegiatan menjangkau ke masyarakat dan inisiatif relawan.
        """.trimIndent(),
        """
            Universitas Harvard (bahasa Inggris: Harvard University) adalah universitas swasta di Cambridge, Massachusetts, Amerika Serikat dan anggota Ivy League. Universitas ini merupakan salah satu universitas terbaik dunia.
            
            Universitas ini didirikan pada 8 September 1636 dan merupakan perguruan tinggi tertua di Amerika Serikat. Awalnya bernama New College, dan dinamakan ulang menjadi Harvard College pada 13 Maret 1639 untuk menghormati penyumbang terbesarnya, John Harvard, seorang mantan mahasiswa Universitas Cambridge.
        """.trimIndent(),
        """
            Universitas Oxford adalah perguruan tinggi tertua berbahasa Inggris yang berlokasi di kota Oxford, Inggris. Sejarah universitas ini dapat ditelusuri paling tidak mulai akhir abad ke-11, walaupun tanggal tepat pendiriannya tetap tak jelas. Menurut legenda, setelah pecahnya kerusuhan antara mahasiswa dan penduduk kota pada tahun 1209, beberapa akademisi Oxford melarikan diri ke timur laut, ke kota Cambridge, dan mendirikan Universitas Cambridge. Kedua universitas "kuno" ini sejak itu telah saling bersaing satu sama lain, dan merupakan dua perguruan tinggi paling selektif di Britania Raya, yang sering dirujuk sebagai "Oxbridge".

            Universitas Oxford ini terdiri dari berbagai institusi, termasuk 38 kolese konstituen dan beragam departemen akademik yang dibagi menjadi empat Divisi. Oxford telah melahirkan banyak alumni terkemuka, dan 58 penerima Hadiah Nobel pernah belajar atau memiliki afiliasi dengan Universitas Oxford. Universitas ini secara rutin bersaing dengan Universitas Cambridge untuk menduduki posisi pertama dalam pemeringkatan universitas di Britania Raya, dan menjadi salah satu dari dua universitas dengan program pascasarjana paling bergengsi.
        """.trimIndent(),
        """
            California Institute of Technology biasanya dikenal dengan Caltech, adalah sebuah universitas swasta yang terbuka untuk laki-laki dan perempuan dan terletak di Pasadena, California, di Amerika Serikat.

            Universitas ini merupakan salah satu universitas paling terkemuka dalam riset. Caltech mempertahankan penekanan kuat dalam ilmu alam dan teknik. Caltech memiliki dan mengoperasikan kompleks penerbangan luar angkasa "autonomous" yang memimpin di dunia dikenal dengan Jet Propulsion Laboratory. JPS mengamati desain dan operasi dari banyak penjajakan luar angkasa NASA; tidak seperti "National Laboratories" (Laboratorium Nasional AS) dan Pusat Luar Angkasa NASA lainnya, fasilitas JPS hanya dalam kontrak ke pemerintah.
        """.trimIndent(),
        """
            Institut Teknologi Konfederasi Zürich, yang dalam bahasa Jerman disebut Eidgenössische Technische Hochschule Zürich (ETH Zürich), merupakan salah satu universitas paling terkemuka di Swiss. Lembaga pendidikan tinggi ini berdiri tahun 1854 sebagai universitas negeri milik pemerintah Konfederasi Swiss dan berbeda dari Universitas Zurich yang milik pemerintah canton Zürich.

            Dari universitas ini telah lahir banyak peraih Penghargaan Nobel, seperti Albert Einstein (perumus teori relativitas) dan Wolfgang Pauli (terkenal dengan "Larangan Pauli"). Wilhelm Conrad Röntgen, penemu sinar X, juga menempuh studi di sini. Tradisi berprestasi di tingkat dunia pada bidang kimia, fisika, dan fisika terapan pada masa lampau dilanjutkan saat ini di bidang bioteknologi dan biologi molekular.
        """.trimIndent(),
        """
            Universitas Cambridge adalah universitas tertua kedua dalam dunia bahasa Inggris, dengan persyaratan masuk yang paling ketat di Britania Raya, dan salah satu yang paling ketat di dunia.

            Catatan awal sudah tidak tersimpan lagi, tetapi universitas ini tumbuh dari sebuah perhimpunan sarjana di kota Cambridge, Cambridgeshire, Inggris, kemungkinan dibentuk pada tahun 1209 oleh sarjana yang kabur dari Universitas Oxford setelah bertengkar dengan penduduk kota tersebut.

            Universitas Oxford dan Cambridge, sering dijuluki Oxbridge, telah memiliki sejarah kompetisi yang lama satu sama lain, dan dipandang luas sebagai universitas paling elit dan bergengsi di Britania Raya. Berdasarkan sejarah, mereka telah menghasilkan sejumlah ilmuwan, penulis, dan politisi Britania yang terkenal.
        """.trimIndent(),
        """
            University College London (UCL) adalah universitas riset publik di London, Inggris dan perguruan tinggi konstituen dari federasi Universitas London. University College London dianggap sebagai salah satu universitas paling bergengsi di dunia dan merupakan lembaga pendidikan tinggi terbesar di area London. Universitas ini adalah institusi pascasarjana terbesar di Inggris.

            Didirikan pada tahun 1826 sebagai 'Universitas London' , UCL adalah lembaga universitas pertama yang didirikan di London dan sekuler pertama di Inggris, menerima mahasiswa terlepas dari agama mereka, dan menerima perempuan atas dasar kesetaraan derajat dengan laki-laki. Filsuf Jeremy Bentham umumnya dianggap sebagai bapak spiritual UCL, ide-ide radikal tentang pendidikan dan masyarakat adalah inspirasi bagi pendirinya, meskipun keterlibatan langsung dalam perintisan cukup terbatas. UCL menjadi salah satu dari dua perguruan tinggi yang berdiri pada tahun 1836. Hal ini telah berkembang melalui merger dengan UCL Institute of Neurology (pada tahun 1997), UCL Eastman Dental Institute (pada tahun 1999), UCL Sekolah Studi Eropa Timur Slavia (pada tahun 1999), UCL Farmasi (pada tahun 2012) dan Institut Pendidikan (2014).
        """.trimIndent(),
        """
            Imperial College London (The Imperial College of Science, Technology and Medicine) adalah perguruan tinggi negeri riset di Inggris. Didirikan oleh Pangeran Albert, perguruan ini didirikan untuk menggiatkan pendidikan di bidang sains, perdagangan, dan seni, terdiri dari Natural History Museum, Museum Victoria dan Albert, Science Museum, Royal Albert Hall dan Imperial Institute. Imperial Institute didirikan oleh istrinya, Queen Victoria yang melakukan peletakan batu pertama. Kemudian dilanjutkan oleh Ratu Elizabeth II dan Duke of York yang membuka Imperial College Business School. Universitas ini terus tumbuh seiring bergabung dengan Sekolah Kedokteran Rumah Sakit St Mary, Charing Cross dan Sekolah Kedokteran Westminster, Royal Postgraduate Medical School dan Institut Jantung dan Paru Nasional. Awalnya merupakan salah satu bagian dari Universitas London, Imperial menjadi institut terpisah pada ulang tahunnya yang ke-100.

            Imperial dibagi menjadi 4 fakultas: sains, teknik, kedokteran, dan bisnis. Kampus utamanya berada di Kensington Selatan. Universitas ini merupakan pusat penelitian biomedis utama dan pusat sains kesehatan akademis pertama di Britania Raya. Imperial merupakan anggota Russell Group, G5, Association of Commonwealth Universities, League of European Research Universities, dan "Golden Triangle" Universitas Inggris.
        """.trimIndent(),
        """
            Universitas Chicago (biasanya disebut sebagai UChicago, bahasa Inggris: The University of Chicago) adalah sebuah universitas swasta, yang terletak di tepi danau Michigan dan Chicago Loop di kota Chicago, Illinois, Amerika Serikat. Universitas Chicago didirikan oleh pengusaha minyak dermawan bernama John D. Rockefeller pada tahun 1890; William Rainey Harper menjadi presiden atau rektor pertama pada tahun 1891 dan kelas-kelas pertama diadakan pada tahun 1892. Universitas Chicago merupakan salah satu perguruan tinggi paling prestisius berdasarkan peringkat nasional dan internasional. Universitas Chicago juga memiliki kampus tambahan di London, Paris, Beijing, Delhi, dan Hong Kong.
        """.trimIndent()
    )

    private val univCountry = arrayOf(
        "Amerika Serikat",
        "Amerika Serikat",
        "Amerika Serikat",
        "Britania Raya",
        "Amerika Serikat",
        "Swiss",
        "Britania Raya",
        "Britania Raya",
        "Britania Raya",
        "Amerika Serikat"
    )

    private val univCountryRank = arrayOf(
        "1",
        "2",
        "3",
        "1",
        "4",
        "1",
        "2",
        "3",
        "4",
        "5"
    )

    private val univLink = arrayOf(
        "https://web.mit.edu/",
        "https://www.stanford.edu/",
        "https://www.harvard.edu/",
        "https://www.ox.ac.uk/",
        "https://www.caltech.edu/",
        "https://ethz.ch/en.html",
        "https://www.cam.ac.uk/",
        "https://www.ucl.ac.uk/",
        "https://www.imperial.ac.uk/",
        "https://www.uchicago.edu/"
    )

    private val univPhoto = intArrayOf(
        R.drawable.mit,
        R.drawable.stanford,
        R.drawable.harvard,
        R.drawable.oxford,
        R.drawable.caltech,
        R.drawable.eth_zurich,
        R.drawable.cambridge,
        R.drawable.ucl,
        R.drawable.imperial,
        R.drawable.chicago
    )

    val listUniv: ArrayList<Univ>
    get() {
        val list = arrayListOf<Univ>()
        for (position in univNames.indices){
            val univ = Univ()
            univ.name = univNames[position]
            univ.description = univDescription[position]
            univ.country = univCountry[position]
            univ.country_rank = univCountryRank[position]
            univ.link = univLink[position]
            univ.logo = univPhoto[position]
            list.add(univ)
        }
        return list
    }
}