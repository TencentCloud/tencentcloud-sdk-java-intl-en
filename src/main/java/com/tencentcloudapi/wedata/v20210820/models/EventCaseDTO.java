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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventCaseDTO extends AbstractModel {

    /**
    * Event Instance ID
    */
    @SerializedName("CaseId")
    @Expose
    private String CaseId;

    /**
    * Event
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Event Format
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * Creation Time
    */
    @SerializedName("CreationTs")
    @Expose
    private String CreationTs;

    /**
    * Consumer ID
    */
    @SerializedName("ConsumerId")
    @Expose
    private String ConsumerId;

    /**
    * Description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Event Instance ID 
     * @return CaseId Event Instance ID
     */
    public String getCaseId() {
        return this.CaseId;
    }

    /**
     * Set Event Instance ID
     * @param CaseId Event Instance ID
     */
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    /**
     * Get Event 
     * @return Name Event
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Event
     * @param Name Event
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Event Format 
     * @return Dimension Event Format
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set Event Format
     * @param Dimension Event Format
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get Creation Time 
     * @return CreationTs Creation Time
     */
    public String getCreationTs() {
        return this.CreationTs;
    }

    /**
     * Set Creation Time
     * @param CreationTs Creation Time
     */
    public void setCreationTs(String CreationTs) {
        this.CreationTs = CreationTs;
    }

    /**
     * Get Consumer ID 
     * @return ConsumerId Consumer ID
     */
    public String getConsumerId() {
        return this.ConsumerId;
    }

    /**
     * Set Consumer ID
     * @param ConsumerId Consumer ID
     */
    public void setConsumerId(String ConsumerId) {
        this.ConsumerId = ConsumerId;
    }

    /**
     * Get Description 
     * @return Description Description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
     * @param Description Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public EventCaseDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventCaseDTO(EventCaseDTO source) {
        if (source.CaseId != null) {
            this.CaseId = new String(source.CaseId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.CreationTs != null) {
            this.CreationTs = new String(source.CreationTs);
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
        this.setParamSimple(map, prefix + "CreationTs", this.CreationTs);
        this.setParamSimple(map, prefix + "ConsumerId", this.ConsumerId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

