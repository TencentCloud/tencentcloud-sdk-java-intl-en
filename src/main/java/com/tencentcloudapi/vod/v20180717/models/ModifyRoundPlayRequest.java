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

public class ModifyRoundPlayRequest extends AbstractModel {

    /**
    * The playlist ID, which is unique.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The playback start time, in [ISO 8601 date format](https://intl.cloud.tencent.com/document/product/266/11732?lang=en&pg=).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The files on the list.
<li>Array length limit: 100.</li>
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
    * Playback status, optional values: 
<li>Disabled: End playback, and the carousel task cannot be started again after the end. </li>

    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li>
    */
    @SerializedName("PlayBackMode")
    @Expose
    private String PlayBackMode;

    /**
     * Get The playlist ID, which is unique. 
     * @return RoundPlayId The playlist ID, which is unique.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set The playlist ID, which is unique.
     * @param RoundPlayId The playlist ID, which is unique.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
<li>Array length limit: 100.</li> 
     * @return RoundPlaylist The files on the list.
<li>Array length limit: 100.</li>
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set The files on the list.
<li>Array length limit: 100.</li>
     * @param RoundPlaylist The files on the list.
<li>Array length limit: 100.</li>
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
     * Get Playback status, optional values: 
<li>Disabled: End playback, and the carousel task cannot be started again after the end. </li>
 
     * @return Status Playback status, optional values: 
<li>Disabled: End playback, and the carousel task cannot be started again after the end. </li>

     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Playback status, optional values: 
<li>Disabled: End playback, and the carousel task cannot be started again after the end. </li>

     * @param Status Playback status, optional values: 
<li>Disabled: End playback, and the carousel task cannot be started again after the end. </li>

     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li> 
     * @return PlayBackMode Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li>
     */
    public String getPlayBackMode() {
        return this.PlayBackMode;
    }

    /**
     * Set Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li>
     * @param PlayBackMode Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li>
     */
    public void setPlayBackMode(String PlayBackMode) {
        this.PlayBackMode = PlayBackMode;
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

    }
}

