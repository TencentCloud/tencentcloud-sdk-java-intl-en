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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiStoryboardConfig extends AbstractModel {

    /**
    * <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>Specify the serial number of the storyboard to extract. Counting begins from 0. If not specified, return all storyboards.</p>
    */
    @SerializedName("ProcessIndex")
    @Expose
    private Long ProcessIndex;

    /**
     * Get <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p> 
     * @return Switch <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
     * @param Switch <p>Capability configuration switch, available values: ON: Enable; OFF: Disable. Default value: ON.</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>Specify the serial number of the storyboard to extract. Counting begins from 0. If not specified, return all storyboards.</p> 
     * @return ProcessIndex <p>Specify the serial number of the storyboard to extract. Counting begins from 0. If not specified, return all storyboards.</p>
     */
    public Long getProcessIndex() {
        return this.ProcessIndex;
    }

    /**
     * Set <p>Specify the serial number of the storyboard to extract. Counting begins from 0. If not specified, return all storyboards.</p>
     * @param ProcessIndex <p>Specify the serial number of the storyboard to extract. Counting begins from 0. If not specified, return all storyboards.</p>
     */
    public void setProcessIndex(Long ProcessIndex) {
        this.ProcessIndex = ProcessIndex;
    }

    public AiStoryboardConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiStoryboardConfig(AiStoryboardConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ProcessIndex != null) {
            this.ProcessIndex = new Long(source.ProcessIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ProcessIndex", this.ProcessIndex);

    }
}

