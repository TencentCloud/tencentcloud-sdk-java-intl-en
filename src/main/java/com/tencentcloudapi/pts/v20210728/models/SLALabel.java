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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SLALabel extends AbstractModel {

    /**
    * Label name.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * Label value.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("LabelValue")
    @Expose
    private String LabelValue;

    /**
     * Get Label name.

Note: This field may return null, indicating that no valid value is found. 
     * @return LabelName Label name.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set Label name.

Note: This field may return null, indicating that no valid value is found.
     * @param LabelName Label name.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get Label value.

Note: This field may return null, indicating that no valid value is found. 
     * @return LabelValue Label value.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getLabelValue() {
        return this.LabelValue;
    }

    /**
     * Set Label value.

Note: This field may return null, indicating that no valid value is found.
     * @param LabelValue Label value.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setLabelValue(String LabelValue) {
        this.LabelValue = LabelValue;
    }

    public SLALabel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SLALabel(SLALabel source) {
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.LabelValue != null) {
            this.LabelValue = new String(source.LabelValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "LabelValue", this.LabelValue);

    }
}

