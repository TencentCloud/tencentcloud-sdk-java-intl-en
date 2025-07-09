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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadSource extends AbstractModel {

    /**
    * Pressure machine IP.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Pressure machine pod.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Region.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Pressure machine IP.

Note: This field may return null, indicating that no valid value is found. 
     * @return IP Pressure machine IP.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Pressure machine IP.

Note: This field may return null, indicating that no valid value is found.
     * @param IP Pressure machine IP.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Pressure machine pod.

Note: This field may return null, indicating that no valid value is found. 
     * @return PodName Pressure machine pod.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pressure machine pod.

Note: This field may return null, indicating that no valid value is found.
     * @param PodName Pressure machine pod.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Region.

Note: This field may return null, indicating that no valid value is found. 
     * @return Region Region.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.

Note: This field may return null, indicating that no valid value is found.
     * @param Region Region.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public LoadSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadSource(LoadSource source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

