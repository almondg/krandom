# KRandom
Java Random Utils for Testing.

# Usage
## Import:
<p><code>import org.kedos.KRandom;</code></p>
or
<p><code>import static org.kedos.KRandom.*;</code></p>

## Methods:
<p><code>
int even = KRandom.nextEvenInt();
</code></p>

<p><code>
String babyTalk = KRandom.nextAlphabeticString(n);
</code></p>

<p><code>
int[][] matrix = KRandom.next2DIntArray(n, m);
</code></p>

<p><code>
boolean[][] karnaughMap = KRandom.next2DBooleanArray(n, m);
</code></p>

# Print Utils
## Import:
<p><code>import org.kedos.PrintUtils;</code></p>
or
<p><code>import static org.kedos.PrintUtils.*;</code></p>

## Methods:
<p><code>
PrintUtils.print2DArray(matrix);
[8, 1, 8, 9]
[0, 9, 6, 2]
[5, 7, 0, 4]
[8, 3, 9, 6]
</code></p>
