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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDBInstancePrimaryRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Whether to force a switch. forced switching initiates a switch as long as the secondary node is accessible, regardless of the primary/secondary delay. only when SwitchTag is 0 can you use switch immediately.
<Li>Default: false</li>.
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
    * Specifies the switch time after instance configuration change.
<Li>0: switch immediately</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0  
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
     * Get Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1). 
     * @return DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     * @param DBInstanceId Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get Whether to force a switch. forced switching initiates a switch as long as the secondary node is accessible, regardless of the primary/secondary delay. only when SwitchTag is 0 can you use switch immediately.
<Li>Default: false</li>. 
     * @return Force Whether to force a switch. forced switching initiates a switch as long as the secondary node is accessible, regardless of the primary/secondary delay. only when SwitchTag is 0 can you use switch immediately.
<Li>Default: false</li>.
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to force a switch. forced switching initiates a switch as long as the secondary node is accessible, regardless of the primary/secondary delay. only when SwitchTag is 0 can you use switch immediately.
<Li>Default: false</li>.
     * @param Force Whether to force a switch. forced switching initiates a switch as long as the secondary node is accessible, regardless of the primary/secondary delay. only when SwitchTag is 0 can you use switch immediately.
<Li>Default: false</li>.
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    /**
     * Get Specifies the switch time after instance configuration change.
<Li>0: switch immediately</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0   
     * @return SwitchTag Specifies the switch time after instance configuration change.
<Li>0: switch immediately</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0  
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set Specifies the switch time after instance configuration change.
<Li>0: switch immediately</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0  
     * @param SwitchTag Specifies the switch time after instance configuration change.
<Li>0: switch immediately</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0  
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

