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

public class AccessControl extends AbstractModel{

    /**
    * Whether to enable request header and request URL access control. Valid values: on, off
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Request header and request URL access rule
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccessControlRules")
    @Expose
    private AccessControlRule [] AccessControlRules;

    /**
    * Returned status code
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
     * Get Whether to enable request header and request URL access control. Valid values: on, off 
     * @return Switch Whether to enable request header and request URL access control. Valid values: on, off
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable request header and request URL access control. Valid values: on, off
     * @param Switch Whether to enable request header and request URL access control. Valid values: on, off
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Request header and request URL access rule
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AccessControlRules Request header and request URL access rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public AccessControlRule [] getAccessControlRules() {
        return this.AccessControlRules;
    }

    /**
     * Set Request header and request URL access rule
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AccessControlRules Request header and request URL access rule
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAccessControlRules(AccessControlRule [] AccessControlRules) {
        this.AccessControlRules = AccessControlRules;
    }

    /**
     * Get Returned status code
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ReturnCode Returned status code
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set Returned status code
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ReturnCode Returned status code
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "AccessControlRules.", this.AccessControlRules);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);

    }
}

