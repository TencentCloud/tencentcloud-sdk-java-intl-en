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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelOutputsStatistics extends AbstractModel {

    /**
    * Output group name.
    */
    @SerializedName("OutputGroupName")
    @Expose
    private String OutputGroupName;

    /**
    * Output group statistics.
    */
    @SerializedName("Statistics")
    @Expose
    private OutputsStatistics Statistics;

    /**
     * Get Output group name. 
     * @return OutputGroupName Output group name.
     */
    public String getOutputGroupName() {
        return this.OutputGroupName;
    }

    /**
     * Set Output group name.
     * @param OutputGroupName Output group name.
     */
    public void setOutputGroupName(String OutputGroupName) {
        this.OutputGroupName = OutputGroupName;
    }

    /**
     * Get Output group statistics. 
     * @return Statistics Output group statistics.
     */
    public OutputsStatistics getStatistics() {
        return this.Statistics;
    }

    /**
     * Set Output group statistics.
     * @param Statistics Output group statistics.
     */
    public void setStatistics(OutputsStatistics Statistics) {
        this.Statistics = Statistics;
    }

    public ChannelOutputsStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelOutputsStatistics(ChannelOutputsStatistics source) {
        if (source.OutputGroupName != null) {
            this.OutputGroupName = new String(source.OutputGroupName);
        }
        if (source.Statistics != null) {
            this.Statistics = new OutputsStatistics(source.Statistics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputGroupName", this.OutputGroupName);
        this.setParamObj(map, prefix + "Statistics.", this.Statistics);

    }
}

