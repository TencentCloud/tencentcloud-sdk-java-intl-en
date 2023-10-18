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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutUserPermissionsBoundaryRequest extends AbstractModel {

    /**
    * Sub-account `Uin`
    */
    @SerializedName("TargetUin")
    @Expose
    private Long TargetUin;

    /**
    * Policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
     * Get Sub-account `Uin` 
     * @return TargetUin Sub-account `Uin`
     */
    public Long getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set Sub-account `Uin`
     * @param TargetUin Sub-account `Uin`
     */
    public void setTargetUin(Long TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get Policy ID 
     * @return PolicyId Policy ID
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Policy ID
     * @param PolicyId Policy ID
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    public PutUserPermissionsBoundaryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutUserPermissionsBoundaryRequest(PutUserPermissionsBoundaryRequest source) {
        if (source.TargetUin != null) {
            this.TargetUin = new Long(source.TargetUin);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

