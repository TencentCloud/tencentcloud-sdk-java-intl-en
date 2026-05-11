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

public class AdvancedElementInfo extends AbstractModel {

    /**
    * <p>Subject ID.</p>
    */
    @SerializedName("ElementId")
    @Expose
    private String ElementId;

    /**
    * <p>Entity information.</p>
    */
    @SerializedName("ElementInfo")
    @Expose
    private String ElementInfo;

    /**
     * Get <p>Subject ID.</p> 
     * @return ElementId <p>Subject ID.</p>
     */
    public String getElementId() {
        return this.ElementId;
    }

    /**
     * Set <p>Subject ID.</p>
     * @param ElementId <p>Subject ID.</p>
     */
    public void setElementId(String ElementId) {
        this.ElementId = ElementId;
    }

    /**
     * Get <p>Entity information.</p> 
     * @return ElementInfo <p>Entity information.</p>
     */
    public String getElementInfo() {
        return this.ElementInfo;
    }

    /**
     * Set <p>Entity information.</p>
     * @param ElementInfo <p>Entity information.</p>
     */
    public void setElementInfo(String ElementInfo) {
        this.ElementInfo = ElementInfo;
    }

    public AdvancedElementInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedElementInfo(AdvancedElementInfo source) {
        if (source.ElementId != null) {
            this.ElementId = new String(source.ElementId);
        }
        if (source.ElementInfo != null) {
            this.ElementInfo = new String(source.ElementInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ElementId", this.ElementId);
        this.setParamSimple(map, prefix + "ElementInfo", this.ElementInfo);

    }
}

