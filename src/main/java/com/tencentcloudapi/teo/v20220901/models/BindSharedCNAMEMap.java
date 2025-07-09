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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindSharedCNAMEMap extends AbstractModel {

    /**
    * The shared CNAME to be bound with or unbound from.
    */
    @SerializedName("SharedCNAME")
    @Expose
    private String SharedCNAME;

    /**
    * Acceleration domains (up to 20).
    */
    @SerializedName("DomainNames")
    @Expose
    private String [] DomainNames;

    /**
     * Get The shared CNAME to be bound with or unbound from. 
     * @return SharedCNAME The shared CNAME to be bound with or unbound from.
     */
    public String getSharedCNAME() {
        return this.SharedCNAME;
    }

    /**
     * Set The shared CNAME to be bound with or unbound from.
     * @param SharedCNAME The shared CNAME to be bound with or unbound from.
     */
    public void setSharedCNAME(String SharedCNAME) {
        this.SharedCNAME = SharedCNAME;
    }

    /**
     * Get Acceleration domains (up to 20). 
     * @return DomainNames Acceleration domains (up to 20).
     */
    public String [] getDomainNames() {
        return this.DomainNames;
    }

    /**
     * Set Acceleration domains (up to 20).
     * @param DomainNames Acceleration domains (up to 20).
     */
    public void setDomainNames(String [] DomainNames) {
        this.DomainNames = DomainNames;
    }

    public BindSharedCNAMEMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindSharedCNAMEMap(BindSharedCNAMEMap source) {
        if (source.SharedCNAME != null) {
            this.SharedCNAME = new String(source.SharedCNAME);
        }
        if (source.DomainNames != null) {
            this.DomainNames = new String[source.DomainNames.length];
            for (int i = 0; i < source.DomainNames.length; i++) {
                this.DomainNames[i] = new String(source.DomainNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SharedCNAME", this.SharedCNAME);
        this.setParamArraySimple(map, prefix + "DomainNames.", this.DomainNames);

    }
}

