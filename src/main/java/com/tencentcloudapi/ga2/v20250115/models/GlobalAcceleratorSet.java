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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GlobalAcceleratorSet extends AbstractModel {

    /**
    * <p>Global acceleration instance ID.</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>Global acceleration instance name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Global acceleration instance description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Instance creation time of the global acceleration instance.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Global acceleration instance status.</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>Billing type of a global acceleration instance.</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>DDoS ID of the global acceleration instance.</p>
    */
    @SerializedName("DdosId")
    @Expose
    private String DdosId;

    /**
    * <p>Number of listeners of the associated acceleration instance.</p>
    */
    @SerializedName("ListenerCounts")
    @Expose
    private Long ListenerCounts;

    /**
    * <p>Count of acceleration regions belonging to the acceleration instance.</p>
    */
    @SerializedName("AcceleratorAreaCounts")
    @Expose
    private Long AcceleratorAreaCounts;

    /**
    * <p>Global acceleration instance status.</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Domain name.</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>Cross-border type; HighQuality (high-quality cross-border), Unicom (China Unicom cross-border), NotAvailable (not enabled).</p>
    */
    @SerializedName("CrossBorderType")
    @Expose
    private String CrossBorderType;

    /**
    * <p>Tag information.</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get <p>Global acceleration instance ID.</p> 
     * @return GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Global acceleration instance ID.</p>
     * @param GlobalAcceleratorId <p>Global acceleration instance ID.</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>Global acceleration instance name.</p> 
     * @return Name <p>Global acceleration instance name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Global acceleration instance name.</p>
     * @param Name <p>Global acceleration instance name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Global acceleration instance description.</p> 
     * @return Description <p>Global acceleration instance description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Global acceleration instance description.</p>
     * @param Description <p>Global acceleration instance description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Instance creation time of the global acceleration instance.</p> 
     * @return CreateTime <p>Instance creation time of the global acceleration instance.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Instance creation time of the global acceleration instance.</p>
     * @param CreateTime <p>Instance creation time of the global acceleration instance.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Global acceleration instance status.</p> 
     * @return State <p>Global acceleration instance status.</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>Global acceleration instance status.</p>
     * @param State <p>Global acceleration instance status.</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>Billing type of a global acceleration instance.</p> 
     * @return InstanceChargeType <p>Billing type of a global acceleration instance.</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>Billing type of a global acceleration instance.</p>
     * @param InstanceChargeType <p>Billing type of a global acceleration instance.</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>DDoS ID of the global acceleration instance.</p> 
     * @return DdosId <p>DDoS ID of the global acceleration instance.</p>
     */
    public String getDdosId() {
        return this.DdosId;
    }

    /**
     * Set <p>DDoS ID of the global acceleration instance.</p>
     * @param DdosId <p>DDoS ID of the global acceleration instance.</p>
     */
    public void setDdosId(String DdosId) {
        this.DdosId = DdosId;
    }

    /**
     * Get <p>Number of listeners of the associated acceleration instance.</p> 
     * @return ListenerCounts <p>Number of listeners of the associated acceleration instance.</p>
     */
    public Long getListenerCounts() {
        return this.ListenerCounts;
    }

    /**
     * Set <p>Number of listeners of the associated acceleration instance.</p>
     * @param ListenerCounts <p>Number of listeners of the associated acceleration instance.</p>
     */
    public void setListenerCounts(Long ListenerCounts) {
        this.ListenerCounts = ListenerCounts;
    }

    /**
     * Get <p>Count of acceleration regions belonging to the acceleration instance.</p> 
     * @return AcceleratorAreaCounts <p>Count of acceleration regions belonging to the acceleration instance.</p>
     */
    public Long getAcceleratorAreaCounts() {
        return this.AcceleratorAreaCounts;
    }

    /**
     * Set <p>Count of acceleration regions belonging to the acceleration instance.</p>
     * @param AcceleratorAreaCounts <p>Count of acceleration regions belonging to the acceleration instance.</p>
     */
    public void setAcceleratorAreaCounts(Long AcceleratorAreaCounts) {
        this.AcceleratorAreaCounts = AcceleratorAreaCounts;
    }

    /**
     * Get <p>Global acceleration instance status.</p> 
     * @return Status <p>Global acceleration instance status.</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Global acceleration instance status.</p>
     * @param Status <p>Global acceleration instance status.</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Domain name.</p> 
     * @return Cname <p>Domain name.</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>Domain name.</p>
     * @param Cname <p>Domain name.</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>Cross-border type; HighQuality (high-quality cross-border), Unicom (China Unicom cross-border), NotAvailable (not enabled).</p> 
     * @return CrossBorderType <p>Cross-border type; HighQuality (high-quality cross-border), Unicom (China Unicom cross-border), NotAvailable (not enabled).</p>
     */
    public String getCrossBorderType() {
        return this.CrossBorderType;
    }

    /**
     * Set <p>Cross-border type; HighQuality (high-quality cross-border), Unicom (China Unicom cross-border), NotAvailable (not enabled).</p>
     * @param CrossBorderType <p>Cross-border type; HighQuality (high-quality cross-border), Unicom (China Unicom cross-border), NotAvailable (not enabled).</p>
     */
    public void setCrossBorderType(String CrossBorderType) {
        this.CrossBorderType = CrossBorderType;
    }

    /**
     * Get <p>Tag information.</p> 
     * @return TagSet <p>Tag information.</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>Tag information.</p>
     * @param TagSet <p>Tag information.</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public GlobalAcceleratorSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalAcceleratorSet(GlobalAcceleratorSet source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.DdosId != null) {
            this.DdosId = new String(source.DdosId);
        }
        if (source.ListenerCounts != null) {
            this.ListenerCounts = new Long(source.ListenerCounts);
        }
        if (source.AcceleratorAreaCounts != null) {
            this.AcceleratorAreaCounts = new Long(source.AcceleratorAreaCounts);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.CrossBorderType != null) {
            this.CrossBorderType = new String(source.CrossBorderType);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "DdosId", this.DdosId);
        this.setParamSimple(map, prefix + "ListenerCounts", this.ListenerCounts);
        this.setParamSimple(map, prefix + "AcceleratorAreaCounts", this.AcceleratorAreaCounts);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "CrossBorderType", this.CrossBorderType);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

