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

public class DeleteDspmAuditFilterStrategyRequest extends AbstractModel {

    /**
    * <p>Policy ID.</p>
    */
    @SerializedName("AuditFilterStrategyId")
    @Expose
    private Long [] AuditFilterStrategyId;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Policy ID.</p> 
     * @return AuditFilterStrategyId <p>Policy ID.</p>
     */
    public Long [] getAuditFilterStrategyId() {
        return this.AuditFilterStrategyId;
    }

    /**
     * Set <p>Policy ID.</p>
     * @param AuditFilterStrategyId <p>Policy ID.</p>
     */
    public void setAuditFilterStrategyId(Long [] AuditFilterStrategyId) {
        this.AuditFilterStrategyId = AuditFilterStrategyId;
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

    public DeleteDspmAuditFilterStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDspmAuditFilterStrategyRequest(DeleteDspmAuditFilterStrategyRequest source) {
        if (source.AuditFilterStrategyId != null) {
            this.AuditFilterStrategyId = new Long[source.AuditFilterStrategyId.length];
            for (int i = 0; i < source.AuditFilterStrategyId.length; i++) {
                this.AuditFilterStrategyId[i] = new Long(source.AuditFilterStrategyId[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AuditFilterStrategyId.", this.AuditFilterStrategyId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

