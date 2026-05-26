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

public class UpgradeDBInstanceKernelVersionRequest extends AbstractModel {

    /**
    * Instance ID. obtain through the api [DescribeDBInstances](https://www.tencentcloud.com/document/api/409/16773?from_cn_redirect=1).
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * Target kernel version, which can be obtained in the `AvailableUpgradeTarget` field in the returned value of the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.

    */
    @SerializedName("TargetDBKernelVersion")
    @Expose
    private String TargetDBKernelVersion;

    /**
    * Specifies the switch time after upgrading the kernel for the specified instance. valid values:.
<Li>0: switch immediately.</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0  
    */
    @SerializedName("SwitchTag")
    @Expose
    private Long SwitchTag;

    /**
    * Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is `0` or `2`, this parameter is invalid.
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is `0` or `2`, this parameter is invalid. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes.
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * Specifies whether to perform a pre-check for the instance kernel version upgrade operation this time.
<li>true: performs a pre-check without upgrading the kernel. check items include request parameters, kernel version compatibility, and instance parameters.</li>.
<li>false: send a normal request (default value). after passing the check, directly upgrade the kernel.</li>.
Default value: `false`.
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

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
     * Get Target kernel version, which can be obtained in the `AvailableUpgradeTarget` field in the returned value of the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.
 
     * @return TargetDBKernelVersion Target kernel version, which can be obtained in the `AvailableUpgradeTarget` field in the returned value of the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.

     */
    public String getTargetDBKernelVersion() {
        return this.TargetDBKernelVersion;
    }

    /**
     * Set Target kernel version, which can be obtained in the `AvailableUpgradeTarget` field in the returned value of the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.

     * @param TargetDBKernelVersion Target kernel version, which can be obtained in the `AvailableUpgradeTarget` field in the returned value of the [DescribeDBVersions](https://intl.cloud.tencent.com/document/api/409/89018?from_cn_redirect=1) API.

     */
    public void setTargetDBKernelVersion(String TargetDBKernelVersion) {
        this.TargetDBKernelVersion = TargetDBKernelVersion;
    }

    /**
     * Get Specifies the switch time after upgrading the kernel for the specified instance. valid values:.
<Li>0: switch immediately.</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0   
     * @return SwitchTag Specifies the switch time after upgrading the kernel for the specified instance. valid values:.
<Li>0: switch immediately.</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0  
     */
    public Long getSwitchTag() {
        return this.SwitchTag;
    }

    /**
     * Set Specifies the switch time after upgrading the kernel for the specified instance. valid values:.
<Li>0: switch immediately.</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0  
     * @param SwitchTag Specifies the switch time after upgrading the kernel for the specified instance. valid values:.
<Li>0: switch immediately.</li>.
<Li>1: switch at specified time</li>.
<Li>2: switch during maintenance time window.</li>.
Default value: 0  
     */
    public void setSwitchTag(Long SwitchTag) {
        this.SwitchTag = SwitchTag;
    }

    /**
     * Get Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is `0` or `2`, this parameter is invalid. 
     * @return SwitchStartTime Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is `0` or `2`, this parameter is invalid.
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is `0` or `2`, this parameter is invalid.
     * @param SwitchStartTime Switch start time in the format of `HH:MM:SS`, such as 01:00:00. When `SwitchTag` is `0` or `2`, this parameter is invalid.
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is `0` or `2`, this parameter is invalid. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes. 
     * @return SwitchEndTime Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is `0` or `2`, this parameter is invalid. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes.
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is `0` or `2`, this parameter is invalid. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes.
     * @param SwitchEndTime Switch end time in the format of `HH:MM:SS`, such as 01:30:00. When `SwitchTag` is `0` or `2`, this parameter is invalid. The difference between `SwitchStartTime` and `SwitchEndTime` cannot be less than 30 minutes.
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get Specifies whether to perform a pre-check for the instance kernel version upgrade operation this time.
<li>true: performs a pre-check without upgrading the kernel. check items include request parameters, kernel version compatibility, and instance parameters.</li>.
<li>false: send a normal request (default value). after passing the check, directly upgrade the kernel.</li>.
Default value: `false`. 
     * @return DryRun Specifies whether to perform a pre-check for the instance kernel version upgrade operation this time.
<li>true: performs a pre-check without upgrading the kernel. check items include request parameters, kernel version compatibility, and instance parameters.</li>.
<li>false: send a normal request (default value). after passing the check, directly upgrade the kernel.</li>.
Default value: `false`.
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set Specifies whether to perform a pre-check for the instance kernel version upgrade operation this time.
<li>true: performs a pre-check without upgrading the kernel. check items include request parameters, kernel version compatibility, and instance parameters.</li>.
<li>false: send a normal request (default value). after passing the check, directly upgrade the kernel.</li>.
Default value: `false`.
     * @param DryRun Specifies whether to perform a pre-check for the instance kernel version upgrade operation this time.
<li>true: performs a pre-check without upgrading the kernel. check items include request parameters, kernel version compatibility, and instance parameters.</li>.
<li>false: send a normal request (default value). after passing the check, directly upgrade the kernel.</li>.
Default value: `false`.
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public UpgradeDBInstanceKernelVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceKernelVersionRequest(UpgradeDBInstanceKernelVersionRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.TargetDBKernelVersion != null) {
            this.TargetDBKernelVersion = new String(source.TargetDBKernelVersion);
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
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "TargetDBKernelVersion", this.TargetDBKernelVersion);
        this.setParamSimple(map, prefix + "SwitchTag", this.SwitchTag);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

