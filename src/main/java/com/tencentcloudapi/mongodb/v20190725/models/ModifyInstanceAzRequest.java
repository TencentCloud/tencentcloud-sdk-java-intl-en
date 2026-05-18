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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAzRequest extends AbstractModel {

    /**
    * <p>Instance ID, such as cmgo-p8vn****. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Availability zone ID where the primary node is located. For the method for obtaining, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
    */
    @SerializedName("PrimaryNodeZone")
    @Expose
    private String PrimaryNodeZone;

    /**
    * <p>ID list of the availability zone where the secondary node resides.<br><strong>Note</strong>: It cannot contain the availability zones where the primary node and Hidden nodes reside.</p>
    */
    @SerializedName("SecondaryNodeZone")
    @Expose
    private String [] SecondaryNodeZone;

    /**
    * <p>If the current instance has no configuration for Hidden nodes, this parameter is not required.</p>
    */
    @SerializedName("HiddenNodeZone")
    @Expose
    private String HiddenNodeZone;

    /**
    * <p>List of AZ IDs where read-only nodes reside.<br><strong>Note</strong>: If the current instance contains read-only nodes, this parameter is required.</p>
    */
    @SerializedName("ReadonlyNodeZone")
    @Expose
    private String [] ReadonlyNodeZone;

    /**
    * <p>Specify the time policy for executing the availability zone switch.</p><ul><li>0: Execute the switch immediately.</li><li>1: Execute the switch within the set maintenance window. For details, please refer to <a href="https://www.tencentcloud.com/document/product/240/19910?from_cn_redirect=1">setting instance maintenance time</a>.</li></ul>
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
     * Get <p>Instance ID, such as cmgo-p8vn****. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Instance ID, such as cmgo-p8vn****. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID, such as cmgo-p8vn****. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Instance ID, such as cmgo-p8vn****. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Availability zone ID where the primary node is located. For the method for obtaining, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p> 
     * @return PrimaryNodeZone <p>Availability zone ID where the primary node is located. For the method for obtaining, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     */
    public String getPrimaryNodeZone() {
        return this.PrimaryNodeZone;
    }

    /**
     * Set <p>Availability zone ID where the primary node is located. For the method for obtaining, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     * @param PrimaryNodeZone <p>Availability zone ID where the primary node is located. For the method for obtaining, please see <a href="https://www.tencentcloud.com/document/product/240/3637?from_cn_redirect=1">Regions and Availability Zones</a>.</p>
     */
    public void setPrimaryNodeZone(String PrimaryNodeZone) {
        this.PrimaryNodeZone = PrimaryNodeZone;
    }

    /**
     * Get <p>ID list of the availability zone where the secondary node resides.<br><strong>Note</strong>: It cannot contain the availability zones where the primary node and Hidden nodes reside.</p> 
     * @return SecondaryNodeZone <p>ID list of the availability zone where the secondary node resides.<br><strong>Note</strong>: It cannot contain the availability zones where the primary node and Hidden nodes reside.</p>
     */
    public String [] getSecondaryNodeZone() {
        return this.SecondaryNodeZone;
    }

    /**
     * Set <p>ID list of the availability zone where the secondary node resides.<br><strong>Note</strong>: It cannot contain the availability zones where the primary node and Hidden nodes reside.</p>
     * @param SecondaryNodeZone <p>ID list of the availability zone where the secondary node resides.<br><strong>Note</strong>: It cannot contain the availability zones where the primary node and Hidden nodes reside.</p>
     */
    public void setSecondaryNodeZone(String [] SecondaryNodeZone) {
        this.SecondaryNodeZone = SecondaryNodeZone;
    }

    /**
     * Get <p>If the current instance has no configuration for Hidden nodes, this parameter is not required.</p> 
     * @return HiddenNodeZone <p>If the current instance has no configuration for Hidden nodes, this parameter is not required.</p>
     */
    public String getHiddenNodeZone() {
        return this.HiddenNodeZone;
    }

    /**
     * Set <p>If the current instance has no configuration for Hidden nodes, this parameter is not required.</p>
     * @param HiddenNodeZone <p>If the current instance has no configuration for Hidden nodes, this parameter is not required.</p>
     */
    public void setHiddenNodeZone(String HiddenNodeZone) {
        this.HiddenNodeZone = HiddenNodeZone;
    }

    /**
     * Get <p>List of AZ IDs where read-only nodes reside.<br><strong>Note</strong>: If the current instance contains read-only nodes, this parameter is required.</p> 
     * @return ReadonlyNodeZone <p>List of AZ IDs where read-only nodes reside.<br><strong>Note</strong>: If the current instance contains read-only nodes, this parameter is required.</p>
     */
    public String [] getReadonlyNodeZone() {
        return this.ReadonlyNodeZone;
    }

    /**
     * Set <p>List of AZ IDs where read-only nodes reside.<br><strong>Note</strong>: If the current instance contains read-only nodes, this parameter is required.</p>
     * @param ReadonlyNodeZone <p>List of AZ IDs where read-only nodes reside.<br><strong>Note</strong>: If the current instance contains read-only nodes, this parameter is required.</p>
     */
    public void setReadonlyNodeZone(String [] ReadonlyNodeZone) {
        this.ReadonlyNodeZone = ReadonlyNodeZone;
    }

    /**
     * Get <p>Specify the time policy for executing the availability zone switch.</p><ul><li>0: Execute the switch immediately.</li><li>1: Execute the switch within the set maintenance window. For details, please refer to <a href="https://www.tencentcloud.com/document/product/240/19910?from_cn_redirect=1">setting instance maintenance time</a>.</li></ul> 
     * @return InMaintenance <p>Specify the time policy for executing the availability zone switch.</p><ul><li>0: Execute the switch immediately.</li><li>1: Execute the switch within the set maintenance window. For details, please refer to <a href="https://www.tencentcloud.com/document/product/240/19910?from_cn_redirect=1">setting instance maintenance time</a>.</li></ul>
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set <p>Specify the time policy for executing the availability zone switch.</p><ul><li>0: Execute the switch immediately.</li><li>1: Execute the switch within the set maintenance window. For details, please refer to <a href="https://www.tencentcloud.com/document/product/240/19910?from_cn_redirect=1">setting instance maintenance time</a>.</li></ul>
     * @param InMaintenance <p>Specify the time policy for executing the availability zone switch.</p><ul><li>0: Execute the switch immediately.</li><li>1: Execute the switch within the set maintenance window. For details, please refer to <a href="https://www.tencentcloud.com/document/product/240/19910?from_cn_redirect=1">setting instance maintenance time</a>.</li></ul>
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    public ModifyInstanceAzRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAzRequest(ModifyInstanceAzRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PrimaryNodeZone != null) {
            this.PrimaryNodeZone = new String(source.PrimaryNodeZone);
        }
        if (source.SecondaryNodeZone != null) {
            this.SecondaryNodeZone = new String[source.SecondaryNodeZone.length];
            for (int i = 0; i < source.SecondaryNodeZone.length; i++) {
                this.SecondaryNodeZone[i] = new String(source.SecondaryNodeZone[i]);
            }
        }
        if (source.HiddenNodeZone != null) {
            this.HiddenNodeZone = new String(source.HiddenNodeZone);
        }
        if (source.ReadonlyNodeZone != null) {
            this.ReadonlyNodeZone = new String[source.ReadonlyNodeZone.length];
            for (int i = 0; i < source.ReadonlyNodeZone.length; i++) {
                this.ReadonlyNodeZone[i] = new String(source.ReadonlyNodeZone[i]);
            }
        }
        if (source.InMaintenance != null) {
            this.InMaintenance = new Long(source.InMaintenance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PrimaryNodeZone", this.PrimaryNodeZone);
        this.setParamArraySimple(map, prefix + "SecondaryNodeZone.", this.SecondaryNodeZone);
        this.setParamSimple(map, prefix + "HiddenNodeZone", this.HiddenNodeZone);
        this.setParamArraySimple(map, prefix + "ReadonlyNodeZone.", this.ReadonlyNodeZone);
        this.setParamSimple(map, prefix + "InMaintenance", this.InMaintenance);

    }
}

