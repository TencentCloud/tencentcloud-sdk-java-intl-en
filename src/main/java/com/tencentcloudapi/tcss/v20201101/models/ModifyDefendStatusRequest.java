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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDefendStatusRequest extends AbstractModel {

    /**
    * Whether to enable protection.
    */
    @SerializedName("SwitchOn")
    @Expose
    private Boolean SwitchOn;

    /**
    * Instance type. Valid values:<li>Cluster;</li> <li>Node.</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Whether all instances are involved.
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * Instance ID list
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
     * Get Whether to enable protection. 
     * @return SwitchOn Whether to enable protection.
     */
    public Boolean getSwitchOn() {
        return this.SwitchOn;
    }

    /**
     * Set Whether to enable protection.
     * @param SwitchOn Whether to enable protection.
     */
    public void setSwitchOn(Boolean SwitchOn) {
        this.SwitchOn = SwitchOn;
    }

    /**
     * Get Instance type. Valid values:<li>Cluster;</li> <li>Node.</li> 
     * @return InstanceType Instance type. Valid values:<li>Cluster;</li> <li>Node.</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type. Valid values:<li>Cluster;</li> <li>Node.</li>
     * @param InstanceType Instance type. Valid values:<li>Cluster;</li> <li>Node.</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Whether all instances are involved. 
     * @return IsAll Whether all instances are involved.
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set Whether all instances are involved.
     * @param IsAll Whether all instances are involved.
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get Instance ID list 
     * @return InstanceIDs Instance ID list
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set Instance ID list
     * @param InstanceIDs Instance ID list
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    public ModifyDefendStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDefendStatusRequest(ModifyDefendStatusRequest source) {
        if (source.SwitchOn != null) {
            this.SwitchOn = new Boolean(source.SwitchOn);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchOn", this.SwitchOn);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);

    }
}

