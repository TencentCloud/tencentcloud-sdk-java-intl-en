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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCLSTopicsRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
    * 
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 
    */
    @SerializedName("TopicIds")
    @Expose
    private String [] TopicIds;

    /**
    * 
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get  
     * @return CLSRegion 
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set 
     * @param CLSRegion 
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    /**
     * Get  
     * @return LogsetId 
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 
     * @param LogsetId 
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get  
     * @return TopicIds 
     */
    public String [] getTopicIds() {
        return this.TopicIds;
    }

    /**
     * Set 
     * @param TopicIds 
     */
    public void setTopicIds(String [] TopicIds) {
        this.TopicIds = TopicIds;
    }

    /**
     * Get  
     * @return Offset 
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 
     * @param Offset 
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get  
     * @return Limit 
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 
     * @param Limit 
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCLSTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCLSTopicsRequest(DescribeCLSTopicsRequest source) {
        if (source.CLSRegion != null) {
            this.CLSRegion = new String(source.CLSRegion);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicIds != null) {
            this.TopicIds = new String[source.TopicIds.length];
            for (int i = 0; i < source.TopicIds.length; i++) {
                this.TopicIds[i] = new String(source.TopicIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CLSRegion", this.CLSRegion);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamArraySimple(map, prefix + "TopicIds.", this.TopicIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

