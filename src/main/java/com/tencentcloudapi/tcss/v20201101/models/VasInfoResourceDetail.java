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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VasInfoResourceDetail extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Expiration time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 0: paid order; 1: trial use; 2: offered for free.
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * purchase quantity
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Expiration time. 
     * @return EndTime Expiration time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Expiration time.
     * @param EndTime Expiration time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 0: paid order; 1: trial use; 2: offered for free. 
     * @return SourceType 0: paid order; 1: trial use; 2: offered for free.
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 0: paid order; 1: trial use; 2: offered for free.
     * @param SourceType 0: paid order; 1: trial use; 2: offered for free.
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get purchase quantity 
     * @return InquireNum purchase quantity
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set purchase quantity
     * @param InquireNum purchase quantity
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    public VasInfoResourceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VasInfoResourceDetail(VasInfoResourceDetail source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);

    }
}

