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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailedRolePerm extends AbstractModel {

    /**
    * Resources corresponding to permissions.
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Whether to enable production permission
    */
    @SerializedName("PermWrite")
    @Expose
    private Boolean PermWrite;

    /**
    * Whether to enable consumption permission
    */
    @SerializedName("PermRead")
    @Expose
    private Boolean PermRead;

    /**
    * Authorized resource type (Topic: topic; Group: consumer group).
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Resources corresponding to permissions. 
     * @return Resource Resources corresponding to permissions.
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set Resources corresponding to permissions.
     * @param Resource Resources corresponding to permissions.
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Whether to enable production permission 
     * @return PermWrite Whether to enable production permission
     */
    public Boolean getPermWrite() {
        return this.PermWrite;
    }

    /**
     * Set Whether to enable production permission
     * @param PermWrite Whether to enable production permission
     */
    public void setPermWrite(Boolean PermWrite) {
        this.PermWrite = PermWrite;
    }

    /**
     * Get Whether to enable consumption permission 
     * @return PermRead Whether to enable consumption permission
     */
    public Boolean getPermRead() {
        return this.PermRead;
    }

    /**
     * Set Whether to enable consumption permission
     * @param PermRead Whether to enable consumption permission
     */
    public void setPermRead(Boolean PermRead) {
        this.PermRead = PermRead;
    }

    /**
     * Get Authorized resource type (Topic: topic; Group: consumer group). 
     * @return ResourceType Authorized resource type (Topic: topic; Group: consumer group).
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Authorized resource type (Topic: topic; Group: consumer group).
     * @param ResourceType Authorized resource type (Topic: topic; Group: consumer group).
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource remarks. 
     * @return Remark Resource remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Resource remarks.
     * @param Remark Resource remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public DetailedRolePerm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailedRolePerm(DetailedRolePerm source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.PermWrite != null) {
            this.PermWrite = new Boolean(source.PermWrite);
        }
        if (source.PermRead != null) {
            this.PermRead = new Boolean(source.PermRead);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "PermWrite", this.PermWrite);
        this.setParamSimple(map, prefix + "PermRead", this.PermRead);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

