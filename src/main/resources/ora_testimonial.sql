-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 16, 2018 at 07:33 PM
-- Server version: 5.7.9
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ora_testimonial`
--

-- --------------------------------------------------------

--
-- Table structure for table `master_testimonial`
--

DROP TABLE IF EXISTS `master_testimonial`;
CREATE TABLE IF NOT EXISTS `master_testimonial` (
  `testimonial_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `language_id` bigint(20) DEFAULT NULL,
  `parent_id` bigint(20) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`testimonial_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `master_testimonial`
--

INSERT INTO `master_testimonial` (`testimonial_id`, `created_by`, `created_date`, `modified_by`, `modified_date`, `status`, `description`, `language_id`, `parent_id`, `title`, `user_id`) VALUES
(1, 1, '2018-12-17 00:57:01', NULL, NULL, 1, 'xyz', 1, NULL, 'abc', 1),
(2, 1, '2018-12-17 00:57:30', NULL, NULL, 1, 'xyz', 1, NULL, 'abc', 1),
(3, 1, '2018-12-17 00:58:09', NULL, NULL, 1, 'xyz', 1, NULL, 'abc', 1);

-- --------------------------------------------------------

--
-- Table structure for table `quick_links`
--

DROP TABLE IF EXISTS `quick_links`;
CREATE TABLE IF NOT EXISTS `quick_links` (
  `q_link_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_by` bigint(20) DEFAULT NULL,
  `created_date` varchar(255) DEFAULT NULL,
  `modified_by` bigint(20) DEFAULT NULL,
  `modified_date` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `link_title` varchar(255) DEFAULT NULL,
  `link_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`q_link_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `quick_links`
--

INSERT INTO `quick_links` (`q_link_id`, `created_by`, `created_date`, `modified_by`, `modified_date`, `status`, `link_title`, `link_url`) VALUES
(1, 1, '2018-12-17 21:16:42', NULL, NULL, 1, 'Contact Us', 'www.google.com'),
(2, 1, '2018-12-17 21:16:42', NULL, NULL, 1, 'About Us', 'www.facebook.com');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
