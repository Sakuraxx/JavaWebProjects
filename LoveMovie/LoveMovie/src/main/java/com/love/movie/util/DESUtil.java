package com.love.movie.util;

import java.security.SecureRandom;
import java.util.Date;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class DESUtil {
	private final static String HEX = "0123456789abcdef";

	private static void appendHex(StringBuffer sb, byte b) {
		sb.append(HEX.charAt((b >> 4) & 0x0f)).append(HEX.charAt(b & 0x0f));
	}

	/**
	 * 解密
	 * 
	 * @param raw       key
	 * @param encrypted 加密后的字节
	 * @return 返回解密后的字节
	 * @throws Exception
	 */
	private static byte[] decrypt(byte[] raw, byte[] encrypted) throws Exception {
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, skeySpec);
		byte[] decrypted = cipher.doFinal(encrypted);
		return decrypted;
	}

	/**
	 * 解密
	 * 
	 * @param seed      key
	 * @param encrypted 加密的字符
	 * @return 返回解密的字符
	 * @throws Exception
	 */
	public static String decrypt(String seed, String encrypted) throws Exception {
		byte[] rawKey = getRawKey(seed.getBytes());
		byte[] enc = toByte(encrypted);
		byte[] result = decrypt(rawKey, enc);
		return new String(result);
	}

	/**
	 * 加密
	 * 
	 * @param raw   key
	 * @param clear
	 * @return
	 * @throws Exception
	 */
	private static byte[] encrypt(byte[] raw, byte[] clear) throws Exception {
		SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
		byte[] encrypted = cipher.doFinal(clear);
		return encrypted;
	}

	/**
	 * 加密
	 * 
	 * @param seed      key
	 * @param cleartext 需要加密的字符串
	 * @return 返回加密的字符
	 * @throws Exception
	 */
	public static String encrypt(String seed, String cleartext) throws Exception {
		byte[] rawKey = getRawKey(seed.getBytes());
		byte[] result = encrypt(rawKey, cleartext.getBytes());
		return toHex(result);
	}

	public static String fromHex(String hex) {
		return new String(toByte(hex));
	}

	/**
	 * key 加密
	 * 
	 * @param seed
	 * @return
	 * @throws Exception
	 */
	private static byte[] getRawKey(byte[] seed) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		sr.setSeed(seed);
		kgen.init(128, sr); // 192 and 256 bits may not be available
		SecretKey skey = kgen.generateKey();
		byte[] raw = skey.getEncoded();
		return raw;
	}

	/**
	 * to byte
	 * 
	 * @param hexString
	 * @return
	 */
	public static byte[] toByte(String hexString) {
		int len = hexString.length() / 2;
		byte[] result = new byte[len];
		for (int i = 0; i < len; i++)
			result[i] = Integer.valueOf(hexString.substring(2 * i, 2 * i + 2), 16).byteValue();
		return result;
	}

	/**
	 * 转为为16进制
	 * 
	 * @param buf 需要转化的byte
	 * @return 返回转化后的字符串
	 */
	public static String toHex(byte[] buf) {
		if (buf == null)
			return "";
		StringBuffer result = new StringBuffer(2 * buf.length);
		for (int i = 0; i < buf.length; i++) {
			appendHex(result, buf[i]);
		}
		return result.toString();
	}

	/**
	 * 转为为16进制
	 * 
	 * @param buf 需要转化的byte
	 * @return 返回转化后的字符串
	 */
	public static String toHex(String txt) {
		return toHex(txt.getBytes());
	}

	public static void main(String[] args) throws Exception {
		String seed = "LOVEMOIVE"; // key
		
		Date date = new Date();
        long time = date.getTime();
    	String plainText = "" + time +"@"+"1432531621@qq.com";
    	
		System.out.println("seed---" + seed + "\ncleartext---" + plainText);
		String c = DESUtil.encrypt(seed, plainText);
		
		
		System.out.println("加密后---" + c);
		String p = DESUtil.decrypt(seed, c);
		System.out.println("解密后---" + p);
	}
}