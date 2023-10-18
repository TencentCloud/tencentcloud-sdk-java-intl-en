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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDBInstancePrimaryRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Whether to perform forced switch. As long as the standby node can be accessed, the switch will be performed regardless of the primary-standby sync delay. You can switch immediately only when `SwitchTag` is `0.
<li>Default: `false`.
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
    * Switch time for the specified instance after configuration modification.
<li>`0`: Switch now. 
<li>`1`: Switch at the specified time.
<li>`2`: Switch in the maintenance time.
<li>Default value: `0`. 
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * The earliest time to start a switch in the format of "HH:MM:SS", such as "01:00:00". This parameter is invalid when `SwitchTag` is `0` or `2`.
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * The latest time to start a switch in the format of "HH:MM:SS", such as "01:30:00". This parameter is invalid when `SwitchTag` is `0` or `2`. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes.
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
     * Get Instance ID 
     * @return DBInstanceId Instance ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID
     * @param DBInstanceId Instance ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Whether to perform forced switch. As long as the standby node can be accessed, the switch will be performed regardless of the primary-standby sync delay. You can switch immediately only when `SwitchTag` is `0.
<li>Default: `false`. 
     * @return Force Whether to perform forced switch. As long as the standby node can be accessed, the switch will be performed regardless of the primary-standby sync delay. You can switch immediately only when `SwitchTag` is `0.
<li>Default: `false`.
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to perform forced switch. As long as the standby node can be accessed, the switch will be performed regardless of the primary-standby sync delay. You can switch immediately only when `SwitchTag` is `0.
<li>Default: `false`.
     * @param Force Whether to perform forced switch. As long as the standby node can be accessed, the switch will be performed regardless of the primary-standby sync delay. You can switch immediately only when `SwitchTag` is `0.
<li>Default: `false`.
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * Get Switch time for the specified instance after configuration modification.
<li>`0`: Switch now. 
<li>`1`: Switch at the specified time.
<li>`2`: Switch in the maintenance time.
<li>Default value: `0`.  
     * @return SwitchTag Switch time for the specified instance after configuration modification.
<li>`0`: Switch now. 
<li>`1`: Switch at the specified time.
<li>`2`: Switch in the maintenance time.
<li>Default value: `0`. 
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set Switch time for the specified instance after configuration modification.
<li>`0`: Switch now. 
<li>`1`: Switch at the specified time.
<li>`2`: Switch in the maintenance time.
<li>Default value: `0`. 
     * @param SwitchTag Switch time for the specified instance after configuration modification.
<li>`0`: Switch now. 
<li>`1`: Switch at the specified time.
<li>`2`: Switch in the maintenance time.
<li>Default value: `0`. 
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get The earliest time to start a switch in the format of "HH:MM:SS", such as "01:00:00". This parameter is invalid when `SwitchTag` is `0` or `2`. 
     * @return SwitchStartTime The earliest time to start a switch in the format of "HH:MM:SS", such as "01:00:00". This parameter is invalid when `SwitchTag` is `0` or `2`.
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set The earliest time to start a switch in the format of "HH:MM:SS", such as "01:00:00". This parameter is invalid when `SwitchTag` is `0` or `2`.
     * @param SwitchStartTime The earliest time to start a switch in the format of "HH:MM:SS", such as "01:00:00". This parameter is invalid when `SwitchTag` is `0` or `2`.
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get The latest time to start a switch in the format of "HH:MM:SS", such as "01:30:00". This parameter is invalid when `SwitchTag` is `0` or `2`. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes. 
     * @return SwitchEndTime The latest time to start a switch in the format of "HH:MM:SS", such as "01:30:00". This parameter is invalid when `SwitchTag` is `0` or `2`. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes.
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set The latest time to start a switch in the format of "HH:MM:SS", such as "01:30:00". This parameter is invalid when `SwitchTag` is `0` or `2`. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes.
     * @param SwitchEndTime The latest time to start a switch in the format of "HH:MM:SS", such as "01:30:00". This parameter is invalid when `SwitchTag` is `0` or `2`. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes.
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    public SwitchDBInstancePrimaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchDBInstancePrimaryRequest(SwitchDBInstancePrimaryRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
        if (source.SwitchTag != null) {
            this.SwitchTag = new Long(source.SwitchTag);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Force", this.Force);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);

    }
}

