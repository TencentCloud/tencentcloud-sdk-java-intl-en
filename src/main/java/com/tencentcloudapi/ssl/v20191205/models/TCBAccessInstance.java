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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCBAccessInstance extends AbstractModel {

    /**
    * The domain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * The status.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * The unified domain status.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UnionStatus")
    @Expose
    private Long UnionStatus;

    /**
    * Whether the domain is preempted. A preempted domain is one that is already associated with another environment. It must be disassociated or re-associated first.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPreempted")
    @Expose
    private Boolean IsPreempted;

    /**
    * Whether the domain is added to the ICP blocklist. Valid values: `0` for no and `1` for yes.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ICPStatus")
    @Expose
    private Long ICPStatus;

    /**
    * The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

    /**
     * Get The domain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Domain The domain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set The domain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Domain The domain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get The status.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status The status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The status.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status The status.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get The unified domain status.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UnionStatus The unified domain status.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnionStatus() {
        return this.UnionStatus;
    }

    /**
     * Set The unified domain status.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param UnionStatus The unified domain status.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnionStatus(Long UnionStatus) {
        this.UnionStatus = UnionStatus;
    }

    /**
     * Get Whether the domain is preempted. A preempted domain is one that is already associated with another environment. It must be disassociated or re-associated first.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPreempted Whether the domain is preempted. A preempted domain is one that is already associated with another environment. It must be disassociated or re-associated first.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPreempted() {
        return this.IsPreempted;
    }

    /**
     * Set Whether the domain is preempted. A preempted domain is one that is already associated with another environment. It must be disassociated or re-associated first.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPreempted Whether the domain is preempted. A preempted domain is one that is already associated with another environment. It must be disassociated or re-associated first.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPreempted(Boolean IsPreempted) {
        this.IsPreempted = IsPreempted;
    }

    /**
     * Get Whether the domain is added to the ICP blocklist. Valid values: `0` for no and `1` for yes.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ICPStatus Whether the domain is added to the ICP blocklist. Valid values: `0` for no and `1` for yes.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getICPStatus() {
        return this.ICPStatus;
    }

    /**
     * Set Whether the domain is added to the ICP blocklist. Valid values: `0` for no and `1` for yes.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param ICPStatus Whether the domain is added to the ICP blocklist. Valid values: `0` for no and `1` for yes.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setICPStatus(Long ICPStatus) {
        this.ICPStatus = ICPStatus;
    }

    /**
     * Get The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OldCertificateId The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OldCertificateId The ID of the associated certificate.
Note: This field may return null, indicating that no valid values can be obtained.
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

