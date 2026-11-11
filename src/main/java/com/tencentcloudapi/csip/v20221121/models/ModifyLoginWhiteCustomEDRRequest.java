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

public class ModifyLoginWhiteCustomEDRRequest extends AbstractModel {

    /**
    * <p>Rule ID; for self-learning, it is the rule group ID (minimum line ID in the group)</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Login source IP. Use commas (,) to separate multiple items. Supports individual IPs, intervals (a-b), and CIDR. Supports IPv4 and IPv6. Up to 2048 characters.</p>
    */
    @SerializedName("SrcIp")
    @Expose
    private String SrcIp;

    /**
    * <p>Login username separated by commas; up to 1024 characters</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>Login time start HH:MM; it must be filled in or left empty simultaneously with EndTime</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Login period end HH:MM; must be filled in or empty at the same time as StartTime</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>List of common login locations, up to 200. Set ProvinceId/CityId to 99999 to indicate all provinces/all cities.</p>
    */
    @SerializedName("Places")
    @Expose
    private LoginWhitePlaceInput [] Places;

    /**
    * <p>Remark, up to 255 characters</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Effective asset scope: 0-specified hosts (host or tag hit) 1-all hosts</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>List of specified hosts (in instance ID form), up to 10,000 items. The server translates them to QUUIDs via idmap, then merges and deduplicates them with QUUIDSWithAppId.</p>
    */
    @SerializedName("InstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] InstanceIDsWithAppId;

    /**
    * <p>List of hosts (instance ID form) to remove, up to 10,000 items</p>
    */
    @SerializedName("ExcludeInstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId;

    /**
    * <p>Security center tag ID list, up to 100. When Scope=0, it is in an OR relationship with the host. Self-learning allowlist does not support taking effect by tag (a non-empty value will be rejected).</p>
    */
    @SerializedName("TagIDs")
    @Expose
    private String [] TagIDs;

    /**
    * <p>Target appid</p>
    */
    @SerializedName("TargetAppIDs")
    @Expose
    private Long [] TargetAppIDs;

    /**
    * <p>Whether to add historical alarm data to whitelist</p>
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

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
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Login source IP. Use commas (,) to separate multiple items. Supports individual IPs, intervals (a-b), and CIDR. Supports IPv4 and IPv6. Up to 2048 characters.</p> 
     * @return SrcIp <p>Login source IP. Use commas (,) to separate multiple items. Supports individual IPs, intervals (a-b), and CIDR. Supports IPv4 and IPv6. Up to 2048 characters.</p>
     */
    public String getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set <p>Login source IP. Use commas (,) to separate multiple items. Supports individual IPs, intervals (a-b), and CIDR. Supports IPv4 and IPv6. Up to 2048 characters.</p>
     * @param SrcIp <p>Login source IP. Use commas (,) to separate multiple items. Supports individual IPs, intervals (a-b), and CIDR. Supports IPv4 and IPv6. Up to 2048 characters.</p>
     */
    public void setSrcIp(String SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get <p>Login username separated by commas; up to 1024 characters</p> 
     * @return UserName <p>Login username separated by commas; up to 1024 characters</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>Login username separated by commas; up to 1024 characters</p>
     * @param UserName <p>Login username separated by commas; up to 1024 characters</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>Login time start HH:MM; it must be filled in or left empty simultaneously with EndTime</p> 
     * @return StartTime <p>Login time start HH:MM; it must be filled in or left empty simultaneously with EndTime</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Login time start HH:MM; it must be filled in or left empty simultaneously with EndTime</p>
     * @param StartTime <p>Login time start HH:MM; it must be filled in or left empty simultaneously with EndTime</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Login period end HH:MM; must be filled in or empty at the same time as StartTime</p> 
     * @return EndTime <p>Login period end HH:MM; must be filled in or empty at the same time as StartTime</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>Login period end HH:MM; must be filled in or empty at the same time as StartTime</p>
     * @param EndTime <p>Login period end HH:MM; must be filled in or empty at the same time as StartTime</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>List of common login locations, up to 200. Set ProvinceId/CityId to 99999 to indicate all provinces/all cities.</p> 
     * @return Places <p>List of common login locations, up to 200. Set ProvinceId/CityId to 99999 to indicate all provinces/all cities.</p>
     */
    public LoginWhitePlaceInput [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>List of common login locations, up to 200. Set ProvinceId/CityId to 99999 to indicate all provinces/all cities.</p>
     * @param Places <p>List of common login locations, up to 200. Set ProvinceId/CityId to 99999 to indicate all provinces/all cities.</p>
     */
    public void setPlaces(LoginWhitePlaceInput [] Places) {
        this.Places = Places;
    }

    /**
     * Get <p>Remark, up to 255 characters</p> 
     * @return Remark <p>Remark, up to 255 characters</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Remark, up to 255 characters</p>
     * @param Remark <p>Remark, up to 255 characters</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * Get <p>List of specified hosts (in instance ID form), up to 10,000 items. The server translates them to QUUIDs via idmap, then merges and deduplicates them with QUUIDSWithAppId.</p> 
     * @return InstanceIDsWithAppId <p>List of specified hosts (in instance ID form), up to 10,000 items. The server translates them to QUUIDs via idmap, then merges and deduplicates them with QUUIDSWithAppId.</p>
     */
    public InstanceIDWithAppIdItem [] getInstanceIDsWithAppId() {
        return this.InstanceIDsWithAppId;
    }

    /**
     * Set <p>List of specified hosts (in instance ID form), up to 10,000 items. The server translates them to QUUIDs via idmap, then merges and deduplicates them with QUUIDSWithAppId.</p>
     * @param InstanceIDsWithAppId <p>List of specified hosts (in instance ID form), up to 10,000 items. The server translates them to QUUIDs via idmap, then merges and deduplicates them with QUUIDSWithAppId.</p>
     */
    public void setInstanceIDsWithAppId(InstanceIDWithAppIdItem [] InstanceIDsWithAppId) {
        this.InstanceIDsWithAppId = InstanceIDsWithAppId;
    }

    /**
     * Get <p>List of hosts (instance ID form) to remove, up to 10,000 items</p> 
     * @return ExcludeInstanceIDsWithAppId <p>List of hosts (instance ID form) to remove, up to 10,000 items</p>
     */
    public InstanceIDWithAppIdItem [] getExcludeInstanceIDsWithAppId() {
        return this.ExcludeInstanceIDsWithAppId;
    }

    /**
     * Set <p>List of hosts (instance ID form) to remove, up to 10,000 items</p>
     * @param ExcludeInstanceIDsWithAppId <p>List of hosts (instance ID form) to remove, up to 10,000 items</p>
     */
    public void setExcludeInstanceIDsWithAppId(InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId) {
        this.ExcludeInstanceIDsWithAppId = ExcludeInstanceIDsWithAppId;
    }

    /**
     * Get <p>Security center tag ID list, up to 100. When Scope=0, it is in an OR relationship with the host. Self-learning allowlist does not support taking effect by tag (a non-empty value will be rejected).</p> 
     * @return TagIDs <p>Security center tag ID list, up to 100. When Scope=0, it is in an OR relationship with the host. Self-learning allowlist does not support taking effect by tag (a non-empty value will be rejected).</p>
     */
    public String [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set <p>Security center tag ID list, up to 100. When Scope=0, it is in an OR relationship with the host. Self-learning allowlist does not support taking effect by tag (a non-empty value will be rejected).</p>
     * @param TagIDs <p>Security center tag ID list, up to 100. When Scope=0, it is in an OR relationship with the host. Self-learning allowlist does not support taking effect by tag (a non-empty value will be rejected).</p>
     */
    public void setTagIDs(String [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get <p>Target appid</p> 
     * @return TargetAppIDs <p>Target appid</p>
     */
    public Long [] getTargetAppIDs() {
        return this.TargetAppIDs;
    }

    /**
     * Set <p>Target appid</p>
     * @param TargetAppIDs <p>Target appid</p>
     */
    public void setTargetAppIDs(Long [] TargetAppIDs) {
        this.TargetAppIDs = TargetAppIDs;
    }

    /**
     * Get <p>Whether to add historical alarm data to whitelist</p> 
     * @return DealOldEvents <p>Whether to add historical alarm data to whitelist</p>
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set <p>Whether to add historical alarm data to whitelist</p>
     * @param DealOldEvents <p>Whether to add historical alarm data to whitelist</p>
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    public ModifyLoginWhiteCustomEDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginWhiteCustomEDRRequest(ModifyLoginWhiteCustomEDRRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
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
            this.Places = new LoginWhitePlaceInput[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new LoginWhitePlaceInput(source.Places[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.InstanceIDsWithAppId != null) {
            this.InstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.InstanceIDsWithAppId.length];
            for (int i = 0; i < source.InstanceIDsWithAppId.length; i++) {
                this.InstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.InstanceIDsWithAppId[i]);
            }
        }
        if (source.ExcludeInstanceIDsWithAppId != null) {
            this.ExcludeInstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.ExcludeInstanceIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeInstanceIDsWithAppId.length; i++) {
                this.ExcludeInstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.ExcludeInstanceIDsWithAppId[i]);
            }
        }
        if (source.TagIDs != null) {
            this.TagIDs = new String[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new String(source.TagIDs[i]);
            }
        }
        if (source.TargetAppIDs != null) {
            this.TargetAppIDs = new Long[source.TargetAppIDs.length];
            for (int i = 0; i < source.TargetAppIDs.length; i++) {
                this.TargetAppIDs[i] = new Long(source.TargetAppIDs[i]);
            }
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "SrcIp", this.SrcIp);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamArraySimple(map, prefix + "TargetAppIDs.", this.TargetAppIDs);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);

    }
}

