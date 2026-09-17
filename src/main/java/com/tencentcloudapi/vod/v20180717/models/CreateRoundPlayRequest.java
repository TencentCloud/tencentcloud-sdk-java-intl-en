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

public class CreateRoundPlayRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 
    */
    @SerializedName("PlayBackMode")
    @Expose
    private String PlayBackMode;

    /**
    * 
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * 
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return RoundPlaylist 
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set 
     * @param RoundPlaylist 
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Desc 
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 
     * @param Desc 
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
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
     * @return RoundPlayId 
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set 
     * @param RoundPlayId 
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get  
     * @return ExpiredTime 
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 
     * @param ExpiredTime 
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

