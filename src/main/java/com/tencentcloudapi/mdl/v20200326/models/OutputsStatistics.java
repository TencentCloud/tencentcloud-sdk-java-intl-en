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

public class OutputsStatistics extends AbstractModel{

    /**
    * Output information of pipeline 0.
    */
    @SerializedName("Pipeline0")
    @Expose
    private PipelineOutputStatistics [] Pipeline0;

    /**
    * Output information of pipeline 1.
    */
    @SerializedName("Pipeline1")
    @Expose
    private PipelineOutputStatistics [] Pipeline1;

    /**
     * Get Output information of pipeline 0. 
     * @return Pipeline0 Output information of pipeline 0.
     */
    public PipelineOutputStatistics [] getPipeline0() {
        return this.Pipeline0;
    }

    /**
     * Set Output information of pipeline 0.
     * @param Pipeline0 Output information of pipeline 0.
     */
    public void setPipeline0(PipelineOutputStatistics [] Pipeline0) {
        this.Pipeline0 = Pipeline0;
    }

    /**
     * Get Output information of pipeline 1. 
     * @return Pipeline1 Output information of pipeline 1.
     */
    public PipelineOutputStatistics [] getPipeline1() {
        return this.Pipeline1;
    }

    /**
     * Set Output information of pipeline 1.
     * @param Pipeline1 Output information of pipeline 1.
     */
    public void setPipeline1(PipelineOutputStatistics [] Pipeline1) {
        this.Pipeline1 = Pipeline1;
    }

    public OutputsStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputsStatistics(OutputsStatistics source) {
        if (source.Pipeline0 != null) {
            this.Pipeline0 = new PipelineOutputStatistics[source.Pipeline0.length];
            for (int i = 0; i < source.Pipeline0.length; i++) {
                this.Pipeline0[i] = new PipelineOutputStatistics(source.Pipeline0[i]);
            }
        }
        if (source.Pipeline1 != null) {
            this.Pipeline1 = new PipelineOutputStatistics[source.Pipeline1.length];
            for (int i = 0; i < source.Pipeline1.length; i++) {
                this.Pipeline1[i] = new PipelineOutputStatistics(source.Pipeline1[i]);
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

