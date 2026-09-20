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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OcrWordsConfigureInfoForUpdate extends AbstractModel {

    /**
    * Text keyword recognition task switch. Available values:
<li>ON: enable the text keyword recognition task</li>
<li>OFF: disables the text keyword recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Keyword-based filtering tag. Specify the tag of keywords to return. If this parameter is not specified or is empty, all results are returned.
The maximum number of tags is 10, and each tag can contain up to 16 characters.
    */
    @SerializedName("LabelSet")
    @Expose
    private String [] LabelSet;

    /**
     * Get Text keyword recognition task switch. Available values:
<li>ON: enable the text keyword recognition task</li>
<li>OFF: disables the text keyword recognition task.</li> 
     * @return Switch Text keyword recognition task switch. Available values:
<li>ON: enable the text keyword recognition task</li>
<li>OFF: disables the text keyword recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Text keyword recognition task switch. Available values:
<li>ON: enable the text keyword recognition task</li>
<li>OFF: disables the text keyword recognition task.</li>
     * @param Switch Text keyword recognition task switch. Available values:
<li>ON: enable the text keyword recognition task</li>
<li>OFF: disables the text keyword recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Keyword-based filtering tag. Specify the tag of keywords to return. If this parameter is not specified or is empty, all results are returned.
The maximum number of tags is 10, and each tag can contain up to 16 characters. 
     * @return LabelSet Keyword-based filtering tag. Specify the tag of keywords to return. If this parameter is not specified or is empty, all results are returned.
The maximum number of tags is 10, and each tag can contain up to 16 characters.
     */
    public String [] getLabelSet() {
        return this.LabelSet;
    }

    /**
     * Set Keyword-based filtering tag. Specify the tag of keywords to return. If this parameter is not specified or is empty, all results are returned.
The maximum number of tags is 10, and each tag can contain up to 16 characters.
     * @param LabelSet Keyword-based filtering tag. Specify the tag of keywords to return. If this parameter is not specified or is empty, all results are returned.
The maximum number of tags is 10, and each tag can contain up to 16 characters.
     */
    public void setLabelSet(String [] LabelSet) {
        this.LabelSet = LabelSet;
    }

    public OcrWordsConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OcrWordsConfigureInfoForUpdate(OcrWordsConfigureInfoForUpdate source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.LabelSet != null) {
            this.LabelSet = new String[source.LabelSet.length];
            for (int i = 0; i < source.LabelSet.length; i++) {
                this.LabelSet[i] = new String(source.LabelSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "LabelSet.", this.LabelSet);

    }
}

