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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReadOnlyInstance extends AbstractModel {

    /**
    * 
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * 
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("Model")
    @Expose
    private Long Model;

    /**
    * 
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 
    */
    @SerializedName("DelayTime")
    @Expose
    private String DelayTime;

    /**
    * 
    */
    @SerializedName("SynStatus")
    @Expose
    private String SynStatus;

    /**
    * 
    */
    @SerializedName("DatabaseDifference")
    @Expose
    private String DatabaseDifference;

    /**
    * 
    */
    @SerializedName("AccountDifference")
    @Expose
    private String AccountDifference;

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
     * Get  
     * @return InstanceId 
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 
     * @param InstanceId 
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Uid 
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 
     * @param Uid 
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get  
     * @return ProjectId 
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 
     * @param ProjectId 
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get  
     * @return Status 
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return CreateTime 
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 
     * @param CreateTime 
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get  
     * @return UpdateTime 
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 
     * @param UpdateTime 
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get  
     * @return Memory 
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 
     * @param Memory 
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get  
     * @return Storage 
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set 
     * @param Storage 
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get  
     * @return Cpu 
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 
     * @param Cpu 
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get  
     * @return Version 
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 
     * @param Version 
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return Model 
     */
    public Long getModel() {
        return this.Model;
    }

    /**
     * Set 
     * @param Model 
     */
    public void setModel(Long Model) {
        this.Model = Model;
    }

    /**
     * Get  
     * @return PayMode 
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 
     * @param PayMode 
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get  
     * @return Weight 
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 
     * @param Weight 
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get  
     * @return DelayTime 
     */
    public String getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 
     * @param DelayTime 
     */
    public void setDelayTime(String DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get  
     * @return SynStatus 
     */
    public String getSynStatus() {
        return this.SynStatus;
    }

    /**
     * Set 
     * @param SynStatus 
     */
    public void setSynStatus(String SynStatus) {
        this.SynStatus = SynStatus;
    }

    /**
     * Get  
     * @return DatabaseDifference 
     */
    public String getDatabaseDifference() {
        return this.DatabaseDifference;
    }

    /**
     * Set 
     * @param DatabaseDifference 
     */
    public void setDatabaseDifference(String DatabaseDifference) {
        this.DatabaseDifference = DatabaseDifference;
    }

    /**
     * Get  
     * @return AccountDifference 
     */
    public String getAccountDifference() {
        return this.AccountDifference;
    }

    /**
     * Set 
     * @param AccountDifference 
     */
    public void setAccountDifference(String AccountDifference) {
        this.AccountDifference = AccountDifference;
    }

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  
     * @return IsolateTime 
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 
     * @param IsolateTime 
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get  
     * @return RegionId 
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 
     * @param RegionId 
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get  
     * @return ZoneId 
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 
     * @param ZoneId 
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    public ReadOnlyInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReadOnlyInstance(ReadOnlyInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Model != null) {
            this.Model = new Long(source.Model);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new String(source.DelayTime);
        }
        if (source.SynStatus != null) {
            this.SynStatus = new String(source.SynStatus);
        }
        if (source.DatabaseDifference != null) {
            this.DatabaseDifference = new String(source.DatabaseDifference);
        }
        if (source.AccountDifference != null) {
            this.AccountDifference = new String(source.AccountDifference);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "SynStatus", this.SynStatus);
        this.setParamSimple(map, prefix + "DatabaseDifference", this.DatabaseDifference);
        this.setParamSimple(map, prefix + "AccountDifference", this.AccountDifference);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);

    }
}

