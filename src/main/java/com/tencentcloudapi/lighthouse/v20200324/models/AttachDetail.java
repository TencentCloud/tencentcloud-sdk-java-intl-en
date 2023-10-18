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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttachDetail extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Number of elastic cloud disks attached to the instance
    */
    @SerializedName("AttachedDiskCount")
    @Expose
    private Long AttachedDiskCount;

    /**
    * Upper limit of attached elastic cloud disks
    */
    @SerializedName("MaxAttachCount")
    @Expose
    private Long MaxAttachCount;

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
     * Get Number of elastic cloud disks attached to the instance 
     * @return AttachedDiskCount Number of elastic cloud disks attached to the instance
     */
    public Long getAttachedDiskCount() {
        return this.AttachedDiskCount;
    }

    /**
     * Set Number of elastic cloud disks attached to the instance
     * @param AttachedDiskCount Number of elastic cloud disks attached to the instance
     */
    public void setAttachedDiskCount(Long AttachedDiskCount) {
        this.AttachedDiskCount = AttachedDiskCount;
    }

    /**
     * Get Upper limit of attached elastic cloud disks 
     * @return MaxAttachCount Upper limit of attached elastic cloud disks
     */
    public Long getMaxAttachCount() {
        return this.MaxAttachCount;
    }

    /**
     * Set Upper limit of attached elastic cloud disks
     * @param MaxAttachCount Upper limit of attached elastic cloud disks
     */
    public void setMaxAttachCount(Long MaxAttachCount) {
        this.MaxAttachCount = MaxAttachCount;
    }

    public AttachDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttachDetail(AttachDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AttachedDiskCount != null) {
            this.AttachedDiskCount = new Long(source.AttachedDiskCount);
        }
        if (source.MaxAttachCount != null) {
            this.MaxAttachCount = new Long(source.MaxAttachCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AttachedDiskCount", this.AttachedDiskCount);
        this.setParamSimple(map, prefix + "MaxAttachCount", this.MaxAttachCount);

    }
}

