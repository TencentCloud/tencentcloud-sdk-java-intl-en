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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GovernanceLaneRule extends AbstractModel {

    /**
    * Lane rule ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * lane name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Swimlane group of the lane
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LaneGroup")
    @Expose
    private String LaneGroup;

    /**
    * Rule Enable Status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * Traffic Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrafficLabels")
    @Expose
    private Argument [] TrafficLabels;

    /**
    * Multiple traffic tag matching methods
AND
OR
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrafficMatchMode")
    @Expose
    private String TrafficMatchMode;

    /**
    * Lane match mode
STRICT: Strict match
PERMISSIVE: Loose match
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LaneMatchMode")
    @Expose
    private String LaneMatchMode;

    /**
    * Lane grayscale rule
    */
    @SerializedName("TrafficGray")
    @Expose
    private TrafficGray TrafficGray;

    /**
    * Lane rule description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Lane tag content
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LaneLabelValue")
    @Expose
    private String LaneLabelValue;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Enabling time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
    * Modification time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Lane rule priority
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Rule abstract
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
     * Get Lane rule ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ID Lane rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Lane rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ID Lane rule ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get lane name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name lane name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set lane name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name lane name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Swimlane group of the lane
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LaneGroup Swimlane group of the lane
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLaneGroup() {
        return this.LaneGroup;
    }

    /**
     * Set Swimlane group of the lane
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LaneGroup Swimlane group of the lane
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLaneGroup(String LaneGroup) {
        this.LaneGroup = LaneGroup;
    }

    /**
     * Get Rule Enable Status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enable Rule Enable Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Rule Enable Status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enable Rule Enable Status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get Traffic Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrafficLabels Traffic Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Argument [] getTrafficLabels() {
        return this.TrafficLabels;
    }

    /**
     * Set Traffic Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrafficLabels Traffic Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrafficLabels(Argument [] TrafficLabels) {
        this.TrafficLabels = TrafficLabels;
    }

    /**
     * Get Multiple traffic tag matching methods
AND
OR
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrafficMatchMode Multiple traffic tag matching methods
AND
OR
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTrafficMatchMode() {
        return this.TrafficMatchMode;
    }

    /**
     * Set Multiple traffic tag matching methods
AND
OR
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrafficMatchMode Multiple traffic tag matching methods
AND
OR
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrafficMatchMode(String TrafficMatchMode) {
        this.TrafficMatchMode = TrafficMatchMode;
    }

    /**
     * Get Lane match mode
STRICT: Strict match
PERMISSIVE: Loose match
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LaneMatchMode Lane match mode
STRICT: Strict match
PERMISSIVE: Loose match
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLaneMatchMode() {
        return this.LaneMatchMode;
    }

    /**
     * Set Lane match mode
STRICT: Strict match
PERMISSIVE: Loose match
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LaneMatchMode Lane match mode
STRICT: Strict match
PERMISSIVE: Loose match
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLaneMatchMode(String LaneMatchMode) {
        this.LaneMatchMode = LaneMatchMode;
    }

    /**
     * Get Lane grayscale rule 
     * @return TrafficGray Lane grayscale rule
     */
    public TrafficGray getTrafficGray() {
        return this.TrafficGray;
    }

    /**
     * Set Lane grayscale rule
     * @param TrafficGray Lane grayscale rule
     */
    public void setTrafficGray(TrafficGray TrafficGray) {
        this.TrafficGray = TrafficGray;
    }

    /**
     * Get Lane rule description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Lane rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Lane rule description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Lane rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Lane tag content
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LaneLabelValue Lane tag content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLaneLabelValue() {
        return this.LaneLabelValue;
    }

    /**
     * Set Lane tag content
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LaneLabelValue Lane tag content
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLaneLabelValue(String LaneLabelValue) {
        this.LaneLabelValue = LaneLabelValue;
    }

    /**
     * Get Creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Enabling time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnableTime Enabling time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set Enabling time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnableTime Enabling time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
    }

    /**
     * Get Modification time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModifyTime Modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModifyTime Modification time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Lane rule priority
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Priority Lane rule priority
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Lane rule priority
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Priority Lane rule priority
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Rule abstract
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Revision Rule abstract
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set Rule abstract
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Revision Rule abstract
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
    }

    public GovernanceLaneRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GovernanceLaneRule(GovernanceLaneRule source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LaneGroup != null) {
            this.LaneGroup = new String(source.LaneGroup);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.TrafficLabels != null) {
            this.TrafficLabels = new Argument[source.TrafficLabels.length];
            for (int i = 0; i < source.TrafficLabels.length; i++) {
                this.TrafficLabels[i] = new Argument(source.TrafficLabels[i]);
            }
        }
        if (source.TrafficMatchMode != null) {
            this.TrafficMatchMode = new String(source.TrafficMatchMode);
        }
        if (source.LaneMatchMode != null) {
            this.LaneMatchMode = new String(source.LaneMatchMode);
        }
        if (source.TrafficGray != null) {
            this.TrafficGray = new TrafficGray(source.TrafficGray);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.LaneLabelValue != null) {
            this.LaneLabelValue = new String(source.LaneLabelValue);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EnableTime != null) {
            this.EnableTime = new String(source.EnableTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Revision != null) {
            this.Revision = new String(source.Revision);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LaneGroup", this.LaneGroup);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArrayObj(map, prefix + "TrafficLabels.", this.TrafficLabels);
        this.setParamSimple(map, prefix + "TrafficMatchMode", this.TrafficMatchMode);
        this.setParamSimple(map, prefix + "LaneMatchMode", this.LaneMatchMode);
        this.setParamObj(map, prefix + "TrafficGray.", this.TrafficGray);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "LaneLabelValue", this.LaneLabelValue);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Revision", this.Revision);

    }
}

