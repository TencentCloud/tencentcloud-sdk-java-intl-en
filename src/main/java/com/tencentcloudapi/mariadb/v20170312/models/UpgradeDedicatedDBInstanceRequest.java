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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDedicatedDBInstanceRequest extends AbstractModel {

    /**
    * ID of the instance to be upgraded.  It is in the form of  `tdsql-ow728lmc`, which can be obtained by querying the instance details through the `DescribeDBInstances` API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Memory size in GB,  which can be obtained through the `DescribeFenceDBInstanceSpecs` API.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Storage space size in GB.  You can obtain the disk space limits by querying instance specification through the `DescribeDBInstanceSpecs` API.
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * Whether to retry again when missing the switch time window. Valid values: `0` (no), `1` (yes).
    */
    @SerializedName("SwitchAutoRetry")
    @Expose
    private Long SwitchAutoRetry;

    /**
    * Switch start time
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * Switch end time
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
     * Get ID of the instance to be upgraded.  It is in the form of  `tdsql-ow728lmc`, which can be obtained by querying the instance details through the `DescribeDBInstances` API. 
     * @return InstanceId ID of the instance to be upgraded.  It is in the form of  `tdsql-ow728lmc`, which can be obtained by querying the instance details through the `DescribeDBInstances` API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be upgraded.  It is in the form of  `tdsql-ow728lmc`, which can be obtained by querying the instance details through the `DescribeDBInstances` API.
     * @param InstanceId ID of the instance to be upgraded.  It is in the form of  `tdsql-ow728lmc`, which can be obtained by querying the instance details through the `DescribeDBInstances` API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Memory size in GB,  which can be obtained through the `DescribeFenceDBInstanceSpecs` API. 
     * @return Memory Memory size in GB,  which can be obtained through the `DescribeFenceDBInstanceSpecs` API.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size in GB,  which can be obtained through the `DescribeFenceDBInstanceSpecs` API.
     * @param Memory Memory size in GB,  which can be obtained through the `DescribeFenceDBInstanceSpecs` API.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Storage space size in GB.  You can obtain the disk space limits by querying instance specification through the `DescribeDBInstanceSpecs` API. 
     * @return Storage Storage space size in GB.  You can obtain the disk space limits by querying instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set Storage space size in GB.  You can obtain the disk space limits by querying instance specification through the `DescribeDBInstanceSpecs` API.
     * @param Storage Storage space size in GB.  You can obtain the disk space limits by querying instance specification through the `DescribeDBInstanceSpecs` API.
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get Whether to retry again when missing the switch time window. Valid values: `0` (no), `1` (yes). 
     * @return SwitchAutoRetry Whether to retry again when missing the switch time window. Valid values: `0` (no), `1` (yes).
     */
    public Long getSwitchAutoRetry() {
        return this.SwitchAutoRetry;
    }

    /**
     * Set Whether to retry again when missing the switch time window. Valid values: `0` (no), `1` (yes).
     * @param SwitchAutoRetry Whether to retry again when missing the switch time window. Valid values: `0` (no), `1` (yes).
     */
    public void setSwitchAutoRetry(Long SwitchAutoRetry) {
        this.SwitchAutoRetry = SwitchAutoRetry;
    }

    /**
     * Get Switch start time 
     * @return SwitchStartTime Switch start time
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set Switch start time
     * @param SwitchStartTime Switch start time
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get Switch end time 
     * @return SwitchEndTime Switch end time
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set Switch end time
     * @param SwitchEndTime Switch end time
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    public UpgradeDedicatedDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDedicatedDBInstanceRequest(UpgradeDedicatedDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.SwitchAutoRetry != null) {
            this.SwitchAutoRetry = new Long(source.SwitchAutoRetry);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "SwitchAutoRetry", this.SwitchAutoRetry);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);

    }
}

