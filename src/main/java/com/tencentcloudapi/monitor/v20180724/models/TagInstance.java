/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagInstance extends AbstractModel{

    /**
    * Tag key
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Tag value
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Number of instances
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceSum")
    @Expose
    private Long InstanceSum;

    /**
    * Service type, for example, CVM
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * Region ID
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Binding status. 2: bound; 1: binding
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("BindingStatus")
    @Expose
    private Long BindingStatus;

    /**
    * Tag status. 2: existent; 1: nonexistent
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("TagStatus")
    @Expose
    private Long TagStatus;

    /**
     * Get Tag key
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Key Tag key
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Tag key
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Key Tag key
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Tag value
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Value Tag value
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Tag value
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Value Tag value
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Number of instances
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return InstanceSum Number of instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getInstanceSum() {
        return this.InstanceSum;
    }

    /**
     * Set Number of instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param InstanceSum Number of instances
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setInstanceSum(Long InstanceSum) {
        this.InstanceSum = InstanceSum;
    }

    /**
     * Get Service type, for example, CVM
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return ServiceType Service type, for example, CVM
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set Service type, for example, CVM
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param ServiceType Service type, for example, CVM
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get Region ID
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return RegionId Region ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param RegionId Region ID
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Binding status. 2: bound; 1: binding
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return BindingStatus Binding status. 2: bound; 1: binding
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getBindingStatus() {
        return this.BindingStatus;
    }

    /**
     * Set Binding status. 2: bound; 1: binding
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param BindingStatus Binding status. 2: bound; 1: binding
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setBindingStatus(Long BindingStatus) {
        this.BindingStatus = BindingStatus;
    }

    /**
     * Get Tag status. 2: existent; 1: nonexistent
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return TagStatus Tag status. 2: existent; 1: nonexistent
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getTagStatus() {
        return this.TagStatus;
    }

    /**
     * Set Tag status. 2: existent; 1: nonexistent
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param TagStatus Tag status. 2: existent; 1: nonexistent
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setTagStatus(Long TagStatus) {
        this.TagStatus = TagStatus;
    }

    public TagInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagInstance(TagInstance source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.InstanceSum != null) {
            this.InstanceSum = new Long(source.InstanceSum);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.BindingStatus != null) {
            this.BindingStatus = new Long(source.BindingStatus);
        }
        if (source.TagStatus != null) {
            this.TagStatus = new Long(source.TagStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "InstanceSum", this.InstanceSum);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "BindingStatus", this.BindingStatus);
        this.setParamSimple(map, prefix + "TagStatus", this.TagStatus);

    }
}

