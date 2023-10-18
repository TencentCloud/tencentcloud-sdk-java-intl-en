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

public class AddLiveDomainRequest extends AbstractModel {

    /**
    * Domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Domain name type.
0: push domain name.
1: playback domain name.
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
    * Pull domain name type:
1: Mainland China.
2: global.
3: outside Mainland China.
Default value: 1.
    */
    @SerializedName("PlayType")
    @Expose
    private Long PlayType;

    /**
    * Whether it is LCB:
0: LVB,
1: LCB.
Default value: 0.
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
    * Whether it is LVB on Mini Program.
0: LVB.
1: LVB on Mini Program.
Default value: 0.
    */
    @SerializedName("IsMiniProgramLive")
    @Expose
    private Long IsMiniProgramLive;

    /**
    * The domain verification type.
Valid values (the value of this parameter must be the same as `VerifyType` of the `AuthenticateDomainOwner` API):
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been verified.
If you do not pass a value, `dbCheck` will be used.
    */
    @SerializedName("VerifyOwnerType")
    @Expose
    private String VerifyOwnerType;

    /**
     * Get Domain name. 
     * @return DomainName Domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Domain name.
     * @param DomainName Domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Domain name type.
0: push domain name.
1: playback domain name. 
     * @return DomainType Domain name type.
0: push domain name.
1: playback domain name.
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Domain name type.
0: push domain name.
1: playback domain name.
     * @param DomainType Domain name type.
0: push domain name.
1: playback domain name.
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get Pull domain name type:
1: Mainland China.
2: global.
3: outside Mainland China.
Default value: 1. 
     * @return PlayType Pull domain name type:
1: Mainland China.
2: global.
3: outside Mainland China.
Default value: 1.
     */
    public Long getPlayType() {
        return this.PlayType;
    }

    /**
     * Set Pull domain name type:
1: Mainland China.
2: global.
3: outside Mainland China.
Default value: 1.
     * @param PlayType Pull domain name type:
1: Mainland China.
2: global.
3: outside Mainland China.
Default value: 1.
     */
    public void setPlayType(Long PlayType) {
        this.PlayType = PlayType;
    }

    /**
     * Get Whether it is LCB:
0: LVB,
1: LCB.
Default value: 0. 
     * @return IsDelayLive Whether it is LCB:
0: LVB,
1: LCB.
Default value: 0.
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set Whether it is LCB:
0: LVB,
1: LCB.
Default value: 0.
     * @param IsDelayLive Whether it is LCB:
0: LVB,
1: LCB.
Default value: 0.
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Get Whether it is LVB on Mini Program.
0: LVB.
1: LVB on Mini Program.
Default value: 0. 
     * @return IsMiniProgramLive Whether it is LVB on Mini Program.
0: LVB.
1: LVB on Mini Program.
Default value: 0.
     */
    public Long getIsMiniProgramLive() {
        return this.IsMiniProgramLive;
    }

    /**
     * Set Whether it is LVB on Mini Program.
0: LVB.
1: LVB on Mini Program.
Default value: 0.
     * @param IsMiniProgramLive Whether it is LVB on Mini Program.
0: LVB.
1: LVB on Mini Program.
Default value: 0.
     */
    public void setIsMiniProgramLive(Long IsMiniProgramLive) {
        this.IsMiniProgramLive = IsMiniProgramLive;
    }

    /**
     * Get The domain verification type.
Valid values (the value of this parameter must be the same as `VerifyType` of the `AuthenticateDomainOwner` API):
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been verified.
If you do not pass a value, `dbCheck` will be used. 
     * @return VerifyOwnerType The domain verification type.
Valid values (the value of this parameter must be the same as `VerifyType` of the `AuthenticateDomainOwner` API):
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been verified.
If you do not pass a value, `dbCheck` will be used.
     */
    public String getVerifyOwnerType() {
        return this.VerifyOwnerType;
    }

    /**
     * Set The domain verification type.
Valid values (the value of this parameter must be the same as `VerifyType` of the `AuthenticateDomainOwner` API):
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been verified.
If you do not pass a value, `dbCheck` will be used.
     * @param VerifyOwnerType The domain verification type.
Valid values (the value of this parameter must be the same as `VerifyType` of the `AuthenticateDomainOwner` API):
dnsCheck: Check immediately whether the verification DNS record has been added successfully. If so, record this verification result.
fileCheck: Check immediately whether the verification HTML file has been uploaded successfully. If so, record this verification result.
dbCheck: Check whether the domain has already been verified.
If you do not pass a value, `dbCheck` will be used.
     */
    public void setVerifyOwnerType(String VerifyOwnerType) {
        this.VerifyOwnerType = VerifyOwnerType;
    }

    public AddLiveDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddLiveDomainRequest(AddLiveDomainRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
        if (source.PlayType != null) {
            this.PlayType = new Long(source.PlayType);
        }
        if (source.IsDelayLive != null) {
            this.IsDelayLive = new Long(source.IsDelayLive);
        }
        if (source.IsMiniProgramLive != null) {
            this.IsMiniProgramLive = new Long(source.IsMiniProgramLive);
        }
        if (source.VerifyOwnerType != null) {
            this.VerifyOwnerType = new String(source.VerifyOwnerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "PlayType", this.PlayType);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);
        this.setParamSimple(map, prefix + "IsMiniProgramLive", this.IsMiniProgramLive);
        this.setParamSimple(map, prefix + "VerifyOwnerType", this.VerifyOwnerType);

    }
}

