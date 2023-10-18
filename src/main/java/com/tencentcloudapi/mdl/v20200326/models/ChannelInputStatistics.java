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

public class ChannelInputStatistics extends AbstractModel {

    /**
    * Input ID.
    */
    @SerializedName("InputId")
    @Expose
    private String InputId;

    /**
    * Input statistics.
    */
    @SerializedName("Statistics")
    @Expose
    private InputStatistics Statistics;

    /**
     * Get Input ID. 
     * @return InputId Input ID.
     */
    public String getInputId() {
        return this.InputId;
    }

    /**
     * Set Input ID.
     * @param InputId Input ID.
     */
    public void setInputId(String InputId) {
        this.InputId = InputId;
    }

    /**
     * Get Input statistics. 
     * @return Statistics Input statistics.
     */
    public InputStatistics getStatistics() {
        return this.Statistics;
    }

    /**
     * Set Input statistics.
     * @param Statistics Input statistics.
     */
    public void setStatistics(InputStatistics Statistics) {
        this.Statistics = Statistics;
    }

    public ChannelInputStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelInputStatistics(ChannelInputStatistics source) {
        if (source.InputId != null) {
            this.InputId = new String(source.InputId);
        }
        if (source.Statistics != null) {
            this.Statistics = new InputStatistics(source.Statistics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputId", this.InputId);
        this.setParamObj(map, prefix + "Statistics.", this.Statistics);

    }
}

