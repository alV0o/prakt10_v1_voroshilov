fun main(){
    try {

        println("Введите марку компьютера, частоту процессора (в МГц), объем ОЗУ (в Мб), название процессора")
        val pc1 = Computer(readLine()!!.toString(), readLine()!!.toDouble(), readLine()!!.toInt(), readLine()!!.toString())
        when{
            pc1.frequencyCPU < 500 -> println("неверная частота процессора")
            pc1.diskCapacity < 2000 -> println("неверный объем ОЗУ")
            else -> {
                pc1.Info()
                pc1.Quality()
            }
        }

        println("----------")

        println("Введите марку компьютера, частоту процессора (в МГц), объем ОЗУ (в Мб), название процессора, объем жесткого диска")
        val pc2 = ComputerWithHDD(readLine()!!.toString(), readLine()!!.toDouble(), readLine()!!.toInt(), readLine()!!.toString(), readLine()!!.toInt())

        when{
            pc2.frequencyCPU < 500 -> println("неверная частота процессора")
            pc2.diskCapacity < 2000 -> println("неверный объем ОЗУ")
            pc2.p < 32 -> println("неверный объем жесткого диска")
            else -> {
                pc2.Info()
                pc2.Quality()
            }
        }

        println("----------")

        val pc3 = Phone()
        println("Введите марку телефона")
        pc3.name = readLine()!!.toString()
        println("Введите емкость батареи (в мАч)")
        pc3.battery = readLine()!!.toInt()
        println("Введите объем памяти (в Гб)")
        pc3.capacity = readLine()!!.toInt()

        when{
            pc3.battery < 1000 -> println("Неверная емкость")
            pc3.capacity < 8 -> println("Неверный объем")
            else -> {
                pc3.Info()
            }
        }

    }
    catch (e:Exception){
        println("Неверный формат")
    }
}