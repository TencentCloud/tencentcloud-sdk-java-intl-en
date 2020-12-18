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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnAclConfig extends AbstractModel{

    /**
    * Whether to enable. Valid values: `on` and `off`.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * ACL rule group, which is required when the access control is on.
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ScriptData")
    @Expose
    private ScdnAclGroup [] ScriptData;

    /**
    * Error page configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("ErrorPage")
    @Expose
    private ScdnErrorPage ErrorPage;

    /**
     * Get Whether to enable. Valid values: `on` and `off`. 
     * @return Switch Whether to enable. Valid values: `on` and `off`.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable. Valid values: `on` and `off`.
     * @param Switch Whether to enable. Valid values: `on` and `off`.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get ACL rule group, which is required when the access control is on.
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ScriptData ACL rule group, which is required when the access control is on.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ScdnAclGroup [] getScriptData() {
        return this.ScriptData;
    }

    /**
     * Set ACL rule group, which is required when the access control is on.
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ScriptData ACL rule group, which is required when the access control is on.
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setScriptData(ScdnAclGroup [] ScriptData) {
        this.ScriptData = ScriptData;
    }

    /**
     * Get Error page configuration
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return ErrorPage Error page configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public ScdnErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set Error page configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param ErrorPage Error page configuration
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setErrorPage(ScdnErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "ScriptData.", this.ScriptData);
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);

    }
}

