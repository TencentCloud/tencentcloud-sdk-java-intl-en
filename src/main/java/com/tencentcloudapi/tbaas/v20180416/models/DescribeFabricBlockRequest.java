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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFabricBlockRequest extends AbstractModel {

    /**
    * Cluster ID, which can be obtained from the blockchain cluster details or in the list.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Channel ID, which can be obtained from the channel list or channel detail.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * Block height, starting from 0.
    */
    @SerializedName("BlockHeight")
    @Expose
    private Long BlockHeight;

    /**
     * Get Cluster ID, which can be obtained from the blockchain cluster details or in the list. 
     * @return ClusterId Cluster ID, which can be obtained from the blockchain cluster details or in the list.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID, which can be obtained from the blockchain cluster details or in the list.
     * @param ClusterId Cluster ID, which can be obtained from the blockchain cluster details or in the list.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Channel ID, which can be obtained from the channel list or channel detail. 
     * @return ChannelId Channel ID, which can be obtained from the channel list or channel detail.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set Channel ID, which can be obtained from the channel list or channel detail.
     * @param ChannelId Channel ID, which can be obtained from the channel list or channel detail.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get Block height, starting from 0. 
     * @return BlockHeight Block height, starting from 0.
     */
    public Long getBlockHeight() {
        return this.BlockHeight;
    }

    /**
     * Set Block height, starting from 0.
     * @param BlockHeight Block height, starting from 0.
     */
    public void setBlockHeight(Long BlockHeight) {
        this.BlockHeight = BlockHeight;
    }

    public DescribeFabricBlockRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFabricBlockRequest(DescribeFabricBlockRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.BlockHeight != null) {
            this.BlockHeight = new Long(source.BlockHeight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "BlockHeight", this.BlockHeight);

    }
}

