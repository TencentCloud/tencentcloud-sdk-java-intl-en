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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationResponse extends AbstractModel{

    /**
    * Organization ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HostUin")
    @Expose
    private Long HostUin;

    /**
    * Creator name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * Organization type.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgType")
    @Expose
    private Long OrgType;

    /**
    * Whether the member is the organization admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsManager")
    @Expose
    private Boolean IsManager;

    /**
    * Policy type. Valid values: `Financial` (finance management).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgPolicyType")
    @Expose
    private String OrgPolicyType;

    /**
    * Policy name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgPolicyName")
    @Expose
    private String OrgPolicyName;

    /**
    * List of member financial permissions.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OrgPermission")
    @Expose
    private OrgPermission [] OrgPermission;

    /**
    * Organization root node ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RootNodeId")
    @Expose
    private Long RootNodeId;

    /**
    * Organization creation time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Member joining time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JoinTime")
    @Expose
    private String JoinTime;

    /**
    * Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAllowQuit")
    @Expose
    private String IsAllowQuit;

    /**
    * Payer UIN.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayUin")
    @Expose
    private String PayUin;

    /**
    * Payer name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * Whether the member is the trusted service admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAssignManager")
    @Expose
    private Boolean IsAssignManager;

    /**
    * Whether the member is the verified entity admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsAuthManager")
    @Expose
    private Boolean IsAuthManager;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Organization ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgId Organization ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set Organization ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgId Organization ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HostUin Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getHostUin() {
        return this.HostUin;
    }

    /**
     * Set Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HostUin Creator UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHostUin(Long HostUin) {
        this.HostUin = HostUin;
    }

    /**
     * Get Creator name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NickName Creator name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set Creator name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NickName Creator name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get Organization type.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgType Organization type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOrgType() {
        return this.OrgType;
    }

    /**
     * Set Organization type.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgType Organization type.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgType(Long OrgType) {
        this.OrgType = OrgType;
    }

    /**
     * Get Whether the member is the organization admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsManager Whether the member is the organization admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsManager() {
        return this.IsManager;
    }

    /**
     * Set Whether the member is the organization admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsManager Whether the member is the organization admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsManager(Boolean IsManager) {
        this.IsManager = IsManager;
    }

    /**
     * Get Policy type. Valid values: `Financial` (finance management).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgPolicyType Policy type. Valid values: `Financial` (finance management).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgPolicyType() {
        return this.OrgPolicyType;
    }

    /**
     * Set Policy type. Valid values: `Financial` (finance management).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgPolicyType Policy type. Valid values: `Financial` (finance management).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgPolicyType(String OrgPolicyType) {
        this.OrgPolicyType = OrgPolicyType;
    }

    /**
     * Get Policy name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgPolicyName Policy name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOrgPolicyName() {
        return this.OrgPolicyName;
    }

    /**
     * Set Policy name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgPolicyName Policy name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgPolicyName(String OrgPolicyName) {
        this.OrgPolicyName = OrgPolicyName;
    }

    /**
     * Get List of member financial permissions.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OrgPermission List of member financial permissions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public OrgPermission [] getOrgPermission() {
        return this.OrgPermission;
    }

    /**
     * Set List of member financial permissions.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OrgPermission List of member financial permissions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOrgPermission(OrgPermission [] OrgPermission) {
        this.OrgPermission = OrgPermission;
    }

    /**
     * Get Organization root node ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RootNodeId Organization root node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getRootNodeId() {
        return this.RootNodeId;
    }

    /**
     * Set Organization root node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RootNodeId Organization root node ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRootNodeId(Long RootNodeId) {
        this.RootNodeId = RootNodeId;
    }

    /**
     * Get Organization creation time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Organization creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Organization creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Organization creation time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Member joining time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JoinTime Member joining time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set Member joining time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param JoinTime Member joining time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJoinTime(String JoinTime) {
        this.JoinTime = JoinTime;
    }

    /**
     * Get Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAllowQuit Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIsAllowQuit() {
        return this.IsAllowQuit;
    }

    /**
     * Set Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAllowQuit Whether the member is allowed to leave. Valid values: `Allow`, `Denied`.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAllowQuit(String IsAllowQuit) {
        this.IsAllowQuit = IsAllowQuit;
    }

    /**
     * Get Payer UIN.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayUin Payer UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayUin() {
        return this.PayUin;
    }

    /**
     * Set Payer UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayUin Payer UIN.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayUin(String PayUin) {
        this.PayUin = PayUin;
    }

    /**
     * Get Payer name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PayName Payer name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set Payer name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PayName Payer name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get Whether the member is the trusted service admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAssignManager Whether the member is the trusted service admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsAssignManager() {
        return this.IsAssignManager;
    }

    /**
     * Set Whether the member is the trusted service admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAssignManager Whether the member is the trusted service admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAssignManager(Boolean IsAssignManager) {
        this.IsAssignManager = IsAssignManager;
    }

    /**
     * Get Whether the member is the verified entity admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsAuthManager Whether the member is the verified entity admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsAuthManager() {
        return this.IsAuthManager;
    }

    /**
     * Set Whether the member is the verified entity admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsAuthManager Whether the member is the verified entity admin. Valid values: `true` (yes); `false` (no).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsAuthManager(Boolean IsAuthManager) {
        this.IsAuthManager = IsAuthManager;
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

    public DescribeOrganizationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationResponse(DescribeOrganizationResponse source) {
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
        }
        if (source.HostUin != null) {
            this.HostUin = new Long(source.HostUin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.OrgType != null) {
            this.OrgType = new Long(source.OrgType);
        }
        if (source.IsManager != null) {
            this.IsManager = new Boolean(source.IsManager);
        }
        if (source.OrgPolicyType != null) {
            this.OrgPolicyType = new String(source.OrgPolicyType);
        }
        if (source.OrgPolicyName != null) {
            this.OrgPolicyName = new String(source.OrgPolicyName);
        }
        if (source.OrgPermission != null) {
            this.OrgPermission = new OrgPermission[source.OrgPermission.length];
            for (int i = 0; i < source.OrgPermission.length; i++) {
                this.OrgPermission[i] = new OrgPermission(source.OrgPermission[i]);
            }
        }
        if (source.RootNodeId != null) {
            this.RootNodeId = new Long(source.RootNodeId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.JoinTime != null) {
            this.JoinTime = new String(source.JoinTime);
        }
        if (source.IsAllowQuit != null) {
            this.IsAllowQuit = new String(source.IsAllowQuit);
        }
        if (source.PayUin != null) {
            this.PayUin = new String(source.PayUin);
        }
        if (source.PayName != null) {
            this.PayName = new String(source.PayName);
        }
        if (source.IsAssignManager != null) {
            this.IsAssignManager = new Boolean(source.IsAssignManager);
        }
        if (source.IsAuthManager != null) {
            this.IsAuthManager = new Boolean(source.IsAuthManager);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "HostUin", this.HostUin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "OrgType", this.OrgType);
        this.setParamSimple(map, prefix + "IsManager", this.IsManager);
        this.setParamSimple(map, prefix + "OrgPolicyType", this.OrgPolicyType);
        this.setParamSimple(map, prefix + "OrgPolicyName", this.OrgPolicyName);
        this.setParamArrayObj(map, prefix + "OrgPermission.", this.OrgPermission);
        this.setParamSimple(map, prefix + "RootNodeId", this.RootNodeId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);
        this.setParamSimple(map, prefix + "IsAllowQuit", this.IsAllowQuit);
        this.setParamSimple(map, prefix + "PayUin", this.PayUin);
        this.setParamSimple(map, prefix + "PayName", this.PayName);
        this.setParamSimple(map, prefix + "IsAssignManager", this.IsAssignManager);
        this.setParamSimple(map, prefix + "IsAuthManager", this.IsAuthManager);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

