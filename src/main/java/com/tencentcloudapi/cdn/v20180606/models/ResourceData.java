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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceData extends AbstractModel {

    /**
    * Resource name. 
A single domain name: Queries domain name details by a domain name. The details of the domain name will be displayed when the passed parameter `detail` is `true`.
Multiple domain names: Queries domain name details by multiple domain names. The aggregated details of the domain names will be displayed.
Project ID: Queries domain name details by a project ID. The aggregated details of the domain names of the project will be displayed.
`all`: Account-level data, which is aggregated details of all domain names of an account.
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Data details of a resource
    */
    @SerializedName("CdnData")
    @Expose
    private CdnData [] CdnData;

    /**
     * Get Resource name. 
A single domain name: Queries domain name details by a domain name. The details of the domain name will be displayed when the passed parameter `detail` is `true`.
Multiple domain names: Queries domain name details by multiple domain names. The aggregated details of the domain names will be displayed.
Project ID: Queries domain name details by a project ID. The aggregated details of the domain names of the project will be displayed.
`all`: Account-level data, which is aggregated details of all domain names of an account. 
     * @return Resource Resource name. 
A single domain name: Queries domain name details by a domain name. The details of the domain name will be displayed when the passed parameter `detail` is `true`.
Multiple domain names: Queries domain name details by multiple domain names. The aggregated details of the domain names will be displayed.
Project ID: Queries domain name details by a project ID. The aggregated details of the domain names of the project will be displayed.
`all`: Account-level data, which is aggregated details of all domain names of an account.
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resource name. 
A single domain name: Queries domain name details by a domain name. The details of the domain name will be displayed when the passed parameter `detail` is `true`.
Multiple domain names: Queries domain name details by multiple domain names. The aggregated details of the domain names will be displayed.
Project ID: Queries domain name details by a project ID. The aggregated details of the domain names of the project will be displayed.
`all`: Account-level data, which is aggregated details of all domain names of an account.
     * @param Resource Resource name. 
A single domain name: Queries domain name details by a domain name. The details of the domain name will be displayed when the passed parameter `detail` is `true`.
Multiple domain names: Queries domain name details by multiple domain names. The aggregated details of the domain names will be displayed.
Project ID: Queries domain name details by a project ID. The aggregated details of the domain names of the project will be displayed.
`all`: Account-level data, which is aggregated details of all domain names of an account.
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Data details of a resource 
     * @return CdnData Data details of a resource
     */
    public CdnData [] getCdnData() {
        return this.CdnData;
    }

    /**
     * Set Data details of a resource
     * @param CdnData Data details of a resource
     */
    public void setCdnData(CdnData [] CdnData) {
        this.CdnData = CdnData;
    }

    public ResourceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceData(ResourceData source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.CdnData != null) {
            this.CdnData = new CdnData[source.CdnData.length];
            for (int i = 0; i < source.CdnData.length; i++) {
                this.CdnData[i] = new CdnData(source.CdnData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "CdnData.", this.CdnData);

    }
}

