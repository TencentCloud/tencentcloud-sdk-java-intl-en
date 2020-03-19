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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddLiveDomainRequest extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "PlayType", this.PlayType);
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);

    }
}

