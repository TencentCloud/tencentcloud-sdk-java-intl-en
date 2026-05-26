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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalDomainsListData extends AbstractModel {

    /**
    * Domain ID.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * Domain name.
    */
    @SerializedName("DomainUrl")
    @Expose
    private String DomainUrl;

    /**
    * Domain type. Valid value: 1: Allowed; 2: Blocked.
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
    * Creator.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modifier.
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Last modified time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get Domain ID. 
     * @return DomainId Domain ID.
     */
    public Long getDomainId() {
        return this.DomainId;
    }

    /**
     * Set Domain ID.
     * @param DomainId Domain ID.
     */
    public void setDomainId(Long DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get Domain name. 
     * @return DomainUrl Domain name.
     */
    public String getDomainUrl() {
        return this.DomainUrl;
    }

    /**
     * Set Domain name.
     * @param DomainUrl Domain name.
     */
    public void setDomainUrl(String DomainUrl) {
        this.DomainUrl = DomainUrl;
    }

    /**
     * Get Domain type. Valid value: 1: Allowed; 2: Blocked. 
     * @return DomainType Domain type. Valid value: 1: Allowed; 2: Blocked.
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Domain type. Valid value: 1: Allowed; 2: Blocked.
     * @param DomainType Domain type. Valid value: 1: Allowed; 2: Blocked.
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get Creator. 
     * @return CreateUser Creator.
     */
    public String getCreateUser() {
        return this.CreateUser;
    }

    /**
     * Set Creator.
     * @param CreateUser Creator.
     */
    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modifier. 
     * @return UpdateUser Last modifier.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Last modifier.
     * @param UpdateUser Last modifier.
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Last modified time. 
     * @return UpdateTime Last modified time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time.
     * @param UpdateTime Last modified time.
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

