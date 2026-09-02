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

public class OperateRiskRulePolicyRequest extends AbstractModel {

    /**
    * Enable or disable
    */
    @SerializedName("OperateType")
    @Expose
    private String OperateType;

    /**
    * Risk rule ID collection
    */
    @SerializedName("RuleIDs")
    @Expose
    private String [] RuleIDs;

    /**
    * Select all
    */
    @SerializedName("CheckAll")
    @Expose
    private Boolean CheckAll;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * User AppID
    */
    @SerializedName("UserAppID")
    @Expose
    private Long UserAppID;

    /**
     * Get Enable or disable 
     * @return OperateType Enable or disable
     */
    public String getOperateType() {
        return this.OperateType;
    }

    /**
     * Set Enable or disable
     * @param OperateType Enable or disable
     */
    public void setOperateType(String OperateType) {
        this.OperateType = OperateType;
    }

    /**
     * Get Risk rule ID collection 
     * @return RuleIDs Risk rule ID collection
     */
    public String [] getRuleIDs() {
        return this.RuleIDs;
    }

    /**
     * Set Risk rule ID collection
     * @param RuleIDs Risk rule ID collection
     */
    public void setRuleIDs(String [] RuleIDs) {
        this.RuleIDs = RuleIDs;
    }

    /**
     * Get Select all 
     * @return CheckAll Select all
     */
    public Boolean getCheckAll() {
        return this.CheckAll;
    }

    /**
     * Set Select all
     * @param CheckAll Select all
     */
    public void setCheckAll(Boolean CheckAll) {
        this.CheckAll = CheckAll;
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
     * Get User AppID 
     * @return UserAppID User AppID
     */
    public Long getUserAppID() {
        return this.UserAppID;
    }

    /**
     * Set User AppID
     * @param UserAppID User AppID
     */
    public void setUserAppID(Long UserAppID) {
        this.UserAppID = UserAppID;
    }

    public OperateRiskRulePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateRiskRulePolicyRequest(OperateRiskRulePolicyRequest source) {
        if (source.OperateType != null) {
            this.OperateType = new String(source.OperateType);
        }
        if (source.RuleIDs != null) {
            this.RuleIDs = new String[source.RuleIDs.length];
            for (int i = 0; i < source.RuleIDs.length; i++) {
                this.RuleIDs[i] = new String(source.RuleIDs[i]);
            }
        }
        if (source.CheckAll != null) {
            this.CheckAll = new Boolean(source.CheckAll);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.UserAppID != null) {
            this.UserAppID = new Long(source.UserAppID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperateType", this.OperateType);
        this.setParamArraySimple(map, prefix + "RuleIDs.", this.RuleIDs);
        this.setParamSimple(map, prefix + "CheckAll", this.CheckAll);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "UserAppID", this.UserAppID);

    }
}

