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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForbidStreamInfo extends AbstractModel {

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The creation time.
Note: Beijing time (UTC+8) is used.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The end time.
Note: Beijing time (UTC+8) is used.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * The push path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The push domain name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get The creation time.
Note: Beijing time (UTC+8) is used. 
     * @return CreateTime The creation time.
Note: Beijing time (UTC+8) is used.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
Note: Beijing time (UTC+8) is used.
     * @param CreateTime The creation time.
Note: Beijing time (UTC+8) is used.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The end time.
Note: Beijing time (UTC+8) is used. 
     * @return ExpireTime The end time.
Note: Beijing time (UTC+8) is used.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The end time.
Note: Beijing time (UTC+8) is used.
     * @param ExpireTime The end time.
Note: Beijing time (UTC+8) is used.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get The push path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AppName The push path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The push path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AppName The push path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The push domain name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DomainName The push domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set The push domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DomainName The push domain name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    public ForbidStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForbidStreamInfo(ForbidStreamInfo source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);

    }
}

