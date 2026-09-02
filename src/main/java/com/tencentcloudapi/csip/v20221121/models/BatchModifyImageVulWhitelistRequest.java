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

public class BatchModifyImageVulWhitelistRequest extends AbstractModel {

    /**
    * <p>Vulnerability allowlist id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long [] RuleId;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Whitelist status</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>Vulnerability allowlist id</p> 
     * @return RuleId <p>Vulnerability allowlist id</p>
     */
    public Long [] getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>Vulnerability allowlist id</p>
     * @param RuleId <p>Vulnerability allowlist id</p>
     */
    public void setRuleId(Long [] RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Whitelist status</p> 
     * @return Status <p>Whitelist status</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Whitelist status</p>
     * @param Status <p>Whitelist status</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public BatchModifyImageVulWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyImageVulWhitelistRequest(BatchModifyImageVulWhitelistRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long[source.RuleId.length];
            for (int i = 0; i < source.RuleId.length; i++) {
                this.RuleId[i] = new Long(source.RuleId[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleId.", this.RuleId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

