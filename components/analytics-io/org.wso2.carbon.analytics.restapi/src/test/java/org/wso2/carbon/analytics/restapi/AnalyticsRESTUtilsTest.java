/**
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.analytics.restapi;


import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The Class AnalyticsRESTUtilsTest represents the test cases for {@link Utils}. DTO class conversions 
 * are not tested here
 */
public class AnalyticsRESTUtilsTest {
	
	@Test(description="This method tests if the Utils.getCompleteErrorMessage works properly without the Cause.")
	public void testGetCompleteErrorMessageWithoutCause(){
		Exception ex = new Exception("Message In Exception");
		String message = "Error Description";
		String completeErrorMsg = Utils.getCompleteErrorMessage(message, ex);
		Assert.assertEquals(completeErrorMsg, "Error Description. (Message In Exception)");
	}
	
	@Test(description="This method tests if the Utils.getCompleteErrorMessage works properly.")
	public void testGetCompleteErrorMessageWithCause(){
		Exception ex = new Exception(new Throwable("Message In Exception"));
		String message = "Error Description";
		String completeErrorMsg = Utils.getCompleteErrorMessage(message, ex);
		Assert.assertEquals(completeErrorMsg, "Error Description. (Message In Exception)");
		
	}
}
