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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOutputRTMPSettings extends AbstractModel {

    /**
    * Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IdleTimeout")
    @Expose
    private Long IdleTimeout;

    /**
    * Chunk size.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChunkSize")
    @Expose
    private Long ChunkSize;

    /**
    * Destination address information list of RTMP push.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Destinations")
    @Expose
    private RTMPAddressDestination [] Destinations;

    /**
     * Get Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IdleTimeout Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getIdleTimeout() {
        return this.IdleTimeout;
    }

    /**
     * Set Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IdleTimeout Idle timeout period.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIdleTimeout(Long IdleTimeout) {
        this.IdleTimeout = IdleTimeout;
    }

    /**
     * Get Chunk size.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ChunkSize Chunk size.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getChunkSize() {
        return this.ChunkSize;
    }

    /**
     * Set Chunk size.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ChunkSize Chunk size.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setChunkSize(Long ChunkSize) {
        this.ChunkSize = ChunkSize;
    }

    /**
     * Get Destination address information list of RTMP push.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Destinations Destination address information list of RTMP push.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public RTMPAddressDestination [] getDestinations() {
        return this.Destinations;
    }

    /**
     * Set Destination address information list of RTMP push.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Destinations Destination address information list of RTMP push.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDestinations(RTMPAddressDestination [] Destinations) {
        this.Destinations = Destinations;
    }

    public DescribeOutputRTMPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputRTMPSettings(DescribeOutputRTMPSettings source) {
        if (source.IdleTimeout != null) {
            this.IdleTimeout = new Long(source.IdleTimeout);
        }
        if (source.ChunkSize != null) {
            this.ChunkSize = new Long(source.ChunkSize);
        }
        if (source.Destinations != null) {
            this.Destinations = new RTMPAddressDestination[source.Destinations.length];
            for (int i = 0; i < source.Destinations.length; i++) {
                this.Destinations[i] = new RTMPAddressDestination(source.Destinations[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdleTimeout", this.IdleTimeout);
        this.setParamSimple(map, prefix + "ChunkSize", this.ChunkSize);
        this.setParamArrayObj(map, prefix + "Destinations.", this.Destinations);

    }
}

