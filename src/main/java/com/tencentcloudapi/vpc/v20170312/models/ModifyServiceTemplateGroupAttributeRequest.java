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

public class ModifyServiceTemplateGroupAttributeRequest extends AbstractModel{

    /**
    * The protocol port template group instance ID, such as `ppmg-ei8hfd9a`.
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
    * Instance ID of the protocol port template, such as `ppm-4dw6agho`.
    */
    @SerializedName("ServiceTemplateIds")
    @Expose
    private String [] ServiceTemplateIds;

    /**
     * Get The protocol port template group instance ID, such as `ppmg-ei8hfd9a`. 
     * @return ServiceTemplateGroupId The protocol port template group instance ID, such as `ppmg-ei8hfd9a`.
     */
    public String getServiceTemplateGroupId() {
        return this.ServiceTemplateGroupId;
    }

    /**
     * Set The protocol port template group instance ID, such as `ppmg-ei8hfd9a`.
     * @param ServiceTemplateGroupId The protocol port template group instance ID, such as `ppmg-ei8hfd9a`.
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
     * Get Instance ID of the protocol port template, such as `ppm-4dw6agho`. 
     * @return ServiceTemplateIds Instance ID of the protocol port template, such as `ppm-4dw6agho`.
     */
    public String [] getServiceTemplateIds() {
        return this.ServiceTemplateIds;
    }

    /**
     * Set Instance ID of the protocol port template, such as `ppm-4dw6agho`.
     * @param ServiceTemplateIds Instance ID of the protocol port template, such as `ppm-4dw6agho`.
     */
    public void setServiceTemplateIds(String [] ServiceTemplateIds) {
        this.ServiceTemplateIds = ServiceTemplateIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateGroupId", this.ServiceTemplateGroupId);
        this.setParamSimple(map, prefix + "ServiceTemplateGroupName", this.ServiceTemplateGroupName);
        this.setParamArraySimple(map, prefix + "ServiceTemplateIds.", this.ServiceTemplateIds);

    }
}

