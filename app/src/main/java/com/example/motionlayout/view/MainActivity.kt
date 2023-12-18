package com.example.motionlayout.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayout.R
import com.example.motionlayout.adapterHardware.AdapterHardware
import com.example.motionlayout.modelHardware.ModelHardware

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var listaProduto: MutableList<ModelHardware>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* Funções(): */
        declararVariaveis()
        configurarRecyclerView()
        instanciarClasseProdutos()
    }

    private fun declararVariaveis() {
        recyclerView =
            findViewById<RecyclerView>(R.id.recycleView_produtosId)
    }

    private fun configurarRecyclerView() {

        recyclerView.setHasFixedSize(true)

        recyclerView.layoutManager =
            LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
            )
    }

    private fun instanciarClasseProdutos(){

        listaProduto = mutableListOf()
        val adapterProduto = AdapterHardware.AdapterProduto(this, listaProduto!!)
        recyclerView.adapter = adapterProduto

        val produtoHdSSD = ModelHardware(
            foto = R.drawable.ssd,

            nome = "SSD SanDisk Plus 480GB",

            descricao = "Confiável, rápido e muita capacidade. " +
                    "A SanDisk, pioneira em tecnologias de armazenamento" +
                    " de estado sólido é a marca de confiança dos profissionais" +
                    " da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            preco = "R$ 450,00"
        )

        val produtoProcessador = ModelHardware(
            foto = R.drawable.processador,

            nome = "Intel Core i5 10400F",

            descricao = "Os novos processadores da 10ª " +
                    "geração oferecem atualizações de desempenho " +
                    "incríveis para melhorar a produtividade e proporcionar entretenimento " +
                    "surpreendente.",

            preco = "R$ 450,00"
        )

        val produtoMemoriaRam = ModelHardware(
            foto = R.drawable.memoria,

            nome = "Memória Ram Corsair  8GB DDR4 ",

            descricao = "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",

            preco = "R$ 369,00"
        )

        val produtoPlacaDeVideo = ModelHardware(
            foto = R.drawable.placadevideo,

            nome = "GeForce RTX 3090 24GB",

            descricao = "Os blocos de construção para a GPU " +
                    "mais rápida e eficiente do mundo, o novo Ampere " +
                    "SM traz 2X a taxa de transferência do FP32 e maior eficiência de energia.",

            preco = "R$ 18.499,00"
        )

        val produtoTeclado = ModelHardware(
            foto = R.drawable.teclado,

            nome = "Teclado Mecânico Gamer T-Dagger Corvette",

            descricao = "Teclado Mecânico Gamer T-Dagger " +
                    "Corvette, LED Rainbow, Switch Outemu DIY Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",

            preco = "R$ 229,00"
        )

        val produtoGabinete = ModelHardware(
            foto = R.drawable.gabinete,

            nome = "Gabinete Gamer",

            descricao = "A série Carbide SPEC-DELTA RGB é uma " +
                    "caixa ATX de torre média de vidro temperado com " +
                    "estilo angular impressionante, fluxo de ar potente e três " +
                    "ventiladores de refrigeração RGB incluídos.",

            preco = "R$ 799,00"
        )

        listaProduto!!.add(produtoHdSSD)
        listaProduto!!.add(produtoProcessador)
        listaProduto!!.add(produtoMemoriaRam)
        listaProduto!!.add(produtoGabinete)
        listaProduto!!.add(produtoPlacaDeVideo)
        listaProduto!!.add(produtoTeclado)
    }
}