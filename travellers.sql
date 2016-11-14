-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2016 at 07:55 PM
-- Server version: 5.6.21
-- PHP Version: 5.5.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `travellers`
--

-- --------------------------------------------------------

--
-- Table structure for table `airwaybooking`
--

CREATE TABLE IF NOT EXISTS `airwaybooking` (
  `ID` text NOT NULL,
  `Agency/Company Name` text NOT NULL,
  `Leaving From` text NOT NULL,
  `Going To` text NOT NULL,
  `Date` date NOT NULL,
  `Time` time NOT NULL,
  `Available Seats` int(11) NOT NULL,
  `Fare Per Seat(BDT)` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `airwaybooking`
--

INSERT INTO `airwaybooking` (`ID`, `Agency/Company Name`, `Leaving From`, `Going To`, `Date`, `Time`, `Available Seats`, `Fare Per Seat(BDT)`) VALUES
('F1', 'Bangladesh Biman', 'Dhaka', 'Chittagong', '2015-04-08', '16:00:00', 10, 3500),
('F2', 'Easy Fly Express', 'Dhaka', 'Chittagong', '2015-04-08', '22:00:00', 123, 124),
('F3', 'Hello Air (Bangladesh)', 'Chittagong', 'Dhaka', '2015-04-08', '17:00:00', 23, 4000),
('F4', 'Sadiastric', 'Chittagong', 'Dhaka', '2015-04-08', '18:00:00', 3, 400),
('F5', 'Soul', 'Khulna', 'Dhaka', '2015-04-08', '12:00:00', 4, 4000);

-- --------------------------------------------------------

--
-- Table structure for table `busbooking`
--

CREATE TABLE IF NOT EXISTS `busbooking` (
  `ID` text NOT NULL,
  `Agency/Company Name` text NOT NULL,
  `Leaving From` text NOT NULL,
  `Going To` text NOT NULL,
  `Date` date NOT NULL,
  `Time` time NOT NULL,
  `Available Seats` int(11) unsigned NOT NULL,
  `Fare Per Seat(BDT)` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busbooking`
--

INSERT INTO `busbooking` (`ID`, `Agency/Company Name`, `Leaving From`, `Going To`, `Date`, `Time`, `Available Seats`, `Fare Per Seat(BDT)`) VALUES
('A1', 'Hanif Enterprise', 'Chittagong', 'Dhaka', '2015-03-01', '20:00:00', 12, 678),
('A2', 'Shaymoli Enterprise', 'Chittagong', 'Dhaka', '2015-03-01', '17:00:00', 12, 213),
('A3', 'Unique', 'Dhaka', 'Chittagong', '2015-03-18', '18:00:00', 5, 490),
('A4', 'Hanif', 'Dhaka', 'Chittagong', '2015-03-05', '16:00:00', 6, 450),
('A5', 'Shohag Enterprise', 'Chittagong', 'Dhaka', '2015-03-30', '20:00:00', 13, 456),
('A6', 'Prince Saudia', 'Chittagong', 'Dhaka', '2015-04-08', '17:00:00', 20, 490),
('A7', 'False', 'Dhaka', 'Chittagong', '2015-03-18', '19:00:00', 123, 435),
('A8', 'Sadiastric', 'Chittagong', 'Dhaka', '2015-04-08', '18:00:00', 5, 450);

-- --------------------------------------------------------

--
-- Table structure for table `checkairbooking`
--

CREATE TABLE IF NOT EXISTS `checkairbooking` (
  `ID` text NOT NULL,
  `Contact Number` text NOT NULL,
  `Status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `checkairbooking`
--

INSERT INTO `checkairbooking` (`ID`, `Contact Number`, `Status`) VALUES
('F1', '01712059437', 'Accepted');

-- --------------------------------------------------------

--
-- Table structure for table `checkbusbooking`
--

CREATE TABLE IF NOT EXISTS `checkbusbooking` (
  `ID` text NOT NULL,
  `Contact Number` text NOT NULL,
  `Status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `checkhotelbooking`
--

CREATE TABLE IF NOT EXISTS `checkhotelbooking` (
  `ID` text NOT NULL,
  `Contact Number` text NOT NULL,
  `Status` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `findguide`
--

CREATE TABLE IF NOT EXISTS `findguide` (
  `Name` text NOT NULL,
  `Agency Name` text NOT NULL,
  `Contact Number` text NOT NULL,
  `Destination` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `findguide`
--

INSERT INTO `findguide` (`Name`, `Agency Name`, `Contact Number`, `Destination`) VALUES
('MD S', 'Prottasha Travels', '01935363393', 'Dhaka'),
('Narayan', 'Bangladesh Tourism', '0123456789', 'Chittagong'),
('Desuza', 'DS RESD', '0147892650', 'Barisal');

-- --------------------------------------------------------

--
-- Table structure for table `hospitalinfo`
--

CREATE TABLE IF NOT EXISTS `hospitalinfo` (
  `Name` varchar(50) NOT NULL,
  `Contact_NO` varchar(20) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Place` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hospitalinfo`
--

INSERT INTO `hospitalinfo` (`Name`, `Contact_NO`, `Address`, `Place`) VALUES
('Apollo Hospital,Dhaka', '0193565778', 'Road no-2,STS avenue', 'Dhaka'),
('Chittagong Medical College', '01547563862', 'Road no-5,chawkbazar', 'Chittagong'),
('City Hospital', '0184759325', 'Road-21', 'Dhaka'),
('Dhaka Shishu Hospital', '01722888194', 'Syed Mahbub Morshed ', 'Dhaka');

-- --------------------------------------------------------

--
-- Table structure for table `hotelbooking`
--

CREATE TABLE IF NOT EXISTS `hotelbooking` (
  `ID` text NOT NULL,
  `Hotel Name` text NOT NULL,
  `Destination` text NOT NULL,
  `Date` date NOT NULL,
  `Room Type` text NOT NULL,
  `Available Rooms` int(11) NOT NULL,
  `Rates Per Day(USD)` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hotelbooking`
--

INSERT INTO `hotelbooking` (`ID`, `Hotel Name`, `Destination`, `Date`, `Room Type`, `Available Rooms`, `Rates Per Day(USD)`) VALUES
('H1', 'Ruposhi Bangla Hotel', 'Dhaka', '2015-03-08', 'Deluxe', 12, 111),
('H2', 'Pan Pacific', 'Dhaka', '2015-03-08', 'Executive Twin', 12, 123),
('H3', 'Hotel Saint Martin Limited', 'Chittagong', '2015-03-08', 'Suite', 12, 123),
('H4', 'The Peninsula', 'Chittagong', '2015-03-08', 'Super Deluxe', 34, 323),
('H5', 'dgf', 'agsa', '2015-12-03', 'Deluxe', 1, 1),
('H6', 'False T', 'Chittagong', '2015-04-08', 'Executive Twin', 5, 125),
('H7', 'Fauds', 'Barisal', '2015-04-08', 'Executive Twin', 5, 154);

-- --------------------------------------------------------

--
-- Table structure for table `localpolice`
--

CREATE TABLE IF NOT EXISTS `localpolice` (
  `Name` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Contact_NO` text NOT NULL,
  `Place` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `localpolice`
--

INSERT INTO `localpolice` (`Name`, `Address`, `Contact_NO`, `Place`) VALUES
('Kotwali Police Station', 'Kotowali Thana Chittagong', '01818547584', 'Chittagong'),
('Pallabi Police Station', 'Pallabi', '01978484632', 'Dhaka'),
('Rajshai police station', 'rajshai 22/24 road-12', '015879482', 'Rajshahi'),
('Rangunia Thana Police', 'Rangunia Highway ,Rangunia', '01935363393', 'Chittagong');

-- --------------------------------------------------------

--
-- Table structure for table `logintable`
--

CREATE TABLE IF NOT EXISTS `logintable` (
  `username` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `logintable`
--

INSERT INTO `logintable` (`username`, `password`) VALUES
('1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `package`
--

CREATE TABLE IF NOT EXISTS `package` (
`id` int(11) NOT NULL,
  `from_` varchar(200) NOT NULL,
  `to_` varchar(200) NOT NULL,
  `description` text NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `package`
--

INSERT INTO `package` (`id`, `from_`, `to_`, `description`) VALUES
(1, 'Dhaka', 'Chittagong', 'Introduced by Prottasha Travels\r\nTrips Type-Overnight\r\nVisit the most Impressive Area in Chittagong as Sea beach in Pattenga\r\nand MiniBangladesh etc\r\nFree Lunch and Dinner\r\nRates per Head-125$ '),
(2, 'Dhaka', 'Syllet', 'Package name: Jaflong & Lalakhal Tour\r\nIntroduced by Nijhoom Travels\r\nOvernight trip to Sylhet to discover the\r\nbeautiful Jaflong and boat riding at the blue water canal Lalakhal. If you want to \r\nenjoy a weekend in short time at Sylhet,\r\n this would be the best tour for you.\r\nRates Per Head-120$');

-- --------------------------------------------------------

--
-- Table structure for table `requestforair`
--

CREATE TABLE IF NOT EXISTS `requestforair` (
  `ID` text NOT NULL,
  `Contact Number` text NOT NULL,
  `Seats` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `requestforbus`
--

CREATE TABLE IF NOT EXISTS `requestforbus` (
  `ID` text NOT NULL,
  `Contact Number` text NOT NULL,
  `Seats` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `requestforhotel`
--

CREATE TABLE IF NOT EXISTS `requestforhotel` (
  `ID` text NOT NULL,
  `Contact Number` text NOT NULL,
  `Rooms` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `requestforinterview`
--

CREATE TABLE IF NOT EXISTS `requestforinterview` (
`ID` int(11) NOT NULL,
  `Name` text,
  `Email` text,
  `Contact_Number` text,
  `Experience` text,
  `Date` date DEFAULT NULL,
  `Time` time DEFAULT NULL,
  `Place` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `travelagency`
--

CREATE TABLE IF NOT EXISTS `travelagency` (
  `Title` varchar(40) NOT NULL,
  `Address` varchar(40) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Contact_No` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `travelagency`
--

INSERT INTO `travelagency` (`Title`, `Address`, `Email`, `Contact_No`) VALUES
('Bangladesh Travel Homes Ltd.', 'House-20, Road-12, Sector-01  Uttara Mod', 'info@bdtravelhomes.net , bdtra', '0193536393'),
('BD TOURS LTD.', 'House # 422 (3rd Fl), Road # 30,  New D ', 'oursbd@gmail.com, info@bd-tour', '0157849236'),
('BRIGHT TRAVELS', 'MOHAMMED REZAUL KARIM, Proprietor,  Hous', 'sonali@bol-online.com', '0193568648'),
('EVERGREEN TOURISM NETWORK', 'Ebrahim Mension,  11 Purana Paltan, Dhak', 'toursbd@gmail.com', '015793658'),
('Green Channel Tour Operators', 'House # 3G, Flat # C-1, Road # 104  Guls', 'info@greenchannelbd.com / gct1', '0158497236');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hospitalinfo`
--
ALTER TABLE `hospitalinfo`
 ADD PRIMARY KEY (`Name`);

--
-- Indexes for table `localpolice`
--
ALTER TABLE `localpolice`
 ADD PRIMARY KEY (`Name`);

--
-- Indexes for table `package`
--
ALTER TABLE `package`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `requestforinterview`
--
ALTER TABLE `requestforinterview`
 ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `travelagency`
--
ALTER TABLE `travelagency`
 ADD PRIMARY KEY (`Title`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `package`
--
ALTER TABLE `package`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `requestforinterview`
--
ALTER TABLE `requestforinterview`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
