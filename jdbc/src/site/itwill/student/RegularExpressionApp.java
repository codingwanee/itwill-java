package site.itwill.student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Á¤±ÔÇ¥Çö½Ä(Regular Expression) : ¸ŞÅ¸¹®ÀÚ¸¦ ÀÌ¿ëÇÏ¿© ÀÏÁ¤ÇÑ ±ÔÄ¢ÀÇ ¹®ÀÚ¿­ Ç¥Çö
/*
^¹®ÀÚ¿­ : ¹®ÀÚ¿­·Î ½ÃÀÛµÊÀ» ÀÇ¹Ì
¹®ÀÚ¿­$ : ¹®ÀÚ¿­·Î Á¾·áµÊÀ» ÀÇ¹Ì
. : ÀÓÀÇÀÇ ÇÑ ¹®ÀÚ¸¦ ÀÇ¹Ì(\ ¹®ÀÚ´Â Ç¥Çö ºÒ°¡´É)
[¹®ÀÚ1¹®ÀÚ2¹®ÀÚ3] : ³ª¿­µÈ ¹®ÀÚµé Áß ÇÏ³ª¸¦ ÀÇ¹Ì
[^¹®ÀÚ1¹®ÀÚ2¹®ÀÚ3] : ³ª¿­µÈ ¹®ÀÚµéÀÌ ¾Æ´Ñ °Í Áß ÇÏ³ª¸¦ ÀÇ¹Ì
[¹®ÀÚ1-¹®ÀÚ2] : ¹®ÀÚ1ºÎÅÍ ¹®ÀÚ2±îÁöÀÇ ¹üÀ§ ¹®ÀÚ Áß ÇÏ³ª¸¦ ÀÇ¹Ì
(¹®ÀÚ¿­1|¹®ÀÚ¿­2) : ³ª¿­µÈ ¹®ÀÚ¿­µé Áß ÇÏ³ª¸¦ ÀÇ¹Ì
¹®ÀÚ¿­+ : ¹®ÀÚ¿­ÀÌ 1¹øÀÌ»ó ¹İº¹µÊÀ» ÀÇ¹Ì
¹®ÀÚ¿­* : ¹®ÀÚ¿­ÀÌ 0¹øÀÌ»ó ¹İº¹µÊÀ» ÀÇ¹Ì
¹®ÀÚ¿­? : ¹®ÀÚ¿­ÀÌ 0¹ø ¶Ç´Â 1¹øÀÌ Á¸ÀçÇÔÀ» ÀÇ¹Ì
¹®ÀÚ¿­{¼ıÀÚ} : ¹®ÀÚ¿­ÀÇ ¹İº¹È½¼ö°¡ ¼ıÀÚ¸¸Å­À» ÀÇ¹Ì
¹®ÀÚ¿­{¼ıÀÚ1,¼ıÀÚ2} : ¹®ÀÚ¿­ÀÇ ¹İº¹È½¼ö°¡ ¼ıÀÚ1ºÎÅÍ ¼ıÀÚ2±îÁö¸¦ ÀÇ¹Ì

\s : °ø¹éÀÌ Á¸ÀçÇÏ´Â ¹®ÀÚ¿­À» ÀÇ¹Ì
\S : °ø¹éÀÌ Á¸ÀçÇÏÁö ¾Ê´Â ¹®ÀÚ¿­À» ÀÇ¹Ì
\w : ¾ËÆÄºª ¶Ç´Â ¼ıÀÚ, _ ¹®ÀÚ·Î¸¸ Ç¥ÇöµÇ´Â ¹®ÀÚ¿­À» ÀÇ¹Ì
\W : ¾ËÆÄºª ¶Ç´Â ¼ıÀÚ, _¸¦ Á¦¿ÜÇÑ ¹®ÀÚ·Î Ç¥ÇöµÇ´Â ¹®ÀÚ¿­À» ÀÇ¹Ì
\d : ¼ıÀÚÇüÅÂÀÇ ¹®ÀÚ·Î¸¸ Ç¥ÇöµÇ´Â ¹®ÀÚ¿­À» ÀÇ¹Ì
\D : ¼ıÀÚ¸¦ Á¦¿ÜÇÑ ¹®ÀÚ·Î¸¸ Ç¥ÇöµÇ´Â ¹®ÀÚ¿­À» ÀÇ¹Ì
\¸ŞÅ¸¹®ÀÚ : ¸ŞÅ¸¹®ÀÚ¸¦ ¹®ÀÚ·Î Ç¥Çö(Escape Character)

(?!)¹®ÀÚ¿­ : ¹®ÀÚ¿­¿¡¼­ ´ë¼Ò¹®ÀÚ¸¦ ±¸ºĞÇÏÁö ¾ÊÀ½À» ÀÇ¹Ì
(?=¹®ÀÚ¿­) : ¹®ÀÚ¿­À» Æ÷ÇÔÇÏ°í ÀÖÀ½À» ÀÇ¹Ì
(?!¹®ÀÚ¿­) : ¹®ÀÚ¿­À» Æ÷ÇÔÇÏ°í ÀÖÁö ¾ÊÀ½ ÀÇ¹Ì
*/

//Å°º¸µå·Î ¹®ÀÚ¿­À» ÀÔ·Â¹Ş¾Æ Á¤±ÔÇ¥Çö½ÄÀ¸·Î À¯È¿¼º °Ë»ç ÈÄ °á°ú¸¦ Ãâ·ÂÇÏ´Â ÇÁ·Î±×·¥
public class RegularExpressionApp {
	public static void main(String[] args) throws Exception {
		//Å°º¸µå·Î ¹®ÀÚ¿­À» ÀÔ·Â¹Ş±â À§ÇÑ ÀÔ·Â½ºÆ®¸² »ı¼º
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		/*
		//Å°º¸µå·Î ¾ÆÀÌµğ¸¦ ÀÔ·Â¹Ş¾Æ ÀÔ·Â°ª¿¡ ´ëÇÑ À¯È¿¼º °Ë»ç
		// => ¿µ¹®ÀÚ·Î ½ÃÀÛµÇ¸ç ¿µ¹®ÀÚ,¼ıÀÚ,_ÀÇ Á¶ÇÕÀ¸·Î 6~20 ¹üÀ§ÀÇ ¹®ÀÚ·Î Ç¥Çö
		System.out.print("¾ÆÀÌµğ ÀÔ·Â >> ");
		String id=br.readLine();
		
		//Pattern Å¬·¡½º : Á¤±ÔÇ¥Çö½ÄÀ» ÀúÀåÇÏ±â À§ÇÑ Å¬·¡½º
		//Pattern.compile(String regex) : ¹®ÀÚ¿­À» Àü´Ş¹Ş¾Æ Pattern 
		//ÀÎ½ºÅÏ½º¿¡ Á¤±ÔÇ¥Çö½ÄÀ¸·Î º¯È¯ ÀúÀåÇÏ¿©  ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå
		//Pattern idPattern=Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{5,19}");
		Pattern idPattern=Pattern.compile("^[a-zA-Z]\\w{5,19}");
		
		//Pattern.matcher(String input) : ¹®ÀÚ¿­À» Àü´Ş¹Ş¾Æ Pattern ÀÎ½ºÅÏ½ºÀÇ 
		//Á¤±ÔÇ¥Çö½Ä°ú ºñ±³ÇÏ±â À§ÇÑ Matcher ÀÎ½ºÅÏ½º¸¦ ¹İÈ¯¹ŞÀº ¸Ş¼Òµå
		//Matcher Å¬·¡½º : Á¤±ÔÇ¥Çö½Ä°ú ¹®ÀÚ¿­À» ºñ±³ÇÏ±â À§ÇÑ ±â´ÉÀ» Á¦°øÇÏ´Â Å¬·¡½º 
		Matcher idMatcher=idPattern.matcher(id);
		//Matcher.matches() : Á¤±ÔÇ¥Çö½Ä°ú ¹®ÀÚ¿­À» ÀüÃ¼ ºñ±³ÇÏ¿© Çü½ÄÀÌ
		//´Ù¸¥ °æ¿ì false, °°Àº °æ¿ì true ¹İÈ¯ÇÏ´Â ¸Ş¼Òµå 
		if(idMatcher.matches()) {
			System.out.println("[°á°ú]¿Ã¹Ù¸¥ Çü½ÄÀÇ ¾ÆÀÌµğ¸¦ ÀÔ·Â ÇÏ¿´½À´Ï´Ù.");
		} else {
			System.out.println("[°á°ú]Àß¸øµÈ Çü½ÄÀÇ ¾ÆÀÌµğ¸¦ ÀÔ·Â ÇÏ¿´½À´Ï´Ù.");
		}
		*/
		
		/*
		//Å°º¸µå·Î ºñ¹Ğ¹øÈ£¸¦ ÀÔ·Â¹Ş¾Æ ÀÔ·Â°ª¿¡ ´ëÇÑ À¯È¿¼º °Ë»ç
		// => ¿µ¹®ÀÚ,¼ıÀÚ,Æ¯¼ö¹®ÀÚ¸¦ ¹İµå½Ã 1°³ÀÌ»ó Æ÷ÇÔÇÏ¿© ÀÔ·ÂÇÏ¸ç 8~30 ¹üÀ§ÀÇ ¹®ÀÚ Ç¥Çö 
		System.out.print("ºñ¹Ğ¹øÈ£ ÀÔ·Â >> ");
		String passwd=br.readLine();
		
		Pattern passwdPattern=Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_-]).{8,30}");
		Matcher passwdMatcher=passwdPattern.matcher(passwd);
		if(passwdMatcher.matches()) {
			System.out.println("[°á°ú]¿Ã¹Ù¸¥ Çü½ÄÀÇ ºñ¹Ğ¹øÈ£¸¦ ÀÔ·Â ÇÏ¿´½À´Ï´Ù.");
		} else {
			System.out.println("[°á°ú]Àß¸øµÈ Çü½ÄÀÇ ºñ¹Ğ¹øÈ£¸¦ ÀÔ·Â ÇÏ¿´½À´Ï´Ù.");
		}
		*/
		
		/*
		//Å°º¸µå·Î ÀÌ¸§À» ÀÔ·Â¹Ş¾Æ ÀÔ·Â°ª¿¡ ´ëÇÑ À¯È¿¼º °Ë»ç
		// => ÇÑ±Û¸¸ ÀÔ·Â °¡´ÉÇÏ¸ç 2~5 ¹üÀ§ÀÇ ¹®ÀÚ Ç¥Çö 
		System.out.print("ÀÌ¸§ ÀÔ·Â >> ");
		String name=br.readLine();
		
		Pattern namePattern=Pattern.compile("^[°¡-ÆR]{2,5}$");
		Matcher nameMatcher=namePattern.matcher(name);
		if(nameMatcher.matches()) {
			System.out.println("[°á°ú]¿Ã¹Ù¸¥ Çü½ÄÀÇ ÀÌ¸§À» ÀÔ·Â ÇÏ¿´½À´Ï´Ù.");
		} else {
			System.out.println("[°á°ú]Àß¸øµÈ Çü½ÄÀÇ ÀÌ¸§À» ÀÔ·Â ÇÏ¿´½À´Ï´Ù.");
		}
		*/
		
		//Å°º¸µå·Î ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ ÀÔ·Â°ª¿¡ ´ëÇÑ À¯È¿¼º °Ë»ç
		// => [¾ÆÀÌµğ@µµ¸ŞÀÎ] Çü½ÄÀÇ ¹®ÀÚ¿­ 
		System.out.print("ÀÌ¸ŞÀÏ ÀÔ·Â >> ");
		String email=br.readLine();
		
		Pattern emailPattern=Pattern.compile("^([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+(\\.[a-zA-Z0-9-]+)+)*$");
		Matcher emailMatcher=emailPattern.matcher(email);
		if(emailMatcher.matches()) {
			System.out.println("[°á°ú]¿Ã¹Ù¸¥ Çü½ÄÀÇ ÀÌ¸ŞÀÏÀ» ÀÔ·Â ÇÏ¿´½À´Ï´Ù.");
		} else {
			System.out.println("[°á°ú]Àß¸øµÈ Çü½ÄÀÇ ÀÌ¸ŞÀÏÀ» ÀÔ·Â ÇÏ¿´½À´Ï´Ù.");
		}
	}
}
