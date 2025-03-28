class ComputerWithHDD(mark: String):Computer(mark) {

    var p = 0 // в Гб

    constructor(mark: String, _frequencyCPU: Double, _diskCapacity: Int, _nameCPU: String, _p: Int) : this(mark){
        frequencyCPU = _frequencyCPU
        diskCapacity = _diskCapacity
        nameCPU = _nameCPU
        p = _p
    }

    override fun Quality() { //расчет качества
        val q = (0.1 * frequencyCPU) + diskCapacity

        val qp = q+ 0.5 * p

        println("Качество объекта: $qp")
    }

    override fun Info() {
        println("Марка ПК: $mark\n" +
                "Наименование процессора: ${nameCPU}\n" +
                "Тактовая частота процессора (в МГц): ${frequencyCPU}\n" +
                "Объем ОЗУ (в Мб): ${diskCapacity}\n" +
                "Объем жесткого диска (в Гб): ${p}")
    }
}