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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceTemplateGroup extends AbstractModel{

    /**
    * Protocol port template group instance ID, such as `ppmg-2klmrefu`.
    */
    @SerializedName("ServiceTemplateGroupId")
    @Expose
    private String ServiceTemplateGroupId;

    /**
    * Protocol port template group name.
    */
    @SerializedName("ServiceTemplateGroupName")
    @Expose
    private String ServiceTemplateGroupName;

    /**
    * Protocol port template instance ID.
    */
    @SerializedName("ServiceTemplateIdSet")
    @Expose
    private String [] ServiceTemplateIdSet;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get Protocol port template group instance ID, such as `ppmg-2klmrefu`. 
     * @return ServiceTemplateGroupId Protocol port template group instance ID, such as `ppmg-2klmrefu`.
     */
    public String getServiceTemplateGroupId() {
        return this.ServiceTemplateGroupId;
    }

    /**
     * Set Protocol port template group instance ID, such as `ppmg-2klmrefu`.
     * @param ServiceTemplateGroupId Protocol port template group instance ID, such as `ppmg-2klmrefu`.
     */
    public void setServiceTemplateGroupId(String ServiceTemplateGroupId) {
        this.ServiceTemplateGroupId = ServiceTemplateGroupId;
    }

    /**
     * Get Protocol port template group name. 
     * @return ServiceTemplateGroupName Protocol port template group name.
     */
    public String getServiceTemplateGroupName() {
        return this.ServiceTemplateGroupName;
    }

    /**
     * Set Protocol port template group name.
     * @param ServiceTemplateGroupName Protocol port template group name.
     */
    public void setServiceTemplateGroupName(String ServiceTemplateGroupName) {
        this.ServiceTemplateGroupName = ServiceTemplateGroupName;
    }

    /**
     * Get Protocol port template instance ID. 
     * @return ServiceTemplateIdSet Protocol port template instance ID.
     */
    public String [] getServiceTemplateIdSet() {
        return this.ServiceTemplateIdSet;
    }

    /**
     * Set Protocol port template instance ID.
     * @param ServiceTemplateIdSet Protocol port template instance ID.
     */
    public void setServiceTemplateIdSet(String [] ServiceTemplateIdSet) {
        this.ServiceTemplateIdSet = ServiceTemplateIdSet;
    }

    /**
     * Get Creation Time. 
     * @return CreatedTime Creation Time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation Time.
     * @param CreatedTime Creation Time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateGroupId", this.ServiceTemplateGroupId);
        this.setParamSimple(map, prefix + "ServiceTemplateGroupName", this.ServiceTemplateGroupName);
        this.setParamArraySimple(map, prefix + "ServiceTemplateIdSet.", this.ServiceTemplateIdSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

