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

public class ForceRedirect extends AbstractModel{

    /**
    * Access forced redirect configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Access forced redirect types
http: forced HTTP redirect
https: forced HTTPS redirect
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RedirectType")
    @Expose
    private String RedirectType;

    /**
    * Status code returned for forced redirect 
Supports 301, 302.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RedirectStatusCode")
    @Expose
    private Long RedirectStatusCode;

    /**
     * Get Access forced redirect configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Switch Access forced redirect configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Access forced redirect configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Switch Access forced redirect configuration switch
on: enabled
off: disabled
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Access forced redirect types
http: forced HTTP redirect
https: forced HTTPS redirect
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RedirectType Access forced redirect types
http: forced HTTP redirect
https: forced HTTPS redirect
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getRedirectType() {
        return this.RedirectType;
    }

    /**
     * Set Access forced redirect types
http: forced HTTP redirect
https: forced HTTPS redirect
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RedirectType Access forced redirect types
http: forced HTTP redirect
https: forced HTTPS redirect
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRedirectType(String RedirectType) {
        this.RedirectType = RedirectType;
    }

    /**
     * Get Status code returned for forced redirect 
Supports 301, 302.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return RedirectStatusCode Status code returned for forced redirect 
Supports 301, 302.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getRedirectStatusCode() {
        return this.RedirectStatusCode;
    }

    /**
     * Set Status code returned for forced redirect 
Supports 301, 302.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param RedirectStatusCode Status code returned for forced redirect 
Supports 301, 302.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setRedirectStatusCode(Long RedirectStatusCode) {
        this.RedirectStatusCode = RedirectStatusCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "RedirectType", this.RedirectType);
        this.setParamSimple(map, prefix + "RedirectStatusCode", this.RedirectStatusCode);

    }
}

