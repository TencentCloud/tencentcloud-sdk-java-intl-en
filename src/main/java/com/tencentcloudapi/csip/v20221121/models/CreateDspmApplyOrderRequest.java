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

public class CreateDspmApplyOrderRequest extends AbstractModel {

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Application type. `0`: sub-account authorization. `1`: visitor authorization.
    */
    @SerializedName("ApplyType")
    @Expose
    private Long ApplyType;

    /**
    * Permission information.
    */
    @SerializedName("Privilege")
    @Expose
    private DspmDbAccountPrivilege Privilege;

    /**
    * Host address. Currently only support '%'. Default: '%'.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Access privilege expiration time calculated after approval is complete. The temporary account is valid. Milliseconds.
    */
    @SerializedName("ValidatePeriod")
    @Expose
    private Long ValidatePeriod;

    /**
    * List of approvers. If empty, all asset admins are used.
    */
    @SerializedName("ApproverUin")
    @Expose
    private String [] ApproverUin;

    /**
    * Reason for request
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Management type. 0: ordinary member; 1: admin.
    */
    @SerializedName("ManagerType")
    @Expose
    private Long ManagerType;

    /**
    * Authorized person. For sub-account authorization, pass the target uin. If empty, use the current uin by default. For visitor authorization, pass the visitor identity ID.
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Application type. `0`: sub-account authorization. `1`: visitor authorization. 
     * @return ApplyType Application type. `0`: sub-account authorization. `1`: visitor authorization.
     */
    public Long getApplyType() {
        return this.ApplyType;
    }

    /**
     * Set Application type. `0`: sub-account authorization. `1`: visitor authorization.
     * @param ApplyType Application type. `0`: sub-account authorization. `1`: visitor authorization.
     */
    public void setApplyType(Long ApplyType) {
        this.ApplyType = ApplyType;
    }

    /**
     * Get Permission information. 
     * @return Privilege Permission information.
     */
    public DspmDbAccountPrivilege getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set Permission information.
     * @param Privilege Permission information.
     */
    public void setPrivilege(DspmDbAccountPrivilege Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * Get Host address. Currently only support '%'. Default: '%'. 
     * @return Host Host address. Currently only support '%'. Default: '%'.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host address. Currently only support '%'. Default: '%'.
     * @param Host Host address. Currently only support '%'. Default: '%'.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Access privilege expiration time calculated after approval is complete. The temporary account is valid. Milliseconds. 
     * @return ValidatePeriod Access privilege expiration time calculated after approval is complete. The temporary account is valid. Milliseconds.
     */
    public Long getValidatePeriod() {
        return this.ValidatePeriod;
    }

    /**
     * Set Access privilege expiration time calculated after approval is complete. The temporary account is valid. Milliseconds.
     * @param ValidatePeriod Access privilege expiration time calculated after approval is complete. The temporary account is valid. Milliseconds.
     */
    public void setValidatePeriod(Long ValidatePeriod) {
        this.ValidatePeriod = ValidatePeriod;
    }

    /**
     * Get List of approvers. If empty, all asset admins are used. 
     * @return ApproverUin List of approvers. If empty, all asset admins are used.
     */
    public String [] getApproverUin() {
        return this.ApproverUin;
    }

    /**
     * Set List of approvers. If empty, all asset admins are used.
     * @param ApproverUin List of approvers. If empty, all asset admins are used.
     */
    public void setApproverUin(String [] ApproverUin) {
        this.ApproverUin = ApproverUin;
    }

    /**
     * Get Reason for request 
     * @return Reason Reason for request
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for request
     * @param Reason Reason for request
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get Management type. 0: ordinary member; 1: admin. 
     * @return ManagerType Management type. 0: ordinary member; 1: admin.
     */
    public Long getManagerType() {
        return this.ManagerType;
    }

    /**
     * Set Management type. 0: ordinary member; 1: admin.
     * @param ManagerType Management type. 0: ordinary member; 1: admin.
     */
    public void setManagerType(Long ManagerType) {
        this.ManagerType = ManagerType;
    }

    /**
     * Get Authorized person. For sub-account authorization, pass the target uin. If empty, use the current uin by default. For visitor authorization, pass the visitor identity ID. 
     * @return Subject Authorized person. For sub-account authorization, pass the target uin. If empty, use the current uin by default. For visitor authorization, pass the visitor identity ID.
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set Authorized person. For sub-account authorization, pass the target uin. If empty, use the current uin by default. For visitor authorization, pass the visitor identity ID.
     * @param Subject Authorized person. For sub-account authorization, pass the target uin. If empty, use the current uin by default. For visitor authorization, pass the visitor identity ID.
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    public CreateDspmApplyOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmApplyOrderRequest(CreateDspmApplyOrderRequest source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.ApplyType != null) {
            this.ApplyType = new Long(source.ApplyType);
        }
        if (source.Privilege != null) {
            this.Privilege = new DspmDbAccountPrivilege(source.Privilege);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.ValidatePeriod != null) {
            this.ValidatePeriod = new Long(source.ValidatePeriod);
        }
        if (source.ApproverUin != null) {
            this.ApproverUin = new String[source.ApproverUin.length];
            for (int i = 0; i < source.ApproverUin.length; i++) {
                this.ApproverUin[i] = new String(source.ApproverUin[i]);
            }
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.ManagerType != null) {
            this.ManagerType = new Long(source.ManagerType);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "ApplyType", this.ApplyType);
        this.setParamObj(map, prefix + "Privilege.", this.Privilege);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ValidatePeriod", this.ValidatePeriod);
        this.setParamArraySimple(map, prefix + "ApproverUin.", this.ApproverUin);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "ManagerType", this.ManagerType);
        this.setParamSimple(map, prefix + "Subject", this.Subject);

    }
}

