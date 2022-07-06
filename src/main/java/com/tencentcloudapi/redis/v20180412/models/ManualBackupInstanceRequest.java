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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManualBackupInstanceRequest extends AbstractModel{

    /**
    * ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Backup remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Retention time in days. 0 indicates the default retention time.
    */
    @SerializedName("StorageDays")
    @Expose
    private Long StorageDays;

    /**
     * Get ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API. 
     * @return InstanceId ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API.
     * @param InstanceId ID of the instance to be operated on, which can be obtained through the `InstanceId` field in the return value of the `DescribeInstance` API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Backup remarks 
     * @return Remark Backup remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Backup remarks
     * @param Remark Backup remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Retention time in days. 0 indicates the default retention time. 
     * @return StorageDays Retention time in days. 0 indicates the default retention time.
     */
    public Long getStorageDays() {
        return this.StorageDays;
    }

    /**
     * Set Retention time in days. 0 indicates the default retention time.
     * @param StorageDays Retention time in days. 0 indicates the default retention time.
     */
    public void setStorageDays(Long StorageDays) {
        this.StorageDays = StorageDays;
    }

    public ManualBackupInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManualBackupInstanceRequest(ManualBackupInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.StorageDays != null) {
            this.StorageDays = new Long(source.StorageDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "StorageDays", this.StorageDays);

    }
}

