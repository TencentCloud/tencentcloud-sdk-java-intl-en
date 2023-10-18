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

public class AuthenticateDomainOwnerRequest extends AbstractModel {

    /**
    * The domain to verify.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * The verification type. Valid values:
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been successfully verified.
    */
    @SerializedName("VerifyType")
    @Expose
    private String VerifyType;

    /**
     * Get The domain to verify. 
     * @return DomainName The domain to verify.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The domain to verify.
     * @param DomainName The domain to verify.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get The verification type. Valid values:
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been successfully verified. 
     * @return VerifyType The verification type. Valid values:
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been successfully verified.
     */
    public String getVerifyType() {
        return this.VerifyType;
    }

    /**
     * Set The verification type. Valid values:
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been successfully verified.
     * @param VerifyType The verification type. Valid values:
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been successfully verified.
     */
    public void setVerifyType(String VerifyType) {
        this.VerifyType = VerifyType;
    }

    public AuthenticateDomainOwnerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthenticateDomainOwnerRequest(AuthenticateDomainOwnerRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.VerifyType != null) {
            this.VerifyType = new String(source.VerifyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "VerifyType", this.VerifyType);

    }
}

