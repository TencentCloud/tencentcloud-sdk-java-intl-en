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

public class ModifyLoginWhiteLearnEDRRequest extends AbstractModel {

    /**
    * <p>Rule ID; for self-learning, it is the rule group ID (minimum line ID in the group)</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>List of common login locations. Required. 1-200 entries. It is the unique content dimension of the self-learning rule.</p>
    */
    @SerializedName("Places")
    @Expose
    private LoginWhitePlaceInput [] Places;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>AppId of the account associated with the policy (obtained from the list output parameter AppId); if empty, the current account is used; non-current accounts must pass ownership verification</p>
    */
    @SerializedName("RuleAppId")
    @Expose
    private Long RuleAppId;

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
     * Get <p>List of common login locations. Required. 1-200 entries. It is the unique content dimension of the self-learning rule.</p> 
     * @return Places <p>List of common login locations. Required. 1-200 entries. It is the unique content dimension of the self-learning rule.</p>
     */
    public LoginWhitePlaceInput [] getPlaces() {
        return this.Places;
    }

    /**
     * Set <p>List of common login locations. Required. 1-200 entries. It is the unique content dimension of the self-learning rule.</p>
     * @param Places <p>List of common login locations. Required. 1-200 entries. It is the unique content dimension of the self-learning rule.</p>
     */
    public void setPlaces(LoginWhitePlaceInput [] Places) {
        this.Places = Places;
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
     * Get <p>AppId of the account associated with the policy (obtained from the list output parameter AppId); if empty, the current account is used; non-current accounts must pass ownership verification</p> 
     * @return RuleAppId <p>AppId of the account associated with the policy (obtained from the list output parameter AppId); if empty, the current account is used; non-current accounts must pass ownership verification</p>
     */
    public Long getRuleAppId() {
        return this.RuleAppId;
    }

    /**
     * Set <p>AppId of the account associated with the policy (obtained from the list output parameter AppId); if empty, the current account is used; non-current accounts must pass ownership verification</p>
     * @param RuleAppId <p>AppId of the account associated with the policy (obtained from the list output parameter AppId); if empty, the current account is used; non-current accounts must pass ownership verification</p>
     */
    public void setRuleAppId(Long RuleAppId) {
        this.RuleAppId = RuleAppId;
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

    public ModifyLoginWhiteLearnEDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoginWhiteLearnEDRRequest(ModifyLoginWhiteLearnEDRRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Places != null) {
            this.Places = new LoginWhitePlaceInput[source.Places.length];
            for (int i = 0; i < source.Places.length; i++) {
                this.Places[i] = new LoginWhitePlaceInput(source.Places[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.RuleAppId != null) {
            this.RuleAppId = new Long(source.RuleAppId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Places.", this.Places);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "RuleAppId", this.RuleAppId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);

    }
}

