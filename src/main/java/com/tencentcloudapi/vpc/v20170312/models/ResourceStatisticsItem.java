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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceStatisticsItem extends AbstractModel {

    /**
    * Resource type, such as CVM, ENI
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * Resource name.
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * Number of resources
    */
    @SerializedName("ResourceCount")
    @Expose
    private Long ResourceCount;

    /**
     * Get Resource type, such as CVM, ENI 
     * @return ResourceType Resource type, such as CVM, ENI
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set Resource type, such as CVM, ENI
     * @param ResourceType Resource type, such as CVM, ENI
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get Resource name. 
     * @return ResourceName Resource name.
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set Resource name.
     * @param ResourceName Resource name.
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get Number of resources 
     * @return ResourceCount Number of resources
     */
    public Long getResourceCount() {
        return this.ResourceCount;
    }

    /**
     * Set Number of resources
     * @param ResourceCount Number of resources
     */
    public void setResourceCount(Long ResourceCount) {
        this.ResourceCount = ResourceCount;
    }

    public ResourceStatisticsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceStatisticsItem(ResourceStatisticsItem source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.ResourceCount != null) {
            this.ResourceCount = new Long(source.ResourceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "ResourceCount", this.ResourceCount);

    }
}

