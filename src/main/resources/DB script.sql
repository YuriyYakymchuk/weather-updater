CREATE TABLE `Weather` (
                           `ID` int unsigned NOT NULL AUTO_INCREMENT,
                           `Country` varchar(255) NOT NULL,
                           `City` varchar(255) NOT NULL,
                           `Temperature` decimal(3,2) NOT NULL,
                           `Humidity` int unsigned NOT NULL,
                           `WindSpeed` int unsigned NOT NULL,
                           `Cloudy` varchar(255) NOT NULL,
                           `Time` timestamp NOT NULL,
                           `CreatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
                           `UpdatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                           PRIMARY KEY (`ID`),
                           KEY `LOCATION` (`COuntry`,`City`,`Time`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3