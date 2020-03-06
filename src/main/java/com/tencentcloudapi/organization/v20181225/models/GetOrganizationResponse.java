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
package com.tencentcloudapi.organization.v20181225.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetOrganizationResponse extends AbstractModel{

    /**
    * Organization ID
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * Creator UIN
    */
    @SerializedName("HostUin")
    @Expose
    private Long HostUin;

    /**
    * Creator’s name
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * Creator’s email address
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * Organization type
    */
    @SerializedName("OrgType")
    @Expose
    private Long OrgType;

    /**
    * Whether the organization is empty or not 
    */
    @SerializedName("IsEmpty")
    @Expose
    private Long IsEmpty;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Organization ID 
     * @return OrgId Organization ID
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set Organization ID
     * @param OrgId Organization ID
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get Creator UIN 
     * @return HostUin Creator UIN
     */
    public Long getHostUin() {
        return this.HostUin;
    }

    /**
     * Set Creator UIN
     * @param HostUin Creator UIN
     */
    public void setHostUin(Long HostUin) {
        this.HostUin = HostUin;
    }

    /**
     * Get Creator’s name 
     * @return Nickname Creator’s name
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set Creator’s name
     * @param Nickname Creator’s name
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get Creator’s email address 
     * @return Mail Creator’s email address
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set Creator’s email address
     * @param Mail Creator’s email address
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get Organization type 
     * @return OrgType Organization type
     */
    public Long getOrgType() {
        return this.OrgType;
    }

    /**
     * Set Organization type
     * @param OrgType Organization type
     */
    public void setOrgType(Long OrgType) {
        this.OrgType = OrgType;
    }

    /**
     * Get Whether the organization is empty or not  
     * @return IsEmpty Whether the organization is empty or not 
     */
    public Long getIsEmpty() {
        return this.IsEmpty;
    }

    /**
     * Set Whether the organization is empty or not 
     * @param IsEmpty Whether the organization is empty or not 
     */
    public void setIsEmpty(Long IsEmpty) {
        this.IsEmpty = IsEmpty;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "HostUin", this.HostUin);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "OrgType", this.OrgType);
        this.setParamSimple(map, prefix + "IsEmpty", this.IsEmpty);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

