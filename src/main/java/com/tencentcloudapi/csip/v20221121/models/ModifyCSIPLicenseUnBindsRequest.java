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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCSIPLicenseUnBindsRequest extends AbstractModel {

    /**
    * <p>Instance ID list to be unbound (can be omitted when IsAll=true)</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>Whether to unbind all machines bound with host authorization</p>
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
     * Get <p>Instance ID list to be unbound (can be omitted when IsAll=true)</p> 
     * @return InstanceIDs <p>Instance ID list to be unbound (can be omitted when IsAll=true)</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>Instance ID list to be unbound (can be omitted when IsAll=true)</p>
     * @param InstanceIDs <p>Instance ID list to be unbound (can be omitted when IsAll=true)</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>Whether to unbind all machines bound with host authorization</p> 
     * @return IsAll <p>Whether to unbind all machines bound with host authorization</p>
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set <p>Whether to unbind all machines bound with host authorization</p>
     * @param IsAll <p>Whether to unbind all machines bound with host authorization</p>
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    public ModifyCSIPLicenseUnBindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCSIPLicenseUnBindsRequest(ModifyCSIPLicenseUnBindsRequest source) {
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);

    }
}

