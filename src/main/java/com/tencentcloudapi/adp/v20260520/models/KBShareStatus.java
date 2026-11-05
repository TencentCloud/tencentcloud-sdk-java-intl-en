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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KBShareStatus extends AbstractModel {

    /**
    * <p>Approval Id.</p>
    */
    @SerializedName("ApprovalId")
    @Expose
    private String ApprovalId;

    /**
    * <p>Approval/shared state: 1=PENDING Pending Approval, 2=REJECTED rejected, 3=APPROVED approved, 4=CANCELLED canceled</p>
    */
    @SerializedName("SubStatusList")
    @Expose
    private Long [] SubStatusList;

    /**
     * Get <p>Approval Id.</p> 
     * @return ApprovalId <p>Approval Id.</p>
     */
    public String getApprovalId() {
        return this.ApprovalId;
    }

    /**
     * Set <p>Approval Id.</p>
     * @param ApprovalId <p>Approval Id.</p>
     */
    public void setApprovalId(String ApprovalId) {
        this.ApprovalId = ApprovalId;
    }

    /**
     * Get <p>Approval/shared state: 1=PENDING Pending Approval, 2=REJECTED rejected, 3=APPROVED approved, 4=CANCELLED canceled</p> 
     * @return SubStatusList <p>Approval/shared state: 1=PENDING Pending Approval, 2=REJECTED rejected, 3=APPROVED approved, 4=CANCELLED canceled</p>
     */
    public Long [] getSubStatusList() {
        return this.SubStatusList;
    }

    /**
     * Set <p>Approval/shared state: 1=PENDING Pending Approval, 2=REJECTED rejected, 3=APPROVED approved, 4=CANCELLED canceled</p>
     * @param SubStatusList <p>Approval/shared state: 1=PENDING Pending Approval, 2=REJECTED rejected, 3=APPROVED approved, 4=CANCELLED canceled</p>
     */
    public void setSubStatusList(Long [] SubStatusList) {
        this.SubStatusList = SubStatusList;
    }

    public KBShareStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBShareStatus(KBShareStatus source) {
        if (source.ApprovalId != null) {
            this.ApprovalId = new String(source.ApprovalId);
        }
        if (source.SubStatusList != null) {
            this.SubStatusList = new Long[source.SubStatusList.length];
            for (int i = 0; i < source.SubStatusList.length; i++) {
                this.SubStatusList[i] = new Long(source.SubStatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApprovalId", this.ApprovalId);
        this.setParamArraySimple(map, prefix + "SubStatusList.", this.SubStatusList);

    }
}

