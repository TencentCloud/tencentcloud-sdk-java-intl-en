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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ObjectConfigureInfo extends AbstractModel{

    /**
    * Switch of object recognition task. Valid values:
<li>ON: enables intelligent object recognition task;</li>
<li>OFF: disables intelligent object recognition task.</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Object library. Valid values:
<li>Default: default object library;</li>
<li>UserDefine: custom object library.</li>
<li>All: both default and custom object libraries will be used.</li>
Default value: All, i.e., both default and custom object libraries will be used.
    */
    @SerializedName("ObjectLibrary")
    @Expose
    private String ObjectLibrary;

    /**
     * Get Switch of object recognition task. Valid values:
<li>ON: enables intelligent object recognition task;</li>
<li>OFF: disables intelligent object recognition task.</li> 
     * @return Switch Switch of object recognition task. Valid values:
<li>ON: enables intelligent object recognition task;</li>
<li>OFF: disables intelligent object recognition task.</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch of object recognition task. Valid values:
<li>ON: enables intelligent object recognition task;</li>
<li>OFF: disables intelligent object recognition task.</li>
     * @param Switch Switch of object recognition task. Valid values:
<li>ON: enables intelligent object recognition task;</li>
<li>OFF: disables intelligent object recognition task.</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Object library. Valid values:
<li>Default: default object library;</li>
<li>UserDefine: custom object library.</li>
<li>All: both default and custom object libraries will be used.</li>
Default value: All, i.e., both default and custom object libraries will be used. 
     * @return ObjectLibrary Object library. Valid values:
<li>Default: default object library;</li>
<li>UserDefine: custom object library.</li>
<li>All: both default and custom object libraries will be used.</li>
Default value: All, i.e., both default and custom object libraries will be used.
     */
    public String getObjectLibrary() {
        return this.ObjectLibrary;
    }

    /**
     * Set Object library. Valid values:
<li>Default: default object library;</li>
<li>UserDefine: custom object library.</li>
<li>All: both default and custom object libraries will be used.</li>
Default value: All, i.e., both default and custom object libraries will be used.
     * @param ObjectLibrary Object library. Valid values:
<li>Default: default object library;</li>
<li>UserDefine: custom object library.</li>
<li>All: both default and custom object libraries will be used.</li>
Default value: All, i.e., both default and custom object libraries will be used.
     */
    public void setObjectLibrary(String ObjectLibrary) {
        this.ObjectLibrary = ObjectLibrary;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ObjectLibrary", this.ObjectLibrary);

    }
}

