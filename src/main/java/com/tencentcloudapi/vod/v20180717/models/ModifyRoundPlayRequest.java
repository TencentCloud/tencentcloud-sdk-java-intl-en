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
    * The unique identifier of the playlist.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, for customers who enable vod, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The program list.
<Li>Array length limit: 100.</li>.
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
    * Playback status, optional values:<li>disabled: stop playback.</li><li>enabled: start playback after the duration has elapsed.</li>.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the playlist finishes.</li>.
    */
    @SerializedName("PlayBackMode")
    @Expose
    private String PlayBackMode;

    /**
    * Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback will stop after expiration. "9999-12-31t23:59:59+08:00" means no expiration.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
     * Get The unique identifier of the playlist. 
     * @return RoundPlayId The unique identifier of the playlist.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set The unique identifier of the playlist.
     * @param RoundPlayId The unique identifier of the playlist.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, for customers who enable vod, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>. 
     * @return SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, for customers who enable vod, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, for customers who enable vod, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     * @param SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, for customers who enable vod, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). 
     * @return StartTime The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     * @param StartTime The playback start time, in [iso 8601 date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The program list.
<Li>Array length limit: 100.</li>. 
     * @return RoundPlaylist The program list.
<Li>Array length limit: 100.</li>.
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set The program list.
<Li>Array length limit: 100.</li>.
     * @param RoundPlaylist The program list.
<Li>Array length limit: 100.</li>.
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
     * Get Playback status, optional values:<li>disabled: stop playback.</li><li>enabled: start playback after the duration has elapsed.</li>. 
     * @return Status Playback status, optional values:<li>disabled: stop playback.</li><li>enabled: start playback after the duration has elapsed.</li>.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Playback status, optional values:<li>disabled: stop playback.</li><li>enabled: start playback after the duration has elapsed.</li>.
     * @param Status Playback status, optional values:<li>disabled: stop playback.</li><li>enabled: start playback after the duration has elapsed.</li>.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the playlist finishes.</li>. 
     * @return PlayBackMode Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the playlist finishes.</li>.
     */
    public String getPlayBackMode() {
        return this.PlayBackMode;
    }

    /**
     * Set Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the playlist finishes.</li>.
     * @param PlayBackMode Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the playlist finishes.</li>.
     */
    public void setPlayBackMode(String PlayBackMode) {
        this.PlayBackMode = PlayBackMode;
    }

    /**
     * Get Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback will stop after expiration. "9999-12-31t23:59:59+08:00" means no expiration. 
     * @return ExpiredTime Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback will stop after expiration. "9999-12-31t23:59:59+08:00" means no expiration.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback will stop after expiration. "9999-12-31t23:59:59+08:00" means no expiration.
     * @param ExpiredTime Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playback will stop after expiration. "9999-12-31t23:59:59+08:00" means no expiration.
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

