-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mar 13 Mars 2018 à 23:36
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `aerotrack`
--

-- --------------------------------------------------------

--
-- Structure de la table `vol`
--

CREATE TABLE `vol` (
  `numeroVol` varchar(10) NOT NULL,
  `nomCompagnie` varchar(25) NOT NULL,
  `nomAeroport` varchar(30) NOT NULL,
  `destinationVol` varchar(30) NOT NULL,
  `typeVol` varchar(20) NOT NULL,
  `etatVol` varchar(10) DEFAULT NULL,
  `porteVole` varchar(10) DEFAULT NULL,
  `dateVol` date NOT NULL,
  `heurePrevueVol` varchar(5) NOT NULL,
  `heureReelVol` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='table ClientVol';

--
-- Contenu de la table `vol`
--

INSERT INTO `vol` (`numeroVol`, `nomCompagnie`, `nomAeroport`, `destinationVol`, `typeVol`, `etatVol`, `porteVole`, `dateVol`, `heurePrevueVol`, `heureReelVol`) VALUES
('AC1268', 'Air Canada', 'RSW', 'Fort Myers', 'Depart', NULL, 'A27', '2018-03-15', '8.34', NULL),
('AC1618', 'Air Canada', 'TPA', 'Tampa', 'Depart', NULL, 'C65', '2018-03-15', '7.57', NULL),
('AC1842', 'Air Canada', 'PVR', 'Puerto Vallarta', 'Depart', NULL, 'A64', '2018-03-15', '7.57', NULL),
('AC3079', 'Air Canada', 'ORD', 'Chicago', 'Arrivee', NULL, 'N/A', '2018-03-13', '9.09', NULL),
('AC317', 'Air Canada', 'YYC', 'Calgary', 'Arrivee', NULL, 'N/A', '2018-03-14', '8.30', NULL),
('AC400', 'Air Canada', 'YYZ', 'Toronto', 'Arrivee', NULL, 'N/A', '2018-03-14', '8.12', NULL),
('AC403', 'Air Canada', 'YYZ', 'Toronto', 'Depart', NULL, 'A49', '2018-03-14', '8.05', NULL),
('AC480', 'Air Canada', 'YYZ', 'Toronto', 'Arrivee', NULL, 'N/A', '2018-03-14', '7.49', NULL),
('AC581', 'Air Canada', 'ORD', 'Chicago', 'Depart', NULL, 'C76', '2018-03-15', '8.21', NULL),
('AC7631', 'Air Canada', 'JFK', 'New York', 'Arrivee', NULL, 'N/A', '2018-03-14', '8.27', NULL),
('AC7952', 'Air Canada', 'YYZ', 'Toronto', 'Arrivee', NULL, 'N/A', '2018-03-13', '8.13', NULL),
('AC8455', 'Air Canada', 'BOS', 'Boston', 'Arrivee', NULL, 'N/A', '2018-03-13', '7.26', NULL),
('AC8489', 'Air Canada', 'EWR', 'Newark', 'Arrivee', NULL, 'N/A', '2018-03-13', '7.56', NULL),
('AC8593', 'Air Canada', 'YWG', 'Winnipeg', 'Depart', NULL, 'A4', '2018-03-13', '8.03', NULL),
('AC8704', 'Air Canada', 'YQB', 'Quebec', 'Depart', NULL, 'A21', '2018-03-14', '8.01', NULL),
('AC8750', 'Air Canada', 'YVO', 'Val D\'or', 'Arrivee', NULL, 'N/A', '2018-03-14', '8.30', NULL),
('AC8819', 'Air Canada', 'YHM', 'Hamilton', 'Depart', NULL, 'A4', '2018-03-13', '7.49', NULL),
('AC8976', 'Air Canada', 'YOW', 'Ottawa', 'Arrivee', NULL, 'N/A', '2018-03-14', '8.06', NULL),
('AT284', 'Air Transat', 'PUJ', 'Punta Cana', 'Depart', NULL, 'C75', '2018-03-15', '8.24', NULL),
('AT968', 'Air Transat', 'ACA', 'Acapulco', 'Depart', NULL, 'C75', '2018-03-15', '7.54', NULL),
('DL3679', 'Delta', 'JFK', 'New York', 'Depart', NULL, 'A50', '2018-03-14', '7.00', NULL),
('DL3833', 'Delta', 'JFK', 'New York', 'Depart', NULL, 'C87', '2018-03-13', '9.50', NULL),
('DL6906', 'Delta', 'YYZ', 'Toronto', 'Arrivee', NULL, 'N/A', '2018-03-13', '8.12', NULL),
('LX4744', 'Swiss', 'JFK', 'New York', 'Depart', NULL, 'C87', '2018-03-14', '9.50', NULL),
('PD457', 'Porter Airlines', 'YYZ', 'Toronto', 'Arrivee', NULL, 'N/A', '2018-03-15', '8.24', NULL),
('PD7142', 'Porter Airlines', 'YQB', 'Quebec', 'Arrivee', NULL, 'N/A', '2018-03-15', '7.43', NULL),
('UA4067', 'United Airlines', 'EWR', 'Newark', 'Arrivee', NULL, 'N/A', '2018-03-14', '8.12', NULL),
('UA8123', 'United Airlines', 'BOS', 'Boston', 'Arrivee', NULL, 'N/A', '2018-03-15', '7.26', NULL),
('UA8371', 'United Airlines', 'ORD', 'Chicago', 'Depart', NULL, 'C76', '2018-03-15', '8.21', NULL),
('UA8431', 'United Airlines', 'JFK', 'New York', 'Arrivee', NULL, 'N/A', '2018-03-13', '8.27', NULL),
('WG183', 'Sunwing Airlines', 'HUX', 'Huatulco', 'Depart', NULL, 'C65', '2018-03-14', '8.10', NULL),
('WG7378', 'Sunwing Airlines', 'JFK', 'New York', 'Depart', NULL, 'C87', '2018-03-14', '9.50', NULL),
('WS3448', 'WestJet Airlines', 'YQB', 'Quebec', 'Depart', NULL, 'A6', '2018-03-15', '8.18', NULL),
('WS3449', 'WestJet Airlines', 'YQB', 'Quebec', 'Arrivee', NULL, 'N/A', '2018-03-15', '7.08', NULL),
('WS3450', 'WestJet Airlines', 'YHZ', 'Halifax', 'Arrivee', NULL, 'N/A', '2018-03-13', '8.16', NULL),
('WS3514', 'WestJet Airlines', 'YYZ', 'Toronto', 'Arrivee', NULL, 'N/A', '2018-03-15', '7.48', NULL),
('WS6430', 'WestJet Airlines', 'JFK', 'New York', 'Depart', NULL, 'A51', '2018-03-14', '9.50', NULL),
('WS6436', 'WestJet Airlines', 'JFK', 'New York', 'Depart', NULL, 'C84', '2018-03-15', '8.34', NULL),
('WW5964', 'WOW', 'JFK', 'New York', 'Depart', NULL, 'A58', '2018-03-11', '8.10', NULL),
('YN920', 'Air Creebec', 'YVO', 'Val D\'or', 'Arrivee', NULL, 'N/A', '2018-03-13', '7.30', NULL);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `vol`
--
ALTER TABLE `vol`
  ADD PRIMARY KEY (`numeroVol`),
  ADD KEY `nomCompagnie` (`nomCompagnie`),
  ADD KEY `nomAeroport` (`nomAeroport`);

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `vol`
--
ALTER TABLE `vol`
  ADD CONSTRAINT `vol_ibfk_1` FOREIGN KEY (`nomCompagnie`) REFERENCES `compagnie` (`nomCompagnie`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `vol_ibfk_2` FOREIGN KEY (`nomAeroport`) REFERENCES `aeroportdestionation` (`nomAeroport`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
