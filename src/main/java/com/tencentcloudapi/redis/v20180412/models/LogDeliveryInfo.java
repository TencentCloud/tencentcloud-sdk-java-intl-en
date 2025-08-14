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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogDeliveryInfo extends AbstractModel {

    /**
    * Enabling status of log shipping. true: enabled; false: disabled.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Log set ID.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic ID.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Logset region
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
     * Get Enabling status of log shipping. true: enabled; false: disabled. 
     * @return Enabled Enabling status of log shipping. true: enabled; false: disabled.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Enabling status of log shipping. true: enabled; false: disabled.
     * @param Enabled Enabling status of log shipping. true: enabled; false: disabled.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Log set ID. 
     * @return LogsetId Log set ID.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Log set ID.
     * @param LogsetId Log set ID.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Log topic ID. 
     * @return TopicId Log topic ID.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID.
     * @param TopicId Log topic ID.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Logset region 
     * @return LogRegion Logset region
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set Logset region
     * @param LogRegion Logset region
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    public LogDeliveryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogDeliveryInfo(LogDeliveryInfo source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);

    }
}

