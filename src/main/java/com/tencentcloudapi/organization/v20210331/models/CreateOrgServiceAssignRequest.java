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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrgServiceAssignRequest extends AbstractModel {

    /**
    * Uin list of the delegated admins, including up to 20 items.
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1).
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members). Default value: 1.
    */
    @SerializedName("ManagementScope")
    @Expose
    private Long ManagementScope;

    /**
    * Uin list of the managed members. This parameter is valid when ManagementScope is 2.
    */
    @SerializedName("ManagementScopeUins")
    @Expose
    private Long [] ManagementScopeUins;

    /**
    * ID list of the managed departments. This parameter is valid when ManagementScope is 2.
    */
    @SerializedName("ManagementScopeNodeIds")
    @Expose
    private Long [] ManagementScopeNodeIds;

    /**
     * Get Uin list of the delegated admins, including up to 20 items. 
     * @return MemberUins Uin list of the delegated admins, including up to 20 items.
     */
    public Long [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set Uin list of the delegated admins, including up to 20 items.
     * @param MemberUins Uin list of the delegated admins, including up to 20 items.
     */
    public void setMemberUins(Long [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    /**
     * Get Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1). 
     * @return ServiceId Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1).
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1).
     * @param ServiceId Organization service ID, which can be obtained through [ListOrganizationService](https://intl.cloud.tencent.com/document/product/850/109561?from_cn_redirect=1).
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members). Default value: 1. 
     * @return ManagementScope Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members). Default value: 1.
     */
    public Long getManagementScope() {
        return this.ManagementScope;
    }

    /**
     * Set Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members). Default value: 1.
     * @param ManagementScope Management scope of the delegated admin. Valid values: 1 (all members), 2 (partial members). Default value: 1.
     */
    public void setManagementScope(Long ManagementScope) {
        this.ManagementScope = ManagementScope;
    }

    /**
     * Get Uin list of the managed members. This parameter is valid when ManagementScope is 2. 
     * @return ManagementScopeUins Uin list of the managed members. This parameter is valid when ManagementScope is 2.
     */
    public Long [] getManagementScopeUins() {
        return this.ManagementScopeUins;
    }

    /**
     * Set Uin list of the managed members. This parameter is valid when ManagementScope is 2.
     * @param ManagementScopeUins Uin list of the managed members. This parameter is valid when ManagementScope is 2.
     */
    public void setManagementScopeUins(Long [] ManagementScopeUins) {
        this.ManagementScopeUins = ManagementScopeUins;
    }

    /**
     * Get ID list of the managed departments. This parameter is valid when ManagementScope is 2. 
     * @return ManagementScopeNodeIds ID list of the managed departments. This parameter is valid when ManagementScope is 2.
     */
    public Long [] getManagementScopeNodeIds() {
        return this.ManagementScopeNodeIds;
    }

    /**
     * Set ID list of the managed departments. This parameter is valid when ManagementScope is 2.
     * @param ManagementScopeNodeIds ID list of the managed departments. This parameter is valid when ManagementScope is 2.
     */
    public void setManagementScopeNodeIds(Long [] ManagementScopeNodeIds) {
        this.ManagementScopeNodeIds = ManagementScopeNodeIds;
    }

    public CreateOrgServiceAssignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrgServiceAssignRequest(CreateOrgServiceAssignRequest source) {
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ManagementScope != null) {
            this.ManagementScope = new Long(source.ManagementScope);
        }
        if (source.ManagementScopeUins != null) {
            this.ManagementScopeUins = new Long[source.ManagementScopeUins.length];
            for (int i = 0; i < source.ManagementScopeUins.length; i++) {
                this.ManagementScopeUins[i] = new Long(source.ManagementScopeUins[i]);
            }
        }
        if (source.ManagementScopeNodeIds != null) {
            this.ManagementScopeNodeIds = new Long[source.ManagementScopeNodeIds.length];
            for (int i = 0; i < source.ManagementScopeNodeIds.length; i++) {
                this.ManagementScopeNodeIds[i] = new Long(source.ManagementScopeNodeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ManagementScope", this.ManagementScope);
        this.setParamArraySimple(map, prefix + "ManagementScopeUins.", this.ManagementScopeUins);
        this.setParamArraySimple(map, prefix + "ManagementScopeNodeIds.", this.ManagementScopeNodeIds);

    }
}

