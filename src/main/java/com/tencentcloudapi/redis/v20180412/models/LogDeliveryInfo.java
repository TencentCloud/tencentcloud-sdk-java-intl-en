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
    * Whether log shipping is enabled. true: enabled; false: disabled.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Logset ID.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic ID.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Logset region

Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
     * Get Whether log shipping is enabled. true: enabled; false: disabled.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Enabled Whether log shipping is enabled. true: enabled; false: disabled.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether log shipping is enabled. true: enabled; false: disabled.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Enabled Whether log shipping is enabled. true: enabled; false: disabled.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Logset ID.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LogsetId Logset ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param LogsetId Logset ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Log topic ID.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return TopicId Log topic ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param TopicId Log topic ID.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Logset region

Note: This field may return null, indicating that no valid value can be obtained. 
     * @return LogRegion Logset region

Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set Logset region

Note: This field may return null, indicating that no valid value can be obtained.
     * @param LogRegion Logset region

Note: This field may return null, indicating that no valid value can be obtained.
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

