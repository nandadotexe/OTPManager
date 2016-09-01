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
package com.gslab.test.otp.impl;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * This is utility class used to do all JAXB serialization to/from disk. Please
 * use this whenever you need to read/write all configuration classes from/to
 * disk. It also requires that all JAXB serializeable classes are included into
 * jaxb.index.
 * 
 * @author abdul.waheed@gslab.com (Abdul Waheed)
 * 
 */
public class JAXBUtil {

	private static JAXBContext context;

	private static Marshaller marshaller;
	private static Unmarshaller unmarshaller;

	private static JAXBContext getContext() throws JAXBException {
		if (context == null) {
			context = JAXBContext.newInstance(JAXBUtil.class.getPackage()
					.getName());
		}
		return context;

	}

	public static Marshaller getMarshaller() throws JAXBException {
		if (marshaller == null) {
			marshaller = getContext().createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		}
		return marshaller;
	}

	public static Unmarshaller getUnmarshaller() throws JAXBException {
		if (unmarshaller == null) {
			unmarshaller = getContext().createUnmarshaller();
		}
		return unmarshaller;

	}

}
