```JAVA
JAVA������ʽ,matcher.find()�� matcher.matches()������
1.find()�����ǲ���ƥ�䣬�ǲ������봮����ģʽƥ����Ӵ��������ƥ��Ĵ����黹����ʹ��group()������

matches()��ȫ��ƥ�䣬�ǽ��������봮��ģʽƥ�䣬���Ҫ��֤һ������������Ƿ�Ϊ�������ͻ��������ͣ�һ��Ҫ��matches()��

 

2.Pattern pattern= Pattern.compile(".*?,(.*)");

    Matcher matcher = pattern.matcher(result);

  if (matcher.find()) {
   return matcher.group(1);
  }

 

3.��⣺

matches
public static boolean matches(String regex,  CharSequence input)

�������������ʽ�����Խ�������������ƥ�䡣  
���ô˱�ݷ�������ʽ  
Pattern.matches(regex, input);
Pattern.compile(regex).matcher(input).matches() ; 
���Ҫ���ʹ��һ��ģʽ������һ�κ����ô�ģʽ��ÿ�ζ����ô˷���Ч�ʸ��ߡ�
������
regex - Ҫ����ı��ʽ
input - Ҫƥ����ַ�����  
�׳���  
PatternSyntaxException - ������ʽ���﷨��Ч

find
public boolean find()���Բ������ģʽƥ����������е���һ�������С�  
�˷�����ƥ��������Ŀ�ͷ��ʼ������÷�����ǰһ�ε��óɹ��˲��Ҵ���ʱ��ʼƥ����û�б����ã������ǰƥ�����û��ƥ��ĵ�һ���ַ���ʼ��  
���ƥ��ɹ��������ͨ�� start��end �� group ������ȡ������Ϣ��  

matcher.start() ����ƥ�䵽�����ַ������ַ����е�����λ��. 
matcher.end()����ƥ�䵽�����ַ��������һ���ַ����ַ����е�����λ��. 
matcher.group()����ƥ�䵽�����ַ��� 
���أ�
���ҽ����������е�������ƥ���ƥ������ģʽʱ�ŷ��� true��


4.����JAVA������ʽʵ��

   ���ַ�ƥ�� 
   Pattern p = Pattern.compile(expression); // ������ʽ 
   Matcher m = p.matcher(str); // �������ַ��� 
   boolean b = m.matches(); //�����Ƿ�ƥ��Ľ�� 
   System.out.println(b); 

   Pattern p = Pattern.compile(expression); // ������ʽ 
   Matcher m = p.matcher(str); // �������ַ��� 
   boolean b = m. lookingAt (); //�����Ƿ�ƥ��Ľ�� 
   System.out.println(b); 

   Pattern p = Pattern.compile(expression); // ������ʽ 
   Matcher m = p.matcher(str); // �������ַ��� 
   boolean b = m..find (); //�����Ƿ�ƥ��Ľ�� 
   System.out.println(b); 


�ڷָ��ַ��� 
Pattern pattern = Pattern.compile(expression); //������ʽ 
                     String[] strs = pattern.split(str); //�����ַ��� �õ����ص��ַ������� 

���滻�ַ��� 
   Pattern p = Pattern.compile(expression); // ������ʽ 
   Matcher m = p.matcher(text); // �������ַ��� 
   String s = m.replaceAll(str); //�滻����ַ��� 

�ܲ����滻ָ���ַ��� 
Pattern p = Pattern.compile(expression); // ������ʽ 
   Matcher m = p.matcher(text); // �������ַ��� 
   StringBuffer sb = new StringBuffer(); 
   int i = 0; 
   while (m.find()) { 
    m.appendReplacement(sb, str); 
    i++;    //�ַ������ִ��� 
   } 
   m.appendTail(sb);//�ӽ�ȡ�㽫������ַ������� 
String s = sb.toString(); 
�ݲ�������ַ��� 
Pattern p = Pattern.compile(expression); // ������ʽ 
   Matcher m = p.matcher(text); // �������ַ��� 
   while (m.find()) { 
matcher.start() ;
matcher.end();
matcher.group(1);
  }
```