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

public class AiAnalysisTaskHeadTailOutput extends AbstractModel {

    /**
    * Opening segment PTS.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeadTimeOffset")
    @Expose
    private Float HeadTimeOffset;

    /**
    * Closing segment PTS.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TailTimeOffset")
    @Expose
    private Float TailTimeOffset;

    /**
     * Get Opening segment PTS.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HeadTimeOffset Opening segment PTS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getHeadTimeOffset() {
        return this.HeadTimeOffset;
    }

    /**
     * Set Opening segment PTS.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HeadTimeOffset Opening segment PTS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHeadTimeOffset(Float HeadTimeOffset) {
        this.HeadTimeOffset = HeadTimeOffset;
    }

    /**
     * Get Closing segment PTS.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TailTimeOffset Closing segment PTS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getTailTimeOffset() {
        return this.TailTimeOffset;
    }

    /**
     * Set Closing segment PTS.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TailTimeOffset Closing segment PTS.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTailTimeOffset(Float TailTimeOffset) {
        this.TailTimeOffset = TailTimeOffset;
    }

    public AiAnalysisTaskHeadTailOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskHeadTailOutput(AiAnalysisTaskHeadTailOutput source) {
        if (source.HeadTimeOffset != null) {
            this.HeadTimeOffset = new Float(source.HeadTimeOffset);
        }
        if (source.TailTimeOffset != null) {
            this.TailTimeOffset = new Float(source.TailTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HeadTimeOffset", this.HeadTimeOffset);
        this.setParamSimple(map, prefix + "TailTimeOffset", this.TailTimeOffset);

    }
}

