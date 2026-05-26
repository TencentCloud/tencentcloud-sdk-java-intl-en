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
    * Region of the logset belonging to. Valid values: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> <li>ap-chongqing: Chongqing;</li> <li>ap-nanjing: Nanjing;</li> <li>ap-shanghai: Shanghai;</li> <li>ap-singapore: Singapore.</li>
    */
    @SerializedName("CLSRegion")
    @Expose
    private String CLSRegion;

    /**
    * Log Set ID of Log Topic.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic ID list. If left empty, means query all log topics.
    */
    @SerializedName("TopicIds")
    @Expose
    private String [] TopicIds;

    /**
    * Pagination offset. Default value: 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned entries. Default value: 20. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get Region of the logset belonging to. Valid values: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> <li>ap-chongqing: Chongqing;</li> <li>ap-nanjing: Nanjing;</li> <li>ap-shanghai: Shanghai;</li> <li>ap-singapore: Singapore.</li> 
     * @return CLSRegion Region of the logset belonging to. Valid values: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> <li>ap-chongqing: Chongqing;</li> <li>ap-nanjing: Nanjing;</li> <li>ap-shanghai: Shanghai;</li> <li>ap-singapore: Singapore.</li>
     */
    public String getCLSRegion() {
        return this.CLSRegion;
    }

    /**
     * Set Region of the logset belonging to. Valid values: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> <li>ap-chongqing: Chongqing;</li> <li>ap-nanjing: Nanjing;</li> <li>ap-shanghai: Shanghai;</li> <li>ap-singapore: Singapore.</li>
     * @param CLSRegion Region of the logset belonging to. Valid values: <li>ap-guangzhou: Guangzhou;</li> <li>ap-beijing: Beijing;</li> <li>ap-chengdu: Chengdu;</li> <li>ap-chongqing: Chongqing;</li> <li>ap-nanjing: Nanjing;</li> <li>ap-shanghai: Shanghai;</li> <li>ap-singapore: Singapore.</li>
     */
    public void setCLSRegion(String CLSRegion) {
        this.CLSRegion = CLSRegion;
    }

    /**
     * Get Log Set ID of Log Topic. 
     * @return LogsetId Log Set ID of Log Topic.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Log Set ID of Log Topic.
     * @param LogsetId Log Set ID of Log Topic.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Log topic ID list. If left empty, means query all log topics. 
     * @return TopicIds Log topic ID list. If left empty, means query all log topics.
     */
    public String [] getTopicIds() {
        return this.TopicIds;
    }

    /**
     * Set Log topic ID list. If left empty, means query all log topics.
     * @param TopicIds Log topic ID list. If left empty, means query all log topics.
     */
    public void setTopicIds(String [] TopicIds) {
        this.TopicIds = TopicIds;
    }

    /**
     * Get Pagination offset. Default value: 0. 
     * @return Offset Pagination offset. Default value: 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset. Default value: 0.
     * @param Offset Pagination offset. Default value: 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned entries. Default value: 20. Maximum value: 100. 
     * @return Limit Number of returned entries. Default value: 20. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned entries. Default value: 20. Maximum value: 100.
     * @param Limit Number of returned entries. Default value: 20. Maximum value: 100.
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

