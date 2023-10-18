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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterMarkTimestamp extends AbstractModel {

    /**
    * The position of the timestamp watermark. Valid values: `0` (top left), `1` (top right), `2` (bottom left), `3` (bottom right), `4` (top center), `5` (bottom center), `6` (center).
    */
    @SerializedName("Pos")
    @Expose
    private Long Pos;

    /**
    * The time zone. The default is UTC+8.
    */
    @SerializedName("TimeZone")
    @Expose
    private Long TimeZone;

    /**
     * Get The position of the timestamp watermark. Valid values: `0` (top left), `1` (top right), `2` (bottom left), `3` (bottom right), `4` (top center), `5` (bottom center), `6` (center). 
     * @return Pos The position of the timestamp watermark. Valid values: `0` (top left), `1` (top right), `2` (bottom left), `3` (bottom right), `4` (top center), `5` (bottom center), `6` (center).
     */
    public Long getPos() {
        return this.Pos;
    }

    /**
     * Set The position of the timestamp watermark. Valid values: `0` (top left), `1` (top right), `2` (bottom left), `3` (bottom right), `4` (top center), `5` (bottom center), `6` (center).
     * @param Pos The position of the timestamp watermark. Valid values: `0` (top left), `1` (top right), `2` (bottom left), `3` (bottom right), `4` (top center), `5` (bottom center), `6` (center).
     */
    public void setPos(Long Pos) {
        this.Pos = Pos;
    }

    /**
     * Get The time zone. The default is UTC+8. 
     * @return TimeZone The time zone. The default is UTC+8.
     */
    public Long getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set The time zone. The default is UTC+8.
     * @param TimeZone The time zone. The default is UTC+8.
     */
    public void setTimeZone(Long TimeZone) {
        this.TimeZone = TimeZone;
    }

    public WaterMarkTimestamp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterMarkTimestamp(WaterMarkTimestamp source) {
        if (source.Pos != null) {
            this.Pos = new Long(source.Pos);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new Long(source.TimeZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pos", this.Pos);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);

    }
}

