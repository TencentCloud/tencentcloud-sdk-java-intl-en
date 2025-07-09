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

public class SSAIChannelInfo extends AbstractModel {

    /**
    * SSAI configuration ID, globally unique identifier
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * Configuration name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Content source stream prefix
    */
    @SerializedName("ContentSource")
    @Expose
    private String ContentSource;

    /**
    * Generated playback address prefix
    */
    @SerializedName("PlaybackPrefix")
    @Expose
    private String PlaybackPrefix;

    /**
    * SSAI configuration info
    */
    @SerializedName("SSAIInfo")
    @Expose
    private SSAIConf SSAIInfo;

    /**
    * Region info
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get SSAI configuration ID, globally unique identifier 
     * @return ID SSAI configuration ID, globally unique identifier
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set SSAI configuration ID, globally unique identifier
     * @param ID SSAI configuration ID, globally unique identifier
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get Configuration name 
     * @return Name Configuration name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Configuration name
     * @param Name Configuration name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Content source stream prefix 
     * @return ContentSource Content source stream prefix
     */
    public String getContentSource() {
        return this.ContentSource;
    }

    /**
     * Set Content source stream prefix
     * @param ContentSource Content source stream prefix
     */
    public void setContentSource(String ContentSource) {
        this.ContentSource = ContentSource;
    }

    /**
     * Get Generated playback address prefix 
     * @return PlaybackPrefix Generated playback address prefix
     */
    public String getPlaybackPrefix() {
        return this.PlaybackPrefix;
    }

    /**
     * Set Generated playback address prefix
     * @param PlaybackPrefix Generated playback address prefix
     */
    public void setPlaybackPrefix(String PlaybackPrefix) {
        this.PlaybackPrefix = PlaybackPrefix;
    }

    /**
     * Get SSAI configuration info 
     * @return SSAIInfo SSAI configuration info
     */
    public SSAIConf getSSAIInfo() {
        return this.SSAIInfo;
    }

    /**
     * Set SSAI configuration info
     * @param SSAIInfo SSAI configuration info
     */
    public void setSSAIInfo(SSAIConf SSAIInfo) {
        this.SSAIInfo = SSAIInfo;
    }

    /**
     * Get Region info 
     * @return Region Region info
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region info
     * @param Region Region info
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public SSAIChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSAIChannelInfo(SSAIChannelInfo source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContentSource != null) {
            this.ContentSource = new String(source.ContentSource);
        }
        if (source.PlaybackPrefix != null) {
            this.PlaybackPrefix = new String(source.PlaybackPrefix);
        }
        if (source.SSAIInfo != null) {
            this.SSAIInfo = new SSAIConf(source.SSAIInfo);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentSource", this.ContentSource);
        this.setParamSimple(map, prefix + "PlaybackPrefix", this.PlaybackPrefix);
        this.setParamObj(map, prefix + "SSAIInfo.", this.SSAIInfo);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

