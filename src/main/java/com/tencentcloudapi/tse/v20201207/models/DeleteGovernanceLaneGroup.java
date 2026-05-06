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

public class DeleteGovernanceLaneGroup extends AbstractModel {

    /**
    * lane name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Lane group ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Lane entry service list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TrafficEntries")
    @Expose
    private LaneTrafficEntry [] TrafficEntries;

    /**
    * Lane service list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Destinations")
    @Expose
    private GovernanceServiceDestination [] Destinations;

    /**
    * Lane group description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Rule content summary
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Revision")
    @Expose
    private String Revision;

    /**
    * Creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Rule consistency status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Consistency")
    @Expose
    private String Consistency;

    /**
    * Lane rule list
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Rules")
    @Expose
    private GovernanceLaneRule [] Rules;

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
     * Get Lane group ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ID Lane group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set Lane group ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ID Lane group ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Lane entry service list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TrafficEntries Lane entry service list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public LaneTrafficEntry [] getTrafficEntries() {
        return this.TrafficEntries;
    }

    /**
     * Set Lane entry service list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TrafficEntries Lane entry service list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTrafficEntries(LaneTrafficEntry [] TrafficEntries) {
        this.TrafficEntries = TrafficEntries;
    }

    /**
     * Get Lane service list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Destinations Lane service list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public GovernanceServiceDestination [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set Lane service list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Destinations Lane service list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDestinations(GovernanceServiceDestination [] Destinations) {
        this.Destinations = Destinations;
    }

    /**
     * Get Lane group description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Lane group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Lane group description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Lane group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Rule content summary
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Revision Rule content summary
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRevision() {
        return this.Revision;
    }

    /**
     * Set Rule content summary
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Revision Rule content summary
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRevision(String Revision) {
        this.Revision = Revision;
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
     * Get Rule consistency status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Consistency Rule consistency status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getConsistency() {
        return this.Consistency;
    }

    /**
     * Set Rule consistency status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Consistency Rule consistency status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConsistency(String Consistency) {
        this.Consistency = Consistency;
    }

    /**
     * Get Lane rule list
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Rules Lane rule list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public GovernanceLaneRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Lane rule list
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Rules Lane rule list
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRules(GovernanceLaneRule [] Rules) {
        this.Rules = Rules;
    }

    public DeleteGovernanceLaneGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGovernanceLaneGroup(DeleteGovernanceLaneGroup source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.TrafficEntries != null) {
            this.TrafficEntries = new LaneTrafficEntry[source.TrafficEntries.length];
            for (int i = 0; i < source.TrafficEntries.length; i++) {
                this.TrafficEntries[i] = new LaneTrafficEntry(source.TrafficEntries[i]);
            }
        }
        if (source.Destinations != null) {
            this.Destinations = new GovernanceServiceDestination[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new GovernanceServiceDestination(source.Destinations[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Revision != null) {
            this.Revision = new String(source.Revision);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Consistency != null) {
            this.Consistency = new String(source.Consistency);
        }
        if (source.Rules != null) {
            this.Rules = new GovernanceLaneRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new GovernanceLaneRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArrayObj(map, prefix + "TrafficEntries.", this.TrafficEntries);
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Revision", this.Revision);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Consistency", this.Consistency);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

