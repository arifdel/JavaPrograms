import java.io.*;
import static java.io.StreamTokenizer.TT_EOF;
import static java.io.StreamTokenizer.TT_NUMBER;
import static java.io.StreamTokenizer.TT_WORD;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StreamTokenizerEx
{
public static void main(String[] args)throws IOException
{
String str="This is a test 200, which is simple 50";
StringReader sr=new StringReader(str);
StreamTokenizer st=new StreamTokenizer(sr);
try
{
while(st.nextToken()!=TT_EOF)
{
switch(st.ttype)
{
case TT_WORD: /*a word has been read*/
System.out.println("String value"+st.sval);
break;
case TT_NUMBER: /*a number has been read*/
System.out.println("number value"+st.nval);
break;
}
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}
