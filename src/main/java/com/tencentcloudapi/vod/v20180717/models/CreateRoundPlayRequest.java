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

public class CreateRoundPlayRequest extends AbstractModel {

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
    * <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The playlist name (not longer than 64 characters).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The playlist description, length limit: 256 characters.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the single play finishes.</li>.
Default value: loop.
    */
    @SerializedName("PlayBackMode")
    @Expose
    private String PlayBackMode;

    /**
    * Playlist unique identifier id, with a length limit of 64 characters, only allowing uppercase and lowercase english letters (a-za-z), digits (0-9) and hyphens (-). if there is a playlist with the same roundplayid, return the error invalidparametervalue.roundplayalreadyexists. the default value is empty, which means it is system-assigned.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playlist will stop playing after expiration. "9999-12-31t23:59:59+08:00" means it does not expire. default value: 9999-12-31t23:59:59+08:00.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

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
     * Get <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>. 
     * @return SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     * @param SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id. starting from december 25, 2023, if you want to access resources in the vod application (whether it is the default application or a newly created application), you must enter the application id in this field.</b>.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
     * Get The playlist description, length limit: 256 characters. 
     * @return Desc The playlist description, length limit: 256 characters.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set The playlist description, length limit: 256 characters.
     * @param Desc The playlist description, length limit: 256 characters.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the single play finishes.</li>.
Default value: loop. 
     * @return PlayBackMode Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the single play finishes.</li>.
Default value: loop.
     */
    public String getPlayBackMode() {
        return this.PlayBackMode;
    }

    /**
     * Set Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the single play finishes.</li>.
Default value: loop.
     * @param PlayBackMode Play mode, optional values:.
<Li>Loop: loop the playlist;</li>.
<Li>Linear: single play, stop playback after the single play finishes.</li>.
Default value: loop.
     */
    public void setPlayBackMode(String PlayBackMode) {
        this.PlayBackMode = PlayBackMode;
    }

    /**
     * Get Playlist unique identifier id, with a length limit of 64 characters, only allowing uppercase and lowercase english letters (a-za-z), digits (0-9) and hyphens (-). if there is a playlist with the same roundplayid, return the error invalidparametervalue.roundplayalreadyexists. the default value is empty, which means it is system-assigned. 
     * @return RoundPlayId Playlist unique identifier id, with a length limit of 64 characters, only allowing uppercase and lowercase english letters (a-za-z), digits (0-9) and hyphens (-). if there is a playlist with the same roundplayid, return the error invalidparametervalue.roundplayalreadyexists. the default value is empty, which means it is system-assigned.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set Playlist unique identifier id, with a length limit of 64 characters, only allowing uppercase and lowercase english letters (a-za-z), digits (0-9) and hyphens (-). if there is a playlist with the same roundplayid, return the error invalidparametervalue.roundplayalreadyexists. the default value is empty, which means it is system-assigned.
     * @param RoundPlayId Playlist unique identifier id, with a length limit of 64 characters, only allowing uppercase and lowercase english letters (a-za-z), digits (0-9) and hyphens (-). if there is a playlist with the same roundplayid, return the error invalidparametervalue.roundplayalreadyexists. the default value is empty, which means it is system-assigned.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playlist will stop playing after expiration. "9999-12-31t23:59:59+08:00" means it does not expire. default value: 9999-12-31t23:59:59+08:00. 
     * @return ExpiredTime Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playlist will stop playing after expiration. "9999-12-31t23:59:59+08:00" means it does not expire. default value: 9999-12-31t23:59:59+08:00.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playlist will stop playing after expiration. "9999-12-31t23:59:59+08:00" means it does not expire. default value: 9999-12-31t23:59:59+08:00.
     * @param ExpiredTime Expiration time, in iso 8601 format. for details, see [iso date format](https://www.tencentcloud.com/document/product/266/11732?has_map=2#iso-date-format). the playlist will stop playing after expiration. "9999-12-31t23:59:59+08:00" means it does not expire. default value: 9999-12-31t23:59:59+08:00.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public CreateRoundPlayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoundPlayRequest(CreateRoundPlayRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RoundPlaylist != null) {
            this.RoundPlaylist = new RoundPlayListItemInfo[source.RoundPlaylist.length];
            for (int i = 0; i < source.RoundPlaylist.length; i++) {
                this.RoundPlaylist[i] = new RoundPlayListItemInfo(source.RoundPlaylist[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.PlayBackMode != null) {
            this.PlayBackMode = new String(source.PlayBackMode);
        }
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "RoundPlaylist.", this.RoundPlaylist);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "PlayBackMode", this.PlayBackMode);
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

