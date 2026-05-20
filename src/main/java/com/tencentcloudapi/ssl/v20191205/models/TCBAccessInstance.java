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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCBAccessInstance extends AbstractModel {

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Unified domain status

    */
    @SerializedName("UnionStatus")
    @Expose
    private Long UnionStatus;

    /**
    * Whether it is preempted. Preemption means the domain name is bound to another environment and must be unbound or rebound.

    */
    @SerializedName("IsPreempted")
    @Expose
    private Boolean IsPreempted;

    /**
    * icp blocklist ban status. 0 - Not blocked. 1 - Blocked.

    */
    @SerializedName("ICPStatus")
    @Expose
    private Long ICPStatus;

    /**
    * Bound Certificate ID
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Unified domain status
 
     * @return UnionStatus Unified domain status

     */
    public Long getUnionStatus() {
        return this.UnionStatus;
    }

    /**
     * Set Unified domain status

     * @param UnionStatus Unified domain status

     */
    public void setUnionStatus(Long UnionStatus) {
        this.UnionStatus = UnionStatus;
    }

    /**
     * Get Whether it is preempted. Preemption means the domain name is bound to another environment and must be unbound or rebound.
 
     * @return IsPreempted Whether it is preempted. Preemption means the domain name is bound to another environment and must be unbound or rebound.

     */
    public Boolean getIsPreempted() {
        return this.IsPreempted;
    }

    /**
     * Set Whether it is preempted. Preemption means the domain name is bound to another environment and must be unbound or rebound.

     * @param IsPreempted Whether it is preempted. Preemption means the domain name is bound to another environment and must be unbound or rebound.

     */
    public void setIsPreempted(Boolean IsPreempted) {
        this.IsPreempted = IsPreempted;
    }

    /**
     * Get icp blocklist ban status. 0 - Not blocked. 1 - Blocked.
 
     * @return ICPStatus icp blocklist ban status. 0 - Not blocked. 1 - Blocked.

     */
    public Long getICPStatus() {
        return this.ICPStatus;
    }

    /**
     * Set icp blocklist ban status. 0 - Not blocked. 1 - Blocked.

     * @param ICPStatus icp blocklist ban status. 0 - Not blocked. 1 - Blocked.

     */
    public void setICPStatus(Long ICPStatus) {
        this.ICPStatus = ICPStatus;
    }

    /**
     * Get Bound Certificate ID 
     * @return OldCertificateId Bound Certificate ID
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set Bound Certificate ID
     * @param OldCertificateId Bound Certificate ID
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    public TCBAccessInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCBAccessInstance(TCBAccessInstance source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UnionStatus != null) {
            this.UnionStatus = new Long(source.UnionStatus);
        }
        if (source.IsPreempted != null) {
            this.IsPreempted = new Boolean(source.IsPreempted);
        }
        if (source.ICPStatus != null) {
            this.ICPStatus = new Long(source.ICPStatus);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UnionStatus", this.UnionStatus);
        this.setParamSimple(map, prefix + "IsPreempted", this.IsPreempted);
        this.setParamSimple(map, prefix + "ICPStatus", this.ICPStatus);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);

    }
}

