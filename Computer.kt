open class Computer(mark:String): MarkDevice(mark) {
    var nameCPU = ""
    var frequencyCPU = 0.0 //в мгц
    var diskCapacity = 0 //в мб

    constructor(mark: String, _frequencyCPU: Double, _diskCapacity: Int, _nameCPU: String) : this(mark){
        frequencyCPU = _frequencyCPU
        diskCapacity = _diskCapacity
        nameCPU = _nameCPU
    }

    override fun Info() {
        println("Марка ПК: ${mark}\n" +
                "Наименование процессора: ${nameCPU}\n" +
                "Тактовая частота процессора (в МГц): ${frequencyCPU}\n" +
                "Объем ОЗУ (в Мб): ${diskCapacity}")
    }

    open fun Quality(){ //расчет качества
        val q = (0.1 * frequencyCPU) + diskCapacity

        println("Качество объекта: ${q}")
    }
}