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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCInterceptEvent extends AbstractModel{

    /**
    * Client IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * Number of blocks per minute
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InterceptNum")
    @Expose
    private Long InterceptNum;

    /**
    * Block time in rate-limiting policy per minute in seconds
    */
    @SerializedName("InterceptTime")
    @Expose
    private Long InterceptTime;

    /**
     * Get Client IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClientIp Client IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set Client IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClientIp Client IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get Number of blocks per minute
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InterceptNum Number of blocks per minute
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getInterceptNum() {
        return this.InterceptNum;
    }

    /**
     * Set Number of blocks per minute
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InterceptNum Number of blocks per minute
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInterceptNum(Long InterceptNum) {
        this.InterceptNum = InterceptNum;
    }

    /**
     * Get Block time in rate-limiting policy per minute in seconds 
     * @return InterceptTime Block time in rate-limiting policy per minute in seconds
     */
    public Long getInterceptTime() {
        return this.InterceptTime;
    }

    /**
     * Set Block time in rate-limiting policy per minute in seconds
     * @param InterceptTime Block time in rate-limiting policy per minute in seconds
     */
    public void setInterceptTime(Long InterceptTime) {
        this.InterceptTime = InterceptTime;
    }

    public CCInterceptEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCInterceptEvent(CCInterceptEvent source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.InterceptNum != null) {
            this.InterceptNum = new Long(source.InterceptNum);
        }
        if (source.InterceptTime != null) {
            this.InterceptTime = new Long(source.InterceptTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "InterceptNum", this.InterceptNum);
        this.setParamSimple(map, prefix + "InterceptTime", this.InterceptTime);

    }
}

