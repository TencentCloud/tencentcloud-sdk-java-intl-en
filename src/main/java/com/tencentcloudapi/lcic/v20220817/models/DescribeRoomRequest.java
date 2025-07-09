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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomRequest extends AbstractModel {

    /**
    * Room ID	
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * Request RTMP  stream link, 0: no, 1: yes, default is 0.
    */
    @SerializedName("RTMPStreamingURL")
    @Expose
    private Long RTMPStreamingURL;

    /**
     * Get Room ID	 
     * @return RoomId Room ID	
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set Room ID	
     * @param RoomId Room ID	
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get Request RTMP  stream link, 0: no, 1: yes, default is 0. 
     * @return RTMPStreamingURL Request RTMP  stream link, 0: no, 1: yes, default is 0.
     */
    public Long getRTMPStreamingURL() {
        return this.RTMPStreamingURL;
    }

    /**
     * Set Request RTMP  stream link, 0: no, 1: yes, default is 0.
     * @param RTMPStreamingURL Request RTMP  stream link, 0: no, 1: yes, default is 0.
     */
    public void setRTMPStreamingURL(Long RTMPStreamingURL) {
        this.RTMPStreamingURL = RTMPStreamingURL;
    }

    public DescribeRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomRequest(DescribeRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.RTMPStreamingURL != null) {
            this.RTMPStreamingURL = new Long(source.RTMPStreamingURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RTMPStreamingURL", this.RTMPStreamingURL);

    }
}

