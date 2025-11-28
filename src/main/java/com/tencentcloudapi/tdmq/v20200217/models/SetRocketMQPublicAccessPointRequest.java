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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetRocketMQPublicAccessPointRequest extends AbstractModel {

    /**
    * Cluster ID. Currently, the system only supports dedicated clusters.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Enable or Disable Access
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Bandwidth size, in Mbps. It must be specified when you enable or adjust the public network access.
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * Payment mode, which must be specified when you enabled the public network access. 0 means hourly billing, and 1 means annual and monthly subscription. Currently, only hourly billing is supported.
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Public network access security rule list, which must be provided when Enabled is true.
    */
    @SerializedName("Rules")
    @Expose
    private PublicAccessRule [] Rules;

    /**
    * Whether public network is billed by traffic.
    */
    @SerializedName("BillingFlow")
    @Expose
    private Boolean BillingFlow;

    /**
     * Get Cluster ID. Currently, the system only supports dedicated clusters. 
     * @return InstanceId Cluster ID. Currently, the system only supports dedicated clusters.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster ID. Currently, the system only supports dedicated clusters.
     * @param InstanceId Cluster ID. Currently, the system only supports dedicated clusters.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Enable or Disable Access 
     * @return Enabled Enable or Disable Access
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Enable or Disable Access
     * @param Enabled Enable or Disable Access
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Bandwidth size, in Mbps. It must be specified when you enable or adjust the public network access. 
     * @return Bandwidth Bandwidth size, in Mbps. It must be specified when you enable or adjust the public network access.
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set Bandwidth size, in Mbps. It must be specified when you enable or adjust the public network access.
     * @param Bandwidth Bandwidth size, in Mbps. It must be specified when you enable or adjust the public network access.
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get Payment mode, which must be specified when you enabled the public network access. 0 means hourly billing, and 1 means annual and monthly subscription. Currently, only hourly billing is supported. 
     * @return PayMode Payment mode, which must be specified when you enabled the public network access. 0 means hourly billing, and 1 means annual and monthly subscription. Currently, only hourly billing is supported.
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Payment mode, which must be specified when you enabled the public network access. 0 means hourly billing, and 1 means annual and monthly subscription. Currently, only hourly billing is supported.
     * @param PayMode Payment mode, which must be specified when you enabled the public network access. 0 means hourly billing, and 1 means annual and monthly subscription. Currently, only hourly billing is supported.
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Public network access security rule list, which must be provided when Enabled is true. 
     * @return Rules Public network access security rule list, which must be provided when Enabled is true.
     */
    public PublicAccessRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Public network access security rule list, which must be provided when Enabled is true.
     * @param Rules Public network access security rule list, which must be provided when Enabled is true.
     */
    public void setRules(PublicAccessRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Whether public network is billed by traffic. 
     * @return BillingFlow Whether public network is billed by traffic.
     */
    public Boolean getBillingFlow() {
        return this.BillingFlow;
    }

    /**
     * Set Whether public network is billed by traffic.
     * @param BillingFlow Whether public network is billed by traffic.
     */
    public void setBillingFlow(Boolean BillingFlow) {
        this.BillingFlow = BillingFlow;
    }

    public SetRocketMQPublicAccessPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetRocketMQPublicAccessPointRequest(SetRocketMQPublicAccessPointRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Rules != null) {
            this.Rules = new PublicAccessRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new PublicAccessRule(source.Rules[i]);
            }
        }
        if (source.BillingFlow != null) {
            this.BillingFlow = new Boolean(source.BillingFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "BillingFlow", this.BillingFlow);

    }
}

