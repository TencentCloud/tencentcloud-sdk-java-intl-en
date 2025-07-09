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

public class TopData extends AbstractModel {

    /**
    * Resource name, which is classified as follows based on different query conditions:
A specific domain name: This indicates the details of this domain name
multiDomains: This indicates the aggregate details of multiple domain names
Project ID: This displays the ID of the specifically queried project
all: This indicates the details at the account level
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Detailed sorting results
    */
    @SerializedName("DetailData")
    @Expose
    private TopDetailData [] DetailData;

    /**
     * Get Resource name, which is classified as follows based on different query conditions:
A specific domain name: This indicates the details of this domain name
multiDomains: This indicates the aggregate details of multiple domain names
Project ID: This displays the ID of the specifically queried project
all: This indicates the details at the account level 
     * @return Resource Resource name, which is classified as follows based on different query conditions:
A specific domain name: This indicates the details of this domain name
multiDomains: This indicates the aggregate details of multiple domain names
Project ID: This displays the ID of the specifically queried project
all: This indicates the details at the account level
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resource name, which is classified as follows based on different query conditions:
A specific domain name: This indicates the details of this domain name
multiDomains: This indicates the aggregate details of multiple domain names
Project ID: This displays the ID of the specifically queried project
all: This indicates the details at the account level
     * @param Resource Resource name, which is classified as follows based on different query conditions:
A specific domain name: This indicates the details of this domain name
multiDomains: This indicates the aggregate details of multiple domain names
Project ID: This displays the ID of the specifically queried project
all: This indicates the details at the account level
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Detailed sorting results 
     * @return DetailData Detailed sorting results
     */
    public TopDetailData [] getDetailData() {
        return this.DetailData;
    }

    /**
     * Set Detailed sorting results
     * @param DetailData Detailed sorting results
     */
    public void setDetailData(TopDetailData [] DetailData) {
        this.DetailData = DetailData;
    }

    public TopData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopData(TopData source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.DetailData != null) {
            this.DetailData = new TopDetailData[source.DetailData.length];
            for (int i = 0; i < source.DetailData.length; i++) {
                this.DetailData[i] = new TopDetailData(source.DetailData[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamArrayObj(map, prefix + "DetailData.", this.DetailData);

    }
}

