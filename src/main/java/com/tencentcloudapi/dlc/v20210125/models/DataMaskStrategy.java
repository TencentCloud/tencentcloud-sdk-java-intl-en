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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataMaskStrategy extends AbstractModel {

    /**
    * Policy ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * User AppId

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UserAppId")
    @Expose
    private String UserAppId;

    /**
    * User UIN

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Specifies the uin of the user sub-account to operate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * Policy name

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * Policy description

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StrategyDesc")
    @Expose
    private String StrategyDesc;

    /**
    * User group policy list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Groups")
    @Expose
    private GroupInfo [] Groups;

    /**
    * User sub-account uin list, concatenated by ;.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Users")
    @Expose
    private String Users;

    /**
    * 1: in effect; 0: deleted.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * Policy creation time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Policy update time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Policy ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyId Policy ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyId Policy ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get User AppId

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UserAppId User AppId

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUserAppId() {
        return this.UserAppId;
    }

    /**
     * Set User AppId

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UserAppId User AppId

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUserAppId(String UserAppId) {
        this.UserAppId = UserAppId;
    }

    /**
     * Get User UIN

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uin User UIN

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set User UIN

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uin User UIN

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Specifies the uin of the user sub-account to operate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubAccountUin Specifies the uin of the user sub-account to operate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set Specifies the uin of the user sub-account to operate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubAccountUin Specifies the uin of the user sub-account to operate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get Policy name

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyName Policy name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name

Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyName Policy name

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyType MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyType MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Policy description

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StrategyDesc Policy description

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStrategyDesc() {
        return this.StrategyDesc;
    }

    /**
     * Set Policy description

Note: This field may return null, indicating that no valid values can be obtained.
     * @param StrategyDesc Policy description

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStrategyDesc(String StrategyDesc) {
        this.StrategyDesc = StrategyDesc;
    }

    /**
     * Get User group policy list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Groups User group policy list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public GroupInfo [] getGroups() {
        return this.Groups;
    }

    /**
     * Set User group policy list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Groups User group policy list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGroups(GroupInfo [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get User sub-account uin list, concatenated by ;.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Users User sub-account uin list, concatenated by ;.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUsers() {
        return this.Users;
    }

    /**
     * Set User sub-account uin list, concatenated by ;.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Users User sub-account uin list, concatenated by ;.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUsers(String Users) {
        this.Users = Users;
    }

    /**
     * Get 1: in effect; 0: deleted.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return State 1: in effect; 0: deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 1: in effect; 0: deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param State 1: in effect; 0: deleted.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get Policy creation time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Policy creation time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Policy creation time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Policy creation time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Policy update time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Policy update time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Policy update time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Policy update time. timestamp in milliseconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DataMaskStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataMaskStrategy(DataMaskStrategy source) {
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.UserAppId != null) {
            this.UserAppId = new String(source.UserAppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.StrategyDesc != null) {
            this.StrategyDesc = new String(source.StrategyDesc);
        }
        if (source.Groups != null) {
            this.Groups = new GroupInfo[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new GroupInfo(source.Groups[i]);
            }
        }
        if (source.Users != null) {
            this.Users = new String(source.Users);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "UserAppId", this.UserAppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyDesc", this.StrategyDesc);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Users", this.Users);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

