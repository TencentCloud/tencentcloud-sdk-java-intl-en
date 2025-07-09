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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceData extends AbstractModel {

    /**
    * Resource name, which is categorized as follows based on different query conditions:
Specific domain name: indicates the details of the specific domain name
multiDomains: indicates aggregated details of multiple domain names
Project ID: displays the ID of the specified project to be queried
all: details at the account level
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Data details of resource
    */
    @SerializedName("EcdnData")
    @Expose
    private EcdnData EcdnData;

    /**
     * Get Resource name, which is categorized as follows based on different query conditions:
Specific domain name: indicates the details of the specific domain name
multiDomains: indicates aggregated details of multiple domain names
Project ID: displays the ID of the specified project to be queried
all: details at the account level 
     * @return Resource Resource name, which is categorized as follows based on different query conditions:
Specific domain name: indicates the details of the specific domain name
multiDomains: indicates aggregated details of multiple domain names
Project ID: displays the ID of the specified project to be queried
all: details at the account level
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resource name, which is categorized as follows based on different query conditions:
Specific domain name: indicates the details of the specific domain name
multiDomains: indicates aggregated details of multiple domain names
Project ID: displays the ID of the specified project to be queried
all: details at the account level
     * @param Resource Resource name, which is categorized as follows based on different query conditions:
Specific domain name: indicates the details of the specific domain name
multiDomains: indicates aggregated details of multiple domain names
Project ID: displays the ID of the specified project to be queried
all: details at the account level
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Data details of resource 
     * @return EcdnData Data details of resource
     */
    public EcdnData getEcdnData() {
        return this.EcdnData;
    }

    /**
     * Set Data details of resource
     * @param EcdnData Data details of resource
     */
    public void setEcdnData(EcdnData EcdnData) {
        this.EcdnData = EcdnData;
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
        if (source.EcdnData != null) {
            this.EcdnData = new EcdnData(source.EcdnData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamObj(map, prefix + "EcdnData.", this.EcdnData);

    }
}

