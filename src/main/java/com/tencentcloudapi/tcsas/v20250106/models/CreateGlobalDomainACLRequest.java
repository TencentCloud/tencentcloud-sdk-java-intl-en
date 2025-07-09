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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateGlobalDomainACLRequest extends AbstractModel {

    /**
    * Domain name list
    */
    @SerializedName("DomainUrlList")
    @Expose
    private String [] DomainUrlList;

    /**
    * Domain type. 1: Allowed; 2: Blocked
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
    * Platform ID
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * Get Domain name list 
     * @return DomainUrlList Domain name list
     */
    public String [] getDomainUrlList() {
        return this.DomainUrlList;
    }

    /**
     * Set Domain name list
     * @param DomainUrlList Domain name list
     */
    public void setDomainUrlList(String [] DomainUrlList) {
        this.DomainUrlList = DomainUrlList;
    }

    /**
     * Get Domain type. 1: Allowed; 2: Blocked 
     * @return DomainType Domain type. 1: Allowed; 2: Blocked
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Domain type. 1: Allowed; 2: Blocked
     * @param DomainType Domain type. 1: Allowed; 2: Blocked
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get Platform ID 
     * @return PlatformId Platform ID
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * Set Platform ID
     * @param PlatformId Platform ID
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    public CreateGlobalDomainACLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGlobalDomainACLRequest(CreateGlobalDomainACLRequest source) {
        if (source.DomainUrlList != null) {
            this.DomainUrlList = new String[source.DomainUrlList.length];
            for (int i = 0; i < source.DomainUrlList.length; i++) {
                this.DomainUrlList[i] = new String(source.DomainUrlList[i]);
            }
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
        if (source.PlatformId != null) {
            this.PlatformId = new String(source.PlatformId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DomainUrlList.", this.DomainUrlList);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}

