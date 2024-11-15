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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDeleteOption extends AbstractModel {

    /**
    * Resource type, such as CBS, CLB, CVM
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Deletion mode for CBS resources when the cluster is deleted: terminate, retain. Other resources are terminated by default.
    */
    @SerializedName("DeleteMode")
    @Expose
    private String DeleteMode;

    /**
    * Whether to skip the resources with deletion protection enabled. It is false by default. When set to true, the resources with deletion protection enabled are not cleaned up. CLB with terminal nodes also belongs to the resources with deletion protection enabled.
    */
    @SerializedName("SkipDeletionProtection")
    @Expose
    private Boolean SkipDeletionProtection;

    /**
     * Get Resource type, such as CBS, CLB, CVM 
     * @return ResourceType Resource type, such as CBS, CLB, CVM
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type, such as CBS, CLB, CVM
     * @param ResourceType Resource type, such as CBS, CLB, CVM
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Deletion mode for CBS resources when the cluster is deleted: terminate, retain. Other resources are terminated by default. 
     * @return DeleteMode Deletion mode for CBS resources when the cluster is deleted: terminate, retain. Other resources are terminated by default.
     */
    public String getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set Deletion mode for CBS resources when the cluster is deleted: terminate, retain. Other resources are terminated by default.
     * @param DeleteMode Deletion mode for CBS resources when the cluster is deleted: terminate, retain. Other resources are terminated by default.
     */
    public void setDeleteMode(String DeleteMode) {
        this.DeleteMode = DeleteMode;
    }

    /**
     * Get Whether to skip the resources with deletion protection enabled. It is false by default. When set to true, the resources with deletion protection enabled are not cleaned up. CLB with terminal nodes also belongs to the resources with deletion protection enabled. 
     * @return SkipDeletionProtection Whether to skip the resources with deletion protection enabled. It is false by default. When set to true, the resources with deletion protection enabled are not cleaned up. CLB with terminal nodes also belongs to the resources with deletion protection enabled.
     */
    public Boolean getSkipDeletionProtection() {
        return this.SkipDeletionProtection;
    }

    /**
     * Set Whether to skip the resources with deletion protection enabled. It is false by default. When set to true, the resources with deletion protection enabled are not cleaned up. CLB with terminal nodes also belongs to the resources with deletion protection enabled.
     * @param SkipDeletionProtection Whether to skip the resources with deletion protection enabled. It is false by default. When set to true, the resources with deletion protection enabled are not cleaned up. CLB with terminal nodes also belongs to the resources with deletion protection enabled.
     */
    public void setSkipDeletionProtection(Boolean SkipDeletionProtection) {
        this.SkipDeletionProtection = SkipDeletionProtection;
    }

    public ResourceDeleteOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceDeleteOption(ResourceDeleteOption source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.DeleteMode != null) {
            this.DeleteMode = new String(source.DeleteMode);
        }
        if (source.SkipDeletionProtection != null) {
            this.SkipDeletionProtection = new Boolean(source.SkipDeletionProtection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);
        this.setParamSimple(map, prefix + "SkipDeletionProtection", this.SkipDeletionProtection);

    }
}

