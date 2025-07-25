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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceCommand extends AbstractModel {

    /**
    * Command name.
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * Number of executions.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Command name. 
     * @return Cmd Command name.
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * Set Command name.
     * @param Cmd Command name.
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * Get Number of executions. 
     * @return Count Number of executions.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of executions.
     * @param Count Number of executions.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public SourceCommand() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceCommand(SourceCommand source) {
        if (source.Cmd != null) {
            this.Cmd = new String(source.Cmd);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

