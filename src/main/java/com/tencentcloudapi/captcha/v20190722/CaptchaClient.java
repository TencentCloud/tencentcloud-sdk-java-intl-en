/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.captcha.v20190722;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.captcha.v20190722.models.*;

public class CaptchaClient extends AbstractClient{
    private static String endpoint = "captcha.intl.tencentcloudapi.com";
    private static String service = "captcha";
    private static String version = "2019-07-22";

    public CaptchaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CaptchaClient(Credential credential, String region, ClientProfile profile) {
        super(CaptchaClient.endpoint, CaptchaClient.version, credential, region, profile);
    }

    /**
     *Create a captcha: You can create multiple Captcha based on different business needs. Each verification has different client types and security policies. The limit for new Captcha is 50.
     * @param req CreateCaptchaInfoInternationalRequest
     * @return CreateCaptchaInfoInternationalResponse
     * @throws TencentCloudSDKException
     */
    public CreateCaptchaInfoInternationalResponse CreateCaptchaInfoInternational(CreateCaptchaInfoInternationalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCaptchaInfoInternational", CreateCaptchaInfoInternationalResponse.class);
    }

    /**
     *Create an IP allowlist: You can create an IP allowlist based on different business needs.
     * @param req CreateIpWhiteListInternationalRequest
     * @return CreateIpWhiteListInternationalResponse
     * @throws TencentCloudSDKException
     */
    public CreateIpWhiteListInternationalResponse CreateIpWhiteListInternational(CreateIpWhiteListInternationalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIpWhiteListInternational", CreateIpWhiteListInternationalResponse.class);
    }

    /**
     *Delete an IP allowlist: You can delete an IP allowlist based on different business needs.
     * @param req DeleteIpWhiteListInternationalRequest
     * @return DeleteIpWhiteListInternationalResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIpWhiteListInternationalResponse DeleteIpWhiteListInternational(DeleteIpWhiteListInternationalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIpWhiteListInternational", DeleteIpWhiteListInternationalResponse.class);
    }

    /**
     *Query the Captcha list to obtain all verification CaptchaAppIds, verification names, and other information internationally.
     * @param req DescribeCaptchaInfoListInternationalRequest
     * @return DescribeCaptchaInfoListInternationalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaInfoListInternationalResponse DescribeCaptchaInfoListInternational(DescribeCaptchaInfoListInternationalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCaptchaInfoListInternational", DescribeCaptchaInfoListInternationalResponse.class);
    }

    /**
     *This API is used to check the ticket results of verification codes for Web and APP.
     * @param req DescribeCaptchaResultRequest
     * @return DescribeCaptchaResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCaptchaResultResponse DescribeCaptchaResult(DescribeCaptchaResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCaptchaResult", DescribeCaptchaResultResponse.class);
    }

    /**
     *IP allowlist list: You can query the IP whitelist list based on different business needs.
     * @param req DescribeIpWhiteListInternationalRequest
     * @return DescribeIpWhiteListInternationalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpWhiteListInternationalResponse DescribeIpWhiteListInternational(DescribeIpWhiteListInternationalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpWhiteListInternational", DescribeIpWhiteListInternationalResponse.class);
    }

    /**
     *Change the captcha configuration, including basic, appearance, and security settings such as captcha name, prompt language, and validation type.
     * @param req ModifyCaptchaInfoInternationalRequest
     * @return ModifyCaptchaInfoInternationalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCaptchaInfoInternationalResponse ModifyCaptchaInfoInternational(ModifyCaptchaInfoInternationalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCaptchaInfoInternational", ModifyCaptchaInfoInternationalResponse.class);
    }

    /**
     *Edit IP allowlist: You can edit the IP allowlist based on different business needs.
     * @param req ModifyIpWhiteListInternationalRequest
     * @return ModifyIpWhiteListInternationalResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpWhiteListInternationalResponse ModifyIpWhiteListInternational(ModifyIpWhiteListInternationalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIpWhiteListInternational", ModifyIpWhiteListInternationalResponse.class);
    }

    /**
     *Delete a captcha: once deleted, verification scenarios using this CaptchaAppId will fail to load the verification code on the frontend, and invoice verification will report an error on the backend. Proceed with caution.
     * @param req RemoveCaptchaInfoInternationalRequest
     * @return RemoveCaptchaInfoInternationalResponse
     * @throws TencentCloudSDKException
     */
    public RemoveCaptchaInfoInternationalResponse RemoveCaptchaInfoInternational(RemoveCaptchaInfoInternationalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveCaptchaInfoInternational", RemoveCaptchaInfoInternationalResponse.class);
    }

}
