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

public class ChannelAlertInfos extends AbstractModel {

    /**
    * Alarm details of pipeline 0 under this channel.
    */
    @SerializedName("Pipeline0")
    @Expose
    private ChannelPipelineAlerts [] Pipeline0;

    /**
    * Alarm details of pipeline 1 under this channel.
    */
    @SerializedName("Pipeline1")
    @Expose
    private ChannelPipelineAlerts [] Pipeline1;

    /**
     * Get Alarm details of pipeline 0 under this channel. 
     * @return Pipeline0 Alarm details of pipeline 0 under this channel.
     */
    public ChannelPipelineAlerts [] getPipeline0() {
        return this.Pipeline0;
    }

    /**
     * Set Alarm details of pipeline 0 under this channel.
     * @param Pipeline0 Alarm details of pipeline 0 under this channel.
     */
    public void setPipeline0(ChannelPipelineAlerts [] Pipeline0) {
        this.Pipeline0 = Pipeline0;
    }

    /**
     * Get Alarm details of pipeline 1 under this channel. 
     * @return Pipeline1 Alarm details of pipeline 1 under this channel.
     */
    public ChannelPipelineAlerts [] getPipeline1() {
        return this.Pipeline1;
    }

    /**
     * Set Alarm details of pipeline 1 under this channel.
     * @param Pipeline1 Alarm details of pipeline 1 under this channel.
     */
    public void setPipeline1(ChannelPipelineAlerts [] Pipeline1) {
        this.Pipeline1 = Pipeline1;
    }

    public ChannelAlertInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelAlertInfos(ChannelAlertInfos source) {
        if (source.Pipeline0 != null) {
            this.Pipeline0 = new ChannelPipelineAlerts[source.Pipeline0.length];
            for (int i = 0; i < source.Pipeline0.length; i++) {
                this.Pipeline0[i] = new ChannelPipelineAlerts(source.Pipeline0[i]);
            }
        }
        if (source.Pipeline1 != null) {
            this.Pipeline1 = new ChannelPipelineAlerts[source.Pipeline1.length];
            for (int i = 0; i < source.Pipeline1.length; i++) {
                this.Pipeline1[i] = new ChannelPipelineAlerts(source.Pipeline1[i]);
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

