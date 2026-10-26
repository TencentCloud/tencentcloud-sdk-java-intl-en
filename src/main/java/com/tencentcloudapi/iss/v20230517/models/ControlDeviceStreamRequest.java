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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlDeviceStreamRequest extends AbstractModel {

    /**
    * Channel ID (obtain from the channel query API DescribeDeviceChannel)
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Stream type (1: main stream;
2: Substream (not allowed to be delivered at the same time as Resolution)
    */
    @SerializedName("StreamType")
    @Expose
    private String StreamType;

    /**
    * Resolution (1: QCIF;
2:CIF;
3:4CIF;
4:D1;
5:720P;
6:1080P/I;
Custom 1920*1080, etc. (device support required) (not allowed to be sent at the same time as StreamType)
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * Whether it is a private network
    */
    @SerializedName("IsInternal")
    @Expose
    private Boolean IsInternal;

    /**
     * Get Channel ID (obtain from the channel query API DescribeDeviceChannel) 
     * @return ChannelId Channel ID (obtain from the channel query API DescribeDeviceChannel)
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID (obtain from the channel query API DescribeDeviceChannel)
     * @param ChannelId Channel ID (obtain from the channel query API DescribeDeviceChannel)
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Stream type (1: main stream;
2: Substream (not allowed to be delivered at the same time as Resolution) 
     * @return StreamType Stream type (1: main stream;
2: Substream (not allowed to be delivered at the same time as Resolution)
     */
    public String getStreamType() {
        return this.StreamType;
    }

    /**
     * Set Stream type (1: main stream;
2: Substream (not allowed to be delivered at the same time as Resolution)
     * @param StreamType Stream type (1: main stream;
2: Substream (not allowed to be delivered at the same time as Resolution)
     */
    public void setStreamType(String StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get Resolution (1: QCIF;
2:CIF;
3:4CIF;
4:D1;
5:720P;
6:1080P/I;
Custom 1920*1080, etc. (device support required) (not allowed to be sent at the same time as StreamType) 
     * @return Resolution Resolution (1: QCIF;
2:CIF;
3:4CIF;
4:D1;
5:720P;
6:1080P/I;
Custom 1920*1080, etc. (device support required) (not allowed to be sent at the same time as StreamType)
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set Resolution (1: QCIF;
2:CIF;
3:4CIF;
4:D1;
5:720P;
6:1080P/I;
Custom 1920*1080, etc. (device support required) (not allowed to be sent at the same time as StreamType)
     * @param Resolution Resolution (1: QCIF;
2:CIF;
3:4CIF;
4:D1;
5:720P;
6:1080P/I;
Custom 1920*1080, etc. (device support required) (not allowed to be sent at the same time as StreamType)
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get Whether it is a private network 
     * @return IsInternal Whether it is a private network
     */
    public Boolean getIsInternal() {
        return this.IsInternal;
    }

    /**
     * Set Whether it is a private network
     * @param IsInternal Whether it is a private network
     */
    public void setIsInternal(Boolean IsInternal) {
        this.IsInternal = IsInternal;
    }

    public ControlDeviceStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDeviceStreamRequest(ControlDeviceStreamRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.StreamType != null) {
            this.StreamType = new String(source.StreamType);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.IsInternal != null) {
            this.IsInternal = new Boolean(source.IsInternal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "IsInternal", this.IsInternal);

    }
}

