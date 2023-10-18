/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthenticateDomainOwnerResponse extends AbstractModel {

    /**
    * The content verified.
If `VerifyType` is `dnsCheck`, this is the TXT record that should be added for verification.
If `VerifyType` is `fileCheck`, this is the file that should be uploaded for verification.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * The verification status.
If the value of this parameter is 0 or greater, the domain has been verified.
If the value of this parameter is smaller than 0, the domain has not been verified.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The primary domain of the domain verified.
Verification is not required if another domain under the same primary domain has been successfully verified.
    */
    @SerializedName("MainDomain")
    @Expose
    private String MainDomain;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The content verified.
If `VerifyType` is `dnsCheck`, this is the TXT record that should be added for verification.
If `VerifyType` is `fileCheck`, this is the file that should be uploaded for verification. 
     * @return Content The content verified.
If `VerifyType` is `dnsCheck`, this is the TXT record that should be added for verification.
If `VerifyType` is `fileCheck`, this is the file that should be uploaded for verification.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set The content verified.
If `VerifyType` is `dnsCheck`, this is the TXT record that should be added for verification.
If `VerifyType` is `fileCheck`, this is the file that should be uploaded for verification.
     * @param Content The content verified.
If `VerifyType` is `dnsCheck`, this is the TXT record that should be added for verification.
If `VerifyType` is `fileCheck`, this is the file that should be uploaded for verification.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get The verification status.
If the value of this parameter is 0 or greater, the domain has been verified.
If the value of this parameter is smaller than 0, the domain has not been verified. 
     * @return Status The verification status.
If the value of this parameter is 0 or greater, the domain has been verified.
If the value of this parameter is smaller than 0, the domain has not been verified.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The verification status.
If the value of this parameter is 0 or greater, the domain has been verified.
If the value of this parameter is smaller than 0, the domain has not been verified.
     * @param Status The verification status.
If the value of this parameter is 0 or greater, the domain has been verified.
If the value of this parameter is smaller than 0, the domain has not been verified.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The primary domain of the domain verified.
Verification is not required if another domain under the same primary domain has been successfully verified. 
     * @return MainDomain The primary domain of the domain verified.
Verification is not required if another domain under the same primary domain has been successfully verified.
     */
    public String getMainDomain() {
        return this.MainDomain;
    }

    /**
     * Set The primary domain of the domain verified.
Verification is not required if another domain under the same primary domain has been successfully verified.
     * @param MainDomain The primary domain of the domain verified.
Verification is not required if another domain under the same primary domain has been successfully verified.
     */
    public void setMainDomain(String MainDomain) {
        this.MainDomain = MainDomain;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public AuthenticateDomainOwnerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthenticateDomainOwnerResponse(AuthenticateDomainOwnerResponse source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MainDomain != null) {
            this.MainDomain = new String(source.MainDomain);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MainDomain", this.MainDomain);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

