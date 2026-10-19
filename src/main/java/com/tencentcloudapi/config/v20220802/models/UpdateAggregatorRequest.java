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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAggregatorRequest extends AbstractModel {

    /**
    * <p>Account group name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Account group description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Account group type.</p><p>Valid value:</p><ul><li>RD: global account group</li><li>CUSTOM: custom account group</li></ul>
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * <p>Account group creator ID.</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
    * <p>Account group member list, up to 100 entries.</p>
    */
    @SerializedName("AggregatorAccounts")
    @Expose
    private AggregatorAccount [] AggregatorAccounts;

    /**
     * Get <p>Account group name.</p> 
     * @return Name <p>Account group name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Account group name.</p>
     * @param Name <p>Account group name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Account group description.</p> 
     * @return Description <p>Account group description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Account group description.</p>
     * @param Description <p>Account group description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Account group type.</p><p>Valid value:</p><ul><li>RD: global account group</li><li>CUSTOM: custom account group</li></ul> 
     * @return AccountGroupId <p>Account group type.</p><p>Valid value:</p><ul><li>RD: global account group</li><li>CUSTOM: custom account group</li></ul>
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set <p>Account group type.</p><p>Valid value:</p><ul><li>RD: global account group</li><li>CUSTOM: custom account group</li></ul>
     * @param AccountGroupId <p>Account group type.</p><p>Valid value:</p><ul><li>RD: global account group</li><li>CUSTOM: custom account group</li></ul>
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get <p>Account group creator ID.</p> 
     * @return OwnerUin <p>Account group creator ID.</p>
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>Account group creator ID.</p>
     * @param OwnerUin <p>Account group creator ID.</p>
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>Account group member list, up to 100 entries.</p> 
     * @return AggregatorAccounts <p>Account group member list, up to 100 entries.</p>
     */
    public AggregatorAccount [] getAggregatorAccounts() {
        return this.AggregatorAccounts;
    }

    /**
     * Set <p>Account group member list, up to 100 entries.</p>
     * @param AggregatorAccounts <p>Account group member list, up to 100 entries.</p>
     */
    public void setAggregatorAccounts(AggregatorAccount [] AggregatorAccounts) {
        this.AggregatorAccounts = AggregatorAccounts;
    }

    public UpdateAggregatorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAggregatorRequest(UpdateAggregatorRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
        if (source.AggregatorAccounts != null) {
            this.AggregatorAccounts = new AggregatorAccount[source.AggregatorAccounts.length];
            for (int i = 0; i < source.AggregatorAccounts.length; i++) {
                this.AggregatorAccounts[i] = new AggregatorAccount(source.AggregatorAccounts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamArrayObj(map, prefix + "AggregatorAccounts.", this.AggregatorAccounts);

    }
}

