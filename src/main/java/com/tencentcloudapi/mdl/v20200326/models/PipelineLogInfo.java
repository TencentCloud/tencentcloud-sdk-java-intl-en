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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PipelineLogInfo extends AbstractModel{

    /**
    * Log information of pipeline 0.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pipeline0")
    @Expose
    private LogInfo [] Pipeline0;

    /**
    * Log information of pipeline 1.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pipeline1")
    @Expose
    private LogInfo [] Pipeline1;

    /**
     * Get Log information of pipeline 0.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Pipeline0 Log information of pipeline 0.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public LogInfo [] getPipeline0() {
        return this.Pipeline0;
    }

    /**
     * Set Log information of pipeline 0.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Pipeline0 Log information of pipeline 0.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPipeline0(LogInfo [] Pipeline0) {
        this.Pipeline0 = Pipeline0;
    }

    /**
     * Get Log information of pipeline 1.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Pipeline1 Log information of pipeline 1.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public LogInfo [] getPipeline1() {
        return this.Pipeline1;
    }

    /**
     * Set Log information of pipeline 1.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Pipeline1 Log information of pipeline 1.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPipeline1(LogInfo [] Pipeline1) {
        this.Pipeline1 = Pipeline1;
    }

    public PipelineLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PipelineLogInfo(PipelineLogInfo source) {
        if (source.Pipeline0 != null) {
            this.Pipeline0 = new LogInfo[source.Pipeline0.length];
            for (int i = 0; i < source.Pipeline0.length; i++) {
                this.Pipeline0[i] = new LogInfo(source.Pipeline0[i]);
            }
        }
        if (source.Pipeline1 != null) {
            this.Pipeline1 = new LogInfo[source.Pipeline1.length];
            for (int i = 0; i < source.Pipeline1.length; i++) {
                this.Pipeline1[i] = new LogInfo(source.Pipeline1[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Pipeline0.", this.Pipeline0);
        this.setParamArrayObj(map, prefix + "Pipeline1.", this.Pipeline1);

    }
}

