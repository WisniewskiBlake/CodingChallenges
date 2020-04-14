Challenge 1: <br />
Write a function that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Challenge 2: <br />
Write a function: function solution (S) { // your code } that, given a string representing a list of M photos, returns the string representing the list of the new names of all photos (the order of photos should stay the same). For example, given a string: <br /> <br /> photo. jpg, Warsaw, 2013-09-05 14:08:15 john.png, London, 2015-06-20 15:13:22 my-Friends.png, Warsaw, 2013-09-05 14:07:13 Eiffel.jpg, Paris, 2015-07-23 08:03:02 pisatower.jpg, Paris, 2015-07-22 23:59:59 BOB.ipg, London, 2015-08-05 00:02:03 notredame.png, Paris, 2015-09-01 12:00:00 me.jpg, Warsaw, 2013-09-06 15:40: 22 a.png, Warsaw, 2016-02-13 13:33:50 b.jpg, Warsaw, 2016-01-02 15:12:22 c.jpg, Warsaw, 2016-01-02 14:34:30 d.jpg, Warsaw, 2016-01-02 15:15:01 e.png, Warsaw, 2016-01-02 09:49:09 f.png, Warsaw, 2016-01-02 10:5:32 g.jpg, Warsaw, 2016-02-29 22:13:11 <br /> <br /> your function should return: <br /> Warsaw02.jpg London1.png Warsaw01.png Paris2.jpg Paris1.jpg London2.jpg Paris3.jpg Warsaw03.jpg Warsaw09.jpg Warsaw07.jpg Warsaw06.jpg Warsaw08.jpg Warsaw04.jpg Warsaw05.jpg Warsaw10.jpg as there are ten photos taken in Warsaw (numbered from 01 to 10), two photos in London (numbered from 1 to 2) and three photos in as there are ten photos taken in Warsaw (numbered from 01 to 10), two photos in London (numbered from 1 to 2) and three photos in Paris (numbered from 1 to 3). The new names of the photos are returned in the same order as in the given string. Assume that: • M is an integer within the range [1 .. 100]; • Each year is an integer within the range [2000..2020]; • Each line of the input string is of the format <<photoname>>.<<extension>> , yyyy-mm-dd hh:n-m:ss" and lines are separated with newline characters; • Each photo name (without extension}) and city name consists only of at least 1 and at most 20 letters from the English alphabet; • Each name of the city starts with a capital letter and is followed by lower case letters; • No two photos share the same date and time; • Each extension is "jpg", “png" or “jpeg”

Challenge 3 (Secretary Problem): <br />
Find the k-th smallest/largest item of a data stream. We do not know the data in advance. We want to hire the best secretary out of N applicants. Applicants are interviewed one by one and after rejecting, the applicant can not be recalled. We can rank the applicant among all applicants interviewed so far, but we are unaware of the quality of unseen applicants. We need to maximize the probability of selecting the best applicant.

Challenge 4 (N-Queens Problem): <br />
Given N chess queens on an NxN chessboard, place the queens so that no two queens threaten each other (they can't attack each other). Keep in mind that queens can move on the chessboard vertically, horizontally, and diagonally. 
