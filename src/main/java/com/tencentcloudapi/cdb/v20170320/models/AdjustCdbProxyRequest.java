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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdjustCdbProxyRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Node specification configuration
Remark: Database proxy supported node specifications are 2C4000MB, 4C8000MB, 8C16000MB.
Parameter description in the example.
NodeCount: Number of nodes
Region: Node region
Zone: Node availability zone
Cpu: Number of node cores for one agent (Unit: core)
Mem: Memory size of each proxy node (unit: MB)
    */
    @SerializedName("ProxyNodeCustom")
    @Expose
    private ProxyNodeCustom [] ProxyNodeCustom;

    /**
    * Rebalance. Valid values:  `auto` (automatic), `manual` (manual).
    */
    @SerializedName("ReloadBalance")
    @Expose
    private String ReloadBalance;

    /**
    * The upgrade switch time. Valid values:  `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time).
    */
    @SerializedName("UpgradeTime")
    @Expose
    private String UpgradeTime;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API. 
     * @return ProxyGroupId Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     * @param ProxyGroupId Proxy group ID, which can be obtained through the [DescribeCdbProxyInfo](https://www.tencentcloud.com/document/api/236/90585?from_cn_redirect=1) API.
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get Node specification configuration
Remark: Database proxy supported node specifications are 2C4000MB, 4C8000MB, 8C16000MB.
Parameter description in the example.
NodeCount: Number of nodes
Region: Node region
Zone: Node availability zone
Cpu: Number of node cores for one agent (Unit: core)
Mem: Memory size of each proxy node (unit: MB) 
     * @return ProxyNodeCustom Node specification configuration
Remark: Database proxy supported node specifications are 2C4000MB, 4C8000MB, 8C16000MB.
Parameter description in the example.
NodeCount: Number of nodes
Region: Node region
Zone: Node availability zone
Cpu: Number of node cores for one agent (Unit: core)
Mem: Memory size of each proxy node (unit: MB)
     */
    public ProxyNodeCustom [] getProxyNodeCustom() {
        return this.ProxyNodeCustom;
    }

    /**
     * Set Node specification configuration
Remark: Database proxy supported node specifications are 2C4000MB, 4C8000MB, 8C16000MB.
Parameter description in the example.
NodeCount: Number of nodes
Region: Node region
Zone: Node availability zone
Cpu: Number of node cores for one agent (Unit: core)
Mem: Memory size of each proxy node (unit: MB)
     * @param ProxyNodeCustom Node specification configuration
Remark: Database proxy supported node specifications are 2C4000MB, 4C8000MB, 8C16000MB.
Parameter description in the example.
NodeCount: Number of nodes
Region: Node region
Zone: Node availability zone
Cpu: Number of node cores for one agent (Unit: core)
Mem: Memory size of each proxy node (unit: MB)
     */
    public void setProxyNodeCustom(ProxyNodeCustom [] ProxyNodeCustom) {
        this.ProxyNodeCustom = ProxyNodeCustom;
    }

    /**
     * Get Rebalance. Valid values:  `auto` (automatic), `manual` (manual). 
     * @return ReloadBalance Rebalance. Valid values:  `auto` (automatic), `manual` (manual).
     */
    public String getReloadBalance() {
        return this.ReloadBalance;
    }

    /**
     * Set Rebalance. Valid values:  `auto` (automatic), `manual` (manual).
     * @param ReloadBalance Rebalance. Valid values:  `auto` (automatic), `manual` (manual).
     */
    public void setReloadBalance(String ReloadBalance) {
        this.ReloadBalance = ReloadBalance;
    }

    /**
     * Get The upgrade switch time. Valid values:  `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time). 
     * @return UpgradeTime The upgrade switch time. Valid values:  `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time).
     */
    public String getUpgradeTime() {
        return this.UpgradeTime;
    }

    /**
     * Set The upgrade switch time. Valid values:  `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time).
     * @param UpgradeTime The upgrade switch time. Valid values:  `nowTime` (upgrade immediately), `timeWindow` (upgrade during instance maintenance time).
     */
    public void setUpgradeTime(String UpgradeTime) {
        this.UpgradeTime = UpgradeTime;
    }

    public AdjustCdbProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdjustCdbProxyRequest(AdjustCdbProxyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyNodeCustom != null) {
            this.ProxyNodeCustom = new ProxyNodeCustom[source.ProxyNodeCustom.length];
            for (int i = 0; i < source.ProxyNodeCustom.length; i++) {
                this.ProxyNodeCustom[i] = new ProxyNodeCustom(source.ProxyNodeCustom[i]);
            }
        }
        if (source.ReloadBalance != null) {
            this.ReloadBalance = new String(source.ReloadBalance);
        }
        if (source.UpgradeTime != null) {
            this.UpgradeTime = new String(source.UpgradeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamArrayObj(map, prefix + "ProxyNodeCustom.", this.ProxyNodeCustom);
        this.setParamSimple(map, prefix + "ReloadBalance", this.ReloadBalance);
        this.setParamSimple(map, prefix + "UpgradeTime", this.UpgradeTime);

    }
}

