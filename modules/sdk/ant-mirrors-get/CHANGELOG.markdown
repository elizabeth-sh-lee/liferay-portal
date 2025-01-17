# Liferay Ant Mirrors Get Change Log

## 1.2.8 - 2020-01-16

### Commits
- [LRCI-941]: Add a test that uses https (c57c91bc3c)
- [LRCI-941]: Don't recreate the original source URL (dc3c4a435f)

## 1.2.7 - 2020-01-03

### Commits
- [LRCI-901]: Add configurable retry logic for mirrors-get (a71fc0d1a5)
- [LPS-84119]: Add line breaks (b8db59dbc4)
- [LPS-98801 LPS-96095]: auto SF for ant (bf3c0ef390)

### Dependencies
- [LPS-98801 LPS-96095]: Update the ant dependency to version 1.9.14.

## 1.2.6 - 2018-11-02

### Commits
- [LRQA-44525]: Simplify (c054abc60c)
- [LRQA-44525]: Add support for "file:" src URLs (8846739be9)

## 1.2.5 - 2018-08-14

### Commits
- [LRQA-42800]: Remove stacktrace printout for failing to find an MD5 file
(557f9d3848)

## 1.2.4 - 2018-04-26

### Commits
- [LRQA-40414]: Wordsmith (45e12049ba)
- [LRQA-40414]: Remove stack trace from standard out and replace with a better
message (f4c053b484)

## 1.2.3 - 2018-04-12

### Commits
- [LRQA-40056]: publish (9a5d94c051)
- [LRQA-40056]: this is a case where "return" is uglier than "else" (7d33bdaee5)
- [LRQA-40056]: Don't replace the "/" (00cf812532)
- [LRQA-40056]: Replace nested ${<property>} instances (4fd801ef7a)

### Dependencies
- [LPS-75049]: Update the ant dependency to version 1.9.4.

## 1.2.2 - 2018-04-03

### Commits
- [LRQA-39761]: Exception handling (58ace54702)
- [LRQA-39761]: Remove _HOSTNAME constant and use mirrors.hostname property
instead (46600f9a43)
- [LPS-77425]: Partial revert of d25f48516a9ad080bcbd50e228979853d3f2dda5
(60d3a950d6)
- [LPS-77425]: Increment all major versions (d25f48516a)

## 1.2.1 - 2018-02-01

### Commits
- [LRQA-37934]: Remove unnecessary import (c4220beb9b)
- [LRQA-37934]: If any exception occurs while retrieving the MD5 file, skip MD5
verification (95fbf498b6)
- [LRQA-37934]: Do not fail mirrors-get if a 403 is returned on the MD5 file
(fec50784b7)

## 1.2.0 - 2017-08-03

### Commits
- [LPS-74016]: update jar (d0a4daec8e)

## 1.1.1 - 2017-08-03

### Commits
- [LPS-74016]: Allow "mirrors-get" to follow redirects from HTTP to HTTPS
(04e599c690)

## 1.0.4 - 2017-05-19

### Commits
- [LPS-72572]: Enable semantic versioning check for ant-mirrors-get (83cbcb3994)
- [LPS-72572]: Allow to skip MD5 check in "mirrors-get" task (582bfaa859)
- [LRQA-29640]: -D cleaner (bf6c7951e2)
- [LRQA-29640]: -D SF (fb118c0209)
- [LRQA-29640]: -D Not used? (d471c63b3e)
- [LRQA-29640]: -D SF (75caae1f19)
- [LRQA-29640]: -D Refactor - Rename GitHubMessageTest -> BuildTest (0f1ba3d849)
- [LRQA-28693]: Fix spelling (49a001a91e)

## 1.0.3 - 2016-11-29

### Commits
- [LRQA-29376]: Only use API available in JDK6 (447249b5bb)
- [LRQA-28693]: Partial revert of 332a9368b9fcb391e4364d309e188ca1fc9c7d42
(f9c043e6d7)

## 1.0.2 - 2016-11-15

### Commits
- [LRQA-28693]: trim /'s from end of _path. (9f2d5f0462)

## 1.0.1 - 2016-11-11

### Commits
- [LRQA-28693]: _dest may be a directory or a file. (3635bdaeb1)