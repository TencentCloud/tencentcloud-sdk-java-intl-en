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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAllocationUnitRequest extends AbstractModel {

    /**
    * ID of the modified cost allocation unit.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Modified cost allocation unit name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Modified cost allocation unit source organization name.
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * Modified allocation unit source organization ID.
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * Cost allocation unit remark description.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Month, the current month by default if not provided.
    */
    @SerializedName("Month")
    @Expose
    private String Month;

    /**
     * Get ID of the modified cost allocation unit. 
     * @return Id ID of the modified cost allocation unit.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID of the modified cost allocation unit.
     * @param Id ID of the modified cost allocation unit.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Modified cost allocation unit name. 
     * @return Name Modified cost allocation unit name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Modified cost allocation unit name.
     * @param Name Modified cost allocation unit name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Modified cost allocation unit source organization name. 
     * @return SourceName Modified cost allocation unit source organization name.
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set Modified cost allocation unit source organization name.
     * @param SourceName Modified cost allocation unit source organization name.
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get Modified allocation unit source organization ID. 
     * @return SourceId Modified allocation unit source organization ID.
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set Modified allocation unit source organization ID.
     * @param SourceId Modified allocation unit source organization ID.
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get Cost allocation unit remark description. 
     * @return Remark Cost allocation unit remark description.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Cost allocation unit remark description.
     * @param Remark Cost allocation unit remark description.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Month, the current month by default if not provided. 
     * @return Month Month, the current month by default if not provided.
     */
    public String getMonth() {
        return this.Month;
    }

    /**
     * Set Month, the current month by default if not provided.
     * @param Month Month, the current month by default if not provided.
     */
    public void setMonth(String Month) {
        this.Month = Month;
    }

    public ModifyAllocationUnitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAllocationUnitRequest(ModifyAllocationUnitRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Month != null) {
            this.Month = new String(source.Month);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Month", this.Month);

    }
}

