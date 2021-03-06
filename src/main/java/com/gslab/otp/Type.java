/*
 * Copyright (c) 2016, Great Software Laboratory Private Limited.
 *  All rights reserved.
 *
 * Contributor: Abdul Waheed [abdul.waheed@gslab.com]
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *  
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of the "Great Software Laboratory Private Limited" nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL <COPYRIGHT HOLDER> BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.gslab.otp;

/**
 * Represents the OTP type i.e. The type of key used for generating shared
 * secret. Valid types are HOTP (counter-based) and TOTP (time based).
 * 
 * @author abdul.waheed@gslab.com (Abdul Waheed)
 * @version 1.0
 * 
 */
public enum Type {
	/**
	 * HOTP : HMAC-Based One-Time Password Algorithm described in RFC 4226
	 * 
	 * @see <a
	 *      href="https://tools.ietf.org/html/rfc4226">HMAC-Based One-Time Password Algorithm</a>
	 */
	HOTP,

	/**
	 * TOTP: Time based one-time password algorithm described in RFC 6238
	 * 
	 * @see <a
	 *      href="https://tools.ietf.org/html/rfc6238">Time based one-time password algorithm</a>
	 * 
	 */
	TOTP
}
