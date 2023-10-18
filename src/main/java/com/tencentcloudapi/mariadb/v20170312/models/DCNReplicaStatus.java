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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DCNReplicaStatus extends AbstractModel {

    /**
    * DCN running status. Valid values: `START` (running), `STOP` (pause).
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The current delay, which takes the delay value of the replica instance.
    */
    @SerializedName("Delay")
    @Expose
    private Long Delay;

    /**
     * Get DCN running status. Valid values: `START` (running), `STOP` (pause).
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status DCN running status. Valid values: `START` (running), `STOP` (pause).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set DCN running status. Valid values: `START` (running), `STOP` (pause).
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status DCN running status. Valid values: `START` (running), `STOP` (pause).
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The current delay, which takes the delay value of the replica instance. 
     * @return Delay The current delay, which takes the delay value of the replica instance.
     */
    public Long getDelay() {
        return this.Delay;
    }

    /**
     * Set The current delay, which takes the delay value of the replica instance.
     * @param Delay The current delay, which takes the delay value of the replica instance.
     */
    public void setDelay(Long Delay) {
        this.Delay = Delay;
    }

    public DCNReplicaStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DCNReplicaStatus(DCNReplicaStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Delay != null) {
            this.Delay = new Long(source.Delay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Delay", this.Delay);

    }
}

