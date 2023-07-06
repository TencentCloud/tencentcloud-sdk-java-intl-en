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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatusResponse extends AbstractModel{

    /**
    * Task status. `0` (Successful), `1` (Failed), `2` ( Running)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Output information Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
     * Get Task status. `0` (Successful), `1` (Failed), `2` ( Running) 
     * @return Status Task status. `0` (Successful), `1` (Failed), `2` ( Running)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Task status. `0` (Successful), `1` (Failed), `2` ( Running)
     * @param Status Task status. `0` (Successful), `1` (Failed), `2` ( Running)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Output information Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Output Output information Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set Output information Note: This field may return null, indicating that no valid values can be obtained.
     * @param Output Output information Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    public TaskStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatusResponse(TaskStatusResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Output", this.Output);

    }
}

