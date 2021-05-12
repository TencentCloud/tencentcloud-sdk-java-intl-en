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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel{

    /**
    * Unique data ID
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * URL-encoded data file URL, which is a pull address if the detected speech is a stream
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * GME voice chat room ID, which is entered during speech detection by GME voice chat
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * GME voice chat user ID, which is entered during speech detection by GME voice chat
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * Get Unique data ID 
     * @return DataId Unique data ID
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set Unique data ID
     * @param DataId Unique data ID
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get URL-encoded data file URL, which is a pull address if the detected speech is a stream 
     * @return Url URL-encoded data file URL, which is a pull address if the detected speech is a stream
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set URL-encoded data file URL, which is a pull address if the detected speech is a stream
     * @param Url URL-encoded data file URL, which is a pull address if the detected speech is a stream
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get GME voice chat room ID, which is entered during speech detection by GME voice chat 
     * @return RoomId GME voice chat room ID, which is entered during speech detection by GME voice chat
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set GME voice chat room ID, which is entered during speech detection by GME voice chat
     * @param RoomId GME voice chat room ID, which is entered during speech detection by GME voice chat
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get GME voice chat user ID, which is entered during speech detection by GME voice chat 
     * @return OpenId GME voice chat user ID, which is entered during speech detection by GME voice chat
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set GME voice chat user ID, which is entered during speech detection by GME voice chat
     * @param OpenId GME voice chat user ID, which is entered during speech detection by GME voice chat
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    public Task() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Task(Task source) {
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

