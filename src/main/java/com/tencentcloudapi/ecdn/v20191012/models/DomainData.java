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

public class DomainData extends AbstractModel {

    /**
    * Domain name
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Result details.
    */
    @SerializedName("DetailData")
    @Expose
    private DetailData [] DetailData;

    /**
     * Get Domain name 
     * @return Resource Domain name
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Domain name
     * @param Resource Domain name
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Result details. 
     * @return DetailData Result details.
     */
    public DetailData [] getDetailData() {
        return this.DetailData;
    }

    /**
     * Set Result details.
     * @param DetailData Result details.
     */
    public void setDetailData(DetailData [] DetailData) {
        this.DetailData = DetailData;
    }

    public DomainData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainData(DomainData source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.DetailData != null) {
            this.DetailData = new DetailData[source.DetailData.length];
            for (int i = 0; i < source.DetailData.length; i++) {
                this.DetailData[i] = new DetailData(source.DetailData[i]);
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

