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

public class DescribeSecurityGroupPoliciesRequest extends AbstractModel {

    /**
    * The security group instance ID, such as `sg-33ocnj9n`. It can be obtained through DescribeSecurityGroups.
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * Filters
<li>`security-group-id` - String - Security group ID in the rule.</li>
<li>`ip` - String - IP. IPV4 and IPV6 fuzzy matching is supported.</li>
<li>`address-module` - String - IP address or address group template ID.</li>
<li>`service-module` - String - Protocol port or port group template ID.</li>
<li>`protocol-type` - String - Protocol supported by the security group policy. Valid values: `TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`.</li>
<li>`port` - String - Optional - Port. Fuzzy matching is supported. Query all ports when the protocol value is `ALL`.</li>
<li>`poly` - String - Policy type. Valid values: `ALL`, `ACCEPT` and `DROP`.</li>
<li>`direction` - String - Direction of the rule. Valid values: `ALL`, `INBOUND` and `OUTBOUND`.</li>
<li>`description` - String - Policy description. Fuzzy matching is supported.</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get The security group instance ID, such as `sg-33ocnj9n`. It can be obtained through DescribeSecurityGroups. 
     * @return SecurityGroupId The security group instance ID, such as `sg-33ocnj9n`. It can be obtained through DescribeSecurityGroups.
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set The security group instance ID, such as `sg-33ocnj9n`. It can be obtained through DescribeSecurityGroups.
     * @param SecurityGroupId The security group instance ID, such as `sg-33ocnj9n`. It can be obtained through DescribeSecurityGroups.
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get Filters
<li>`security-group-id` - String - Security group ID in the rule.</li>
<li>`ip` - String - IP. IPV4 and IPV6 fuzzy matching is supported.</li>
<li>`address-module` - String - IP address or address group template ID.</li>
<li>`service-module` - String - Protocol port or port group template ID.</li>
<li>`protocol-type` - String - Protocol supported by the security group policy. Valid values: `TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`.</li>
<li>`port` - String - Optional - Port. Fuzzy matching is supported. Query all ports when the protocol value is `ALL`.</li>
<li>`poly` - String - Policy type. Valid values: `ALL`, `ACCEPT` and `DROP`.</li>
<li>`direction` - String - Direction of the rule. Valid values: `ALL`, `INBOUND` and `OUTBOUND`.</li>
<li>`description` - String - Policy description. Fuzzy matching is supported.</li> 
     * @return Filters Filters
<li>`security-group-id` - String - Security group ID in the rule.</li>
<li>`ip` - String - IP. IPV4 and IPV6 fuzzy matching is supported.</li>
<li>`address-module` - String - IP address or address group template ID.</li>
<li>`service-module` - String - Protocol port or port group template ID.</li>
<li>`protocol-type` - String - Protocol supported by the security group policy. Valid values: `TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`.</li>
<li>`port` - String - Optional - Port. Fuzzy matching is supported. Query all ports when the protocol value is `ALL`.</li>
<li>`poly` - String - Policy type. Valid values: `ALL`, `ACCEPT` and `DROP`.</li>
<li>`direction` - String - Direction of the rule. Valid values: `ALL`, `INBOUND` and `OUTBOUND`.</li>
<li>`description` - String - Policy description. Fuzzy matching is supported.</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters
<li>`security-group-id` - String - Security group ID in the rule.</li>
<li>`ip` - String - IP. IPV4 and IPV6 fuzzy matching is supported.</li>
<li>`address-module` - String - IP address or address group template ID.</li>
<li>`service-module` - String - Protocol port or port group template ID.</li>
<li>`protocol-type` - String - Protocol supported by the security group policy. Valid values: `TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`.</li>
<li>`port` - String - Optional - Port. Fuzzy matching is supported. Query all ports when the protocol value is `ALL`.</li>
<li>`poly` - String - Policy type. Valid values: `ALL`, `ACCEPT` and `DROP`.</li>
<li>`direction` - String - Direction of the rule. Valid values: `ALL`, `INBOUND` and `OUTBOUND`.</li>
<li>`description` - String - Policy description. Fuzzy matching is supported.</li>
     * @param Filters Filters
<li>`security-group-id` - String - Security group ID in the rule.</li>
<li>`ip` - String - IP. IPV4 and IPV6 fuzzy matching is supported.</li>
<li>`address-module` - String - IP address or address group template ID.</li>
<li>`service-module` - String - Protocol port or port group template ID.</li>
<li>`protocol-type` - String - Protocol supported by the security group policy. Valid values: `TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, `ALL`.</li>
<li>`port` - String - Optional - Port. Fuzzy matching is supported. Query all ports when the protocol value is `ALL`.</li>
<li>`poly` - String - Policy type. Valid values: `ALL`, `ACCEPT` and `DROP`.</li>
<li>`direction` - String - Direction of the rule. Valid values: `ALL`, `INBOUND` and `OUTBOUND`.</li>
<li>`description` - String - Policy description. Fuzzy matching is supported.</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSecurityGroupPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupPoliciesRequest(DescribeSecurityGroupPoliciesRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

