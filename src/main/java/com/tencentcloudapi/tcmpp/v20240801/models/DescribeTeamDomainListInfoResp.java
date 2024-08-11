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

public class DescribeTeamDomainListInfoResp extends AbstractModel {

    /**
    * Domain ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainId")
    @Expose
    private Long DomainId;

    /**
    * Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPId")
    @Expose
    private String MNPId;

    /**
    * Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MNPName")
    @Expose
    private String MNPName;

    /**
    * Domain name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainUrl")
    @Expose
    private String DomainUrl;

    /**
    * Type 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainType")
    @Expose
    private Long DomainType;

    /**
    * Domain name status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creator
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateUser")
    @Expose
    private String CreateUser;

    /**
    * The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
     * Get Mini program ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPId() {
        return this.MNPId;
    }

    /**
     * Set Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPId Mini program ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPId(String MNPId) {
        this.MNPId = MNPId;
    }

    /**
     * Get Mini program name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMNPName() {
        return this.MNPName;
    }

    /**
     * Set Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MNPName Mini program name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMNPName(String MNPName) {
        this.MNPName = MNPName;
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
     * Get Type 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainType Type 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDomainType() {
        return this.DomainType;
    }

    /**
     * Set Type 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainType Type 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainType(Long DomainType) {
        this.DomainType = DomainType;
    }

    /**
     * Get Domain name status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Domain name status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Domain name status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Domain name status. 1: Normal; 2: Disabled
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get The creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime The creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DescribeTeamDomainListInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTeamDomainListInfoResp(DescribeTeamDomainListInfoResp source) {
        if (source.DomainId != null) {
            this.DomainId = new Long(source.DomainId);
        }
        if (source.MNPId != null) {
            this.MNPId = new String(source.MNPId);
        }
        if (source.MNPName != null) {
            this.MNPName = new String(source.MNPName);
        }
        if (source.DomainUrl != null) {
            this.DomainUrl = new String(source.DomainUrl);
        }
        if (source.DomainType != null) {
            this.DomainType = new Long(source.DomainType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateUser != null) {
            this.CreateUser = new String(source.CreateUser);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "MNPId", this.MNPId);
        this.setParamSimple(map, prefix + "MNPName", this.MNPName);
        this.setParamSimple(map, prefix + "DomainUrl", this.DomainUrl);
        this.setParamSimple(map, prefix + "DomainType", this.DomainType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateUser", this.CreateUser);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

