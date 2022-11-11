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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McuLayoutParams extends AbstractModel{

    /**
    * The layout mode. Valid values: 1 (floating), 2 (screen sharing), 3 (grid), 4 (custom). Floating, screen sharing, and grid are dynamic layouts. Custom layouts are static layouts.
    */
    @SerializedName("MixLayoutMode")
    @Expose
    private Long MixLayoutMode;

    /**
    * Whether to display users who publish only audio. 0: No; 1: Yes. This parameter is valid only if a dynamic layout is used. If you do not pass this parameter, 0 will be used.
    */
    @SerializedName("PureAudioHoldPlaceMode")
    @Expose
    private Long PureAudioHoldPlaceMode;

    /**
    * The details of a custom layout.
    */
    @SerializedName("MixLayoutList")
    @Expose
    private McuLayout [] MixLayoutList;

    /**
    * The information of the large video in screen sharing or floating layout mode.
    */
    @SerializedName("MaxVideoUser")
    @Expose
    private MaxVideoUser MaxVideoUser;

    /**
     * Get The layout mode. Valid values: 1 (floating), 2 (screen sharing), 3 (grid), 4 (custom). Floating, screen sharing, and grid are dynamic layouts. Custom layouts are static layouts. 
     * @return MixLayoutMode The layout mode. Valid values: 1 (floating), 2 (screen sharing), 3 (grid), 4 (custom). Floating, screen sharing, and grid are dynamic layouts. Custom layouts are static layouts.
     */
    public Long getMixLayoutMode() {
        return this.MixLayoutMode;
    }

    /**
     * Set The layout mode. Valid values: 1 (floating), 2 (screen sharing), 3 (grid), 4 (custom). Floating, screen sharing, and grid are dynamic layouts. Custom layouts are static layouts.
     * @param MixLayoutMode The layout mode. Valid values: 1 (floating), 2 (screen sharing), 3 (grid), 4 (custom). Floating, screen sharing, and grid are dynamic layouts. Custom layouts are static layouts.
     */
    public void setMixLayoutMode(Long MixLayoutMode) {
        this.MixLayoutMode = MixLayoutMode;
    }

    /**
     * Get Whether to display users who publish only audio. 0: No; 1: Yes. This parameter is valid only if a dynamic layout is used. If you do not pass this parameter, 0 will be used. 
     * @return PureAudioHoldPlaceMode Whether to display users who publish only audio. 0: No; 1: Yes. This parameter is valid only if a dynamic layout is used. If you do not pass this parameter, 0 will be used.
     */
    public Long getPureAudioHoldPlaceMode() {
        return this.PureAudioHoldPlaceMode;
    }

    /**
     * Set Whether to display users who publish only audio. 0: No; 1: Yes. This parameter is valid only if a dynamic layout is used. If you do not pass this parameter, 0 will be used.
     * @param PureAudioHoldPlaceMode Whether to display users who publish only audio. 0: No; 1: Yes. This parameter is valid only if a dynamic layout is used. If you do not pass this parameter, 0 will be used.
     */
    public void setPureAudioHoldPlaceMode(Long PureAudioHoldPlaceMode) {
        this.PureAudioHoldPlaceMode = PureAudioHoldPlaceMode;
    }

    /**
     * Get The details of a custom layout. 
     * @return MixLayoutList The details of a custom layout.
     */
    public McuLayout [] getMixLayoutList() {
        return this.MixLayoutList;
    }

    /**
     * Set The details of a custom layout.
     * @param MixLayoutList The details of a custom layout.
     */
    public void setMixLayoutList(McuLayout [] MixLayoutList) {
        this.MixLayoutList = MixLayoutList;
    }

    /**
     * Get The information of the large video in screen sharing or floating layout mode. 
     * @return MaxVideoUser The information of the large video in screen sharing or floating layout mode.
     */
    public MaxVideoUser getMaxVideoUser() {
        return this.MaxVideoUser;
    }

    /**
     * Set The information of the large video in screen sharing or floating layout mode.
     * @param MaxVideoUser The information of the large video in screen sharing or floating layout mode.
     */
    public void setMaxVideoUser(MaxVideoUser MaxVideoUser) {
        this.MaxVideoUser = MaxVideoUser;
    }

    public McuLayoutParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuLayoutParams(McuLayoutParams source) {
        if (source.MixLayoutMode != null) {
            this.MixLayoutMode = new Long(source.MixLayoutMode);
        }
        if (source.PureAudioHoldPlaceMode != null) {
            this.PureAudioHoldPlaceMode = new Long(source.PureAudioHoldPlaceMode);
        }
        if (source.MixLayoutList != null) {
            this.MixLayoutList = new McuLayout[source.MixLayoutList.length];
            for (int i = 0; i < source.MixLayoutList.length; i++) {
                this.MixLayoutList[i] = new McuLayout(source.MixLayoutList[i]);
            }
        }
        if (source.MaxVideoUser != null) {
            this.MaxVideoUser = new MaxVideoUser(source.MaxVideoUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MixLayoutMode", this.MixLayoutMode);
        this.setParamSimple(map, prefix + "PureAudioHoldPlaceMode", this.PureAudioHoldPlaceMode);
        this.setParamArrayObj(map, prefix + "MixLayoutList.", this.MixLayoutList);
        this.setParamObj(map, prefix + "MaxVideoUser.", this.MaxVideoUser);

    }
}

