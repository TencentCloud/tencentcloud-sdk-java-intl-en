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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputStatistics extends AbstractModel {

    /**
    * Input statistics of pipeline 0.
    */
    @SerializedName("Pipeline0")
    @Expose
    private PipelineInputStatistics [] Pipeline0;

    /**
    * Input statistics of pipeline 1.
    */
    @SerializedName("Pipeline1")
    @Expose
    private PipelineInputStatistics [] Pipeline1;

    /**
     * Get Input statistics of pipeline 0. 
     * @return Pipeline0 Input statistics of pipeline 0.
     */
    public PipelineInputStatistics [] getPipeline0() {
        return this.Pipeline0;
    }

    /**
     * Set Input statistics of pipeline 0.
     * @param Pipeline0 Input statistics of pipeline 0.
     */
    public void setPipeline0(PipelineInputStatistics [] Pipeline0) {
        this.Pipeline0 = Pipeline0;
    }

    /**
     * Get Input statistics of pipeline 1. 
     * @return Pipeline1 Input statistics of pipeline 1.
     */
    public PipelineInputStatistics [] getPipeline1() {
        return this.Pipeline1;
    }

    /**
     * Set Input statistics of pipeline 1.
     * @param Pipeline1 Input statistics of pipeline 1.
     */
    public void setPipeline1(PipelineInputStatistics [] Pipeline1) {
        this.Pipeline1 = Pipeline1;
    }

    public InputStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputStatistics(InputStatistics source) {
        if (source.Pipeline0 != null) {
            this.Pipeline0 = new PipelineInputStatistics[source.Pipeline0.length];
            for (int i = 0; i < source.Pipeline0.length; i++) {
                this.Pipeline0[i] = new PipelineInputStatistics(source.Pipeline0[i]);
            }
        }
        if (source.Pipeline1 != null) {
            this.Pipeline1 = new PipelineInputStatistics[source.Pipeline1.length];
            for (int i = 0; i < source.Pipeline1.length; i++) {
                this.Pipeline1[i] = new PipelineInputStatistics(source.Pipeline1[i]);
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

