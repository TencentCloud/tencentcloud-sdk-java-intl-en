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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoundPlayInfo extends AbstractModel {

    /**
    * The playlist ID.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * The playback start time, in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The files on the list.
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
    * The playlist name (not longer than 64 characters).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The playlist description (not longer than 256 characters).
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 
    */
    @SerializedName("PlayBackMode")
    @Expose
    private String PlayBackMode;

    /**
    * 
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get The playlist ID. 
     * @return RoundPlayId The playlist ID.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set The playlist ID.
     * @param RoundPlayId The playlist ID.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get The playback start time, in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=). 
     * @return StartTime The playback start time, in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The playback start time, in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     * @param StartTime The playback start time, in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The files on the list. 
     * @return RoundPlaylist The files on the list.
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set The files on the list.
     * @param RoundPlaylist The files on the list.
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    /**
     * Get The playlist name (not longer than 64 characters). 
     * @return Name The playlist name (not longer than 64 characters).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The playlist name (not longer than 64 characters).
     * @param Name The playlist name (not longer than 64 characters).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The playlist description (not longer than 256 characters). 
     * @return Desc The playlist description (not longer than 256 characters).
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set The playlist description (not longer than 256 characters).
     * @param Desc The playlist description (not longer than 256 characters).
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get  
     * @return PlayBackMode 
     */
    public String getPlayBackMode() {
        return this.PlayBackMode;
    }

    /**
     * Set 
     * @param PlayBackMode 
     */
    public void setPlayBackMode(String PlayBackMode) {
        this.PlayBackMode = PlayBackMode;
    }

    /**
     * Get  
     * @return Url 
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 
     * @param Url 
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public RoundPlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoundPlayInfo(RoundPlayInfo source) {
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RoundPlaylist != null) {
            this.RoundPlaylist = new RoundPlayListItemInfo[source.RoundPlaylist.length];
            for (int i = 0; i < source.RoundPlaylist.length; i++) {
                this.RoundPlaylist[i] = new RoundPlayListItemInfo(source.RoundPlaylist[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PlayBackMode != null) {
            this.PlayBackMode = new String(source.PlayBackMode);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "RoundPlaylist.", this.RoundPlaylist);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PlayBackMode", this.PlayBackMode);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

