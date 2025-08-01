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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLivePlayDomainRequest extends AbstractModel {

    /**
    * Playback domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Pull domain name type. 1: Mainland China. 2: global, 3: outside Mainland China
    */
    @SerializedName("PlayType")
    @Expose
    private Long PlayType;

    /**
     * Get Playback domain name. 
     * @return DomainName Playback domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Playback domain name.
     * @param DomainName Playback domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Pull domain name type. 1: Mainland China. 2: global, 3: outside Mainland China 
     * @return PlayType Pull domain name type. 1: Mainland China. 2: global, 3: outside Mainland China
     */
    public Long getPlayType() {
        return this.PlayType;
    }

    /**
     * Set Pull domain name type. 1: Mainland China. 2: global, 3: outside Mainland China
     * @param PlayType Pull domain name type. 1: Mainland China. 2: global, 3: outside Mainland China
     */
    public void setPlayType(Long PlayType) {
        this.PlayType = PlayType;
    }

    public ModifyLivePlayDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLivePlayDomainRequest(ModifyLivePlayDomainRequest source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.PlayType != null) {
            this.PlayType = new Long(source.PlayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "PlayType", this.PlayType);

    }
}

