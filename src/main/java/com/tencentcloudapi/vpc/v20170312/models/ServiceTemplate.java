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

public class ServiceTemplate extends AbstractModel{

    /**
    * Protocol port instance ID, such as `ppm-f5n1f8da`.
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * Template name.
    */
    @SerializedName("ServiceTemplateName")
    @Expose
    private String ServiceTemplateName;

    /**
    * Protocol port information.
    */
    @SerializedName("ServiceSet")
    @Expose
    private String [] ServiceSet;

    /**
    * Creation Time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Protocol port template information with remarks
    */
    @SerializedName("ServiceExtraSet")
    @Expose
    private ServicesInfo [] ServiceExtraSet;

    /**
     * Get Protocol port instance ID, such as `ppm-f5n1f8da`. 
     * @return ServiceTemplateId Protocol port instance ID, such as `ppm-f5n1f8da`.
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set Protocol port instance ID, such as `ppm-f5n1f8da`.
     * @param ServiceTemplateId Protocol port instance ID, such as `ppm-f5n1f8da`.
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get Template name. 
     * @return ServiceTemplateName Template name.
     */
    public String getServiceTemplateName() {
        return this.ServiceTemplateName;
    }

    /**
     * Set Template name.
     * @param ServiceTemplateName Template name.
     */
    public void setServiceTemplateName(String ServiceTemplateName) {
        this.ServiceTemplateName = ServiceTemplateName;
    }

    /**
     * Get Protocol port information. 
     * @return ServiceSet Protocol port information.
     */
    public String [] getServiceSet() {
        return this.ServiceSet;
    }

    /**
     * Set Protocol port information.
     * @param ServiceSet Protocol port information.
     */
    public void setServiceSet(String [] ServiceSet) {
        this.ServiceSet = ServiceSet;
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
     * Get Protocol port template information with remarks 
     * @return ServiceExtraSet Protocol port template information with remarks
     */
    public ServicesInfo [] getServiceExtraSet() {
        return this.ServiceExtraSet;
    }

    /**
     * Set Protocol port template information with remarks
     * @param ServiceExtraSet Protocol port template information with remarks
     */
    public void setServiceExtraSet(ServicesInfo [] ServiceExtraSet) {
        this.ServiceExtraSet = ServiceExtraSet;
    }

    public ServiceTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceTemplate(ServiceTemplate source) {
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.ServiceTemplateName != null) {
            this.ServiceTemplateName = new String(source.ServiceTemplateName);
        }
        if (source.ServiceSet != null) {
            this.ServiceSet = new String[source.ServiceSet.length];
            for (int i = 0; i < source.ServiceSet.length; i++) {
                this.ServiceSet[i] = new String(source.ServiceSet[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ServiceExtraSet != null) {
            this.ServiceExtraSet = new ServicesInfo[source.ServiceExtraSet.length];
            for (int i = 0; i < source.ServiceExtraSet.length; i++) {
                this.ServiceExtraSet[i] = new ServicesInfo(source.ServiceExtraSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "ServiceTemplateName", this.ServiceTemplateName);
        this.setParamArraySimple(map, prefix + "ServiceSet.", this.ServiceSet);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "ServiceExtraSet.", this.ServiceExtraSet);

    }
}

