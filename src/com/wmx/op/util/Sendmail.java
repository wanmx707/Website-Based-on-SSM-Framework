package com.wmx.op.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @ClassName: Sendmail
 * @Description: 发送Email
 * @author: 孤傲苍狼
 * @date: 2015-1-12 下午9:42:56
 *
 */
public class Sendmail {
	public int sendMail(String email) throws Exception {
		Properties pr = new Properties();
		pr.setProperty("mail.host", "smtp.163.com");
		pr.setProperty("mail.transport.protocol", "smtp");
		pr.setProperty("mail.smtp.auth", "true");
		// 如果设置,指定实现javax.net.SocketFactory接口的类的名称,这个类将被用于创建SMTP的套接字。
		pr.setProperty("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		// 如果设置为true,未能创建一个套接字使用指定的套接字工厂类将导致使用java.net.Socket创建的套接字类。默认值为true。
		pr.setProperty("mail.smtp.socketFactory.fallback", "false");
		// 指定的端口连接到在使用指定的套接字工厂。如果没有设置,将使用默认端口。
		pr.setProperty("mail.smtp.port", "465");
		pr.setProperty("mail.smtp.socketFactory.port", "465");
			
		// 使用JavaMail发送邮件的5个步骤
		// 1、创建session
		Session session = Session.getInstance(pr);
		// 开启Session的debug模式，这样就可以查看到程序发送Email的运行状态
		session.setDebug(true);
		// 2、通过session得到transport对象
		Transport ts = session.getTransport();
		// 3、使用邮箱的用户名和密码连上邮件服务器，发送邮件时，发件人需要提交邮箱的用户名和密码给smtp服务器，用户名和密码都通过验证之后才能够正常发送邮件给收件人。
		ts.connect("smtp.163.com", "13588041504@163.com", "wmx961006");
		// 4、创建邮件
		int x = (int) ((Math.random() * 9 + 1) * 1000);
		Message message = createSimpleMail(session, email, x);
		// 5、发送邮件
		ts.sendMessage(message, message.getAllRecipients());
		ts.close();
		return x;
	}

	/**
	 * @Method: createSimpleMail
	 * @Description: 创建一封只包含文本的邮件
	 * @Anthor:孤傲苍狼
	 *
	 * @param session
	 * @return
	 * @throws Exception
	 */
	public static MimeMessage createSimpleMail(Session session, String email,
			int x) throws Exception {
		// 创建邮件对象
		MimeMessage message = new MimeMessage(session);
		// 指明邮件的发件人
		message.setFrom(new InternetAddress("13588041504@163.com"));
		// 指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
		message.setRecipient(Message.RecipientType.TO, new InternetAddress(
				email));
		// 邮件的标题
		message.setSubject("欢迎来到海贼王分享网，");
		// 邮件的文本内容
		message.setContent("你的验证码为：" + x + "，请在30分钟内完成验证，以免验证码过期！！！",
				"text/html;charset=UTF-8");
		// 返回创建好的邮件对象
		return message;
	}
}