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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StandardDebug extends AbstractModel {

    /**
    * Whether to enable standard debugging. Values:
<li>`on`: Enable</li>
<li>`off`: Disable </li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Allowed client source. It supports IPv4/IPv6 addresses and CIDR blocks.
    */
    @SerializedName("AllowClientIPList")
    @Expose
    private String [] AllowClientIPList;

    /**
    * The time when the standard debugging setting expires. If it is exceeded, this feature u200dbecomes invalid.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
     * Get Whether to enable standard debugging. Values:
<li>`on`: Enable</li>
<li>`off`: Disable </li> 
     * @return Switch Whether to enable standard debugging. Values:
<li>`on`: Enable</li>
<li>`off`: Disable </li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Whether to enable standard debugging. Values:
<li>`on`: Enable</li>
<li>`off`: Disable </li>
     * @param Switch Whether to enable standard debugging. Values:
<li>`on`: Enable</li>
<li>`off`: Disable </li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Allowed client source. It supports IPv4/IPv6 addresses and CIDR blocks. 
     * @return AllowClientIPList Allowed client source. It supports IPv4/IPv6 addresses and CIDR blocks.
     */
    public String [] getAllowClientIPList() {
        return this.AllowClientIPList;
    }

    /**
     * Set Allowed client source. It supports IPv4/IPv6 addresses and CIDR blocks.
     * @param AllowClientIPList Allowed client source. It supports IPv4/IPv6 addresses and CIDR blocks.
     */
    public void setAllowClientIPList(String [] AllowClientIPList) {
        this.AllowClientIPList = AllowClientIPList;
    }

    /**
     * Get The time when the standard debugging setting expires. If it is exceeded, this feature u200dbecomes invalid. 
     * @return ExpireTime The time when the standard debugging setting expires. If it is exceeded, this feature u200dbecomes invalid.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The time when the standard debugging setting expires. If it is exceeded, this feature u200dbecomes invalid.
     * @param ExpireTime The time when the standard debugging setting expires. If it is exceeded, this feature u200dbecomes invalid.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public StandardDebug() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandardDebug(StandardDebug source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.AllowClientIPList != null) {
            this.AllowClientIPList = new String[source.AllowClientIPList.length];
            for (int i = 0; i < source.AllowClientIPList.length; i++) {
                this.AllowClientIPList[i] = new String(source.AllowClientIPList[i]);
            }
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "AllowClientIPList.", this.AllowClientIPList);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

