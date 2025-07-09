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
    * The playlist ID.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * The playback start time, in [ISO 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
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
    * Playback status, optional values:
<li>Enabled: startup status;</li>
<li>Disabled: stop status. </li>
Default value: Enabled.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li>
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
    * Creation time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback of the playlist will stop after expiration. "9999-12-31t23:59:59+08:00" means never expire.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

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
     * Get The playback start time, in [ISO 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). 
     * @return StartTime The playback start time, in [ISO 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The playback start time, in [ISO 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     * @param StartTime The playback start time, in [ISO 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
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
     * Get Playback status, optional values:
<li>Enabled: startup status;</li>
<li>Disabled: stop status. </li>
Default value: Enabled. 
     * @return Status Playback status, optional values:
<li>Enabled: startup status;</li>
<li>Disabled: stop status. </li>
Default value: Enabled.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Playback status, optional values:
<li>Enabled: startup status;</li>
<li>Disabled: stop status. </li>
Default value: Enabled.
     * @param Status Playback status, optional values:
<li>Enabled: startup status;</li>
<li>Disabled: stop status. </li>
Default value: Enabled.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li>
Default value: Loop. 
     * @return PlayBackMode Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li>
Default value: Loop.
     */
    public String getPlayBackMode() {
        return this.PlayBackMode;
    }

    /**
     * Set Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li>
Default value: Loop.
     * @param PlayBackMode Play mode, optional values:
<li>Loop: Play the playlist in a loop;</li>
<li>Linear: Play once, stop playing after the playlist is played. </li>
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
     * Get Creation time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). 
     * @return CreateTime Creation time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     * @param CreateTime Creation time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). 
     * @return UpdateTime Update time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     * @param UpdateTime Update time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback of the playlist will stop after expiration. "9999-12-31t23:59:59+08:00" means never expire. 
     * @return ExpiredTime Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback of the playlist will stop after expiration. "9999-12-31t23:59:59+08:00" means never expire.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback of the playlist will stop after expiration. "9999-12-31t23:59:59+08:00" means never expire.
     * @param ExpiredTime Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback of the playlist will stop after expiration. "9999-12-31t23:59:59+08:00" means never expire.
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

