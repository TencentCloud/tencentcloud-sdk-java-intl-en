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

public class LinearAssemblyProgramInfo extends AbstractModel {

    /**
    * Channel linear assembly program information.
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
    * The associated source location id.
    */
    @SerializedName("SourceLocationId")
    @Expose
    private String SourceLocationId;

    /**
    * SourceId, uniquely identifies a source.
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * The associated live broadcast or on-demand broadcast, source name, and location are globally unique.
    */
    @SerializedName("SourceName")
    @Expose
    private String SourceName;

    /**
    * The bound channel.
    */
    @SerializedName("AttachedChannel")
    @Expose
    private String AttachedChannel;

    /**
    * Play configuration.
    */
    @SerializedName("PlaybackConf")
    @Expose
    private PlaybackInfo PlaybackConf;

    /**
    * AdBreaks.
    */
    @SerializedName("AdBreaks")
    @Expose
    private AdBreakInfo [] AdBreaks;

    /**
    * ID.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * SourceLocation name.
    */
    @SerializedName("SourceLocationName")
    @Expose
    private String SourceLocationName;

    /**
     * Get Channel linear assembly program information. 
     * @return Name Channel linear assembly program information.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel linear assembly program information.
     * @param Name Channel linear assembly program information.
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
     * Get The associated source location id. 
     * @return SourceLocationId The associated source location id.
     */
    public String getSourceLocationId() {
        return this.SourceLocationId;
    }

    /**
     * Set The associated source location id.
     * @param SourceLocationId The associated source location id.
     */
    public void setSourceLocationId(String SourceLocationId) {
        this.SourceLocationId = SourceLocationId;
    }

    /**
     * Get SourceId, uniquely identifies a source. 
     * @return SourceId SourceId, uniquely identifies a source.
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set SourceId, uniquely identifies a source.
     * @param SourceId SourceId, uniquely identifies a source.
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
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
     * Get The bound channel. 
     * @return AttachedChannel The bound channel.
     */
    public String getAttachedChannel() {
        return this.AttachedChannel;
    }

    /**
     * Set The bound channel.
     * @param AttachedChannel The bound channel.
     */
    public void setAttachedChannel(String AttachedChannel) {
        this.AttachedChannel = AttachedChannel;
    }

    /**
     * Get Play configuration. 
     * @return PlaybackConf Play configuration.
     */
    public PlaybackInfo getPlaybackConf() {
        return this.PlaybackConf;
    }

    /**
     * Set Play configuration.
     * @param PlaybackConf Play configuration.
     */
    public void setPlaybackConf(PlaybackInfo PlaybackConf) {
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

    /**
     * Get ID. 
     * @return Id ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set ID.
     * @param Id ID.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get SourceLocation name. 
     * @return SourceLocationName SourceLocation name.
     */
    public String getSourceLocationName() {
        return this.SourceLocationName;
    }

    /**
     * Set SourceLocation name.
     * @param SourceLocationName SourceLocation name.
     */
    public void setSourceLocationName(String SourceLocationName) {
        this.SourceLocationName = SourceLocationName;
    }

    public LinearAssemblyProgramInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinearAssemblyProgramInfo(LinearAssemblyProgramInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.SourceLocationId != null) {
            this.SourceLocationId = new String(source.SourceLocationId);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceName != null) {
            this.SourceName = new String(source.SourceName);
        }
        if (source.AttachedChannel != null) {
            this.AttachedChannel = new String(source.AttachedChannel);
        }
        if (source.PlaybackConf != null) {
            this.PlaybackConf = new PlaybackInfo(source.PlaybackConf);
        }
        if (source.AdBreaks != null) {
            this.AdBreaks = new AdBreakInfo[source.AdBreaks.length];
            for (int i = 0; i < source.AdBreaks.length; i++) {
                this.AdBreaks[i] = new AdBreakInfo(source.AdBreaks[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SourceLocationName != null) {
            this.SourceLocationName = new String(source.SourceLocationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "SourceLocationId", this.SourceLocationId);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceName", this.SourceName);
        this.setParamSimple(map, prefix + "AttachedChannel", this.AttachedChannel);
        this.setParamObj(map, prefix + "PlaybackConf.", this.PlaybackConf);
        this.setParamArrayObj(map, prefix + "AdBreaks.", this.AdBreaks);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SourceLocationName", this.SourceLocationName);

    }
}

