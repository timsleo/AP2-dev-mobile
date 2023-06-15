package com.example.ap2_devmobile

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.ImageButton


class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.final_result)

        var nomeLocal : String = ""
        var descLocal : String = ""

        if(Data.local == 1 && Data.atividade == 1 && Data.role == 1 || Data.local == 1 && Data.atividade == 1 && Data.role == 3 ){
            nomeLocal = "Copacabana"
            descLocal = "Praia deslumbrante durante o dia, vida noturna agitada com bares e boates à beira-mar. O destino perfeito para aproveitar o melhor do Rio de Janeiro, dia e noite."
        }
        else if(Data.local == 1 && Data.atividade == 1 && Data.role == 2 || Data.local == 1 && Data.atividade==4 && Data.role==3){
            nomeLocal = "Ipanema"
            descLocal = "Além das belas praias, Ipanema possui o Parque Garota de Ipanema, onde é possível fazer caminhadas, corridas e desfrutar de áreas verdes. O bairro também oferece opções de restaurantes, bares e quiosques à beira-mar para relaxar após um dia ao ar livre."
        }
        else if(Data.local == 1 && Data.atividade == 1 && Data.role == 4){
            nomeLocal = "Leblon"
            descLocal = "Com suas belas praias e menos agitação em comparação com outros bairros como Copacabana, o Leblon é um local popular entre os moradores locais que buscam um ambiente mais sereno para desfrutar do sol, fazer caminhadas à beira-mar ou apenas relaxar em um ambiente tranquilo. Embora ainda haja opções de restaurantes e bares para aproveitar durante a noite, a vida noturna no Leblon é mais voltada para um ambiente sofisticado e relaxado."
        }
        else if(Data.local == 1 && Data.atividade == 2 && Data.role == 1){
            nomeLocal = "Lapa"
            descLocal = " Durante o dia, você pode explorar o famoso Arcos da Lapa, o Museu de Arte do Rio (MAR) e o Museu Nacional de Belas Artes, que abrigam exposições culturais e históricas. À noite, a Lapa ganha vida com uma animada vida noturna, com bares, restaurantes, casas de shows e uma atmosfera boêmia, com samba ao vivo, música brasileira e uma energia contagiante."
        }
        else if(Data.local == 1 && Data.atividade == 2 && Data.role == 2){
            nomeLocal = "Santa Teresa"
            descLocal = "Conhecido por sua atmosfera artística e boêmia, Santa Teresa abriga o Museu Chácara do Céu e o Parque das Ruínas, que oferecem vistas deslumbrantes da cidade. Além disso, o bairro possui ruas charmosas, como a Rua Almirante Alexandrino, ideais para caminhadas e explorar a arquitetura histórica. É possível desfrutar de cafés ao ar livre, jardins e mirantes, tornando o passeio cultural uma experiência completa."
        }
        else if(Data.local == 1 && Data.atividade ==2 && Data.role ==3){
            nomeLocal = "Botafogo"
            descLocal = "Durante o dia, você pode explorar o Museu do Índio, o Museu Casa de Rui Barbosa e o Parque Natural Municipal da Catacumba, que oferece trilhas e uma vista panorâmica da cidade. À noite, Botafogo oferece uma animada vida noturna com bares, restaurantes e casas de shows, além de ficar próximo ao bairro boêmio da Lapa. A localização privilegiada do bairro, com a Baía de Guanabara em sua frente, também proporciona a oportunidade de desfrutar de atividades ao ar livre, como caminhadas pelo calçadão e esportes aquáticos."
        }
        else if(Data.local == 1 && Data.atividade ==2 && Data.role ==4){
            nomeLocal = "Flamengo"
            descLocal = "Durante o dia, você pode explorar o Museu de Arte Moderna (MAM), o Monumento aos Pracinhas e o Aterro do Flamengo, um extenso parque com áreas verdes, ciclovias e espaços para atividades ao ar livre. À noite, o bairro mantém uma atmosfera mais tranquila, com opções de restaurantes e bares para desfrutar de momentos de relaxamento e contemplação. É um local perfeito para aqueles que desejam combinar cultura, história e um ambiente noturno mais sossegado."
        }
        else if(Data.local == 1 && Data.atividade ==3 && Data.role ==1){
            nomeLocal = "Lapa"
            descLocal = "Durante o dia, você pode explorar o Mercado Municipal do Rio de Janeiro, conhecido como Cadeg, que oferece uma variedade de alimentos, especiarias e produtos locais. À noite, a Lapa ganha vida com uma animada vida noturna, com bares, casas de shows e uma atmosfera boêmia"
        }
        else if(Data.local == 1 && Data.atividade ==3 && Data.role ==2){
            nomeLocal = "Jardim Botânico"
            descLocal = " Além de abrigar o renomado Jardim Botânico do Rio de Janeiro, um verdadeiro paraíso verde com uma rica diversidade de plantas e flores, o bairro também conta com o Mercado do Produtor, onde é possível encontrar uma variedade de produtos frescos, como frutas, legumes e artesanato local. O Jardim Botânico está cercado por áreas naturais, como a Floresta da Tijuca e a Lagoa Rodrigo de Freitas, que oferecem oportunidades para caminhadas, trilhas e atividades ao ar livre em um ambiente tranquilo e belo."
        }
        else if(Data.local == 1 && Data.atividade ==3 && Data.role ==3){
            nomeLocal = "Ipanema"
            descLocal = "urante o dia, você pode explorar o Mercado de Ipanema, onde é possível encontrar uma variedade de produtos locais, desde alimentos frescos até artesanato. Com a combinação de mercado local, praia e vida noturna, Ipanema é um destino completo para quem busca esse equilíbrio entre diversão e atividades ao ar livre."
        }
        else if(Data.local == 1 && Data.atividade ==3 && Data.role ==4 || Data.local == 1 && Data.atividade==4 && Data.role==4){
            nomeLocal = "Santa Teresa"
            descLocal = "Conhecido por sua atmosfera boêmia e artística, Santa Teresa abriga o Mercado das Pulgas, onde você pode encontrar antiguidades, artesanato e itens únicos. Durante a noite, o bairro oferece opções de bares e restaurantes com uma atmosfera tranquila, perfeita para desfrutar de um jantar descontraído e coquetéis em um ambiente aconchegante.  É o local ideal para quem busca uma experiência tranquila e cultural, combinando a visita ao mercado local com uma vida noturna mais serena."
        }
        else if (Data.local == 1 && Data.atividade==4 && Data.role==1){
            nomeLocal = "Botafogo"
            descLocal = "Conhecido por sua cena gastronômica diversificada, Botafogo abriga uma variedade de restaurantes que oferecem desde pratos típicos brasileiros até cozinha internacional. Além disso, o bairro possui uma seleção de bares e casas noturnas que proporcionam uma vida noturna animada e vibrante. Com uma combinação de opções culinárias e entretenimento noturno, Botafogo é um destino ideal para os amantes da gastronomia que também buscam diversão durante a noite."
        }
        else if (Data.local == 1 && Data.atividade==4 && Data.role==2){
            nomeLocal = "Barra da Tijuca"
            descLocal = "Gastronomia local variada e extensas praias para esportes aquáticos. O bairro também oferece áreas naturais preservadas, ideais para trilhas e atividades ao ar livre. O destino perfeito para aproveitar a culinária e a natureza no Rio de Janeiro."
        }
        else if (Data.local == 2 && Data.atividade==1 && Data.role==1 || Data.local == 2 && Data.atividade==1 && Data.role==3){
            nomeLocal = "Búzios"
            descLocal = "Praias deslumbrantes durante o dia e vida noturna agitada. A cidade oferece mais de 20 praias para relaxar e praticar esportes aquáticos, enquanto à noite a Rua das Pedras ganha vida com bares, restaurantes e boates. O destino perfeito para quem busca diversão à beira-mar."
        }
        else if (Data.local == 2 && Data.atividade==1 && Data.role==2){
            nomeLocal = "Arraial do Cabo"
            descLocal = "Conhecida como Caribe brasileiro, Arraial do Cabo possui praias de águas cristalinas, como a Praia do Farol, Prainhas do Pontal do Atalaia e a Praia Grande. Além das praias, a região é cercada por áreas preservadas, como a Reserva Ambiental da Praia do Forno e a Trilha do Atalaia, que proporcionam caminhadas, mergulho e vistas deslumbrantes. É o destino perfeito para aproveitar a praia, praticar esportes ao ar livre e se conectar com a natureza."
        }
        else if (Data.local == 2 && Data.atividade==1 && Data.role==4 || Data.local == 2 && Data.atividade==2 && Data.role==4 || Data.local == 2 && Data.atividade==3 && Data.role==4){
            nomeLocal = "Paraty"
            descLocal = "Com seu centro histórico preservado, a cidade encanta os visitantes com suas ruas de pedra e casarões coloniais. Durante o dia, é possível desfrutar das praias paradisíacas, como a Praia do Jabaquara e a Praia do Pontal. À noite, Paraty oferece um ambiente mais sereno, com opções de bares e restaurantes que proporcionam uma experiência relaxante. É o destino perfeito para quem busca aproveitar a praia durante o dia e desfrutar de momentos tranquilos durante a noite no estado do Rio de Janeiro."
        }
        else if (Data.local == 2 && Data.atividade==2 && Data.role==1){
            nomeLocal = "Niterói"
            descLocal = "A cidade é conhecida por abrigar o famoso Museu de Arte Contemporânea (MAC), projetado por Oscar Niemeyer, e o Museu de Arte Contemporânea de Niterói, com sua arquitetura impressionante. Além disso, Niterói possui belas praias, como a Praia de Icaraí e a Praia de Itacoatiara, onde é possível desfrutar do sol e praticar esportes aquáticos. Durante a noite, a cidade oferece uma vida noturna animada, com bares, restaurantes e casas noturnas para todos os gostos. Niterói é uma ótima opção para quem deseja combinar praia, cultura e diversão noturna no estado do Rio de Janeiro."
        }
        else if (Data.local == 2 && Data.atividade==2 && Data.role==2 || Data.local == 2 && Data.atividade==2 && Data.role==3){
            nomeLocal = "Cabo Frio"
            descLocal = "Com suas belas praias, como a Praia do Forte e a Praia das Conchas, os visitantes podem desfrutar do sol e praticar esportes aquáticos, como surfe e stand-up paddle. Além disso, a cidade possui um centro histórico encantador, onde é possível visitar o charmoso Forte São Mateus e o Museu do Surf. Para os amantes da natureza, Cabo Frio também oferece opções de trilhas e passeios pela natureza, como a trilha da Gruta do Padre e a Ilha do Japonês. É o destino perfeito para quem busca aproveitar a praia, explorar a história e desfrutar de atividades ao ar livre em meio à natureza no estado do Rio de Janeiro."
        }
        else if (Data.local == 2 && Data.atividade==3 && Data.role==1 || Data.local == 2 && Data.atividade==3 && Data.role==3){
            nomeLocal = "Niterói"
            descLocal = " A cidade abriga o Mercado Municipal de Niterói, onde é possível encontrar uma variedade de produtos locais, como alimentos frescos, especiarias e artesanato. Além disso, Niterói possui uma animada vida noturna, com bares, casas noturnas e restaurantes que oferecem opções para todos os gostos. A Rua Moreira César, no bairro de Icaraí, é conhecida por sua concentração de estabelecimentos noturnos. Niterói é o destino perfeito para quem deseja explorar mercados locais durante o dia e desfrutar de uma vida noturna agitada no estado do Rio de Janeiro."
        }
        else if (Data.local == 2 && Data.atividade==3 && Data.role==2){
            nomeLocal = "Arraial do Cabo"
            descLocal = " A cidade é conhecida por suas praias deslumbrantes, como a Praia do Farol, a Prainha e a Praia do Pontal do Atalaia, onde os visitantes podem desfrutar de águas cristalinas e paisagens naturais incríveis. Arraial do Cabo também abriga um mercado de peixes frescos, onde os visitantes podem comprar frutos do mar e produtos locais. Além disso, a cidade oferece diversas opções de atividades ao ar livre, como passeios de barco, mergulho, trilhas e observação de aves. Com suas praias deslumbrantes, mercados locais e oportunidades para atividades ao ar livre, Arraial do Cabo é o destino perfeito para os amantes da natureza, praia e culinária local no estado do Rio de Janeiro."
        }
        else if (Data.local == 2 && Data.atividade==4 && Data.role==1 || Data.local == 2 && Data.atividade==4 && Data.role==3){
            nomeLocal = "Búzios"
            descLocal = "Conhecida por suas belas praias, como Geribá, Ferradura e João Fernandes, que oferecem oportunidades para relaxar e aproveitar o sol. A cidade também é famosa por sua culinária diversificada, com uma ampla variedade de restaurantes que servem pratos locais e internacionais. À noite, Búzios ganha vida com uma agitada vida noturna, com bares, boates e festas que proporcionam diversão e entretenimento até altas horas. Búzios é o destino perfeito para os amantes de praia, gastronomia e vida noturna animada no estado do Rio de Janeiro."
        }
        else if (Data.local == 2 && Data.atividade==4 && Data.role==2 || Data.local == 2 && Data.atividade==4 && Data.role==4){
            nomeLocal = "Paraty"
            descLocal = "Paraty também é famosa por sua rica culinária, com uma variedade de restaurantes que oferecem pratos tradicionais caiçaras e frutos do mar frescos. Além disso, a cidade proporciona várias atividades ao ar livre, como trilhas nas montanhas, passeios de barco e mergulho em locais paradisíacos. Paraty é o destino perfeito para quem busca desfrutar de praia, gastronomia local e aventuras ao ar livre fora do centro do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==1 && Data.role==1){
            nomeLocal = "Teresópolis"
            descLocal = "Situada na Serra dos Órgãos, Teresópolis é cercada por uma exuberante natureza, com trilhas deslumbrantes e cachoeiras refrescantes, como a Cachoeira dos Frades e a Cachoeira Véu da Noiva. À noite, a cidade ganha vida com diversos bares, restaurantes e casas de shows que oferecem entretenimento e diversão para os visitantes. Teresópolis é o destino ideal para os amantes da natureza que desejam explorar a região montanhosa durante o dia e aproveitar a animada vida noturna ao anoitecer no estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==1 && Data.role==2){
            nomeLocal = "Nova Friburgo"
            descLocal = "Com sua localização privilegiada na Serra Fluminense, Nova Friburgo possui uma variedade de cachoeiras deslumbrantes, como a Cachoeira Indiana Jones e a Cachoeira Toca da Onça, ideais para refrescar-se e apreciar a paisagem. Além disso, a cidade oferece diversas atividades ao ar livre, como trilhas, escaladas e passeios de bicicleta, permitindo aos visitantes explorar a natureza exuberante da região. Nova Friburgo é o destino perfeito para quem busca aventuras ao ar livre, cachoeiras e uma conexão com a natureza na região montanhosa do estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==1 && Data.role==3){
            nomeLocal = "Petrópolis"
            descLocal = "Durante o dia, é possível desfrutar de atividades ao ar livre, como trilhas, caminhadas e passeios de bicicleta nos parques e reservas naturais da região. À noite, a cidade oferece uma variedade de bares, restaurantes e casas de shows, que proporcionam uma vida noturna agitada e animada. Petrópolis é o destino ideal para quem busca um equilíbrio entre a natureza durante o dia e a diversão noturna em uma região montanhosa no estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==1 && Data.role==4){
            nomeLocal = "Visconde de Mauá"
            descLocal = "Conhecida por sua beleza natural preservada, Visconde de Mauá é lar de diversas cachoeiras deslumbrantes, como a Cachoeira do Escorrega e a Cachoeira da Santa Clara, ideais para momentos de relaxamento e contemplação da natureza. Durante a noite, a cidade proporciona uma atmosfera serena e pacífica, com poucos estabelecimentos noturnos, permitindo que os visitantes desfrutem de uma vida noturna tranquila. Visconde de Mauá é o destino perfeito para aqueles que buscam uma experiência relaxante, cercada por montanhas, cachoeiras e uma vida noturna calma no estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==2 && Data.role==1){
            nomeLocal = "Teresópolis"
            descLocal = "A cidade abriga o Museu de Arte Sacra, que apresenta uma rica coleção de arte religiosa, e o Palácio Teresa Cristina, um belo edifício histórico. Além disso, Teresópolis possui uma animada vida noturna, com diversos bares, restaurantes e casas de shows que oferecem entretenimento e diversão para os visitantes. Teresópolis é o destino ideal para quem deseja explorar a história e a cultura, além de desfrutar de uma vida noturna agitada em uma região montanhosa do estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==2 && Data.role==2){
            nomeLocal = "Petrópolis"
            descLocal = "A cidade é conhecida como a Cidade Imperial e abriga o Museu Imperial, que conta a história do período imperial brasileiro, e o Palácio de Cristal, uma bela construção de vidro e ferro. Além disso, Petrópolis oferece opções de atividades ao ar livre, como trilhas, caminhadas e passeios de bicicleta nas montanhas e parques da região, como o Parque Nacional da Serra dos Órgãos. Petrópolis é o destino perfeito para aqueles que desejam explorar a história e a cultura, ao mesmo tempo em que aproveitam as belezas naturais em uma região montanhosa do estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==2 && Data.role==3){
            nomeLocal = "Nova Friburgo"
            descLocal = "A cidade conta com o Museu Histórico de Nova Friburgo, onde é possível conhecer mais sobre a colonização suíça na região, e o Teleférico de Nova Friburgo, que proporciona uma vista panorâmica deslumbrante da cidade. Além disso, Nova Friburgo possui belas trilhas e cachoeiras para explorar, como a Cachoeira Indiana Jones e a Trilha das Cachoeiras. À noite, a cidade oferece opções de bares, restaurantes e casas de shows para quem deseja aproveitar a vida noturna. Nova Friburgo é o destino ideal para quem busca um equilíbrio entre cultura, natureza e diversão em uma região montanhosa do estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==2 && Data.role==4){
            nomeLocal = "Itaipava"
            descLocal = "A região abriga o Palácio de Cristal, uma bela construção histórica, e o Museu Casa do Colono, que apresenta a cultura e a história dos colonos alemães na região. Além disso, Itaipava é conhecida por seus restaurantes, bistrôs e cafés aconchegantes, que oferecem uma experiência gastronômica de qualidade. À noite, os visitantes podem desfrutar de um ambiente mais tranquilo, com opções de bares e pubs para relaxar e apreciar a atmosfera serena da região. Itaipava é o destino perfeito para quem busca um equilíbrio entre cultura, tranquilidade e momentos de lazer em uma região montanhosa do estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==3 && Data.role==1){
            nomeLocal = "Teresópolis"
            descLocal = "A cidade conta com o Mercado Municipal de Teresópolis, onde é possível encontrar uma variedade de produtos locais, como alimentos frescos e artesanato. Teresópolis também possui uma vida noturna agitada, com opções de bares, restaurantes e casas de shows para quem busca entretenimento e diversão durante a noite. A combinação da região montanhosa, o mercado local e a vida noturna agitada fazem de Teresópolis um destino interessante para os visitantes que desejam desfrutar de diferentes experiências em uma mesma cidade no estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==3 && Data.role==2){
            nomeLocal = "Visconde de Mauá"
            descLocal = "A cidade possui um mercado local, onde é possível encontrar produtos artesanais, alimentos frescos e souvenirs. Além disso, Visconde de Mauá é conhecida por suas trilhas, cachoeiras e rios, que proporcionam oportunidades para caminhadas, passeios de bicicleta, banhos refrescantes e contemplação da natureza. A região também oferece opções de atividades como rapel, canyoning e passeios a cavalo. Visconde de Mauá é o destino ideal para quem busca uma experiência única em uma região montanhosa, combinando a tranquilidade do mercado local com a aventura das atividades ao ar livre no estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==3 && Data.role==3){
            nomeLocal = "Petrópolis"
            descLocal = "A cidade conta com o Mercado Municipal de Petrópolis, onde é possível encontrar uma variedade de produtos locais, desde alimentos frescos até artesanato regional. Além disso, Petrópolis oferece diversas opções de atividades ao ar livre, como trilhas, passeios de bicicleta e parques naturais, como o Parque Nacional da Serra dos Órgãos. À noite, a cidade apresenta uma vida noturna animada, com bares, restaurantes, casas de shows e eventos culturais. Petrópolis é o destino perfeito para os visitantes que desejam desfrutar tanto da natureza quanto da vida noturna em uma região montanhosa do estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==3 && Data.role==4){
            nomeLocal = "Nova Friburgo"
            descLocal = "A cidade conta com o Mercado Municipal de Nova Friburgo, onde é possível encontrar produtos locais, como alimentos frescos e artesanato. Além disso, Nova Friburgo oferece uma vida noturna calma e tranquila, com opções de restaurantes aconchegantes e bares mais sossegados, ideais para relaxar e aproveitar um ambiente mais sereno. A cidade também é conhecida por suas trilhas e cachoeiras, proporcionando oportunidades de atividades ao ar livre durante o dia. Nova Friburgo é o destino perfeito para os visitantes que buscam um equilíbrio entre a tranquilidade da vida noturna e a conexão com a natureza em uma região montanhosa do estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==4 && Data.role==1){
            nomeLocal = "Teresópolis"
            descLocal = "A cidade oferece uma excelente gastronomia local, com uma variedade de restaurantes que servem pratos típicos da região. À noite, Teresópolis apresenta uma vida noturna agitada, com opções de bares, pubs e casas de shows, onde é possível desfrutar de música ao vivo e entretenimento. Além disso, a região montanhosa de Teresópolis oferece atividades ao ar livre, como trilhas em meio à natureza exuberante e cachoeiras refrescantes. Teresópolis é o destino ideal para os visitantes que desejam combinar uma boa gastronomia local com uma vida noturna animada em uma região montanhosa do estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==4 && Data.role==2){
            nomeLocal = "Penedo"
            descLocal = "A cidade é conhecida por sua gastronomia local diversificada, oferecendo uma variedade de restaurantes que servem pratos típicos da região. Além disso, Penedo oferece diversas opções de atividades ao ar livre, como trilhas em meio à natureza, passeios de bicicleta, cachoeiras e até mesmo a possibilidade de praticar esportes radicais, como rapel e tirolesa. Os visitantes podem desfrutar tanto da culinária local quanto das atividades ao ar livre em meio às montanhas de Penedo, proporcionando uma experiência única no estado do Rio de Janeiro"
        }
        else if (Data.local == 3 && Data.atividade==4 && Data.role==3){
            nomeLocal = "Visconde de Mauá"
            descLocal = "A cidade oferece uma excelente gastronomia local, com restaurantes que valorizam ingredientes frescos e pratos típicos da região. Além disso, Visconde de Mauá proporciona um equilíbrio entre vida noturna agitada e atividades ao ar livre. Durante o dia, os visitantes podem explorar trilhas, cachoeiras e praticar esportes ao ar livre, como trekking e mountain bike. À noite, a cidade oferece opções de bares e casas de shows, onde é possível desfrutar de música ao vivo e entretenimento. Visconde de Mauá é o destino perfeito para os visitantes que desejam apreciar a gastronomia local, aproveitar a natureza e desfrutar de uma vida noturna animada em uma região montanhosa do estado do Rio de Janeiro."
        }
        else if (Data.local == 3 && Data.atividade==4 && Data.role==4){
            nomeLocal = "São Pedro da Serra"
            descLocal = "A cidade oferece uma excelente gastronomia local, com restaurantes que valorizam ingredientes frescos e pratos típicos da região. Além disso, São Pedro da Serra proporciona uma vida noturna calma e tranquila, perfeita para aqueles que desejam relaxar e aproveitar momentos de paz. Durante o dia, os visitantes podem explorar trilhas, desfrutar de banhos de cachoeira e apreciar a natureza em sua plenitude. São Pedro da Serra é o destino ideal para os visitantes que buscam uma experiência tranquila e gastronômica em uma região montanhosa do estado do Rio de Janeiro."
        }

        val nomeResultado : TextView = findViewById(R.id.Resultado)
        nomeResultado.text = "O destino recomendado é $nomeLocal"

        val descResultado : TextView = findViewById(R.id.Descricao)
        descResultado.text = "$descLocal"


        val botaoAir : ImageButton = findViewById(R.id.imageButtonAir)
        botaoAir.setOnClickListener{
            val query = "https://www.airbnb.com.br/"
            val airbnb = Intent(Intent.ACTION_WEB_SEARCH)
            airbnb.putExtra(SearchManager.QUERY, query)
            startActivity(airbnb)
        }

        val botaoReinicio :Button = findViewById(R.id.botaoReinicio)
        botaoReinicio.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}