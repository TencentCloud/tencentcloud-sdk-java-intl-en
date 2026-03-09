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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterCodeInfo extends AbstractModel {

    /**
    * Registration code ID.
    */
    @SerializedName("RegisterCodeId")
    @Expose
    private String RegisterCodeId;

    /**
    * Describes the registration code.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Prefix of the registered instance name.
    */
    @SerializedName("InstanceNamePrefix")
    @Expose
    private String InstanceNamePrefix;

    /**
    * The number of instances the registration code allows.
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
    * The expiry date of the registration code is in ISO8601 standard representation and uses UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * The registration code limits tat_agent to register only from the public outbound ip described by IpAddressRange.
    */
    @SerializedName("IpAddressRange")
    @Expose
    private String IpAddressRange;

    /**
    * Is the registration code available.
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * The number of registered registration codes.
    */
    @SerializedName("RegisteredCount")
    @Expose
    private Long RegisteredCount;

    /**
    * Registration code creation time, represented as ISO8601 standard and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Last update time of the registration code, as ISO8601 standard representation and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
     * Get Registration code ID. 
     * @return RegisterCodeId Registration code ID.
     */
    public String getRegisterCodeId() {
        return this.RegisterCodeId;
    }

    /**
     * Set Registration code ID.
     * @param RegisterCodeId Registration code ID.
     */
    public void setRegisterCodeId(String RegisterCodeId) {
        this.RegisterCodeId = RegisterCodeId;
    }

    /**
     * Get Describes the registration code. 
     * @return Description Describes the registration code.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Describes the registration code.
     * @param Description Describes the registration code.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Prefix of the registered instance name. 
     * @return InstanceNamePrefix Prefix of the registered instance name.
     */
    public String getInstanceNamePrefix() {
        return this.InstanceNamePrefix;
    }

    /**
     * Set Prefix of the registered instance name.
     * @param InstanceNamePrefix Prefix of the registered instance name.
     */
    public void setInstanceNamePrefix(String InstanceNamePrefix) {
        this.InstanceNamePrefix = InstanceNamePrefix;
    }

    /**
     * Get The number of instances the registration code allows. 
     * @return RegisterLimit The number of instances the registration code allows.
     */
    public Long getRegisterLimit() {
        return this.RegisterLimit;
    }

    /**
     * Set The number of instances the registration code allows.
     * @param RegisterLimit The number of instances the registration code allows.
     */
    public void setRegisterLimit(Long RegisterLimit) {
        this.RegisterLimit = RegisterLimit;
    }

    /**
     * Get The expiry date of the registration code is in ISO8601 standard representation and uses UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpiredTime The expiry date of the registration code is in ISO8601 standard representation and uses UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set The expiry date of the registration code is in ISO8601 standard representation and uses UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpiredTime The expiry date of the registration code is in ISO8601 standard representation and uses UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get The registration code limits tat_agent to register only from the public outbound ip described by IpAddressRange. 
     * @return IpAddressRange The registration code limits tat_agent to register only from the public outbound ip described by IpAddressRange.
     */
    public String getIpAddressRange() {
        return this.IpAddressRange;
    }

    /**
     * Set The registration code limits tat_agent to register only from the public outbound ip described by IpAddressRange.
     * @param IpAddressRange The registration code limits tat_agent to register only from the public outbound ip described by IpAddressRange.
     */
    public void setIpAddressRange(String IpAddressRange) {
        this.IpAddressRange = IpAddressRange;
    }

    /**
     * Get Is the registration code available. 
     * @return Enabled Is the registration code available.
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Is the registration code available.
     * @param Enabled Is the registration code available.
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get The number of registered registration codes. 
     * @return RegisteredCount The number of registered registration codes.
     */
    public Long getRegisteredCount() {
        return this.RegisteredCount;
    }

    /**
     * Set The number of registered registration codes.
     * @param RegisteredCount The number of registered registration codes.
     */
    public void setRegisteredCount(Long RegisteredCount) {
        this.RegisteredCount = RegisteredCount;
    }

    /**
     * Get Registration code creation time, represented as ISO8601 standard and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreatedTime Registration code creation time, represented as ISO8601 standard and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Registration code creation time, represented as ISO8601 standard and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreatedTime Registration code creation time, represented as ISO8601 standard and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Last update time of the registration code, as ISO8601 standard representation and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdatedTime Last update time of the registration code, as ISO8601 standard representation and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set Last update time of the registration code, as ISO8601 standard representation and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdatedTime Last update time of the registration code, as ISO8601 standard representation and using UTC time. 
The format is YYYY-MM-DDThh:MM:ssZ.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public RegisterCodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterCodeInfo(RegisterCodeInfo source) {
        if (source.RegisterCodeId != null) {
            this.RegisterCodeId = new String(source.RegisterCodeId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InstanceNamePrefix != null) {
            this.InstanceNamePrefix = new String(source.InstanceNamePrefix);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.IpAddressRange != null) {
            this.IpAddressRange = new String(source.IpAddressRange);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.RegisteredCount != null) {
            this.RegisteredCount = new Long(source.RegisteredCount);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegisterCodeId", this.RegisterCodeId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InstanceNamePrefix", this.InstanceNamePrefix);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "IpAddressRange", this.IpAddressRange);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "RegisteredCount", this.RegisteredCount);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);

    }
}

