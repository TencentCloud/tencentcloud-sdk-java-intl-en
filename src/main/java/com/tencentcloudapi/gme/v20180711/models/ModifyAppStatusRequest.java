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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAppStatusRequest extends AbstractModel {

    /**
    * Application ID, which is generated and returned by the backend after the application creation.
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * Application status. Valid values: `open`, `close`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get Application ID, which is generated and returned by the backend after the application creation. 
     * @return BizId Application ID, which is generated and returned by the backend after the application creation.
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Application ID, which is generated and returned by the backend after the application creation.
     * @param BizId Application ID, which is generated and returned by the backend after the application creation.
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get Application status. Valid values: `open`, `close`. 
     * @return Status Application status. Valid values: `open`, `close`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Application status. Valid values: `open`, `close`.
     * @param Status Application status. Valid values: `open`, `close`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyAppStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAppStatusRequest(ModifyAppStatusRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

