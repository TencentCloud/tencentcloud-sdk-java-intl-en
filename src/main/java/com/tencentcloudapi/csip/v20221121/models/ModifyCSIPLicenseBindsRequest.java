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

public class ModifyCSIPLicenseBindsRequest extends AbstractModel {

    /**
    * <p>Resource ID (designated binding to which order)</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>List of instance IDs to be bound (optional when IsAll=true)</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>Whether to bind all unbound machines (when true, the difference is automatically calculated)</p>
    */
    @SerializedName("IsAll")
    @Expose
    private Boolean IsAll;

    /**
    * <p>Authorized version. Enumeration values: ENTERPRISE_HP (flagship edition) / ADVANCED_HP (pro edition) / RASP (RASP). It is recommended to use this parameter. Choose either this parameter or InquireKey.</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
     * Get <p>Resource ID (designated binding to which order)</p> 
     * @return ResourceId <p>Resource ID (designated binding to which order)</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource ID (designated binding to which order)</p>
     * @param ResourceId <p>Resource ID (designated binding to which order)</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>List of instance IDs to be bound (optional when IsAll=true)</p> 
     * @return InstanceIDs <p>List of instance IDs to be bound (optional when IsAll=true)</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>List of instance IDs to be bound (optional when IsAll=true)</p>
     * @param InstanceIDs <p>List of instance IDs to be bound (optional when IsAll=true)</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>Whether to bind all unbound machines (when true, the difference is automatically calculated)</p> 
     * @return IsAll <p>Whether to bind all unbound machines (when true, the difference is automatically calculated)</p>
     */
    public Boolean getIsAll() {
        return this.IsAll;
    }

    /**
     * Set <p>Whether to bind all unbound machines (when true, the difference is automatically calculated)</p>
     * @param IsAll <p>Whether to bind all unbound machines (when true, the difference is automatically calculated)</p>
     */
    public void setIsAll(Boolean IsAll) {
        this.IsAll = IsAll;
    }

    /**
     * Get <p>Authorized version. Enumeration values: ENTERPRISE_HP (flagship edition) / ADVANCED_HP (pro edition) / RASP (RASP). It is recommended to use this parameter. Choose either this parameter or InquireKey.</p> 
     * @return LicenseType <p>Authorized version. Enumeration values: ENTERPRISE_HP (flagship edition) / ADVANCED_HP (pro edition) / RASP (RASP). It is recommended to use this parameter. Choose either this parameter or InquireKey.</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>Authorized version. Enumeration values: ENTERPRISE_HP (flagship edition) / ADVANCED_HP (pro edition) / RASP (RASP). It is recommended to use this parameter. Choose either this parameter or InquireKey.</p>
     * @param LicenseType <p>Authorized version. Enumeration values: ENTERPRISE_HP (flagship edition) / ADVANCED_HP (pro edition) / RASP (RASP). It is recommended to use this parameter. Choose either this parameter or InquireKey.</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    public ModifyCSIPLicenseBindsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCSIPLicenseBindsRequest(ModifyCSIPLicenseBindsRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.IsAll != null) {
            this.IsAll = new Boolean(source.IsAll);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamSimple(map, prefix + "IsAll", this.IsAll);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);

    }
}

