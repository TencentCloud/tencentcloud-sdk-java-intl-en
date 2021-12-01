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

public class ModifyServiceTemplateAttributeRequest extends AbstractModel{

    /**
    * Protocol port template instance ID, such as `ppm-529nwwj8`.
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * Protocol port template name.
    */
    @SerializedName("ServiceTemplateName")
    @Expose
    private String ServiceTemplateName;

    /**
    * It supports single port, multiple ports, consecutive ports and all ports. Supported protocols include TCP, UDP, ICMP, and GRE.
    */
    @SerializedName("Services")
    @Expose
    private String [] Services;

    /**
    * Protocol port information with remarks. Supported ports include single port, multiple ports, consecutive ports and other ports. Supported protocols include TCP, UDP, ICMP, and GRE.
    */
    @SerializedName("ServicesExtra")
    @Expose
    private ServicesInfo [] ServicesExtra;

    /**
     * Get Protocol port template instance ID, such as `ppm-529nwwj8`. 
     * @return ServiceTemplateId Protocol port template instance ID, such as `ppm-529nwwj8`.
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set Protocol port template instance ID, such as `ppm-529nwwj8`.
     * @param ServiceTemplateId Protocol port template instance ID, such as `ppm-529nwwj8`.
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get Protocol port template name. 
     * @return ServiceTemplateName Protocol port template name.
     */
    public String getServiceTemplateName() {
        return this.ServiceTemplateName;
    }

    /**
     * Set Protocol port template name.
     * @param ServiceTemplateName Protocol port template name.
     */
    public void setServiceTemplateName(String ServiceTemplateName) {
        this.ServiceTemplateName = ServiceTemplateName;
    }

    /**
     * Get It supports single port, multiple ports, consecutive ports and all ports. Supported protocols include TCP, UDP, ICMP, and GRE. 
     * @return Services It supports single port, multiple ports, consecutive ports and all ports. Supported protocols include TCP, UDP, ICMP, and GRE.
     */
    public String [] getServices() {
        return this.Services;
    }

    /**
     * Set It supports single port, multiple ports, consecutive ports and all ports. Supported protocols include TCP, UDP, ICMP, and GRE.
     * @param Services It supports single port, multiple ports, consecutive ports and all ports. Supported protocols include TCP, UDP, ICMP, and GRE.
     */
    public void setServices(String [] Services) {
        this.Services = Services;
    }

    /**
     * Get Protocol port information with remarks. Supported ports include single port, multiple ports, consecutive ports and other ports. Supported protocols include TCP, UDP, ICMP, and GRE. 
     * @return ServicesExtra Protocol port information with remarks. Supported ports include single port, multiple ports, consecutive ports and other ports. Supported protocols include TCP, UDP, ICMP, and GRE.
     */
    public ServicesInfo [] getServicesExtra() {
        return this.ServicesExtra;
    }

    /**
     * Set Protocol port information with remarks. Supported ports include single port, multiple ports, consecutive ports and other ports. Supported protocols include TCP, UDP, ICMP, and GRE.
     * @param ServicesExtra Protocol port information with remarks. Supported ports include single port, multiple ports, consecutive ports and other ports. Supported protocols include TCP, UDP, ICMP, and GRE.
     */
    public void setServicesExtra(ServicesInfo [] ServicesExtra) {
        this.ServicesExtra = ServicesExtra;
    }

    public ModifyServiceTemplateAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceTemplateAttributeRequest(ModifyServiceTemplateAttributeRequest source) {
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.ServiceTemplateName != null) {
            this.ServiceTemplateName = new String(source.ServiceTemplateName);
        }
        if (source.Services != null) {
            this.Services = new String[source.Services.length];
            for (int i = 0; i < source.Services.length; i++) {
                this.Services[i] = new String(source.Services[i]);
            }
        }
        if (source.ServicesExtra != null) {
            this.ServicesExtra = new ServicesInfo[source.ServicesExtra.length];
            for (int i = 0; i < source.ServicesExtra.length; i++) {
                this.ServicesExtra[i] = new ServicesInfo(source.ServicesExtra[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "ServiceTemplateName", this.ServiceTemplateName);
        this.setParamArraySimple(map, prefix + "Services.", this.Services);
        this.setParamArrayObj(map, prefix + "ServicesExtra.", this.ServicesExtra);

    }
}

