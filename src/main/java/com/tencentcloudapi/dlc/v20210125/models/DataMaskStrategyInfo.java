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

public class DataMaskStrategyInfo extends AbstractModel {

    /**
    * Policy name
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT.
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * Policy description
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
    */
    @SerializedName("Users")
    @Expose
    private String Users;

    /**
    * Policy ID
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
     * Get Policy name 
     * @return StrategyName Policy name
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Policy name
     * @param StrategyName Policy name
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT. 
     * @return StrategyType MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT.
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT.
     * @param StrategyType MASK_SHOW_FIRST_4, MASK_SHOW_LAST_4, MASK_HASH, MASK_DATE_SHOW_YEAR, MASK_NULL, MASK_DEFAULT.
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Policy description 
     * @return StrategyDesc Policy description
     */
    public String getStrategyDesc() {
        return this.StrategyDesc;
    }

    /**
     * Set Policy description
     * @param StrategyDesc Policy description
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
     * @return Users User sub-account uin list, concatenated by ;.
     */
    public String getUsers() {
        return this.Users;
    }

    /**
     * Set User sub-account uin list, concatenated by ;.
     * @param Users User sub-account uin list, concatenated by ;.
     */
    public void setUsers(String Users) {
        this.Users = Users;
    }

    /**
     * Get Policy ID 
     * @return StrategyId Policy ID
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set Policy ID
     * @param StrategyId Policy ID
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    public DataMaskStrategyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataMaskStrategyInfo(DataMaskStrategyInfo source) {
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
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyDesc", this.StrategyDesc);
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "Users", this.Users);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);

    }
}

