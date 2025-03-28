class Phone:Device {
    override var name: String = ""
    override var battery: Int = 0
    var capacity = 0

    override fun Info() {
        println("Название телефона: $name\n" +
                "Объем аккумулятора (в мАч): $battery\n" +
                "Объем памяти (в Гб): $capacity")
    }
}