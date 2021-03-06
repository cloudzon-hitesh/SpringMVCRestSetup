package com.cloudzon.huddle.service;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.security.core.userdetails.UserDetails;

import com.cloudzon.huddle.dto.AccessTokenContainer;
import com.cloudzon.huddle.dto.AccountVerificationToken;
import com.cloudzon.huddle.dto.ChangePasswordDto;
import com.cloudzon.huddle.dto.EmailVerificationRequest;
import com.cloudzon.huddle.dto.ForgotPasswordDto;
import com.cloudzon.huddle.dto.ResetPasswordDTO;
import com.cloudzon.huddle.dto.SignupUser;
import com.cloudzon.huddle.dto.UserLoginDto;

import freemarker.template.TemplateException;

public interface UserService {
	/**
	 * 
	 * @param loginDto
	 * @return
	 */
	public UserDetails login(UserLoginDto loginDto);

	/**
	 * 
	 * @param token
	 * @return
	 */
	public void logout(String token);

	/**
	 * 
	 * 
	 * @param forgotPasswordModel
	 * @return
	 * @throws IOException
	 * @throws TemplateException
	 * @throws MessagingException
	 */
	public void forgotPassword(ForgotPasswordDto forgotPasswordModel)
			throws IOException, TemplateException, MessagingException;

	/**
	 * 
	 * @param resetPasswordDto
	 * @return
	 */
	public void resetPassword(ResetPasswordDTO resetPasswordDto);

	/**
	 * signupUser
	 * 
	 * @param signupUser
	 * @return
	 * @throws MessagingException
	 * @throws TemplateException
	 * @throws IOException
	 * @throws DefaultRoleNotSetException
	 */
	public void signupUser(SignupUser signupUser) throws IOException,
			TemplateException, MessagingException;

	/**
	 * sendEmailVerificationToken send email verification token to user
	 * 
	 * @param emailVerificationRequest
	 * @return
	 * @throws IOException
	 * @throws TemplateException
	 * @throws MessagingException
	 */
	public void sendEmailVerificationToken(
			EmailVerificationRequest emailVerificationRequest)
			throws IOException, TemplateException, MessagingException;

	/**
	 * verifyUserAccount verify user send succes or fail message
	 * 
	 * @param accountVerificationToken
	 * @return
	 */
	public void verifyUserAccount(
			AccountVerificationToken accountVerificationToken);

	public AccessTokenContainer getAccessTokenContainer(UserDetails userDetails);

	public List<String> getUserRole(String userNameOrEmail);

	public void changePassword(ChangePasswordDto changePasswordDto,
			String userNameOrEmail);

}
