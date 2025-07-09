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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionRequest extends AbstractModel {

    /**
    * The offset value
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * The maximum number of results returned
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Business field, which can be ignored.
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * CDC business field, which can be ignored.
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get The offset value 
     * @return Offset The offset value
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set The offset value
     * @param Offset The offset value
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get The maximum number of results returned 
     * @return Limit The maximum number of results returned
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The maximum number of results returned
     * @param Limit The maximum number of results returned
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Business field, which can be ignored. 
     * @return Business Business field, which can be ignored.
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set Business field, which can be ignored.
     * @param Business Business field, which can be ignored.
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get CDC business field, which can be ignored. 
     * @return CdcId CDC business field, which can be ignored.
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set CDC business field, which can be ignored.
     * @param CdcId CDC business field, which can be ignored.
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public DescribeRegionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegionRequest(DescribeRegionRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

