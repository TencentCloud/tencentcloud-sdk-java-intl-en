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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamPackageLinearAssemblyProgramRequest extends AbstractModel {

    /**
    * Program ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Modified name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The type of the arrangement target source, divided into live broadcast and on-demand.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * The associated source location.
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * The associated live broadcast or on-demand broadcast, source name, and location are globally unique.
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * PlaybackConf.
    */
    @SerializedName("PlaybackConf")
    @Expose
    private PlaybackInfoReq PlaybackConf;

    /**
    * AdBreaks.
    */
    @SerializedName("AdBreaks")
    @Expose
    private AdBreakInfo [] AdBreaks;

    /**
     * Get Program ID. 
     * @return Id Program ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Program ID.
     * @param Id Program ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Modified name. 
     * @return Name Modified name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Modified name.
     * @param Name Modified name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The type of the arrangement target source, divided into live broadcast and on-demand. 
     * @return SourceType The type of the arrangement target source, divided into live broadcast and on-demand.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set The type of the arrangement target source, divided into live broadcast and on-demand.
     * @param SourceType The type of the arrangement target source, divided into live broadcast and on-demand.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get The associated source location. 
     * @return SourceLocationId The associated source location.
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set The associated source location.
     * @param SourceLocationId The associated source location.
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get The associated live broadcast or on-demand broadcast, source name, and location are globally unique. 
     * @return SourceName The associated live broadcast or on-demand broadcast, source name, and location are globally unique.
     */
    public String getSourceName() {
        return this.SourceName;
    }

    /**
     * Set The associated live broadcast or on-demand broadcast, source name, and location are globally unique.
     * @param SourceName The associated live broadcast or on-demand broadcast, source name, and location are globally unique.
     */
    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }

    /**
     * Get PlaybackConf. 
     * @return PlaybackConf PlaybackConf.
     */
    public PlaybackInfoReq getPlaybackConf() {
        return this.PlaybackConf;
    }

    /**
     * Set PlaybackConf.
     * @param PlaybackConf PlaybackConf.
     */
    public void setPlaybackConf(PlaybackInfoReq PlaybackConf) {
        this.PlaybackConf = PlaybackConf;
    }

    /**
     * Get AdBreaks. 
     * @return AdBreaks AdBreaks.
     */
    public AdBreakInfo [] getAdBreaks() {
        return this.AdBreaks;
    }

    /**
     * Set AdBreaks.
     * @param AdBreaks AdBreaks.
     */
    public void setAdBreaks(AdBreakInfo [] AdBreaks) {
        this.AdBreaks = AdBreaks;
    }

    public ModifyStreamPackageLinearAssemblyProgramRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageLinearAssemblyProgramRequest(ModifyStreamPackageLinearAssemblyProgramRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.PlaybackConf != null) {
            this.PlaybackConf = new PlaybackInfoReq(source.PlaybackConf);
        }
        if (source.AdBreaks != null) {
            this.AdBreaks = new AdBreakInfo[source.AdBreaks.length];
            for (int i = 0; i < source.AdBreaks.length; i++) {
                this.AdBreaks[i] = new AdBreakInfo(source.AdBreaks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamObj(map, prefix + "PlaybackConf.", this.PlaybackConf);
        this.setParamArrayObj(map, prefix + "AdBreaks.", this.AdBreaks);

    }
}

