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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSStatusInfo extends AbstractModel{

    /**
    * The policy level. Values:
<li>`low`: Loose.</li>
<li>`middle`: Moderate</li>
<li>`high`: Strict</li>
    */
    @SerializedName("PlyLevel")
    @Expose
    private String PlyLevel;

    /**
     * Get The policy level. Values:
<li>`low`: Loose.</li>
<li>`middle`: Moderate</li>
<li>`high`: Strict</li> 
     * @return PlyLevel The policy level. Values:
<li>`low`: Loose.</li>
<li>`middle`: Moderate</li>
<li>`high`: Strict</li>
     */
    public String getPlyLevel() {
        return this.PlyLevel;
    }

    /**
     * Set The policy level. Values:
<li>`low`: Loose.</li>
<li>`middle`: Moderate</li>
<li>`high`: Strict</li>
     * @param PlyLevel The policy level. Values:
<li>`low`: Loose.</li>
<li>`middle`: Moderate</li>
<li>`high`: Strict</li>
     */
    public void setPlyLevel(String PlyLevel) {
        this.PlyLevel = PlyLevel;
    }

    public DDoSStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSStatusInfo(DDoSStatusInfo source) {
        if (source.PlyLevel != null) {
            this.PlyLevel = new String(source.PlyLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlyLevel", this.PlyLevel);

    }
}

