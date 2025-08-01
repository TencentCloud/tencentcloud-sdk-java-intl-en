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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadUpdateRecordInfo extends AbstractModel {

    /**
    * Record ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Original certificate ID
    */
    @SerializedName("OldCertId")
    @Expose
    private String OldCertId;

    /**
    * Deployment resource type list.
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * Deployment state.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Deployment time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Record ID 
     * @return Id Record ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Record ID
     * @param Id Record ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Original certificate ID 
     * @return OldCertId Original certificate ID
     */
    public String getOldCertId() {
        return this.OldCertId;
    }

    /**
     * Set Original certificate ID
     * @param OldCertId Original certificate ID
     */
    public void setOldCertId(String OldCertId) {
        this.OldCertId = OldCertId;
    }

    /**
     * Get Deployment resource type list. 
     * @return ResourceTypes Deployment resource type list.
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set Deployment resource type list.
     * @param ResourceTypes Deployment resource type list.
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get Deployment state. 
     * @return Status Deployment state.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Deployment state.
     * @param Status Deployment state.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Deployment time. 
     * @return CreateTime Deployment time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Deployment time.
     * @param CreateTime Deployment time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last update time. 
     * @return UpdateTime Last update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last update time.
     * @param UpdateTime Last update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public UploadUpdateRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadUpdateRecordInfo(UploadUpdateRecordInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.OldCertId != null) {
            this.OldCertId = new String(source.OldCertId);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OldCertId", this.OldCertId);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

