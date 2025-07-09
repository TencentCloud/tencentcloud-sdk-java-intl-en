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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventCaseOpsDto extends AbstractModel {

    /**
    * Case ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CaseId")
    @Expose
    private String CaseId;

    /**
    * Case Name
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * time format
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private String CreationTimestamp;

    /**
    * Consumer ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * DescriptionNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Case ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return CaseId Case ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCaseId() {
        return this.CaseId;
    }

    /**
     * Set Case ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param CaseId Case ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    /**
     * Get Case Name
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Name Case Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Case Name
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Name Case Name
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get time format
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Dimension time format
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set time format
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Dimension time format
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get Creation TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return CreationTimestamp Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param CreationTimestamp Creation TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setCreationTimestamp(String CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    /**
     * Get Consumer ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ConsumerId Consumer ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set Consumer ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ConsumerId Consumer ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get DescriptionNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Description DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     * @param Description DescriptionNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public EventCaseOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventCaseOpsDto(EventCaseOpsDto source) {
        if (source.CaseId != null) {
            this.CaseId = new String(source.CaseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new String(source.CreationTimestamp);
        }
        if (source.ConsumerId != null) {
            this.ConsumerId = new String(source.ConsumerId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseId", this.CaseId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

