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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessRule extends AbstractModel {

    /**
    * Permission rule ID
    */
    @SerializedName("AccessRuleId")
    @Expose
    private Long AccessRuleId;

    /**
    * Permission rule address (IP range or IP)
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Permission rule access mode (1: read-only; 2: read-write)
    */
    @SerializedName("AccessMode")
    @Expose
    private Long AccessMode;

    /**
    * Priority (value range: 1–100. The smaller the value, the higher the priority)
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Permission rule ID 
     * @return AccessRuleId Permission rule ID
     */
    public Long getAccessRuleId() {
        return this.AccessRuleId;
    }

    /**
     * Set Permission rule ID
     * @param AccessRuleId Permission rule ID
     */
    public void setAccessRuleId(Long AccessRuleId) {
        this.AccessRuleId = AccessRuleId;
    }

    /**
     * Get Permission rule address (IP range or IP) 
     * @return Address Permission rule address (IP range or IP)
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Permission rule address (IP range or IP)
     * @param Address Permission rule address (IP range or IP)
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Permission rule access mode (1: read-only; 2: read-write) 
     * @return AccessMode Permission rule access mode (1: read-only; 2: read-write)
     */
    public Long getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set Permission rule access mode (1: read-only; 2: read-write)
     * @param AccessMode Permission rule access mode (1: read-only; 2: read-write)
     */
    public void setAccessMode(Long AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get Priority (value range: 1–100. The smaller the value, the higher the priority) 
     * @return Priority Priority (value range: 1–100. The smaller the value, the higher the priority)
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority (value range: 1–100. The smaller the value, the higher the priority)
     * @param Priority Priority (value range: 1–100. The smaller the value, the higher the priority)
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public AccessRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessRule(AccessRule source) {
        if (source.AccessRuleId != null) {
            this.AccessRuleId = new Long(source.AccessRuleId);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new Long(source.AccessMode);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessRuleId", this.AccessRuleId);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

