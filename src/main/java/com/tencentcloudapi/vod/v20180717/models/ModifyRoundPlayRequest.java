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

public class ModifyRoundPlayRequest extends AbstractModel {

    /**
    * Unique identifier of the carousel playlist.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Playback start time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Carousel list.
<li>Array length limit: 100.</li>
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
    * Carousel playbill name, length limited to 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Carousel playlist description, with a length limit of 256 characters.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Playback status. Available values: <li>Disabled: stop playback.</li><li>Enabled: start playback after the duration of play arrives.</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li>
    */
    @SerializedName("PlayBackMode")
    @Expose
    private String PlayBackMode;

    /**
    * Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback stops after expiry. "9999-12-31T23:59:59+08:00" means no expiration.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
     * Get Unique identifier of the carousel playlist. 
     * @return RoundPlayId Unique identifier of the carousel playlist.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set Unique identifier of the carousel playlist.
     * @param RoundPlayId Unique identifier of the carousel playlist.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. For customers who activate VOD after December 25, 2023, this field must be set to the app ID when accessing resources in VOD applications (whether the default application or a newly created application).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
<li>Array length limit: 100.</li> 
     * @return RoundPlaylist Carousel list.
<li>Array length limit: 100.</li>
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set Carousel list.
<li>Array length limit: 100.</li>
     * @param RoundPlaylist Carousel list.
<li>Array length limit: 100.</li>
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    /**
     * Get Carousel playbill name, length limited to 64 characters. 
     * @return Name Carousel playbill name, length limited to 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Carousel playbill name, length limited to 64 characters.
     * @param Name Carousel playbill name, length limited to 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Carousel playlist description, with a length limit of 256 characters. 
     * @return Desc Carousel playlist description, with a length limit of 256 characters.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Carousel playlist description, with a length limit of 256 characters.
     * @param Desc Carousel playlist description, with a length limit of 256 characters.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Playback status. Available values: <li>Disabled: stop playback.</li><li>Enabled: start playback after the duration of play arrives.</li> 
     * @return Status Playback status. Available values: <li>Disabled: stop playback.</li><li>Enabled: start playback after the duration of play arrives.</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Playback status. Available values: <li>Disabled: stop playback.</li><li>Enabled: start playback after the duration of play arrives.</li>
     * @param Status Playback status. Available values: <li>Disabled: stop playback.</li><li>Enabled: start playback after the duration of play arrives.</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li> 
     * @return PlayBackMode Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li>
     */
    public String getPlayBackMode() {
        return this.PlayBackMode;
    }

    /**
     * Set Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li>
     * @param PlayBackMode Playback mode. Optional values:
<li>Loop: loop playback playlist;</li>
<li>Linear: single play, stop playback after playlist finishes.</li>
     */
    public void setPlayBackMode(String PlayBackMode) {
        this.PlayBackMode = PlayBackMode;
    }

    /**
     * Get Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback stops after expiry. "9999-12-31T23:59:59+08:00" means no expiration. 
     * @return ExpiredTime Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback stops after expiry. "9999-12-31T23:59:59+08:00" means no expiration.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback stops after expiry. "9999-12-31T23:59:59+08:00" means no expiration.
     * @param ExpiredTime Expiration time in ISO 8601 format. For details, see [ISO date format description](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). Playback stops after expiry. "9999-12-31T23:59:59+08:00" means no expiration.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public ModifyRoundPlayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoundPlayRequest(ModifyRoundPlayRequest source) {
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "RoundPlaylist.", this.RoundPlaylist);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PlayBackMode", this.PlayBackMode);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

