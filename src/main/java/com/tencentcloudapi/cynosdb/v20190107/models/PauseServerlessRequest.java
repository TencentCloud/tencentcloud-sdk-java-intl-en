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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PauseServerlessRequest extends AbstractModel {

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Whether to pause forcibly and ignore the current user connections. Valid values: `0` (no), `1` (yes). Default value: `1`
    */
    @SerializedName("ForcePause")
    @Expose
    private Long ForcePause;

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Whether to pause forcibly and ignore the current user connections. Valid values: `0` (no), `1` (yes). Default value: `1` 
     * @return ForcePause Whether to pause forcibly and ignore the current user connections. Valid values: `0` (no), `1` (yes). Default value: `1`
     */
    public Long getForcePause() {
        return this.ForcePause;
    }

    /**
     * Set Whether to pause forcibly and ignore the current user connections. Valid values: `0` (no), `1` (yes). Default value: `1`
     * @param ForcePause Whether to pause forcibly and ignore the current user connections. Valid values: `0` (no), `1` (yes). Default value: `1`
     */
    public void setForcePause(Long ForcePause) {
        this.ForcePause = ForcePause;
    }

    public PauseServerlessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PauseServerlessRequest(PauseServerlessRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ForcePause != null) {
            this.ForcePause = new Long(source.ForcePause);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ForcePause", this.ForcePause);

    }
}

