/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalDomainsListData extends AbstractModel {

    /**
    * Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * Domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainUrl")
    @Expose
    private String DomainUrl;

    /**
    * Type. 1: Allowed; 2: Blocked
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
    * Creator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Updater
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Update time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Domain ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainId Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainId Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Domain name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainUrl Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomainUrl() {
        return this.DomainUrl;
    }

    /**
     * Set Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainUrl Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainUrl(String DomainUrl) {
        this.DomainUrl = DomainUrl;
    }

    /**
     * Get Type. 1: Allowed; 2: Blocked
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainType Type. 1: Allowed; 2: Blocked
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Type. 1: Allowed; 2: Blocked
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainType Type. 1: Allowed; 2: Blocked
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get Creator
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateUser Creator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateUser Creator
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Creation time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Updater
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateUser Updater
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Updater
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateUser Updater
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Update time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DescribeGlobalDomainsListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalDomainsListData(DescribeGlobalDomainsListData source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.DomainUrl != null) {
            this.DomainUrl = new String(source.DomainUrl);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateUser != null) {
            this.UpdateUser = new String(source.UpdateUser);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DomainUrl", this.DomainUrl);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

