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

public class HarvestJobResp extends AbstractModel {

    /**
    * HarvestJob ID, a globally unique identifier.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * The associated channel name.
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * The associated endpoint name.
    */
    @SerializedName("EndpointName")
    @Expose
    private String EndpointName;

    /**
    * Time format, supports the following types: 1. Epoch seconds 2. ISO-8601
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
    * HarvestJob start time.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * HarvestJob end time.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The path where the recording file is stored in COS.
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * The file name of the recording file stored in COS.
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

    /**
    * The task status is divided into running: Running, execution completed: Completed, and execution failure: Failed.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * HarvestJob error message.
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * HarvestJob creation time, timestamp in seconds.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * The associated ChannelID.
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * The region corresponding to the harvest job.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Callback URL after recording is completed
    */
    @SerializedName("CallbackURL")
    @Expose
    private String CallbackURL;

    /**
     * Get HarvestJob ID, a globally unique identifier. 
     * @return ID HarvestJob ID, a globally unique identifier.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set HarvestJob ID, a globally unique identifier.
     * @param ID HarvestJob ID, a globally unique identifier.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get The associated channel name. 
     * @return ChannelName The associated channel name.
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set The associated channel name.
     * @param ChannelName The associated channel name.
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get The associated endpoint name. 
     * @return EndpointName The associated endpoint name.
     */
    public String getEndpointName() {
        return this.EndpointName;
    }

    /**
     * Set The associated endpoint name.
     * @param EndpointName The associated endpoint name.
     */
    public void setEndpointName(String EndpointName) {
        this.EndpointName = EndpointName;
    }

    /**
     * Get Time format, supports the following types: 1. Epoch seconds 2. ISO-8601 
     * @return TimeFormat Time format, supports the following types: 1. Epoch seconds 2. ISO-8601
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Time format, supports the following types: 1. Epoch seconds 2. ISO-8601
     * @param TimeFormat Time format, supports the following types: 1. Epoch seconds 2. ISO-8601
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    /**
     * Get HarvestJob start time. 
     * @return StartTime HarvestJob start time.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set HarvestJob start time.
     * @param StartTime HarvestJob start time.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get HarvestJob end time. 
     * @return EndTime HarvestJob end time.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set HarvestJob end time.
     * @param EndTime HarvestJob end time.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The path where the recording file is stored in COS. 
     * @return Destination The path where the recording file is stored in COS.
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set The path where the recording file is stored in COS.
     * @param Destination The path where the recording file is stored in COS.
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get The file name of the recording file stored in COS. 
     * @return Manifest The file name of the recording file stored in COS.
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set The file name of the recording file stored in COS.
     * @param Manifest The file name of the recording file stored in COS.
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    /**
     * Get The task status is divided into running: Running, execution completed: Completed, and execution failure: Failed. 
     * @return Status The task status is divided into running: Running, execution completed: Completed, and execution failure: Failed.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task status is divided into running: Running, execution completed: Completed, and execution failure: Failed.
     * @param Status The task status is divided into running: Running, execution completed: Completed, and execution failure: Failed.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get HarvestJob error message. 
     * @return ErrMessage HarvestJob error message.
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set HarvestJob error message.
     * @param ErrMessage HarvestJob error message.
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get HarvestJob creation time, timestamp in seconds. 
     * @return CreateTime HarvestJob creation time, timestamp in seconds.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set HarvestJob creation time, timestamp in seconds.
     * @param CreateTime HarvestJob creation time, timestamp in seconds.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The associated ChannelID. 
     * @return ChannelId The associated ChannelID.
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set The associated ChannelID.
     * @param ChannelId The associated ChannelID.
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get The region corresponding to the harvest job. 
     * @return Region The region corresponding to the harvest job.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The region corresponding to the harvest job.
     * @param Region The region corresponding to the harvest job.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Callback URL after recording is completed 
     * @return CallbackURL Callback URL after recording is completed
     */
    public String getCallbackURL() {
        return this.CallbackURL;
    }

    /**
     * Set Callback URL after recording is completed
     * @param CallbackURL Callback URL after recording is completed
     */
    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    public HarvestJobResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HarvestJobResp(HarvestJobResp source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.EndpointName != null) {
            this.EndpointName = new String(source.EndpointName);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
        if (source.Manifest != null) {
            this.Manifest = new String(source.Manifest);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CallbackURL != null) {
            this.CallbackURL = new String(source.CallbackURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "EndpointName", this.EndpointName);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "Manifest", this.Manifest);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CallbackURL", this.CallbackURL);

    }
}

