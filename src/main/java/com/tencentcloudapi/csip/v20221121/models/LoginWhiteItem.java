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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginWhiteItem extends AbstractModel {

    /**
    * <p>Allowlist type: Custom - custom allowlist; Learn - self-learning allowlist</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>AppId of the account associated with the policy, used to distinguish and locate for subsequent editing in multi-account scenarios</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Rule ID; for self-learning, it is the rule group ID (minimum line ID in the group)</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Login source IP (comma-separated); self-learning allowlist is always empty</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>Login usernames (separate with commas); self-learning allowlist is always empty</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Starting HH:MM when logging in; the self-learning allowlist is always empty</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Login period ends at HH:MM; self-learning allowlist is always empty</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>Common login location list</p>
    */
    @SerializedName("Places")
    @Expose
    private LoginWhitePlace [] Places;

    /**
    * <p>Common login location display copy (comma-separated) for direct display in the list</p>
    */
    @SerializedName("Locations")
    @Expose
    private String Locations;

    /**
    * <p>Effective asset scope: 0-specified hosts (host or tag hit) 1-all hosts</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Effective host QUUID list (one-to-one correspondence with InstanceIDs)</p>
    */
    @SerializedName("QUUIDS")
    @Expose
    private String [] QUUIDS;

    /**
    * <p>List of host instance IDs that take effect (one-to-one correspondence with QUUIDS)</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>Remove host QUUID list</p>
    */
    @SerializedName("ExcludeQUUIDS")
    @Expose
    private String [] ExcludeQUUIDS;

    /**
    * <p>Host instance ID list for removal</p>
    */
    @SerializedName("ExcludeInstanceIDs")
    @Expose
    private String [] ExcludeInstanceIDs;

    /**
    * <p>List of effective tag details.</p>
    */
    @SerializedName("TagItems")
    @Expose
    private EDRRuleTagItem [] TagItems;

    /**
    * <p>Hosts: custom to the specified number of hosts (0 when Scope=1, all hosts displayed on the front-end); self-learning is the number of deduplicated hosts in the group</p>
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * <p>Remarks.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Creation time, format 2006-01-02 15:04:05</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last modification time, format 2006-01-02 15:04:05</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
     * Get <p>Allowlist type: Custom - custom allowlist; Learn - self-learning allowlist</p> 
     * @return Type <p>Allowlist type: Custom - custom allowlist; Learn - self-learning allowlist</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Allowlist type: Custom - custom allowlist; Learn - self-learning allowlist</p>
     * @param Type <p>Allowlist type: Custom - custom allowlist; Learn - self-learning allowlist</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>AppId of the account associated with the policy, used to distinguish and locate for subsequent editing in multi-account scenarios</p> 
     * @return AppId <p>AppId of the account associated with the policy, used to distinguish and locate for subsequent editing in multi-account scenarios</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>AppId of the account associated with the policy, used to distinguish and locate for subsequent editing in multi-account scenarios</p>
     * @param AppId <p>AppId of the account associated with the policy, used to distinguish and locate for subsequent editing in multi-account scenarios</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Rule ID; for self-learning, it is the rule group ID (minimum line ID in the group)</p> 
     * @return Id <p>Rule ID; for self-learning, it is the rule group ID (minimum line ID in the group)</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Rule ID; for self-learning, it is the rule group ID (minimum line ID in the group)</p>
     * @param Id <p>Rule ID; for self-learning, it is the rule group ID (minimum line ID in the group)</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Login source IP (comma-separated); self-learning allowlist is always empty</p> 
     * @return SrcIp <p>Login source IP (comma-separated); self-learning allowlist is always empty</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>Login source IP (comma-separated); self-learning allowlist is always empty</p>
     * @param SrcIp <p>Login source IP (comma-separated); self-learning allowlist is always empty</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>Login usernames (separate with commas); self-learning allowlist is always empty</p> 
     * @return UserName <p>Login usernames (separate with commas); self-learning allowlist is always empty</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Login usernames (separate with commas); self-learning allowlist is always empty</p>
     * @param UserName <p>Login usernames (separate with commas); self-learning allowlist is always empty</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Starting HH:MM when logging in; the self-learning allowlist is always empty</p> 
     * @return StartTime <p>Starting HH:MM when logging in; the self-learning allowlist is always empty</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Starting HH:MM when logging in; the self-learning allowlist is always empty</p>
     * @param StartTime <p>Starting HH:MM when logging in; the self-learning allowlist is always empty</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Login period ends at HH:MM; self-learning allowlist is always empty</p> 
     * @return EndTime <p>Login period ends at HH:MM; self-learning allowlist is always empty</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Login period ends at HH:MM; self-learning allowlist is always empty</p>
     * @param EndTime <p>Login period ends at HH:MM; self-learning allowlist is always empty</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>Common login location list</p> 
     * @return Places <p>Common login location list</p>
     */
    public LoginWhitePlace [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>Common login location list</p>
     * @param Places <p>Common login location list</p>
     */
    public void setPlaces(LoginWhitePlace [] Places) {
        this.Places = Places;
    }

    /**
     * Get <p>Common login location display copy (comma-separated) for direct display in the list</p> 
     * @return Locations <p>Common login location display copy (comma-separated) for direct display in the list</p>
     */
    public String getLocations() {
        return this.Locations;
    }

    /**
     * Set <p>Common login location display copy (comma-separated) for direct display in the list</p>
     * @param Locations <p>Common login location display copy (comma-separated) for direct display in the list</p>
     */
    public void setLocations(String Locations) {
        this.Locations = Locations;
    }

    /**
     * Get <p>Effective asset scope: 0-specified hosts (host or tag hit) 1-all hosts</p> 
     * @return Scope <p>Effective asset scope: 0-specified hosts (host or tag hit) 1-all hosts</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Effective asset scope: 0-specified hosts (host or tag hit) 1-all hosts</p>
     * @param Scope <p>Effective asset scope: 0-specified hosts (host or tag hit) 1-all hosts</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Effective host QUUID list (one-to-one correspondence with InstanceIDs)</p> 
     * @return QUUIDS <p>Effective host QUUID list (one-to-one correspondence with InstanceIDs)</p>
     */
    public String [] getQUUIDS() {
        return this.QUUIDS;
    }

    /**
     * Set <p>Effective host QUUID list (one-to-one correspondence with InstanceIDs)</p>
     * @param QUUIDS <p>Effective host QUUID list (one-to-one correspondence with InstanceIDs)</p>
     */
    public void setQUUIDS(String [] QUUIDS) {
        this.QUUIDS = QUUIDS;
    }

    /**
     * Get <p>List of host instance IDs that take effect (one-to-one correspondence with QUUIDS)</p> 
     * @return InstanceIDs <p>List of host instance IDs that take effect (one-to-one correspondence with QUUIDS)</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>List of host instance IDs that take effect (one-to-one correspondence with QUUIDS)</p>
     * @param InstanceIDs <p>List of host instance IDs that take effect (one-to-one correspondence with QUUIDS)</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>Remove host QUUID list</p> 
     * @return ExcludeQUUIDS <p>Remove host QUUID list</p>
     */
    public String [] getExcludeQUUIDS() {
        return this.ExcludeQUUIDS;
    }

    /**
     * Set <p>Remove host QUUID list</p>
     * @param ExcludeQUUIDS <p>Remove host QUUID list</p>
     */
    public void setExcludeQUUIDS(String [] ExcludeQUUIDS) {
        this.ExcludeQUUIDS = ExcludeQUUIDS;
    }

    /**
     * Get <p>Host instance ID list for removal</p> 
     * @return ExcludeInstanceIDs <p>Host instance ID list for removal</p>
     */
    public String [] getExcludeInstanceIDs() {
        return this.ExcludeInstanceIDs;
    }

    /**
     * Set <p>Host instance ID list for removal</p>
     * @param ExcludeInstanceIDs <p>Host instance ID list for removal</p>
     */
    public void setExcludeInstanceIDs(String [] ExcludeInstanceIDs) {
        this.ExcludeInstanceIDs = ExcludeInstanceIDs;
    }

    /**
     * Get <p>List of effective tag details.</p> 
     * @return TagItems <p>List of effective tag details.</p>
     */
    public EDRRuleTagItem [] getTagItems() {
        return this.TagItems;
    }

    /**
     * Set <p>List of effective tag details.</p>
     * @param TagItems <p>List of effective tag details.</p>
     */
    public void setTagItems(EDRRuleTagItem [] TagItems) {
        this.TagItems = TagItems;
    }

    /**
     * Get <p>Hosts: custom to the specified number of hosts (0 when Scope=1, all hosts displayed on the front-end); self-learning is the number of deduplicated hosts in the group</p> 
     * @return HostCount <p>Hosts: custom to the specified number of hosts (0 when Scope=1, all hosts displayed on the front-end); self-learning is the number of deduplicated hosts in the group</p>
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set <p>Hosts: custom to the specified number of hosts (0 when Scope=1, all hosts displayed on the front-end); self-learning is the number of deduplicated hosts in the group</p>
     * @param HostCount <p>Hosts: custom to the specified number of hosts (0 when Scope=1, all hosts displayed on the front-end); self-learning is the number of deduplicated hosts in the group</p>
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get <p>Remarks.</p> 
     * @return Remark <p>Remarks.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remarks.</p>
     * @param Remark <p>Remarks.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Creation time, format 2006-01-02 15:04:05</p> 
     * @return CreateTime <p>Creation time, format 2006-01-02 15:04:05</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Creation time, format 2006-01-02 15:04:05</p>
     * @param CreateTime <p>Creation time, format 2006-01-02 15:04:05</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last modification time, format 2006-01-02 15:04:05</p> 
     * @return ModifyTime <p>Last modification time, format 2006-01-02 15:04:05</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>Last modification time, format 2006-01-02 15:04:05</p>
     * @param ModifyTime <p>Last modification time, format 2006-01-02 15:04:05</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    public LoginWhiteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginWhiteItem(LoginWhiteItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.SrcIp != null) {
            this.SrcIp = new String(source.SrcIp);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Places != null) {
            this.Places = new LoginWhitePlace[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new LoginWhitePlace(source.Places[i]);
            }
        }
        if (source.Locations != null) {
            this.Locations = new String(source.Locations);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.QUUIDS != null) {
            this.QUUIDS = new String[source.QUUIDS.length];
            for (int i = 0; i < source.QUUIDS.length; i++) {
                this.QUUIDS[i] = new String(source.QUUIDS[i]);
            }
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.ExcludeQUUIDS != null) {
            this.ExcludeQUUIDS = new String[source.ExcludeQUUIDS.length];
            for (int i = 0; i < source.ExcludeQUUIDS.length; i++) {
                this.ExcludeQUUIDS[i] = new String(source.ExcludeQUUIDS[i]);
            }
        }
        if (source.ExcludeInstanceIDs != null) {
            this.ExcludeInstanceIDs = new String[source.ExcludeInstanceIDs.length];
            for (int i = 0; i < source.ExcludeInstanceIDs.length; i++) {
                this.ExcludeInstanceIDs[i] = new String(source.ExcludeInstanceIDs[i]);
            }
        }
        if (source.TagItems != null) {
            this.TagItems = new EDRRuleTagItem[source.TagItems.length];
            for (int i = 0; i < source.TagItems.length; i++) {
                this.TagItems[i] = new EDRRuleTagItem(source.TagItems[i]);
            }
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "Locations", this.Locations);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArraySimple(map, prefix + "QUUIDS.", this.QUUIDS);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamArraySimple(map, prefix + "ExcludeQUUIDS.", this.ExcludeQUUIDS);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIDs.", this.ExcludeInstanceIDs);
        this.setParamArrayObj(map, prefix + "TagItems.", this.TagItems);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);

    }
}

