package com.example.data

enum class AccountRole {
    REGULAR, DEVELOPER, BUSINESS
}

data class LocalAccount(
    val email: String,
    val role: AccountRole,
    val passport: String = "",
    val businessDocs: String = ""
)

object SparePartsDataProvider {
    val sparePartsList = listOf(
        Phone(
            id = "part_screen_note13",
            name = "Дисплейный модуль AMOLED для Xiaomi Redmi Note 13",
            brand = "XIAOMI",
            price = 1850,
            description = "Оригинальный AMOLED-дисплей в сборе с тачскрином и рамкой. Имеет высокую пиковую яркость, точную цветопередачу и оригинальное олеофобное покрытие повышенной прочности.",
            rating = 4.8,
            reviewsCount = 42,
            specs = listOf(
                "Тип детали" to "Дисплейный модуль в сборе",
                "Совместимость" to "Xiaomi Redmi Note 13 4G / 5G",
                "Характеристики" to "6.67 дюйма, AMOLED, 120 Гц, 2400х1080",
                "Качество" to "Оригинал (Genuine Service Pack)"
            ),
            highlightColorHex = "#E53935",
            isSparePart = true
        ),
        Phone(
            id = "part_battery_iphone14",
            name = "Аккумуляторная батарея для Apple iPhone 14 Pro",
            brand = "APPLE",
            price = 1450,
            description = "Оригинальный литий-ионный аккумулятор высокой плотности для замены вышедшего из строя или потерявшего емкость элемента питания на iPhone 14 Pro. Оборудован встроенным микроконтроллером защиты.",
            rating = 4.9,
            reviewsCount = 31,
            specs = listOf(
                "Тип детали" to "Литий-ионный аккумулятор (АКБ)",
                "Совместимость" to "Apple iPhone 14 Pro",
                "Емкость" to "3200 мАч",
                "Напряжение" to "3.87 В"
            ),
            highlightColorHex = "#000000",
            isSparePart = true
        ),
        Phone(
            id = "part_camera_s23ultra",
            name = "Модуль основной камеры 200 Мп для Samsung Galaxy S23 Ultra",
            brand = "SAMSUNG",
            price = 3900,
            description = "Оригинальный блок основной камеры (200 Мп широкоугольный сенсор с механизмом оптической стабилизации и фазовым автофокусом Dual Pixel). Обеспечивает заводское качество фокусировки и съемки.",
            rating = 5.0,
            reviewsCount = 9,
            specs = listOf(
                "Тип детали" to "Камера в сборе (основной модуль)",
                "Совместимость" to "Samsung Galaxy S23 Ultra (SM-S918B)",
                "Оптический сенсор" to "ISOCELL HP2 (1/1.3\")",
                "Стабилизация" to "Оптическая 2-осевая (OIS)"
            ),
            highlightColorHex = "#2196F3",
            isSparePart = true
        ),
        Phone(
            id = "part_charger_gan65",
            name = "Сетевой адаптер Samsung Super Fast Charge GaN 65W",
            brand = "SAMSUNG",
            price = 990,
            description = "Фирменный быстрозарядный адаптер питания мощностью 65 Вт на полупроводниках из нитрида галлия (GaN). Оснащен тремя портами для одновременной эффективной подзарядки нескольких портативных устройств без перегрева.",
            rating = 4.9,
            reviewsCount = 186,
            specs = listOf(
                "Тип детали" to "Сетевое зарядное устройство (GaN)",
                "Максимальная мощность" to "65 Вт",
                "Выходные разъемы" to "2х USB Type-C, 1x USB-A",
                "Протоколы быстрой зарядки" to "PD 3.0, PPS, Samsung SFC 2.0"
            ),
            highlightColorHex = "#2196F3",
            isSparePart = true
        )
    )
}

