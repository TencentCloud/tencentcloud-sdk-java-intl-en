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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCCLevelListRequest extends AbstractModel {

    /**
    * Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro.
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * Starting offset of the page. Value: (number of pages – 1) * items per page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of results returned in one page
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * ID of the specified instance
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro. 
     * @return Business Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro.
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro.
     * @param Business Anti-DDoS service code. `bgp-multip` indicates Anti-DDos Pro.
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get Starting offset of the page. Value: (number of pages – 1) * items per page. 
     * @return Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Starting offset of the page. Value: (number of pages – 1) * items per page.
     * @param Offset Starting offset of the page. Value: (number of pages – 1) * items per page.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of results returned in one page 
     * @return Limit Number of results returned in one page
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of results returned in one page
     * @param Limit Number of results returned in one page
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get ID of the specified instance 
     * @return InstanceId ID of the specified instance
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the specified instance
     * @param InstanceId ID of the specified instance
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeCCLevelListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCLevelListRequest(DescribeCCLevelListRequest source) {
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

