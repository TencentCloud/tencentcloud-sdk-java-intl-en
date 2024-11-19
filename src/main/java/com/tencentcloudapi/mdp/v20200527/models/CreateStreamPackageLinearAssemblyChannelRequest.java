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

public class CreateStreamPackageLinearAssemblyChannelRequest extends AbstractModel {

    /**
    * Channel name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Define the characteristics of the channel. Standard supports live broadcast and on-demand sources. Basic only supports on-demand source arrangement. Optional values: Standard and Basic.
    */
    @SerializedName("Tier")
    @Expose
    private String Tier;

    /**
    * The source switching modes in the channel are divided into Linear and Loop. Basic only supports Linear, and Standatd supports both.
Optional values: Linear, Standatd.
    */
    @SerializedName("PlaybackMode")
    @Expose
    private String PlaybackMode;

    /**
    * Time shift enable switch, only valid when Tier is Standard.
    */
    @SerializedName("TimeShiftEnable")
    @Expose
    private Boolean TimeShiftEnable;

    /**
    * Time shift configuration, effective when the time shift switch is turned on.
    */
    @SerializedName("TimeShiftConf")
    @Expose
    private TimeShiftInfo TimeShiftConf;

    /**
    * Spacer configuration is only valid when PlaybackMode is Linear.
    */
    @SerializedName("SlateConf")
    @Expose
    private SlateInfo SlateConf;

    /**
    * Output configuration.
    */
    @SerializedName("Outputs")
    @Expose
    private OutputReq [] Outputs;

    /**
     * Get Channel name. 
     * @return Name Channel name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Channel name.
     * @param Name Channel name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Define the characteristics of the channel. Standard supports live broadcast and on-demand sources. Basic only supports on-demand source arrangement. Optional values: Standard and Basic. 
     * @return Tier Define the characteristics of the channel. Standard supports live broadcast and on-demand sources. Basic only supports on-demand source arrangement. Optional values: Standard and Basic.
     */
    public String getTier() {
        return this.Tier;
    }

    /**
     * Set Define the characteristics of the channel. Standard supports live broadcast and on-demand sources. Basic only supports on-demand source arrangement. Optional values: Standard and Basic.
     * @param Tier Define the characteristics of the channel. Standard supports live broadcast and on-demand sources. Basic only supports on-demand source arrangement. Optional values: Standard and Basic.
     */
    public void setTier(String Tier) {
        this.Tier = Tier;
    }

    /**
     * Get The source switching modes in the channel are divided into Linear and Loop. Basic only supports Linear, and Standatd supports both.
Optional values: Linear, Standatd. 
     * @return PlaybackMode The source switching modes in the channel are divided into Linear and Loop. Basic only supports Linear, and Standatd supports both.
Optional values: Linear, Standatd.
     */
    public String getPlaybackMode() {
        return this.PlaybackMode;
    }

    /**
     * Set The source switching modes in the channel are divided into Linear and Loop. Basic only supports Linear, and Standatd supports both.
Optional values: Linear, Standatd.
     * @param PlaybackMode The source switching modes in the channel are divided into Linear and Loop. Basic only supports Linear, and Standatd supports both.
Optional values: Linear, Standatd.
     */
    public void setPlaybackMode(String PlaybackMode) {
        this.PlaybackMode = PlaybackMode;
    }

    /**
     * Get Time shift enable switch, only valid when Tier is Standard. 
     * @return TimeShiftEnable Time shift enable switch, only valid when Tier is Standard.
     */
    public Boolean getTimeShiftEnable() {
        return this.TimeShiftEnable;
    }

    /**
     * Set Time shift enable switch, only valid when Tier is Standard.
     * @param TimeShiftEnable Time shift enable switch, only valid when Tier is Standard.
     */
    public void setTimeShiftEnable(Boolean TimeShiftEnable) {
        this.TimeShiftEnable = TimeShiftEnable;
    }

    /**
     * Get Time shift configuration, effective when the time shift switch is turned on. 
     * @return TimeShiftConf Time shift configuration, effective when the time shift switch is turned on.
     */
    public TimeShiftInfo getTimeShiftConf() {
        return this.TimeShiftConf;
    }

    /**
     * Set Time shift configuration, effective when the time shift switch is turned on.
     * @param TimeShiftConf Time shift configuration, effective when the time shift switch is turned on.
     */
    public void setTimeShiftConf(TimeShiftInfo TimeShiftConf) {
        this.TimeShiftConf = TimeShiftConf;
    }

    /**
     * Get Spacer configuration is only valid when PlaybackMode is Linear. 
     * @return SlateConf Spacer configuration is only valid when PlaybackMode is Linear.
     */
    public SlateInfo getSlateConf() {
        return this.SlateConf;
    }

    /**
     * Set Spacer configuration is only valid when PlaybackMode is Linear.
     * @param SlateConf Spacer configuration is only valid when PlaybackMode is Linear.
     */
    public void setSlateConf(SlateInfo SlateConf) {
        this.SlateConf = SlateConf;
    }

    /**
     * Get Output configuration. 
     * @return Outputs Output configuration.
     */
    public OutputReq [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set Output configuration.
     * @param Outputs Output configuration.
     */
    public void setOutputs(OutputReq [] Outputs) {
        this.Outputs = Outputs;
    }

    public CreateStreamPackageLinearAssemblyChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageLinearAssemblyChannelRequest(CreateStreamPackageLinearAssemblyChannelRequest source) {
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
            this.Outputs = new OutputReq[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new OutputReq(source.Outputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Tier", this.Tier);
        this.setParamSimple(map, prefix + "PlaybackMode", this.PlaybackMode);
        this.setParamSimple(map, prefix + "TimeShiftEnable", this.TimeShiftEnable);
        this.setParamObj(map, prefix + "TimeShiftConf.", this.TimeShiftConf);
        this.setParamObj(map, prefix + "SlateConf.", this.SlateConf);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);

    }
}

