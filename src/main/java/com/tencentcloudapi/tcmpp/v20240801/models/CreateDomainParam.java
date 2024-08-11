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

public class CreateDomainParam extends AbstractModel {

    /**
    * Array of domain name URLs
    */
    @SerializedName("DomainUrlList")
    @Expose
    private String [] DomainUrlList;

    /**
    * Domain type. 1: requests domain; 2: WebView load domain, 3: sockets domain; 4: File upload; 5: File download
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
     * Get Array of domain name URLs 
     * @return DomainUrlList Array of domain name URLs
     */
    public String [] getDomainUrlList() {
        return this.DomainUrlList;
    }

    /**
     * Set Array of domain name URLs
     * @param DomainUrlList Array of domain name URLs
     */
    public void setDomainUrlList(String [] DomainUrlList) {
        this.DomainUrlList = DomainUrlList;
    }

    /**
     * Get Domain type. 1: requests domain; 2: WebView load domain, 3: sockets domain; 4: File upload; 5: File download 
     * @return DomainType Domain type. 1: requests domain; 2: WebView load domain, 3: sockets domain; 4: File upload; 5: File download
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Domain type. 1: requests domain; 2: WebView load domain, 3: sockets domain; 4: File upload; 5: File download
     * @param DomainType Domain type. 1: requests domain; 2: WebView load domain, 3: sockets domain; 4: File upload; 5: File download
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    public CreateDomainParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainParam(CreateDomainParam source) {
        if (source.DomainUrlList != null) {
            this.DomainUrlList = new String[source.DomainUrlList.length];
            for (int i = 0; i < source.DomainUrlList.length; i++) {
                this.DomainUrlList[i] = new String(source.DomainUrlList[i]);
            }
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DomainUrlList.", this.DomainUrlList);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);

    }
}

