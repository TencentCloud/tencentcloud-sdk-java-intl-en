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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteGlobalAcceleratorAccessLogRequest extends AbstractModel {

    /**
    * <p>Log Unique Id</p>
    */
    @SerializedName("LogPushTaskId")
    @Expose
    private String LogPushTaskId;

    /**
    * <p>Unique Id of the GA instance</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
     * Get <p>Log Unique Id</p> 
     * @return LogPushTaskId <p>Log Unique Id</p>
     */
    public String getLogPushTaskId() {
        return this.LogPushTaskId;
    }

    /**
     * Set <p>Log Unique Id</p>
     * @param LogPushTaskId <p>Log Unique Id</p>
     */
    public void setLogPushTaskId(String LogPushTaskId) {
        this.LogPushTaskId = LogPushTaskId;
    }

    /**
     * Get <p>Unique Id of the GA instance</p> 
     * @return GlobalAcceleratorId <p>Unique Id of the GA instance</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>Unique Id of the GA instance</p>
     * @param GlobalAcceleratorId <p>Unique Id of the GA instance</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    public DeleteGlobalAcceleratorAccessLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteGlobalAcceleratorAccessLogRequest(DeleteGlobalAcceleratorAccessLogRequest source) {
        if (source.LogPushTaskId != null) {
            this.LogPushTaskId = new String(source.LogPushTaskId);
        }
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogPushTaskId", this.LogPushTaskId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);

    }
}

