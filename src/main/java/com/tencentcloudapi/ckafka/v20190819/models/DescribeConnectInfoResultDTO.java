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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConnectInfoResultDTO extends AbstractModel {

    /**
    * IP address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpAddr")
    @Expose
    private String IpAddr;

    /**
    * Connection time
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Whether it is a supported version
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsUnSupportVersion")
    @Expose
    private Boolean IsUnSupportVersion;

    /**
     * Get IP address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IpAddr IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIpAddr() {
        return this.IpAddr;
    }

    /**
     * Set IP address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IpAddr IP address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIpAddr(String IpAddr) {
        this.IpAddr = IpAddr;
    }

    /**
     * Get Connection time
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Time Connection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Connection time
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Time Connection time
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Whether it is a supported version
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsUnSupportVersion Whether it is a supported version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsUnSupportVersion() {
        return this.IsUnSupportVersion;
    }

    /**
     * Set Whether it is a supported version
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsUnSupportVersion Whether it is a supported version
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsUnSupportVersion(Boolean IsUnSupportVersion) {
        this.IsUnSupportVersion = IsUnSupportVersion;
    }

    public DescribeConnectInfoResultDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConnectInfoResultDTO(DescribeConnectInfoResultDTO source) {
        if (source.IpAddr != null) {
            this.IpAddr = new String(source.IpAddr);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.IsUnSupportVersion != null) {
            this.IsUnSupportVersion = new Boolean(source.IsUnSupportVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpAddr", this.IpAddr);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "IsUnSupportVersion", this.IsUnSupportVersion);

    }
}

