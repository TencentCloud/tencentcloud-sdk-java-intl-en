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

public class AiQualityControlTaskInput extends AbstractModel {

    /**
    * Media quality inspection template ID.
You can directly use a preset template or customize a template in the console. The preset templates are as follows:
- 10: Enable all quality inspection items.
- 20: Only enable quality inspection items corresponding to format diagnosis.
- 30: Only enable quality inspection items corresponding to no-reference scoring.
- 40: Only enable quality inspection items corresponding to screen quality.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The channel extension parameter, which is a serialized JSON string.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChannelExtPara")
    @Expose
    private String ChannelExtPara;

    /**
     * Get Media quality inspection template ID.
You can directly use a preset template or customize a template in the console. The preset templates are as follows:
- 10: Enable all quality inspection items.
- 20: Only enable quality inspection items corresponding to format diagnosis.
- 30: Only enable quality inspection items corresponding to no-reference scoring.
- 40: Only enable quality inspection items corresponding to screen quality.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Definition Media quality inspection template ID.
You can directly use a preset template or customize a template in the console. The preset templates are as follows:
- 10: Enable all quality inspection items.
- 20: Only enable quality inspection items corresponding to format diagnosis.
- 30: Only enable quality inspection items corresponding to no-reference scoring.
- 40: Only enable quality inspection items corresponding to screen quality.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Media quality inspection template ID.
You can directly use a preset template or customize a template in the console. The preset templates are as follows:
- 10: Enable all quality inspection items.
- 20: Only enable quality inspection items corresponding to format diagnosis.
- 30: Only enable quality inspection items corresponding to no-reference scoring.
- 40: Only enable quality inspection items corresponding to screen quality.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Definition Media quality inspection template ID.
You can directly use a preset template or customize a template in the console. The preset templates are as follows:
- 10: Enable all quality inspection items.
- 20: Only enable quality inspection items corresponding to format diagnosis.
- 30: Only enable quality inspection items corresponding to no-reference scoring.
- 40: Only enable quality inspection items corresponding to screen quality.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get The channel extension parameter, which is a serialized JSON string.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChannelExtPara The channel extension parameter, which is a serialized JSON string.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChannelExtPara() {
        return this.ChannelExtPara;
    }

    /**
     * Set The channel extension parameter, which is a serialized JSON string.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChannelExtPara The channel extension parameter, which is a serialized JSON string.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChannelExtPara(String ChannelExtPara) {
        this.ChannelExtPara = ChannelExtPara;
    }

    public AiQualityControlTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiQualityControlTaskInput(AiQualityControlTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ChannelExtPara != null) {
            this.ChannelExtPara = new String(source.ChannelExtPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ChannelExtPara", this.ChannelExtPara);

    }
}

