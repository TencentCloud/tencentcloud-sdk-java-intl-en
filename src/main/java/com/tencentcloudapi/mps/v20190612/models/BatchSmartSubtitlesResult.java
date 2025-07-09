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

public class BatchSmartSubtitlesResult extends AbstractModel {

    /**
    * Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Input")
    @Expose
    private SmartSubtitleTaskResultInput Input;

    /**
    * Output information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Outputs")
    @Expose
    private SmartSubtitleTaskBatchOutput [] Outputs;

    /**
     * Get Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Input Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartSubtitleTaskResultInput getInput() {
        return this.Input;
    }

    /**
     * Set Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Input Input information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInput(SmartSubtitleTaskResultInput Input) {
        this.Input = Input;
    }

    /**
     * Get Output information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Outputs Output information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public SmartSubtitleTaskBatchOutput [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set Output information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Outputs Output information for smart subtitle tasks.
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setOutputs(SmartSubtitleTaskBatchOutput [] Outputs) {
        this.Outputs = Outputs;
    }

    public BatchSmartSubtitlesResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchSmartSubtitlesResult(BatchSmartSubtitlesResult source) {
        if (source.Input != null) {
            this.Input = new SmartSubtitleTaskResultInput(source.Input);
        }
        if (source.Outputs != null) {
            this.Outputs = new SmartSubtitleTaskBatchOutput[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new SmartSubtitleTaskBatchOutput(source.Outputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Input.", this.Input);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);

    }
}

