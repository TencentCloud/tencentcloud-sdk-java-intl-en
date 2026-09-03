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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RDMAConfig extends AbstractModel {

    /**
    * Whether to enable RDMA.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
     * Get Whether to enable RDMA.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Enable Whether to enable RDMA.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set Whether to enable RDMA.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Enable Whether to enable RDMA.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public RDMAConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RDMAConfig(RDMAConfig source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

