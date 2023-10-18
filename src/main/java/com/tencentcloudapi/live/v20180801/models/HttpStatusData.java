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

public class HttpStatusData extends AbstractModel {

    /**
    * Data point in time,
In the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Playback status code details.
    */
    @SerializedName("HttpStatusInfoList")
    @Expose
    private HttpStatusInfo [] HttpStatusInfoList;

    /**
     * Get Data point in time,
In the format of `yyyy-mm-dd HH:MM:SS`. 
     * @return Time Data point in time,
In the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Data point in time,
In the format of `yyyy-mm-dd HH:MM:SS`.
     * @param Time Data point in time,
In the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Playback status code details. 
     * @return HttpStatusInfoList Playback status code details.
     */
    public HttpStatusInfo [] getHttpStatusInfoList() {
        return this.HttpStatusInfoList;
    }

    /**
     * Set Playback status code details.
     * @param HttpStatusInfoList Playback status code details.
     */
    public void setHttpStatusInfoList(HttpStatusInfo [] HttpStatusInfoList) {
        this.HttpStatusInfoList = HttpStatusInfoList;
    }

    public HttpStatusData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HttpStatusData(HttpStatusData source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.HttpStatusInfoList != null) {
            this.HttpStatusInfoList = new HttpStatusInfo[source.HttpStatusInfoList.length];
            for (int i = 0; i < source.HttpStatusInfoList.length; i++) {
                this.HttpStatusInfoList[i] = new HttpStatusInfo(source.HttpStatusInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamArrayObj(map, prefix + "HttpStatusInfoList.", this.HttpStatusInfoList);

    }
}

