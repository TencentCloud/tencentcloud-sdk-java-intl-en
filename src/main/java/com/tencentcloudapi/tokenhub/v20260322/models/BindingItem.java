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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindingItem extends AbstractModel {

    /**
    * Resource ID (model ID or service ID).
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Resource type. Value: endpoint (service), model (model).
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Resource ID (model ID or service ID). 
     * @return ResourceId Resource ID (model ID or service ID).
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID (model ID or service ID).
     * @param ResourceId Resource ID (model ID or service ID).
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Resource type. Value: endpoint (service), model (model). 
     * @return ResourceType Resource type. Value: endpoint (service), model (model).
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type. Value: endpoint (service), model (model).
     * @param ResourceType Resource type. Value: endpoint (service), model (model).
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource status 
     * @return Status Resource status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Resource status
     * @param Status Resource status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public BindingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindingItem(BindingItem source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

