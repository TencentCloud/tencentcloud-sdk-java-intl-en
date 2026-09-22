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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoundPlayInfo extends AbstractModel {

    /**
    * Carousel playlist identifier.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * Playback start time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Carousel list.
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
    * Carousel playbill name. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Carousel playlist description. Length limit: 256 characters.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Playback status. Available values:
<li>Enabled: startup status;</li>
<li>Disabled: stopped.</li>
Default value: Enabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li>
Default value: Loop.
    */
    @SerializedName("PlayBackMode")
    @Expose
    private String PlayBackMode;

    /**
    * Carousel playback address.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Creation time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time, formatted according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback of the playlist stops after expiry. "9999-12-31T23:59:59+08:00" means it never expires.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
     * Get Carousel playlist identifier. 
     * @return RoundPlayId Carousel playlist identifier.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set Carousel playlist identifier.
     * @param RoundPlayId Carousel playlist identifier.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get Playback start time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). 
     * @return StartTime Playback start time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Playback start time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     * @param StartTime Playback start time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Carousel list. 
     * @return RoundPlaylist Carousel list.
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set Carousel list.
     * @param RoundPlaylist Carousel list.
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    /**
     * Get Carousel playbill name. Length limit: 64 characters. 
     * @return Name Carousel playbill name. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Carousel playbill name. Length limit: 64 characters.
     * @param Name Carousel playbill name. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Carousel playlist description. Length limit: 256 characters. 
     * @return Desc Carousel playlist description. Length limit: 256 characters.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Carousel playlist description. Length limit: 256 characters.
     * @param Desc Carousel playlist description. Length limit: 256 characters.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Playback status. Available values:
<li>Enabled: startup status;</li>
<li>Disabled: stopped.</li>
Default value: Enabled. 
     * @return Status Playback status. Available values:
<li>Enabled: startup status;</li>
<li>Disabled: stopped.</li>
Default value: Enabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Playback status. Available values:
<li>Enabled: startup status;</li>
<li>Disabled: stopped.</li>
Default value: Enabled.
     * @param Status Playback status. Available values:
<li>Enabled: startup status;</li>
<li>Disabled: stopped.</li>
Default value: Enabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li>
Default value: Loop. 
     * @return PlayBackMode Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li>
Default value: Loop.
     */
    public String getPlayBackMode() {
        return this.PlayBackMode;
    }

    /**
     * Set Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li>
Default value: Loop.
     * @param PlayBackMode Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li>
Default value: Loop.
     */
    public void setPlayBackMode(String PlayBackMode) {
        this.PlayBackMode = PlayBackMode;
    }

    /**
     * Get Carousel playback address. 
     * @return Url Carousel playback address.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Carousel playback address.
     * @param Url Carousel playback address.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Creation time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). 
     * @return CreateTime Creation time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     * @param CreateTime Creation time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time, formatted according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). 
     * @return UpdateTime Update time, formatted according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time, formatted according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     * @param UpdateTime Update time, formatted according to the ISO 8601 standard. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback of the playlist stops after expiry. "9999-12-31T23:59:59+08:00" means it never expires. 
     * @return ExpiredTime Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback of the playlist stops after expiry. "9999-12-31T23:59:59+08:00" means it never expires.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback of the playlist stops after expiry. "9999-12-31T23:59:59+08:00" means it never expires.
     * @param ExpiredTime Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback of the playlist stops after expiry. "9999-12-31T23:59:59+08:00" means it never expires.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

