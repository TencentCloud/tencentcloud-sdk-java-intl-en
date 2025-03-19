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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamPackageLinearAssemblyChannelRequest extends AbstractModel {

    /**
    * Channel ID.
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
    * Define the characteristics of the channel. Standard supports live broadcast and on-demand sources, while Basic only supports on-demand source arrangement.
    */
    @SerializedName("Tier")
    @Expose
    private String Tier;

    /**
    * The source switching mode in the channel is divided into Linear and Loop. Live broadcast only supports Linear.
Optional values: Linear, Loop.
    */
    @SerializedName("PlaybackMode")
    @Expose
    private String PlaybackMode;

    /**
    * Time shift on switch.
    */
    @SerializedName("TimeShiftEnable")
    @Expose
    private Boolean TimeShiftEnable;

    /**
    * Time shift configuration.
    */
    @SerializedName("TimeShiftConf")
    @Expose
    private TimeShiftInfo TimeShiftConf;

    /**
    * padding configuration.
    */
    @SerializedName("SlateConf")
    @Expose
    private SlateInfo SlateConf;

    /**
    * Output configuration.
    */
    @SerializedName("Outputs")
    @Expose
    private OutputInfo [] Outputs;

    /**
     * Get Channel ID. 
     * @return Id Channel ID.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Channel ID.
     * @param Id Channel ID.
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
     * Get Define the characteristics of the channel. Standard supports live broadcast and on-demand sources, while Basic only supports on-demand source arrangement. 
     * @return Tier Define the characteristics of the channel. Standard supports live broadcast and on-demand sources, while Basic only supports on-demand source arrangement.
     */
    public String getTier() {
        return this.Tier;
    }

    /**
     * Set Define the characteristics of the channel. Standard supports live broadcast and on-demand sources, while Basic only supports on-demand source arrangement.
     * @param Tier Define the characteristics of the channel. Standard supports live broadcast and on-demand sources, while Basic only supports on-demand source arrangement.
     */
    public void setTier(String Tier) {
        this.Tier = Tier;
    }

    /**
     * Get The source switching mode in the channel is divided into Linear and Loop. Live broadcast only supports Linear.
Optional values: Linear, Loop. 
     * @return PlaybackMode The source switching mode in the channel is divided into Linear and Loop. Live broadcast only supports Linear.
Optional values: Linear, Loop.
     */
    public String getPlaybackMode() {
        return this.PlaybackMode;
    }

    /**
     * Set The source switching mode in the channel is divided into Linear and Loop. Live broadcast only supports Linear.
Optional values: Linear, Loop.
     * @param PlaybackMode The source switching mode in the channel is divided into Linear and Loop. Live broadcast only supports Linear.
Optional values: Linear, Loop.
     */
    public void setPlaybackMode(String PlaybackMode) {
        this.PlaybackMode = PlaybackMode;
    }

    /**
     * Get Time shift on switch. 
     * @return TimeShiftEnable Time shift on switch.
     */
    public Boolean getTimeShiftEnable() {
        return this.TimeShiftEnable;
    }

    /**
     * Set Time shift on switch.
     * @param TimeShiftEnable Time shift on switch.
     */
    public void setTimeShiftEnable(Boolean TimeShiftEnable) {
        this.TimeShiftEnable = TimeShiftEnable;
    }

    /**
     * Get Time shift configuration. 
     * @return TimeShiftConf Time shift configuration.
     */
    public TimeShiftInfo getTimeShiftConf() {
        return this.TimeShiftConf;
    }

    /**
     * Set Time shift configuration.
     * @param TimeShiftConf Time shift configuration.
     */
    public void setTimeShiftConf(TimeShiftInfo TimeShiftConf) {
        this.TimeShiftConf = TimeShiftConf;
    }

    /**
     * Get padding configuration. 
     * @return SlateConf padding configuration.
     */
    public SlateInfo getSlateConf() {
        return this.SlateConf;
    }

    /**
     * Set padding configuration.
     * @param SlateConf padding configuration.
     */
    public void setSlateConf(SlateInfo SlateConf) {
        this.SlateConf = SlateConf;
    }

    /**
     * Get Output configuration. 
     * @return Outputs Output configuration.
     */
    public OutputInfo [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set Output configuration.
     * @param Outputs Output configuration.
     */
    public void setOutputs(OutputInfo [] Outputs) {
        this.Outputs = Outputs;
    }

    public ModifyStreamPackageLinearAssemblyChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageLinearAssemblyChannelRequest(ModifyStreamPackageLinearAssemblyChannelRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tier != null) {
            this.Tier = new String(source.Tier);
        }
        if (source.PlaybackMode != null) {
            this.PlaybackMode = new String(source.PlaybackMode);
        }
        if (source.TimeShiftEnable != null) {
            this.TimeShiftEnable = new Boolean(source.TimeShiftEnable);
        }
        if (source.TimeShiftConf != null) {
            this.TimeShiftConf = new TimeShiftInfo(source.TimeShiftConf);
        }
        if (source.SlateConf != null) {
            this.SlateConf = new SlateInfo(source.SlateConf);
        }
        if (source.Outputs != null) {
            this.Outputs = new OutputInfo[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new OutputInfo(source.Outputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Tier", this.Tier);
        this.setParamSimple(map, prefix + "PlaybackMode", this.PlaybackMode);
        this.setParamSimple(map, prefix + "TimeShiftEnable", this.TimeShiftEnable);
        this.setParamObj(map, prefix + "TimeShiftConf.", this.TimeShiftConf);
        this.setParamObj(map, prefix + "SlateConf.", this.SlateConf);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);

    }
}

