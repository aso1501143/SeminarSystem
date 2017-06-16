-- phpMyAdmin SQL Dump
-- version 4.4.10
-- http://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: 2017 年 6 月 08 日 08:04
-- サーバのバージョン： 5.5.42-log
-- PHP Version: 7.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `seminar`
--

-- --------------------------------------------------------

--
-- テーブルの構造 `semi`
--

CREATE TABLE `semi` (
  `subjectid` int(2) NOT NULL,
  `subjectname` varchar(8) DEFAULT NULL,
  `subjectcf` varchar(1) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `student`
--

CREATE TABLE `student` (
  `studentid` int(4) unsigned NOT NULL,
  `studentname` varchar(8) NOT NULL DEFAULT '',
  `passwd` varchar(8) NOT NULL DEFAULT '',
  `classname` varchar(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- テーブルの構造 `teacher`
--

CREATE TABLE `teacher` (
  `teacherid` varchar(11) NOT NULL DEFAULT '',
  `teachername` varchar(6) NOT NULL DEFAULT '',
  `passwd` int(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `semi`
--
ALTER TABLE `semi`
  ADD PRIMARY KEY (`subjectid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`studentid`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`teacherid`);
