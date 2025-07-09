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

public class CreateStreamPackageHarvestJobRequest extends AbstractModel {

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
    * Task start time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Task end time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The path where the recording file is stored in Cos.
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * The file name of the recording file stored in Cos.
    */
    @SerializedName("Manifest")
    @Expose
    private String Manifest;

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
     * Get Task start time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00. 
     * @return StartTime Task start time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Task start time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00.
     * @param StartTime Task start time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Task end time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00. 
     * @return EndTime Task end time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Task end time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00.
     * @param EndTime Task end time supports two formats for TimeFormat input: 1. Epoch seconds: The input box is a numeric input box, and only positive integers can be entered. 2. ISO-8601: The supported format is ISO time, for example: 2023-08-01T10:00:00+08:00.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The path where the recording file is stored in Cos. 
     * @return Destination The path where the recording file is stored in Cos.
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set The path where the recording file is stored in Cos.
     * @param Destination The path where the recording file is stored in Cos.
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get The file name of the recording file stored in Cos. 
     * @return Manifest The file name of the recording file stored in Cos.
     */
    public String getManifest() {
        return this.Manifest;
    }

    /**
     * Set The file name of the recording file stored in Cos.
     * @param Manifest The file name of the recording file stored in Cos.
     */
    public void setManifest(String Manifest) {
        this.Manifest = Manifest;
    }

    public CreateStreamPackageHarvestJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStreamPackageHarvestJobRequest(CreateStreamPackageHarvestJobRequest source) {
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

    }
}

