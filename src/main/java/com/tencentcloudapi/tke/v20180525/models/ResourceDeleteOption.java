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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceDeleteOption extends AbstractModel{

    /**
    * Resource type, for example `CBS`
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Specifies the policy to deal with resources in the cluster when the cluster is deleted. It can be `terminate` or `retain`.
    */
    @SerializedName("DeleteMode")
    @Expose
    private String DeleteMode;

    /**
     * Get Resource type, for example `CBS` 
     * @return ResourceType Resource type, for example `CBS`
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type, for example `CBS`
     * @param ResourceType Resource type, for example `CBS`
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Specifies the policy to deal with resources in the cluster when the cluster is deleted. It can be `terminate` or `retain`. 
     * @return DeleteMode Specifies the policy to deal with resources in the cluster when the cluster is deleted. It can be `terminate` or `retain`.
     */
    public String getDeleteMode() {
        return this.DeleteMode;
    }

    /**
     * Set Specifies the policy to deal with resources in the cluster when the cluster is deleted. It can be `terminate` or `retain`.
     * @param DeleteMode Specifies the policy to deal with resources in the cluster when the cluster is deleted. It can be `terminate` or `retain`.
     */
    public void setDeleteMode(String DeleteMode) {
        this.DeleteMode = DeleteMode;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "DeleteMode", this.DeleteMode);

    }
}

