package com.web.web.controller;

//import com.web.web.models.UserEntity;
//import com.web.web.services.UserService;
//import com.web.web.services.impl.UserImplement;
//import com.web.web.services.impl.userNotFoundException;
//import io.lettuce.core.dynamic.annotation.Param;
//import jakarta.mail.MessagingException;
//import jakarta.mail.internet.MimeMessage;
//import jakarta.servlet.http.HttpServletRequest;
//import net.bytebuddy.utility.RandomString;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;

import java.io.UnsupportedEncodingException;

//@Controller
public class ForgotPasswordController {
//    @Autowired
//    private UserImplement userImplement;
//    @Autowired
//    private JavaMailSender mailSender;
//
//    @GetMapping("/forgot_password")
//    public String forgotPasswordForm() {
//        return "forgot-password";
//    }
//
//    @PostMapping("/forgot_password")
//    public String forgotPasswordProcess(HttpServletRequest request, Model model) {
//        String email = request.getParameter("email");
//        String token = RandomString.make(30);
//        //create a random string with length 30 which is specified in database
//        try {
//            userImplement.updateResetPasswordToken(token, email);
//            String resetPasswordLink = Utility.getSiteURL(request) + "/reset_password?token=" + token;
//            //generate reset password link
//            //send email
//            sendEmail(email, resetPasswordLink);
//            model.addAttribute("message", "We have send you a reset password link to your email!");
//        } catch (userNotFoundException e) {
//            model.addAttribute("error", e.getMessage());
//        } catch (MessagingException | UnsupportedEncodingException e) {
//            model.addAttribute("error", "Error while sending email!");
//        }
//        model.addAttribute("pageTitle", "Forgot Password");
//        return "forgot-password";
//    }
//
//    private void sendEmail(String email, String resetPasswordLink) throws MessagingException, UnsupportedEncodingException {
//        //MimeMail: sending email messages using the JavaMail API
//        MimeMessage message = mailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message);
//        helper.setFrom("contact@animeclub.com", "Anime Club support");
//        helper.setTo(email);
//        String subject = "Here's the link to reset your password";
//        String content = "<p>Hello,</p>"
//                + "<p>You have requested to reset your password</p>"
//                + "<p>Click the link under to reset your password</p>"
//                + "<p><a href=\"" + resetPasswordLink + "\">RESET YOUR PASSWORD HERE</a><br></p>"
//                + "<p>Ignore this mail if you remember your password</p>";
//        helper.setSubject(subject);
//        helper.setText(content, true);
//        mailSender.send(message);
//    }
//
//    @GetMapping("/reset_password")
//    public String showResetPassword(@Param(value = "token") String token, Model model) {
//        UserEntity user = userImplement.get(token);
//        if (user == null) {
//            model.addAttribute("title", "Reset your password");
//            model.addAttribute("message", "Invalid Token");
//            return "forgot-password-message";
//        }
//        model.addAttribute("token", token);
//        model.addAttribute("pageTitle", "Reset Your Password");
//        return "reset_password";
//    }
//    @PostMapping("/reset_password")
//    public String processResetPassword(HttpServletRequest request, Model model) {
//        String token = request.getParameter("token");
//        String password = request.getParameter("password");
//
//        UserEntity user = userImplement.get(token);
//        model.addAttribute("title", "Reset your password");
//
//        if (user == null) {
//            model.addAttribute("message", "Invalid Token");
//            return "forgot-password-message";
//        } else {
//            userImplement.updatePassword(user, password);
//            model.addAttribute("message", "You have successfully changed your password.");
//        }
//
//        return "forgot-password-message";
//    }
}
