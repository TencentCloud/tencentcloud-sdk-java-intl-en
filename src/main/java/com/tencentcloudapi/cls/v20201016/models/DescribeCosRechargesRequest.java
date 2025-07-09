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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCosRechargesRequest extends AbstractModel {

    /**
    * ID of the log topic.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get ID of the log topic. 
     * @return TopicId ID of the log topic.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set ID of the log topic.
     * @param TopicId ID of the log topic.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed 
     * @return Status Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed
     * @param Status Status. `0`: Created, `1`: Running, `2`: Stopped, `3`: Completed, `4`: Run failed
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled 
     * @return Enable Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
     * @param Enable Whether the configuration is enabled. `0`: Not enabled, `1`: Enabled
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public DescribeCosRechargesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosRechargesRequest(DescribeCosRechargesRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

