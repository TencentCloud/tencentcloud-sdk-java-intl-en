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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstancesAttributeResponse extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Archive backup status. Valid values: `enable` (enabled), `disable` (disabled)
    */
    @SerializedName("RegularBackupEnable")
    @Expose
    private String RegularBackupEnable;

    /**
    * Archive backup retention period: [90-3650] days
    */
    @SerializedName("RegularBackupSaveDays")
    @Expose
    private Long RegularBackupSaveDays;

    /**
    * Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly).
    */
    @SerializedName("RegularBackupStrategy")
    @Expose
    private String RegularBackupStrategy;

    /**
    * The number of retained archive backups
    */
    @SerializedName("RegularBackupCounts")
    @Expose
    private Long RegularBackupCounts;

    /**
    * Archive backup start date in YYYY-MM-DD format, which is the current time by default.
    */
    @SerializedName("RegularBackupStartTime")
    @Expose
    private String RegularBackupStartTime;

    /**
    * Block process threshold in milliseconds
    */
    @SerializedName("BlockedThreshold")
    @Expose
    private Long BlockedThreshold;

    /**
    * Retention period for the files of slow SQL, blocking, deadlock, and extended events.
    */
    @SerializedName("EventSaveDays")
    @Expose
    private Long EventSaveDays;

    /**
    * TDE u200dconfiguration
    */
    @SerializedName("TDEConfig")
    @Expose
    private TDEConfigAttribute TDEConfig;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Archive backup status. Valid values: `enable` (enabled), `disable` (disabled) 
     * @return RegularBackupEnable Archive backup status. Valid values: `enable` (enabled), `disable` (disabled)
     */
    public String getRegularBackupEnable() {
        return this.RegularBackupEnable;
    }

    /**
     * Set Archive backup status. Valid values: `enable` (enabled), `disable` (disabled)
     * @param RegularBackupEnable Archive backup status. Valid values: `enable` (enabled), `disable` (disabled)
     */
    public void setRegularBackupEnable(String RegularBackupEnable) {
        this.RegularBackupEnable = RegularBackupEnable;
    }

    /**
     * Get Archive backup retention period: [90-3650] days 
     * @return RegularBackupSaveDays Archive backup retention period: [90-3650] days
     */
    public Long getRegularBackupSaveDays() {
        return this.RegularBackupSaveDays;
    }

    /**
     * Set Archive backup retention period: [90-3650] days
     * @param RegularBackupSaveDays Archive backup retention period: [90-3650] days
     */
    public void setRegularBackupSaveDays(Long RegularBackupSaveDays) {
        this.RegularBackupSaveDays = RegularBackupSaveDays;
    }

    /**
     * Get Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly). 
     * @return RegularBackupStrategy Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly).
     */
    public String getRegularBackupStrategy() {
        return this.RegularBackupStrategy;
    }

    /**
     * Set Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly).
     * @param RegularBackupStrategy Archive backup policy. Valid values: `years` (yearly); `quarters (quarterly); `months` (monthly).
     */
    public void setRegularBackupStrategy(String RegularBackupStrategy) {
        this.RegularBackupStrategy = RegularBackupStrategy;
    }

    /**
     * Get The number of retained archive backups 
     * @return RegularBackupCounts The number of retained archive backups
     */
    public Long getRegularBackupCounts() {
        return this.RegularBackupCounts;
    }

    /**
     * Set The number of retained archive backups
     * @param RegularBackupCounts The number of retained archive backups
     */
    public void setRegularBackupCounts(Long RegularBackupCounts) {
        this.RegularBackupCounts = RegularBackupCounts;
    }

    /**
     * Get Archive backup start date in YYYY-MM-DD format, which is the current time by default. 
     * @return RegularBackupStartTime Archive backup start date in YYYY-MM-DD format, which is the current time by default.
     */
    public String getRegularBackupStartTime() {
        return this.RegularBackupStartTime;
    }

    /**
     * Set Archive backup start date in YYYY-MM-DD format, which is the current time by default.
     * @param RegularBackupStartTime Archive backup start date in YYYY-MM-DD format, which is the current time by default.
     */
    public void setRegularBackupStartTime(String RegularBackupStartTime) {
        this.RegularBackupStartTime = RegularBackupStartTime;
    }

    /**
     * Get Block process threshold in milliseconds 
     * @return BlockedThreshold Block process threshold in milliseconds
     */
    public Long getBlockedThreshold() {
        return this.BlockedThreshold;
    }

    /**
     * Set Block process threshold in milliseconds
     * @param BlockedThreshold Block process threshold in milliseconds
     */
    public void setBlockedThreshold(Long BlockedThreshold) {
        this.BlockedThreshold = BlockedThreshold;
    }

    /**
     * Get Retention period for the files of slow SQL, blocking, deadlock, and extended events. 
     * @return EventSaveDays Retention period for the files of slow SQL, blocking, deadlock, and extended events.
     */
    public Long getEventSaveDays() {
        return this.EventSaveDays;
    }

    /**
     * Set Retention period for the files of slow SQL, blocking, deadlock, and extended events.
     * @param EventSaveDays Retention period for the files of slow SQL, blocking, deadlock, and extended events.
     */
    public void setEventSaveDays(Long EventSaveDays) {
        this.EventSaveDays = EventSaveDays;
    }

    /**
     * Get TDE u200dconfiguration 
     * @return TDEConfig TDE u200dconfiguration
     */
    public TDEConfigAttribute getTDEConfig() {
        return this.TDEConfig;
    }

    /**
     * Set TDE u200dconfiguration
     * @param TDEConfig TDE u200dconfiguration
     */
    public void setTDEConfig(TDEConfigAttribute TDEConfig) {
        this.TDEConfig = TDEConfig;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDBInstancesAttributeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstancesAttributeResponse(DescribeDBInstancesAttributeResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RegularBackupEnable != null) {
            this.RegularBackupEnable = new String(source.RegularBackupEnable);
        }
        if (source.RegularBackupSaveDays != null) {
            this.RegularBackupSaveDays = new Long(source.RegularBackupSaveDays);
        }
        if (source.RegularBackupStrategy != null) {
            this.RegularBackupStrategy = new String(source.RegularBackupStrategy);
        }
        if (source.RegularBackupCounts != null) {
            this.RegularBackupCounts = new Long(source.RegularBackupCounts);
        }
        if (source.RegularBackupStartTime != null) {
            this.RegularBackupStartTime = new String(source.RegularBackupStartTime);
        }
        if (source.BlockedThreshold != null) {
            this.BlockedThreshold = new Long(source.BlockedThreshold);
        }
        if (source.EventSaveDays != null) {
            this.EventSaveDays = new Long(source.EventSaveDays);
        }
        if (source.TDEConfig != null) {
            this.TDEConfig = new TDEConfigAttribute(source.TDEConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RegularBackupEnable", this.RegularBackupEnable);
        this.setParamSimple(map, prefix + "RegularBackupSaveDays", this.RegularBackupSaveDays);
        this.setParamSimple(map, prefix + "RegularBackupStrategy", this.RegularBackupStrategy);
        this.setParamSimple(map, prefix + "RegularBackupCounts", this.RegularBackupCounts);
        this.setParamSimple(map, prefix + "RegularBackupStartTime", this.RegularBackupStartTime);
        this.setParamSimple(map, prefix + "BlockedThreshold", this.BlockedThreshold);
        this.setParamSimple(map, prefix + "EventSaveDays", this.EventSaveDays);
        this.setParamObj(map, prefix + "TDEConfig.", this.TDEConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

