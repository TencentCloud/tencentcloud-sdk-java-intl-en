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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddVpcCniSubnetsRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The subnets added for the cluster container network
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * ID of the VPC where the cluster resides
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false`
    */
    @SerializedName("SkipAddingNonMasqueradeCIDRs")
    @Expose
    private Boolean SkipAddingNonMasqueradeCIDRs;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The subnets added for the cluster container network 
     * @return SubnetIds The subnets added for the cluster container network
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set The subnets added for the cluster container network
     * @param SubnetIds The subnets added for the cluster container network
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get ID of the VPC where the cluster resides 
     * @return VpcId ID of the VPC where the cluster resides
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set ID of the VPC where the cluster resides
     * @param VpcId ID of the VPC where the cluster resides
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false` 
     * @return SkipAddingNonMasqueradeCIDRs Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false`
     */
    public Boolean getSkipAddingNonMasqueradeCIDRs() {
        return this.SkipAddingNonMasqueradeCIDRs;
    }

    /**
     * Set Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false`
     * @param SkipAddingNonMasqueradeCIDRs Whether to skip adding the VPC IP range to `NonMasqueradeCIDRs` field of `ip-masq-agent-config`. Default value: `false`
     */
    public void setSkipAddingNonMasqueradeCIDRs(Boolean SkipAddingNonMasqueradeCIDRs) {
        this.SkipAddingNonMasqueradeCIDRs = SkipAddingNonMasqueradeCIDRs;
    }

    public AddVpcCniSubnetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddVpcCniSubnetsRequest(AddVpcCniSubnetsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SkipAddingNonMasqueradeCIDRs != null) {
            this.SkipAddingNonMasqueradeCIDRs = new Boolean(source.SkipAddingNonMasqueradeCIDRs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SkipAddingNonMasqueradeCIDRs", this.SkipAddingNonMasqueradeCIDRs);

    }
}

