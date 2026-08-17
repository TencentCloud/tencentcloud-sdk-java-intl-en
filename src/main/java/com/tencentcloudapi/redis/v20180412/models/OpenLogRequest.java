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

public class OpenLogRequest extends AbstractModel {

    /**
    * <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write command.</li><li>read: Read command.</li><li>all: Read/write commands.</li></ul>
    */
    @SerializedName("LogSubType")
    @Expose
    private String LogSubType;

    /**
    * <p>Log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li></ul><p>Default value: 7</p>
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * <p>High-frequency log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li></ul><p>Default value: 7</p>
    */
    @SerializedName("HighLogExpireDay")
    @Expose
    private Long HighLogExpireDay;

    /**
    * <p>Log degradation policy threshold. When the P99 latency of an instance reaches this threshold, the system will automatically discard audit log data to ensure service availability.</p><ul><li>Measurement unit: ms.</li><li>Default value: 500.</li><li>Value ranges from 300 to 1000.</li></ul>
    */
    @SerializedName("DegradeStrategy")
    @Expose
    private Long DegradeStrategy;

    /**
     * Get <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Specify the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul> 
     * @return LogType <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     * @param LogType <p>Log type.</p><p>Enumeration value:</p><ul><li>auditLog: Audit log.</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write command.</li><li>read: Read command.</li><li>all: Read/write commands.</li></ul> 
     * @return LogSubType <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write command.</li><li>read: Read command.</li><li>all: Read/write commands.</li></ul>
     */
    public String getLogSubType() {
        return this.LogSubType;
    }

    /**
     * Set <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write command.</li><li>read: Read command.</li><li>all: Read/write commands.</li></ul>
     * @param LogSubType <p>Log subcategory.</p><p>Enumeration value:</p><ul><li>write: Write command.</li><li>read: Read command.</li><li>all: Read/write commands.</li></ul>
     */
    public void setLogSubType(String LogSubType) {
        this.LogSubType = LogSubType;
    }

    /**
     * Get <p>Log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li></ul><p>Default value: 7</p> 
     * @return LogExpireDay <p>Log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li></ul><p>Default value: 7</p>
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set <p>Log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li></ul><p>Default value: 7</p>
     * @param LogExpireDay <p>Log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li><li>30: 30 days</li></ul><p>Default value: 7</p>
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get <p>High-frequency log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li></ul><p>Default value: 7</p> 
     * @return HighLogExpireDay <p>High-frequency log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li></ul><p>Default value: 7</p>
     */
    public Long getHighLogExpireDay() {
        return this.HighLogExpireDay;
    }

    /**
     * Set <p>High-frequency log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li></ul><p>Default value: 7</p>
     * @param HighLogExpireDay <p>High-frequency log valid period, unit: day.</p><p>Enumeration value:</p><ul><li>7: 7 days</li></ul><p>Default value: 7</p>
     */
    public void setHighLogExpireDay(Long HighLogExpireDay) {
        this.HighLogExpireDay = HighLogExpireDay;
    }

    /**
     * Get <p>Log degradation policy threshold. When the P99 latency of an instance reaches this threshold, the system will automatically discard audit log data to ensure service availability.</p><ul><li>Measurement unit: ms.</li><li>Default value: 500.</li><li>Value ranges from 300 to 1000.</li></ul> 
     * @return DegradeStrategy <p>Log degradation policy threshold. When the P99 latency of an instance reaches this threshold, the system will automatically discard audit log data to ensure service availability.</p><ul><li>Measurement unit: ms.</li><li>Default value: 500.</li><li>Value ranges from 300 to 1000.</li></ul>
     */
    public Long getDegradeStrategy() {
        return this.DegradeStrategy;
    }

    /**
     * Set <p>Log degradation policy threshold. When the P99 latency of an instance reaches this threshold, the system will automatically discard audit log data to ensure service availability.</p><ul><li>Measurement unit: ms.</li><li>Default value: 500.</li><li>Value ranges from 300 to 1000.</li></ul>
     * @param DegradeStrategy <p>Log degradation policy threshold. When the P99 latency of an instance reaches this threshold, the system will automatically discard audit log data to ensure service availability.</p><ul><li>Measurement unit: ms.</li><li>Default value: 500.</li><li>Value ranges from 300 to 1000.</li></ul>
     */
    public void setDegradeStrategy(Long DegradeStrategy) {
        this.DegradeStrategy = DegradeStrategy;
    }

    public OpenLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenLogRequest(OpenLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.LogSubType != null) {
            this.LogSubType = new String(source.LogSubType);
        }
        if (source.LogExpireDay != null) {
            this.LogExpireDay = new Long(source.LogExpireDay);
        }
        if (source.HighLogExpireDay != null) {
            this.HighLogExpireDay = new Long(source.HighLogExpireDay);
        }
        if (source.DegradeStrategy != null) {
            this.DegradeStrategy = new Long(source.DegradeStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "LogSubType", this.LogSubType);
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "HighLogExpireDay", this.HighLogExpireDay);
        this.setParamSimple(map, prefix + "DegradeStrategy", this.DegradeStrategy);

    }
}

