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

public class RunInstancesForNode extends AbstractModel {

    /**
    * Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER).
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1). Pass any parameter other than common parameters. ImageId will be replaced with the image corresponding to the TKE cluster operating system.
    */
    @SerializedName("RunInstancesPara")
    @Expose
    private String [] RunInstancesPara;

    /**
    * An advanced node setting. This parameter overrides the InstanceAdvancedSettings item set at the cluster level and corresponds to RunInstancesPara in a one-to-one sequential manner (currently valid for the ExtraArgs node custom parameter only).
    */
    @SerializedName("InstanceAdvancedSettingsOverrides")
    @Expose
    private InstanceAdvancedSettings [] InstanceAdvancedSettingsOverrides;

    /**
     * Get Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER). 
     * @return NodeRole Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER).
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER).
     * @param NodeRole Node role. Values: MASTER_ETCD, WORKER. You only need to specify MASTER_ETCD when creating a self-deployed cluster (INDEPENDENT_CLUSTER).
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1). Pass any parameter other than common parameters. ImageId will be replaced with the image corresponding to the TKE cluster operating system. 
     * @return RunInstancesPara Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1). Pass any parameter other than common parameters. ImageId will be replaced with the image corresponding to the TKE cluster operating system.
     */
    public String [] getRunInstancesPara() {
        return this.RunInstancesPara;
    }

    /**
     * Set Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1). Pass any parameter other than common parameters. ImageId will be replaced with the image corresponding to the TKE cluster operating system.
     * @param RunInstancesPara Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the API for [creating a CVM instance](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1). Pass any parameter other than common parameters. ImageId will be replaced with the image corresponding to the TKE cluster operating system.
     */
    public void setRunInstancesPara(String [] RunInstancesPara) {
        this.RunInstancesPara = RunInstancesPara;
    }

    /**
     * Get An advanced node setting. This parameter overrides the InstanceAdvancedSettings item set at the cluster level and corresponds to RunInstancesPara in a one-to-one sequential manner (currently valid for the ExtraArgs node custom parameter only). 
     * @return InstanceAdvancedSettingsOverrides An advanced node setting. This parameter overrides the InstanceAdvancedSettings item set at the cluster level and corresponds to RunInstancesPara in a one-to-one sequential manner (currently valid for the ExtraArgs node custom parameter only).
     */
    public InstanceAdvancedSettings [] getInstanceAdvancedSettingsOverrides() {
        return this.InstanceAdvancedSettingsOverrides;
    }

    /**
     * Set An advanced node setting. This parameter overrides the InstanceAdvancedSettings item set at the cluster level and corresponds to RunInstancesPara in a one-to-one sequential manner (currently valid for the ExtraArgs node custom parameter only).
     * @param InstanceAdvancedSettingsOverrides An advanced node setting. This parameter overrides the InstanceAdvancedSettings item set at the cluster level and corresponds to RunInstancesPara in a one-to-one sequential manner (currently valid for the ExtraArgs node custom parameter only).
     */
    public void setInstanceAdvancedSettingsOverrides(InstanceAdvancedSettings [] InstanceAdvancedSettingsOverrides) {
        this.InstanceAdvancedSettingsOverrides = InstanceAdvancedSettingsOverrides;
    }

    public RunInstancesForNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunInstancesForNode(RunInstancesForNode source) {
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.RunInstancesPara != null) {
            this.RunInstancesPara = new String[source.RunInstancesPara.length];
            for (int i = 0; i < source.RunInstancesPara.length; i++) {
                this.RunInstancesPara[i] = new String(source.RunInstancesPara[i]);
            }
        }
        if (source.InstanceAdvancedSettingsOverrides != null) {
            this.InstanceAdvancedSettingsOverrides = new InstanceAdvancedSettings[source.InstanceAdvancedSettingsOverrides.length];
            for (int i = 0; i < source.InstanceAdvancedSettingsOverrides.length; i++) {
                this.InstanceAdvancedSettingsOverrides[i] = new InstanceAdvancedSettings(source.InstanceAdvancedSettingsOverrides[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamArraySimple(map, prefix + "RunInstancesPara.", this.RunInstancesPara);
        this.setParamArrayObj(map, prefix + "InstanceAdvancedSettingsOverrides.", this.InstanceAdvancedSettingsOverrides);

    }
}

