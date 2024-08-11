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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisableTeamDomainRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * 
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get  
     * @return DomainId 
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 
     * @param DomainId 
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get  
     * @return PlatformId 
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set 
     * @param PlatformId 
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public DisableTeamDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableTeamDomainRequest(DisableTeamDomainRequest source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}

