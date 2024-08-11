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

public class GlobalDomainDescribeListInfoResp extends AbstractModel {

    /**
    * Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * Platform ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CustomerID")
    @Expose
    private String CustomerID;

    /**
    * Domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainURL")
    @Expose
    private String DomainURL;

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
    * Updated by
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpdateUser")
    @Expose
    private String UpdateUser;

    /**
    * Update date
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
     * Get Platform ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CustomerID Platform ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCustomerID() {
        return this.CustomerID;
    }

    /**
     * Set Platform ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CustomerID Platform ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * Get Domain name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainURL Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomainURL() {
        return this.DomainURL;
    }

    /**
     * Set Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainURL Domain name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainURL(String DomainURL) {
        this.DomainURL = DomainURL;
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
     * Get Updated by
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateUser Updated by
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateUser() {
        return this.UpdateUser;
    }

    /**
     * Set Updated by
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateUser Updated by
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    /**
     * Get Update date
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpdateTime Update date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update date
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpdateTime Update date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public GlobalDomainDescribeListInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalDomainDescribeListInfoResp(GlobalDomainDescribeListInfoResp source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.CustomerID != null) {
            this.CustomerID = new String(source.CustomerID);
        }
        if (source.DomainURL != null) {
            this.DomainURL = new String(source.DomainURL);
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
        this.setParamSimple(map, prefix + "CustomerID", this.CustomerID);
        this.setParamSimple(map, prefix + "DomainURL", this.DomainURL);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateUser", this.UpdateUser);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

