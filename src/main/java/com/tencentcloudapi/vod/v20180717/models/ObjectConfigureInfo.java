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

public class ObjectConfigureInfo extends AbstractModel {

    /**
    * Object recognition task switch. Available values:
<li>ON: enable the intelligent object recognition task;</li>
<li>OFF: Disable the intelligent object recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Object library selection. Valid values:
<li>Default: use the default object library;</li>
<li>UserDefine: Use the user-defined object library.</li>
<li>All: Use both the default object library and the user-defined object library.</li>
Default value: All. The default object library and user-defined object library are used simultaneously.
    */
    @SerializedName("ObjectLibrary")
    @Expose
    private String ObjectLibrary;

    /**
     * Get Object recognition task switch. Available values:
<li>ON: enable the intelligent object recognition task;</li>
<li>OFF: Disable the intelligent object recognition task.</li> 
     * @return Switch Object recognition task switch. Available values:
<li>ON: enable the intelligent object recognition task;</li>
<li>OFF: Disable the intelligent object recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Object recognition task switch. Available values:
<li>ON: enable the intelligent object recognition task;</li>
<li>OFF: Disable the intelligent object recognition task.</li>
     * @param Switch Object recognition task switch. Available values:
<li>ON: enable the intelligent object recognition task;</li>
<li>OFF: Disable the intelligent object recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Object library selection. Valid values:
<li>Default: use the default object library;</li>
<li>UserDefine: Use the user-defined object library.</li>
<li>All: Use both the default object library and the user-defined object library.</li>
Default value: All. The default object library and user-defined object library are used simultaneously. 
     * @return ObjectLibrary Object library selection. Valid values:
<li>Default: use the default object library;</li>
<li>UserDefine: Use the user-defined object library.</li>
<li>All: Use both the default object library and the user-defined object library.</li>
Default value: All. The default object library and user-defined object library are used simultaneously.
     */
    public String getObjectLibrary() {
        return this.ObjectLibrary;
    }

    /**
     * Set Object library selection. Valid values:
<li>Default: use the default object library;</li>
<li>UserDefine: Use the user-defined object library.</li>
<li>All: Use both the default object library and the user-defined object library.</li>
Default value: All. The default object library and user-defined object library are used simultaneously.
     * @param ObjectLibrary Object library selection. Valid values:
<li>Default: use the default object library;</li>
<li>UserDefine: Use the user-defined object library.</li>
<li>All: Use both the default object library and the user-defined object library.</li>
Default value: All. The default object library and user-defined object library are used simultaneously.
     */
    public void setObjectLibrary(String ObjectLibrary) {
        this.ObjectLibrary = ObjectLibrary;
    }

    public ObjectConfigureInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ObjectConfigureInfo(ObjectConfigureInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ObjectLibrary != null) {
            this.ObjectLibrary = new String(source.ObjectLibrary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ObjectLibrary", this.ObjectLibrary);

    }
}

