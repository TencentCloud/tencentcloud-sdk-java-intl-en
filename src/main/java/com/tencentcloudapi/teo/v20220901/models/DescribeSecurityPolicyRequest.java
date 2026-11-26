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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPolicyRequest extends AbstractModel {

    /**
    * Zone ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * Security policy type. You can use the following parameter values for query: <li>ZoneDefaultPolicy: used to specify query for site-level policies;</li><li>Template: used to specify query for policy templates. The TemplateId parameter must be specified simultaneously;</li><li>Host: used to specify query for domain-level policies (Note: when using a domain name to specify a domain name service policy, only domain name services or policy templates that already have a domain-level policy applied are supported).</li>	
    */
    @SerializedName("Entity")
    @Expose
    private String Entity;

    /**
    * Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID to query template configurations.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * Specify domain name. When the value of the Entity parameter is Host, use this parameter to specify the domain-level policy to query the domain configuration. For example, use www.example.com to configure the domain-level policy for this domain.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get Zone ID. 
     * @return ZoneId Zone ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone ID.
     * @param ZoneId Zone ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get Security policy type. You can use the following parameter values for query: <li>ZoneDefaultPolicy: used to specify query for site-level policies;</li><li>Template: used to specify query for policy templates. The TemplateId parameter must be specified simultaneously;</li><li>Host: used to specify query for domain-level policies (Note: when using a domain name to specify a domain name service policy, only domain name services or policy templates that already have a domain-level policy applied are supported).</li>	 
     * @return Entity Security policy type. You can use the following parameter values for query: <li>ZoneDefaultPolicy: used to specify query for site-level policies;</li><li>Template: used to specify query for policy templates. The TemplateId parameter must be specified simultaneously;</li><li>Host: used to specify query for domain-level policies (Note: when using a domain name to specify a domain name service policy, only domain name services or policy templates that already have a domain-level policy applied are supported).</li>	
     */
    public String getEntity() {
        return this.Entity;
    }

    /**
     * Set Security policy type. You can use the following parameter values for query: <li>ZoneDefaultPolicy: used to specify query for site-level policies;</li><li>Template: used to specify query for policy templates. The TemplateId parameter must be specified simultaneously;</li><li>Host: used to specify query for domain-level policies (Note: when using a domain name to specify a domain name service policy, only domain name services or policy templates that already have a domain-level policy applied are supported).</li>	
     * @param Entity Security policy type. You can use the following parameter values for query: <li>ZoneDefaultPolicy: used to specify query for site-level policies;</li><li>Template: used to specify query for policy templates. The TemplateId parameter must be specified simultaneously;</li><li>Host: used to specify query for domain-level policies (Note: when using a domain name to specify a domain name service policy, only domain name services or policy templates that already have a domain-level policy applied are supported).</li>	
     */
    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    /**
     * Get Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID to query template configurations. 
     * @return TemplateId Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID to query template configurations.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID to query template configurations.
     * @param TemplateId Specify the policy template ID. When the Entity parameter value is Template, use this parameter to specify the policy template ID to query template configurations.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Specify domain name. When the value of the Entity parameter is Host, use this parameter to specify the domain-level policy to query the domain configuration. For example, use www.example.com to configure the domain-level policy for this domain. 
     * @return Host Specify domain name. When the value of the Entity parameter is Host, use this parameter to specify the domain-level policy to query the domain configuration. For example, use www.example.com to configure the domain-level policy for this domain.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Specify domain name. When the value of the Entity parameter is Host, use this parameter to specify the domain-level policy to query the domain configuration. For example, use www.example.com to configure the domain-level policy for this domain.
     * @param Host Specify domain name. When the value of the Entity parameter is Host, use this parameter to specify the domain-level policy to query the domain configuration. For example, use www.example.com to configure the domain-level policy for this domain.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public DescribeSecurityPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPolicyRequest(DescribeSecurityPolicyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Entity != null) {
            this.Entity = new String(source.Entity);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Entity", this.Entity);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

