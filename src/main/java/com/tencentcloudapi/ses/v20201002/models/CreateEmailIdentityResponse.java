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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEmailIdentityResponse extends AbstractModel{

    /**
    * Verification type. The value is fixed to `DOMAIN`.
    */
    @SerializedName("IdentityType")
    @Expose
    private String IdentityType;

    /**
    * Verification passed or not.
    */
    @SerializedName("VerifiedForSendingStatus")
    @Expose
    private Boolean VerifiedForSendingStatus;

    /**
    * DNS information that needs to be configured.
    */
    @SerializedName("Attributes")
    @Expose
    private DNSAttributes [] Attributes;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Verification type. The value is fixed to `DOMAIN`. 
     * @return IdentityType Verification type. The value is fixed to `DOMAIN`.
     */
    public String getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set Verification type. The value is fixed to `DOMAIN`.
     * @param IdentityType Verification type. The value is fixed to `DOMAIN`.
     */
    public void setIdentityType(String IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get Verification passed or not. 
     * @return VerifiedForSendingStatus Verification passed or not.
     */
    public Boolean getVerifiedForSendingStatus() {
        return this.VerifiedForSendingStatus;
    }

    /**
     * Set Verification passed or not.
     * @param VerifiedForSendingStatus Verification passed or not.
     */
    public void setVerifiedForSendingStatus(Boolean VerifiedForSendingStatus) {
        this.VerifiedForSendingStatus = VerifiedForSendingStatus;
    }

    /**
     * Get DNS information that needs to be configured. 
     * @return Attributes DNS information that needs to be configured.
     */
    public DNSAttributes [] getAttributes() {
        return this.Attributes;
    }

    /**
     * Set DNS information that needs to be configured.
     * @param Attributes DNS information that needs to be configured.
     */
    public void setAttributes(DNSAttributes [] Attributes) {
        this.Attributes = Attributes;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "VerifiedForSendingStatus", this.VerifiedForSendingStatus);
        this.setParamArrayObj(map, prefix + "Attributes.", this.Attributes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

