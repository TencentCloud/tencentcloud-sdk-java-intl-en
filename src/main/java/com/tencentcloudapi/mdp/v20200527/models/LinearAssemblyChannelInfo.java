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

public class LinearAssemblyChannelInfo extends AbstractModel {

    /**
    * Linear assembly channel name.
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
    */
    @SerializedName("PlaybackMode")
    @Expose
    private String PlaybackMode;

    /**
    * Time shift configuration, vod is valid.
    */
    @SerializedName("TimeShiftConf")
    @Expose
    private TimeShiftInfo TimeShiftConf;

    /**
    * Spacer configuration.
    */
    @SerializedName("SlateConf")
    @Expose
    private SlateInfo SlateConf;

    /**
    * output information.
    */
    @SerializedName("Outputs")
    @Expose
    private OutputInfo [] Outputs;

    /**
    * List of programs bound to this channel.
    */
    @SerializedName("AttachedPrograms")
    @Expose
    private String [] AttachedPrograms;

    /**
    * program information.
    */
    @SerializedName("ProgramSchedules")
    @Expose
    private ProgramScheduleInfo [] ProgramSchedules;

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
    * State.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Time shift on switch.
    */
    @SerializedName("TimeShiftEnable")
    @Expose
    private Boolean TimeShiftEnable;

    /**
    * Channel creation time, unix seconds timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get Linear assembly channel name. 
     * @return Name Linear assembly channel name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Linear assembly channel name.
     * @param Name Linear assembly channel name.
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
     * @return PlaybackMode The source switching mode in the channel is divided into Linear and Loop. Live broadcast only supports Linear.
     */
    public String getPlaybackMode() {
        return this.PlaybackMode;
    }

    /**
     * Set The source switching mode in the channel is divided into Linear and Loop. Live broadcast only supports Linear.
     * @param PlaybackMode The source switching mode in the channel is divided into Linear and Loop. Live broadcast only supports Linear.
     */
    public void setPlaybackMode(String PlaybackMode) {
        this.PlaybackMode = PlaybackMode;
    }

    /**
     * Get Time shift configuration, vod is valid. 
     * @return TimeShiftConf Time shift configuration, vod is valid.
     */
    public TimeShiftInfo getTimeShiftConf() {
        return this.TimeShiftConf;
    }

    /**
     * Set Time shift configuration, vod is valid.
     * @param TimeShiftConf Time shift configuration, vod is valid.
     */
    public void setTimeShiftConf(TimeShiftInfo TimeShiftConf) {
        this.TimeShiftConf = TimeShiftConf;
    }

    /**
     * Get Spacer configuration. 
     * @return SlateConf Spacer configuration.
     */
    public SlateInfo getSlateConf() {
        return this.SlateConf;
    }

    /**
     * Set Spacer configuration.
     * @param SlateConf Spacer configuration.
     */
    public void setSlateConf(SlateInfo SlateConf) {
        this.SlateConf = SlateConf;
    }

    /**
     * Get output information. 
     * @return Outputs output information.
     */
    public OutputInfo [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set output information.
     * @param Outputs output information.
     */
    public void setOutputs(OutputInfo [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get List of programs bound to this channel. 
     * @return AttachedPrograms List of programs bound to this channel.
     */
    public String [] getAttachedPrograms() {
        return this.AttachedPrograms;
    }

    /**
     * Set List of programs bound to this channel.
     * @param AttachedPrograms List of programs bound to this channel.
     */
    public void setAttachedPrograms(String [] AttachedPrograms) {
        this.AttachedPrograms = AttachedPrograms;
    }

    /**
     * Get program information. 
     * @return ProgramSchedules program information.
     */
    public ProgramScheduleInfo [] getProgramSchedules() {
        return this.ProgramSchedules;
    }

    /**
     * Set program information.
     * @param ProgramSchedules program information.
     */
    public void setProgramSchedules(ProgramScheduleInfo [] ProgramSchedules) {
        this.ProgramSchedules = ProgramSchedules;
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
     * Get State. 
     * @return State State.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set State.
     * @param State State.
     */
    public void setState(String State) {
        this.State = State;
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
     * Get Channel creation time, unix seconds timestamp. 
     * @return CreateTime Channel creation time, unix seconds timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Channel creation time, unix seconds timestamp.
     * @param CreateTime Channel creation time, unix seconds timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LinearAssemblyChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LinearAssemblyChannelInfo(LinearAssemblyChannelInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tier != null) {
            this.Tier = new String(source.Tier);
        }
        if (source.PlaybackMode != null) {
            this.PlaybackMode = new String(source.PlaybackMode);
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
        if (source.AttachedPrograms != null) {
            this.AttachedPrograms = new String[source.AttachedPrograms.length];
            for (int i = 0; i < source.AttachedPrograms.length; i++) {
                this.AttachedPrograms[i] = new String(source.AttachedPrograms[i]);
            }
        }
        if (source.ProgramSchedules != null) {
            this.ProgramSchedules = new ProgramScheduleInfo[source.ProgramSchedules.length];
            for (int i = 0; i < source.ProgramSchedules.length; i++) {
                this.ProgramSchedules[i] = new ProgramScheduleInfo(source.ProgramSchedules[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.TimeShiftEnable != null) {
            this.TimeShiftEnable = new Boolean(source.TimeShiftEnable);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Tier", this.Tier);
        this.setParamSimple(map, prefix + "PlaybackMode", this.PlaybackMode);
        this.setParamObj(map, prefix + "TimeShiftConf.", this.TimeShiftConf);
        this.setParamObj(map, prefix + "SlateConf.", this.SlateConf);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamArraySimple(map, prefix + "AttachedPrograms.", this.AttachedPrograms);
        this.setParamArrayObj(map, prefix + "ProgramSchedules.", this.ProgramSchedules);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "TimeShiftEnable", this.TimeShiftEnable);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

