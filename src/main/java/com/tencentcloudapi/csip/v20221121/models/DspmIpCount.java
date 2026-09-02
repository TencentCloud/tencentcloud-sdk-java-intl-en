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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIpCount extends AbstractModel {

    /**
    * Number of accessed IPs
    */
    @SerializedName("IpCount")
    @Expose
    private Long IpCount;

    /**
    * Number of untagged public IPs
    */
    @SerializedName("UnmarkedPublicIpCount")
    @Expose
    private Long UnmarkedPublicIpCount;

    /**
    * Number of private network IPs
    */
    @SerializedName("PrivateIpCount")
    @Expose
    private Long PrivateIpCount;

    /**
     * Get Number of accessed IPs 
     * @return IpCount Number of accessed IPs
     */
    public Long getIpCount() {
        return this.IpCount;
    }

    /**
     * Set Number of accessed IPs
     * @param IpCount Number of accessed IPs
     */
    public void setIpCount(Long IpCount) {
        this.IpCount = IpCount;
    }

    /**
     * Get Number of untagged public IPs 
     * @return UnmarkedPublicIpCount Number of untagged public IPs
     */
    public Long getUnmarkedPublicIpCount() {
        return this.UnmarkedPublicIpCount;
    }

    /**
     * Set Number of untagged public IPs
     * @param UnmarkedPublicIpCount Number of untagged public IPs
     */
    public void setUnmarkedPublicIpCount(Long UnmarkedPublicIpCount) {
        this.UnmarkedPublicIpCount = UnmarkedPublicIpCount;
    }

    /**
     * Get Number of private network IPs 
     * @return PrivateIpCount Number of private network IPs
     */
    public Long getPrivateIpCount() {
        return this.PrivateIpCount;
    }

    /**
     * Set Number of private network IPs
     * @param PrivateIpCount Number of private network IPs
     */
    public void setPrivateIpCount(Long PrivateIpCount) {
        this.PrivateIpCount = PrivateIpCount;
    }

    public DspmIpCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIpCount(DspmIpCount source) {
        if (source.IpCount != null) {
            this.IpCount = new Long(source.IpCount);
        }
        if (source.UnmarkedPublicIpCount != null) {
            this.UnmarkedPublicIpCount = new Long(source.UnmarkedPublicIpCount);
        }
        if (source.PrivateIpCount != null) {
            this.PrivateIpCount = new Long(source.PrivateIpCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpCount", this.IpCount);
        this.setParamSimple(map, prefix + "UnmarkedPublicIpCount", this.UnmarkedPublicIpCount);
        this.setParamSimple(map, prefix + "PrivateIpCount", this.PrivateIpCount);

    }
}

