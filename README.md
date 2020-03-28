# KaoYan_JiShi
这个是考研复试上机训练，题目网站https://www.nowcoder.com/ta/kaoyan

1.Main001

题目描述
查找和排序

题目：输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排列,相同成绩
都按先录入排列在前的规则处理。

示例：
jack      70
peter     96
Tom       70
smith     67

从高到低  成绩
peter     96
jack      70
Tom       70
smith     67

从低到高

smith     67

jack      70
Tom      70
peter     96

输入描述:
输入多行，先输入要排序的人的个数，然后输入排序方法0（降序）或者1（升序）再分别输入他们的名字和成绩，
以一个空格隔开

输出描述:
按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开

输入
3
0
fang 90
yang 50
ning 70

输出
fang 90
ning 70
yang 50

2.Mainmm2
题目描述
输入n个整数,依次输出每个数的约数的个数
输入描述:
输入的第一行为N，即数组的个数(N<=1000)
接下来的1行包括N个整数，其中每个数的范围为(1<=Num<=1000000000)
当N=0时输入结束。
输出描述:
可能有多组输入数据，对于每组输入数据，
输出N行，其中每一行对应上面的一个数的约数的个数。

输入
5
1 3 4 6 12
输出
1
2
3
4
6

3.Main003
题目描述
    使用代理服务器能够在一定程度上隐藏客户端信息，从而保护用户在互联网上的隐私。我们知道n个代理服务器的IP地址，现在要用它们去访问m个服务器。这 m 个服务器的 IP 地址和访问顺序也已经给出。系统在同一时刻只能使用一个代理服务器，并要求不能用代理服务器去访问和它 IP地址相同的服务器（不然客户端信息很有可能就会被泄露）。在这样的条件下，找到一种使用代理服务器的方案，使得代理服务器切换的次数尽可能得少。
输入描述:
    每个测试数据包括 n + m + 2 行。
    第 1 行只包含一个整数 n，表示代理服务器的个数。
    第 2行至第n + 1行每行是一个字符串，表示代理服务器的 IP地址。这n个 IP地址两两不相同。
    第 n + 2 行只包含一个整数 m，表示要访问的服务器的个数。
    第 n + 3 行至第 n + m + 2 行每行是一个字符串，表示要访问的服务器的 IP 地址，按照访问的顺序给出。
    每个字符串都是合法的IP地址，形式为“xxx.yyy.zzz.www”，其中任何一部分均是0–255之间的整数。输入数据的任何一行都不包含空格字符。
     其中，1<=n<=1000，1<=m<=5000。
输出描述:
    可能有多组测试数据，对于每组输入数据， 输出数据只有一行，包含一个整数s，表示按照要求访问服务器的过程中切换代理服务器的最少次数。第一次使用的代理服务器不计入切换次数中。若没有符合要求的安排方式，则输出-1。
示例1
输入
3
166.111.4.100
162.105.131.113
202.112.128.69
6
72.14.235.104
166.111.4.100
207.46.19.190
202.112.128.69
162.105.131.113
118.214.226.52
输出
1

4.Main004
题目描述
输入任意4个字符(如：abcd)， 并按反序输出(如：dcba)
输入描述:
题目可能包含多组用例，每组用例占一行，包含4个任意的字符。
输出描述:
对于每组输入,请输出一行反序后的字符串。
具体可见样例。
示例1
输入
Upin
cvYj
WJpw
cXOA
输出
nipU
jYvc
wpJW
AOXc

5.Main005
题目描述
按照手机键盘输入字母的方式，计算所花费的时间 如：a,b,c都在“1”键上，输入a只需要按一次，输入c需要连续按三次。 如果连续两个字符不在同一个按键上，则可直接按，如：ad需要按两下，kz需要按6下 如果连续两字符在同一个按键上，则两个按键之间需要等一段时间，如ac，在按了a之后，需要等一会儿才能按c。 现在假设每按一次需要花费一个时间段，等待时间需要花费两个时间段。 现在给出一串字符，需要计算出它所需要花费的时间。
输入描述:
一个长度不大于100的字符串，其中只有手机按键上有的小写字母
输出描述:
输入可能包括多组数据，对于每组数据，输出按出Input所给字符串所需要的时间
示例1
输入
bob
www
输出
7
7

6.Main006
题目描述
求正整数N(N>1)的质因数的个数。 相同的质因数需要重复计算。如120=2*2*2*3*5，共有5个质因数。
输入描述:
可能有多组测试数据，每组测试数据的输入是一个正整数N，(1<N<10^9)。
输出描述:
对于每组数据，输出N的质因数的个数。
示例1
输入
120
输出
5

7.Main007
题目描述
一个整数总可以拆分为2的幂的和，例如： 7=1+2+4 7=1+2+2+2 7=1+1+1+4 7=1+1+1+2+2 7=1+1+1+1+1+2 7=1+1+1+1+1+1+1 总共有六种不同的拆分方式。 再比如：4可以拆分成：4 = 4，4 = 1 + 1 + 1 + 1，4 = 2 + 2，4=1+1+2。 用f(n)表示n的不同拆分的种数，例如f(7)=6. 要求编写程序，读入n(不超过1000000)，输出f(n)%1000000000。
输入描述:
每组输入包括一个整数：N(1<=N<=1000000)。
输出描述:
对于每组数据，输出f(n)%1000000000。
示例1
输入
7
输出
6

8.Main008
题目描述
用一维数组存储学号和成绩，然后，按成绩排序输出。
输入描述:
输入第一行包括一个整数N(1<=N<=100)，代表学生的个数。
接下来的N行每行包括两个整数p和q，分别代表每个学生的学号和成绩。
输出描述:
按照学生的成绩从小到大进行排序，并将排序后的学生信息打印出来。
如果学生的成绩相同，则按照学号的大小进行从小到大排序。
示例1
输入
3
1 90
2 87
3 92
输出
2 87
1 90
3 92

9.Main009
题目描述
输入球的中心点和球上某一点的坐标，计算球的半径和体积
输入描述:
球的中心点和球上某一点的坐标，以如下形式输入：x0 y0 z0 x1 y1 z1
输出描述:
输入可能有多组，对于每组输入，输出球的半径和体积，并且结果保留三位小数

为避免精度问题，PI值请使用arccos(-1)。
示例1
输入
0 0 0 1 1 1
输出
1.732 21.766

10.Main010
题目描述
编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。 例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
输入描述:
输入包括1行字符串，长度不超过100。
输出描述:
可能有多组测试数据，对于每组数据，
输出将输入字符串建立二叉树后中序遍历的序列，每个字符后面都有一个空格。
每个输出结果占一行。
示例1
输入
abc##de#g##f###
输出
c b e g d f a

11.Main011
题目描述
输入N个（N<=10000）数字，求出这N个数字中的最大值和最小值。每个数字的绝对值不大于1000000。
输入描述:
输入包括多组测试用例，每组测试用例由一个整数N开头，接下去一行给出N个整数。
输出描述:
输出包括两个整数，为给定N个数中的最大值与最小值。
示例1
输入
5
1 2 3 4 5
3
3 7 8
输出
5 1
8 3

12.Main12
题目描述
输入一个整数n，输出n的阶乘（每组测试用例可能包含多组数据，请注意处理）
输入描述:
一个整数n(1<=n<=20)
输出描述:
n的阶乘
示例1
输入
3
输出
6

13.Main013
题目描述
写个算法，对2个小于1000000000的输入，求结果。 特殊乘法举例：123 * 45 = 1*4 +1*5 +2*4 +2*5 +3*4+3*5
输入描述:
两个小于1000000000的数
输出描述:
输入可能有多组数据，对于每一组数据，输出Input中的两个数按照题目要求的方法进行运算后得到的结果。
示例1
输入
123 45
输出
54

14.Main014
题目描述
输入年、月、日，计算该天是本年的第几天。
输入描述:
包括三个整数年(1<=Y<=3000)、月(1<=M<=12)、日(1<=D<=31)。
输出描述:
输入可能有多组测试数据，对于每一组测试数据，
输出一个整数，代表Input中的年、月、日对应本年的第几天。
示例1
输入
1990 9 20
2000 5 1
输出
263
122

15.Main015
题目描述
给出一个整数序列S，其中有N个数，定义其中一个非空连续子序列T中所有数的和为T的“序列和”。 对于S的所有非空连续子序列T，求最大的序列和。 变量条件：N为正整数，N≤1000000，结果序列和在范围（-2^63,2^63-1）以内。
输入描述:
第一行为一个正整数N，第二行为N个整数，表示序列中的数。
输出描述:
输入可能包括多组数据，对于每一组输入数据，
仅输出一个数，表示最大序列和。
示例1
输入
5
1 5 -3 2 4

6
1 -2 3 4 -10 6

4
-3 -1 -2 -5
输出
9
7
-1

16.Main016
题目描述
 输入一个正整数N，输出N的阶乘。
输入描述:
正整数N(0<=N<=1000)
输出描述:
 输入可能包括多组数据，对于每一组输入数据，输出N的阶乘
示例1
输入
4
5
15
输出
24
120
1307674368000

17.Main017
题目描述
输入N个学生的信息，然后进行查询。
输入描述:
输入的第一行为N，即学生的个数(N<=1000)
接下来的N行包括N个学生的信息，信息格式如下：
01 李江 男 21
02 刘唐 男 23
03 张军 男 19
04 王娜 女 19
然后输入一个M(M<=10000),接下来会有M行，代表M次查询，每行输入一个学号，格式如下：
02
03
01
04
输出描述:
输出M行，每行包括一个对应于查询的学生的信息。
如果没有对应的学生信息，则输出“No Answer!”
示例1
输入
4
01 李江 男 21
02 刘唐 男 23
03 张军 男 19
04 王娜 女 19
5
02
03
01
04
03
输出
02 刘唐 男 23
03 张军 男 19
01 李江 男 21
04 王娜 女 19
03 张军 男 19

18.Main018
题目描述
    “臭味相投”——这是我们描述朋友时喜欢用的词汇。两个人是朋友通常意味着他们存在着许多共同的兴趣。然而作为一个宅男，你发现自己与他人相互了解的机会并不太多。幸运的是，你意外得到了一份北大图书馆的图书借阅记录，于是你挑灯熬夜地编程，想从中发现潜在的朋友。     首先你对借阅记录进行了一番整理，把N个读者依次编号为1,2,…,N，把M本书依次编号为1,2,…,M。同时，按照“臭味相投”的原则，和你喜欢读同一本书的人，就是你的潜在朋友。你现在的任务是从这份借阅记录中计算出每个人有几个潜在朋友。
输入描述:
    每个案例第一行两个整数N,M，2 <= N ，M<= 200。接下来有N行，第i(i = 1,2,…,N)行每一行有一个数，表示读者i-1最喜欢的图书的编号P(1<=P<=M)
输出描述:
    每个案例包括N行，每行一个数，第i行的数表示读者i有几个潜在朋友。如果i和任何人都没有共同喜欢的书，则输出“BeiJu”（即悲剧，^ ^）
示例1
输入
4  5
2
3
2
1
输出
1
BeiJu
1
BeiJu

20.Main020
题目描述
给出n个正整数，任取两个数分别作为分子和分母组成最简真分数，编程求共有几个这样的组合。
输入描述:
每组包含n（n<=600）和n个不同的整数，整数大于1且小于等于1000。
输出描述:
每行输出最简真分数组合的个数。
示例1
输入
7
3 5 7 9 11 13 15
3
2 4 5
0
输出
17
2

21.Main021
题目描述
中位数定义：一组数据按从小到大的顺序依次排列，处在中间位置的一个数（或最中间两个数据的平均数）. 给出一组无序整数，求出中位数，如果求最中间两个数的平均数，向下取整即可（不需要使用浮点数）
输入描述:
该程序包含多组测试数据，每一组测试数据的第一行为N，代表该组测试数据包含的数据个数，1<=N<=10000.
接着N行为N个数据的输入，N=0时结束输入
输出描述:
输出中位数，每一组测试数据输出一行
示例1
输入
4
10
30
20
40
3
40
30
50
4
1
2
3
4
0
输出
25
40
2

22.Main022
题目描述
N只小白鼠(1 <= N <= 100)，每只鼠头上戴着一顶有颜色的帽子。现在称出每只白鼠的重量，要求按照白鼠重量从大到小的顺序输出它们头上帽子的颜色。帽子的颜色用“red”，“blue”等字符串来表示。不同的小白鼠可以戴相同颜色的帽子。白鼠的重量用整数表示。
输入描述:
多案例输入，每个案例的输入第一行为一个整数N，表示小白鼠的数目。
下面有N行，每行是一只白鼠的信息。第一个为不大于100的正整数，表示白鼠的重量，；第二个为字符串，表示白鼠的帽子颜色，字符串长度不超过10个字符。

注意：白鼠的重量各不相同。
输出描述:
每个案例按照白鼠的重量从大到小的顺序输出白鼠的帽子颜色。
示例1
输入
3
30 red
50 blue
40 green
输出
blue
green
red

23.Main023
题目描述
已知正整数k满足2<=k<=9，现给出长度最大为30位的十进制非负整数c，求所有能整除c的k.
输入描述:
若干个非负整数c，c的位数<=30
每行一个c
输出描述:
每一个c的结果占一行
1) 若存在满足 c%k == 0 的k，输出所有这样的k，中间用空格隔开，最后一个k后面没有空格。
2) 若没有这样的k则输出"none"

注意整数溢出问题
不要对-1进行计算
示例1
输入
30
72
13
-1
输出
2 3 5 6
2 3 4 6 8 9
none

24.Main024
题目描述
输入一个字符串，以回车结束（字符串长度<=100）。该字符串由若干个单词组成，单词之间用一个空格隔开，所有单词区分大小写。现需要将其中的某个单词替换成另一个单词，并输出替换之后的字符串。
输入描述:
多组数据。每组数据输入包括3行，
第1行是包含多个单词的字符串 s，
第2行是待替换的单词a，(长度<=100)
第3行是a将被替换的单词b。(长度<=100)

s, a, b 最前面和最后面都没有空格.
输出描述:
每个测试数据输出只有 1 行，
将s中所有单词a替换成b之后的字符串。
示例1
输入
You want someone to help you
You
I
输出
I want someone to help you

25.Main025
题目描述
名名的妈妈从外地出差回来，带了一盒好吃又精美的巧克力给名名（盒内共有 N 块巧克力，20 > N >0）。 妈妈告诉名名每天可以吃一块或者两块巧克力。 假设名名每天都吃巧克力，问名名共有多少种不同的吃完巧克力的方案。 例如： 如果N=1，则名名第1天就吃掉它，共有1种方案； 如果N=2，则名名可以第1天吃1块，第2天吃1块，也可以第1天吃2块，共有2种方案； 如果N=3，则名名第1天可以吃1块，剩2块，也可以第1天吃2块剩1块，所以名名共有2+1=3种方案； 如果N=4，则名名可以第1天吃1块，剩3块，也可以第1天吃2块，剩2块，共有3+2=5种方案。 现在给定N，请你写程序求出名名吃巧克力的方案数目。
输入描述:
输入只有1行，即整数N。
输出描述:
可能有多组测试数据，对于每组数据，
输出只有1行，即名名吃巧克力的方案数。
示例1
输入
4
输出
5

26.Main026
题目描述
把M个同样的苹果放在N个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
输入描述:
每行均包含二个整数M和N，以空格分开。1<=M，N<=10。
输出描述:
对输入的每组数据M和N，用一行输出相应的K。
示例1
输入
1
7 3
输出
8

27.Main027
题目描述
一个正整数,如果它能被7整除,或者它的十进制表示法中某个位数上的数字为7, 则称其为与7相关的数.现求所有小于等于n(n<100)的与7无关的正整数的平方和。
输入描述:
案例可能有多组。对于每个测试案例输入为一行,正整数n,(n<100)
输出描述:
对于每个测试案例输出一行，输出小于等于n的与7无关的正整数的平方和。
示例1
输入
21
输出
2336

28.Main018
题目描述
在一个整数数组上，对于下标为i的整数，如果它大于所有它相邻的整数， 或者小于所有它相邻的整数，则称为该整数为一个极值点，极值点的下标就是i。
输入描述:
第一行是此数组的元素个数k(4<k<80)，第二行是k个整数，每两个整数之间用空格分隔。
输出描述:
每个案例输出为n行：每行对应于相应数组的所有极值点下标值，下标值之间用空格分隔。
示例1
输入
10
10 12 12 11 11 12 23 24 12 12
15
12 12 122 112 222 211 222 221 76 36 31 234 256 76 76
15
12 14 122 112 222 222 222 221 76 36 31 234 256 76 73
输出
0 7
2 3 4 5 6 10 12
0 2 3 10 12 14

20.Main030
题目描述
    有一个长度为整数L(1<=L<=10000)的马路，可以想象成数轴上长度为L的一个线段，起点是坐标原点，在每个整数坐标点有一棵树，即在0,1,2，...，L共L+1个位置上有L+1棵树。     现在要移走一些树，移走的树的区间用一对数字表示，如 100 200表示移走从100到200之间（包括端点）所有的树。     可能有M(1<=M<=100)个区间，区间之间可能有重叠。现在要求移走所有区间的树之后剩下的树的个数。
输入描述:
    两个整数L(1<=L<=10000)和M(1<=M<=100)。
    接下来有M组整数，每组有一对数字。
输出描述:
    可能有多组输入数据，对于每组输入数据，输出一个数，表示移走所有区间的树之后剩下的树的个数。
示例1
输入
500 3
100 200
150 300
470 471
输出
298

31.Main031
题目描述
第一行输入一个数n，1 <= n <= 1000，下面输入n行数据，每一行有两个数，分别是x y。输出一组x y，该组数据是所有数据中x最小，且在x相等的情况下y最小的。
输入描述:
输入有多组数据。
每组输入n，然后输入n个整数对。
输出描述:
输出最小的整数对。
示例1
输入
5
3 3
2 2
5 5
2 1
3 6
输出
2 1

32.Main032
题目描述
计算a+b的和
每行包含两个整数a和b
对于每行输入对应输出一行a和b的和

输入
1 5

输出
6

33.Main033
题目描述
打印所有不超过n（n<256）的，其平方具有对称性质的数。如11*11=121。

34.Main034
输入描述:
输入包括一行字符串，其长度不超过1000。
输出描述:
可能有多组测试数据，对于每组数据，如果是回文字符串则输出"Yes!”，否则输出"No!"。
示例1
输入
hellolleh
helloworld
输出
Yes!
No!

35.Main035
题目描述
输入n， 求y1=1!+3!+...m!(m是小于等于n的最大奇数） y2=2!+4!+...p!(p是小于等于n的最大偶数)。
输入描述:
每组输入包括1个整数：n
输出描述:
可能有多组测试数据，对于每组数据，
输出题目要求的y1和y2
示例1
输入
4
输出
7 26

36.Main036
题目描述
    对输入的n个数进行排序并输出。
输入描述:
    输入的第一行包括一个整数n(1<=n<=100)。
    接下来的一行包括n个整数。
输出描述:
    可能有多组测试数据，对于每组数据，将排序后的n个整数输出，每个数后面都有一个空格。
    每组测试数据的结果占一行。
示例1
输入
4
1 4 3 2
输出
1 2 3 4

37.Main037
题目描述
输入一系列整数，建立二叉排序树，并进行前序，中序，后序遍历。
输入描述:
输入第一行包括一个整数n(1<=n<=100)。
接下来的一行包括n个整数。
输出描述:
可能有多组测试数据，对于每组数据，将题目所给数据建立一个二叉排序树，并对二叉排序树进行前序、中序和后序遍历。
每种遍历结果输出一行。每行最后一个数据之后有一个空格。

输入中可能有重复元素，但是输出的二叉树遍历序列中重复元素不用输出。
示例1
输入
5
1 6 5 9 8
输出
1 6 5 9 8
1 5 6 8 9
5 8 9 6 1

38.Main038
题目描述
N阶楼梯上楼问题：一次可以走两阶或一阶，问有多少种上楼方式。（要求采用非递归）
输入描述:
输入包括一个整数N,(1<=N<90)。
输出描述:
可能有多组测试数据，对于每组数据，
输出当楼梯阶数是N时的上楼方式个数。
示例1
输入
复制
4
输出
复制
5

40.Main040
题目描述
对给定的一个字符串，找出有重复的字符，并给出其位置，如：abcaaAB12ab12 输出：a，1；a，4；a，5；a，10，b，2；b，11，1，8；1，12， 2，9；2，13。
输入描述:
输入包括一个由字母和数字组成的字符串，其长度不超过100。
输出描述:
可能有多组测试数据，对于每组数据，
按照样例输出的格式将字符出现的位置标出。

1、下标从0开始。
2、相同的字母在一行表示出其出现过的位置。
示例1
输入
abcaaAB12ab12
输出
a:0,a:3,a:4,a:9
b:1,b:10
1:7,1:11
2:8,2:12

41.MainM41
题目描述
给出年分m和一年中的第n天，算出第n天是几月几号。
输入描述:
输入包括两个整数y(1<=y<=3000)，n(1<=n<=366)。
输出描述:
可能有多组测试数据，对于每组数据，
按 yyyy-mm-dd的格式将输入中对应的日期打印出来。
示例1
输入
2000 3
2000 31
2000 40
2000 60
2000 61
2001 60
输出
2000-01-03
2000-01-31
2000-02-09
2000-02-29
2000-03-01
2001-03-01

42.Main042
题目描述
输入一系列整数，将其中最大的数挑出(如果有多个，则挑出一个即可)，并将剩下的数进行排序，如果无剩余的数，则输出-1。
输入描述:
输入第一行包括1个整数N，1<=N<=1000，代表输入数据的个数。
接下来的一行有N个整数。
输出描述:
可能有多组测试数据，对于每组数据，
第一行输出一个整数，代表N个整数中的最大值，并将此值从数组中去除，将剩下的数进行排序。
第二行将排序的结果输出。
示例1
输入
4
1 3 4 2
输出
4
1 2 3

43.Main043
题目描述
一个数如果恰好等于它的各因子(该数本身除外)子和，如：6=3+2+1。则称其为“完数”；若因子之和大于该数，则称其为“盈数”。 求出2到60之间所有“完数”和“盈数”。
输入描述:
题目没有任何输入。
输出描述:
输出2到60之间所有“完数”和“盈数”，并以如下形式输出：
E: e1 e2 e3 ......(ei为完数)
G: g1 g2 g3 ......(gi为盈数)
其中两个数之间要有空格，行尾不加空格。

44.Main044
题目描述
输入数组长度 n 输入数组      a[1...n] 输入查找个数m 输入查找数字b[1...m]   输出 YES or NO  查找有则YES 否则NO 。
输入描述:
输入有多组数据。
每组输入n，然后输入n个整数，再输入m，然后再输入m个整数（1<=m,n<=100）。
输出描述:
如果在n个数组中输出YES否则输出NO。
示例1
输入
5
1 5 2 4 3
3
2 5 6
输出
YES
YES
NO

45.Main045
题目描述
实现一个加法器，使其能够输出a+b的值。
输入描述:
输入包括两个数a和b，其中a和b的位数不超过1000位。
输出描述:
可能有多组测试数据，对于每组数据，
输出a+b的值。
示例1
输入
2 6
10000000000000000000 10000000000000000000000000000000
输出
8
10000000000010000000000000000000

46.Main046
题目描述
设N是一个四位数，它的9倍恰好是其反序数（例如：1234 的反序数是4321），求N的值。
输入描述:
无
输出描述:
每行一个数，表示满足题目要求的数。

47.Main047
输入描述:
输入有多组数据。
每组输入n，然后输入n个整数(1<=n<=1000)，再输入k。
输出描述:
输出第k小的整数。
示例1
输入
6
2 1 3 5 2 2
3
输出
3

48.Main048
输入描述:
每一行包括两个字符串，长度不超过100。
输出描述:
可能有多组测试数据，对于每组数据，
不借用任何字符串库函数实现无冗余地接受两个字符串，然后把它们无冗余的连接起来。
输出连接后的字符串。
示例1
输入
abc def
输出
abcdef

49.Main049
题目描述
守形数是这样一种整数，它的平方的低位部分等于它本身。 比如25的平方是625，低位部分是25，因此25是一个守形数。 编一个程序，判断N是否为守形数。
输入描述:
输入包括1个整数N，2<=N<100。
输出描述:
可能有多组测试数据，对于每组数据，
输出"Yes!”表示N是守形数。
输出"No!”表示N不是守形数。
示例1
输入
25
4
输出
Yes!
No!

50.Main050
题目描述
输入一个整数n(2<=n<=10000)，要求输出所有从1到这个整数之间(不包括1和这个整数)个位为1的素数，如果没有则输出-1。
输入描述:
输入有多组数据。
每组一行，输入n。
输出描述:
输出所有从1到这个整数之间(不包括1和这个整数)个位为1的素数(素数之间用空格隔开，最后一个素数后面没有空格)，如果没有则输出-1。
示例1
输入
100
输出
11 31 41 61 71

51.Main051
题目描述
设a、b、c 均是0 到9 之间的数字，abc、bcc 是两个三位数，且有：abc+bcc=532。求满足条件的所有a、b、c 的值。
输入描述:
无。
输出描述:
每行输出3个数，分别表示abc的值，用一个空格隔开。

52.Main052
题目描述
编一个程序，读入用户输入的，以“.”结尾的一行文字，统计一共有多少个单词，并分别输出每个单词含有多少个字符。 （凡是以一个或多个空格隔开的部分就为一个单词）
输入描述:
输入包括1行字符串，以“.”结束，字符串中包含多个单词，单词之间以一个或多个空格隔开。
输出描述:
可能有多组测试数据，对于每组数据，
输出字符串中每个单词包含的字母的个数。
示例1
输入
hello how are you.
输出
5 3 3 3

53.Main053
题目描述
第一行输入一个数，为n，第二行输入n个数，这n个数中，如果偶数比奇数多，输出NO，否则输出YES。
输入描述:
输入有多组数据。
每组输入n，然后输入n个整数（1<=n<=1000）。
输出描述:
如果偶数比奇数多，输出NO，否则输出YES。
示例1
输入
5
1 5 2 4 3
输出
YES

54.Main054
题目描述
对N个长度最长可达到1000的数进行排序。
输入描述:
输入第一行为一个整数N，(1<=N<=100)。
接下来的N行每行有一个数，数的长度范围为1<=len<=1000。
每个数都是一个正数，并且保证不包含前缀零。
输出描述:
可能有多组测试数据，对于每组数据，将给出的N个数从小到大进行排序，输出排序后的结果，每个数占一行。
示例1
输入
3
11111111111111111111111111111
2222222222222222222222222222222222
33333333
输出
33333333
11111111111111111111111111111
2222222222222222222222222222222222

55.Main055
题目描述
输入一个数n，然后输入n个数值各不相同，再输入一个值x，输出这个值在这个数组中的下标（从0开始，若不在数组中则输出-1）。
输入描述:
测试数据有多组，输入n(1<=n<=200)，接着输入n个数，然后输入x。
输出描述:
对于每组输入,请输出结果。
示例1
输入
2
1 3
0
输出
-1
